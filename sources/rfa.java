// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rfa extends FrameLayout implements tjb {
    public ofa[] a;
    public k27[] b;
    public int[] c;
    public pfa d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (gl.O1()) {
            return (gl.L(490.0f) - (gl.L(2.0f) * (i - 1))) / i;
        }
        return (gl.q.x - (gl.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        ofa ofaVar = this.a[i];
        FrameLayout frameLayout = ofaVar.f;
        wf2 wf2Var = ofaVar.e;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, true);
        AnimatorSet animatorSet = ofaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            ofaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ofaVar.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 0.81f : 1.0f));
        ofaVar.h.setDuration(200L);
        ofaVar.h.addListener(new ng9(ofaVar, (byte) 15));
        ofaVar.h.start();
    }

    public final void c(int i, int i2, k27 k27Var) {
        k27[] k27VarArr = this.b;
        k27VarArr[i] = k27Var;
        this.c[i] = i2;
        ofa[] ofaVarArr = this.a;
        if (k27Var != null) {
            ofaVarArr[i].setVisibility(0);
            ofaVarArr[i].setMessageObject(k27Var);
        } else {
            ofaVarArr[i].clearAnimation();
            ofaVarArr[i].setVisibility(4);
            k27VarArr[i] = null;
        }
    }

    public pfa getDelegate() {
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
        int size = this.r ? (View.MeasureSpec.getSize(i) - (gl.L(2.0f) * (this.e - 1))) / this.e : a(this.e);
        this.h = true;
        for (int i3 = 0; i3 < this.e; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : gl.L(2.0f);
            layoutParams.leftMargin = (gl.L(2.0f) + size) * i3;
            if (i3 != this.e - 1) {
                layoutParams.width = size;
            } else if (gl.O1()) {
                layoutParams.width = gl.L(490.0f) - ((gl.L(2.0f) + size) * (this.e - 1));
            } else {
                layoutParams.width = gl.q.x - ((gl.L(2.0f) + size) * (this.e - 1));
            }
            layoutParams.height = size;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : gl.L(2.0f)) + size, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(pfa pfaVar) {
        this.d = pfaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        ofa[] ofaVarArr = this.a;
        int i2 = 0;
        while (i2 < ofaVarArr.length) {
            ofaVarArr[i2].clearAnimation();
            ofaVarArr[i2].setVisibility(i2 < i ? 0 : 4);
            i2++;
        }
        this.e = i;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.n.setColor(bkb.w0(null, bkb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
