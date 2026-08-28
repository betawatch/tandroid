package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vh1 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ WallpapersListActivity f;

    public vh1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        bi1 bi1Var = wallpapersListActivity.F;
        bi1Var.n = null;
        bi1Var.E(null, true);
        wallpapersListActivity.H.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.E);
        wallpapersListActivity.D.invalidate();
        wallpapersListActivity.F.E(null, true);
        wallpapersListActivity.H.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.D.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        this.f.F.E(editText.getText().toString(), false);
    }
}
