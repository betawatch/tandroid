package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final org.telegram.ui.Components.j9 b;
    public final org.telegram.ui.Components.y9 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.r5 h;
    public final org.telegram.ui.Components.r5 n;
    public int r;

    public y71(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = u6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        b6Var.setTextSize(15);
        b6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 7, b6Var, false);
        this.n = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 7, b6Var, false);
        b6Var.addOnAttachStateChangeListener(new i5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        int dp = AndroidUtilities.dp(10.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView, c02, N, null, u6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.m6, u6Var, PorterDuff.Mode.SRC_IN);
        if (!LocaleController.isRTL) {
            b6Var.setGravity(19);
            addView(y9Var, org.telegram.ui.Components.gb1.x(28, 28, 19, 18, 0, 18, 0));
            addView(b6Var, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 119, 0, 0, 18, 0));
            addView(textView, org.telegram.ui.Components.gb1.t(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, org.telegram.ui.Components.gb1.t(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        b6Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, org.telegram.ui.Components.gb1.t(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, org.telegram.ui.Components.gb1.t(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(b6Var, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 119, 18, 0, 0, 0));
        addView(y9Var, org.telegram.ui.Components.gb1.x(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zh));
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
        org.telegram.ui.Components.j9 j9Var = this.b;
        j9Var.m(i10, currentUser);
        org.telegram.ui.Components.y9 y9Var = this.c;
        y9Var.getImageReceiver().setCurrentAccount(i10);
        y9Var.f(currentUser, j9Var);
        String userName = UserObject.getUserName(currentUser);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        b6Var.l(userName, false);
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.Components.r5 r5Var = this.h;
        r5Var.x = valueOf;
        Integer valueOf2 = Integer.valueOf(i10);
        org.telegram.ui.Components.r5 r5Var2 = this.n;
        r5Var2.x = valueOf2;
        int i11 = org.telegram.ui.ActionBar.y6.zh;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        if (currentUser != null) {
            long j10 = currentUser.bot_verification_icon;
            if (j10 != 0) {
                r5Var.j(j10, false);
                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
                r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
                if (emojiStatusDocumentId == null) {
                    r5Var2.j(emojiStatusDocumentId.longValue(), false);
                } else if (currentUser == null || !currentUser.premium) {
                    r5Var2.g(null, false);
                } else {
                    r5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (r5Var.d()) {
                    r5Var = null;
                }
                b6Var.setLeftDrawable(r5Var);
                if (r5Var2.d()) {
                    r5Var2 = null;
                }
                b6Var.i(r5Var2);
                int mainUnreadCount = MessagesStorage.getInstance(i10).getMainUnreadCount();
                int i12 = mainUnreadCount <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
            }
        }
        r5Var.g(null, false);
        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        if (emojiStatusDocumentId == null) {
        }
        if (r5Var.d()) {
        }
        b6Var.setLeftDrawable(r5Var);
        if (r5Var2.d()) {
        }
        b6Var.i(r5Var2);
        int mainUnreadCount2 = MessagesStorage.getInstance(i10).getMainUnreadCount();
        if (mainUnreadCount2 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(LocaleController.formatNumber(mainUnreadCount2, ','));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        b6Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.m6, u6Var);
        int i11 = this.r;
        ImageView imageView = this.f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.y6.zh;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
        try {
            org.telegram.ui.Components.r5 r5Var = this.h;
            if (r5Var != null) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
                if (b6Var != null) {
                    b6Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
