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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class si0 implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ cj0 b;

    public si0(cj0 cj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = cj0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j3;
        ah.j1 j1Var2 = j1Var;
        if (j1Var2 != null) {
            cj0 cj0Var = this.b;
            qi0 qi0Var = cj0Var.e0;
            oi0 oi0Var = cj0Var.a0;
            int i10 = cj0Var.c;
            if (qi0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && j1Var2.d;
            org.telegram.ui.Cells.t1 t1Var = cj0Var.Q;
            if (t1Var != null) {
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = j1Var2.c;
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
                    cj0Var.Q.X3(messageObject, cj0Var.l(messageObject), cj0Var.N.size() > 1, false, false, false);
                    cj0Var.e0.setSelectedReactionAnimated(z13 ? null : j1Var2);
                    if (cj0Var.e0.getReactionsWindow() != null && cj0Var.e0.getReactionsWindow().m != null) {
                        ah.o0 o0Var = cj0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            j1Var2 = null;
                        }
                        o0Var.setSelectedReaction(j1Var2);
                        cj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                oi0Var.c();
                if (!z13) {
                    oi0Var.o(cj0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                pi0 pi0Var = cj0Var.X;
                if (pi0Var != null) {
                    pi0Var.setEffect(messageObject.messageOwner.effect);
                }
                cj0Var.m(messageObject.messageOwner.effect);
            } else if (cj0Var.l0 != null) {
                long j12 = j1Var2.c;
                if (j12 == cj0Var.I) {
                    cj0Var.I = 0L;
                    z12 = true;
                } else {
                    cj0Var.I = j12;
                    z12 = false;
                }
                pi0 pi0Var2 = cj0Var.X;
                if (pi0Var2 != null) {
                    pi0Var2.setEffect(cj0Var.I);
                }
                cj0Var.m(cj0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = cj0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(cj0Var.I);
                    org.telegram.ui.Components.o5 o5Var = cj0Var.J;
                    if (o5Var != null) {
                        if (cj0Var.I == 0 || effect == null) {
                            o5Var.g(null, true);
                        } else {
                            o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    cj0Var.e0.setSelectedReactionAnimated(z12 ? null : j1Var2);
                    if (cj0Var.e0.getReactionsWindow() != null && cj0Var.e0.getReactionsWindow().m != null) {
                        ah.o0 o0Var2 = cj0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            j1Var2 = null;
                        }
                        o0Var2.setSelectedReaction(j1Var2);
                        cj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                oi0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = cj0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    cj0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.yc(cj0Var.G, cj0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ri0(0, n2Var))).j();
            }
            cj0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
