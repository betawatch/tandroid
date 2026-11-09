package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ ri0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.b;
                ViewGroup[] viewGroupArr = dk0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    dk0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(dk0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                dk0 dk0Var2 = this.b;
                dk0Var2.presentFragment(dk0Var2.h1, true);
                dk0Var2.h1 = null;
                break;
            case 2:
                dk0 dk0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = dk0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    dk0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.K3(this.b.Y[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i7 = 0;
                while (true) {
                    dk0 dk0Var4 = this.b;
                    if (i7 >= dk0Var4.c0.getChildCount()) {
                        dk0Var4.B1();
                        dk0Var4.q1.clear();
                        dk0Var4.p1.clear();
                        dk0Var4.D.values.clear();
                        dk0Var4.V1();
                        break;
                    } else {
                        View childAt = dk0Var4.c0.getChildAt(i7);
                        if (childAt instanceof ck0) {
                            dk0Var4.c0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
