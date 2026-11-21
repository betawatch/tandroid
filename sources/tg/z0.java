package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import bi.l8;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class z0 extends ek0 {
    public static final Paint k3;
    public static final Paint l3;
    public static final Path m3;
    public static final Paint n3;
    public final Paint f3;
    public final Paint g3;
    public int h3;
    public sg.k0 i3;
    public q0.a j3;

    static {
        Paint paint = new Paint(1);
        k3 = paint;
        Paint paint2 = new Paint(1);
        l3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        m3 = new Path();
        n3 = new Paint(1);
    }

    public z0(Context context) {
        super(context, null);
        this.f3 = new Paint(1);
        Paint paint = new Paint(1);
        this.g3 = paint;
        this.h3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setLayoutManager(new v4.t(7));
        setAdapter(new x0(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new l8(this, 21));
    }

    public static void A1(float f10, float f11, float f12, int i7, Canvas canvas) {
        Paint paint = n3;
        paint.setColor(i7);
        if (paint.getAlpha() == 255) {
            canvas.drawCircle(f10, f11, f12, paint);
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        paint.setAlpha(ks.e4);
        canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
        Path path = m3;
        path.rewind();
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) i5.c.c(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) i5.c.c(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
        path.addArc(rectF, -45.0f, 180.0f);
        canvas.save();
        canvas.clipPath(path);
        z1(canvas, rectF, org.telegram.messenger.g0.L(4.0f));
        canvas.restore();
        paint.setColor(i7);
        canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
    }

    public static void z1(Canvas canvas, RectF rectF, int i7) {
        float f10 = rectF.left;
        while (f10 <= rectF.right) {
            float f11 = rectF.top;
            while (f11 <= rectF.bottom) {
                float f12 = i7;
                float f13 = f10 + f12;
                float f14 = f11 + f12;
                Paint paint = k3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f10, f11, f13, f14, paint);
                float f15 = i7 * 2;
                float f16 = f10 + f15;
                Paint paint2 = l3;
                float f17 = f11;
                canvas2.drawRect(f13, f17, f16, f14, paint2);
                float f18 = f17 + f15;
                canvas2.drawRect(f13, f14, f16, f18, paint);
                canvas2.drawRect(f10, f14, f13, f18, paint2);
                canvas = canvas2;
                f11 = f18;
            }
            f10 += i7 * 2;
            canvas = canvas;
        }
    }

    public final void B1(boolean z10, float f10) {
        float interpolation = z10 ? nr.g.getInterpolation(f10) : nr.i.getInterpolation(f10);
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (i7 == 0) {
                childAt.setAlpha(interpolation == 1.0f ? 1.0f : 0.0f);
            } else {
                float f11 = i7 * childCount;
                float min = Math.min(interpolation, f11) / f11;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    public int getSelectedColorIndex() {
        return this.h3;
    }

    public void setColorListener(q0.a aVar) {
        this.j3 = aVar;
    }

    public void setColorPalette(sg.k0 k0Var) {
        this.i3 = k0Var;
        getAdapter().f();
    }

    public void setSelectedColorIndex(int i7) {
        this.h3 = i7;
        getAdapter().f();
    }
}
