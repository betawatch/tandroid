package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ xf1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg1 fg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = fg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    fg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(fg1Var.n);
                    break;
                }
                break;
            case 1:
                fg1 fg1Var2 = this.b;
                nd0 nd0Var = fg1Var2.w;
                if (nd0Var != null && nd0Var.getVisibility() == 0) {
                    fg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    zr[] zrVarArr = this.b.w.f;
                    if (i10 >= zrVarArr.length) {
                        break;
                    } else {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                fg1 fg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = fg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        fg1Var3.f0[2].P(49);
                        fg1Var3.f0[2].T(0.0f, false);
                        fg1Var3.a.d();
                        break;
                    } else {
                        fg1Var3.G0(true);
                        break;
                    }
                }
                break;
            case 4:
                fg1 fg1Var4 = this.b;
                if (fg1Var4.g0 != null) {
                    fg1Var4.G0(false);
                    break;
                }
                break;
            case 5:
                fg1.g0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new xf1(this.b, 7), 150L);
                break;
            default:
                for (zr zrVar : this.b.w.f) {
                    zrVar.i(0.0f);
                }
                break;
        }
    }
}
