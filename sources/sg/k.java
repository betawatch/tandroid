package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import c8.j9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k extends View {
    public final Paint a;
    public final Paint b;
    public float c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Context context) {
        super(context);
        this.d = qVar;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
    }

    public final void a() {
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, this.d.p1}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        float L = org.telegram.messenger.g0.L(6.0f);
        float a10 = j9.a(((f10 - L) + (org.telegram.messenger.g0.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        this.c = a10;
        q qVar = this.d;
        qVar.I0(i0.a.o(qVar.p1, (int) (a10 * 255.0f)), 1);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f10 = height - L;
        float f11 = height + L;
        rectF.set(L, f10, getWidth() - L, f11);
        canvas.save();
        q qVar = this.d;
        qVar.o1.rewind();
        qVar.o1.addRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
        canvas.clipPath(qVar.o1);
        tg.y0.z1(canvas, rectF, org.telegram.messenger.g0.L(6.0f));
        canvas.restore();
        rectF.set(L, f10, getWidth() - L, f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.a);
        float L2 = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * this.c) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        tg.y0.A1(max, height, strokeWidth, i0.a.o(qVar.p1, (int) (this.c * 255.0f)), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
