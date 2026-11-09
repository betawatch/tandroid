package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements org.telegram.ui.Components.ej0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ t00(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f10 = h1Var.f(647);
        i0.b f11 = h1Var.f(8);
        e40 e40Var = this.b;
        j20 j20Var = e40Var.y1;
        int max = Math.max(f11.d, (j20Var.N || j20Var.e) ? j20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = e40Var.S3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (j20Var.getEmojiView() != null) {
            j20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (e40Var.J4) {
            ViewGroup viewGroup = e40Var.b;
            int i7 = e40Var.t0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = e40Var.b;
            int i10 = e40Var.t0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        e40Var.b.requestLayout();
        if (max == 0 && !j20Var.N && !j20Var.e && !j20Var.O) {
            j20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.ji0 ji0Var = e40Var.B1;
            if (ji0Var == null) {
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                ji0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.ji0 ji0Var2 = new org.telegram.ui.Components.ji0(1, e40Var.a, e40Var.getContext(), Q, e40Var.I0);
                    e40Var.B1 = ji0Var2;
                    ji0Var2.setDelegate(new i30(e40Var));
                    e40Var.b.addView(e40Var.B1, c8.ha.e(-2, 52, 81));
                    e40Var.B1.p(null, null, false);
                    e40Var.x1.bringToFront();
                    e40Var.w1.bringToFront();
                    ji0Var = e40Var.B1;
                }
            }
            e40Var.B1 = ji0Var;
        }
        j20Var.K(f11.d, false);
        e40Var.t3.j(k1Var);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                if (e40Var.L1(view)) {
                    try {
                        e40Var.H1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                e40 e40Var2 = this.b;
                if (!e40Var2.u1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return e40Var2.L1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        e40Var2.O1();
                        org.telegram.ui.Components.dh0 dh0Var = ((org.telegram.ui.Cells.f4) view).f;
                        if (dh0Var.isEnabled()) {
                            dh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        this.b.F1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        e40 e40Var;
        g30 g30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g30Var = (e40Var = this.b).W4) != null && g30Var.isShowing()) {
            e40Var.W4.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v4.d1 K;
        e40 e40Var = this.b;
        x10 x10Var = e40Var.d4;
        b20 b20Var = e40Var.R3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.R2.p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (b20Var.b) {
                    for (int i10 = 0; i10 < x10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) x10Var.getChildAt(i10);
                        if (org.telegram.messenger.ij.B1(h10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                            h10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (e40Var.j2 ? e40Var.u2 : e40Var.R2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = e40Var.H1.K(indexOf + e40Var.G1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == e40Var.O4 && !e40Var.c4) {
                                e40Var.b.invalidate();
                            }
                        }
                    }
                }
                b20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
