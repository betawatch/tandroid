package tg;

import a8.w9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.a && (view instanceof s1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (!(view instanceof n2)) {
            super.measureChildWithMargins(view, i7, i10, i11, i12);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.b;
        j B = cVar.B();
        if (B == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            B.n = false;
            B.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            B.n = false;
            B.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.c || w9.a(x10, y10, this.d, this.e) > org.telegram.messenger.g0.e) {
                this.c = true;
                B.n = true;
                B.e(x10 - this.d, y10 - this.e);
                this.d = x10;
                this.e = y10;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            B.n = false;
            B.r = true;
            if (!this.c) {
                cVar.i();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
