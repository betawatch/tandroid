package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ vj0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.b;
                ViewGroup[] viewGroupArr = jl0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    jl0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(jl0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                jl0 jl0Var2 = this.b;
                jl0Var2.presentFragment(jl0Var2.h1, true);
                jl0Var2.h1 = null;
                break;
            case 2:
                jl0 jl0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = jl0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    jl0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.J3(this.b.Y[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    jl0 jl0Var4 = this.b;
                    if (i10 >= jl0Var4.c0.getChildCount()) {
                        jl0Var4.B1();
                        jl0Var4.q1.clear();
                        jl0Var4.p1.clear();
                        jl0Var4.D.values.clear();
                        jl0Var4.V1();
                        break;
                    } else {
                        View childAt = jl0Var4.c0.getChildAt(i10);
                        if (childAt instanceof il0) {
                            jl0Var4.c0.removeView(childAt);
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
