package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ll0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ t20(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return j60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 1:
                j60 j60Var = this.b;
                if (j60Var.F1(view)) {
                    try {
                        j60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                j60 j60Var2 = this.b;
                if (!j60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return j60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        j60Var2.I1();
                        org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (kj0Var.isEnabled()) {
                            kj0Var.callOnClick();
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

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        j60 j60Var;
        j50 j50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j50Var = (j60Var = this.b).f3) != null && j50Var.isShowing()) {
            j60Var.f3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        j60.C(this.b, iArr, fArr);
    }
}
