package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements org.telegram.ui.Components.sj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ w00(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        i0.b f10 = i1Var.f(647);
        i0.b f11 = i1Var.f(8);
        f40 f40Var = this.b;
        k20 k20Var = f40Var.C1;
        int max = Math.max(f11.d, (k20Var.O || k20Var.e) ? k20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = f40Var.a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (k20Var.getEmojiView() != null) {
            k20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (f40Var.R4) {
            ViewGroup viewGroup = f40Var.b;
            int i7 = f40Var.u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = f40Var.b;
            int i10 = f40Var.u0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        f40Var.b.requestLayout();
        if (max == 0 && !k20Var.O && !k20Var.e && !k20Var.P) {
            k20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.xi0 xi0Var = f40Var.F1;
            if (xi0Var == null) {
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                xi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(1, f40Var.a, f40Var.getContext(), Q, f40Var.J0);
                    f40Var.F1 = xi0Var2;
                    xi0Var2.setDelegate(new j30(f40Var));
                    f40Var.b.addView(f40Var.F1, c8.ma.e(-2, 52, 81));
                    f40Var.F1.p(null, null, false);
                    f40Var.B1.bringToFront();
                    f40Var.A1.bringToFront();
                    xi0Var = f40Var.F1;
                }
            }
            f40Var.F1 = xi0Var;
        }
        k20Var.L(f11.d, false);
        f40Var.B3.j(l1Var);
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (f40Var.M1(view)) {
                    try {
                        f40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f40 f40Var2 = this.b;
                if (!f40Var2.v1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return f40Var2.M1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        f40Var2.P1();
                        org.telegram.ui.Components.rh0 rh0Var = ((org.telegram.ui.Cells.g4) view).f;
                        if (rh0Var.isEnabled()) {
                            rh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        this.b.J1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        f40 f40Var;
        h30 h30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h30Var = (f40Var = this.b).e5) != null && h30Var.isShowing()) {
            f40Var.e5.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v4.f1 K;
        f40 f40Var = this.b;
        x10 x10Var = f40Var.l4;
        b20 b20Var = f40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.V2.p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (b20Var.b) {
                    for (int i10 = 0; i10 < x10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) x10Var.getChildAt(i10);
                        if (org.telegram.messenger.fj.B1(u10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                            u10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (f40Var.n2 ? f40Var.y2 : f40Var.V2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = f40Var.L1.K(indexOf + f40Var.K1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == f40Var.W4 && !f40Var.k4) {
                                f40Var.b.invalidate();
                            }
                        }
                    }
                }
                b20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
