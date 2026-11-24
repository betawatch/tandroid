// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pf6 extends d {
    public s20 a;
    public o39 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    public final void Y(int i) {
        Integer num = null;
        if (i == this.c) {
            int i2 = 0;
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!y6c.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!y6c.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new mf6(num.intValue()));
                return;
            } else {
                if (y6c.n()) {
                    return;
                }
                showDialog(new h26(7, this.currentAccount, null, getParentActivity(), this));
                return;
            }
        }
        if (i == this.d) {
            presentFragment(PasscodeActivity.m0());
            return;
        }
        if (i == this.e) {
            presentFragment(new r61());
            return;
        }
        if (i == this.f) {
            presentFragment(new u8(3));
            return;
        }
        if (i == this.h) {
            showDialog(ij.R(this, null));
            return;
        }
        if (i != this.r || getParentActivity() == null) {
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        hdVar.q(500L);
        int i4 = this.currentAccount;
        kz5 kz5Var = new kz5(this, hdVar, (byte) 28);
        c[] cVarArr = c.R;
        if (na7.q1(i4).k4.n0.f) {
            gl.c3(new sm3(i4, kz5Var, (byte) 9));
        } else {
            kz5Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(hd hdVar) {
        long j;
        hdVar.dismiss();
        if (na7.q1(this.currentAccount).k4.n0.f) {
            c C = c.C(this.currentAccount);
            if (C.z() > 0) {
                TL_wallet.WalletState walletState = C.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !C.f()) {
                    j = C.z();
                    for (x05 x05Var : C.K) {
                        if (!x05Var.e && !x05Var.d) {
                            long j2 = x05Var.c;
                            if (j2 > 0) {
                                j += j2;
                            }
                        }
                    }
                }
            }
            j = 0;
            while (r10.hasNext()) {
            }
        } else {
            j = 0;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.S = k96.M0(2131748551, null);
        alertDialog$Builder.a.U = gl.S2(j > 0 ? k96.a0(null, null, 2131754078, c.w(j, false)) : k96.M0(2131754079, null));
        alertDialog$Builder.j(k96.M0(2131748551, null), new of6(this));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final /* synthetic */ void a0() {
        na7.q1(this.currentAccount).C3(1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131748549, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 6));
        this.a = new s20(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new of6(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (y6c.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (gba.r.length() <= 0) {
            int i2 = this.w;
            this.w = i2 + 1;
            this.d = i2;
        } else {
            this.d = -1;
        }
        int i3 = this.w;
        this.e = i3;
        this.f = i3 + 1;
        this.h = i3 + 2;
        this.n = i3 + 3;
        this.r = i3 + 4;
        this.w = i3 + 6;
        this.s = i3 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
