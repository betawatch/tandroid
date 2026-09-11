package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.bl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ s20(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        return j60.A(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
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
                        org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Cells.d4) view).f;
                        if (aj0Var.isEnabled()) {
                            aj0Var.callOnClick();
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
    public void n(KeyEvent keyEvent) {
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
