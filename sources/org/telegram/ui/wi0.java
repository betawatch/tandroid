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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wi0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ gj0 b;

    public wi0(gj0 gj0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = gj0Var;
        this.a = m2Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z13;
        long j10;
        ah.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            gj0 gj0Var = this.b;
            ui0 ui0Var = gj0Var.e0;
            si0 si0Var = gj0Var.a0;
            int i10 = gj0Var.c;
            if (ui0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && i1Var2.d;
            org.telegram.ui.Cells.u1 u1Var = gj0Var.Q;
            if (u1Var != null) {
                MessageObject messageObject = u1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.effect;
                long j12 = i1Var2.c;
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
                    j10 = j11;
                } else {
                    j10 = j11;
                    gj0Var.Q.X3(messageObject, gj0Var.l(messageObject), gj0Var.N.size() > 1, false, false, false);
                    gj0Var.e0.setSelectedReactionAnimated(z13 ? null : i1Var2);
                    if (gj0Var.e0.getReactionsWindow() != null && gj0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var = gj0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            i1Var2 = null;
                        }
                        n0Var.setSelectedReaction(i1Var2);
                        gj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                si0Var.c();
                if (!z13) {
                    si0Var.n(gj0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ti0 ti0Var = gj0Var.X;
                if (ti0Var != null) {
                    ti0Var.setEffect(messageObject.messageOwner.effect);
                }
                gj0Var.m(messageObject.messageOwner.effect);
            } else if (gj0Var.l0 != null) {
                long j13 = i1Var2.c;
                if (j13 == gj0Var.I) {
                    gj0Var.I = 0L;
                    z12 = true;
                } else {
                    gj0Var.I = j13;
                    z12 = false;
                }
                ti0 ti0Var2 = gj0Var.X;
                if (ti0Var2 != null) {
                    ti0Var2.setEffect(gj0Var.I);
                }
                gj0Var.m(gj0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = gj0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(gj0Var.I);
                    org.telegram.ui.Components.q5 q5Var = gj0Var.J;
                    if (q5Var != null) {
                        if (gj0Var.I == 0 || effect == null) {
                            q5Var.g(null, true);
                        } else {
                            q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    gj0Var.e0.setSelectedReactionAnimated(z12 ? null : i1Var2);
                    if (gj0Var.e0.getReactionsWindow() != null && gj0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var2 = gj0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            i1Var2 = null;
                        }
                        n0Var2.setSelectedReaction(i1Var2);
                        gj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                si0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = gj0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    gj0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (m2Var = this.a) != null) {
                new org.telegram.ui.Components.zc(gj0Var.G, gj0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new vi0(0, m2Var))).j();
            }
            gj0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
