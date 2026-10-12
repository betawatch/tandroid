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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xi0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ hj0 b;

    public xi0(hj0 hj0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.b = hj0Var;
        this.a = m2Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z13;
        long j10;
        ah.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            hj0 hj0Var = this.b;
            vi0 vi0Var = hj0Var.e0;
            ti0 ti0Var = hj0Var.a0;
            int i10 = hj0Var.c;
            if (vi0Var == null) {
                return;
            }
            boolean z14 = !UserConfig.getInstance(i10).isPremium() && i1Var2.d;
            org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
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
                    hj0Var.Q.X3(messageObject, hj0Var.l(messageObject), hj0Var.N.size() > 1, false, false, false);
                    hj0Var.e0.setSelectedReactionAnimated(z13 ? null : i1Var2);
                    if (hj0Var.e0.getReactionsWindow() != null && hj0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var = hj0Var.e0.getReactionsWindow().m;
                        if (z13) {
                            i1Var2 = null;
                        }
                        n0Var.setSelectedReaction(i1Var2);
                        hj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ti0Var.c();
                if (!z13) {
                    ti0Var.n(hj0Var.Q, 0, false, false);
                }
                if (z14) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j10;
                    if (j10 == 0) {
                        message2.flags2 &= -5;
                    }
                }
                ui0 ui0Var = hj0Var.X;
                if (ui0Var != null) {
                    ui0Var.setEffect(messageObject.messageOwner.effect);
                }
                hj0Var.m(messageObject.messageOwner.effect);
            } else if (hj0Var.l0 != null) {
                long j13 = i1Var2.c;
                if (j13 == hj0Var.I) {
                    hj0Var.I = 0L;
                    z12 = true;
                } else {
                    hj0Var.I = j13;
                    z12 = false;
                }
                ui0 ui0Var2 = hj0Var.X;
                if (ui0Var2 != null) {
                    ui0Var2.setEffect(hj0Var.I);
                }
                hj0Var.m(hj0Var.I);
                if (!z14) {
                    TLRPC.TL_availableEffect effect = hj0Var.I == 0 ? null : MessagesController.getInstance(i10).getEffect(hj0Var.I);
                    org.telegram.ui.Components.q5 q5Var = hj0Var.J;
                    if (q5Var != null) {
                        if (hj0Var.I == 0 || effect == null) {
                            q5Var.g(null, true);
                        } else {
                            q5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    hj0Var.e0.setSelectedReactionAnimated(z12 ? null : i1Var2);
                    if (hj0Var.e0.getReactionsWindow() != null && hj0Var.e0.getReactionsWindow().m != null) {
                        ah.n0 n0Var2 = hj0Var.e0.getReactionsWindow().m;
                        if (z12) {
                            i1Var2 = null;
                        }
                        n0Var2.setSelectedReaction(i1Var2);
                        hj0Var.e0.getReactionsWindow().a.invalidate();
                    }
                }
                ti0Var.c();
                if (!z12) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j14 = hj0Var.I;
                    tL_message.effect = j14;
                    if (j14 != 0) {
                        tL_message.flags2 |= 4;
                    }
                    hj0Var.a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z14 && (m2Var = this.a) != null) {
                new org.telegram.ui.Components.zc(hj0Var.G, hj0Var.b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new wi0(0, m2Var))).j();
            }
            hj0Var.H.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
