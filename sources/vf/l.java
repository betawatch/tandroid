package vf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l extends g {
    @Override // vf.g
    public final xf.f h(wf.a aVar) {
        return new xf.f(aVar, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    @Override // vf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        if (this.e0 == null) {
            return;
        }
        float f15 = this.C0;
        j jVar = this.d0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.h1;
        float f20 = (f17 * f18) - f19;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            xf.f fVar = (xf.f) arrayList.get(i13);
            boolean z10 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z10 || fVar.o != 0.0f) {
                float[] fArr2 = this.e0.b;
                float f21 = fArr2.length < 2 ? 0.0f : fArr2[1] * f18;
                long[] jArr = fVar.a.a;
                int i14 = ((int) (f19 / f21)) + 1;
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
                    float f22 = f18;
                    float f23 = f20;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f19;
                        i11 = i13;
                    } else {
                        f14 = f19;
                        float f24 = (this.e0.b[max] * f22) - f23;
                        float f25 = this.w;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i11 = i13;
                        float c3 = ai.c((getMeasuredHeight() - this.s) - g.k1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z4) {
                            if (z11) {
                                path.moveTo(f24 - (f21 / 2.0f), c3);
                                z11 = false;
                            } else {
                                path.lineTo(f24 - (f21 / 2.0f), c3);
                            }
                            path.lineTo((f21 / 2.0f) + f24, c3);
                        } else if (i15 == 0) {
                            float f27 = f21 / 2.0f;
                            fArr[i15] = f24 - f27;
                            fArr[i15 + 1] = c3;
                            float f28 = f24 + f27;
                            fArr[i15 + 2] = f28;
                            fArr[i15 + 3] = c3;
                            int i16 = i15 + 5;
                            fArr[i15 + 4] = f28;
                            i15 += 6;
                            fArr[i16] = c3;
                        } else if (max == min) {
                            float f29 = f21 / 2.0f;
                            float f30 = f24 - f29;
                            fArr[i15] = f30;
                            fArr[i15 + 1] = c3;
                            fArr[i15 + 2] = f30;
                            fArr[i15 + 3] = c3;
                            float f31 = f24 + f29;
                            fArr[i15 + 4] = f31;
                            fArr[i15 + 5] = c3;
                            fArr[i15 + 6] = f31;
                            fArr[i15 + 7] = c3;
                            int i17 = i15 + 9;
                            fArr[i15 + 8] = f31;
                            i15 += 10;
                            fArr[i17] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f32 = f21 / 2.0f;
                            float f33 = f24 - f32;
                            fArr[i15] = f33;
                            fArr[i15 + 1] = c3;
                            fArr[i15 + 2] = f33;
                            fArr[i15 + 3] = c3;
                            float f34 = f24 + f32;
                            fArr[i15 + 4] = f34;
                            fArr[i15 + 5] = c3;
                            int i18 = i15 + 7;
                            fArr[i15 + 6] = f34;
                            i15 += 8;
                            fArr[i18] = c3;
                        }
                    }
                    max++;
                    f18 = f22;
                    f20 = f23;
                    f19 = f14;
                    i13 = i11;
                }
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i10 = i13;
                canvas.save();
                int i19 = this.v0;
                float f35 = 1.0f;
                if (i19 == 2) {
                    xf.j jVar2 = this.w0;
                    float f36 = jVar2.f;
                    f13 = f36 > 0.5f ? 0.0f : 1.0f - (f36 * 2.0f);
                    canvas.scale((f36 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i19 == 1) {
                    float f37 = this.w0.f;
                    f13 = f37 < 0.3f ? 0.0f : f37;
                    canvas.save();
                    xf.j jVar3 = this.w0;
                    float f38 = jVar3.f;
                    canvas.scale(f38, f38, jVar3.d, jVar3.e);
                } else {
                    if (i19 == 3) {
                        f35 = this.w0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f35));
                    if (this.D - this.C <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z4) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i15, paint);
                    }
                    canvas.restore();
                }
                f35 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f35));
                if (this.D - this.C <= 100) {
                }
                if (z4) {
                }
                canvas.restore();
            } else {
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i10 = i13;
            }
            i13 = i10 + 1;
            f18 = f10;
            f20 = f11;
            f19 = f12;
            i12 = 0;
        }
    }

    @Override // vf.g
    public final void n(Canvas canvas) {
        boolean z4;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        float f10;
        float f11;
        float f12;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        wf.b bVar = this.e0;
        if (bVar != null) {
            float[] fArr = bVar.b;
            float f13 = fArr.length < 2 ? 1.0f : fArr[1] * this.z0;
            int i12 = 0;
            while (i12 < size) {
                xf.f fVar = (xf.f) arrayList3.get(i12);
                boolean z10 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr2 = fVar.l;
                Path path = fVar.e;
                if (z10 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.e0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i13 = 0;
                    int i14 = 0;
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
                        } else {
                            wf.b bVar2 = this.e0;
                            arrayList2 = arrayList3;
                            float f14 = this.z0 * bVar2.b[i14];
                            boolean z11 = g.y1;
                            if (z11) {
                                f10 = this.g0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f10 = bVar2.e;
                            }
                            if (z11) {
                                f12 = this.h0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = bVar2.f;
                            }
                            float f15 = (1.0f - ((j10 - f12) / (f11 - f12))) * this.y0;
                            if (!z4) {
                                if (i14 == 0) {
                                    path.moveTo(f14 - (f13 / 2.0f), f15);
                                } else {
                                    path.lineTo(f14 - (f13 / 2.0f), f15);
                                }
                                path.lineTo((f13 / 2.0f) + f14, f15);
                            } else if (i13 == 0) {
                                float f16 = f13 / 2.0f;
                                fArr2[i13] = f14 - f16;
                                fArr2[i13 + 1] = f15;
                                float f17 = f14 + f16;
                                fArr2[i13 + 2] = f17;
                                fArr2[i13 + 3] = f15;
                                int i15 = i13 + 5;
                                fArr2[i13 + 4] = f17;
                                i13 += 6;
                                fArr2[i15] = f15;
                            } else if (i14 == length - 1) {
                                float f18 = f13 / 2.0f;
                                float f19 = f14 - f18;
                                fArr2[i13] = f19;
                                fArr2[i13 + 1] = f15;
                                fArr2[i13 + 2] = f19;
                                fArr2[i13 + 3] = f15;
                                float f20 = f14 + f18;
                                fArr2[i13 + 4] = f20;
                                fArr2[i13 + 5] = f15;
                                fArr2[i13 + 6] = f20;
                                fArr2[i13 + 7] = f15;
                                int i16 = i13 + 9;
                                fArr2[i13 + 8] = f20;
                                i13 += 10;
                                fArr2[i16] = 0.0f;
                            } else {
                                float f21 = f13 / 2.0f;
                                float f22 = f14 - f21;
                                fArr2[i13] = f22;
                                fArr2[i13 + 1] = f15;
                                fArr2[i13 + 2] = f22;
                                fArr2[i13 + 3] = f15;
                                float f23 = f14 + f21;
                                fArr2[i13 + 4] = f23;
                                fArr2[i13 + 5] = f15;
                                int i17 = i13 + 7;
                                fArr2[i13 + 6] = f23;
                                i13 += 8;
                                fArr2[i17] = f15;
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.j = i13;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr2, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i12++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override // vf.g
    public final void t() {
        this.M0 = true;
        super.t();
    }
}
