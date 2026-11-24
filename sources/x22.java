// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class x22 extends View implements vlb {
    public final ika a;
    public final Paint b;
    public float c;
    public zna d;
    public final ylb e;

    public x22(Context context, ylb ylbVar) {
        super(context);
        ika ikaVar = new ika(new qn0((byte) 26), new qn0((byte) 27));
        ikaVar.c = 100.0f;
        this.a = ikaVar;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = ylbVar;
        paint.setColor(cmb.v0(cmb.Ei, ylbVar));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
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
        zna znaVar = new zna(this, this.a);
        aoa aoaVar = new aoa();
        aoaVar.b(400.0f);
        aoaVar.a(1.0f);
        znaVar.m = aoaVar;
        this.d = znaVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f) {
        this.c = f;
        invalidate();
    }

    public void setLoadProgressAnimated(float f) {
        zna znaVar = this.d;
        if (znaVar == null) {
            setLoadProgress(f);
            return;
        }
        znaVar.m.i = f * 100.0f;
        znaVar.h();
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.b.setColor(cmb.v0(cmb.Ei, this.e));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
