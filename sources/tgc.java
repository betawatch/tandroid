// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tgc extends View {
    public sgc a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public uib e;
    public boolean f;
    public cba h;
    public final ln n;
    public final /* synthetic */ vgc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgc(vgc vgcVar, Context context) {
        super(context);
        this.r = vgcVar;
        this.c = new RectF();
        this.n = new ln(360L, this, d53.h);
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
        uib uibVar;
        TextPaint textPaint;
        int i10;
        int i11;
        int i12;
        Canvas canvas2;
        int i13;
        vgc vgcVar = this.r;
        TextPaint textPaint2 = vgcVar.d;
        TextPaint textPaint3 = vgcVar.e;
        Paint paint = vgcVar.f;
        ylb ylbVar = vgcVar.k0;
        TextPaint textPaint4 = vgcVar.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new cba(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i14 = this.a.a;
        if (i14 != Integer.MAX_VALUE) {
            int i15 = vgc.t0;
        }
        int i16 = vgcVar.N;
        int i17 = vgcVar.H;
        if (i16 != -1) {
            i = i16;
        } else {
            i = i17;
            i17 = vgcVar.i0;
        }
        if (i14 == i) {
            int i18 = vgcVar.R;
            f = 0.0f;
            i3 = vgcVar.S;
            i4 = cmb.S9;
            i5 = cmb.T9;
            i6 = i18;
            i2 = i3;
        } else {
            f = 0.0f;
            i2 = vgcVar.S;
            i3 = vgcVar.R;
            i4 = cmb.T9;
            i5 = cmb.S9;
            i6 = i2;
        }
        int i19 = i5;
        int i20 = i4;
        if (vgcVar.F == 9) {
            textPaint4.setColor(cmb.v0(i2, ylbVar));
        } else if ((vgcVar.K || i16 != -1) && (i14 == i || i14 == i17)) {
            textPaint4.setColor(on2.f(vgcVar.L, cmb.v0(i3, ylbVar), cmb.v0(i6, ylbVar)));
        } else {
            textPaint4.setColor(cmb.v0(i6, ylbVar));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (vgcVar.n) {
                float L = gm.L(20.0f);
                int i21 = vgc.t0;
                i7 = (int) ((L * f) + f);
                int i22 = this.a.c;
                if (i7 == 0) {
                    int i23 = vgc.t0;
                    i8 = gm.L(f) + i7;
                } else {
                    i8 = 0;
                }
                this.b = i22 + i8;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i9 = 2;
                } else {
                    sgc sgcVar = this.a;
                    i9 = 2;
                    CharSequence m = gw3.m(sgcVar.b, textPaint4.getFontMetricsInt(), false, null, 0);
                    sgcVar.b = m;
                    this.d = m;
                    uib uibVar2 = this.e;
                    if (uibVar2 != null) {
                        gn.release(uibVar2.j, uibVar2.k);
                    }
                    uib uibVar3 = new uib(this.d, textPaint4.getTextSize() / gm.p, textPaint4.getTypeface());
                    uibVar3.q(this);
                    this.e = uibVar3;
                }
                uibVar = this.e;
                if (uibVar == null) {
                    uibVar.p = gm.L(400.0f);
                    float measuredHeight = getMeasuredHeight() / 2;
                    int i24 = i17;
                    int color = textPaint4.getColor();
                    i11 = measuredWidth;
                    int i25 = i9;
                    textPaint = textPaint4;
                    i10 = i25;
                    i12 = i24;
                    uibVar.c(measuredWidth, measuredHeight, 1.0f, color, canvas);
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
                    if (vgcVar.n) {
                        textPaint2.setColor(cmb.v0(vgcVar.U, ylbVar));
                        if (cmb.d1(i20) && cmb.d1(i19)) {
                            int v0 = cmb.v0(i20, ylbVar);
                            if ((vgcVar.K || vgcVar.M != -1) && ((i13 = this.a.a) == i || i13 == i12)) {
                                paint.setColor(on2.f(vgcVar.L, cmb.v0(i19, ylbVar), v0));
                            } else {
                                paint.setColor(v0);
                            }
                        } else {
                            paint.setColor(textPaint.getColor());
                        }
                        int L2 = gm.L(6.0f) + i11 + this.a.c;
                        int D = wi8.D(20.0f, getMeasuredHeight(), i10);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (vgcVar.n) {
                                int i27 = vgc.t0;
                                paint.setAlpha(0);
                                float L3 = gm.L(20.0f) + D;
                                RectF rectF = this.c;
                                rectF.set(L2, D, L2 + i7, L3);
                                float f2 = gm.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f2, f2, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (vgcVar.n) {
                                        textPaint3.setColor(textPaint2.getColor());
                                        int i28 = vgc.t0;
                                        textPaint3.setAlpha(0);
                                        float L4 = gm.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint3);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint3);
                                    } else {
                                        int i29 = vgc.t0;
                                    }
                                }
                            } else {
                                int i30 = vgc.t0;
                            }
                        }
                        paint.setAlpha(nm7.d4);
                        float L32 = gm.L(20.0f) + D;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, D, L2 + i7, L32);
                        float f22 = gm.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f22, f22, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i31 = vgc.t0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i32 = vgc.t0;
                }
                canvas.restore();
            }
            int i33 = vgc.t0;
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
        uibVar = this.e;
        if (uibVar == null) {
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
        sgc sgcVar = this.a;
        accessibilityNodeInfo.setSelected((sgcVar == null || (i = this.r.H) == -1 || sgcVar.a != i) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sgc sgcVar = this.a;
        vgc vgcVar = this.r;
        setMeasuredDimension(gm.L(vgcVar.r << 1) + sgcVar.a(vgcVar.c) + vgcVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
