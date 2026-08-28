package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        if (this.a && (view instanceof a2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (!(view instanceof v2)) {
            super.measureChildWithMargins(view, i9, i10, i11, i12);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            b10.n = false;
            b10.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            b10.n = false;
            b10.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.c || g7.w.a(x10, y10, this.d, this.e) > AndroidUtilities.touchSlop) {
                this.c = true;
                b10.n = true;
                b10.e(x10 - this.d, y10 - this.e);
                this.d = x10;
                this.e = y10;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            b10.n = false;
            b10.r = true;
            if (!this.c) {
                cVar.a();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
