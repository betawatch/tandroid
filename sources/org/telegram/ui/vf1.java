package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ vf1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg1 dg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = dg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    dg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(dg1Var.n);
                    break;
                }
                break;
            case 1:
                dg1 dg1Var2 = this.b;
                ld0 ld0Var = dg1Var2.w;
                if (ld0Var != null && ld0Var.getVisibility() == 0) {
                    dg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    xr[] xrVarArr = this.b.w.f;
                    if (i10 >= xrVarArr.length) {
                        break;
                    } else {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                dg1 dg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = dg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        dg1Var3.f0[2].P(49);
                        dg1Var3.f0[2].T(0.0f, false);
                        dg1Var3.a.d();
                        break;
                    } else {
                        dg1Var3.G0(true);
                        break;
                    }
                }
                break;
            case 4:
                dg1 dg1Var4 = this.b;
                if (dg1Var4.g0 != null) {
                    dg1Var4.G0(false);
                    break;
                }
                break;
            case 5:
                dg1.g0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new vf1(this.b, 7), 150L);
                break;
            default:
                for (xr xrVar : this.b.w.f) {
                    xrVar.i(0.0f);
                }
                break;
        }
    }
}
