package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wf0 implements org.telegram.ui.Components.wi0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ dg0 b;

    public wf0(dg0 dg0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.b = dg0Var;
        this.a = g2Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z13;
        long j3;
        long j10;
        ch.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            dg0 dg0Var = this.b;
            uf0 uf0Var = dg0Var.e0;
            sf0 sf0Var = dg0Var.a0;
            int i7 = dg0Var.c;
            if (uf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z14 = !org.telegram.messenger.i10.i(i7).q() && p0Var2.d;
            org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
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
                    dg0Var.Q.y3(messageObject, dg0Var.l(messageObject), dg0Var.N.size() > 1, false, false, false);
                    dg0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (dg0Var.e0.getReactionsWindow() != null && dg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar = dg0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        xVar.setSelectedReaction(p0Var2);
                        dg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                sf0Var.c();
                if (!z13) {
                    sf0Var.n(dg0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                tf0 tf0Var = dg0Var.X;
                if (tf0Var != null) {
                    tf0Var.setEffect(messageObject.k.effect);
                }
                dg0Var.m(messageObject.k.effect);
            } else if (dg0Var.l0 != null) {
                long j13 = p0Var2.c;
                if (j13 == dg0Var.I) {
                    dg0Var.I = 0L;
                    z12 = true;
                } else {
                    dg0Var.I = j13;
                    z12 = false;
                }
                tf0 tf0Var2 = dg0Var.X;
                if (tf0Var2 != null) {
                    tf0Var2.setEffect(dg0Var.I);
                }
                dg0Var.m(dg0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect b12 = dg0Var.I == 0 ? null : org.telegram.messenger.mp.u1(i7).b1(dg0Var.I);
                    org.telegram.ui.Components.m5 m5Var = dg0Var.J;
                    if (m5Var != null) {
                        if (dg0Var.I == 0 || b12 == null) {
                            m5Var.g(null, true);
                        } else {
                            m5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                        }
                    }
                    dg0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (dg0Var.e0.getReactionsWindow() != null && dg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar2 = dg0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        xVar2.setSelectedReaction(p0Var2);
                        dg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                sf0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = dg0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    dg0Var.a0.d(null, 0, null, new org.telegram.messenger.fj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (g2Var = this.a) != null) {
                new org.telegram.ui.Components.kc(dg0Var.G, dg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131754250, null), new vf0(i10, g2Var))).j();
            }
            dg0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
