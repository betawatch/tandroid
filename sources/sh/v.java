package sh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.c81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public ObjectAnimator a;
    public c5.e b;
    public c81 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public qg.b r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        c81 c81Var = this.c;
        qg.b bVar = this.r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            c81Var.invalidateOutline();
            c81Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        c81 c81Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c81Var, (Property<c81, Float>) FrameLayout.TRANSLATION_Y, c81Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new qh.i2(this, 8));
        this.a.setDuration(150L);
        this.a.setInterpolator(pr.f);
        this.a.start();
        z zVar = ((df) this).v.i0;
        if (zVar != null) {
            zVar.setOpened(false);
        }
    }

    public final void d(boolean z4) {
        if (this.f) {
            return;
        }
        c81 c81Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c81Var, (Property<c81, Float>) FrameLayout.TRANSLATION_Y, c81Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(pr.f);
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

    public sl0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c5.e eVar = this.b;
        return eVar.b | eVar.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        c81 c81Var = this.c;
        super.onMeasure(i10, i11);
        if (this.n && !this.f) {
            c81Var.setTranslationY(AndroidUtilities.dp(16.0f) + (c81Var.getMeasuredHeight() - c81Var.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c81 c81Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = c81Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        c81Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        c81 c81Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = c81Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            c81Var.setTranslationY(translationY);
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
        boolean z4 = this.f;
        if (z4 || z4) {
            return;
        }
        if (this.c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(qg.b bVar) {
        this.r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.r.o(AndroidUtilities.dp(5.0f));
        c81 c81Var = this.c;
        if (bVar.i == null) {
            bVar.i = new tl(bVar, 6);
        }
        c81Var.setOutlineProvider(bVar.i);
    }
}
