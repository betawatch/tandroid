package rf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // rf.g
    public final tf.f h(sf.a aVar) {
        return new tf.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    @Override // rf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        int i11;
        if (this.d0 == null) {
            return;
        }
        float f17 = this.B0;
        j jVar = this.c0;
        float f18 = jVar.l;
        float f19 = jVar.k;
        float f20 = f17 / (f18 - f19);
        float f21 = g.g1;
        float f22 = (f19 * f20) - f21;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            tf.f fVar = (tf.f) arrayList.get(i13);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.d0.b;
                float f23 = fArr2.length < 2 ? 0.0f : fArr2[1] * f20;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f21 / f23)) + 1;
                path.reset();
                int max = Math.max(i12, this.B - i14);
                int min = Math.min(this.d0.b.length - 1, this.C + i14);
                boolean z12 = true;
                int i15 = 0;
                while (true) {
                    z10 = g.w1;
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
                        float f24 = (this.d0.b[max] * f14) - f22;
                        float f25 = this.w;
                        f15 = f22;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f16 = f21;
                        i10 = min;
                        float b10 = pa.b((getMeasuredHeight() - this.s) - g.j1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                fArr[i16] = f24;
                                i11 = i16 + 2;
                                fArr[i16 + 1] = b10;
                            } else {
                                fArr[i16] = f24;
                                fArr[i16 + 1] = b10;
                                fArr[i16 + 2] = f24;
                                i11 = i16 + 4;
                                fArr[i16 + 3] = b10;
                            }
                            i15 = i11;
                        } else if (z12) {
                            path.moveTo(f24, b10);
                            i15 = i16;
                            z12 = false;
                        } else {
                            path.lineTo(f24, b10);
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
                int i18 = this.u0;
                float f27 = 1.0f;
                if (i18 == 2) {
                    tf.j jVar2 = this.v0;
                    float f28 = jVar2.f;
                    f13 = f28 > 0.5f ? 0.0f : 1.0f - (f28 * 2.0f);
                    canvas.scale((f28 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i18 == 1) {
                    float f29 = this.v0.f;
                    f13 = f29 < 0.3f ? 0.0f : f29;
                    canvas.save();
                    tf.j jVar3 = this.v0;
                    float f30 = jVar3.f;
                    canvas.scale(f30, f30, jVar3.d, jVar3.e);
                } else {
                    if (i18 == 3) {
                        f27 = this.v0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f27));
                    if (this.C - this.B <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i17, paint);
                    }
                    canvas.restore();
                }
                f27 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f27));
                if (this.C - this.B <= 100) {
                }
                if (z10) {
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

    @Override // rf.g
    public final void n(Canvas canvas) {
        boolean z10;
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
        if (this.d0 != null) {
            int i13 = 0;
            while (i13 < size) {
                tf.f fVar = (tf.f) arrayList3.get(i13);
                boolean z11 = fVar.n;
                Paint paint2 = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.d0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = g.w1;
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
                            sf.b bVar = this.d0;
                            arrayList2 = arrayList3;
                            float f12 = this.y0 * bVar.b[i14];
                            boolean z12 = g.x1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f10 = this.f0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f10 = bVar.e;
                            }
                            if (z12) {
                                f11 = this.g0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = bVar.f;
                            }
                            float f13 = (1.0f - ((j10 - f11) / (f10 - f11))) * this.x0;
                            if (z10) {
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
                        if (z10) {
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

    @Override // rf.g
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
