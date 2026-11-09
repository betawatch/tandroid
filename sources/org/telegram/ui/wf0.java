package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wf0 implements org.telegram.ui.Components.ii0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ dg0 b;

    public wf0(dg0 dg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = dg0Var;
        this.a = f2Var;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z12;
        long j3;
        long j10;
        ch.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            dg0 dg0Var = this.b;
            uf0 uf0Var = dg0Var.d0;
            sf0 sf0Var = dg0Var.Z;
            int i7 = dg0Var.c;
            if (uf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z13 = !org.telegram.messenger.p10.i(i7).q() && o0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = dg0Var.P;
            if (q1Var != null) {
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.k;
                long j11 = message.effect;
                long j12 = o0Var2.c;
                if (j12 == j11) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z12 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j12;
                    z12 = false;
                }
                if (z13) {
                    j3 = 0;
                    j10 = j11;
                } else {
                    j3 = 0;
                    j10 = j11;
                    dg0Var.P.w3(messageObject, dg0Var.k(messageObject), dg0Var.M.size() > 1, false, false, false);
                    dg0Var.d0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (dg0Var.d0.getReactionsWindow() != null && dg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar = dg0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        wVar.setSelectedReaction(o0Var2);
                        dg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                sf0Var.c();
                if (!z12) {
                    sf0Var.n(dg0Var.P, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                tf0 tf0Var = dg0Var.W;
                if (tf0Var != null) {
                    tf0Var.setEffect(messageObject.k.effect);
                }
                dg0Var.l(messageObject.k.effect);
            } else if (dg0Var.k0 != null) {
                long j13 = o0Var2.c;
                if (j13 == dg0Var.H) {
                    dg0Var.H = 0L;
                    z11 = true;
                } else {
                    dg0Var.H = j13;
                    z11 = false;
                }
                tf0 tf0Var2 = dg0Var.W;
                if (tf0Var2 != null) {
                    tf0Var2.setEffect(dg0Var.H);
                }
                dg0Var.l(dg0Var.H);
                if (!z13) {
                    TLRPC.TL_availableEffect Z0 = dg0Var.H == 0 ? null : org.telegram.messenger.qp.s1(i7).Z0(dg0Var.H);
                    org.telegram.ui.Components.g5 g5Var = dg0Var.I;
                    if (g5Var != null) {
                        if (dg0Var.H == 0 || Z0 == null) {
                            g5Var.g(null, true);
                        } else {
                            g5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                        }
                    }
                    dg0Var.d0.setSelectedReactionAnimated(z11 ? null : o0Var2);
                    if (dg0Var.d0.getReactionsWindow() != null && dg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar2 = dg0Var.d0.getReactionsWindow().m;
                        if (z11) {
                            o0Var2 = null;
                        }
                        wVar2.setSelectedReaction(o0Var2);
                        dg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                sf0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = dg0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    dg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (f2Var = this.a) != null) {
                new org.telegram.ui.Components.hc(dg0Var.F, dg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131754253, null), new vf0(i10, f2Var))).j();
            }
            dg0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
