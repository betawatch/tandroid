package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.d3;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h0 extends d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ nt0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(nt0 nt0Var, Context context, g0 g0Var) {
        super(context, g0Var);
        this.v = nt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        Canvas canvas2;
        float f10;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        nt0 nt0Var = this.v;
        j jVar = nt0Var.H0;
        if (jVar == null || jVar.r || !jVar.n) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = jVar.getStickyX();
            i11 = nt0Var.H0.getStickyY();
        }
        if (i10 != 0) {
            float f11 = this.r;
            if (f11 != 1.0f) {
                this.r = d3.d(min, 150.0f, f11, 1.0f);
                invalidate();
                if (i11 != 0) {
                    float f12 = this.s;
                    if (f12 != 1.0f) {
                        this.s = d3.d(min, 150.0f, f12, 1.0f);
                        invalidate();
                        f7 = this.s;
                        Paint paint = this.h;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            float measuredHeight = getMeasuredHeight() / 2.0f;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f10 = this.r;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            float measuredWidth = getMeasuredWidth() / 2.0f;
                            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i11 == 0) {
                    float f13 = this.s;
                    if (f13 != 0.0f) {
                        this.s = d3.v(min, 150.0f, f13, 0.0f);
                        invalidate();
                    }
                }
                f7 = this.s;
                Paint paint2 = this.h;
                if (f7 != 0.0f) {
                }
                f10 = this.r;
                if (f10 != 0.0f) {
                }
            }
        }
        if (i10 == 0) {
            float f14 = this.r;
            if (f14 != 0.0f) {
                this.r = d3.v(min, 150.0f, f14, 0.0f);
                invalidate();
            }
        }
        if (i11 != 0) {
        }
        if (i11 == 0) {
        }
        f7 = this.s;
        Paint paint22 = this.h;
        if (f7 != 0.0f) {
        }
        f10 = this.r;
        if (f10 != 0.0f) {
        }
    }
}
