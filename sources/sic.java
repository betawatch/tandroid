// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sic extends View {
    public ric a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public pkb e;
    public boolean f;
    public sca h;
    public final mm n;
    public final /* synthetic */ uic r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sic(uic uicVar, Context context) {
        super(context);
        this.r = uicVar;
        this.c = new RectF();
        this.n = new mm(360L, this, k43.h);
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
        pkb pkbVar;
        TextPaint textPaint;
        int i10;
        int i11;
        int i12;
        Canvas canvas2;
        int i13;
        uic uicVar = this.r;
        TextPaint textPaint2 = uicVar.d;
        TextPaint textPaint3 = uicVar.e;
        Paint paint = uicVar.f;
        vnb vnbVar = uicVar.k0;
        TextPaint textPaint4 = uicVar.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new sca(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i14 = this.a.a;
        if (i14 != Integer.MAX_VALUE) {
            int i15 = uic.t0;
        }
        int i16 = uicVar.N;
        int i17 = uicVar.H;
        if (i16 != -1) {
            i = i16;
        } else {
            i = i17;
            i17 = uicVar.i0;
        }
        if (i14 == i) {
            int i18 = uicVar.R;
            f = 0.0f;
            i3 = uicVar.S;
            i4 = aob.T9;
            i5 = aob.U9;
            i6 = i18;
            i2 = i3;
        } else {
            f = 0.0f;
            i2 = uicVar.S;
            i3 = uicVar.R;
            i4 = aob.U9;
            i5 = aob.T9;
            i6 = i2;
        }
        int i19 = i5;
        int i20 = i4;
        if (uicVar.F == 9) {
            textPaint4.setColor(aob.v0(i2, vnbVar));
        } else if ((uicVar.K || i16 != -1) && (i14 == i || i14 == i17)) {
            textPaint4.setColor(vm2.f(uicVar.L, aob.v0(i3, vnbVar), aob.v0(i6, vnbVar)));
        } else {
            textPaint4.setColor(aob.v0(i6, vnbVar));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (uicVar.n) {
                float L = hl.L(20.0f);
                int i21 = uic.t0;
                i7 = (int) ((L * f) + f);
                int i22 = this.a.c;
                if (i7 == 0) {
                    int i23 = uic.t0;
                    i8 = hl.L(f) + i7;
                } else {
                    i8 = 0;
                }
                this.b = i22 + i8;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i9 = 2;
                } else {
                    ric ricVar = this.a;
                    i9 = 2;
                    CharSequence m = pv3.m(ricVar.b, textPaint4.getFontMetricsInt(), false, null, 0);
                    ricVar.b = m;
                    this.d = m;
                    pkb pkbVar2 = this.e;
                    if (pkbVar2 != null) {
                        hm.release(pkbVar2.j, pkbVar2.k);
                    }
                    pkb pkbVar3 = new pkb(this.d, textPaint4.getTextSize() / hl.p, textPaint4.getTypeface());
                    pkbVar3.q(this);
                    this.e = pkbVar3;
                }
                pkbVar = this.e;
                if (pkbVar == null) {
                    pkbVar.p = hl.L(400.0f);
                    float measuredHeight = getMeasuredHeight() / 2;
                    int i24 = i17;
                    int color = textPaint4.getColor();
                    i11 = measuredWidth;
                    int i25 = i9;
                    textPaint = textPaint4;
                    i10 = i25;
                    i12 = i24;
                    pkbVar.c(measuredWidth, measuredHeight, 1.0f, color, canvas);
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
                    if (uicVar.n) {
                        textPaint2.setColor(aob.v0(uicVar.U, vnbVar));
                        if (aob.d1(i20) && aob.d1(i19)) {
                            int v0 = aob.v0(i20, vnbVar);
                            if ((uicVar.K || uicVar.M != -1) && ((i13 = this.a.a) == i || i13 == i12)) {
                                paint.setColor(vm2.f(uicVar.L, aob.v0(i19, vnbVar), v0));
                            } else {
                                paint.setColor(v0);
                            }
                        } else {
                            paint.setColor(textPaint.getColor());
                        }
                        int L2 = hl.L(6.0f) + i11 + this.a.c;
                        int D = ik8.D(20.0f, getMeasuredHeight(), i10);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (uicVar.n) {
                                int i27 = uic.t0;
                                paint.setAlpha(0);
                                float L3 = hl.L(20.0f) + D;
                                RectF rectF = this.c;
                                rectF.set(L2, D, L2 + i7, L3);
                                float f2 = hl.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f2, f2, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (uicVar.n) {
                                        textPaint3.setColor(textPaint2.getColor());
                                        int i28 = uic.t0;
                                        textPaint3.setAlpha(0);
                                        float L4 = hl.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint3);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint3);
                                    } else {
                                        int i29 = uic.t0;
                                    }
                                }
                            } else {
                                int i30 = uic.t0;
                            }
                        }
                        paint.setAlpha(jn7.d4);
                        float L32 = hl.L(20.0f) + D;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, D, L2 + i7, L32);
                        float f22 = hl.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f22, f22, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i31 = uic.t0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i32 = uic.t0;
                }
                canvas.restore();
            }
            int i33 = uic.t0;
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
        pkbVar = this.e;
        if (pkbVar == null) {
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
        ric ricVar = this.a;
        accessibilityNodeInfo.setSelected((ricVar == null || (i = this.r.H) == -1 || ricVar.a != i) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ric ricVar = this.a;
        uic uicVar = this.r;
        setMeasuredDimension(hl.L(uicVar.r << 1) + ricVar.a(uicVar.c) + uicVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
