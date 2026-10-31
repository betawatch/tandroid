package th;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a4 extends z4.g {
    public boolean w0;
    public final /* synthetic */ f4 x0;
    public final /* synthetic */ f4 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(f4 f4Var, Context context) {
        super(context);
        this.y0 = f4Var;
        this.x0 = f4Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w0 = true;
        }
        if (this.w0 && this.x0.y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w0 = true;
        }
        if (!this.w0 || this.x0.y > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.y0.getCurrentTopOffset();
        if (y3 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        f4 f4Var = this.y0;
        currentTopOffset = f4Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = f4Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - f4Var.d) > org.telegram.messenger.i0.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        f4 f4Var = this.y0;
        currentTopOffset = f4Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = f4Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - f4Var.d) > org.telegram.messenger.i0.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
