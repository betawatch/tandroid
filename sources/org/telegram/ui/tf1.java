package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg1 b;

    public /* synthetic */ tf1(bg1 bg1Var, int i10) {
        this.a = i10;
        this.b = bg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bg1 bg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = bg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    bg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(bg1Var.n);
                    break;
                }
                break;
            case 1:
                bg1 bg1Var2 = this.b;
                od0 od0Var = bg1Var2.w;
                if (od0Var != null && od0Var.getVisibility() == 0) {
                    bg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.b.w.f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                bg1 bg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = bg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        bg1Var3.f0[2].P(49);
                        bg1Var3.f0[2].T(0.0f, false);
                        bg1Var3.a.d();
                        break;
                    } else {
                        bg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                bg1 bg1Var4 = this.b;
                if (bg1Var4.g0 != null) {
                    bg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                bg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tf1(this.b, 7), 150L);
                break;
            default:
                for (vr vrVar : this.b.w.f) {
                    vrVar.i(0.0f);
                }
                break;
        }
    }
}
