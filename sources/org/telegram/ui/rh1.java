package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rh1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public rh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
            if (!kVar.s()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            kVar2 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
            kVar2.r();
            wallpapersListActivity.D0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                ey eyVar = new ey(org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new qh1(this);
                wallpapersListActivity.presentFragment(eyVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
        alertDialog$Builder.a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qh1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        wallpapersListActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }
}
