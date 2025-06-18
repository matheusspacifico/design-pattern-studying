package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private final String name;
    private final List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getByteSize() {
        return children.stream()
                .mapToInt(FileSystem::getByteSize)
                .sum();
    }

    @Override
    public void printTree() {
        printTree("");
    }

    private void printTree(String indent) {
        System.out.println(indent + "📁 " + getName() + "/");
        for (FileSystem child : children) {
            if (child instanceof Folder) {
                ((Folder) child).printTree(indent + "    ");
            } else {
                System.out.println(indent + "    📄 " + child.getName() + " (" + child.getByteSize() + " KB)");
            }
        }
    }

    @Override
    public void addFile(FileSystem element) {
        children.add(element);
    }

    @Override
    public void removeFile(FileSystem element) {
        children.remove(element);
    }
}
