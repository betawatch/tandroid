package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ zl0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.b;
                ViewGroup[] viewGroupArr = qn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    qn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(qn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                qn0 qn0Var2 = this.b;
                qn0Var2.presentFragment(qn0Var2.h1, true);
                qn0Var2.h1 = null;
                break;
            case 2:
                qn0 qn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = qn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    qn0Var3.I1(editTextBoldCursorArr[0]);
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
                    qn0 qn0Var4 = this.b;
                    if (i10 >= qn0Var4.c0.getChildCount()) {
                        qn0Var4.x1();
                        qn0Var4.q1.clear();
                        qn0Var4.p1.clear();
                        qn0Var4.y.values.clear();
                        qn0Var4.Q1();
                        break;
                    } else {
                        View childAt = qn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof pn0) {
                            qn0Var4.c0.removeView(childAt);
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
