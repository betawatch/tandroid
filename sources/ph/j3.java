package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.xx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class j3 extends View {
    public final av0 a;
    public final Paint b;
    public float c;
    public o1.k d;

    public j3(Context context, c6 c6Var) {
        super(context);
        av0 av0Var = new av0(new xx0(24), new xx0(25));
        av0Var.c = 100.0f;
        this.a = av0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(g6.v0(g6.Oh, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c > 0.0f) {
            float height = getHeight();
            Paint paint = this.b;
            float strokeWidth = height - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, strokeWidth, getWidth() * this.c, strokeWidth, paint);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        this.d = kVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f9) {
        this.c = f9;
        invalidate();
    }

    public void setLoadProgressAnimated(float f9) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f9);
            return;
        }
        kVar.u.i = f9 * 100.0f;
        kVar.f();
    }
}
