package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.ll;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends g {
    @Override // qf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // qf.g
    public final sf.f h(rf.a aVar) {
        return new sf.a(aVar, this.S0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3 A[SYNTHETIC] */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        ArrayList arrayList;
        int i10;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        rf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f14 = this.B0;
        j jVar = this.c0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = (f16 * f17) - g.g1;
        int i11 = this.B - 1;
        int i12 = i11 < 0 ? 0 : i11;
        int i13 = this.C + 1;
        if (i13 > ((rf.a) bVar.d.get(0)).a.length - 1) {
            i13 = ((rf.a) this.d0.d.get(0)).a.length - 1;
        }
        int i14 = i13;
        canvas2.save();
        float f19 = 0.0f;
        canvas2.clipRect(this.z0, 0.0f, this.A0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i15 = this.u0;
        int i16 = 2;
        if (i15 == 2) {
            this.b0 = true;
            this.r0 = 0.0f;
            sf.j jVar2 = this.v0;
            float f20 = jVar2.f;
            f11 = 1.0f - f20;
            canvas2.scale((f20 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i15 == 1) {
            sf.j jVar3 = this.v0;
            f11 = jVar3.f;
            canvas2.scale(f11, 1.0f, jVar3.d, jVar3.e);
        } else {
            f10 = 1.0f;
            i9 = 0;
            while (true) {
                arrayList = this.d;
                if (i9 < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                sf.a aVar = (sf.a) arrayList.get(i9);
                boolean z10 = aVar.n;
                float[] fArr = aVar.k;
                Paint paint = aVar.r;
                Paint paint2 = aVar.c;
                if (z10 || aVar.o != f19) {
                    float[] fArr2 = this.d0.b;
                    float f21 = fArr2.length < i16 ? 1.0f : fArr2[1] * f17;
                    long[] jArr = aVar.a.a;
                    float f22 = aVar.o;
                    i10 = i9;
                    int i17 = i12;
                    float f23 = 0.0f;
                    int i18 = 0;
                    boolean z11 = false;
                    float f24 = 0.0f;
                    while (i17 <= i14) {
                        float f25 = f23;
                        float f26 = ((this.d0.b[i17] * f17) + (f21 / 2.0f)) - f18;
                        float f27 = f17;
                        float f28 = f18;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i17] / this.v) * f22) * ((getMeasuredHeight() - this.s) - g.j1));
                        if (i17 == this.o0 && this.q0) {
                            f24 = measuredHeight;
                            f23 = f26;
                            z11 = true;
                        } else {
                            fArr[i18] = f26;
                            fArr[i18 + 1] = measuredHeight;
                            int i19 = i18 + 3;
                            fArr[i18 + 2] = f26;
                            i18 += 4;
                            fArr[i19] = getMeasuredHeight() - this.s;
                            f23 = f25;
                        }
                        i17++;
                        f17 = f27;
                        f18 = f28;
                    }
                    float f29 = f23;
                    f12 = f17;
                    f13 = f18;
                    Paint paint3 = (z11 || this.b0) ? paint : paint2;
                    paint3.setStrokeWidth(f21);
                    if (z11) {
                        paint.setColor(i0.a.d(1.0f - this.r0, aVar.m, aVar.s));
                    }
                    if (this.b0) {
                        paint.setColor(i0.a.d(0.0f, aVar.m, aVar.s));
                    }
                    int i20 = (int) (255.0f * f10);
                    paint3.setAlpha(i20);
                    canvas2.drawLines(fArr, 0, i18, paint3);
                    if (z11) {
                        paint2.setStrokeWidth(f21);
                        paint2.setAlpha(i20);
                        canvas2.drawLine(f29, f24, f29, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(255);
                    }
                } else {
                    i10 = i9;
                    f12 = f17;
                    f13 = f18;
                }
                i9 = i10 + 1;
                canvas2 = canvas;
                f17 = f12;
                f18 = f13;
                f19 = 0.0f;
                i16 = 2;
            }
        }
        f10 = f11;
        i9 = 0;
        while (true) {
            arrayList = this.d;
            if (i9 < arrayList.size()) {
            }
            i9 = i10 + 1;
            canvas2 = canvas;
            f17 = f12;
            f18 = f13;
            f19 = 0.0f;
            i16 = 2;
        }
    }

    @Override // qf.g
    public final void n(Canvas canvas) {
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i12 = g.m1;
        int i13 = measuredHeight - i12;
        int measuredHeight2 = (getMeasuredHeight() - this.x0) - i12;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.d0 != null) {
            int i14 = 0;
            while (i14 < size) {
                sf.a aVar = (sf.a) arrayList3.get(i14);
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
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length) {
                        int i17 = i14;
                        long j10 = jArr[i15];
                        if (j10 < 0) {
                            i11 = i13;
                            arrayList2 = arrayList3;
                        } else {
                            rf.b bVar = this.d0;
                            i11 = i13;
                            float f14 = this.y0 * bVar.b[i15];
                            if (g.x1) {
                                f11 = this.f0;
                                f10 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f14;
                                arrayList2 = arrayList3;
                                f11 = bVar.e;
                            }
                            float c10 = ll.c(j10, f11, f13, 1.0f) * (i11 - measuredHeight2);
                            fArr[i16] = f10;
                            fArr[i16 + 1] = c10;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f10;
                            i16 += 4;
                            fArr[i18] = getMeasuredHeight() - this.s;
                        }
                        i15++;
                        i14 = i17;
                        i13 = i11;
                        arrayList3 = arrayList2;
                    }
                    i9 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                    paint.setStrokeWidth(f12 + 2.0f);
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    i9 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                }
                i14 = i10 + 1;
                i13 = i9;
                arrayList3 = arrayList;
            }
        }
    }

    @Override // qf.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.i0 = arrayList.size();
        int i9 = 0;
        while (true) {
            this.j0 = i9;
            int i10 = this.j0;
            if (i10 >= this.i0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (sf.d) arrayList.get(i10));
                p(canvas, (sf.d) arrayList.get(this.j0));
                i9 = this.j0 + 1;
            }
        }
    }

    @Override // qf.g
    public final void o(Canvas canvas) {
    }
}
