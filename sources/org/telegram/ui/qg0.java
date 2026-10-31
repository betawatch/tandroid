package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qg0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public static final org.telegram.ui.Components.hb0 n;
    public static final org.telegram.ui.Components.hb0 r;
    public final int a;
    public final org.telegram.ui.Components.g9 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final TextView d;
    public final org.telegram.ui.Components.r8 e;
    public final org.telegram.ui.Components.pv0 f;
    public TLObject h;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        n = new org.telegram.ui.Components.hb0(R.drawable.msg_mini_checks, i10);
        r = new org.telegram.ui.Components.hb0(R.drawable.mini_checklist_done_outline, i10);
    }

    public qg0(Context context) {
        super(context);
        this.a = org.telegram.messenger.d20.s0;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(!org.telegram.messenger.cd.X);
        u5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        u5Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        this.f = new org.telegram.ui.Components.pv0(this);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, null);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        if (org.telegram.messenger.cd.X) {
            addView(g9Var, w7.b6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(u5Var, w7.b6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.b6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(g9Var, w7.b6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(u5Var, w7.b6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, w7.b6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i10, boolean z10) {
        this.h = tLObject;
        org.telegram.ui.Components.d5 a2 = this.f.a(tLObject, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z9, false), false);
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        u5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.r8 r8Var = this.e;
            r8Var.p(tLObject);
            this.b.j(org.telegram.messenger.ic.m(this.a, 1, tLObject), "50_50", r8Var, tLObject);
            u5Var.l(org.telegram.messenger.i5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            u5Var.setTranslationY(org.telegram.messenger.i0.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? r : n).a(getContext(), null), org.telegram.messenger.cd.O(i10)));
            textView.setVisibility(0);
            u5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.m5) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            this.c.i(this.f.a(user, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z9, false), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.m5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.m5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.cd.a0("AccDescrPersonHasSeen", null, 2131754812, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder i10 = sc.e.i(a02, " ");
            i10.append((Object) textView.getText());
            a02 = i10.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.pv0 pv0Var = this.f;
        if (pv0Var != null) {
            try {
                org.telegram.ui.Components.d5 d5Var = pv0Var.a;
                if (d5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z9, false);
                    Integer num = d5Var.F;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    d5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.u5 u5Var = this.c;
                    if (u5Var != null) {
                        u5Var.invalidate();
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
