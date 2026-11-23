package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v00 implements org.telegram.ui.Components.sj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ v00(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                if (e40Var.M1(view)) {
                    try {
                        e40Var.L1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                e40 e40Var2 = this.b;
                if (!e40Var2.v1()) {
                    if (view instanceof org.telegram.ui.Components.voip.s) {
                        return e40Var2.M1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        e40Var2.P1();
                        org.telegram.ui.Components.qh0 qh0Var = ((org.telegram.ui.Cells.g4) view).f;
                        if (qh0Var.isEnabled()) {
                            qh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void h(int i7) {
        this.b.J1.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        i0.b f10 = i1Var.f(647);
        i0.b f11 = i1Var.f(8);
        e40 e40Var = this.b;
        j20 j20Var = e40Var.C1;
        int max = Math.max(f11.d, (j20Var.O || j20Var.e) ? j20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = e40Var.a4.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (j20Var.getEmojiView() != null) {
            j20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (e40Var.R4) {
            ViewGroup viewGroup = e40Var.b;
            int i7 = e40Var.u0;
            viewGroup.setPadding(i7, 0, i7, 0);
        } else {
            ViewGroup viewGroup2 = e40Var.b;
            int i10 = e40Var.u0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        e40Var.b.requestLayout();
        if (max == 0 && !j20Var.O && !j20Var.e && !j20Var.P) {
            j20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.xi0 xi0Var = e40Var.F1;
            if (xi0Var == null) {
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                xi0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(1, e40Var.a, e40Var.getContext(), Q, e40Var.J0);
                    e40Var.F1 = xi0Var2;
                    xi0Var2.setDelegate(new i30(e40Var));
                    e40Var.b.addView(e40Var.F1, c8.na.e(-2, 52, 81));
                    e40Var.F1.p(null, null, false);
                    e40Var.B1.bringToFront();
                    e40Var.A1.bringToFront();
                    xi0Var = e40Var.F1;
                }
            }
            e40Var.F1 = xi0Var;
        }
        j20Var.L(f11.d, false);
        e40Var.B3.j(l1Var);
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        e40 e40Var;
        g30 g30Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g30Var = (e40Var = this.b).e5) != null && g30Var.isShowing()) {
            e40Var.e5.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v4.f1 K;
        e40 e40Var = this.b;
        w10 w10Var = e40Var.l4;
        a20 a20Var = e40Var.Z3;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.V2.p.get(iArr[i7]);
            if (groupCallParticipant != null) {
                if (a20Var.b) {
                    for (int i10 = 0; i10 < w10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) w10Var.getChildAt(i10);
                        if (org.telegram.messenger.fj.B1(s10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                            s10Var.setAmplitude(fArr[i7] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (e40Var.n2 ? e40Var.y2 : e40Var.V2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = e40Var.L1.K(indexOf + e40Var.K1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) view).setAmplitude(fArr[i7] * 15.0f);
                            if (view == e40Var.W4 && !e40Var.k4) {
                                e40Var.b.invalidate();
                            }
                        }
                    }
                }
                a20Var.k(groupCallParticipant, fArr[i7] * 15.0f);
            }
        }
    }
}
