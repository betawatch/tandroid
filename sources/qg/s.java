package qg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public final Drawable f;
    public final float[] h;
    public final /* synthetic */ x n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, Context context) {
        super(context);
        this.n = xVar;
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y3 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y3;
        float[] fArr = this.h;
        fArr[0] = y3 * 360.0f;
        float f7 = this.d;
        if (f7 <= 0.22f || f7 >= 0.78f) {
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f7 <= 0.22f ? 1.0f - (f7 / 0.22f) : (f7 - 0.78f) / 0.22000003f);
            float f10 = this.d;
            fArr[2] = f10 > 0.22f ? AndroidUtilities.lerp(1.0f, 0.0f, (f10 - 0.78f) / 0.22000003f) : 1.0f;
        } else {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        x xVar = this.n;
        xVar.f = HSVToColor;
        xVar.m(HSVToColor, 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.b);
        float dp = AndroidUtilities.dp(13.0f);
        Paint paint = this.c;
        float strokeWidth = dp - (paint.getStrokeWidth() / 2.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f7 = width;
        float a2 = w7.p.a(this.d * f7, dp2, f7 - dp2) + getPaddingLeft();
        float f10 = height;
        float a10 = w7.p.a(this.e * f10, dp2, f10 - dp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f;
        drawable.getPadding(rect);
        int i10 = (int) ((a2 - dp) - rect.left);
        int i11 = (int) ((a10 - dp) - rect.top);
        int i12 = rect.bottom;
        drawable.setBounds(i10, i11, (int) (a2 + dp + i12), (int) (a10 + dp + i12));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, dp, paint);
        rg.k1.w1(a2, a10, strokeWidth, i0.a.k(this.n.f, 255), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
