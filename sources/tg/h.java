package tg;

import a8.x9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class h extends FrameLayout {
    public boolean a;
    public final g b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public h(Context context, g gVar) {
        super(context);
        this.b = gVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.a && (view instanceof v1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (!(view instanceof q2)) {
            super.measureChildWithMargins(view, i7, i10, i11, i12);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g gVar = this.b;
        n o4 = gVar.o();
        if (o4 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            o4.n = false;
            o4.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            o4.n = false;
            o4.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.c || x9.a(x10, y10, this.d, this.e) > org.telegram.messenger.g0.e) {
                this.c = true;
                o4.n = true;
                o4.e(x10 - this.d, y10 - this.e);
                this.d = x10;
                this.e = y10;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            o4.n = false;
            o4.r = true;
            if (!this.c) {
                gVar.h();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
