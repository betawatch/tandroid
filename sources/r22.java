// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r22 extends o39 {
    public final /* synthetic */ byte f3;
    public final Paint g3;
    public final /* synthetic */ d32 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r22(d32 d32Var, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        switch (b) {
            case 1:
                this.h3 = d32Var;
                super(context, wjbVar);
                this.g3 = new Paint();
                break;
            default:
                this.h3 = d32Var;
                this.g3 = new Paint();
                break;
        }
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Paint paint = this.g3;
        float f = 2.1474836E9f;
        d32 d32Var = this.h3;
        switch (b) {
            case 0:
                if (d32Var.n == 2 && getChildCount() > 0) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildAt(i).getY() < f) {
                            f = getChildAt(i).getY();
                        }
                    }
                    paint.setColor(bkb.w0(null, bkb.g5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (d32Var.n == 1 && getChildCount() > 0) {
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        if (getChildAt(i2).getY() < f) {
                            f = getChildAt(i2).getY();
                        }
                    }
                    paint.setColor(bkb.w0(null, bkb.g5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (this.h3.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
