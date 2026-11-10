package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;

    public /* synthetic */ xc0(jd0 jd0Var, int i7) {
        this.a = i7;
        this.b = jd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        er[] erVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        jd0 jd0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ch0 ch0Var = jd0Var.G;
                br brVar = jd0Var.f;
                int i12 = jd0Var.h0;
                if (i12 != 3 && (erVarArr = brVar.f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f[length].length() != 0) {
                            brVar.f[length].requestFocus();
                            er erVar = brVar.f[length];
                            erVar.setSelection(erVar.length());
                            fe0.b1(jd0Var.u0, brVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.zg0 zg0Var = jd0Var.a;
                if (zg0Var != null) {
                    zg0Var.start();
                }
                if (i12 == 15) {
                    ch0Var.getAnimatedDrawable().N(0, false, false);
                    ch0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 6));
                break;
            case 2:
                qb0 qb0Var = jd0Var.x;
                jd0Var.s0 = false;
                while (true) {
                    er[] erVarArr2 = jd0Var.f.f;
                    if (i11 < erVarArr2.length) {
                        erVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (qb0Var.getCurrentView() != (jd0Var.h0 == 15 ? jd0Var.F : jd0Var.D)) {
                        qb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ch0 ch0Var2 = jd0Var.s;
                ch0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.zg0 zg0Var2 = jd0Var.Q;
                zg0Var2.N(0, false, false);
                zg0Var2.K(1);
                ch0Var2.setAnimation(zg0Var2);
                ch0Var2.d();
                break;
            case 5:
                try {
                    jd0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jd0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131742798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), jd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                u1Var.setOnDismissListener(new fd0(jd0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.zg0 zg0Var3 = jd0Var.R;
                zg0Var3.t0 = new xc0(jd0Var, 8);
                org.telegram.ui.Components.ch0 ch0Var3 = jd0Var.s;
                ch0Var3.setAutoRepeat(false);
                zg0Var3.N(0, false, false);
                ch0Var3.setAnimation(zg0Var3);
                ch0Var3.d();
                break;
            case 7:
                jd0Var.postDelayed(new xc0(jd0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 10));
                break;
            case 9:
                br brVar2 = jd0Var.f;
                brVar2.e = false;
                brVar2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f;
                    if (i11 >= erVarArr3.length) {
                        break;
                    } else {
                        erVarArr3[i11].z(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.ch0 ch0Var4 = jd0Var.s;
                ch0Var4.setAutoRepeat(false);
                ch0Var4.setAnimation(jd0Var.a);
                break;
        }
    }
}
