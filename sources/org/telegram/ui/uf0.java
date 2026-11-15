package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uf0 implements org.telegram.ui.Components.li0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ bg0 b;

    public uf0(bg0 bg0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = bg0Var;
        this.a = e2Var;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z13;
        long j3;
        long j10;
        ch.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            bg0 bg0Var = this.b;
            sf0 sf0Var = bg0Var.e0;
            qf0 qf0Var = bg0Var.a0;
            int i7 = bg0Var.c;
            if (sf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z14 = !org.telegram.messenger.m10.i(i7).q() && p0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = bg0Var.Q;
            if (q1Var != null) {
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
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
                    bg0Var.Q.x3(messageObject, bg0Var.l(messageObject), bg0Var.N.size() > 1, false, false, false);
                    bg0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (bg0Var.e0.getReactionsWindow() != null && bg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar = bg0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        xVar.setSelectedReaction(p0Var2);
                        bg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                qf0Var.c();
                if (!z13) {
                    qf0Var.n(bg0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                rf0 rf0Var = bg0Var.X;
                if (rf0Var != null) {
                    rf0Var.setEffect(messageObject.k.effect);
                }
                bg0Var.m(messageObject.k.effect);
            } else if (bg0Var.l0 != null) {
                long j13 = p0Var2.c;
                if (j13 == bg0Var.I) {
                    bg0Var.I = 0L;
                    z12 = true;
                } else {
                    bg0Var.I = j13;
                    z12 = false;
                }
                rf0 rf0Var2 = bg0Var.X;
                if (rf0Var2 != null) {
                    rf0Var2.setEffect(bg0Var.I);
                }
                bg0Var.m(bg0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect Z0 = bg0Var.I == 0 ? null : org.telegram.messenger.np.s1(i7).Z0(bg0Var.I);
                    org.telegram.ui.Components.e5 e5Var = bg0Var.J;
                    if (e5Var != null) {
                        if (bg0Var.I == 0 || Z0 == null) {
                            e5Var.g(null, true);
                        } else {
                            e5Var.g(org.telegram.messenger.j6.g(Z0.emoticon), true);
                        }
                    }
                    bg0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (bg0Var.e0.getReactionsWindow() != null && bg0Var.e0.getReactionsWindow().m != null) {
                        ch.x xVar2 = bg0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        xVar2.setSelectedReaction(p0Var2);
                        bg0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                qf0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = bg0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    bg0Var.a0.d(null, 0, null, new org.telegram.messenger.gj(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (e2Var = this.a) != null) {
                new org.telegram.ui.Components.cc(bg0Var.G, bg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131754253, null), new tf0(i10, e2Var))).j();
            }
            bg0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
