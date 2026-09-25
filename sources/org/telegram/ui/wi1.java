package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wi1 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ WallpapersListActivity f;

    public wi1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        bj1 bj1Var = wallpapersListActivity.J;
        bj1Var.n = null;
        bj1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        this.f.J.E(editText.getText().toString(), false);
    }
}
