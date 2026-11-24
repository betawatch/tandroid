// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tec extends View {
    public sec a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public tgb e;
    public boolean f;
    public c9a h;
    public final lm n;
    public final /* synthetic */ vec r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tec(vec vecVar, Context context) {
        super(context);
        this.r = vecVar;
        this.c = new RectF();
        this.n = new lm(360L, this, s33.h);
    }

    @Override // android.view.View
    public int getId() {
        return this.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        CharSequence charSequence;
        int i9;
        tgb tgbVar;
        TextPaint textPaint;
        int i10;
        int i11;
        int i12;
        Canvas canvas2;
        int i13;
        vec vecVar = this.r;
        TextPaint textPaint2 = vecVar.d;
        TextPaint textPaint3 = vecVar.e;
        Paint paint = vecVar.f;
        wjb wjbVar = vecVar.k0;
        TextPaint textPaint4 = vecVar.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new c9a(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i14 = this.a.a;
        if (i14 != Integer.MAX_VALUE) {
            int i15 = vec.t0;
        }
        int i16 = vecVar.N;
        int i17 = vecVar.H;
        if (i16 != -1) {
            i = i16;
        } else {
            i = i17;
            i17 = vecVar.i0;
        }
        if (i14 == i) {
            int i18 = vecVar.R;
            f = 0.0f;
            i3 = vecVar.S;
            i4 = bkb.S9;
            i5 = bkb.T9;
            i6 = i18;
            i2 = i3;
        } else {
            f = 0.0f;
            i2 = vecVar.S;
            i3 = vecVar.R;
            i4 = bkb.T9;
            i5 = bkb.S9;
            i6 = i2;
        }
        int i19 = i5;
        int i20 = i4;
        if (vecVar.F == 9) {
            textPaint4.setColor(bkb.v0(i2, wjbVar));
        } else if ((vecVar.K || i16 != -1) && (i14 == i || i14 == i17)) {
            textPaint4.setColor(bm2.f(vecVar.L, bkb.v0(i3, wjbVar), bkb.v0(i6, wjbVar)));
        } else {
            textPaint4.setColor(bkb.v0(i6, wjbVar));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (vecVar.n) {
                float L = gl.L(20.0f);
                int i21 = vec.t0;
                i7 = (int) ((L * f) + f);
                int i22 = this.a.c;
                if (i7 == 0) {
                    int i23 = vec.t0;
                    i8 = gl.L(f) + i7;
                } else {
                    i8 = 0;
                }
                this.b = i22 + i8;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i9 = 2;
                } else {
                    sec secVar = this.a;
                    i9 = 2;
                    CharSequence m = vu3.m(secVar.b, textPaint4.getFontMetricsInt(), false, null, 0);
                    secVar.b = m;
                    this.d = m;
                    tgb tgbVar2 = this.e;
                    if (tgbVar2 != null) {
                        gm.release(tgbVar2.j, tgbVar2.k);
                    }
                    tgb tgbVar3 = new tgb(this.d, textPaint4.getTextSize() / gl.p, textPaint4.getTypeface());
                    tgbVar3.q(this);
                    this.e = tgbVar3;
                }
                tgbVar = this.e;
                if (tgbVar == null) {
                    tgbVar.p = gl.L(400.0f);
                    float measuredHeight = getMeasuredHeight() / 2;
                    int i24 = i17;
                    int color = textPaint4.getColor();
                    i11 = measuredWidth;
                    int i25 = i9;
                    textPaint = textPaint4;
                    i10 = i25;
                    i12 = i24;
                    tgbVar.c(measuredWidth, measuredHeight, 1.0f, color, canvas);
                    canvas2 = canvas;
                } else {
                    int i26 = i9;
                    textPaint = textPaint4;
                    i10 = i26;
                    i11 = measuredWidth;
                    i12 = i17;
                    canvas2 = canvas;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (vecVar.n) {
                        textPaint2.setColor(bkb.v0(vecVar.U, wjbVar));
                        if (bkb.d1(i20) && bkb.d1(i19)) {
                            int v0 = bkb.v0(i20, wjbVar);
                            if ((vecVar.K || vecVar.M != -1) && ((i13 = this.a.a) == i || i13 == i12)) {
                                paint.setColor(bm2.f(vecVar.L, bkb.v0(i19, wjbVar), v0));
                            } else {
                                paint.setColor(v0);
                            }
                        } else {
                            paint.setColor(textPaint.getColor());
                        }
                        int L2 = gl.L(6.0f) + i11 + this.a.c;
                        int D = ug8.D(20.0f, getMeasuredHeight(), i10);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (vecVar.n) {
                                int i27 = vec.t0;
                                paint.setAlpha(0);
                                float L3 = gl.L(20.0f) + D;
                                RectF rectF = this.c;
                                rectF.set(L2, D, L2 + i7, L3);
                                float f2 = gl.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f2, f2, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (vecVar.n) {
                                        textPaint3.setColor(textPaint2.getColor());
                                        int i28 = vec.t0;
                                        textPaint3.setAlpha(0);
                                        float L4 = gl.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint3);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint3);
                                    } else {
                                        int i29 = vec.t0;
                                    }
                                }
                            } else {
                                int i30 = vec.t0;
                            }
                        }
                        paint.setAlpha(kk7.d4);
                        float L32 = gl.L(20.0f) + D;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, D, L2 + i7, L32);
                        float f22 = gl.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f22, f22, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i31 = vec.t0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i32 = vec.t0;
                }
                canvas.restore();
            }
            int i33 = vec.t0;
        }
        i7 = 0;
        int i222 = this.a.c;
        if (i7 == 0) {
        }
        this.b = i222 + i8;
        int measuredWidth2 = (getMeasuredWidth() - this.b) / 2;
        charSequence = this.a.b;
        if (charSequence == null) {
        }
        i9 = 2;
        tgbVar = this.e;
        if (tgbVar == null) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        sec secVar = this.a;
        accessibilityNodeInfo.setSelected((secVar == null || (i = this.r.H) == -1 || secVar.a != i) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sec secVar = this.a;
        vec vecVar = this.r;
        setMeasuredDimension(gl.L(vecVar.r << 1) + secVar.a(vecVar.c) + vecVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
