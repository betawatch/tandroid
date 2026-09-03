package wf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // wf.g
    public final yf.f h(xf.a aVar) {
        return new yf.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    @Override // wf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        int i11;
        if (this.e0 == null) {
            return;
        }
        float f17 = this.C0;
        j jVar = this.d0;
        float f18 = jVar.l;
        float f19 = jVar.k;
        float f20 = f17 / (f18 - f19);
        float f21 = g.h1;
        float f22 = (f19 * f20) - f21;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            yf.f fVar = (yf.f) arrayList.get(i13);
            boolean z10 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z10 || fVar.o != 0.0f) {
                float[] fArr2 = this.e0.b;
                float f23 = fArr2.length < 2 ? 0.0f : fArr2[1] * f20;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f21 / f23)) + 1;
                path.reset();
                int max = Math.max(i12, this.C - i14);
                int min = Math.min(this.e0.b.length - 1, this.D + i14);
                boolean z11 = true;
                int i15 = 0;
                while (true) {
                    z4 = g.x1;
                    if (max > min) {
                        break;
                    }
                    int i16 = i15;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f20;
                        f15 = f22;
                        f16 = f21;
                        i10 = min;
                    } else {
                        f14 = f20;
                        float f24 = (this.e0.b[max] * f14) - f22;
                        float f25 = this.w;
                        f15 = f22;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f16 = f21;
                        i10 = min;
                        float c3 = yh.c((getMeasuredHeight() - this.s) - g.k1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z4) {
                            if (i16 == 0) {
                                fArr[i16] = f24;
                                i11 = i16 + 2;
                                fArr[i16 + 1] = c3;
                            } else {
                                fArr[i16] = f24;
                                fArr[i16 + 1] = c3;
                                fArr[i16 + 2] = f24;
                                i11 = i16 + 4;
                                fArr[i16 + 3] = c3;
                            }
                            i15 = i11;
                        } else if (z11) {
                            path.moveTo(f24, c3);
                            i15 = i16;
                            z11 = false;
                        } else {
                            path.lineTo(f24, c3);
                        }
                        max++;
                        f20 = f14;
                        f22 = f15;
                        f21 = f16;
                        min = i10;
                    }
                    i15 = i16;
                    max++;
                    f20 = f14;
                    f22 = f15;
                    f21 = f16;
                    min = i10;
                }
                f10 = f20;
                f11 = f22;
                f12 = f21;
                int i17 = i15;
                canvas.save();
                int i18 = this.v0;
                float f27 = 1.0f;
                if (i18 == 2) {
                    yf.j jVar2 = this.w0;
                    float f28 = jVar2.f;
                    f13 = f28 > 0.5f ? 0.0f : 1.0f - (f28 * 2.0f);
                    canvas.scale((f28 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i18 == 1) {
                    float f29 = this.w0.f;
                    f13 = f29 < 0.3f ? 0.0f : f29;
                    canvas.save();
                    yf.j jVar3 = this.w0;
                    float f30 = jVar3.f;
                    canvas.scale(f30, f30, jVar3.d, jVar3.e);
                } else {
                    if (i18 == 3) {
                        f27 = this.w0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f27));
                    if (this.D - this.C <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z4) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i17, paint);
                    }
                    canvas.restore();
                }
                f27 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f27));
                if (this.D - this.C <= 100) {
                }
                if (z4) {
                }
                canvas.restore();
            } else {
                f10 = f20;
                f11 = f22;
                f12 = f21;
            }
            i13++;
            f20 = f10;
            f22 = f11;
            f21 = f12;
            i12 = 0;
        }
    }

    @Override // wf.g
    public final void n(Canvas canvas) {
        boolean z4;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.e0 != null) {
            int i13 = 0;
            while (i13 < size) {
                yf.f fVar = (yf.f) arrayList3.get(i13);
                boolean z10 = fVar.n;
                Paint paint2 = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z10 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.e0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z4 = g.x1;
                        if (i14 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            xf.b bVar = this.e0;
                            arrayList2 = arrayList3;
                            float f12 = this.z0 * bVar.b[i14];
                            boolean z11 = g.y1;
                            i11 = size;
                            if (z11) {
                                i12 = length;
                                f10 = this.g0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f10 = bVar.e;
                            }
                            if (z11) {
                                f11 = this.h0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = bVar.f;
                            }
                            float f13 = (1.0f - ((j10 - f11) / (f10 - f11))) * this.y0;
                            if (z4) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f12;
                                    i15 += 2;
                                    fArr[i16] = f13;
                                } else {
                                    fArr[i15] = f12;
                                    fArr[i15 + 1] = f13;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f12;
                                    i15 += 4;
                                    fArr[i17] = f13;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f12, f13);
                            } else {
                                path.lineTo(f12, f13);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = i12;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.j = i15;
                    if (fVar.n || fVar.o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr, 0, fVar.j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i13++;
                        arrayList3 = arrayList;
                        size = i10;
                    }
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i13++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override // wf.g
    public final void t() {
        this.M0 = true;
        super.t();
    }
}
