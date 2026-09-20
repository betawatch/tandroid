package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.ll0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ s20(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return i60.z(this.b, l1Var);
    }

    @Override // org.telegram.ui.Components.ll0
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
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        i60Var2.I1();
                        org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Cells.f4) view).f;
                        if (kj0Var.isEnabled()) {
                            kj0Var.callOnClick();
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
