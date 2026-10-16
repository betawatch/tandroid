package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.cm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ w20(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return n60.C(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 1:
                n60 n60Var = this.b;
                if (n60Var.G1(view)) {
                    try {
                        n60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                n60 n60Var2 = this.b;
                if (!n60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return n60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        n60Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (bk0Var.isEnabled()) {
                            bk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void k(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        n60 n60Var;
        n50 n50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n50Var = (n60Var = this.b).f3) != null && n50Var.isShowing()) {
            n60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        n60.E(this.b, iArr, fArr);
    }
}
