package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ rc0(dd0 dd0Var, int i3) {
        this.a = i3;
        this.b = dd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq[] zqVarArr;
        int i3 = this.a;
        int i10 = 1;
        int i11 = 0;
        dd0 dd0Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fh0 fh0Var = dd0Var.H;
                xq xqVar = dd0Var.f;
                int i12 = dd0Var.i0;
                if (i12 != 3 && (zqVarArr = xqVar.f) != null) {
                    for (int length = zqVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || xqVar.f[length].length() != 0) {
                            xqVar.f[length].requestFocus();
                            zq zqVar = xqVar.f[length];
                            zqVar.setSelection(zqVar.length());
                            xd0.a1(dd0Var.v0, xqVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ch0 ch0Var = dd0Var.a;
                if (ch0Var != null) {
                    ch0Var.start();
                }
                if (i12 == 15) {
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 6));
                break;
            case 2:
                kb0 kb0Var = dd0Var.x;
                dd0Var.t0 = false;
                while (true) {
                    zq[] zqVarArr2 = dd0Var.f.f;
                    if (i11 < zqVarArr2.length) {
                        zqVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (kb0Var.getCurrentView() != (dd0Var.i0 == 15 ? dd0Var.G : dd0Var.E)) {
                        kb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.fh0 fh0Var2 = dd0Var.s;
                fh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ch0 ch0Var2 = dd0Var.R;
                ch0Var2.N(0, false, false);
                ch0Var2.K(1);
                fh0Var2.setAnimation(ch0Var2);
                fh0Var2.d();
                break;
            case 5:
                try {
                    dd0Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dd0Var.getContext());
                String M0 = org.telegram.messenger.bd.M0(2131742808, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), dd0Var.d, mf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                s1Var.setOnDismissListener(new zc0(dd0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.ch0 ch0Var3 = dd0Var.S;
                ch0Var3.u0 = new rc0(dd0Var, 8);
                org.telegram.ui.Components.fh0 fh0Var3 = dd0Var.s;
                fh0Var3.setAutoRepeat(false);
                ch0Var3.N(0, false, false);
                fh0Var3.setAnimation(ch0Var3);
                fh0Var3.d();
                break;
            case 7:
                dd0Var.postDelayed(new rc0(dd0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.h3(new rc0(dd0Var, 10));
                break;
            case 9:
                xq xqVar2 = dd0Var.f;
                xqVar2.e = false;
                xqVar2.f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr3 = xqVar2.f;
                    if (i11 >= zqVarArr3.length) {
                        break;
                    } else {
                        zqVarArr3[i11].z(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.fh0 fh0Var4 = dd0Var.s;
                fh0Var4.setAutoRepeat(false);
                fh0Var4.setAnimation(dd0Var.a);
                break;
        }
    }
}
