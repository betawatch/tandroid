package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ ta1(cb1 cb1Var, int i7) {
        this.a = i7;
        this.b = cb1Var;
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
                        erVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 1:
                cb1 cb1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = cb1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        cb1Var.f0[2].P(49);
                        cb1Var.f0[2].T(false, 0.0f);
                        cb1Var.a.d();
                        break;
                    } else {
                        cb1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                cb1 cb1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = cb1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    cb1Var2.n.requestFocus();
                    org.telegram.messenger.g0.K3(cb1Var2.n);
                    break;
                }
                break;
            case 3:
                cb1 cb1Var3 = this.b;
                ob0 ob0Var = cb1Var3.x;
                if (ob0Var != null && ob0Var.getVisibility() == 0) {
                    cb1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                cb1 cb1Var4 = this.b;
                if (cb1Var4.g0 != null) {
                    cb1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                cb1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new ta1(this.b, 7), 150L);
                break;
            default:
                for (er erVar : this.b.x.f) {
                    erVar.z(0.0f);
                }
                break;
        }
    }
}
