// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u38 extends sqb {
    public final /* synthetic */ byte I = 1;

    public /* synthetic */ u38(Context context, wk5 wk5Var, int i) {
        super(context, wk5Var, i);
    }

    public final /* synthetic */ void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    yhc.a(canvas, this, new ji7(this, (byte) 11));
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

    @Override // sqb, android.view.ViewGroup
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

    public /* synthetic */ u38(Context context, wk5 wk5Var, int i, long j, vnb vnbVar) {
        super(context, wk5Var, i, j, vnbVar);
    }
}
