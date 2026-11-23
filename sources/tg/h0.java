package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h0 extends h {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ vp0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vp0 vp0Var, Context context, nd0 nd0Var) {
        super(context, nd0Var);
        this.w = vp0Var;
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
        vp0 vp0Var = this.w;
        n nVar = vp0Var.C0;
        if (nVar == null || nVar.r || !nVar.n) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = nVar.getStickyX();
            i10 = vp0Var.C0.getStickyY();
        }
        if (i7 != 0) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                this.r = org.telegram.ui.Cells.c0.f(min, 150.0f, f12, 1.0f);
                invalidate();
                if (i10 != 0) {
                    float f13 = this.s;
                    if (f13 != 1.0f) {
                        this.s = org.telegram.ui.Cells.c0.f(min, 150.0f, f13, 1.0f);
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
                        this.s = org.telegram.ui.Cells.c0.B(min, 150.0f, f14, 0.0f);
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
                this.r = org.telegram.ui.Cells.c0.B(min, 150.0f, f15, 0.0f);
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
