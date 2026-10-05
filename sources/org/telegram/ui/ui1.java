package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ui1 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ WallpapersListActivity f;

    public ui1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        zi1 zi1Var = wallpapersListActivity.H;
        zi1Var.n = null;
        zi1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        this.f.H.E(editText.getText().toString(), false);
    }
}
