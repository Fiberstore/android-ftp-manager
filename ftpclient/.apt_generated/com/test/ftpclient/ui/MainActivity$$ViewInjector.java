// Generated code from Butter Knife. Do not modify!
package com.test.ftpclient.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.test.ftpclient.ui.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131099723, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131099723, "field 'tvTitle'");
    view = finder.findRequiredView(source, 2131099724, "field 'lvFileList'");
    target.lvFileList = finder.castView(view, 2131099724, "field 'lvFileList'");
  }

  @Override public void reset(T target) {
    target.tvTitle = null;
    target.lvFileList = null;
  }
}
