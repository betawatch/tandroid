package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xf0 implements org.telegram.ui.Components.wi0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ eg0 b;

    public xf0(eg0 eg0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.b = eg0Var;
        this.a = g2Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z13;
        long j3;
        long j10;
        ch.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            eg0 eg0Var = this.b;
            vf0 vf0Var = eg0Var.e0;
            tf0 tf0Var = eg0Var.a0;
            int i7 = eg0Var.c;
            if (vf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z14 = !org.telegram.messenger.k10.i(i7).q() && p0Var2.d;
            org.telegram.ui.Cells.r1 r1Var = eg0Var.Q;
            if (r1Var != null) {
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
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
                    eg0Var.Q.y3(messageObject, eg0Var.l(messageObject), eg0Var.N.size() > 1, false, false, false);
                    eg0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (eg0Var.e0.getReactionsWindow() != null && eg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar = eg0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        xVar.setSelectedReaction(p0Var2);
                        eg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                tf0Var.c();
                if (!z13) {
                    tf0Var.n(eg0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                uf0 uf0Var = eg0Var.X;
                if (uf0Var != null) {
                    uf0Var.setEffect(messageObject.k.effect);
                }
                eg0Var.m(messageObject.k.effect);
            } else if (eg0Var.l0 != null) {
                long j13 = p0Var2.c;
                if (j13 == eg0Var.I) {
                    eg0Var.I = 0L;
                    z12 = true;
                } else {
                    eg0Var.I = j13;
                    z12 = false;
                }
                uf0 uf0Var2 = eg0Var.X;
                if (uf0Var2 != null) {
                    uf0Var2.setEffect(eg0Var.I);
                }
                eg0Var.m(eg0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect b12 = eg0Var.I == 0 ? null : org.telegram.messenger.np.u1(i7).b1(eg0Var.I);
                    org.telegram.ui.Components.n5 n5Var = eg0Var.J;
                    if (n5Var != null) {
                        if (eg0Var.I == 0 || b12 == null) {
                            n5Var.g(null, true);
                        } else {
                            n5Var.g(org.telegram.messenger.j6.g(b12.emoticon), true);
                        }
                    }
                    eg0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (eg0Var.e0.getReactionsWindow() != null && eg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar2 = eg0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        xVar2.setSelectedReaction(p0Var2);
                        eg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                tf0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = eg0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    eg0Var.a0.d(null, 0, null, new org.telegram.messenger.gj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (g2Var = this.a) != null) {
                new org.telegram.ui.Components.lc(eg0Var.G, eg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131754250, null), new wf0(i10, g2Var))).j();
            }
            eg0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
