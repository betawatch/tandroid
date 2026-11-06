package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import c8.j9;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public final Drawable f;
    public final float[] h;
    public final /* synthetic */ q n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Context context) {
        super(context);
        this.n = qVar;
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = new float[3];
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y10 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y10;
        float[] fArr = this.h;
        fArr[0] = y10 * 360.0f;
        float f10 = this.d;
        if (f10 <= 0.22f || f10 >= 0.78f) {
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.0f, f10 <= 0.22f ? 1.0f - (f10 / 0.22f) : (f10 - 0.78f) / 0.22000003f);
            float f11 = this.d;
            fArr[2] = f11 > 0.22f ? org.telegram.messenger.g0.T1(1.0f, 0.0f, (f11 - 0.78f) / 0.22000003f) : 1.0f;
        } else {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        q qVar = this.n;
        qVar.m1 = HSVToColor;
        qVar.I0(HSVToColor, 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.a);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.b);
        float L = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.c;
        float strokeWidth = L - (paint.getStrokeWidth() / 2.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f10 = width;
        float a10 = j9.a(this.d * f10, L2, f10 - L2) + getPaddingLeft();
        float f11 = height;
        float a11 = j9.a(this.e * f11, L2, f11 - L2) + getPaddingTop();
        Rect rect = org.telegram.messenger.g0.Q;
        Drawable drawable = this.f;
        drawable.getPadding(rect);
        int i7 = (int) ((a10 - L) - rect.left);
        int i10 = (int) ((a11 - L) - rect.top);
        int i11 = rect.bottom;
        drawable.setBounds(i7, i10, (int) (a10 + L + i11), (int) (a11 + L + i11));
        drawable.draw(canvas);
        canvas.drawCircle(a10, a11, L, paint);
        tg.y0.A1(a10, a11, strokeWidth, i0.a.o(this.n.m1, qs.e4), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i10 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i7 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(motionEvent);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            a(motionEvent);
        } else if (actionMasked == 2) {
            a(motionEvent);
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }
}
