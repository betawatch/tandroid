package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;

    public /* synthetic */ yg1(gh1 gh1Var, int i10) {
        this.a = i10;
        this.b = gh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gh1 gh1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = gh1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    gh1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(gh1Var.n);
                    break;
                }
                break;
            case 1:
                gh1 gh1Var2 = this.b;
                ee0 ee0Var = gh1Var2.w;
                if (ee0Var != null && ee0Var.getVisibility() == 0) {
                    gh1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.b.w.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                gh1 gh1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = gh1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        gh1Var3.f0[2].P(49);
                        gh1Var3.f0[2].T(0.0f, false);
                        gh1Var3.a.d();
                        break;
                    } else {
                        gh1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                gh1 gh1Var4 = this.b;
                if (gh1Var4.g0 != null) {
                    gh1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                gh1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yg1(this.b, 7), 150L);
                break;
            default:
                for (gs gsVar : this.b.w.f) {
                    gsVar.i(0.0f);
                }
                break;
        }
    }
}
