package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class e3 extends View implements k6 {
    public final ou0 a;
    public final Paint b;
    public float c;
    public o1.j d;
    public final p6 e;

    public e3(Context context, p6 p6Var) {
        super(context);
        ou0 ou0Var = new ou0(new xg.a(18), new xg.a(19));
        ou0Var.c = 100.0f;
        this.a = ou0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = p6Var;
        paint.setColor(t6.w0(t6.Ci, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
        jVar.m = kVar;
        this.d = jVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.m.i = f7 * 100.0f;
        jVar.h();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.b.setColor(t6.w0(t6.Ci, this.e));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
