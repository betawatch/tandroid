package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import eg.b1;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k extends g {
    @Override // vf.g
    public final void K() {
        if (g.y1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((xf.f) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xf.f fVar = (xf.f) obj;
                if (fVar.n) {
                    long j11 = fVar.a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = (long) (j10 * ((wf.c) this.e0).l[1]);
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.i0) {
                    this.i0 = f10;
                    Animator animator = this.a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.g0, this.i0, new b1(this, 12));
                    this.a0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // vf.g
    public final xf.d f(int i10, long j10, long j11) {
        float f10;
        float[] fArr = ((wf.c) this.e0).l;
        if (fArr.length < 2) {
            f10 = 1.0f;
        } else {
            f10 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new xf.d(j10, j11, this.M0, f10, i10, this.K, this.L);
    }

    @Override // vf.g
    public final xf.f h(wf.a aVar) {
        return new xf.f(aVar, false, this.T0);
    }

    @Override // vf.g
    public final void k(Canvas canvas) {
        float f10;
        boolean z4;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z10;
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
        canvas.save();
        int i11 = this.v0;
        int i12 = 2;
        if (i11 == 2) {
            xf.j jVar2 = this.w0;
            float f21 = jVar2.f;
            f10 = f21 > 0.5f ? 0.0f : 1.0f - (f21 * 2.0f);
            canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i11 == 1) {
            float f22 = this.w0.f;
            f10 = f22 < 0.3f ? 0.0f : f22;
            canvas.save();
            xf.j jVar3 = this.w0;
            float f23 = jVar3.f;
            canvas.scale(f23, f23, jVar3.d, jVar3.e);
        } else {
            f10 = i11 == 3 ? this.w0.f : 1.0f;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            xf.f fVar = (xf.f) arrayList.get(i14);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                long[] jArr = fVar.a.a;
                path.reset();
                float[] fArr2 = ((wf.c) this.e0).b;
                int i15 = ((int) (f19 / (fArr2.length < i12 ? 1.0f : fArr2[1] * f18))) + 1;
                int max = Math.max(i13, this.C - i15);
                int min = Math.min(((wf.c) this.e0).b.length - 1, this.D + i15);
                boolean z12 = true;
                int i16 = 0;
                while (true) {
                    z4 = g.x1;
                    if (max > min) {
                        break;
                    }
                    float f24 = f18;
                    float f25 = f20;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f19;
                        i10 = min;
                        z10 = z12;
                    } else {
                        f14 = f19;
                        wf.c cVar = (wf.c) this.e0;
                        i10 = min;
                        float f26 = (cVar.b[max] * f24) - f25;
                        float f27 = j10 * cVar.l[i14];
                        float f28 = this.w;
                        float f29 = (f27 - f28) / (this.v - f28);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        z10 = z12;
                        float c3 = ai.c((getMeasuredHeight() - this.s) - g.k1, strokeWidth, f29, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z4) {
                            if (i16 == 0) {
                                int i17 = i16 + 1;
                                fArr[i16] = f26;
                                i16 += 2;
                                fArr[i17] = c3;
                            } else {
                                fArr[i16] = f26;
                                fArr[i16 + 1] = c3;
                                int i18 = i16 + 3;
                                fArr[i16 + 2] = f26;
                                i16 += 4;
                                fArr[i18] = c3;
                            }
                        } else if (z10) {
                            path.moveTo(f26, c3);
                            z12 = false;
                            max++;
                            f18 = f24;
                            f20 = f25;
                            f19 = f14;
                            min = i10;
                        } else {
                            path.lineTo(f26, c3);
                        }
                    }
                    z12 = z10;
                    max++;
                    f18 = f24;
                    f20 = f25;
                    f19 = f14;
                    min = i10;
                }
                f11 = f18;
                f12 = f20;
                f13 = f19;
                if (this.D - this.C > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (fVar.o * 255.0f * f10));
                if (z4) {
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                f11 = f18;
                f12 = f20;
                f13 = f19;
            }
            i14++;
            f18 = f11;
            f20 = f12;
            f19 = f13;
            i13 = 0;
            i12 = 2;
        }
    }

    @Override // vf.g
    public final void n(Canvas canvas) {
        boolean z4;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i15 = g.n1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.y0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.e0 != null) {
            int i17 = 0;
            while (i17 < size) {
                xf.f fVar = (xf.f) arrayList3.get(i17);
                boolean z10 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z10 || fVar.o != 0.0f) {
                    path.reset();
                    int length = ((wf.c) this.e0).b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z4 = g.x1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j10 = jArr[i19];
                        if (j10 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            wf.b bVar = this.e0;
                            float f11 = this.z0 * ((wf.c) bVar).b[i19];
                            if (g.y1) {
                                arrayList2 = arrayList3;
                                f10 = this.g0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f10 = ((wf.c) bVar).e;
                            }
                            float f12 = (1.0f - ((j10 * ((wf.c) bVar).l[i20]) / f10)) * (i13 - i14);
                            if (z4) {
                                if (i18 == 0) {
                                    int i21 = i18 + 1;
                                    fArr[i18] = f11;
                                    i18 += 2;
                                    fArr[i21] = f12;
                                } else {
                                    fArr[i18] = f11;
                                    fArr[i18 + 1] = f12;
                                    int i22 = i18 + 3;
                                    fArr[i18 + 2] = f11;
                                    i18 += 4;
                                    fArr[i22] = f12;
                                }
                            } else if (i19 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i19++;
                        i17 = i20;
                        i16 = i13;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i14;
                    }
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                    fVar.j = i18;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i17 = i12 + 1;
                        i16 = i10;
                        arrayList3 = arrayList;
                        measuredHeight2 = i11;
                    }
                } else {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                }
                i17 = i12 + 1;
                i16 = i10;
                arrayList3 = arrayList;
                measuredHeight2 = i11;
            }
        }
    }

    @Override // vf.g
    public final void o(Canvas canvas) {
        int i10 = this.p0;
        if (i10 < 0 || !this.r0) {
            return;
        }
        int i11 = (int) (this.r * this.s0);
        float f10 = this.C0;
        j jVar = this.d0;
        float f11 = jVar.l;
        float f12 = jVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = (((wf.c) this.e0).b[i10] * f13) - ((f12 * f13) - g.h1);
        Paint paint = this.J;
        paint.setAlpha(i11);
        canvas.drawLine(f14, 0.0f, f14, this.E0.bottom, paint);
        ArrayList arrayList = this.d;
        this.j0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.k0 = i12;
            int i13 = this.k0;
            if (i13 >= this.j0) {
                return;
            }
            xf.f fVar = (xf.f) arrayList.get(i13);
            boolean z4 = fVar.n;
            Paint paint2 = fVar.d;
            if (z4 || fVar.o != 0.0f) {
                float f15 = fVar.a.a[this.p0] * ((wf.c) this.e0).l[this.k0];
                float f16 = this.w;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.s) - g.k1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.s0));
                int i14 = (int) (fVar.o * 255.0f * this.s0);
                Paint paint3 = this.P;
                paint3.setAlpha(i14);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i12 = this.k0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    @Override // vf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, xf.d dVar) {
        float f10;
        int i10;
        float f11;
        float f12;
        int i11;
        int i12;
        TextPaint textPaint;
        int i13;
        int i14;
        xf.d dVar2 = dVar;
        long[] jArr = dVar2.a;
        CharSequence[] charSequenceArr = dVar2.c;
        int length = jArr.length;
        int i15 = 0;
        int i16 = ((wf.c) this.e0).l[0] == 1.0f ? 1 : 0;
        int i17 = (i16 + 1) % 2;
        if (length > 2) {
            float f13 = (jArr[1] - jArr[0]) / (this.v - this.w);
            if (f13 < 0.1d) {
                f10 = f13 / 0.1f;
                i10 = this.v0;
                if (i10 != 2) {
                    f12 = 1.0f - this.w0.f;
                } else if (i10 == 1) {
                    f12 = this.w0.f;
                } else {
                    if (i10 != 3) {
                        f11 = 1.0f;
                        this.I.setAlpha((int) (dVar2.f * 0.1f * f11));
                        int measuredHeight = getMeasuredHeight() - this.s;
                        int i18 = g.k1;
                        int i19 = measuredHeight - i18;
                        TextPaint textPaint2 = this.K;
                        int textSize = (int) (i18 - textPaint2.getTextSize());
                        while (i15 < length) {
                            float measuredHeight2 = getMeasuredHeight() - this.s;
                            int i20 = i17;
                            float f14 = dVar2.a[i15];
                            float f15 = this.w;
                            int i21 = (int) (measuredHeight2 - (((f14 - f15) / (this.v - f15)) * i19));
                            CharSequence[] charSequenceArr2 = dVar2.b;
                            ArrayList arrayList = this.d;
                            if (charSequenceArr2 == null || arrayList.size() <= 0) {
                                i11 = i19;
                                i12 = textSize;
                                textPaint = textPaint2;
                                i13 = i20;
                            } else {
                                if (charSequenceArr == null || arrayList.size() < 2) {
                                    i14 = i20;
                                    textPaint2.setColor(j6.v0(j6.Yi, this.T0));
                                    textPaint2.setAlpha((int) e2.c.z(dVar2.f, this.f, f11, f10));
                                } else {
                                    i14 = i20;
                                    textPaint2.setColor(((xf.f) arrayList.get(i14)).m);
                                    textPaint2.setAlpha((int) e2.c.z(dVar2.f, ((xf.f) arrayList.get(i14)).o, f11, f10));
                                }
                                i13 = i14;
                                i12 = textSize;
                                i11 = i19;
                                dVar2.a(canvas, 0, i15, g.h1, i21 - textSize, textPaint2);
                                textPaint = textPaint2;
                            }
                            if (charSequenceArr != null && arrayList.size() > 1) {
                                int i22 = ((xf.f) arrayList.get(i16)).m;
                                TextPaint textPaint3 = this.L;
                                textPaint3.setColor(i22);
                                textPaint3.setAlpha((int) e2.c.z(dVar2.f, ((xf.f) arrayList.get(i16)).o, f11, f10));
                                dVar2.a(canvas, 1, i15, getMeasuredWidth() - g.h1, i21 - i12, textPaint3);
                            }
                            i15++;
                            dVar2 = dVar;
                            i19 = i11;
                            i17 = i13;
                            textSize = i12;
                            textPaint2 = textPaint;
                        }
                    }
                    f12 = this.w0.f;
                }
                f11 = f12;
                this.I.setAlpha((int) (dVar2.f * 0.1f * f11));
                int measuredHeight3 = getMeasuredHeight() - this.s;
                int i182 = g.k1;
                int i192 = measuredHeight3 - i182;
                TextPaint textPaint22 = this.K;
                int textSize2 = (int) (i182 - textPaint22.getTextSize());
                while (i15 < length) {
                }
            }
        }
        f10 = 1.0f;
        i10 = this.v0;
        if (i10 != 2) {
        }
        f11 = f12;
        this.I.setAlpha((int) (dVar2.f * 0.1f * f11));
        int measuredHeight32 = getMeasuredHeight() - this.s;
        int i1822 = g.k1;
        int i1922 = measuredHeight32 - i1822;
        TextPaint textPaint222 = this.K;
        int textSize22 = (int) (i1822 - textPaint222.getTextSize());
        while (i15 < length) {
        }
    }

    @Override // vf.g
    public final long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            long rMaxQ = ((xf.f) arrayList.get(i12)).n ? (long) (((wf.a) ((wf.c) this.e0).d.get(i12)).b.rMaxQ(i10, i11) * ((wf.c) this.e0).l[i12]) : 0L;
            if (rMaxQ > j10) {
                j10 = rMaxQ;
            }
        }
        return j10;
    }

    @Override // vf.g
    public final long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            long rMinQ = ((xf.f) arrayList.get(i12)).n ? (int) (((wf.a) ((wf.c) this.e0).d.get(i12)).b.rMinQ(i10, i11) * ((wf.c) this.e0).l[i12]) : 2147483647L;
            if (rMinQ < j10) {
                j10 = rMinQ;
            }
        }
        return j10;
    }

    @Override // vf.g
    public final void t() {
        this.M0 = true;
        super.t();
    }
}
