package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;

    public /* synthetic */ sc0(ed0 ed0Var, int i7) {
        this.a = i7;
        this.b = ed0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr[] drVarArr;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        ed0 ed0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.fh0 fh0Var = ed0Var.H;
                ar arVar = ed0Var.f;
                int i12 = ed0Var.i0;
                if (i12 != 3 && (drVarArr = arVar.f) != null) {
                    for (int length = drVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || arVar.f[length].length() != 0) {
                            arVar.f[length].requestFocus();
                            dr drVar = arVar.f[length];
                            drVar.setSelection(drVar.length());
                            ce0.b1(ed0Var.v0, arVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ch0 ch0Var = ed0Var.a;
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
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 6));
                break;
            case 2:
                nb0 nb0Var = ed0Var.x;
                ed0Var.t0 = false;
                while (true) {
                    dr[] drVarArr2 = ed0Var.f.f;
                    if (i11 < drVarArr2.length) {
                        drVarArr2[i11].A(0.0f);
                        i11++;
                    } else if (nb0Var.getCurrentView() != (ed0Var.i0 == 15 ? ed0Var.G : ed0Var.E)) {
                        nb0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.fh0 fh0Var2 = ed0Var.s;
                fh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ch0 ch0Var2 = ed0Var.R;
                ch0Var2.N(0, false, false);
                ch0Var2.K(1);
                fh0Var2.setAnimation(ch0Var2);
                fh0Var2.d();
                break;
            case 5:
                try {
                    ed0Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ed0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131742798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752534, org.telegram.messenger.k5.h(new StringBuilder("+"), ed0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                t1Var.setOnDismissListener(new ad0(ed0Var, i10));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.ch0 ch0Var3 = ed0Var.S;
                ch0Var3.u0 = new sc0(ed0Var, 8);
                org.telegram.ui.Components.fh0 fh0Var3 = ed0Var.s;
                fh0Var3.setAutoRepeat(false);
                ch0Var3.N(0, false, false);
                fh0Var3.setAnimation(ch0Var3);
                fh0Var3.d();
                break;
            case 7:
                ed0Var.postDelayed(new sc0(ed0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.g0.h3(new sc0(ed0Var, 10));
                break;
            case 9:
                ar arVar2 = ed0Var.f;
                arVar2.e = false;
                arVar2.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = arVar2.f;
                    if (i11 >= drVarArr3.length) {
                        break;
                    } else {
                        drVarArr3[i11].A(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.fh0 fh0Var4 = ed0Var.s;
                fh0Var4.setAutoRepeat(false);
                fh0Var4.setAnimation(ed0Var.a);
                break;
        }
    }
}
