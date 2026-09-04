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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class zp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.f6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.i9 e;
    public final ll f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean n;
    public final org.telegram.ui.Components.o5 r;
    public final org.telegram.ui.Components.o5 s;
    public final org.telegram.ui.Components.o5 v;
    public final bi.l9 w;
    public final org.telegram.ui.Components.e6 x;
    public MessagesController.PeerColor y;

    public zp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        CharSequence userName;
        long botVerificationIcon;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.e = i9Var;
        this.v = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.w = new bi.l9(this);
        this.x = new org.telegram.ui.Components.e6(this, 320L, org.telegram.ui.Components.pr.h);
        this.E = new RectF();
        this.b = i10;
        this.a = f6Var;
        long j10 = 0;
        boolean z10 = j3 < 0;
        this.c = z10;
        ll llVar = new ll(this, context, 2);
        this.f = llVar;
        this.r = new org.telegram.ui.Components.o5(AndroidUtilities.dp(17.0f), llVar);
        this.s = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), llVar);
        llVar.setLeftDrawableOutside(true);
        llVar.setRightDrawableOutside(true);
        llVar.setTextColor(-1);
        llVar.setTextSize(20);
        llVar.setTypeface(AndroidUtilities.bold());
        llVar.setWidthWrapContent(true);
        addView(llVar, w7.x5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, w7.x5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            userName = chat == null ? "" : chat.title;
            i9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, i9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j10 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            i9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, i9Var);
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
        int v02;
        int v03;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
            if (color != null) {
                int color1 = color.getColor1();
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.i9.f(color1)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.i9.f(color1)], f6Var);
            } else {
                long j3 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.i9.e(j3)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.i9.e(j3)], f6Var);
            }
        } else {
            long j10 = i10;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.i9.e(j10)], f6Var);
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.i9.e(j10)], f6Var);
        }
        this.e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.b).profilePeerColors;
        c(peerColors == null ? null : peerColors.getColor(i10), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.y = peerColor;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        ll llVar = this.f;
        org.telegram.ui.Components.o5 o5Var = this.r;
        org.telegram.ui.Components.o5 o5Var2 = this.s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.o5 o5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                o5Var3.k(Integer.valueOf(i10));
            } else {
                o5Var3.k(Integer.valueOf(bq0.w0(peerColor.getBgColor1(a2))));
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            o5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(a2), peerColor.getStoryColor2(a2));
            int i11 = org.telegram.ui.ActionBar.j6.s8;
            if (org.telegram.ui.ActionBar.j6.b1(org.telegram.ui.ActionBar.j6.v0(i11, f6Var))) {
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.C(a2, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), d, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, f6Var), d));
            } else {
                j5Var.setTextColor(d);
            }
            llVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                o5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var))));
            } else {
                o5Var3.k(Integer.valueOf(bq0.w0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.j6.zh;
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
            llVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        }
        this.w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.v;
        if (j3 == 0) {
            o5Var.g(null, z11);
        } else {
            o5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        MessagesController.PeerColor peerColor2 = this.y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                o5Var.k(Integer.valueOf(i11));
            } else {
                o5Var.k(Integer.valueOf(bq0.w0(peerColor2.getBgColor1(a2))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A8, false))));
            } else {
                o5Var.k(Integer.valueOf(bq0.w0(org.telegram.ui.ActionBar.j6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.y;
        org.telegram.ui.Components.o5 o5Var2 = this.s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, f6Var);
            if (this.y.hasColor6(a2)) {
                peerColor = this.y;
                i10 = 4;
            } else {
                peerColor = this.y;
                i10 = 2;
            }
            o5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, f6Var))));
        } else {
            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
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
        zh.j0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
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
        org.telegram.ui.Components.o5 o5Var = this.s;
        o5Var.j(j3, z11);
        o5Var.m(z10, z11);
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        MessagesController.PeerColor peerColor = this.y;
        if (peerColor != null) {
            o5Var.k(Integer.valueOf(i0.a.d(0.5f, peerColor.getColor2(a2), this.y.hasColor6(a2) ? this.y.getColor5(a2) : this.y.getColor3(a2))));
        } else {
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
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
