package homework.blog.storage;

import homework.blog.blogInterface.PostStorage;
import homework.blog.excaption.PostNotFoundException;
import homework.blog.model.Post;

public class PostStorageImpl implements PostStorage {

    private Post[] posts = new Post[10];
    private int size;

    @Override
    public void add(Post post) {
        if (size == posts.length) {
            extend();
        }
        posts[size++] = post;
    }

    private void extend() {
        Post[] tmp = new Post[size * 2];
        System.arraycopy(posts, 0, tmp, 0, posts.length);
        posts = tmp;
    }

    @Override
    public Post getPostByTitle(String title) throws PostNotFoundException {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                return posts[i];
            }
        }
        throw new PostNotFoundException(title + " not exist");
    }

    @Override
    public void searchPostsByKeyword(String keyword)  {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(keyword) || posts[i].getText().contains(keyword)) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void printAllPosts() {
        for (Post x : posts) {
            System.out.println(x);
        }
    }

    public Post getByCategory(String category) throws PostNotFoundException {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().equals(category)) {
                return posts[i];
            }
        }
        throw new PostNotFoundException(category + " category does not exist");
    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().contains(category)) {
                System.out.println(posts[i]);
            }

        }
    }

    public void printCategoryList() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i].getCategory());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
