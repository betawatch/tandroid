package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xh1 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ WallpapersListActivity f;

    public xh1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        ci1 ci1Var = wallpapersListActivity.F;
        ci1Var.n = null;
        ci1Var.E(null, true);
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
