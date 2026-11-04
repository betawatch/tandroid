package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zd0 extends org.telegram.ui.ActionBar.d2 {
    public n4 a;
    public org.telegram.ui.Components.tj0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(zd0 zd0Var, org.telegram.ui.ActionBar.s1 s1Var) {
        long j10;
        s1Var.dismiss();
        if (((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(zd0Var.currentAccount).x7.j0.b).c) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(zd0Var.currentAccount);
            if (x10.v() > 0) {
                TL_wallet.WalletState walletState = x10.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !x10.f()) {
                    j10 = x10.v();
                    for (org.telegram.ui.Wallet.g0 g0Var : x10.H) {
                        if (!g0Var.e && !g0Var.d) {
                            long j11 = g0Var.c;
                            if (j11 > 0) {
                                j10 += j11;
                            }
                        }
                    }
                }
            }
            j10 = 0;
            while (r10.hasNext()) {
            }
        } else {
            j10 = 0;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zd0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131748751, null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
        s1Var2.S = M0;
        s1Var2.U = org.telegram.messenger.g0.X2(j10 > 0 ? org.telegram.messenger.bd.a0(null, null, 2131754081, org.telegram.ui.Wallet.k0.s(j10, false)) : org.telegram.messenger.bd.M0(2131754082, null));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748751, null), new yd0(zd0Var));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void b0(zd0 zd0Var, int i3) {
        Integer num = null;
        if (i3 == zd0Var.c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.h10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.h10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                zd0Var.presentFragment(new xd0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.h10.o()) {
                    return;
                }
                zd0Var.showDialog(new vg.i0(7, zd0Var.currentAccount, zd0Var.getParentActivity(), zd0Var, null));
                return;
            }
        }
        if (i3 == zd0Var.d) {
            zd0Var.presentFragment(PasscodeActivity.p0());
            return;
        }
        if (i3 == zd0Var.e) {
            zd0Var.presentFragment(new z6());
            return;
        }
        if (i3 == zd0Var.f) {
            zd0Var.presentFragment(new g(3));
            return;
        }
        if (i3 == zd0Var.h) {
            zd0Var.showDialog(org.telegram.ui.Components.t4.T(zd0Var, null));
            return;
        }
        if (i3 != zd0Var.r || zd0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, zd0Var.getParentActivity(), null);
        s1Var.r(500L);
        int i12 = zd0Var.currentAccount;
        tb0 tb0Var = new tb0(11, zd0Var, s1Var);
        org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
        if (((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i12).x7.j0.b).c) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(i12, tb0Var, 29));
        } else {
            tb0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748749, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 15));
        this.a = new n4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.b, b8.mf.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new yd0(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (org.telegram.messenger.h10.c() < 4) {
            int i3 = this.w;
            this.w = i3 + 1;
            this.c = i3;
        } else {
            this.c = -1;
        }
        if (org.telegram.messenger.az.s.length() <= 0) {
            int i10 = this.w;
            this.w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.w;
        this.e = i11;
        this.f = i11 + 1;
        this.h = i11 + 2;
        this.n = i11 + 3;
        this.r = i11 + 4;
        this.w = i11 + 6;
        this.s = i11 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.a;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
