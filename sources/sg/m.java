package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import c8.j9;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m extends View {
    public final Paint a;
    public final Paint b;
    public int c;
    public int d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Context context) {
        super(context);
        this.e = qVar;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i7 = this.c;
        q qVar = this.e;
        if (i7 == 1) {
            argb = Color.argb(qs.e4, Color.red(qVar.m1), 0, Color.blue(qVar.m1));
            argb2 = Color.argb(qs.e4, Color.red(qVar.m1), qs.e4, Color.blue(qVar.m1));
        } else if (i7 != 2) {
            argb = Color.argb(qs.e4, 0, Color.green(qVar.m1), Color.blue(qVar.m1));
            argb2 = Color.argb(qs.e4, qs.e4, Color.green(qVar.m1), Color.blue(qVar.m1));
        } else {
            argb = Color.argb(qs.e4, Color.red(qVar.m1), Color.green(qVar.m1), 0);
            argb2 = Color.argb(qs.e4, Color.red(qVar.m1), Color.green(qVar.m1), qs.e4);
        }
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        float L = org.telegram.messenger.g0.L(6.0f);
        float a10 = j9.a(((f10 - L) + (org.telegram.messenger.g0.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        int i7 = this.c;
        q qVar = this.e;
        qVar.I0(i0.a.o(i7 != 1 ? i7 != 2 ? Color.argb(qs.e4, (int) (a10 * 255.0f), Color.green(qVar.m1), Color.blue(qVar.m1)) : Color.argb(qs.e4, Color.red(qVar.m1), Color.green(qVar.m1), (int) (a10 * 255.0f)) : Color.argb(qs.e4, Color.red(qVar.m1), (int) (a10 * 255.0f), Color.blue(qVar.m1)), Color.alpha(qVar.m1)), 4);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L, height - L, getWidth() - L, height + L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.a);
        int i7 = this.c;
        q qVar = this.e;
        float red = (i7 != 1 ? i7 != 2 ? Color.red(qVar.m1) : Color.blue(qVar.m1) : Color.green(qVar.m1)) / 255.0f;
        float L2 = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * red) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        tg.y0.A1(max, height, strokeWidth, this.d, canvas);
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
