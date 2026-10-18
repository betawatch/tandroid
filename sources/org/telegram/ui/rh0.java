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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.uc0 n;
    public static final org.telegram.ui.Components.uc0 r;
    public final int a;
    public final org.telegram.ui.Components.w9 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final TextView d;
    public final org.telegram.ui.Components.h9 e;
    public final org.telegram.ui.Components.ex0 f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.h6.y6;
        n = new org.telegram.ui.Components.uc0(i10, i11);
        r = new org.telegram.ui.Components.uc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public rh0(Context context) {
        super(context);
        this.a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f = new org.telegram.ui.Components.ex0(this);
        j5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.z5.a(34.0f, 0.0f, 0.0f, 10.0f, 0.0f, 34, 21));
            addView(j5Var, w7.z5.a(-2.0f, 8.0f, 5.33f, 55.0f, 0.0f, -2, 53));
            addView(textView, w7.z5.a(-2.0f, 13.0f, 19.0f, 55.0f, 0.0f, -2, 53));
        } else {
            addView(w9Var, w7.z5.a(34.0f, 10.0f, 0.0f, 0.0f, 0.0f, 34, 19));
            addView(j5Var, w7.z5.a(-2.0f, 55.0f, 5.33f, 8.0f, 0.0f, -2, 51));
            addView(textView, w7.z5.a(-2.0f, 55.0f, 19.0f, 13.0f, 0.0f, -2, 51));
        }
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        this.h = tLObject;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.ex0 ex0Var = this.f;
        org.telegram.ui.Components.p5 a2 = z11 ? ex0Var.a((TLRPC.User) tLObject, null, x02, false) : tLObject instanceof TLRPC.Chat ? ex0Var.a(null, (TLRPC.Chat) tLObject, x02, false) : ex0Var.a(null, null, x02, false);
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        j5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.h9 h9Var = this.e;
            int i11 = this.a;
            h9Var.j(i11, tLObject);
            this.b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", h9Var, tLObject);
            j5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(AndroidUtilities.dp(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? r : n).a(getContext(), null), LocaleController.formatSeenDate(i10)));
            textView.setVisibility(0);
            j5Var.setTranslationY(0.0f);
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
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z9, false);
            boolean z10 = user instanceof TLRPC.User;
            org.telegram.ui.Components.ex0 ex0Var = this.f;
            this.c.i(z10 ? ex0Var.a(user, null, x02, true) : ex0Var.a(null, null, x02, true));
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
            StringBuilder i10 = r4.c.i(formatString, " ");
            i10.append((Object) textView.getText());
            formatString = i10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
