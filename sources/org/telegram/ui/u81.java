package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class u81 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final org.telegram.ui.Components.h9 b;
    public final org.telegram.ui.Components.w9 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.o5 h;
    public final org.telegram.ui.Components.o5 n;

    public u81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = d6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        this.n = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        h5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.m6, d6Var), PorterDuff.Mode.SRC_IN));
        if (!LocaleController.isRTL) {
            h5Var.setGravity(19);
            addView(w9Var, w7.y5.t(28, 28, 19, 18, 0, 18, 0));
            addView(h5Var, w7.y5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
            addView(textView, w7.y5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, w7.y5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        h5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, w7.y5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, w7.y5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(h5Var, w7.y5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
        addView(w9Var, w7.y5.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.m6, d6Var), PorterDuff.Mode.SRC_IN));
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i10) {
        Long emojiStatusDocumentId;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.Components.h9 h9Var = this.b;
        h9Var.m(i10, currentUser);
        org.telegram.ui.Components.w9 w9Var = this.c;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.e(currentUser, h9Var);
        String userName = UserObject.getUserName(currentUser);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(userName, false);
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.Components.o5 o5Var = this.h;
        o5Var.x = valueOf;
        Integer valueOf2 = Integer.valueOf(i10);
        org.telegram.ui.Components.o5 o5Var2 = this.n;
        o5Var2.x = valueOf2;
        int i11 = org.telegram.ui.ActionBar.h6.zh;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        if (currentUser != null) {
            long j3 = currentUser.bot_verification_icon;
            if (j3 != 0) {
                o5Var.j(j3, false);
                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
                o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
                if (emojiStatusDocumentId == null) {
                    o5Var2.j(emojiStatusDocumentId.longValue(), false);
                } else if (currentUser == null || !currentUser.premium) {
                    o5Var2.g(null, false);
                } else {
                    o5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (o5Var.d()) {
                    o5Var = null;
                }
                h5Var.setLeftDrawable(o5Var);
                if (o5Var2.d()) {
                    o5Var2 = null;
                }
                h5Var.i(o5Var2);
                int mainUnreadCount = MessagesStorage.getInstance(i10).getMainUnreadCount();
                int i12 = mainUnreadCount <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
            }
        }
        o5Var.g(null, false);
        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        if (emojiStatusDocumentId == null) {
        }
        if (o5Var.d()) {
        }
        h5Var.setLeftDrawable(o5Var);
        if (o5Var2.d()) {
        }
        h5Var.i(o5Var2);
        int mainUnreadCount2 = MessagesStorage.getInstance(i10).getMainUnreadCount();
        if (mainUnreadCount2 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(LocaleController.formatNumber(mainUnreadCount2, ','));
    }
}
