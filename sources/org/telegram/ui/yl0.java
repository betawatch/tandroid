package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ yl0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                on0 on0Var = this.b;
                ViewGroup[] viewGroupArr = on0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    on0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(on0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                on0 on0Var2 = this.b;
                on0Var2.presentFragment(on0Var2.h1, true);
                on0Var2.h1 = null;
                break;
            case 2:
                on0 on0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = on0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    on0Var3.I1(editTextBoldCursorArr[0]);
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
                    on0 on0Var4 = this.b;
                    if (i10 >= on0Var4.c0.getChildCount()) {
                        on0Var4.x1();
                        on0Var4.q1.clear();
                        on0Var4.p1.clear();
                        on0Var4.y.values.clear();
                        on0Var4.Q1();
                        break;
                    } else {
                        View childAt = on0Var4.c0.getChildAt(i10);
                        if (childAt instanceof nn0) {
                            on0Var4.c0.removeView(childAt);
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
