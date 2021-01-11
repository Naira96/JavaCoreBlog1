package homework.blog.blogInterface;

import homework.blog.excaption.PostNotFoundException;
import homework.blog.model.Post;

public interface PostStorage {
    void add(Post post);

    Post getPostByTitle(String title) throws PostNotFoundException;

    void searchPostsByKeyword(String keyword);

    void printAllPosts();

    Post getPostsByCategory(String category) throws PostNotFoundException;
}
