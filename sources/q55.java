// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q55 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ h75 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = h75Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h75 h75Var = this.e;
        r55 r55Var = h75Var.y1;
        float y = r55Var.getY() + r55Var.getMeasuredHeight();
        y74 y74Var = h75Var.q5;
        float f = y - y74Var.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f, measuredWidth, measuredHeight);
        float y2 = r55Var.getY() + r55Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y2, measuredWidth2, measuredHeight2);
        float y3 = (r55Var.getY() + r55Var.getMeasuredHeight()) - y74Var.f;
        float measuredWidth3 = getMeasuredWidth();
        float y4 = r55Var.getY() + r55Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y3, measuredWidth3, y4);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i < 29 || h75Var.G4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(bm2.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f2 = h75Var.H4;
            canvas.scale(f2, f2);
            canvas.drawRenderNode(h75Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
