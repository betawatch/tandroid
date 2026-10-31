package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ xj0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.b;
                ViewGroup[] viewGroupArr = ll0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ll0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(ll0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                ll0 ll0Var2 = this.b;
                ll0Var2.presentFragment(ll0Var2.h1, true);
                ll0Var2.h1 = null;
                break;
            case 2:
                ll0 ll0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = ll0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    ll0Var3.L1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.J3(this.b.Y[2]);
                break;
            case 4:
                this.b.A1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    ll0 ll0Var4 = this.b;
                    if (i10 >= ll0Var4.c0.getChildCount()) {
                        ll0Var4.A1();
                        ll0Var4.q1.clear();
                        ll0Var4.p1.clear();
                        ll0Var4.D.values.clear();
                        ll0Var4.U1();
                        break;
                    } else {
                        View childAt = ll0Var4.c0.getChildAt(i10);
                        if (childAt instanceof kl0) {
                            ll0Var4.c0.removeView(childAt);
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
