package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class k3 extends View {
    public final iv0 a;
    public final Paint b;
    public float c;
    public o1.j d;

    public k3(Context context, f6 f6Var) {
        super(context);
        iv0 iv0Var = new iv0(new rg.a(12), new rg.a(13));
        iv0Var.c = 100.0f;
        this.a = iv0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(j6.v0(j6.Oh, f6Var));
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
        o1.j jVar = new o1.j(this, this.a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.u = kVar;
        this.d = jVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.u.i = f10 * 100.0f;
        jVar.f();
    }
}
