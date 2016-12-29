package com.company.java8.java.java8.mains;

import com.sun.deploy.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by imcts on 2016. 12. 28..
 */



@Getter
@Setter
@Accessors(chain = true)
@ToString
class TreeNode<T> {
    private T node;
    private Collection<TreeNode<T>> children;

    public TreeNode() {
        this.children = new ArrayList<>();
    }

    public static void addChild(TreeNode<CatFamily> treeNode, CatFamily catFamily) {
        if(treeNode.getNode().getId() == catFamily.getPid())
            treeNode.children.add(new TreeNode<CatFamily>().setNode(catFamily));
        else
            for(TreeNode<CatFamily> tree : treeNode.getChildren())
                TreeNode.addChild(tree, catFamily);
    }

    public static boolean findTarget(TreeNode<CatFamily> treeNode, Stack<String> stack, String target) {
        String text = treeNode.getNode().getText();
        boolean isFind = false;

        if(text.equals(target)) {
            isFind = true;
            stack.push(text);
        } else {
            for(TreeNode<CatFamily> tree : treeNode.getChildren()) {
                isFind = TreeNode.findTarget(tree, stack, target);

                if(isFind)
                    stack.push(text);

            }
        }

        return isFind;
    }

    public static TreeNode<CatFamily> findNode(TreeNode<CatFamily> treeNode, String target) {
        String text = treeNode.getNode().getText();
        TreeNode<CatFamily> result = null;

        if(text.equals(target)) {
            return treeNode;
        } else {
            for(TreeNode<CatFamily> tree : treeNode.getChildren())
                result = TreeNode.findNode(tree, target);
        }

        return result;
    }

    public static Stack<String> getAllNode(TreeNode<CatFamily> treeNode, Stack<String> stack) {

        stack.push(treeNode.getNode().getText());

        treeNode.getChildren().forEach(tree -> treeNode.getAllNode(tree, stack));

        return stack;
    }

    public static Stack<String> getLastNode(TreeNode<CatFamily> treeNode, Stack<String> stack) {

        if(treeNode.getChildren().isEmpty())
            stack.push(treeNode.getNode().getText());

        treeNode.getChildren().forEach(tree -> treeNode.getLastNode(tree, stack));

        return stack;
    }
}


@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
class CatFamily {
    private final int id;
    private final int pid;
    private final String text;

    public static TreeNode<CatFamily> createData() {
        TreeNode<CatFamily> tree = new TreeNode<>();

        Arrays.asList(
            new CatFamily(1, 0, "고양이과"),
            new CatFamily(2, 1, "표범아과"),
            new CatFamily(3, 1, "고양이아과"),
            new CatFamily(4, 2, "표범속"),
            new CatFamily(5, 3, "호랑고양이속"),
            new CatFamily(6, 3, "고양이속"),
            new CatFamily(7, 3, "치타속"),
            new CatFamily(8, 4, "호랑이"),
            new CatFamily(9, 4, "표범"),
            new CatFamily(10, 4, "사자"),
            new CatFamily(11, 5, "호랑고양이"),
            new CatFamily(12, 6, "모래고양이"),
            new CatFamily(13, 6, "들고양이"),
            new CatFamily(14, 7, "치타")
        )
        .forEach(catFamily -> {
            if(catFamily.getId() == 1)
                tree.setNode(catFamily);
            else
                tree.addChild(tree, catFamily);
        });

        return tree;
    }

    public static void questionOne(TreeNode<CatFamily> treeNode, String target) {
        Stack<String> stack = new Stack<>();
        TreeNode.findTarget(treeNode, stack, target);
        Collections.reverse(stack);

        System.out.println(StringUtils.join(stack, " / "));
    }

    public static void questionTwo(TreeNode<CatFamily> treeNode, String target) {
        Stack<String> stack = TreeNode.getAllNode(TreeNode.findNode(treeNode, target), new Stack<>());
        List<String> questionTwoList = stack.stream().collect(Collectors.toList());

        if(!questionTwoList.isEmpty())
            questionTwoList.remove(0);

        System.out.println(StringUtils.join(questionTwoList, ", "));;
    }

    public static void questionThree(TreeNode<CatFamily> treeNode) {
        System.out.println(StringUtils.join(TreeNode.getLastNode(treeNode, new Stack<>()), ", "));
    }
}

public class MalgnTest {

    public static void main(String[] args) {
        TreeNode<CatFamily> treeNode = CatFamily.createData();

        //question one
        CatFamily.questionOne(treeNode, "사자");

        //question two
        CatFamily.questionTwo(treeNode, "고양이아과");

        //question three
        CatFamily.questionThree(treeNode);
    }
}
