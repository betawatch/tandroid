package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ vc0(id0 id0Var, int i7) {
        this.a = i7;
        this.b = id0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr[] drVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        id0 id0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.dh0 dh0Var = id0Var.G;
                ar arVar = id0Var.f;
                int i12 = id0Var.h0;
                if (i12 != 3 && (drVarArr = arVar.f) != null) {
                    for (int length = drVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || arVar.f[length].length() != 0) {
                            arVar.f[length].requestFocus();
                            dr drVar = arVar.f[length];
                            drVar.setSelection(drVar.length());
                            ee0.b1(id0Var.u0, arVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ah0 ah0Var = id0Var.a;
                if (ah0Var != null) {
                    ah0Var.start();
                }
                if (i12 == 15) {
                    dh0Var.getAnimatedDrawable().N(0, false, false);
                    dh0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 6));
                break;
            case 2:
                pb0 pb0Var = id0Var.x;
                id0Var.s0 = false;
                while (true) {
                    dr[] drVarArr2 = id0Var.f.f;
                    if (i11 < drVarArr2.length) {
                        drVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (pb0Var.getCurrentView() != (id0Var.h0 == 15 ? id0Var.F : id0Var.D)) {
                        pb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.dh0 dh0Var2 = id0Var.s;
                dh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ah0 ah0Var2 = id0Var.Q;
                ah0Var2.N(0, false, false);
                ah0Var2.K(1);
                dh0Var2.setAnimation(ah0Var2);
                dh0Var2.d();
                break;
            case 5:
                try {
                    id0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(id0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131742798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), id0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                u1Var.setOnDismissListener(new ed0(id0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.ah0 ah0Var3 = id0Var.R;
                ah0Var3.t0 = new vc0(id0Var, 8);
                org.telegram.ui.Components.dh0 dh0Var3 = id0Var.s;
                dh0Var3.setAutoRepeat(false);
                ah0Var3.N(0, false, false);
                dh0Var3.setAnimation(ah0Var3);
                dh0Var3.d();
                break;
            case 7:
                id0Var.postDelayed(new vc0(id0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.h3(new vc0(id0Var, 10));
                break;
            case 9:
                ar arVar2 = id0Var.f;
                arVar2.e = false;
                arVar2.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = arVar2.f;
                    if (i11 >= drVarArr3.length) {
                        break;
                    } else {
                        drVarArr3[i11].z(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.dh0 dh0Var4 = id0Var.s;
                dh0Var4.setAutoRepeat(false);
                dh0Var4.setAnimation(id0Var.a);
                break;
        }
    }
}
