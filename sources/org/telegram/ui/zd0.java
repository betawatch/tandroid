package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ zd0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bs[] bsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        le0 le0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.fi0 fi0Var = le0Var.G;
                zr zrVar = le0Var.f;
                int i13 = le0Var.h0;
                if (i13 != 3 && (bsVarArr = zrVar.f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f[length].length() != 0) {
                            zrVar.f[length].requestFocus();
                            bs bsVar = zrVar.f[length];
                            bsVar.setSelection(bsVar.length());
                            gf0.a1(le0Var.u0, zrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ci0 ci0Var = le0Var.a;
                if (ci0Var != null) {
                    ci0Var.start();
                }
                if (i13 == 15) {
                    fi0Var.getAnimatedDrawable().N(0, false, false);
                    fi0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 6));
                break;
            case 2:
                uc0 uc0Var = le0Var.x;
                le0Var.s0 = false;
                while (true) {
                    bs[] bsVarArr2 = le0Var.f.f;
                    if (i12 < bsVarArr2.length) {
                        bsVarArr2[i12].z(0.0f);
                        i12++;
                    } else if (uc0Var.getCurrentView() != (le0Var.h0 == 15 ? le0Var.F : le0Var.D)) {
                        uc0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.fi0 fi0Var2 = le0Var.s;
                fi0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ci0 ci0Var2 = le0Var.Q;
                ci0Var2.N(0, false, false);
                ci0Var2.K(1);
                fi0Var2.setAnimation(ci0Var2);
                fi0Var2.d();
                break;
            case 5:
                try {
                    le0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(le0Var.getContext());
                String L0 = org.telegram.messenger.dd.L0(2131742823, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131752534, org.telegram.messenger.m5.h(new StringBuilder("+"), le0Var.d, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                x1Var.setOnDismissListener(new he0(le0Var, i11));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.ci0 ci0Var3 = le0Var.R;
                ci0Var3.t0 = new zd0(le0Var, 8);
                org.telegram.ui.Components.fi0 fi0Var3 = le0Var.s;
                fi0Var3.setAutoRepeat(false);
                ci0Var3.N(0, false, false);
                fi0Var3.setAnimation(ci0Var3);
                fi0Var3.d();
                break;
            case 7:
                le0Var.postDelayed(new zd0(le0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 10));
                break;
            case 9:
                zr zrVar2 = le0Var.f;
                zrVar2.e = false;
                zrVar2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].z(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.fi0 fi0Var4 = le0Var.s;
                fi0Var4.setAutoRepeat(false);
                fi0Var4.setAnimation(le0Var.a);
                break;
        }
    }
}
