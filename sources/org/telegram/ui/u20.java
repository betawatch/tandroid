package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.cl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ u20(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return k60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                k60 k60Var = this.b;
                if (k60Var.F1(view)) {
                    try {
                        k60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                k60 k60Var2 = this.b;
                if (!k60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return k60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        k60Var2.I1();
                        org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (bj0Var.isEnabled()) {
                            bj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        k60 k60Var;
        k50 k50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k50Var = (k60Var = this.b).f3) != null && k50Var.isShowing()) {
            k60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        k60.B(this.b, iArr, fArr);
    }
}
