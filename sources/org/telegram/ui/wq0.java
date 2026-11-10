package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wq0 extends FrameLayout implements org.telegram.messenger.ls {
    public final FrameLayout a;
    public final vq0 b;
    public final org.telegram.ui.ActionBar.m5[] c;
    public final org.telegram.ui.Components.i6 d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public wq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        vq0 vq0Var = new vq0(activity, 0);
        this.b = vq0Var;
        vq0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        vq0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        vq0Var.setClipToPadding(false);
        frameLayout.addView(vq0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        this.c = new org.telegram.ui.ActionBar.m5[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.c[i7] = new org.telegram.ui.ActionBar.m5(activity);
            this.c[i7].setGravity(19);
            this.c[i7].setTextColor(-1);
            this.c[i7].setTextSize(20);
            this.c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.c[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.c[i7].setScrollNonFitText(true);
            this.b.addView(this.c[i7], c8.ha.e(-1, -2, 19));
        }
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(activity, true, false, false);
        this.d = i6Var;
        i6Var.b(0.4f, 320L, org.telegram.ui.Components.wq.h);
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setGravity(19);
        i6Var.setTextColor(-1);
        i6Var.setEllipsizeByGradient(true);
        i6Var.setImportantForAccessibility(1);
        i6Var.setAccessibilityLiveRegion(1);
        this.a.addView(i6Var, c8.ha.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z9) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        boolean z11 = this.h;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z10 != z11) {
            this.h = z10;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.q;
            int L = org.telegram.messenger.g0.L((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            vq0 vq0Var = this.b;
            if (z9) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(i6Var, (Property<org.telegram.ui.Components.i6, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(i6Var, (Property<org.telegram.ui.Components.i6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, (Property<vq0, Float>) property, isEmpty ? 0.0f : org.telegram.messenger.g0.L(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, (Property<vq0, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, (Property<vq0, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(org.telegram.ui.Components.wq.h);
                this.f.start();
            } else {
                i6Var.setAlpha(!isEmpty ? 1.0f : 0.0f);
                i6Var.setTranslationY(L);
                vq0Var.setTranslationY(isEmpty ? 0.0f : org.telegram.messenger.g0.L(-12.0f));
                vq0Var.setScaleX(!isEmpty ? 0.87f : 1.0f);
                vq0Var.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        i6Var.c(charSequence, z9, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        i6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.c;
        m5VarArr[0].getPaint().setShadowLayer(org.telegram.messenger.g0.N(0.66f), 0.0f, 1.0f, z9 ? 1912602624 : 0);
        m5VarArr[1].getPaint().setShadowLayer(org.telegram.messenger.g0.N(0.66f), 0.0f, 1.0f, z9 ? 1912602624 : 0);
        this.d.getDrawable().s(org.telegram.messenger.g0.N(0.66f), 1.0f, z9 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.c;
        m5VarArr[1].setAlpha(0.0f);
        m5VarArr[1].setVisibility(8);
        CharSequence text = m5VarArr[0].getText();
        if (text != null || charSequence != null) {
            r1 = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!r1) {
            org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[0];
            m5Var.R = 0.0f;
            m5Var.b();
        }
        m5VarArr[0].k(charSequence);
        m5VarArr[0].setAlpha(1.0f);
        m5VarArr[0].setTranslationX(0.0f);
        m5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.c;
        CharSequence text = m5VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[1];
        org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[0];
        m5Var.getClass();
        m5Var.R = m5Var2.R;
        m5Var.b();
        m5VarArr[1].k(m5VarArr[0].getText());
        m5VarArr[1].setRightPadding((int) this.r);
        org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr[0];
        m5Var3.R = 0.0f;
        m5Var3.b();
        m5VarArr[0].k(charSequence);
        float L = org.telegram.messenger.g0.L(8.0f) * (z10 ? 1 : -1);
        m5VarArr[1].setTranslationX(0.0f);
        m5VarArr[1].setTranslationY(0.0f);
        if (z9) {
            m5VarArr[0].setTranslationX(0.0f);
            m5VarArr[0].setTranslationY(-L);
        } else {
            m5VarArr[0].setTranslationX(-L);
            m5VarArr[0].setTranslationY(0.0f);
        }
        m5VarArr[0].setAlpha(0.0f);
        m5VarArr[1].setAlpha(1.0f);
        m5VarArr[0].setVisibility(0);
        m5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(m5VarArr[1], (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(m5VarArr[0], (Property<org.telegram.ui.ActionBar.m5, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.m5 m5Var4 = m5VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(m5Var4, (Property<org.telegram.ui.ActionBar.m5, Float>) (z9 ? property3 : property2), L));
        org.telegram.ui.ActionBar.m5 m5Var5 = m5VarArr[0];
        if (z9) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(m5Var5, (Property<org.telegram.ui.ActionBar.m5, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new g30(this, 18));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.wq.h);
        this.e.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.ui.ActionBar.m5[] m5VarArr = this.c;
            m5VarArr[0].invalidate();
            m5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.a.layout(0, org.telegram.messenger.g0.m, i11 - i7, i12 - i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.m;
        int i12 = this.s;
        int i13 = org.telegram.messenger.g0.q.y;
        if (i12 != i13) {
            this.s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i11, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
