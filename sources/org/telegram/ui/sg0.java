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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class sg0 extends org.telegram.ui.ActionBar.m2 {
    public rg0 a;
    public org.telegram.ui.Components.wl0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;

    public static void U(sg0 sg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == sg0Var.c) {
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
                sg0Var.presentFragment(new qg0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                sg0Var.showDialog(new rg.j0(7, sg0Var.currentAccount, sg0Var.getParentActivity(), sg0Var, null));
                return;
            }
        }
        if (i10 == sg0Var.d) {
            sg0Var.presentFragment(PasscodeActivity.b0());
            return;
        }
        if (i10 == sg0Var.e) {
            sg0Var.presentFragment(new z6());
            return;
        }
        if (i10 == sg0Var.f) {
            sg0Var.presentFragment(new h(3));
            return;
        }
        if (i10 == sg0Var.h) {
            sg0Var.showDialog(org.telegram.ui.Components.e5.U(sg0Var, null));
            return;
        }
        if (i10 != sg0Var.r || sg0Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = sg0Var.getParentActivity();
        int i13 = sg0Var.currentAccount;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureLogout);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LogOut);
        alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
        sg0Var.showDialog(a2Var);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 6));
        this.a = new rg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.b = wl0Var;
        wl0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.c0(1, false));
        frameLayout2.addView(this.b, w7.y5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new du(this, 21));
        this.b.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        int i10 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        rg0 rg0Var = this.a;
        if (rg0Var != null) {
            rg0Var.l();
        }
    }
}
