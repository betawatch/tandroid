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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yt0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout a;
    public final dh.g b;
    public final org.telegram.ui.ActionBar.h5[] c;
    public final org.telegram.ui.Components.j6 d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public yt0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        dh.g gVar = new dh.g(activity, 24);
        this.b = gVar;
        gVar.setPivotX(AndroidUtilities.dp(16.0f));
        gVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        gVar.setClipToPadding(false);
        frameLayout.addView(gVar, g7.e6.e(-1, -1, 119));
        this.c = new org.telegram.ui.ActionBar.h5[2];
        for (int i9 = 0; i9 < 2; i9++) {
            this.c[i9] = new org.telegram.ui.ActionBar.h5(activity);
            this.c[i9].setGravity(19);
            this.c[i9].setTextColor(-1);
            this.c[i9].setTextSize(20);
            this.c[i9].setTypeface(AndroidUtilities.bold());
            this.c[i9].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.c[i9].setScrollNonFitText(true);
            this.b.addView(this.c[i9], g7.e6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, true, false, false);
        this.d = j6Var;
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(19);
        j6Var.setTextColor(-1);
        j6Var.setEllipsizeByGradient(true);
        j6Var.setImportantForAccessibility(1);
        j6Var.setAccessibilityLiveRegion(1);
        this.a.addView(j6Var, g7.e6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            int dp = AndroidUtilities.dp((!isEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            dh.g gVar = this.b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<org.telegram.ui.Components.j6, Float>) View.ALPHA, !isEmpty ? 1.0f : 0.0f));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<org.telegram.ui.Components.j6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<dh.g, Float>) property, isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<dh.g, Float>) View.SCALE_X, !isEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<dh.g, Float>) View.SCALE_Y, isEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f.start();
            } else {
                j6Var.setAlpha(!isEmpty ? 1.0f : 0.0f);
                j6Var.setTranslationY(dp);
                gVar.setTranslationY(isEmpty ? 0.0f : AndroidUtilities.dp(-12.0f));
                gVar.setScaleX(!isEmpty ? 0.87f : 1.0f);
                gVar.setScaleY(isEmpty ? 1.0f : 0.87f);
            }
        }
        j6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        j6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.c;
        h5VarArr[0].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        h5VarArr[1].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        this.d.getDrawable().p(AndroidUtilities.dpf2(0.66f), 1.0f, z10 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.c;
        h5VarArr[1].setAlpha(0.0f);
        h5VarArr[1].setVisibility(8);
        CharSequence text = h5VarArr[0].getText();
        if (text != null || charSequence != null) {
            r1 = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!r1) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
            h5Var.N = 0.0f;
            h5Var.b();
        }
        h5VarArr[0].k(charSequence);
        h5VarArr[0].setAlpha(1.0f);
        h5VarArr[0].setTranslationX(0.0f);
        h5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.c;
        CharSequence text = h5VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5Var.getClass();
        h5Var.N = h5Var2.N;
        h5Var.b();
        h5VarArr[1].k(h5VarArr[0].getText());
        h5VarArr[1].setRightPadding((int) this.r);
        org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[0];
        h5Var3.N = 0.0f;
        h5Var3.b();
        h5VarArr[0].k(charSequence);
        float dp = AndroidUtilities.dp(8.0f) * (z11 ? 1 : -1);
        h5VarArr[1].setTranslationX(0.0f);
        h5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            h5VarArr[0].setTranslationX(0.0f);
            h5VarArr[0].setTranslationY(-dp);
        } else {
            h5VarArr[0].setTranslationX(-dp);
            h5VarArr[0].setTranslationY(0.0f);
        }
        h5VarArr[0].setAlpha(0.0f);
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr[0].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(h5Var4, (Property<org.telegram.ui.ActionBar.h5, Float>) (z10 ? property3 : property2), dp));
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[0];
        if (z10) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var5, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new bc0(this, 15));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.gr.h);
        this.e.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.c;
            h5VarArr[0].invalidate();
            h5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.a.layout(0, AndroidUtilities.statusBarHeight, i11 - i9, i12 - i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = AndroidUtilities.statusBarHeight;
        int i12 = this.s;
        int i13 = AndroidUtilities.displaySize.y;
        if (i12 != i13) {
            this.s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - i11, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
