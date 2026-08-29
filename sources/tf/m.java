package tf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // tf.g
    public final vf.f h(uf.a aVar) {
        return new vf.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    @Override // tf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        int i11;
        if (this.d0 == null) {
            return;
        }
        float f16 = this.B0;
        j jVar = this.c0;
        float f17 = jVar.l;
        float f18 = jVar.k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.g1;
        float f21 = (f18 * f19) - f20;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            vf.f fVar = (vf.f) arrayList.get(i13);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.d0.b;
                float f22 = fArr2.length < 2 ? 0.0f : fArr2[1] * f19;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f20 / f22)) + 1;
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
                        f13 = f19;
                        f14 = f21;
                        f15 = f20;
                        i10 = min;
                    } else {
                        f13 = f19;
                        float f23 = (this.d0.b[max] * f13) - f21;
                        float f24 = this.w;
                        f14 = f21;
                        float f25 = (j10 - f24) / (this.v - f24);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f15 = f20;
                        i10 = min;
                        float b10 = th.b((getMeasuredHeight() - this.s) - g.j1, strokeWidth, f25, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                fArr[i16] = f23;
                                i11 = i16 + 2;
                                fArr[i16 + 1] = b10;
                            } else {
                                fArr[i16] = f23;
                                fArr[i16 + 1] = b10;
                                fArr[i16 + 2] = f23;
                                i11 = i16 + 4;
                                fArr[i16 + 3] = b10;
                            }
                            i15 = i11;
                        } else if (z12) {
                            path.moveTo(f23, b10);
                            i15 = i16;
                            z12 = false;
                        } else {
                            path.lineTo(f23, b10);
                        }
                        max++;
                        f19 = f13;
                        f21 = f14;
                        f20 = f15;
                        min = i10;
                    }
                    i15 = i16;
                    max++;
                    f19 = f13;
                    f21 = f14;
                    f20 = f15;
                    min = i10;
                }
                f9 = f19;
                f10 = f21;
                f11 = f20;
                int i17 = i15;
                canvas.save();
                int i18 = this.u0;
                float f26 = 1.0f;
                if (i18 == 2) {
                    vf.j jVar2 = this.v0;
                    float f27 = jVar2.f;
                    f12 = f27 > 0.5f ? 0.0f : 1.0f - (f27 * 2.0f);
                    canvas.scale((f27 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i18 == 1) {
                    float f28 = this.v0.f;
                    f12 = f28 < 0.3f ? 0.0f : f28;
                    canvas.save();
                    vf.j jVar3 = this.v0;
                    float f29 = jVar3.f;
                    canvas.scale(f29, f29, jVar3.d, jVar3.e);
                } else {
                    if (i18 == 3) {
                        f26 = this.v0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f26));
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
                f26 = f12;
                paint.setAlpha((int) (fVar.o * 255.0f * f26));
                if (this.C - this.B <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f9 = f19;
                f10 = f21;
                f11 = f20;
            }
            i13++;
            f19 = f9;
            f21 = f10;
            f20 = f11;
            i12 = 0;
        }
    }

    @Override // tf.g
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f9;
        float f10;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.d0 != null) {
            int i13 = 0;
            while (i13 < size) {
                vf.f fVar = (vf.f) arrayList3.get(i13);
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
                            uf.b bVar = this.d0;
                            arrayList2 = arrayList3;
                            float f11 = this.y0 * bVar.b[i14];
                            boolean z12 = g.x1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f9 = this.f0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f9 = bVar.e;
                            }
                            if (z12) {
                                f10 = this.g0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f10 = bVar.f;
                            }
                            float f12 = (1.0f - ((j10 - f10) / (f9 - f10))) * this.x0;
                            if (z10) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f11;
                                    i15 += 2;
                                    fArr[i16] = f12;
                                } else {
                                    fArr[i15] = f11;
                                    fArr[i15 + 1] = f12;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f11;
                                    i15 += 4;
                                    fArr[i17] = f12;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
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

    @Override // tf.g
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
