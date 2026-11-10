package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xf0 implements org.telegram.ui.Components.hi0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ eg0 b;

    public xf0(eg0 eg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = eg0Var;
        this.a = f2Var;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z12;
        long j3;
        long j10;
        ch.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            eg0 eg0Var = this.b;
            vf0 vf0Var = eg0Var.d0;
            tf0 tf0Var = eg0Var.Z;
            int i7 = eg0Var.c;
            if (vf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z13 = !org.telegram.messenger.p10.i(i7).q() && o0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
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
                    eg0Var.P.w3(messageObject, eg0Var.k(messageObject), eg0Var.M.size() > 1, false, false, false);
                    eg0Var.d0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (eg0Var.d0.getReactionsWindow() != null && eg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar = eg0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        wVar.setSelectedReaction(o0Var2);
                        eg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                tf0Var.c();
                if (!z12) {
                    tf0Var.n(eg0Var.P, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                uf0 uf0Var = eg0Var.W;
                if (uf0Var != null) {
                    uf0Var.setEffect(messageObject.k.effect);
                }
                eg0Var.l(messageObject.k.effect);
            } else if (eg0Var.k0 != null) {
                long j13 = o0Var2.c;
                if (j13 == eg0Var.H) {
                    eg0Var.H = 0L;
                    z11 = true;
                } else {
                    eg0Var.H = j13;
                    z11 = false;
                }
                uf0 uf0Var2 = eg0Var.W;
                if (uf0Var2 != null) {
                    uf0Var2.setEffect(eg0Var.H);
                }
                eg0Var.l(eg0Var.H);
                if (!z13) {
                    TLRPC.TL_availableEffect Z0 = eg0Var.H == 0 ? null : org.telegram.messenger.qp.s1(i7).Z0(eg0Var.H);
                    org.telegram.ui.Components.f5 f5Var = eg0Var.I;
                    if (f5Var != null) {
                        if (eg0Var.H == 0 || Z0 == null) {
                            f5Var.g(null, true);
                        } else {
                            f5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                        }
                    }
                    eg0Var.d0.setSelectedReactionAnimated(z11 ? null : o0Var2);
                    if (eg0Var.d0.getReactionsWindow() != null && eg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar2 = eg0Var.d0.getReactionsWindow().m;
                        if (z11) {
                            o0Var2 = null;
                        }
                        wVar2.setSelectedReaction(o0Var2);
                        eg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                tf0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = eg0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    eg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (f2Var = this.a) != null) {
                new org.telegram.ui.Components.gc(eg0Var.F, eg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131754253, null), new wf0(i10, f2Var))).j();
            }
            eg0Var.G.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
