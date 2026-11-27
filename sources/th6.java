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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class th6 extends e {
    public t20 a;
    public d79 b;
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
                if (!yac.h(i3).o()) {
                    i2++;
                    if (num == null) {
                        num = Integer.valueOf(i3);
                    }
                }
            }
            if (!yac.n()) {
                i2--;
            }
            if (i2 > 0 && num != null) {
                presentFragment(new qh6(num.intValue()));
                return;
            } else {
                if (yac.n()) {
                    return;
                }
                showDialog(new l46(7, this.currentAccount, null, getParentActivity(), this));
                return;
            }
        }
        if (i == this.d) {
            presentFragment(PasscodeActivity.m0());
            return;
        }
        if (i == this.e) {
            presentFragment(new z61());
            return;
        }
        if (i == this.f) {
            presentFragment(new v8(3));
            return;
        }
        if (i == this.h) {
            showDialog(jj.R(this, null));
            return;
        }
        if (i != this.r || getParentActivity() == null) {
            return;
        }
        id idVar = new id(3, null, getParentActivity());
        idVar.q(500L);
        int i4 = this.currentAccount;
        z56 z56Var = new z56(this, idVar, (byte) 25);
        c[] cVarArr = c.T;
        if (uc7.s1(i4).k4.v0.f) {
            hl.c3(new hl3(i4, z56Var, (byte) 11));
        } else {
            z56Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(id idVar) {
        long j;
        idVar.dismiss();
        if (uc7.s1(this.currentAccount).k4.v0.f) {
            c C = c.C(this.currentAccount);
            if (C.z() > 0) {
                TL_wallet.WalletState walletState = C.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !C.f()) {
                    j = C.z();
                    for (b35 b35Var : C.K) {
                        if (!b35Var.e && !b35Var.d) {
                            long j2 = b35Var.c;
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
        alertDialog$Builder.a.S = ob6.M0(2131748497, null);
        alertDialog$Builder.a.U = hl.S2(j > 0 ? ob6.a0(null, null, 2131754074, c.w(j, false)) : ob6.M0(2131754075, null));
        alertDialog$Builder.j(ob6.M0(2131748497, null), new sh6(this));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public final /* synthetic */ void a0() {
        uc7.s1(this.currentAccount).J3(1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131748495, null));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 7));
        this.a = new t20(this, context, (byte) 7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new sh6(this));
        this.b.s1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        lq3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (yac.c() < 4) {
            int i = this.w;
            this.w = i + 1;
            this.c = i;
        } else {
            this.c = -1;
        }
        if (xea.r.length() <= 0) {
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
