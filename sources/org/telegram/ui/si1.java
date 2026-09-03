package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class si1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            if (!kVar.s()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            kVar2 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            kVar2.r();
            wallpapersListActivity.D0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                py pyVar = new py(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
                pyVar.z2 = new qi1(this);
                wallpapersListActivity.presentFragment(pyVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
        alertDialog$Builder.a.Q = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qi1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        wallpapersListActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        }
    }
}
