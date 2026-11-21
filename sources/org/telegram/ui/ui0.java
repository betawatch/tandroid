package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ ui0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                hk0 hk0Var = this.b;
                ViewGroup[] viewGroupArr = hk0Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    hk0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(hk0Var.Z[0]);
                    break;
                }
                break;
            case 1:
                hk0 hk0Var2 = this.b;
                hk0Var2.presentFragment(hk0Var2.i1, true);
                hk0Var2.i1 = null;
                break;
            case 2:
                hk0 hk0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = hk0Var3.b0;
                if (editTextBoldCursorArr != null) {
                    hk0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.I3(this.b.Z[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i7 = 0;
                while (true) {
                    hk0 hk0Var4 = this.b;
                    if (i7 >= hk0Var4.d0.getChildCount()) {
                        hk0Var4.B1();
                        hk0Var4.r1.clear();
                        hk0Var4.q1.clear();
                        hk0Var4.E.values.clear();
                        hk0Var4.V1();
                        break;
                    } else {
                        View childAt = hk0Var4.d0.getChildAt(i7);
                        if (childAt instanceof gk0) {
                            hk0Var4.d0.removeView(childAt);
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
