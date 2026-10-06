package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ ul0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.b;
                ViewGroup[] viewGroupArr = kn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    kn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(kn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                kn0 kn0Var2 = this.b;
                kn0Var2.presentFragment(kn0Var2.h1, true);
                kn0Var2.h1 = null;
                break;
            case 2:
                kn0 kn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = kn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    kn0Var3.I1(editTextBoldCursorArr[0]);
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
                    kn0 kn0Var4 = this.b;
                    if (i10 >= kn0Var4.c0.getChildCount()) {
                        kn0Var4.x1();
                        kn0Var4.q1.clear();
                        kn0Var4.p1.clear();
                        kn0Var4.y.values.clear();
                        kn0Var4.Q1();
                        break;
                    } else {
                        View childAt = kn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof jn0) {
                            kn0Var4.c0.removeView(childAt);
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
