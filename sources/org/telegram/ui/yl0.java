package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public /* synthetic */ yl0(nn0 nn0Var, int i10) {
        this.a = i10;
        this.b = nn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                nn0 nn0Var = this.b;
                ViewGroup[] viewGroupArr = nn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    nn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(nn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                nn0 nn0Var2 = this.b;
                nn0Var2.presentFragment(nn0Var2.h1, true);
                nn0Var2.h1 = null;
                break;
            case 2:
                nn0 nn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = nn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    nn0Var3.H1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b.Y[2]);
                break;
            case 4:
                this.b.w1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    nn0 nn0Var4 = this.b;
                    if (i10 >= nn0Var4.c0.getChildCount()) {
                        nn0Var4.w1();
                        nn0Var4.q1.clear();
                        nn0Var4.p1.clear();
                        nn0Var4.y.values.clear();
                        nn0Var4.P1();
                        break;
                    } else {
                        View childAt = nn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof mn0) {
                            nn0Var4.c0.removeView(childAt);
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
