package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yf0 implements org.telegram.ui.Components.ui0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 a;
    public final /* synthetic */ fg0 b;

    public yf0(fg0 fg0Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.b = fg0Var;
        this.a = h2Var;
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui0
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z13;
        long j3;
        long j10;
        ch.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            fg0 fg0Var = this.b;
            wf0 wf0Var = fg0Var.e0;
            uf0 uf0Var = fg0Var.a0;
            int i7 = fg0Var.c;
            if (wf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z14 = !org.telegram.messenger.j10.i(i7).q() && p0Var2.d;
            org.telegram.ui.Cells.r1 r1Var = fg0Var.Q;
            if (r1Var != null) {
                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.k;
                long j11 = message.effect;
                long j12 = p0Var2.c;
                if (j12 == j11) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z13 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j12;
                    z13 = false;
                }
                if (z14) {
                    j3 = 0;
                    j10 = j11;
                } else {
                    j3 = 0;
                    j10 = j11;
                    fg0Var.Q.y3(messageObject, fg0Var.l(messageObject), fg0Var.N.size() > 1, false, false, false);
                    fg0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (fg0Var.e0.getReactionsWindow() != null && fg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar = fg0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        xVar.setSelectedReaction(p0Var2);
                        fg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                uf0Var.c();
                if (!z13) {
                    uf0Var.n(fg0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                vf0 vf0Var = fg0Var.X;
                if (vf0Var != null) {
                    vf0Var.setEffect(messageObject.k.effect);
                }
                fg0Var.m(messageObject.k.effect);
            } else if (fg0Var.l0 != null) {
                long j13 = p0Var2.c;
                if (j13 == fg0Var.I) {
                    fg0Var.I = 0L;
                    z12 = true;
                } else {
                    fg0Var.I = j13;
                    z12 = false;
                }
                vf0 vf0Var2 = fg0Var.X;
                if (vf0Var2 != null) {
                    vf0Var2.setEffect(fg0Var.I);
                }
                fg0Var.m(fg0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect b12 = fg0Var.I == 0 ? null : org.telegram.messenger.mp.u1(i7).b1(fg0Var.I);
                    org.telegram.ui.Components.m5 m5Var = fg0Var.J;
                    if (m5Var != null) {
                        if (fg0Var.I == 0 || b12 == null) {
                            m5Var.g(null, true);
                        } else {
                            m5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                        }
                    }
                    fg0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (fg0Var.e0.getReactionsWindow() != null && fg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar2 = fg0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        xVar2.setSelectedReaction(p0Var2);
                        fg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                uf0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = fg0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    fg0Var.a0.d(null, 0, null, new org.telegram.messenger.fj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (h2Var = this.a) != null) {
                new org.telegram.ui.Components.lc(fg0Var.G, fg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131754251, null), new xf0(i10, h2Var))).j();
            }
            fg0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
