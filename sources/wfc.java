// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wfc extends jx {
    public final Path h;
    public final /* synthetic */ yfc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfc(yfc yfcVar, Context context) {
        super(context);
        this.n = yfcVar;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // jx, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        super.onMeasure(i, i2);
        Path path = this.h;
        path.reset();
        yfc yfcVar = this.n;
        if (yfcVar.d) {
            rectF = hl.P;
            rectF.set(0.0f, -yfcVar.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rectF = hl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + yfcVar.N));
        }
        float L = yfcVar.N - hl.L(3.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
    }
}
