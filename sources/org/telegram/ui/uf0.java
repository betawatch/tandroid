package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class uf0 implements org.telegram.ui.Components.hi0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ bg0 b;

    public uf0(bg0 bg0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = bg0Var;
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
            bg0 bg0Var = this.b;
            sf0 sf0Var = bg0Var.d0;
            qf0 qf0Var = bg0Var.Z;
            int i7 = bg0Var.c;
            if (sf0Var == null) {
                return;
            }
            int i10 = 0;
            boolean z13 = !org.telegram.messenger.p10.i(i7).q() && o0Var2.d;
            org.telegram.ui.Cells.q1 q1Var = bg0Var.P;
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
                    bg0Var.P.v3(messageObject, bg0Var.k(messageObject), bg0Var.M.size() > 1, false, false, false);
                    bg0Var.d0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (bg0Var.d0.getReactionsWindow() != null && bg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar = bg0Var.d0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        wVar.setSelectedReaction(o0Var2);
                        bg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                qf0Var.c();
                if (!z12) {
                    qf0Var.n(bg0Var.P, 0, false, false);
                }
                if (z13) {
                    TLRPC.Message message2 = messageObject.k;
                    message2.effect = j10;
                    if (j10 == j3) {
                        message2.flags2 &= -5;
                    }
                }
                rf0 rf0Var = bg0Var.W;
                if (rf0Var != null) {
                    rf0Var.setEffect(messageObject.k.effect);
                }
                bg0Var.l(messageObject.k.effect);
            } else if (bg0Var.k0 != null) {
                long j13 = o0Var2.c;
                if (j13 == bg0Var.H) {
                    bg0Var.H = 0L;
                    z11 = true;
                } else {
                    bg0Var.H = j13;
                    z11 = false;
                }
                rf0 rf0Var2 = bg0Var.W;
                if (rf0Var2 != null) {
                    rf0Var2.setEffect(bg0Var.H);
                }
                bg0Var.l(bg0Var.H);
                if (!z13) {
                    TLRPC.TL_availableEffect Z0 = bg0Var.H == 0 ? null : org.telegram.messenger.qp.s1(i7).Z0(bg0Var.H);
                    org.telegram.ui.Components.g5 g5Var = bg0Var.I;
                    if (g5Var != null) {
                        if (bg0Var.H == 0 || Z0 == null) {
                            g5Var.g(null, true);
                        } else {
                            g5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                        }
                    }
                    bg0Var.d0.setSelectedReactionAnimated(z11 ? null : o0Var2);
                    if (bg0Var.d0.getReactionsWindow() != null && bg0Var.d0.getReactionsWindow().m != null) {
                        ch.w wVar2 = bg0Var.d0.getReactionsWindow().m;
                        if (z11) {
                            o0Var2 = null;
                        }
                        wVar2.setSelectedReaction(o0Var2);
                        bg0Var.d0.getReactionsWindow().a.invalidate();
                    }
                }
                qf0Var.c();
                if (!z11) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = bg0Var.H;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    bg0Var.Z.d(null, 0, null, new org.telegram.messenger.ij(i7, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z13 && (f2Var = this.a) != null) {
                new org.telegram.ui.Components.hc(bg0Var.F, bg0Var.b).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131754253, null), new tf0(i10, f2Var))).j();
            }
            bg0Var.G.invalidate();
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
