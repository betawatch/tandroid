package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.ml0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ s20(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        return i60.z(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                i60 i60Var = this.b;
                if (i60Var.F1(view)) {
                    try {
                        i60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                i60 i60Var2 = this.b;
                if (!i60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return i60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        i60Var2.I1();
                        org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (lj0Var.isEnabled()) {
                            lj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void p(KeyEvent keyEvent) {
        i60 i60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (i60Var = this.b).f3) != null && i50Var.isShowing()) {
            i60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        i60.B(this.b, iArr, fArr);
    }
}
