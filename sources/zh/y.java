package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y extends y0 {
    public final RectF w0;
    public final RectF x0;
    public final Path y0;
    public final /* synthetic */ b0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Context context, int i7, g6 g6Var) {
        super(i7, context, g6Var);
        this.z0 = b0Var;
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
        b0 b0Var = this.z0;
        w wVar = b0Var.S1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = wVar.b;
            v vVar = b0Var.Q1;
            RectF rectF = this.w0;
            if (!jh.k.c(frameLayout2, vVar, rectF)) {
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
                canvas.translate(rectF2.centerX() - (wVar.getWidth() / 2.0f), rectF2.centerY() - (wVar.getHeight() / 2.0f));
                wVar.b(canvas, wVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), wVar.getWidth(), wVar.getHeight());
                wVar.c(canvas, wVar.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), wVar.getWidth(), wVar.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                wVar.b.draw(canvas);
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
