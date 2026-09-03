package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ti1 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ WallpapersListActivity f;

    public ti1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        yi1 yi1Var = wallpapersListActivity.G;
        yi1Var.n = null;
        yi1Var.E(null, true);
        wallpapersListActivity.I.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.E.invalidate();
        wallpapersListActivity.G.E(null, true);
        wallpapersListActivity.I.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.E.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        this.f.G.E(editText.getText().toString(), false);
    }
}
