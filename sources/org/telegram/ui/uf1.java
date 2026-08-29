package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ uf1(cg1 cg1Var, int i10) {
        this.a = i10;
        this.b = cg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cg1 cg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = cg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    cg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(cg1Var.n);
                    break;
                }
                break;
            case 1:
                cg1 cg1Var2 = this.b;
                md0 md0Var = cg1Var2.w;
                if (md0Var != null && md0Var.getVisibility() == 0) {
                    cg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    ur[] urVarArr = this.b.w.f;
                    if (i10 >= urVarArr.length) {
                        break;
                    } else {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                cg1 cg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = cg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        cg1Var3.b0[2].N(49);
                        cg1Var3.b0[2].Q(0.0f, false);
                        cg1Var3.a.d();
                        break;
                    } else {
                        cg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                cg1 cg1Var4 = this.b;
                if (cg1Var4.c0 != null) {
                    cg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                cg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new uf1(this.b, 7), 150L);
                break;
            default:
                for (ur urVar : this.b.w.f) {
                    urVar.i(0.0f);
                }
                break;
        }
    }
}
