package qf;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n extends q {
    public float[] E1;
    public float[] F1;
    public float G1;
    public boolean H1;
    public int I1;
    public RectF J1;
    public TextPaint K1;
    public float L1;
    public float M1;
    public String[] N1;
    public sf.g O1;
    public float P1;
    public int Q1;
    public int R1;
    public int S1;

    @Override // qf.g
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        rf.b bVar = this.d0;
        if (bVar == null || ((rf.e) bVar).b == null) {
            return;
        }
        j jVar = this.c0;
        N(jVar.k, jVar.l, z11);
    }

    @Override // qf.g
    public final void C(int i9, int i10) {
        ArrayList arrayList;
        RectF rectF = this.J1;
        if (this.d0 == null || this.H1) {
            return;
        }
        RectF rectF2 = this.D0;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i10, rectF2.centerX() - i9)) - 90.0d);
        float f10 = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (degrees + 360.0d);
        }
        float f11 = degrees / 360.0f;
        int i11 = 0;
        float f12 = 0.0f;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                f12 = 0.0f;
                break;
            }
            if (((o) arrayList.get(i11)).n || ((o) arrayList.get(i11)).o != 0.0f) {
                if (f11 > f12) {
                    float f13 = this.F1[i11] + f12;
                    if (f11 < f13) {
                        f10 = f13;
                        break;
                    }
                }
                f12 += this.F1[i11];
            }
            i11++;
        }
        if (this.I1 != i11 && i11 >= 0) {
            this.I1 = i11;
            invalidate();
            this.O1.setVisibility(0);
            sf.f fVar = (sf.f) arrayList.get(i11);
            sf.g gVar = this.O1;
            String str = fVar.a.d;
            int i12 = (int) this.E1[this.I1];
            int i13 = fVar.m;
            gVar.I.setText(str);
            TextView textView = gVar.J;
            textView.setText(Integer.toString(i12));
            textView.setTextColor(i13);
            this.O1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            double width = rectF.width() / 2.0f;
            int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
            int i14 = min >= 0 ? min : 0;
            if (this.O1.getMeasuredWidth() + i14 > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                i14 -= (this.O1.getMeasuredWidth() + i14) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
            }
            int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(r7)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(r13)) * width) + rectF.centerY()))) - AndroidUtilities.dp(50.0f);
            this.O1.setTranslationX(i14);
            this.O1.setTranslationY(min2);
            AndroidUtilities.vibrateCursor(this);
        }
        x((this.C0 * this.c0.k) - g.g1);
    }

    @Override // qf.g
    public final boolean D(rf.b bVar) {
        rf.e eVar = (rf.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.E1 = new float[eVar.d.size()];
            this.F1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // qf.g
    public final void J(rf.b bVar, long j10) {
        int length = bVar.a.length;
        long j11 = j10 - (j10 % 86400000);
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (j11 >= bVar.a[i10]) {
                i9 = i10;
            }
        }
        float length2 = bVar.b.length < 2 ? 0.5f : 1.0f / bVar.a.length;
        j jVar = this.c0;
        if (i9 == 0) {
            jVar.k = 0.0f;
            jVar.l = length2;
            return;
        }
        if (i9 >= bVar.a.length - 1) {
            jVar.k = 1.0f - length2;
            jVar.l = 1.0f;
            return;
        }
        float f10 = i9 * length2;
        jVar.k = f10;
        float f11 = f10 + length2;
        jVar.l = f11;
        if (f11 > 1.0f) {
            jVar.l = 1.0f;
        }
        A(true, true, false);
    }

    @Override // qf.q
    /* renamed from: L */
    public final sf.i h(rf.a aVar) {
        return new o(aVar);
    }

    public final void N(float f10, float f11, boolean z10) {
        if (this.E1 == null) {
            return;
        }
        int length = ((rf.e) this.d0).b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float f12 = ((rf.e) this.d0).b[i12];
            if (f12 >= f10 && i11 == -1) {
                i11 = i12;
            }
            if (f12 <= f11) {
                i10 = i12;
            }
        }
        if (i10 < i11) {
            i11 = i10;
        }
        if (!z10 && this.S1 == i10 && this.R1 == i11) {
            return;
        }
        this.S1 = i10;
        this.R1 = i11;
        this.H1 = true;
        this.G1 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            this.E1[i13] = 0.0f;
        }
        while (i11 <= i10) {
            for (int i14 = 0; i14 < size; i14++) {
                float[] fArr = this.E1;
                fArr[i14] = fArr[i14] + ((rf.a) ((rf.e) this.d0).d.get(i14)).a[i11];
                this.G1 += ((rf.a) ((rf.e) this.d0).d.get(i14)).a[i11];
                if (this.H1 && ((o) arrayList.get(i14)).n && ((rf.a) ((rf.e) this.d0).d.get(i14)).a[i11] > 0) {
                    this.H1 = false;
                }
            }
            i11++;
        }
        if (z10) {
            while (i9 < size) {
                if (this.G1 == 0.0f) {
                    ((o) arrayList.get(i9)).r = 0.0f;
                } else {
                    ((o) arrayList.get(i9)).r = this.E1[i9] / this.G1;
                }
                i9++;
            }
            return;
        }
        while (i9 < size) {
            o oVar = (o) arrayList.get(i9);
            ValueAnimator valueAnimator = oVar.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f13 = this.G1;
            ValueAnimator e10 = g.e(oVar.r, f13 == 0.0f ? 0.0f : this.E1[i9] / f13, new f2.g(25, this, oVar));
            oVar.s = e10;
            e10.start();
            i9++;
        }
    }

    @Override // qf.g, qf.i
    public final void a(float f10, float f11, boolean z10) {
        if (this.d0 == null) {
            return;
        }
        if (z10) {
            N(f10, f11, false);
        } else {
            H();
            invalidate();
        }
    }

    @Override // qf.g
    public final sf.e g() {
        sf.g gVar = new sf.g(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(gVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(gVar.getContext());
        gVar.I = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(gVar.getContext());
        gVar.J = textView2;
        linearLayout.addView(textView2);
        gVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        gVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        gVar.f.setVisibility(8);
        gVar.B = false;
        this.O1 = gVar;
        return gVar;
    }

    @Override // qf.q, qf.g
    public final sf.f h(rf.a aVar) {
        return new o(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    @Override // qf.q, qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        int i9;
        u1.a aVar;
        float f10;
        RectF rectF;
        float f11;
        TextPaint textPaint;
        float f12;
        float f13;
        TextPaint textPaint2;
        float f14;
        int i10;
        float f15;
        int i11;
        float f16;
        TextPaint textPaint3 = this.K1;
        RectF rectF2 = this.J1;
        if (this.d0 == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        if (this.u0 == 1) {
            float f17 = this.v0.f;
            i9 = (int) (f17 * f17 * 255.0f);
        } else {
            i9 = 255;
        }
        if (this.H1) {
            float f18 = this.P1;
            if (f18 != 0.0f) {
                float f19 = f18 - 0.12f;
                this.P1 = f19;
                if (f19 < 0.0f) {
                    this.P1 = 0.0f;
                }
                invalidate();
            }
        } else {
            float f20 = this.P1;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.12f;
                this.P1 = f21;
                if (f21 > 1.0f) {
                    this.P1 = 1.0f;
                }
                invalidate();
            }
        }
        float f22 = this.P1;
        int i12 = (int) (i9 * f22);
        float f23 = (f22 * 0.6f) + 0.4f;
        RectF rectF3 = this.D0;
        if (canvas != null) {
            canvas.scale(f23, f23, rectF3.centerX(), rectF3.centerY());
        }
        float height = (int) ((rectF3.width() > rectF3.height() ? rectF3.height() : rectF3.width()) * 0.45f);
        rectF2.set(rectF3.centerX() - height, (rectF3.centerY() + AndroidUtilities.dp(16.0f)) - height, rectF3.centerX() + height, rectF3.centerY() + AndroidUtilities.dp(16.0f) + height);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        float f24 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            f24 = (((o) arrayList.get(i13)).r * ((o) arrayList.get(i13)).o) + f24;
        }
        if (f24 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        int i14 = 0;
        float f25 = -90.0f;
        while (true) {
            aVar = g.y1;
            f10 = 2.0f;
            if (i14 >= size) {
                break;
            }
            if (((o) arrayList.get(i14)).o > 0.0f || ((o) arrayList.get(i14)).n) {
                ((o) arrayList.get(i14)).c.setAlpha(i12);
                float f26 = (((o) arrayList.get(i14)).r / f24) * ((o) arrayList.get(i14)).o;
                this.F1[i14] = f26;
                if (f26 != 0.0f) {
                    if (canvas != null) {
                        canvas.save();
                    }
                    i10 = i12;
                    double b10 = j2.b(f26, 2.0f, 360.0f, f25);
                    if (((o) arrayList.get(i14)).q > 0.0f) {
                        float interpolation = aVar.getInterpolation(((o) arrayList.get(i14)).q);
                        if (canvas != null) {
                            double d = interpolation;
                            f15 = f25;
                            canvas.translate((float) (Math.cos(Math.toRadians(b10)) * AndroidUtilities.dp(8.0f) * d), (float) (Math.sin(Math.toRadians(b10)) * AndroidUtilities.dp(8.0f) * d));
                            ((o) arrayList.get(i14)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                            ((o) arrayList.get(i14)).c.setStrokeWidth(1.0f);
                            ((o) arrayList.get(i14)).c.setAntiAlias(!g.w1);
                            if (canvas != null) {
                                i11 = i14;
                                f16 = f15;
                            } else if (this.u0 != 1) {
                                Paint paint = ((o) arrayList.get(i14)).c;
                                i11 = i14;
                                f16 = f15;
                                canvas.drawArc(rectF2, f16, f26 * 360.0f, true, paint);
                                ((o) arrayList.get(i11)).c.setStyle(Paint.Style.STROKE);
                                canvas.restore();
                            } else {
                                i11 = i14;
                                f16 = f15;
                            }
                            ((o) arrayList.get(i11)).c.setAlpha(255);
                            f25 = (f26 * 360.0f) + f16;
                            i14 = i11 + 1;
                            i12 = i10;
                        }
                    }
                    f15 = f25;
                    ((o) arrayList.get(i14)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((o) arrayList.get(i14)).c.setStrokeWidth(1.0f);
                    ((o) arrayList.get(i14)).c.setAntiAlias(!g.w1);
                    if (canvas != null) {
                    }
                    ((o) arrayList.get(i11)).c.setAlpha(255);
                    f25 = (f26 * 360.0f) + f16;
                    i14 = i11 + 1;
                    i12 = i10;
                }
            }
            i11 = i14;
            i10 = i12;
            i14 = i11 + 1;
            i12 = i10;
        }
        int i15 = i12;
        if (canvas != null) {
            float f27 = -90.0f;
            int i16 = 0;
            while (i16 < size) {
                if (((o) arrayList.get(i16)).o > 0.0f || ((o) arrayList.get(i16)).n) {
                    float f28 = (((o) arrayList.get(i16)).r * ((o) arrayList.get(i16)).o) / f24;
                    canvas.save();
                    double b11 = j2.b(f28, f10, 360.0f, f27);
                    if (((o) arrayList.get(i16)).q > 0.0f) {
                        textPaint = textPaint3;
                        f12 = 2.0f;
                        double interpolation2 = aVar.getInterpolation(((o) arrayList.get(i16)).q);
                        rectF = rectF2;
                        f11 = f27;
                        canvas.translate((float) (Math.cos(Math.toRadians(b11)) * AndroidUtilities.dp(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(b11)) * AndroidUtilities.dp(8.0f) * interpolation2));
                    } else {
                        rectF = rectF2;
                        f11 = f27;
                        textPaint = textPaint3;
                        f12 = 2.0f;
                    }
                    int i17 = (int) (100.0f * f28);
                    if (f28 < 0.02f || i17 <= 0 || i17 > 100) {
                        f13 = f28;
                        textPaint2 = textPaint;
                    } else {
                        float sqrt = (float) (Math.sqrt(1.0f - f28) * rectF.width() * 0.42f);
                        textPaint2 = textPaint;
                        textPaint2.setTextSize((this.M1 * f28) + this.L1);
                        textPaint2.setAlpha((int) (i15 * ((o) arrayList.get(i16)).o));
                        f13 = f28;
                        double d9 = sqrt;
                        canvas.drawText(this.N1[i17], (float) ((Math.cos(Math.toRadians(b11)) * d9) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(b11)) * d9) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f12), textPaint2);
                    }
                    canvas.restore();
                    ((o) arrayList.get(i16)).c.setAlpha(255);
                    f14 = (f13 * 360.0f) + f11;
                } else {
                    rectF = rectF2;
                    f14 = f27;
                    textPaint2 = textPaint3;
                }
                i16++;
                f27 = f14;
                textPaint3 = textPaint2;
                rectF2 = rectF;
                f10 = 2.0f;
            }
            canvas.restore();
        }
    }

    @Override // qf.q, qf.g
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i9;
        n nVar = this;
        rf.b bVar = nVar.d0;
        if (bVar != null) {
            int length = ((rf.e) bVar).b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((sf.f) arrayList.get(i10)).j = 0;
            }
            float length2 = (1.0f / ((rf.e) nVar.d0).b.length) * nVar.y0;
            int i11 = 0;
            while (i11 < length) {
                float z10 = e2.c.z(nVar.y0, length2, ((rf.e) nVar.d0).b[i11], length2 / 2.0f);
                int i12 = 1;
                int i13 = 0;
                float f13 = 0.0f;
                int i14 = 0;
                boolean z11 = true;
                while (i13 < size) {
                    sf.f fVar = (sf.f) arrayList.get(i13);
                    boolean z12 = fVar.n;
                    if (z12 || fVar.o != 0.0f) {
                        i9 = i11;
                        float f14 = fVar.a.a[i9] * fVar.o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i14++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    } else {
                        i9 = i11;
                    }
                    i13++;
                    i11 = i9;
                }
                int i15 = i11;
                int i16 = 0;
                float f15 = 0.0f;
                while (i16 < size) {
                    sf.f fVar2 = (sf.f) arrayList.get(i16);
                    if (fVar2.n || fVar2.o != 0.0f) {
                        long[] jArr = fVar2.a.a;
                        if (i14 == i12) {
                            if (jArr[i15] != 0) {
                                f12 = fVar2.o;
                                int i17 = nVar.x0;
                                float f16 = f12 * i17;
                                float[] fArr = fVar2.k;
                                int i18 = fVar2.j;
                                int i19 = i18 + 1;
                                fVar2.j = i19;
                                fArr[i18] = z10;
                                int i20 = i18 + 2;
                                fVar2.j = i20;
                                fArr[i19] = (i17 - f16) - f15;
                                int i21 = i18 + 3;
                                fVar2.j = i21;
                                fArr[i20] = z10;
                                fVar2.j = i18 + 4;
                                fArr[i21] = i17 - f15;
                                f15 += f16;
                            }
                            f12 = 0.0f;
                            int i172 = nVar.x0;
                            float f162 = f12 * i172;
                            float[] fArr2 = fVar2.k;
                            int i182 = fVar2.j;
                            int i192 = i182 + 1;
                            fVar2.j = i192;
                            fArr2[i182] = z10;
                            int i202 = i182 + 2;
                            fVar2.j = i202;
                            fArr2[i192] = (i172 - f162) - f15;
                            int i212 = i182 + 3;
                            fVar2.j = i212;
                            fArr2[i202] = z10;
                            fVar2.j = i182 + 4;
                            fArr2[i212] = i172 - f15;
                            f15 += f162;
                        } else {
                            if (f13 != 0.0f) {
                                if (z11) {
                                    f11 = fVar2.o;
                                    f10 = (jArr[i15] / f13) * f11;
                                } else {
                                    f10 = jArr[i15] / f13;
                                    f11 = fVar2.o;
                                }
                                f12 = f10 * f11;
                                int i1722 = nVar.x0;
                                float f1622 = f12 * i1722;
                                float[] fArr22 = fVar2.k;
                                int i1822 = fVar2.j;
                                int i1922 = i1822 + 1;
                                fVar2.j = i1922;
                                fArr22[i1822] = z10;
                                int i2022 = i1822 + 2;
                                fVar2.j = i2022;
                                fArr22[i1922] = (i1722 - f1622) - f15;
                                int i2122 = i1822 + 3;
                                fVar2.j = i2122;
                                fArr22[i2022] = z10;
                                fVar2.j = i1822 + 4;
                                fArr22[i2122] = i1722 - f15;
                                f15 += f1622;
                            }
                            f12 = 0.0f;
                            int i17222 = nVar.x0;
                            float f16222 = f12 * i17222;
                            float[] fArr222 = fVar2.k;
                            int i18222 = fVar2.j;
                            int i19222 = i18222 + 1;
                            fVar2.j = i19222;
                            fArr222[i18222] = z10;
                            int i20222 = i18222 + 2;
                            fVar2.j = i20222;
                            fArr222[i19222] = (i17222 - f16222) - f15;
                            int i21222 = i18222 + 3;
                            fVar2.j = i21222;
                            fArr222[i20222] = z10;
                            fVar2.j = i18222 + 4;
                            fArr222[i21222] = i17222 - f15;
                            f15 += f16222;
                        }
                    }
                    i16++;
                    i12 = 1;
                    nVar = this;
                }
                i11 = i15 + 1;
                nVar = this;
            }
            for (int i22 = 0; i22 < size; i22++) {
                sf.f fVar3 = (sf.f) arrayList.get(i22);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // qf.q, qf.g, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d0 != null) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (i9 == this.I1) {
                    if (((o) arrayList.get(i9)).q < 1.0f) {
                        ((o) arrayList.get(i9)).q += 0.1f;
                        if (((o) arrayList.get(i9)).q > 1.0f) {
                            ((o) arrayList.get(i9)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i9)).q > 0.0f) {
                    ((o) arrayList.get(i9)).q -= 0.1f;
                    if (((o) arrayList.get(i9)).q < 0.0f) {
                        ((o) arrayList.get(i9)).q = 0.0f;
                    }
                    invalidate();
                }
                i9++;
            }
        }
        super.onDraw(canvas);
    }

    @Override // qf.g, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (getMeasuredWidth() != this.Q1) {
            this.Q1 = getMeasuredWidth();
            RectF rectF = this.D0;
            int height = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.L1 = height / 13;
            this.M1 = height / 7;
        }
    }

    @Override // qf.q, qf.g
    public final void q(sf.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i9 = 0;
        while (true) {
            float[] fArr = this.F1;
            if (i9 >= fArr.length) {
                return;
            }
            f10 += fArr[i9];
            jVar.k[i9] = (360.0f * f10) - 180.0f;
            i9++;
        }
    }

    @Override // qf.g
    public final void y() {
        this.I1 = -1;
        this.O1.setVisibility(8);
        invalidate();
    }

    @Override // qf.g
    public final void i(Canvas canvas) {
    }

    @Override // qf.g
    public final void j(Canvas canvas) {
    }

    @Override // qf.g
    public final void o(Canvas canvas) {
    }

    @Override // qf.g
    public final void l(Canvas canvas, sf.d dVar) {
    }

    @Override // qf.g
    public final void p(Canvas canvas, sf.d dVar) {
    }
}
