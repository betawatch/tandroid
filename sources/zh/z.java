package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z extends z0 {
    public final RectF w0;
    public final RectF x0;
    public final Path y0;
    public final /* synthetic */ c0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, Context context, int i7, f6 f6Var) {
        super(i7, context, f6Var);
        this.z0 = c0Var;
        this.w0 = new RectF();
        this.x0 = new RectF();
        this.y0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c0 c0Var = this.z0;
        x xVar = c0Var.S1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = xVar.b;
            w wVar = c0Var.Q1;
            RectF rectF = this.w0;
            if (!jh.k.c(frameLayout2, wVar, rectF)) {
                return true;
            }
            RectF rectF2 = this.x0;
            if (!jh.k.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
            float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.y0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (xVar.getWidth() / 2.0f), rectF2.centerY() - (xVar.getHeight() / 2.0f));
                xVar.b(canvas, xVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), xVar.getWidth(), xVar.getHeight());
                xVar.c(canvas, xVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), xVar.getWidth(), xVar.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                xVar.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.y0;
        path.rewind();
        RectF rectF = this.w0;
        rectF.set(0.0f, 0.0f, i7, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
