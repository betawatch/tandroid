// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ybc extends ix {
    public final Path h;
    public final /* synthetic */ acc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybc(acc accVar, Context context) {
        super(context);
        this.n = accVar;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // ix, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        super.onMeasure(i, i2);
        Path path = this.h;
        path.reset();
        acc accVar = this.n;
        if (accVar.d) {
            rectF = gl.P;
            rectF.set(0.0f, -accVar.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rectF = gl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + accVar.N));
        }
        float L = accVar.N - gl.L(3.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
    }
}
