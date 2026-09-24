package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ ql0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.b;
                ViewGroup[] viewGroupArr = gn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    gn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(gn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                gn0 gn0Var2 = this.b;
                gn0Var2.presentFragment(gn0Var2.h1, true);
                gn0Var2.h1 = null;
                break;
            case 2:
                gn0 gn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = gn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    gn0Var3.I1(editTextBoldCursorArr[0]);
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
                    gn0 gn0Var4 = this.b;
                    if (i10 >= gn0Var4.c0.getChildCount()) {
                        gn0Var4.x1();
                        gn0Var4.q1.clear();
                        gn0Var4.p1.clear();
                        gn0Var4.y.values.clear();
                        gn0Var4.Q1();
                        break;
                    } else {
                        View childAt = gn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof fn0) {
                            gn0Var4.c0.removeView(childAt);
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
