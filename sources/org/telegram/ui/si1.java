package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class si1 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ WallpapersListActivity f;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        xi1 xi1Var = wallpapersListActivity.G;
        xi1Var.n = null;
        xi1Var.E(null, true);
        wallpapersListActivity.I.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.E.invalidate();
        wallpapersListActivity.G.E(null, true);
        wallpapersListActivity.I.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.E.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        this.f.G.E(editText.getText().toString(), false);
    }
}
