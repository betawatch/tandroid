package ph;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.cc1;
import org.telegram.ui.i71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public ObjectAnimator a;
    public a5.e b;
    public i71 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public ng.d r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        i71 i71Var = this.c;
        ng.d dVar = this.r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            i71Var.invalidateOutline();
            i71Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        i71 i71Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i71Var, (Property<i71, Float>) FrameLayout.TRANSLATION_Y, i71Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new cc1(this, 7));
        this.a.setDuration(150L);
        this.a.setInterpolator(jr.f);
        this.a.start();
        z zVar = ((gf) this).v.h0;
        if (zVar != null) {
            zVar.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f) {
            return;
        }
        i71 i71Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i71Var, (Property<i71, Float>) FrameLayout.TRANSLATION_Y, i71Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(jr.f);
        }
        this.a.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - AndroidUtilities.dp(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public jl0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        a5.e eVar = this.b;
        return eVar.b | eVar.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        i71 i71Var = this.c;
        super.onMeasure(i10, i11);
        if (this.n && !this.f) {
            i71Var.setTranslationY(AndroidUtilities.dp(16.0f) + (i71Var.getMeasuredHeight() - i71Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        i71 i71Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = i71Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f9 = translationY - i11;
        iArr[1] = i11;
        i71Var.setTranslationY(f9 >= 0.0f ? f9 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        i71 i71Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = i71Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            i71Var.setTranslationY(translationY);
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
        if (this.c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ng.d dVar) {
        this.r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.r.o(AndroidUtilities.dp(5.0f));
        i71 i71Var = this.c;
        if (dVar.i == null) {
            dVar.i = new ng.b(dVar, 0);
        }
        i71Var.setOutlineProvider(dVar.i);
    }
}
