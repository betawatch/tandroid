package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xh1 extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ WallpapersListActivity r;

    public xh1(WallpapersListActivity wallpapersListActivity) {
        this.r = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.r;
        ci1 ci1Var = wallpapersListActivity.J;
        ci1Var.n = null;
        ci1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.r;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.r;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        this.r.J.E(editText.getText().toString(), false);
    }
}
