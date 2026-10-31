package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class v4 extends FrameLayout {
    public ValueAnimator D;
    public float E;
    public final u4 a;
    public final File b;
    public long c;
    public long d;
    public final Paint e;
    public final Paint f;
    public final s4 h;
    public jo n;
    public l r;
    public float s;
    public jg.i2 w;
    public ValueAnimator x;
    public boolean y;

    public v4(Context context) {
        super(context);
        this.c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new s4(this, 0);
        this.s = 1.0f;
        this.y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.b = n5.x(d20.s0, true);
        u4 u4Var = new u4(this, context);
        this.a = u4Var;
        u4Var.setScaleX(0.0f);
        u4Var.setScaleY(0.0f);
        addView(u4Var);
        u4Var.setDelegate(new t4(this));
        u4Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        l lVar = this.r;
        if (lVar != null) {
            lVar.run();
            this.r = null;
        }
        org.telegram.messenger.i0.r(this.h);
        this.a.destroy(true, null);
        try {
            this.b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new c4(2, this));
        this.D.addListener(new sg.r(this, 20));
        this.D.setInterpolator(gr.h);
        this.D.setDuration(280L);
        this.D.start();
    }

    public final long b() {
        if (this.c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.c);
    }

    public abstract void c();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.i0.P;
        u4 u4Var = this.a;
        rectF.set(((1.0f - u4Var.getScaleX()) * (u4Var.getWidth() / 2.0f)) + u4Var.getX(), ((1.0f - u4Var.getScaleY()) * (u4Var.getHeight() / 2.0f)) + u4Var.getY(), (u4Var.getX() + u4Var.getWidth()) - ((1.0f - u4Var.getScaleX()) * (u4Var.getWidth() / 2.0f)), (u4Var.getY() + u4Var.getHeight()) - ((1.0f - u4Var.getScaleY()) * (u4Var.getHeight() / 2.0f)));
        float L = org.telegram.messenger.i0.L(2.0f);
        float L2 = org.telegram.messenger.i0.L(0.66f);
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.s, TLObject.FLAG_29);
        Paint paint = this.e;
        paint.setShadowLayer(L, 0.0f, L2, r12);
        paint.setAlpha((int) (this.s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        jg.i2 i2Var = this.w;
        if (i2Var != null && i2Var.getWidth() > 0 && this.w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.w.getWidth(), rectF.height() / this.w.getHeight());
            float alpha = this.w.getAlpha();
            this.w.setDraw(true);
            this.w.setAlpha(1.0f - this.s);
            this.w.draw(canvas);
            this.w.setAlpha(alpha);
            this.w.setDraw(false);
            canvas.restore();
        }
        if (this.c > 0) {
            float i10 = Utilities.i(b() / 59500.0f, 1.0f, 0.0f);
            float L3 = org.telegram.messenger.i0.L(3.33f);
            Paint paint2 = this.f;
            paint2.setStrokeWidth(L3);
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(this.s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.33f), org.telegram.ui.ActionBar.t6.r1(this.s, TLObject.FLAG_29));
            rectF.inset(-org.telegram.messenger.i0.L(7.665f), -org.telegram.messenger.i0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i10 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u4 u4Var = this.a;
        int measuredWidth = ((i12 - i10) - u4Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f);
        int L = org.telegram.messenger.i0.L(72.0f);
        u4Var.layout(measuredWidth, L, u4Var.getMeasuredWidth() + measuredWidth, u4Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
