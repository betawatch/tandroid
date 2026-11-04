package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import b8.be;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = this.c;
        q qVar = this.e;
        if (i3 == 1) {
            argb = Color.argb(hs.e4, Color.red(qVar.n1), 0, Color.blue(qVar.n1));
            argb2 = Color.argb(hs.e4, Color.red(qVar.n1), hs.e4, Color.blue(qVar.n1));
        } else if (i3 != 2) {
            argb = Color.argb(hs.e4, 0, Color.green(qVar.n1), Color.blue(qVar.n1));
            argb2 = Color.argb(hs.e4, hs.e4, Color.green(qVar.n1), Color.blue(qVar.n1));
        } else {
            argb = Color.argb(hs.e4, Color.red(qVar.n1), Color.green(qVar.n1), 0);
            argb2 = Color.argb(hs.e4, Color.red(qVar.n1), Color.green(qVar.n1), hs.e4);
        }
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        float L = org.telegram.messenger.g0.L(6.0f);
        float a10 = be.a(((f10 - L) + (org.telegram.messenger.g0.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        int i3 = this.c;
        q qVar = this.e;
        qVar.I0(i0.a.o(i3 != 1 ? i3 != 2 ? Color.argb(hs.e4, (int) (a10 * 255.0f), Color.green(qVar.n1), Color.blue(qVar.n1)) : Color.argb(hs.e4, Color.red(qVar.n1), Color.green(qVar.n1), (int) (a10 * 255.0f)) : Color.argb(hs.e4, Color.red(qVar.n1), (int) (a10 * 255.0f), Color.blue(qVar.n1)), Color.alpha(qVar.n1)), 4);
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
        int i3 = this.c;
        q qVar = this.e;
        float red = (i3 != 1 ? i3 != 2 ? Color.red(qVar.n1) : Color.blue(qVar.n1) : Color.green(qVar.n1)) / 255.0f;
        float L2 = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * red) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        ug.x0.A1(max, height, strokeWidth, this.d, canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
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
