package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ rg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zg1 zg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = zg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(zg1Var.n);
                    break;
                }
                break;
            case 1:
                zg1 zg1Var2 = this.b;
                be0 be0Var = zg1Var2.w;
                if (be0Var != null && be0Var.getVisibility() == 0) {
                    zg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.b.w.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                zg1 zg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = zg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zg1Var3.f0[2].P(49);
                        zg1Var3.f0[2].T(0.0f, false);
                        zg1Var3.a.d();
                        break;
                    } else {
                        zg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                zg1 zg1Var4 = this.b;
                if (zg1Var4.g0 != null) {
                    zg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                zg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new rg1(this.b, 7), 150L);
                break;
            default:
                for (es esVar : this.b.w.f) {
                    esVar.i(0.0f);
                }
                break;
        }
    }
}
