package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ zl0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.b;
                ViewGroup[] viewGroupArr = pn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    pn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(pn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                pn0 pn0Var2 = this.b;
                pn0Var2.presentFragment(pn0Var2.h1, true);
                pn0Var2.h1 = null;
                break;
            case 2:
                pn0 pn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = pn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    pn0Var3.I1(editTextBoldCursorArr[0]);
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
                    pn0 pn0Var4 = this.b;
                    if (i10 >= pn0Var4.c0.getChildCount()) {
                        pn0Var4.x1();
                        pn0Var4.q1.clear();
                        pn0Var4.p1.clear();
                        pn0Var4.y.values.clear();
                        pn0Var4.Q1();
                        break;
                    } else {
                        View childAt = pn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof on0) {
                            pn0Var4.c0.removeView(childAt);
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
