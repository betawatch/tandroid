package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;

    public /* synthetic */ tc0(hd0 hd0Var, int i7) {
        this.a = i7;
        this.b = hd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        er[] erVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        hd0 hd0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ph0 ph0Var = hd0Var.H;
                br brVar = hd0Var.f;
                int i12 = hd0Var.i0;
                if (i12 != 3 && (erVarArr = brVar.f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f[length].length() != 0) {
                            brVar.f[length].requestFocus();
                            er erVar = brVar.f[length];
                            erVar.setSelection(erVar.length());
                            ee0.b1(hd0Var.v0, brVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.mh0 mh0Var = hd0Var.a;
                if (mh0Var != null) {
                    mh0Var.start();
                }
                if (i12 == 15) {
                    ph0Var.getAnimatedDrawable().N(0, false, false);
                    ph0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 6));
                break;
            case 2:
                ob0 ob0Var = hd0Var.x;
                hd0Var.t0 = false;
                while (true) {
                    er[] erVarArr2 = hd0Var.f.f;
                    if (i11 < erVarArr2.length) {
                        erVarArr2[i11].A(0.0f);
                        i11++;
                    } else if (ob0Var.getCurrentView() != (hd0Var.i0 == 15 ? hd0Var.G : hd0Var.E)) {
                        ob0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ph0 ph0Var2 = hd0Var.s;
                ph0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.mh0 mh0Var2 = hd0Var.R;
                mh0Var2.N(0, false, false);
                mh0Var2.K(1);
                ph0Var2.setAnimation(mh0Var2);
                ph0Var2.d();
                break;
            case 5:
                try {
                    hd0Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getContext());
                String M0 = org.telegram.messenger.gd.M0(2131742540, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752523, org.telegram.messenger.n10.h(new StringBuilder("+"), hd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                u1Var.setOnDismissListener(new bd0(hd0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.mh0 mh0Var3 = hd0Var.S;
                mh0Var3.u0 = new tc0(hd0Var, 8);
                org.telegram.ui.Components.ph0 ph0Var3 = hd0Var.s;
                ph0Var3.setAutoRepeat(false);
                mh0Var3.N(0, false, false);
                ph0Var3.setAnimation(mh0Var3);
                ph0Var3.d();
                break;
            case 7:
                hd0Var.postDelayed(new tc0(hd0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 10));
                break;
            case 9:
                br brVar2 = hd0Var.f;
                brVar2.e = false;
                brVar2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f;
                    if (i11 >= erVarArr3.length) {
                        break;
                    } else {
                        erVarArr3[i11].A(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.ph0 ph0Var4 = hd0Var.s;
                ph0Var4.setAutoRepeat(false);
                ph0Var4.setAnimation(hd0Var.a);
                break;
        }
    }
}
