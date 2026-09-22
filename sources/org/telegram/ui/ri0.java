package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ri0 implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ bj0 b;

    public ri0(bj0 bj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = bj0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j3;
        zg.p0 p0Var2 = p0Var;
        if (p0Var2 != null) {
            bj0 bj0Var = this.b;
            pi0 pi0Var = bj0Var.e0;
            ni0 ni0Var = bj0Var.a0;
            int i10 = bj0Var.c;
            if (pi0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && p0Var2.d;
            org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = p0Var2.c;
                if (j11 == j10) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z13 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j11;
                    z13 = false;
                }
                if (z14) {
                    j3 = j10;
                } else {
                    j3 = j10;
                    bj0Var.Q.X3(messageObject, bj0Var.l(messageObject), bj0Var.N.size() > 1, false, false, false);
                    bj0Var.e0.setSelectedReactionAnimated(z13 ? null : p0Var2);
                    if (bj0Var.e0.getReactionsWindow() != null && bj0Var.e0.getReactionsWindow().m != null) {
                        zg.y yVar = bj0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            p0Var2 = null;
                        }
                        yVar.setSelectedReaction(p0Var2);
                        bj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ni0Var.c();
                if (!z13) {
                    ni0Var.o(bj0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                oi0 oi0Var = bj0Var.X;
                if (oi0Var != null) {
                    oi0Var.setEffect(messageObject.messageOwner.effect);
                }
                bj0Var.m(messageObject.messageOwner.effect);
            } else if (bj0Var.l0 != null) {
                long j12 = p0Var2.c;
                if (j12 == bj0Var.I) {
                    bj0Var.I = 0L;
                    z12 = true;
                } else {
                    bj0Var.I = j12;
                    z12 = false;
                }
                oi0 oi0Var2 = bj0Var.X;
                if (oi0Var2 != null) {
                    oi0Var2.setEffect(bj0Var.I);
                }
                bj0Var.m(bj0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = bj0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(bj0Var.I);
                    org.telegram.ui.Components.m5 m5Var = bj0Var.J;
                    if (m5Var != null) {
                        if (bj0Var.I == 0 || effect == null) {
                            m5Var.g(null, true);
                        } else {
                            m5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    bj0Var.e0.setSelectedReactionAnimated(z12 ? null : p0Var2);
                    if (bj0Var.e0.getReactionsWindow() != null && bj0Var.e0.getReactionsWindow().m != null) {
                        zg.y yVar2 = bj0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            p0Var2 = null;
                        }
                        yVar2.setSelectedReaction(p0Var2);
                        bj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ni0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = bj0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    bj0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.vc(bj0Var.G, bj0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new qi0(0, n2Var))).j();
            }
            bj0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
