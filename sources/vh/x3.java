package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x3 extends jg.d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final /* synthetic */ s7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(s7 s7Var, Context context, s9.g gVar) {
        super(context, gVar);
        this.y = s7Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
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
        int measuredWidth;
        float measuredWidth2;
        int measuredHeight;
        float measuredHeight2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        s7 s7Var = this.y;
        jg.j jVar = s7Var.s0;
        if (jVar == null || jVar.r || !jVar.n) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = jVar.getStickyX();
            i11 = s7Var.s0.getStickyY();
        }
        if (i10 != 0) {
            this.w = i10;
        }
        if (i11 != 0) {
            this.x = i11;
        }
        if (i10 != 0) {
            float f11 = this.r;
            if (f11 != 1.0f) {
                this.r = org.telegram.ui.Cells.f1.e(min, 150.0f, f11, 1.0f);
                invalidate();
                if (i11 != 0) {
                    float f12 = this.s;
                    if (f12 != 1.0f) {
                        this.s = org.telegram.ui.Cells.f1.e(min, 150.0f, f12, 1.0f);
                        invalidate();
                        f7 = this.s;
                        Paint paint = this.h;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            int i12 = this.x;
                            if (i12 == 1) {
                                measuredHeight = org.telegram.messenger.i0.L(64.0f);
                            } else if (i12 == 2) {
                                measuredHeight2 = getMeasuredHeight() / 2.0f;
                                float f13 = measuredHeight2;
                                canvas2 = canvas;
                                canvas2.drawLine(0.0f, f13, getMeasuredWidth(), f13, paint);
                            } else {
                                measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(64.0f);
                            }
                            measuredHeight2 = measuredHeight;
                            float f132 = measuredHeight2;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, f132, getMeasuredWidth(), f132, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f10 = this.r;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            int i13 = this.w;
                            if (i13 == 1) {
                                measuredWidth = org.telegram.messenger.i0.L(8.0f);
                            } else {
                                if (i13 == 2) {
                                    measuredWidth2 = getMeasuredWidth() / 2.0f;
                                    float f14 = measuredWidth2;
                                    canvas2.drawLine(f14, 0.0f, f14, getMeasuredHeight(), paint);
                                    return;
                                }
                                measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f);
                            }
                            measuredWidth2 = measuredWidth;
                            float f142 = measuredWidth2;
                            canvas2.drawLine(f142, 0.0f, f142, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i11 == 0) {
                    float f15 = this.s;
                    if (f15 != 0.0f) {
                        this.s = org.telegram.ui.Cells.f1.v(min, 150.0f, f15, 0.0f);
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
            float f16 = this.r;
            if (f16 != 0.0f) {
                this.r = org.telegram.ui.Cells.f1.v(min, 150.0f, f16, 0.0f);
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

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        s7 s7Var = this.y;
        x3 x3Var = s7Var.A0;
        if (s7Var.A1 <= 0) {
            s7Var.A1 = x3Var.getMeasuredWidth();
        }
        if (s7Var.B1 <= 0) {
            s7Var.B1 = x3Var.getMeasuredHeight();
        }
        s7Var.E0();
    }
}
