package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vi1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public vi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
            if (!kVar.s()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            kVar2 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).actionBar;
            kVar2.r();
            wallpapersListActivity.D0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                qy qyVar = new qy(org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true));
                qyVar.C2 = new ti1(this);
                wallpapersListActivity.presentFragment(qyVar);
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ti1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        wallpapersListActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }
}
