package wf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.y3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a extends g {
    @Override // wf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // wf.g
    public final yf.f h(xf.a aVar) {
        return new yf.a(aVar, this.T0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3 A[SYNTHETIC] */
    @Override // wf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        ArrayList arrayList;
        int i11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        xf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        float f14 = this.C0;
        j jVar = this.d0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = (f16 * f17) - g.h1;
        int i12 = this.C - 1;
        int i13 = i12 < 0 ? 0 : i12;
        int i14 = this.D + 1;
        if (i14 > ((xf.a) bVar.d.get(0)).a.length - 1) {
            i14 = ((xf.a) this.e0.d.get(0)).a.length - 1;
        }
        int i15 = i14;
        canvas2.save();
        float f19 = 0.0f;
        canvas2.clipRect(this.A0, 0.0f, this.B0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i16 = this.v0;
        int i17 = 2;
        if (i16 == 2) {
            this.c0 = true;
            this.s0 = 0.0f;
            yf.j jVar2 = this.w0;
            float f20 = jVar2.f;
            f11 = 1.0f - f20;
            canvas2.scale((f20 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i16 == 1) {
            yf.j jVar3 = this.w0;
            f11 = jVar3.f;
            canvas2.scale(f11, 1.0f, jVar3.d, jVar3.e);
        } else {
            f10 = 1.0f;
            i10 = 0;
            while (true) {
                arrayList = this.d;
                if (i10 < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                yf.a aVar = (yf.a) arrayList.get(i10);
                boolean z4 = aVar.n;
                float[] fArr = aVar.k;
                Paint paint = aVar.r;
                Paint paint2 = aVar.c;
                if (z4 || aVar.o != f19) {
                    float[] fArr2 = this.e0.b;
                    float f21 = fArr2.length < i17 ? 1.0f : fArr2[1] * f17;
                    long[] jArr = aVar.a.a;
                    float f22 = aVar.o;
                    i11 = i10;
                    int i18 = i13;
                    float f23 = 0.0f;
                    int i19 = 0;
                    boolean z10 = false;
                    float f24 = 0.0f;
                    while (i18 <= i15) {
                        float f25 = f23;
                        float f26 = ((this.e0.b[i18] * f17) + (f21 / 2.0f)) - f18;
                        float f27 = f17;
                        float f28 = f18;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i18] / this.v) * f22) * ((getMeasuredHeight() - this.s) - g.k1));
                        if (i18 == this.p0 && this.r0) {
                            f24 = measuredHeight;
                            f23 = f26;
                            z10 = true;
                        } else {
                            fArr[i19] = f26;
                            fArr[i19 + 1] = measuredHeight;
                            int i20 = i19 + 3;
                            fArr[i19 + 2] = f26;
                            i19 += 4;
                            fArr[i20] = getMeasuredHeight() - this.s;
                            f23 = f25;
                        }
                        i18++;
                        f17 = f27;
                        f18 = f28;
                    }
                    float f29 = f23;
                    f12 = f17;
                    f13 = f18;
                    Paint paint3 = (z10 || this.c0) ? paint : paint2;
                    paint3.setStrokeWidth(f21);
                    if (z10) {
                        paint.setColor(i0.a.d(1.0f - this.s0, aVar.m, aVar.s));
                    }
                    if (this.c0) {
                        paint.setColor(i0.a.d(0.0f, aVar.m, aVar.s));
                    }
                    int i21 = (int) (255.0f * f10);
                    paint3.setAlpha(i21);
                    canvas2.drawLines(fArr, 0, i19, paint3);
                    if (z10) {
                        paint2.setStrokeWidth(f21);
                        paint2.setAlpha(i21);
                        canvas2.drawLine(f29, f24, f29, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(255);
                    }
                } else {
                    i11 = i10;
                    f12 = f17;
                    f13 = f18;
                }
                i10 = i11 + 1;
                canvas2 = canvas;
                f17 = f12;
                f18 = f13;
                f19 = 0.0f;
                i17 = 2;
            }
        }
        f10 = f11;
        i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 < arrayList.size()) {
            }
            i10 = i11 + 1;
            canvas2 = canvas;
            f17 = f12;
            f18 = f13;
            f19 = 0.0f;
            i17 = 2;
        }
    }

    @Override // wf.g
    public final void n(Canvas canvas) {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.n1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.y0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.e0 != null) {
            int i15 = 0;
            while (i15 < size) {
                yf.a aVar = (yf.a) arrayList3.get(i15);
                boolean z4 = aVar.n;
                Paint paint = aVar.c;
                float[] fArr = aVar.k;
                if (z4 || aVar.o != 0.0f) {
                    aVar.e.reset();
                    float[] fArr2 = this.e0.b;
                    int length = fArr2.length;
                    float f12 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.z0;
                    long[] jArr = aVar.a.a;
                    float f13 = aVar.o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            xf.b bVar = this.e0;
                            i12 = i14;
                            float f14 = this.z0 * bVar.b[i16];
                            if (g.y1) {
                                f11 = this.g0;
                                f10 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f14;
                                arrayList2 = arrayList3;
                                f11 = bVar.e;
                            }
                            float A = y3.A(j10, f11, f13, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = A;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList3 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                    paint.setStrokeWidth(f12 + 2.0f);
                    canvas.drawLines(fArr, 0, i17, paint);
                } else {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                }
                i15 = i11 + 1;
                i14 = i10;
                arrayList3 = arrayList;
            }
        }
    }

    @Override // wf.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.k0 = i10;
            int i11 = this.k0;
            if (i11 >= this.j0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (yf.d) arrayList.get(i11));
                p(canvas, (yf.d) arrayList.get(this.k0));
                i10 = this.k0 + 1;
            }
        }
    }

    @Override // wf.g
    public final void o(Canvas canvas) {
    }
}
