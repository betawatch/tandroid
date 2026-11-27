// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r39 extends g44 {
    public final /* synthetic */ byte n;
    public RectF r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r39(pp9 pp9Var, Context context) {
        super(pp9Var, context);
        this.n = (byte) 1;
        this.r = new RectF();
    }

    @Override // g44
    public final int a(float f, float f2) {
        switch (this.n) {
            case 0:
                float L = hl.L(1.0f);
                float L2 = hl.L(19.5f);
                float f3 = L + L2;
                float f4 = f3 * 2.0f;
                float z = bp1.z(getMeasuredHeight(), f4, 2.0f, f3);
                if (f <= f3 - L2 || f2 <= z - L2 || f >= f3 + L2 || f2 >= z + L2) {
                    if (f <= ((getMeasuredWidth() - f4) + f3) - L2 || f2 <= z - L2 || f >= (getMeasuredWidth() - f4) + f3 + L2 || f2 >= z + L2) {
                        if (Math.pow(f2 - r6, 2.0d) + Math.pow(f - r6, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            case 1:
                float L3 = hl.L(1.0f);
                float L4 = hl.L(19.5f);
                float f5 = L3 + L4;
                float f6 = f5 * 2.0f;
                float z2 = bp1.z(getMeasuredHeight(), f6, 2.0f, f5);
                if (f <= f5 - L4 || f2 <= z2 - L4 || f >= f5 + L4 || f2 >= z2 + L4) {
                    if (f <= ((getMeasuredWidth() - f6) + f5) - L4 || f2 <= z2 - L4 || f >= (getMeasuredWidth() - f6) + f5 + L4 || f2 >= z2 + L4) {
                        if (Math.pow(f2 - r6, 2.0d) + Math.pow(f - r6, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            default:
                float L5 = hl.L(1.0f);
                float L6 = hl.L(19.5f);
                float f7 = L5 + L6;
                float f8 = f7 * 2.0f;
                float z3 = bp1.z(getMeasuredHeight(), f8, 2.0f, f7);
                if (f <= f7 - L6 || f2 <= z3 - L6 || f >= f7 + L6 || f2 >= z3 + L6) {
                    if (f <= ((getMeasuredWidth() - f8) + f7) - L6 || f2 <= z3 - L6 || f >= (getMeasuredWidth() - f8) + f7 + L6 || f2 >= z3 + L6) {
                        if (Math.pow(f2 - r6, 2.0d) + Math.pow(f - r6, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.n;
        Paint paint = this.c;
        Paint paint2 = this.b;
        switch (b) {
            case 0:
                RectF rectF = this.r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float L = hl.L(1.0f);
                    float N = hl.N(5.66f);
                    float L2 = L + N + hl.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L2;
                    float f = (2.0f * measuredWidth) + L2;
                    rectF.set(L2, L2, f, f);
                    Paint paint3 = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint3);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint3);
                    float f2 = measuredWidth + L2;
                    canvas.drawCircle(L2, f2, N, paint);
                    canvas.drawCircle(L2, f2, N - hl.L(1.0f), paint2);
                    canvas.drawCircle(f, f2, N, paint);
                    canvas.drawCircle(f, f2, N - hl.L(1.0f), paint2);
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
                    float L3 = hl.L(1.0f);
                    float N2 = hl.N(5.66f);
                    float L4 = L3 + N2 + hl.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L4;
                    float f3 = (2.0f * measuredWidth2) + L4;
                    rectF2.set(L4, L4, f3, f3);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f4 = measuredWidth2 + L4;
                    canvas.drawCircle(L4, f4, N2, paint);
                    canvas.drawCircle(L4, f4, N2 - hl.L(1.0f), paint2);
                    canvas.drawCircle(f3, f4, N2, paint);
                    canvas.drawCircle(f3, f4, N2 - hl.L(1.0f), paint2);
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
                    float L5 = hl.L(1.0f);
                    float N3 = hl.N(5.66f);
                    float L6 = L5 + N3 + hl.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L6;
                    float f5 = (2.0f * measuredWidth3) + L6;
                    rectF3.set(L6, L6, f5, f5);
                    Paint paint5 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint5);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint5);
                    float f6 = measuredWidth3 + L6;
                    canvas.drawCircle(L6, f6, N3, paint);
                    canvas.drawCircle(L6, f6, N3 - hl.L(1.0f), paint2);
                    canvas.drawCircle(f5, f6, N3, paint);
                    canvas.drawCircle(f5, f6, N3 - hl.L(1.0f), paint2);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r39(h44 h44Var, Context context, byte b) {
        super(h44Var, context);
        this.n = b;
    }
}
