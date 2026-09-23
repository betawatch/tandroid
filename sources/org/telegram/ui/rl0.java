package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ rl0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                in0 in0Var = this.b;
                ViewGroup[] viewGroupArr = in0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    in0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(in0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                in0 in0Var2 = this.b;
                in0Var2.presentFragment(in0Var2.h1, true);
                in0Var2.h1 = null;
                break;
            case 2:
                in0 in0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = in0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    in0Var3.I1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b.Y[2]);
                break;
            case 4:
                this.b.x1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    in0 in0Var4 = this.b;
                    if (i10 >= in0Var4.c0.getChildCount()) {
                        in0Var4.x1();
                        in0Var4.q1.clear();
                        in0Var4.p1.clear();
                        in0Var4.y.values.clear();
                        in0Var4.Q1();
                        break;
                    } else {
                        View childAt = in0Var4.c0.getChildAt(i10);
                        if (childAt instanceof hn0) {
                            in0Var4.c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
