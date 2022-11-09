package io.github.handharbeni.boilerplate_module.models;

import androidx.fragment.app.Fragment;

/**
 * Created by Munish on 16/3/17.
 */

public class FragmentItem {

    private String title;
    private int idMenuItem;
    private Fragment fragment;

    public FragmentItem(Fragment fragment, String title, int idMenuItem) {

        this.fragment = fragment;
        this.title = title;
        this.idMenuItem = idMenuItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public int getIdMenuItem() {
        return idMenuItem;
    }

    public void setIdMenuItem(int idMenuItem) {
        this.idMenuItem = idMenuItem;
    }
}
