package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y10 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ok0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ y10(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return o50.z(this.b, m1Var);
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        switch (this.a) {
            case 1:
                o50 o50Var = this.b;
                if (o50Var.F1(view)) {
                    try {
                        o50Var.M.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                o50 o50Var2 = this.b;
                if (!o50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return o50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        o50Var2.I1();
                        org.telegram.ui.Components.pi0 pi0Var = ((org.telegram.ui.Cells.e4) view).f;
                        if (pi0Var.isEnabled()) {
                            pi0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        this.b.K.getActionBarMenuOnItemClick().b(i9);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        o50 o50Var;
        o40 o40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o40Var = (o50Var = this.b).b3) != null && o40Var.isShowing()) {
            o50Var.b3.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        o50.C(this.b, iArr, fArr);
    }
}
