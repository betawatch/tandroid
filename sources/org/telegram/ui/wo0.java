package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wo0 extends View implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.q11 f;
    public final ap0 h;
    public final Paint n;
    public org.telegram.ui.Components.q11 r;
    public int s;
    public boolean v;
    public mp0 w;
    public mp0 x;
    public boolean y;

    public wo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        this.n = new Paint(1);
        this.s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.a = i10;
        boolean z10 = j10 < 0;
        this.b = z10;
        boolean z11 = z10 && !ChatObject.isChannelAndNotMegaGroup(chat);
        this.c = z11;
        this.d = u6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.q6, u6Var, PorterDuff.Mode.SRC_IN);
        String string = LocaleController.getString(z10 ? z11 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2 : R.string.ChangeUserNameColor);
        if (z10 && !z11 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (peerColors != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i11, messagesController.channelBgIconLevelMin);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                int min5 = Math.min(min3, peerColors2.maxLevel());
                int max3 = Math.max(min4, messagesController.profilePeerColors.maxLevel());
                min3 = Math.min(min5, messagesController.profilePeerColors.minLevel());
                min4 = Math.max(max3, messagesController.profilePeerColors.minLevel());
            }
            int min6 = Math.min(min3, messagesController.channelProfileIconLevelMin);
            int max4 = Math.max(min4, messagesController.channelProfileIconLevelMin);
            int min7 = Math.min(min6, messagesController.channelEmojiStatusLevelMin);
            int max5 = Math.max(max4, messagesController.channelEmojiStatusLevelMin);
            int min8 = Math.min(min7, messagesController.channelWallpaperLevelMin);
            int max6 = Math.max(max5, messagesController.channelWallpaperLevelMin);
            int min9 = Math.min(min8, messagesController.channelCustomWallpaperLevelMin);
            int max7 = Math.max(max6, messagesController.channelCustomWallpaperLevelMin);
            int i13 = chat != null ? chat.level : 0;
            if (i13 < max7) {
                this.h = new ap0(Math.max(i13, min9), context, u6Var, true);
            }
        }
        setContentDescription(string);
        this.f = new org.telegram.ui.Components.q11(string, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(64.0f) / 2;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - dp;
        }
        Drawable drawable = this.e;
        ag.v.d(drawable, dp, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        ap0 ap0Var = this.h;
        int dp2 = ap0Var != null ? AndroidUtilities.dp(8.0f) + ap0Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.q11 q11Var = this.f;
        q11Var.p = measuredWidth - dp2;
        float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - q11Var.l()) - AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(71.0f);
        q11Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (ap0Var != null) {
            int l4 = (int) (q11Var.l() + measuredWidth2 + AndroidUtilities.dp(6.0f));
            ap0Var.setBounds(l4, 0, l4, getHeight());
            ap0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        boolean z10 = this.c;
        if (z10 && this.x != null) {
            int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), dp3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
            this.x.draw(canvas);
        } else if (this.w != null && this.x != null) {
            int dp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp4 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), dp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            mp0 mp0Var = this.x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i10 = org.telegram.ui.ActionBar.y6.d6;
            mp0Var.f(dpf2, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            this.x.draw(canvas);
            int dp5 = dp4 - AndroidUtilities.dp(18.0f);
            this.w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.vh.B(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            this.w.draw(canvas);
        } else if (this.r != null && !z10) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - AndroidUtilities.dp(116.0f)) - Math.min(q11Var.l() + (ap0Var == null ? 0 : AndroidUtilities.dp(12.0f) + ap0Var.getIntrinsicWidth()), getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min = (int) Math.min(this.r.l(), measuredWidth3);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : org.telegram.messenger.t.C(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + min : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.n);
            org.telegram.ui.Components.q11 q11Var2 = this.r;
            q11Var2.p = measuredWidth3;
            q11Var2.e(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : org.telegram.messenger.t.C(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            Paint d = u6Var != null ? u6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.y6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        mp0 mp0Var;
        int w02;
        ArrayList<Integer> arrayList;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        String trim = str == null ? "" : str.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.r = new org.telegram.ui.Components.q11(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.y6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        mp0 mp0Var2 = this.w;
        if (mp0Var2 != null) {
            mp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i10 = this.a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i11 = mp0.j;
            int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.w = new mp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                mp0Var = mp0.c(i10, UserObject.getProfileColorId(user));
                mp0Var.a = AndroidUtilities.dp(11.0f);
                mp0Var.d();
            } else {
                mp0Var = null;
            }
            this.w = mp0Var;
        }
        mp0 mp0Var3 = this.w;
        if (mp0Var3 != null) {
            mp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
            int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.o(i13);
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, i13));
            mp0 mp0Var4 = new mp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
            mp0Var4.a = AndroidUtilities.dp(11.0f);
            mp0Var4.d();
            this.x = mp0Var4;
            mp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i14 = org.telegram.ui.ActionBar.y6.r8[colorId];
            this.s = i14;
            w02 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            if (color != null) {
                this.s = -1;
                w02 = color.getColor1();
            } else {
                int i15 = org.telegram.ui.ActionBar.y6.r8[0];
                this.s = i15;
                w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
            }
        }
        this.r.o(w02);
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
        mp0 a10 = mp0.a(i10, colorId);
        a10.a = AndroidUtilities.dp(11.0f);
        a10.d();
        this.x = a10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Paint paint;
        int i10;
        boolean z10 = this.b;
        int i11 = z10 ? org.telegram.ui.ActionBar.y6.m6 : org.telegram.ui.ActionBar.y6.q6;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        if (!this.y || this.E != w02) {
            this.y = true;
            this.E = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        this.f.o(org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.G6 : org.telegram.ui.ActionBar.y6.q6, u6Var));
        if (this.r == null || (paint = this.n) == null || (i10 = this.s) == -1) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.r.o(w03);
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, w03));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
