package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ ri0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.b;
                ViewGroup[] viewGroupArr = ek0Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ek0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.J3(ek0Var.Z[0]);
                    break;
                }
                break;
            case 1:
                ek0 ek0Var2 = this.b;
                ek0Var2.presentFragment(ek0Var2.i1, true);
                ek0Var2.i1 = null;
                break;
            case 2:
                ek0 ek0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = ek0Var3.b0;
                if (editTextBoldCursorArr != null) {
                    ek0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.J3(this.b.Z[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i7 = 0;
                while (true) {
                    ek0 ek0Var4 = this.b;
                    if (i7 >= ek0Var4.d0.getChildCount()) {
                        ek0Var4.B1();
                        ek0Var4.r1.clear();
                        ek0Var4.q1.clear();
                        ek0Var4.E.values.clear();
                        ek0Var4.V1();
                        break;
                    } else {
                        View childAt = ek0Var4.d0.getChildAt(i7);
                        if (childAt instanceof dk0) {
                            ek0Var4.d0.removeView(childAt);
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
