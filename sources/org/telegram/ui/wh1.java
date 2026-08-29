package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wh1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ WallpapersListActivity a;

    public wh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (!lVar.s()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            lVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            lVar2.r();
            wallpapersListActivity.D0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                fy fyVar = new fy(org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true));
                fyVar.y2 = new vh1(this);
                wallpapersListActivity.presentFragment(fyVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
        alertDialog$Builder.a.P = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vh1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        wallpapersListActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }
}
