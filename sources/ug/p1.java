package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p1 extends i {
    public final /* synthetic */ int n;
    public RectF r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(j jVar, Context context, int i3) {
        super(jVar, context);
        this.n = i3;
    }

    @Override // ug.i
    public final int a(float f10, float f11) {
        switch (this.n) {
            case 0:
                float L = org.telegram.messenger.g0.L(1.0f);
                float L2 = org.telegram.messenger.g0.L(19.5f);
                float f12 = L + L2;
                float f13 = f12 * 2.0f;
                float z10 = com.google.android.recaptcha.internal.a.z(getMeasuredHeight(), f13, 2.0f, f12);
                if (f10 <= f12 - L2 || f11 <= z10 - L2 || f10 >= f12 + L2 || f11 >= z10 + L2) {
                    if (f10 <= ((getMeasuredWidth() - f13) + f12) - L2 || f11 <= z10 - L2 || f10 >= (getMeasuredWidth() - f13) + f12 + L2 || f11 >= z10 + L2) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            case 1:
                float L3 = org.telegram.messenger.g0.L(1.0f);
                float L4 = org.telegram.messenger.g0.L(19.5f);
                float f14 = L3 + L4;
                float f15 = f14 * 2.0f;
                float z11 = com.google.android.recaptcha.internal.a.z(getMeasuredHeight(), f15, 2.0f, f14);
                if (f10 <= f14 - L4 || f11 <= z11 - L4 || f10 >= f14 + L4 || f11 >= z11 + L4) {
                    if (f10 <= ((getMeasuredWidth() - f15) + f14) - L4 || f11 <= z11 - L4 || f10 >= (getMeasuredWidth() - f15) + f14 + L4 || f11 >= z11 + L4) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            default:
                float L5 = org.telegram.messenger.g0.L(1.0f);
                float L6 = org.telegram.messenger.g0.L(19.5f);
                float f16 = L5 + L6;
                float f17 = f16 * 2.0f;
                float z12 = com.google.android.recaptcha.internal.a.z(getMeasuredHeight(), f17, 2.0f, f16);
                if (f10 <= f16 - L6 || f11 <= z12 - L6 || f10 >= f16 + L6 || f11 >= z12 + L6) {
                    if (f10 <= ((getMeasuredWidth() - f17) + f16) - L6 || f11 <= z12 - L6 || f10 >= (getMeasuredWidth() - f17) + f16 + L6 || f11 >= z12 + L6) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.n) {
            case 0:
                RectF rectF = this.r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float L = org.telegram.messenger.g0.L(1.0f);
                    float N = org.telegram.messenger.g0.N(5.66f);
                    float L2 = L + N + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L2;
                    float f10 = (2.0f * measuredWidth) + L2;
                    rectF.set(L2, L2, f10, f10);
                    Paint paint = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f11 = measuredWidth + L2;
                    Paint paint2 = this.c;
                    canvas.drawCircle(L2, f11, N, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(L2, f11, N - org.telegram.messenger.g0.L(1.0f), paint3);
                    canvas.drawCircle(f10, f11, N, paint2);
                    canvas.drawCircle(f10, f11, N - org.telegram.messenger.g0.L(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                RectF rectF2 = this.r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float L3 = org.telegram.messenger.g0.L(1.0f);
                    float N2 = org.telegram.messenger.g0.N(5.66f);
                    float L4 = L3 + N2 + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L4;
                    float f12 = (2.0f * measuredWidth2) + L4;
                    rectF2.set(L4, L4, f12, f12);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f13 = measuredWidth2 + L4;
                    Paint paint5 = this.c;
                    canvas.drawCircle(L4, f13, N2, paint5);
                    Paint paint6 = this.b;
                    canvas.drawCircle(L4, f13, N2 - org.telegram.messenger.g0.L(1.0f), paint6);
                    canvas.drawCircle(f12, f13, N2, paint5);
                    canvas.drawCircle(f12, f13, N2 - org.telegram.messenger.g0.L(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            default:
                RectF rectF3 = this.r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float L5 = org.telegram.messenger.g0.L(1.0f);
                    float N3 = org.telegram.messenger.g0.N(5.66f);
                    float L6 = L5 + N3 + org.telegram.messenger.g0.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L6;
                    float f14 = (2.0f * measuredWidth3) + L6;
                    rectF3.set(L6, L6, f14, f14);
                    Paint paint7 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f15 = measuredWidth3 + L6;
                    Paint paint8 = this.c;
                    canvas.drawCircle(L6, f15, N3, paint8);
                    Paint paint9 = this.b;
                    canvas.drawCircle(L6, f15, N3 - org.telegram.messenger.g0.L(1.0f), paint9);
                    canvas.drawCircle(f14, f15, N3, paint8);
                    canvas.drawCircle(f14, f15, N3 - org.telegram.messenger.g0.L(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, Context context) {
        super(r1Var, context);
        this.n = 1;
        this.r = new RectF();
    }
}
