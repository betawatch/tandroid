package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class th0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public static final org.telegram.ui.Components.wc0 n;
    public static final org.telegram.ui.Components.wc0 r;
    public final int a;
    public final org.telegram.ui.Components.w9 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final TextView d;
    public final org.telegram.ui.Components.h9 e;
    public final org.telegram.ui.Components.jx0 f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        n = new org.telegram.ui.Components.wc0(i10, i11);
        r = new org.telegram.ui.Components.wc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public th0(Context context) {
        super(context);
        this.a = UserConfig.selectedAccount;
        this.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        n5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f = new org.telegram.ui.Components.jx0(this);
        n5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, null);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.z5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(n5Var, w7.z5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.z5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(w9Var, w7.z5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(n5Var, w7.z5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, w7.z5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        this.h = tLObject;
        org.telegram.ui.Components.p5 a2 = this.f.a(tLObject, false, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false));
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        n5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.h9 h9Var = this.e;
            int i11 = this.a;
            h9Var.j(i11, tLObject);
            this.b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", h9Var, tLObject);
            n5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            n5Var.setTranslationY(AndroidUtilities.dp(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? r : n).a(getContext(), null), LocaleController.formatSeenDate(i10)));
            textView.setVisibility(0);
            n5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
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
            this.c.i(this.f.a(user, true, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false)));
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
            StringBuilder i10 = si.o0.i(formatString, " ");
            i10.append((Object) textView.getText());
            formatString = i10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.jx0 jx0Var = this.f;
        if (jx0Var != null) {
            try {
                org.telegram.ui.Components.p5 p5Var = jx0Var.a;
                if (p5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false);
                    Integer num = p5Var.F;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    p5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.n5 n5Var = this.c;
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
