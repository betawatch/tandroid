// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s75 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ j95 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = j95Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j95 j95Var = this.e;
        t75 t75Var = j95Var.y1;
        float y = t75Var.getY() + t75Var.getMeasuredHeight();
        t84 t84Var = j95Var.q5;
        float f = y - t84Var.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f, measuredWidth, measuredHeight);
        float y2 = t75Var.getY() + t75Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y2, measuredWidth2, measuredHeight2);
        float y3 = (t75Var.getY() + t75Var.getMeasuredHeight()) - t84Var.f;
        float measuredWidth3 = getMeasuredWidth();
        float y4 = t75Var.getY() + t75Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y3, measuredWidth3, y4);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i < 29 || j95Var.G4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(vm2.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f2 = j95Var.H4;
            canvas.scale(f2, f2);
            canvas.drawRenderNode(j95Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
