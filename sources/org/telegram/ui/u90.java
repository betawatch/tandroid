package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u90 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final /* synthetic */ w90 D;
    public final org.telegram.ui.Components.n9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.a2 c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 e;
    public final TextView f;
    public final org.telegram.ui.Components.mm0 h;
    public final org.telegram.ui.Components.tt0 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(w90 w90Var, Context context) {
        super(context);
        this.D = w90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z9 = true;
        char c10 = 1;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        textView.setText(org.telegram.messenger.id.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        boolean z10 = false;
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, z9, z10, z10);
        a2Var.w = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
        this.c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i7, null);
        linearLayout.addView(a2Var, c8.ha.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null, true);
        this.h = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setDelegate(new f(this, 20));
        mm0Var.setProgress(org.telegram.messenger.sc.c() / 100.0f);
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.id.M0(2131748875, null));
        frameLayout.addView(textView2, c8.ha.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.xq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var2, org.telegram.ui.ActionBar.k6.n6, null);
        frameLayout.addView(a2Var2, c8.ha.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9();
        this.a = n9Var;
        n9Var.a = a2Var2.getPaint();
        n9Var.f = org.telegram.messenger.g0.L(1.5f);
        n9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(n9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.id.M0(2131748874, null));
        frameLayout.addView(textView3, c8.ha.e(-2, -2, 21));
        addView(frameLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new org.telegram.ui.Components.tt0(c10 == true ? 1 : 0, this);
        a();
    }

    public final void a() {
        int c10 = org.telegram.messenger.sc.c();
        org.telegram.ui.Cells.a2 a2Var = this.e;
        a2Var.a();
        final int i7 = 0;
        final int i10 = 1;
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.id.M0(2131748877, null), !org.telegram.messenger.id.a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.id.M0(2131748876, null), !org.telegram.messenger.id.a0, true);
        } else {
            float f10 = c10;
            this.a.a(true, f10 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131748868, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.b), "%s"), !org.telegram.messenger.id.a0, true);
        }
        String upperCase = org.telegram.messenger.id.M0(org.telegram.messenger.sc.f() ? 2131748874 : 2131748875, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.c;
        a2Var2.setText(upperCase);
        boolean z9 = c10 > 0 && c10 < 100;
        if (z9 != this.r) {
            this.r = z9;
            a2Var2.clearAnimation();
            org.telegram.messenger.camera.q.l(a2Var2.animate().alpha(z9 ? 1.0f : 0.0f), org.telegram.ui.Components.xq.h, 220L);
        }
        float f11 = c10 >= 100 ? 1.0f : 0.0f;
        if (this.s != f11) {
            this.s = f11;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f11);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s90
                public final /* synthetic */ u90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i7) {
                        case 0:
                            u90 u90Var = this.b;
                            TextView textView = u90Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            u90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            u90 u90Var2 = this.b;
                            TextView textView2 = u90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            u90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.w.addListener(new t90(this, f11, 0));
            this.w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.w.setDuration(320L);
            this.w.start();
        }
        float f12 = c10 <= 0 ? 1.0f : 0.0f;
        if (this.x != f12) {
            this.x = f12;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x, f12);
            this.y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s90
                public final /* synthetic */ u90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            u90 u90Var = this.b;
                            TextView textView = u90Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            u90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            u90 u90Var2 = this.b;
                            TextView textView2 = u90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            u90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.y.addListener(new t90(this, f12, 1));
            this.y.setInterpolator(org.telegram.ui.Components.xq.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i7, bundle);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.s, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.x, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}
