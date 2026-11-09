package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    dr[] drVarArr = this.b.x.f;
                    if (i7 >= drVarArr.length) {
                        break;
                    } else {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 1:
                bb1 bb1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = bb1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        bb1Var.f0[2].P(49);
                        bb1Var.f0[2].T(false, 0.0f);
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
                    org.telegram.messenger.g0.K3(bb1Var2.n);
                    break;
                }
                break;
            case 3:
                bb1 bb1Var3 = this.b;
                nb0 nb0Var = bb1Var3.x;
                if (nb0Var != null && nb0Var.getVisibility() == 0) {
                    bb1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                bb1 bb1Var4 = this.b;
                if (bb1Var4.g0 != null) {
                    bb1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                bb1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new sa1(this.b, 7), 150L);
                break;
            default:
                for (dr drVar : this.b.x.f) {
                    drVar.z(0.0f);
                }
                break;
        }
    }
}
