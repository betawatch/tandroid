package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z extends h1 {
    public final RectF m0;
    public final RectF n0;
    public final Path o0;
    public final /* synthetic */ c0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, Context context, int i10, f6 f6Var) {
        super(context, i10, f6Var);
        this.p0 = c0Var;
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c0 c0Var = this.p0;
        x xVar = c0Var.a0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = xVar.b;
            w wVar = c0Var.Y;
            RectF rectF = this.m0;
            if (!ih.k.c(frameLayout2, wVar, rectF)) {
                return true;
            }
            RectF rectF2 = this.n0;
            if (!ih.k.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
            float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.o0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (xVar.getWidth() / 2.0f), rectF2.centerY() - (xVar.getHeight() / 2.0f));
                xVar.b(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                xVar.c(canvas, xVar.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), xVar.getWidth(), xVar.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                xVar.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.o0;
        path.rewind();
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
