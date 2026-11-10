package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class si0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ si0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.b;
                ViewGroup[] viewGroupArr = ek0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ek0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(ek0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                ek0 ek0Var2 = this.b;
                ek0Var2.presentFragment(ek0Var2.h1, true);
                ek0Var2.h1 = null;
                break;
            case 2:
                ek0 ek0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = ek0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    ek0Var3.M1(editTextBoldCursorArr[0]);
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
                    ek0 ek0Var4 = this.b;
                    if (i7 >= ek0Var4.c0.getChildCount()) {
                        ek0Var4.B1();
                        ek0Var4.q1.clear();
                        ek0Var4.p1.clear();
                        ek0Var4.D.values.clear();
                        ek0Var4.V1();
                        break;
                    } else {
                        View childAt = ek0Var4.c0.getChildAt(i7);
                        if (childAt instanceof dk0) {
                            ek0Var4.c0.removeView(childAt);
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
