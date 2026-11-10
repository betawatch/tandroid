package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u00 implements org.telegram.ui.Components.dj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ u00(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f10 = h1Var.f(647);
        i0.b f11 = h1Var.f(8);
        f40 f40Var = this.b;
        k20 k20Var = f40Var.B1;
        int max = Math.max(f11.d, (k20Var.N || k20Var.e) ? k20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = f40Var.V3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (k20Var.getEmojiView() != null) {
            k20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (f40Var.M4) {
            ViewGroup viewGroup = f40Var.b;
            int i7 = f40Var.t0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = f40Var.b;
            int i10 = f40Var.t0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        f40Var.b.requestLayout();
        if (max == 0 && !k20Var.N && !k20Var.e && !k20Var.O) {
            k20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.ii0 ii0Var = f40Var.E1;
            if (ii0Var == null) {
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                ii0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.ii0 ii0Var2 = new org.telegram.ui.Components.ii0(1, f40Var.a, f40Var.getContext(), Q, f40Var.I0);
                    f40Var.E1 = ii0Var2;
                    ii0Var2.setDelegate(new j30(f40Var));
                    f40Var.b.addView(f40Var.E1, c8.ha.e(-2, 52, 81));
                    f40Var.E1.p(null, null, false);
                    f40Var.A1.bringToFront();
                    f40Var.z1.bringToFront();
                    ii0Var = f40Var.E1;
                }
            }
            f40Var.E1 = ii0Var;
        }
        k20Var.K(f11.d, false);
        f40Var.w3.j(k1Var);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (f40Var.L1(view)) {
                    try {
                        f40Var.K1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f40 f40Var2 = this.b;
                if (!f40Var2.u1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return f40Var2.L1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        f40Var2.O1();
                        org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Cells.f4) view).f;
                        if (ch0Var.isEnabled()) {
                            ch0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        this.b.I1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        f40 f40Var;
        h30 h30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h30Var = (f40Var = this.b).Z4) != null && h30Var.isShowing()) {
            f40Var.Z4.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v4.d1 K;
        f40 f40Var = this.b;
        y10 y10Var = f40Var.g4;
        c20 c20Var = f40Var.U3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.U2.p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (c20Var.b) {
                    for (int i10 = 0; i10 < y10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) y10Var.getChildAt(i10);
                        if (org.telegram.messenger.ij.B1(g10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                            g10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (f40Var.m2 ? f40Var.x2 : f40Var.U2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = f40Var.K1.K(indexOf + f40Var.J1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == f40Var.R4 && !f40Var.f4) {
                                f40Var.b.invalidate();
                            }
                        }
                    }
                }
                c20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
