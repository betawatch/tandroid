// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r28 extends uob {
    public final /* synthetic */ byte I = 1;

    public /* synthetic */ r28(Context context, tk5 tk5Var, int i) {
        super(context, tk5Var, i);
    }

    public final /* synthetic */ void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    agc.a(canvas, this, new ci7(this, (byte) 10));
                    break;
                } else {
                    super.draw(canvas);
                    break;
                }
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // uob, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ r28(Context context, tk5 tk5Var, int i, long j, ylb ylbVar) {
        super(context, tk5Var, i, j, ylbVar);
    }
}
