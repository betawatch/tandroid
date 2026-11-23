package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class si0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ si0(fk0 fk0Var, int i7) {
        this.a = i7;
        this.b = fk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.b;
                ViewGroup[] viewGroupArr = fk0Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    fk0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(fk0Var.Z[0]);
                    break;
                }
                break;
            case 1:
                fk0 fk0Var2 = this.b;
                fk0Var2.presentFragment(fk0Var2.i1, true);
                fk0Var2.i1 = null;
                break;
            case 2:
                fk0 fk0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = fk0Var3.b0;
                if (editTextBoldCursorArr != null) {
                    fk0Var3.M1(editTextBoldCursorArr[0]);
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
                    fk0 fk0Var4 = this.b;
                    if (i7 >= fk0Var4.d0.getChildCount()) {
                        fk0Var4.B1();
                        fk0Var4.r1.clear();
                        fk0Var4.q1.clear();
                        fk0Var4.E.values.clear();
                        fk0Var4.V1();
                        break;
                    } else {
                        View childAt = fk0Var4.d0.getChildAt(i7);
                        if (childAt instanceof ek0) {
                            fk0Var4.d0.removeView(childAt);
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
