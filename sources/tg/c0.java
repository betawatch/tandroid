package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c0 extends d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ up0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(up0 up0Var, Context context, org.telegram.ui.Components.n nVar) {
        super(context, nVar);
        this.w = up0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
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
        int i7;
        int i10;
        float f10;
        Canvas canvas2;
        float f11;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        up0 up0Var = this.w;
        j jVar = up0Var.B0;
        if (jVar == null || jVar.r || !jVar.n) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = jVar.getStickyX();
            i10 = up0Var.B0.getStickyY();
        }
        if (i7 != 0) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                this.r = org.telegram.ui.Cells.f1.e(min, 150.0f, f12, 1.0f);
                invalidate();
                if (i10 != 0) {
                    float f13 = this.s;
                    if (f13 != 1.0f) {
                        this.s = org.telegram.ui.Cells.f1.e(min, 150.0f, f13, 1.0f);
                        invalidate();
                        f10 = this.s;
                        Paint paint = this.h;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            float measuredHeight = getMeasuredHeight() / 2.0f;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f11 = this.r;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            float measuredWidth = getMeasuredWidth() / 2.0f;
                            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i10 == 0) {
                    float f14 = this.s;
                    if (f14 != 0.0f) {
                        this.s = org.telegram.ui.Cells.f1.v(min, 150.0f, f14, 0.0f);
                        invalidate();
                    }
                }
                f10 = this.s;
                Paint paint2 = this.h;
                if (f10 != 0.0f) {
                }
                f11 = this.r;
                if (f11 != 0.0f) {
                }
            }
        }
        if (i7 == 0) {
            float f15 = this.r;
            if (f15 != 0.0f) {
                this.r = org.telegram.ui.Cells.f1.v(min, 150.0f, f15, 0.0f);
                invalidate();
            }
        }
        if (i10 != 0) {
        }
        if (i10 == 0) {
        }
        f10 = this.s;
        Paint paint22 = this.h;
        if (f10 != 0.0f) {
        }
        f11 = this.r;
        if (f11 != 0.0f) {
        }
    }
}
