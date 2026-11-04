package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d extends FrameLayout {
    public boolean a;
    public final c b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public d(Context context, c cVar) {
        super(context);
        this.b = cVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (!(view instanceof l2)) {
            super.measureChildWithMargins(view, i3, i10, i11, i12);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.b;
        j p10 = cVar.p();
        if (p10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            p10.n = false;
            p10.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            p10.n = false;
            p10.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (this.c || a7.h.a(x10, y9, this.d, this.e) > org.telegram.messenger.g0.e) {
                this.c = true;
                p10.n = true;
                p10.e(x10 - this.d, y9 - this.e);
                this.d = x10;
                this.e = y9;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            p10.n = false;
            p10.r = true;
            if (!this.c) {
                cVar.f();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
