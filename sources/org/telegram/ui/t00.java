package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements org.telegram.ui.Components.ij0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ t00(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.c f10 = h1Var.f(647);
        i0.c f11 = h1Var.f(8);
        c40 c40Var = this.b;
        h20 h20Var = c40Var.C1;
        int max = Math.max(f11.d, (h20Var.O || h20Var.e) ? h20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = c40Var.a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (h20Var.getEmojiView() != null) {
            h20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (c40Var.R4) {
            ViewGroup viewGroup = c40Var.b;
            int i7 = c40Var.u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = c40Var.b;
            int i10 = c40Var.u0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        c40Var.b.requestLayout();
        if (max == 0 && !h20Var.O && !h20Var.e && !h20Var.P) {
            h20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.mi0 mi0Var = c40Var.F1;
            if (mi0Var == null) {
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                mi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(1, c40Var.a, c40Var.getContext(), Q, c40Var.J0);
                    c40Var.F1 = mi0Var2;
                    mi0Var2.setDelegate(new g30(c40Var));
                    c40Var.b.addView(c40Var.F1, c8.ja.e(-2, 52, 81));
                    c40Var.F1.p(null, null, false);
                    c40Var.B1.bringToFront();
                    c40Var.A1.bringToFront();
                    mi0Var = c40Var.F1;
                }
            }
            c40Var.F1 = mi0Var;
        }
        h20Var.L(f11.d, false);
        c40Var.B3.j(k1Var);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        switch (this.a) {
            case 0:
                c40 c40Var = this.b;
                if (c40Var.L1(view)) {
                    try {
                        c40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                c40 c40Var2 = this.b;
                if (!c40Var2.u1()) {
                    if (view instanceof org.telegram.ui.Components.voip.r) {
                        return c40Var2.L1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        c40Var2.O1();
                        org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Cells.f4) view).f;
                        if (fh0Var.isEnabled()) {
                            fh0Var.callOnClick();
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
        c40 c40Var;
        e30 e30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e30Var = (c40Var = this.b).e5) != null && e30Var.isShowing()) {
            c40Var.e5.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v4.e1 K;
        c40 c40Var = this.b;
        u10 u10Var = c40Var.l4;
        y10 y10Var = c40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.V2.p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (y10Var.b) {
                    for (int i10 = 0; i10 < u10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) u10Var.getChildAt(i10);
                        if (org.telegram.messenger.gj.B1(k10Var.getParticipant().peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                            k10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (c40Var.n2 ? c40Var.y2 : c40Var.V2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = c40Var.L1.K(indexOf + c40Var.K1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == c40Var.W4 && !c40Var.k4) {
                                c40Var.b.invalidate();
                            }
                        }
                    }
                }
                y10Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
