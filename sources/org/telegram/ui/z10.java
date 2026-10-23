package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z10 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.zl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ z10(q50 q50Var, int i10) {
        this.a = i10;
        this.b = q50Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return q50.B(this.b, k1Var);
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 1:
                q50 q50Var = this.b;
                if (q50Var.G1(view)) {
                    try {
                        q50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                q50 q50Var2 = this.b;
                if (!q50Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return q50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        q50Var2.J1();
                        org.telegram.ui.Components.yj0 yj0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (yj0Var.isEnabled()) {
                            yj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        this.b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        q50 q50Var;
        q40 q40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q40Var = (q50Var = this.b).f3) != null && q40Var.isShowing()) {
            q50Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        q50.D(this.b, iArr, fArr);
    }
}
