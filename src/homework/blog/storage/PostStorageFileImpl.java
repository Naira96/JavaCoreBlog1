package homework.blog.storage;


import homework.blog.blogInterface.PostStorage;
import homework.blog.excaption.PostNotFoundException;
import homework.blog.model.Post;
import homework.blog.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class PostStorageFileImpl implements PostStorage {

    private List<Post> postList;

    public PostStorageFileImpl() {
        postList = FileUtil.deserializePostList();
        FileUtil.serializePostList(postList);
    }

    @Override
    public void add(Post post) {
        postList.add(post);
        FileUtil.serializePostList(postList);

    }


    @Override
    public Post getPostByTitle(String title) throws PostNotFoundException {
        for (Post post : postList) {
            if (post.getTitle().equals(title)) {
                return post;
            }
        }
        throw new PostNotFoundException(title + " not exist");
    }

    @Override
    public void searchPostsByKeyword(String keyword) {
        for (Post post : postList) {
            if (post.getTitle().contains(keyword) || post.getText().contains(keyword)) {
                System.out.println(post);
            }
        }
    }

    @Override
    public void printAllPosts() {
        System.out.println(postList);
    }


    @Override
    public Post getPostsByCategory(String category) {
        for (Post post : postList) {
            if (post.getCategory().equals(category)) {
                return post;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return postList.isEmpty();
    }
}
