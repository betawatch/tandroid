package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ tc0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        br[] brVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        gd0 gd0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ch0 ch0Var = gd0Var.G;
                yq yqVar = gd0Var.f;
                int i12 = gd0Var.h0;
                if (i12 != 3 && (brVarArr = yqVar.f) != null) {
                    for (int length = brVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yqVar.f[length].length() != 0) {
                            yqVar.f[length].requestFocus();
                            br brVar = yqVar.f[length];
                            brVar.setSelection(brVar.length());
                            ce0.b1(gd0Var.u0, yqVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.zg0 zg0Var = gd0Var.a;
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
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 6));
                break;
            case 2:
                nb0 nb0Var = gd0Var.x;
                gd0Var.s0 = false;
                while (true) {
                    br[] brVarArr2 = gd0Var.f.f;
                    if (i11 < brVarArr2.length) {
                        brVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (nb0Var.getCurrentView() != (gd0Var.h0 == 15 ? gd0Var.F : gd0Var.D)) {
                        nb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ch0 ch0Var2 = gd0Var.s;
                ch0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.zg0 zg0Var2 = gd0Var.Q;
                zg0Var2.N(0, false, false);
                zg0Var2.K(1);
                ch0Var2.setAnimation(zg0Var2);
                ch0Var2.d();
                break;
            case 5:
                try {
                    gd0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131742799, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                u1Var.setOnDismissListener(new cd0(gd0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.zg0 zg0Var3 = gd0Var.R;
                zg0Var3.t0 = new tc0(gd0Var, 8);
                org.telegram.ui.Components.ch0 ch0Var3 = gd0Var.s;
                ch0Var3.setAutoRepeat(false);
                zg0Var3.N(0, false, false);
                ch0Var3.setAnimation(zg0Var3);
                ch0Var3.d();
                break;
            case 7:
                gd0Var.postDelayed(new tc0(gd0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 10));
                break;
            case 9:
                yq yqVar2 = gd0Var.f;
                yqVar2.e = false;
                yqVar2.f[0].requestFocus();
                while (true) {
                    br[] brVarArr3 = yqVar2.f;
                    if (i11 >= brVarArr3.length) {
                        break;
                    } else {
                        brVarArr3[i11].z(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.ch0 ch0Var4 = gd0Var.s;
                ch0Var4.setAutoRepeat(false);
                ch0Var4.setAnimation(gd0Var.a);
                break;
        }
    }
}
