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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class za0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ bb0 D;
    public final org.telegram.ui.Components.i9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.a2 c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 e;
    public final TextView f;
    public final org.telegram.ui.Components.nn0 h;
    public final org.telegram.ui.Components.wu0 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(bb0 bb0Var, Context context) {
        super(context);
        this.D = bb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        char c10 = 1;
        sc.e.t(textView, 1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.L6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView.setText(org.telegram.messenger.cd.M0("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.b6.r(-2, -2, 16));
        boolean z11 = false;
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, z10, z11, z11);
        a2Var.w = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        this.c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.i0.o());
        a2Var.setPadding(org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var, i10, null);
        linearLayout.addView(a2Var, w7.b6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(context, null, true);
        this.h = nn0Var;
        nn0Var.setReportChanges(true);
        nn0Var.setDelegate(new e(this, 20));
        nn0Var.setProgress(org.telegram.messenger.sc.c() / 100.0f);
        nn0Var.setImportantForAccessibility(2);
        addView(nn0Var, w7.b6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.cd.L0(2131748884, null));
        frameLayout.addView(textView2, w7.b6.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.gr.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var2, org.telegram.ui.ActionBar.t6.n6, null);
        frameLayout.addView(a2Var2, w7.b6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9();
        this.a = i9Var;
        i9Var.a = a2Var2.getPaint();
        i9Var.f = org.telegram.messenger.i0.L(1.5f);
        i9Var.setBounds(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(-20.0f), org.telegram.messenger.i0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(i9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.cd.L0(2131748883, null));
        frameLayout.addView(textView3, w7.b6.e(-2, -2, 21));
        addView(frameLayout, w7.b6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new org.telegram.ui.Components.wu0(c10 == true ? 1 : 0, this);
        a();
    }

    public final void a() {
        int c10 = org.telegram.messenger.sc.c();
        org.telegram.ui.Cells.a2 a2Var = this.e;
        a2Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.cd.L0(2131748886, null), !org.telegram.messenger.cd.X, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.cd.L0(2131748885, null), !org.telegram.messenger.cd.X, true);
        } else {
            float f7 = c10;
            this.a.a(true, f7 / 100.0f);
            a2Var.c(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131748877, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f7))), this.b), "%s"), !org.telegram.messenger.cd.X, true);
        }
        String upperCase = org.telegram.messenger.cd.L0(org.telegram.messenger.sc.f() ? 2131748883 : 2131748884, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.c;
        a2Var2.setText(upperCase);
        boolean z10 = c10 > 0 && c10 < 100;
        if (z10 != this.r) {
            this.r = z10;
            a2Var2.clearAnimation();
            org.telegram.messenger.z20.m(a2Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.gr.h, 220L);
        }
        float f10 = c10 >= 100 ? 1.0f : 0.0f;
        if (this.s != f10) {
            this.s = f10;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f10);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xa0
                public final /* synthetic */ za0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            za0 za0Var = this.b;
                            TextView textView = za0Var.f;
                            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            za0Var.s = floatValue;
                            textView.setTextColor(i0.b.f(floatValue, x02, x03));
                            break;
                        default:
                            za0 za0Var2 = this.b;
                            TextView textView2 = za0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            za0Var2.x = floatValue2;
                            textView2.setTextColor(i0.b.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.w.addListener(new ya0(this, f10, 0));
            this.w.setInterpolator(org.telegram.ui.Components.gr.h);
            this.w.setDuration(320L);
            this.w.start();
        }
        float f11 = c10 <= 0 ? 1.0f : 0.0f;
        if (this.x != f11) {
            this.x = f11;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x, f11);
            this.y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.xa0
                public final /* synthetic */ za0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            za0 za0Var = this.b;
                            TextView textView = za0Var.f;
                            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            za0Var.s = floatValue;
                            textView.setTextColor(i0.b.f(floatValue, x02, x03));
                            break;
                        default:
                            za0 za0Var2 = this.b;
                            TextView textView2 = za0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            za0Var2.x = floatValue2;
                            textView2.setTextColor(i0.b.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.y.addListener(new ya0(this, f11, 1));
            this.y.setInterpolator(org.telegram.ui.Components.gr.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i10, bundle);
    }

    @Override // org.telegram.ui.ActionBar.k6
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
                textView.setTextColor(i0.b.f(this.s, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.b.f(this.x, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}
