package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qg0 extends org.telegram.ui.ActionBar.p2 {
    public pg0 a;
    public org.telegram.ui.Components.sl0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;

    public static void U(qg0 qg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == qg0Var.c) {
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!UserConfig.getInstance(i12).isClientActivated()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                qg0Var.presentFragment(new og0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                qg0Var.showDialog(new fg.v0(7, qg0Var.currentAccount, qg0Var.getParentActivity(), qg0Var, null));
                return;
            }
        }
        if (i10 == qg0Var.d) {
            qg0Var.presentFragment(PasscodeActivity.b0());
            return;
        }
        if (i10 == qg0Var.e) {
            qg0Var.presentFragment(new b7());
            return;
        }
        if (i10 == qg0Var.f) {
            qg0Var.presentFragment(new i(3));
            return;
        }
        if (i10 == qg0Var.h) {
            qg0Var.showDialog(org.telegram.ui.Components.z4.U(qg0Var, null));
            return;
        }
        if (i10 != qg0Var.r || qg0Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = qg0Var.getParentActivity();
        int i13 = qg0Var.currentAccount;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.AreYouSureLogout);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.LogOut);
        alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new d4.b(i13, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        }
        qg0Var.showDialog(d2Var);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 23));
        this.a = new pg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.b = sl0Var;
        sl0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.j0(1, false));
        frameLayout2.addView(this.b, k7.c6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new gu(this, 21));
        this.b.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        int i10 = org.telegram.ui.ActionBar.k6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.v = 1;
        if (UserConfig.getActivatedAccountsCount() < 4) {
            int i10 = this.v;
            this.v = i10 + 1;
            this.c = i10;
        } else {
            this.c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.e = i12;
        this.f = i12 + 1;
        this.h = i12 + 2;
        this.n = i12 + 3;
        this.r = i12 + 4;
        this.v = i12 + 6;
        this.s = i12 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        pg0 pg0Var = this.a;
        if (pg0Var != null) {
            pg0Var.l();
        }
    }
}
