package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.cc0 n;
    public static final org.telegram.ui.Components.cc0 r;
    public final int a;
    public final org.telegram.ui.Components.p9 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final TextView d;
    public final org.telegram.ui.Components.z8 e;
    public final org.telegram.ui.Components.lw0 f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        n = new org.telegram.ui.Components.cc0(i10, i11);
        r = new org.telegram.ui.Components.cc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public xh0(Context context) {
        super(context);
        this.a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f = new org.telegram.ui.Components.lw0(this);
        k5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(p9Var, k7.b6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(k5Var, k7.b6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, k7.b6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(p9Var, k7.b6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(k5Var, k7.b6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, k7.b6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, boolean z4, int i10) {
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.lw0 lw0Var = this.f;
        org.telegram.ui.Components.j5 a2 = z10 ? lw0Var.a((TLRPC.User) tLObject, null, w02, false) : tLObject instanceof TLRPC.Chat ? lw0Var.a(null, (TLRPC.Chat) tLObject, w02, false) : lw0Var.a(null, null, w02, false);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        k5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.z8 z8Var = this.e;
            int i11 = this.a;
            z8Var.j(i11, tLObject);
            this.b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", z8Var, tLObject);
            k5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            k5Var.setTranslationY(AndroidUtilities.dp(9.0f));
        } else {
            textView.setText(TextUtils.concat((z4 ? r : n).a(getContext(), null), LocaleController.formatSeenDate(i10)));
            textView.setVisibility(0);
            k5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
            boolean z4 = user instanceof TLRPC.User;
            org.telegram.ui.Components.lw0 lw0Var = this.f;
            this.c.i(z4 ? lw0Var.a(user, null, w02, true) : lw0Var.a(null, null, w02, true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder f10 = vh.w2.f(formatString, " ");
            f10.append((Object) textView.getText());
            formatString = f10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
