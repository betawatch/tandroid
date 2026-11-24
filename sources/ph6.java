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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ph6 extends d {
    public s30 a;
    public r59 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    public final void Z(int i) {
        Integer num = null;
        if (i == this.c) {
            int i2 = 0;
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!z8c.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!z8c.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new mh6(num.intValue()));
                return;
            } else {
                if (z8c.n()) {
                    return;
                }
                showDialog(new i46(7, this.currentAccount, null, getParentActivity(), this));
                return;
            }
        }
        if (i == this.d) {
            presentFragment(PasscodeActivity.n0());
            return;
        }
        if (i == this.e) {
            presentFragment(new y71());
            return;
        }
        if (i == this.f) {
            presentFragment(new u8(3));
            return;
        }
        if (i == this.h) {
            showDialog(ik.R(this, null));
            return;
        }
        if (i != this.r || getParentActivity() == null) {
            return;
        }
        he heVar = new he(3, null, getParentActivity());
        heVar.q(500L);
        int i4 = this.currentAccount;
        k16 k16Var = new k16(this, heVar, (byte) 29);
        c[] cVarArr = c.R;
        if (oc7.r1(i4).l4.n0.f) {
            gm.c3(new bm3(i4, k16Var, (byte) 11));
        } else {
            k16Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(he heVar) {
        long j;
        heVar.dismiss();
        if (oc7.r1(this.currentAccount).l4.n0.f) {
            c C = c.C(this.currentAccount);
            if (C.z() > 0) {
                TL_wallet.WalletState walletState = C.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !C.f()) {
                    j = C.z();
                    for (x25 x25Var : C.K) {
                        if (!x25Var.e && !x25Var.d) {
                            long j2 = x25Var.c;
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
        alertDialog$Builder.a.S = jb6.M0(2131748500, null);
        alertDialog$Builder.a.U = gm.S2(j > 0 ? jb6.a0(null, null, 2131754046, c.w(j, false)) : jb6.M0(2131754047, null));
        alertDialog$Builder.j(jb6.M0(2131748500, null), new oh6(this));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final /* synthetic */ void b0() {
        oc7.r1(this.currentAccount).E3(1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131748498, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 7));
        this.a = new s30(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new oh6(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
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
        er3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (z8c.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (gda.r.length() <= 0) {
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
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
