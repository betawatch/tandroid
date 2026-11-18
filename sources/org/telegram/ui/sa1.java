package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ sa1(bb1 bb1Var, int i7) {
        this.a = i7;
        this.b = bb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    er[] erVarArr = this.b.x.f;
                    if (i7 >= erVarArr.length) {
                        break;
                    } else {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    }
                }
            case 1:
                bb1 bb1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = bb1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        bb1Var.g0[2].P(49);
                        bb1Var.g0[2].T(false, 0.0f);
                        bb1Var.a.d();
                        break;
                    } else {
                        bb1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                bb1 bb1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = bb1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    bb1Var2.n.requestFocus();
                    org.telegram.messenger.g0.I3(bb1Var2.n);
                    break;
                }
                break;
            case 3:
                bb1 bb1Var3 = this.b;
                lb0 lb0Var = bb1Var3.x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    bb1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                bb1 bb1Var4 = this.b;
                if (bb1Var4.h0 != null) {
                    bb1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                bb1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.h3(new sa1(this.b, 7), 150L);
                break;
            default:
                for (er erVar : this.b.x.f) {
                    erVar.A(0.0f);
                }
                break;
        }
    }
}
