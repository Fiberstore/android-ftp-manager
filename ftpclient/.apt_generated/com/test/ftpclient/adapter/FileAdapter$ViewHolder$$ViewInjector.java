// Generated code from Butter Knife. Do not modify!
package com.test.ftpclient.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class FileAdapter$ViewHolder$$ViewInjector<T extends com.test.ftpclient.adapter.FileAdapter.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131099823, "field 'tvSize'");
    target.tvSize = finder.castView(view, 2131099823, "field 'tvSize'");
    view = finder.findRequiredView(source, 2131099824, "field 'tvDate'");
    target.tvDate = finder.castView(view, 2131099824, "field 'tvDate'");
    view = finder.findRequiredView(source, 2131099821, "field 'tvName'");
    target.tvName = finder.castView(view, 2131099821, "field 'tvName'");
    view = finder.findRequiredView(source, 2131099822, "field 'tvType'");
    target.tvType = finder.castView(view, 2131099822, "field 'tvType'");
  }

  @Override public void reset(T target) {
    target.tvSize = null;
    target.tvDate = null;
    target.tvName = null;
    target.tvType = null;
  }
}
