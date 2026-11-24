// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tha extends FrameLayout implements vlb {
    public pha[] a;
    public k47[] b;
    public int[] c;
    public qha d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (gm.O1()) {
            return (gm.L(490.0f) - (gm.L(2.0f) * (i - 1))) / i;
        }
        return (gm.q.x - (gm.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        pha phaVar = this.a[i];
        FrameLayout frameLayout = phaVar.f;
        jh2 jh2Var = phaVar.e;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, true);
        AnimatorSet animatorSet = phaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            phaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        phaVar.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 0.81f : 1.0f));
        phaVar.h.setDuration(200L);
        phaVar.h.addListener(new c39(phaVar, (byte) 17));
        phaVar.h.start();
    }

    public final void c(int i, int i2, k47 k47Var) {
        k47[] k47VarArr = this.b;
        k47VarArr[i] = k47Var;
        this.c[i] = i2;
        pha[] phaVarArr = this.a;
        if (k47Var != null) {
            phaVarArr[i].setVisibility(0);
            phaVarArr[i].setMessageObject(k47Var);
        } else {
            phaVarArr[i].clearAnimation();
            phaVarArr[i].setVisibility(4);
            k47VarArr[i] = null;
        }
    }

    public qha getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i = 0; i < 6; i++) {
            this.a[i].invalidate();
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View[] viewArr = this.a;
        int size = this.r ? (View.MeasureSpec.getSize(i) - (gm.L(2.0f) * (this.e - 1))) / this.e : a(this.e);
        this.h = true;
        for (int i3 = 0; i3 < this.e; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : gm.L(2.0f);
            layoutParams.leftMargin = (gm.L(2.0f) + size) * i3;
            if (i3 != this.e - 1) {
                layoutParams.width = size;
            } else if (gm.O1()) {
                layoutParams.width = gm.L(490.0f) - ((gm.L(2.0f) + size) * (this.e - 1));
            } else {
                layoutParams.width = gm.q.x - ((gm.L(2.0f) + size) * (this.e - 1));
            }
            layoutParams.height = size;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : gm.L(2.0f)) + size, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(qha qhaVar) {
        this.d = qhaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        pha[] phaVarArr = this.a;
        int i2 = 0;
        while (i2 < phaVarArr.length) {
            phaVarArr[i2].clearAnimation();
            phaVarArr[i2].setVisibility(i2 < i ? 0 : 4);
            i2++;
        }
        this.e = i;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
