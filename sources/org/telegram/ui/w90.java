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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w90 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ y90 E;
    public final org.telegram.ui.Components.r9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.b2 c;
    public final TextView d;
    public final org.telegram.ui.Cells.b2 e;
    public final TextView f;
    public final org.telegram.ui.Components.an0 h;
    public final org.telegram.ui.Components.eu0 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(y90 y90Var, Context context) {
        super(context);
        this.E = y90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        char c10 = 1;
        i5.c.x(textView, 1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.n6.L6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, null);
        textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        textView.setText(org.telegram.messenger.gd.O0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.na.r(-2, -2, 16));
        boolean z11 = false;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(context, z10, z11, z11);
        b2Var.w = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, i7, false)));
        this.c = b2Var;
        b2Var.setTypeface(org.telegram.messenger.g0.o());
        b2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        b2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var, i7, null);
        linearLayout.addView(b2Var, c8.na.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.na.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context, null, true);
        this.h = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setDelegate(new f(this, 20));
        an0Var.setProgress(org.telegram.messenger.pc.c() / 100.0f);
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.n6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.gd.N0(2131748681, null));
        frameLayout.addView(textView2, c8.na.e(-2, -2, 19));
        org.telegram.ui.Cells.b2 b2Var2 = new org.telegram.ui.Cells.b2(this, context);
        this.e = b2Var2;
        b2Var2.b(0.45f, 240L, org.telegram.ui.Components.kr.h);
        b2Var2.setGravity(1);
        b2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var2, org.telegram.ui.ActionBar.n6.n6, null);
        frameLayout.addView(b2Var2, c8.na.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9();
        this.a = r9Var;
        r9Var.a = b2Var2.getPaint();
        r9Var.f = org.telegram.messenger.g0.L(1.5f);
        r9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(r9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.gd.N0(2131748680, null));
        frameLayout.addView(textView3, c8.na.e(-2, -2, 21));
        addView(frameLayout, c8.na.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new org.telegram.ui.Components.eu0(c10 == true ? 1 : 0, this);
        a();
    }

    public final void a() {
        int c10 = org.telegram.messenger.pc.c();
        org.telegram.ui.Cells.b2 b2Var = this.e;
        b2Var.a();
        final int i7 = 0;
        final int i10 = 1;
        if (c10 <= 0) {
            b2Var.c(org.telegram.messenger.gd.N0(2131748683, null), !org.telegram.messenger.gd.a0, true);
        } else if (c10 >= 100) {
            b2Var.c(org.telegram.messenger.gd.N0(2131748682, null), !org.telegram.messenger.gd.a0, true);
        } else {
            float f10 = c10;
            this.a.a(true, f10 / 100.0f);
            b2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131748674, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.b), "%s"), !org.telegram.messenger.gd.a0, true);
        }
        String upperCase = org.telegram.messenger.gd.N0(org.telegram.messenger.pc.f() ? 2131748680 : 2131748681, null).toUpperCase();
        org.telegram.ui.Cells.b2 b2Var2 = this.c;
        b2Var2.setText(upperCase);
        boolean z10 = c10 > 0 && c10 < 100;
        if (z10 != this.r) {
            this.r = z10;
            b2Var2.clearAnimation();
            org.telegram.messenger.m10.o(b2Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.kr.h, 220L);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.u90
                public final /* synthetic */ w90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i7) {
                        case 0:
                            w90 w90Var = this.b;
                            TextView textView = w90Var.f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            w90 w90Var2 = this.b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.w.addListener(new v90(this, f11, 0));
            this.w.setInterpolator(org.telegram.ui.Components.kr.h);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.u90
                public final /* synthetic */ w90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            w90 w90Var = this.b;
                            TextView textView = w90Var.f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            w90 w90Var2 = this.b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.y.addListener(new v90(this, f12, 1));
            this.y.setInterpolator(org.telegram.ui.Components.kr.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
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

    @Override // org.telegram.ui.ActionBar.c6
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
                textView.setTextColor(i0.a.f(this.s, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.x, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false)));
        }
        org.telegram.ui.Cells.b2 b2Var = this.c;
        if (b2Var != null) {
            b2Var.invalidate();
        }
    }
}
