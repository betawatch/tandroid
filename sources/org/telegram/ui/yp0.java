package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class yp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.e6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.j9 e;
    public final ml f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean n;
    public final org.telegram.ui.Components.q5 r;
    public final org.telegram.ui.Components.q5 s;
    public final org.telegram.ui.Components.q5 v;
    public final ai.fa w;
    public final org.telegram.ui.Components.g6 x;
    public MessagesController.PeerColor y;

    public yp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        CharSequence userName;
        long botVerificationIcon;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.e = j9Var;
        this.v = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.w = new ai.fa(this);
        this.x = new org.telegram.ui.Components.g6(this, 320L, org.telegram.ui.Components.hs.h);
        this.E = new RectF();
        this.b = i10;
        this.a = e6Var;
        long j10 = 0;
        boolean z10 = j3 < 0;
        this.c = z10;
        ml mlVar = new ml(this, context, 2);
        this.f = mlVar;
        this.r = new org.telegram.ui.Components.q5(AndroidUtilities.dp(17.0f), mlVar);
        this.s = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), mlVar);
        mlVar.setLeftDrawableOutside(true);
        mlVar.setRightDrawableOutside(true);
        mlVar.setTextColor(-1);
        mlVar.setTextSize(20);
        mlVar.setTypeface(AndroidUtilities.bold());
        mlVar.setWidthWrapContent(true);
        addView(mlVar, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.33f, -2, 81));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 20.66f, -2, 81));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            userName = chat == null ? "" : chat.title;
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            j9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, j9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f.l(userName, false);
        this.r.j(botVerificationIcon, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j10, false);
        this.f.i(this.s);
        if (this.c) {
            long j11 = -j3;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull == null || chatFull.participants_count <= 0) {
                if (chat2 == null || chat2.participants_count <= 0) {
                    boolean isPublic = ChatObject.isPublic(chat2);
                    if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.h.l(LocaleController.getString(isPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase(), false);
                    } else {
                        this.h.l(LocaleController.getString(isPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase(), false);
                    }
                } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                }
            } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                this.h.l(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
            } else {
                this.h.l(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
            if (color != null) {
                int color1 = color.getColor1();
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.j9.f(color1)], e6Var);
                w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.j9.f(color1)], e6Var);
            } else {
                long j3 = i10;
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.j9.e(j3)], e6Var);
                w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.j9.e(j3)], e6Var);
            }
        } else {
            long j10 = i10;
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.j9.e(j10)], e6Var);
            w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.j9.e(j10)], e6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.b).profilePeerColors;
        c(peerColors == null ? null : peerColors.getColor(i10), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.y = peerColor;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        ml mlVar = this.f;
        org.telegram.ui.Components.q5 q5Var = this.r;
        org.telegram.ui.Components.q5 q5Var2 = this.s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.q5 q5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                q5Var3.k(Integer.valueOf(i10));
            } else {
                q5Var3.k(Integer.valueOf(aq0.w0(peerColor.getBgColor1(a2))));
            }
            q5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), -1)));
            q5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(a2), peerColor.getStoryColor2(a2));
            int i11 = org.telegram.ui.ActionBar.i6.s8;
            if (org.telegram.ui.ActionBar.i6.c1(org.telegram.ui.ActionBar.i6.w0(i11, e6Var))) {
                j5Var.setTextColor(org.telegram.ui.ActionBar.i6.C(a2, org.telegram.ui.ActionBar.i6.w0(i11, e6Var), d, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h8, e6Var), d));
            } else {
                j5Var.setTextColor(d);
            }
            mlVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i12, e6Var)) > 0.8f) {
                q5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n6, e6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i12, e6Var)) < 0.2f) {
                q5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var))));
            } else {
                q5Var3.k(Integer.valueOf(aq0.w0(org.telegram.ui.ActionBar.i6.w0(i12, e6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.i6.zh;
            q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B8, e6Var));
            mlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        }
        this.w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.q5 q5Var = this.v;
        if (j3 == 0) {
            q5Var.g(null, z11);
        } else {
            q5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        MessagesController.PeerColor peerColor2 = this.y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                q5Var.k(Integer.valueOf(i11));
            } else {
                q5Var.k(Integer.valueOf(aq0.w0(peerColor2.getBgColor1(a2))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i12, e6Var)) > 0.8f) {
                q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n6, e6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i12, e6Var)) < 0.2f) {
                q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A8, false))));
            } else {
                q5Var.k(Integer.valueOf(aq0.w0(org.telegram.ui.ActionBar.i6.x0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.y;
        org.telegram.ui.Components.q5 q5Var2 = this.s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, e6Var);
            if (this.y.hasColor6(a2)) {
                peerColor = this.y;
                i10 = 4;
            } else {
                peerColor = this.y;
                i10 = 2;
            }
            q5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, e6Var))));
        } else {
            q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
        }
        if (!z11) {
            this.x.a(z10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - AndroidUtilities.dp(82.0f);
        RectF rectF = this.E;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + getWidth()) / 2.0f, height);
        yh.i0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int dp = AndroidUtilities.dp(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        float dp2 = AndroidUtilities.dp(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, dp2, dp2, this.w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.q5 q5Var = this.s;
        q5Var.j(j3, z11);
        q5Var.m(z10, z11);
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        MessagesController.PeerColor peerColor = this.y;
        if (peerColor != null) {
            q5Var.k(Integer.valueOf(i0.a.d(0.5f, peerColor.getColor2(a2), this.y.hasColor6(a2) ? this.y.getColor5(a2) : this.y.getColor3(a2))));
        } else {
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.a();
        this.d.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.b();
        this.d.onDetachedFromWindow();
    }

    public void setForum(boolean z10) {
        if (this.n != z10) {
            invalidate();
        }
        this.n = z10;
    }
}
