package com.design.pattern.composite;

public class File implements FileSystem {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getByteSize() {
        return size;
    }

    @Override
    public void printTree() {
        System.out.println("File: " + getName() + " (Size: " + getByteSize() + " KB)");
    }

    @Override
    public void addFile(FileSystem element) {
        throw new UnsupportedOperationException("You can't files to a file!");
    }

    @Override
    public void removeFile(FileSystem element) {
        throw new UnsupportedOperationException("You can't remove files from a file!");
    }
}


