package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zh1 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ WallpapersListActivity a;

    public zh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void f() {
        WallpapersListActivity wallpapersListActivity = this.a;
        ei1 ei1Var = wallpapersListActivity.H;
        ei1Var.n = null;
        ei1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        WallpapersListActivity wallpapersListActivity = this.a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        f();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        WallpapersListActivity wallpapersListActivity = this.a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        this.a.H.E(editText.getText().toString(), false);
    }
}
