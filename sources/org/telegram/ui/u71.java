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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u71 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.z8 b;
    public final org.telegram.ui.Components.o9 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 n;

    public u71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        this.n = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        h5Var.addOnAttachStateChangeListener(new e5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, b6Var), PorterDuff.Mode.SRC_IN));
        if (!LocaleController.isRTL) {
            h5Var.setGravity(19);
            addView(o9Var, g7.e6.t(28, 28, 19, 18, 0, 18, 0));
            addView(h5Var, g7.e6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
            addView(textView, g7.e6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, g7.e6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        h5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, g7.e6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, g7.e6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(h5Var, g7.e6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
        addView(o9Var, g7.e6.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, b6Var), PorterDuff.Mode.SRC_IN));
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i9) {
        Long emojiStatusDocumentId;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        org.telegram.ui.Components.z8 z8Var = this.b;
        z8Var.m(i9, currentUser);
        org.telegram.ui.Components.o9 o9Var = this.c;
        o9Var.getImageReceiver().setCurrentAccount(i9);
        o9Var.e(currentUser, z8Var);
        String userName = UserObject.getUserName(currentUser);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(userName, false);
        Integer valueOf = Integer.valueOf(i9);
        org.telegram.ui.Components.i5 i5Var = this.h;
        i5Var.x = valueOf;
        Integer valueOf2 = Integer.valueOf(i9);
        org.telegram.ui.Components.i5 i5Var2 = this.n;
        i5Var2.x = valueOf2;
        int i10 = org.telegram.ui.ActionBar.f6.zh;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        if (currentUser != null) {
            long j10 = currentUser.bot_verification_icon;
            if (j10 != 0) {
                i5Var.j(j10, false);
                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
                i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
                if (emojiStatusDocumentId == null) {
                    i5Var2.j(emojiStatusDocumentId.longValue(), false);
                } else if (currentUser == null || !currentUser.premium) {
                    i5Var2.g(null, false);
                } else {
                    i5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (i5Var.d()) {
                    i5Var = null;
                }
                h5Var.setLeftDrawable(i5Var);
                if (i5Var2.d()) {
                    i5Var2 = null;
                }
                h5Var.i(i5Var2);
                int mainUnreadCount = MessagesStorage.getInstance(i9).getMainUnreadCount();
                int i11 = mainUnreadCount <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i11);
                textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
            }
        }
        i5Var.g(null, false);
        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        if (emojiStatusDocumentId == null) {
        }
        if (i5Var.d()) {
        }
        h5Var.setLeftDrawable(i5Var);
        if (i5Var2.d()) {
        }
        h5Var.i(i5Var2);
        int mainUnreadCount2 = MessagesStorage.getInstance(i9).getMainUnreadCount();
        if (mainUnreadCount2 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i11);
        textView2.setText(LocaleController.formatNumber(mainUnreadCount2, ','));
    }
}
