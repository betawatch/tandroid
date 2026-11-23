package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ sc0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        er[] erVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        gd0 gd0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.qh0 qh0Var = gd0Var.H;
                br brVar = gd0Var.f;
                int i12 = gd0Var.i0;
                if (i12 != 3 && (erVarArr = brVar.f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f[length].length() != 0) {
                            brVar.f[length].requestFocus();
                            er erVar = brVar.f[length];
                            erVar.setSelection(erVar.length());
                            de0.b1(gd0Var.v0, brVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.nh0 nh0Var = gd0Var.a;
                if (nh0Var != null) {
                    nh0Var.start();
                }
                if (i12 == 15) {
                    qh0Var.getAnimatedDrawable().N(0, false, false);
                    qh0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 6));
                break;
            case 2:
                nb0 nb0Var = gd0Var.x;
                gd0Var.t0 = false;
                while (true) {
                    er[] erVarArr2 = gd0Var.f.f;
                    if (i11 < erVarArr2.length) {
                        erVarArr2[i11].A(0.0f);
                        i11++;
                    } else if (nb0Var.getCurrentView() != (gd0Var.i0 == 15 ? gd0Var.G : gd0Var.E)) {
                        nb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.qh0 qh0Var2 = gd0Var.s;
                qh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.nh0 nh0Var2 = gd0Var.R;
                nh0Var2.N(0, false, false);
                nh0Var2.K(1);
                qh0Var2.setAnimation(nh0Var2);
                qh0Var2.d();
                break;
            case 5:
                try {
                    gd0Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String N0 = org.telegram.messenger.gd.N0(2131742527, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752522, org.telegram.messenger.m10.h(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                t1Var.setOnDismissListener(new ad0(gd0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.nh0 nh0Var3 = gd0Var.S;
                nh0Var3.u0 = new sc0(gd0Var, 8);
                org.telegram.ui.Components.qh0 qh0Var3 = gd0Var.s;
                qh0Var3.setAutoRepeat(false);
                nh0Var3.N(0, false, false);
                qh0Var3.setAnimation(nh0Var3);
                qh0Var3.d();
                break;
            case 7:
                gd0Var.postDelayed(new sc0(gd0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 10));
                break;
            case 9:
                br brVar2 = gd0Var.f;
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
                org.telegram.ui.Components.qh0 qh0Var4 = gd0Var.s;
                qh0Var4.setAutoRepeat(false);
                qh0Var4.setAnimation(gd0Var.a);
                break;
        }
    }
}
