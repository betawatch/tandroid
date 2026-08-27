package rf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.rl;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a extends g {
    @Override // rf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // rf.g
    public final tf.f h(sf.a aVar) {
        return new tf.a(aVar, this.S0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3 A[SYNTHETIC] */
    @Override // rf.g
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
        sf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f14 = this.B0;
        j jVar = this.c0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = (f16 * f17) - g.g1;
        int i12 = this.B - 1;
        int i13 = i12 < 0 ? 0 : i12;
        int i14 = this.C + 1;
        if (i14 > ((sf.a) bVar.d.get(0)).a.length - 1) {
            i14 = ((sf.a) this.d0.d.get(0)).a.length - 1;
        }
        int i15 = i14;
        canvas2.save();
        float f19 = 0.0f;
        canvas2.clipRect(this.z0, 0.0f, this.A0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i16 = this.u0;
        int i17 = 2;
        if (i16 == 2) {
            this.b0 = true;
            this.r0 = 0.0f;
            tf.j jVar2 = this.v0;
            float f20 = jVar2.f;
            f11 = 1.0f - f20;
            canvas2.scale((f20 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i16 == 1) {
            tf.j jVar3 = this.v0;
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
                tf.a aVar = (tf.a) arrayList.get(i10);
                boolean z10 = aVar.n;
                float[] fArr = aVar.k;
                Paint paint = aVar.r;
                Paint paint2 = aVar.c;
                if (z10 || aVar.o != f19) {
                    float[] fArr2 = this.d0.b;
                    float f21 = fArr2.length < i17 ? 1.0f : fArr2[1] * f17;
                    long[] jArr = aVar.a.a;
                    float f22 = aVar.o;
                    i11 = i10;
                    int i18 = i13;
                    float f23 = 0.0f;
                    int i19 = 0;
                    boolean z11 = false;
                    float f24 = 0.0f;
                    while (i18 <= i15) {
                        float f25 = f23;
                        float f26 = ((this.d0.b[i18] * f17) + (f21 / 2.0f)) - f18;
                        float f27 = f17;
                        float f28 = f18;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i18] / this.v) * f22) * ((getMeasuredHeight() - this.s) - g.j1));
                        if (i18 == this.o0 && this.q0) {
                            f24 = measuredHeight;
                            f23 = f26;
                            z11 = true;
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
                    Paint paint3 = (z11 || this.b0) ? paint : paint2;
                    paint3.setStrokeWidth(f21);
                    if (z11) {
                        paint.setColor(i0.b.d(1.0f - this.r0, aVar.m, aVar.s));
                    }
                    if (this.b0) {
                        paint.setColor(i0.b.d(0.0f, aVar.m, aVar.s));
                    }
                    int i21 = (int) (255.0f * f10);
                    paint3.setAlpha(i21);
                    canvas2.drawLines(fArr, 0, i19, paint3);
                    if (z11) {
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

    @Override // rf.g
    public final void n(Canvas canvas) {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.m1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.x0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.d0 != null) {
            int i15 = 0;
            while (i15 < size) {
                tf.a aVar = (tf.a) arrayList3.get(i15);
                boolean z10 = aVar.n;
                Paint paint = aVar.c;
                float[] fArr = aVar.k;
                if (z10 || aVar.o != 0.0f) {
                    aVar.e.reset();
                    float[] fArr2 = this.d0.b;
                    int length = fArr2.length;
                    float f12 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.y0;
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
                            sf.b bVar = this.d0;
                            i12 = i14;
                            float f14 = this.y0 * bVar.b[i16];
                            if (g.x1) {
                                f11 = this.f0;
                                f10 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f14;
                                arrayList2 = arrayList3;
                                f11 = bVar.e;
                            }
                            float c10 = rl.c(j10, f11, f13, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = c10;
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

    @Override // rf.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.j0 = i10;
            int i11 = this.j0;
            if (i11 >= this.i0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (tf.d) arrayList.get(i11));
                p(canvas, (tf.d) arrayList.get(this.j0));
                i10 = this.j0 + 1;
            }
        }
    }

    @Override // rf.g
    public final void o(Canvas canvas) {
    }
}
