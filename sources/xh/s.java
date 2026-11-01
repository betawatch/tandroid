package xh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qe;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.mb0;
import org.telegram.ui.ol;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class s extends FrameLayout {
    public ObjectAnimator a;
    public ac.g b;
    public mb0 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public vg.f r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        mb0 mb0Var = this.c;
        vg.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, ((int) this.h) - org.telegram.messenger.i0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(5.0f) + getMeasuredHeight());
            mb0Var.invalidateOutline();
            mb0Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        mb0 mb0Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb0Var, (Property<mb0, Float>) FrameLayout.TRANSLATION_Y, mb0Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.i0.L(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new sg.r(this, 23));
        this.a.setDuration(150L);
        this.a.setInterpolator(gr.f);
        this.a.start();
        w wVar = ((qe) this).w.l0;
        if (wVar != null) {
            wVar.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        mb0 mb0Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb0Var, (Property<mb0, Float>) FrameLayout.TRANSLATION_Y, mb0Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(gr.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - org.telegram.messenger.i0.L(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public uk0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        mb0 mb0Var = this.c;
        super.onMeasure(i10, i11);
        if (this.n && !this.f) {
            mb0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) + (mb0Var.getMeasuredHeight() - mb0Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mb0 mb0Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = mb0Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f7 = translationY - i11;
        iArr[1] = i11;
        mb0Var.setTranslationY(f7 >= 0.0f ? f7 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mb0 mb0Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = mb0Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            mb0Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.b.a = i10;
        if (this.f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return !this.f && i10 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.b.a = 0;
        boolean z10 = this.f;
        if (z10 || z10) {
            return;
        }
        if (this.c.getTranslationY() > org.telegram.messenger.i0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(vg.f fVar) {
        this.r = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.r.p(org.telegram.messenger.i0.L(5.0f));
        mb0 mb0Var = this.c;
        if (fVar.Q == null) {
            fVar.Q = new ol(fVar, 8);
        }
        mb0Var.setOutlineProvider(fVar.Q);
    }
}
