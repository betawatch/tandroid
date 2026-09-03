package rh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.d81;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public ObjectAnimator a;
    public c5.e b;
    public d81 c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public pg.b r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        d81 d81Var = this.c;
        pg.b bVar = this.r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            d81Var.invalidateOutline();
            d81Var.invalidate();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        d81 d81Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d81Var, (Property<d81, Float>) FrameLayout.TRANSLATION_Y, d81Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.a = ofFloat;
        ofFloat.addListener(new ph.j2(this, 8));
        this.a.setDuration(150L);
        this.a.setInterpolator(mr.f);
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
        d81 d81Var = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d81Var, (Property<d81, Float>) FrameLayout.TRANSLATION_Y, d81Var.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(mr.f);
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

    public rl0 getListView() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c5.e eVar = this.b;
        return eVar.b | eVar.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        d81 d81Var = this.c;
        super.onMeasure(i10, i11);
        if (this.n && !this.f) {
            d81Var.setTranslationY(AndroidUtilities.dp(16.0f) + (d81Var.getMeasuredHeight() - d81Var.getPaddingTop()));
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
        d81 d81Var = this.c;
        if (this.f) {
            return;
        }
        a();
        float translationY = d81Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        d81Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d81 d81Var = this.c;
        if (this.f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = d81Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            d81Var.setTranslationY(translationY);
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

    public void setBackgroundDrawable(pg.b bVar) {
        this.r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.r.o(AndroidUtilities.dp(5.0f));
        d81 d81Var = this.c;
        if (bVar.i == null) {
            bVar.i = new rl(bVar, 6);
        }
        d81Var.setOutlineProvider(bVar.i);
    }
}
