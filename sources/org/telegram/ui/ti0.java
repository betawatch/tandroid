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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ti0 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ dj0 b;

    public ti0(dj0 dj0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = dj0Var;
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z13;
        long j3;
        zg.o0 o0Var2 = o0Var;
        if (o0Var2 != null) {
            dj0 dj0Var = this.b;
            ri0 ri0Var = dj0Var.e0;
            pi0 pi0Var = dj0Var.a0;
            int i10 = dj0Var.c;
            if (ri0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && o0Var2.d;
            org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
            if (u1Var != null) {
                MessageObject messageObject = u1Var.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.effect;
                long j11 = o0Var2.c;
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
                    dj0Var.Q.X3(messageObject, dj0Var.l(messageObject), dj0Var.N.size() > 1, false, false, false);
                    dj0Var.e0.setSelectedReactionAnimated(z13 ? null : o0Var2);
                    if (dj0Var.e0.getReactionsWindow() != null && dj0Var.e0.getReactionsWindow().m != null) {
                        zg.x xVar = dj0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            o0Var2 = null;
                        }
                        xVar.setSelectedReaction(o0Var2);
                        dj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                pi0Var.c();
                if (!z13) {
                    pi0Var.o(dj0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j3;
                    if (j3 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                qi0 qi0Var = dj0Var.X;
                if (qi0Var != null) {
                    qi0Var.setEffect(messageObject.messageOwner.effect);
                }
                dj0Var.m(messageObject.messageOwner.effect);
            } else if (dj0Var.l0 != null) {
                long j12 = o0Var2.c;
                if (j12 == dj0Var.I) {
                    dj0Var.I = 0L;
                    z12 = true;
                } else {
                    dj0Var.I = j12;
                    z12 = false;
                }
                qi0 qi0Var2 = dj0Var.X;
                if (qi0Var2 != null) {
                    qi0Var2.setEffect(dj0Var.I);
                }
                dj0Var.m(dj0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = dj0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(dj0Var.I);
                    org.telegram.ui.Components.n5 n5Var = dj0Var.J;
                    if (n5Var != null) {
                        if (dj0Var.I == 0 || effect == null) {
                            n5Var.g(null, true);
                        } else {
                            n5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    dj0Var.e0.setSelectedReactionAnimated(z12 ? null : o0Var2);
                    if (dj0Var.e0.getReactionsWindow() != null && dj0Var.e0.getReactionsWindow().m != null) {
                        zg.x xVar2 = dj0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            o0Var2 = null;
                        }
                        xVar2.setSelectedReaction(o0Var2);
                        dj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                pi0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j13 = dj0Var.I;
                    tL_message.effect = j13;
                    if (j13 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    dj0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (n2Var = this.a) != null) {
                new org.telegram.ui.Components.xc(dj0Var.G, dj0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new si0(0, n2Var))).j();
            }
            dj0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
