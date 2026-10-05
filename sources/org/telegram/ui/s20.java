package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.ol0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ s20(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return h60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                h60 h60Var = this.b;
                if (h60Var.F1(view)) {
                    try {
                        h60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                h60 h60Var2 = this.b;
                if (!h60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return h60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        h60Var2.I1();
                        org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (nj0Var.isEnabled()) {
                            nj0Var.callOnClick();
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
    public void o(KeyEvent keyEvent) {
        h60 h60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (h60Var = this.b).f3) != null && i50Var.isShowing()) {
            h60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        h60.B(this.b, iArr, fArr);
    }
}
