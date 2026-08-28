package qf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import f2.f0;
import j3.r0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends g {
    @Override // qf.g
    public final void K() {
        if (g.x1) {
            ArrayList arrayList = this.d;
            int i9 = 0;
            if (((sf.f) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                sf.f fVar = (sf.f) obj;
                if (fVar.n) {
                    long j11 = fVar.a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = (long) (j10 * ((rf.c) this.d0).l[1]);
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.h0) {
                    this.h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f0, this.h0, new f0(this, 10));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // qf.g
    public final sf.d f(int i9, long j10, long j11) {
        float f10;
        float[] fArr = ((rf.c) this.d0).l;
        if (fArr.length < 2) {
            f10 = 1.0f;
        } else {
            f10 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new sf.d(j10, j11, this.L0, f10, i9, this.J, this.K);
    }

    @Override // qf.g
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, false, this.S0);
    }

    @Override // qf.g
    public final void k(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i9;
        boolean z11;
        if (this.d0 == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.c0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.g1;
        float f20 = (f17 * f18) - f19;
        canvas.save();
        int i10 = this.u0;
        int i11 = 2;
        if (i10 == 2) {
            sf.j jVar2 = this.v0;
            float f21 = jVar2.f;
            f10 = f21 > 0.5f ? 0.0f : 1.0f - (f21 * 2.0f);
            canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i10 == 1) {
            float f22 = this.v0.f;
            f10 = f22 < 0.3f ? 0.0f : f22;
            canvas.save();
            sf.j jVar3 = this.v0;
            float f23 = jVar3.f;
            canvas.scale(f23, f23, jVar3.d, jVar3.e);
        } else {
            f10 = i10 == 3 ? this.v0.f : 1.0f;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            sf.f fVar = (sf.f) arrayList.get(i13);
            boolean z12 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z12 || fVar.o != 0.0f) {
                long[] jArr = fVar.a.a;
                path.reset();
                float[] fArr2 = ((rf.c) this.d0).b;
                int i14 = ((int) (f19 / (fArr2.length < i11 ? 1.0f : fArr2[1] * f18))) + 1;
                int max = Math.max(i12, this.B - i14);
                int min = Math.min(((rf.c) this.d0).b.length - 1, this.C + i14);
                boolean z13 = true;
                int i15 = 0;
                while (true) {
                    z10 = g.w1;
                    if (max > min) {
                        break;
                    }
                    float f24 = f18;
                    float f25 = f20;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f19;
                        i9 = min;
                        z11 = z13;
                    } else {
                        f14 = f19;
                        rf.c cVar = (rf.c) this.d0;
                        i9 = min;
                        float f26 = (cVar.b[max] * f24) - f25;
                        float f27 = j10 * cVar.l[i13];
                        float f28 = this.w;
                        float f29 = (f27 - f28) / (this.v - f28);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        z11 = z13;
                        float C = r0.C((getMeasuredHeight() - this.s) - g.j1, strokeWidth, f29, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i15 == 0) {
                                int i16 = i15 + 1;
                                fArr[i15] = f26;
                                i15 += 2;
                                fArr[i16] = C;
                            } else {
                                fArr[i15] = f26;
                                fArr[i15 + 1] = C;
                                int i17 = i15 + 3;
                                fArr[i15 + 2] = f26;
                                i15 += 4;
                                fArr[i17] = C;
                            }
                        } else if (z11) {
                            path.moveTo(f26, C);
                            z13 = false;
                            max++;
                            f18 = f24;
                            f20 = f25;
                            f19 = f14;
                            min = i9;
                        } else {
                            path.lineTo(f26, C);
                        }
                    }
                    z13 = z11;
                    max++;
                    f18 = f24;
                    f20 = f25;
                    f19 = f14;
                    min = i9;
                }
                f11 = f18;
                f12 = f20;
                f13 = f19;
                if (this.C - this.B > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (fVar.o * 255.0f * f10));
                if (z10) {
                    canvas.drawLines(fArr, 0, i15, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                f11 = f18;
                f12 = f20;
                f13 = f19;
            }
            i13++;
            f18 = f11;
            f20 = f12;
            f19 = f13;
            i12 = 0;
            i11 = 2;
        }
    }

    @Override // qf.g
    public final void n(Canvas canvas) {
        boolean z10;
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.m1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.x0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.d0 != null) {
            int i16 = 0;
            while (i16 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i16);
                boolean z11 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = ((rf.c) this.d0).b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z10 = g.w1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j10 = jArr[i18];
                        if (j10 < 0) {
                            i12 = i15;
                            arrayList2 = arrayList3;
                            i13 = measuredHeight2;
                        } else {
                            i12 = i15;
                            rf.b bVar = this.d0;
                            float f11 = this.y0 * ((rf.c) bVar).b[i18];
                            if (g.x1) {
                                arrayList2 = arrayList3;
                                f10 = this.f0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = ((rf.c) bVar).e;
                            }
                            float f12 = (1.0f - ((j10 * ((rf.c) bVar).l[i19]) / f10)) * (i12 - i13);
                            if (z10) {
                                if (i17 == 0) {
                                    int i20 = i17 + 1;
                                    fArr[i17] = f11;
                                    i17 += 2;
                                    fArr[i20] = f12;
                                } else {
                                    fArr[i17] = f11;
                                    fArr[i17 + 1] = f12;
                                    int i21 = i17 + 3;
                                    fArr[i17 + 2] = f11;
                                    i17 += 4;
                                    fArr[i21] = f12;
                                }
                            } else if (i18 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i18++;
                        i16 = i19;
                        i15 = i12;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i13;
                    }
                    i9 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.j = i17;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i16 = i11 + 1;
                        i15 = i9;
                        arrayList3 = arrayList;
                        measuredHeight2 = i10;
                    }
                } else {
                    i9 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                }
                i16 = i11 + 1;
                i15 = i9;
                arrayList3 = arrayList;
                measuredHeight2 = i10;
            }
        }
    }

    @Override // qf.g
    public final void o(Canvas canvas) {
        int i9 = this.o0;
        if (i9 < 0 || !this.q0) {
            return;
        }
        int i10 = (int) (this.r * this.r0);
        float f10 = this.B0;
        j jVar = this.c0;
        float f11 = jVar.l;
        float f12 = jVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = (((rf.c) this.d0).b[i9] * f13) - ((f12 * f13) - g.g1);
        Paint paint = this.I;
        paint.setAlpha(i10);
        canvas.drawLine(f14, 0.0f, f14, this.D0.bottom, paint);
        ArrayList arrayList = this.d;
        this.i0 = arrayList.size();
        int i11 = 0;
        while (true) {
            this.j0 = i11;
            int i12 = this.j0;
            if (i12 >= this.i0) {
                return;
            }
            sf.f fVar = (sf.f) arrayList.get(i12);
            boolean z10 = fVar.n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.o != 0.0f) {
                float f15 = fVar.a.a[this.o0] * ((rf.c) this.d0).l[this.j0];
                float f16 = this.w;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.s) - g.j1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.r0));
                int i13 = (int) (fVar.o * 255.0f * this.r0);
                Paint paint3 = this.O;
                paint3.setAlpha(i13);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i11 = this.j0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, sf.d dVar) {
        float f10;
        int i9;
        float f11;
        float f12;
        int i10;
        int i11;
        TextPaint textPaint;
        int i12;
        int i13;
        sf.d dVar2 = dVar;
        long[] jArr = dVar2.a;
        CharSequence[] charSequenceArr = dVar2.c;
        int length = jArr.length;
        int i14 = 0;
        int i15 = ((rf.c) this.d0).l[0] == 1.0f ? 1 : 0;
        int i16 = (i15 + 1) % 2;
        if (length > 2) {
            float f13 = (jArr[1] - jArr[0]) / (this.v - this.w);
            if (f13 < 0.1d) {
                f10 = f13 / 0.1f;
                i9 = this.u0;
                if (i9 != 2) {
                    f12 = 1.0f - this.v0.f;
                } else if (i9 == 1) {
                    f12 = this.v0.f;
                } else {
                    if (i9 != 3) {
                        f11 = 1.0f;
                        this.H.setAlpha((int) (dVar2.f * 0.1f * f11));
                        int measuredHeight = getMeasuredHeight() - this.s;
                        int i17 = g.j1;
                        int i18 = measuredHeight - i17;
                        TextPaint textPaint2 = this.J;
                        int textSize = (int) (i17 - textPaint2.getTextSize());
                        while (i14 < length) {
                            float measuredHeight2 = getMeasuredHeight() - this.s;
                            int i19 = i16;
                            float f14 = dVar2.a[i14];
                            float f15 = this.w;
                            int i20 = (int) (measuredHeight2 - (((f14 - f15) / (this.v - f15)) * i18));
                            CharSequence[] charSequenceArr2 = dVar2.b;
                            ArrayList arrayList = this.d;
                            if (charSequenceArr2 == null || arrayList.size() <= 0) {
                                i10 = i18;
                                i11 = textSize;
                                textPaint = textPaint2;
                                i12 = i19;
                            } else {
                                if (charSequenceArr == null || arrayList.size() < 2) {
                                    i13 = i19;
                                    textPaint2.setColor(f6.v0(f6.Yi, this.S0));
                                    textPaint2.setAlpha((int) e2.c.C(dVar2.f, this.f, f11, f10));
                                } else {
                                    i13 = i19;
                                    textPaint2.setColor(((sf.f) arrayList.get(i13)).m);
                                    textPaint2.setAlpha((int) e2.c.C(dVar2.f, ((sf.f) arrayList.get(i13)).o, f11, f10));
                                }
                                i12 = i13;
                                i11 = textSize;
                                i10 = i18;
                                dVar2.a(canvas, 0, i14, g.g1, i20 - textSize, textPaint2);
                                textPaint = textPaint2;
                            }
                            if (charSequenceArr != null && arrayList.size() > 1) {
                                int i21 = ((sf.f) arrayList.get(i15)).m;
                                TextPaint textPaint3 = this.K;
                                textPaint3.setColor(i21);
                                textPaint3.setAlpha((int) e2.c.C(dVar2.f, ((sf.f) arrayList.get(i15)).o, f11, f10));
                                dVar2.a(canvas, 1, i14, getMeasuredWidth() - g.g1, i20 - i11, textPaint3);
                            }
                            i14++;
                            dVar2 = dVar;
                            i18 = i10;
                            i16 = i12;
                            textSize = i11;
                            textPaint2 = textPaint;
                        }
                    }
                    f12 = this.v0.f;
                }
                f11 = f12;
                this.H.setAlpha((int) (dVar2.f * 0.1f * f11));
                int measuredHeight3 = getMeasuredHeight() - this.s;
                int i172 = g.j1;
                int i182 = measuredHeight3 - i172;
                TextPaint textPaint22 = this.J;
                int textSize2 = (int) (i172 - textPaint22.getTextSize());
                while (i14 < length) {
                }
            }
        }
        f10 = 1.0f;
        i9 = this.u0;
        if (i9 != 2) {
        }
        f11 = f12;
        this.H.setAlpha((int) (dVar2.f * 0.1f * f11));
        int measuredHeight32 = getMeasuredHeight() - this.s;
        int i1722 = g.j1;
        int i1822 = measuredHeight32 - i1722;
        TextPaint textPaint222 = this.J;
        int textSize22 = (int) (i1722 - textPaint222.getTextSize());
        while (i14 < length) {
        }
    }

    @Override // qf.g
    public final long r(int i9, int i10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long rMaxQ = ((sf.f) arrayList.get(i11)).n ? (long) (((rf.a) ((rf.c) this.d0).d.get(i11)).b.rMaxQ(i9, i10) * ((rf.c) this.d0).l[i11]) : 0L;
            if (rMaxQ > j10) {
                j10 = rMaxQ;
            }
        }
        return j10;
    }

    @Override // qf.g
    public final long s(int i9, int i10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            long rMinQ = ((sf.f) arrayList.get(i11)).n ? (int) (((rf.a) ((rf.c) this.d0).d.get(i11)).b.rMinQ(i9, i10) * ((rf.c) this.d0).l[i11]) : 2147483647L;
            if (rMinQ < j10) {
                j10 = rMinQ;
            }
        }
        return j10;
    }

    @Override // qf.g
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
