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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class x71 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.h9 b;
    public final org.telegram.ui.Components.w9 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.p5 h;
    public final org.telegram.ui.Components.p5 n;
    public int r;

    public x71(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        this.h = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 7, n5Var, false);
        this.n = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 7, n5Var, false);
        n5Var.addOnAttachStateChangeListener(new j5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        int dp = AndroidUtilities.dp(10.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView, c02, O, null, g6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, g6Var, PorterDuff.Mode.SRC_IN);
        if (!LocaleController.isRTL) {
            n5Var.setGravity(19);
            addView(w9Var, w7.z5.t(28, 28, 19, 18, 0, 18, 0));
            addView(n5Var, w7.z5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
            addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, w7.z5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        n5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, w7.z5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(n5Var, w7.z5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
        addView(w9Var, w7.z5.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zh));
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
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(userName, false);
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.Components.p5 p5Var = this.h;
        p5Var.x = valueOf;
        Integer valueOf2 = Integer.valueOf(i10);
        org.telegram.ui.Components.p5 p5Var2 = this.n;
        p5Var2.x = valueOf2;
        int i11 = org.telegram.ui.ActionBar.k6.zh;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        if (currentUser != null) {
            long j10 = currentUser.bot_verification_icon;
            if (j10 != 0) {
                p5Var.j(j10, false);
                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
                p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
                if (emojiStatusDocumentId == null) {
                    p5Var2.j(emojiStatusDocumentId.longValue(), false);
                } else if (currentUser == null || !currentUser.premium) {
                    p5Var2.g(null, false);
                } else {
                    p5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (p5Var.d()) {
                    p5Var = null;
                }
                n5Var.setLeftDrawable(p5Var);
                if (p5Var2.d()) {
                    p5Var2 = null;
                }
                n5Var.i(p5Var2);
                int mainUnreadCount = MessagesStorage.getInstance(i10).getMainUnreadCount();
                int i12 = mainUnreadCount <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
            }
        }
        p5Var.g(null, false);
        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        if (emojiStatusDocumentId == null) {
        }
        if (p5Var.d()) {
        }
        n5Var.setLeftDrawable(p5Var);
        if (p5Var2.d()) {
        }
        n5Var.i(p5Var2);
        int mainUnreadCount2 = MessagesStorage.getInstance(i10).getMainUnreadCount();
        if (mainUnreadCount2 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(LocaleController.formatNumber(mainUnreadCount2, ','));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m6, g6Var);
        int i11 = this.r;
        ImageView imageView = this.f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.k6.zh;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
        try {
            org.telegram.ui.Components.p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
                if (n5Var != null) {
                    n5Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
