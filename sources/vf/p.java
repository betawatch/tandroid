package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import eg.b1;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.il0;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] A1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.t0 = true;
        this.u0 = true;
    }

    @Override // vf.g
    public final void C(int i10, int i11) {
        wf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        int i12 = this.p0;
        float f10 = this.D0;
        float f11 = (this.d0.k * f10) - g.h1;
        wf.d dVar = (wf.d) bVar;
        float[] fArr = dVar.b;
        float f12 = (i10 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.p0 = 0;
        } else if (f12 > 1.0f) {
            this.p0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f12, this.C, this.D);
            this.p0 = b10;
            int i13 = this.D;
            if (b10 > i13) {
                this.p0 = i13;
            }
            int i14 = this.p0;
            int i15 = this.C;
            if (i14 < i15) {
                this.p0 = i15;
            }
        }
        if (i12 != this.p0) {
            this.r0 = true;
            c(true);
            x(f11);
            e eVar = this.N0;
            if (eVar != null) {
                getSelectedDate();
                q91 q91Var = (q91) ((il0) eVar).b;
                q91Var.f();
                q91Var.b.q0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // vf.g
    public final void K() {
        if (g.y1) {
            int length = ((wf.d) this.e0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    xf.h hVar = (xf.h) arrayList.get(i11);
                    if (hVar.n) {
                        j11 += hVar.a.a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.i0) {
                    this.i0 = f10;
                    Animator animator = this.a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.g0, this.i0, new b1(this, 13));
                    this.a0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // vf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // vf.g
    public final xf.f h(wf.a aVar) {
        return new xf.h(aVar, this.T0);
    }

    @Override // vf.g
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        wf.b bVar = this.e0;
        if (bVar == null) {
            return;
        }
        float f15 = this.C0;
        j jVar = this.d0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.h1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((wf.d) bVar).b;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f10 = (f18 - f22) * f21;
            f11 = f22;
        }
        int i13 = ((int) (f19 / f11)) + 1;
        int max = Math.max(0, (this.C - i13) - 2);
        int min = Math.min(((wf.d) this.e0).b.length - 1, this.D + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((xf.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.v0;
        if (i15 == 2) {
            this.c0 = true;
            this.s0 = 0.0f;
            xf.j jVar2 = this.w0;
            float f23 = jVar2.f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                xf.j jVar3 = this.w0;
                float f24 = jVar3.f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.e);
                f13 = f24;
            } else {
                f13 = i15 == 3 ? this.w0.f : 1.0f;
            }
        }
        boolean z4 = this.p0 >= 0 && this.r0;
        while (true) {
            i10 = g.k1;
            if (max > min) {
                break;
            }
            if (this.p0 != max || !z4) {
                int i16 = 0;
                float f25 = 0.0f;
                while (i16 < arrayList.size()) {
                    xf.f fVar = (xf.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        long[] jArr = fVar.a.a;
                        float f26 = (((f18 - f11) * ((wf.d) this.e0).b[max]) + (f11 / f12)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (jArr[i12] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i17 = fVar.j;
                        int i18 = i17 + 1;
                        fVar.j = i18;
                        fArr2[i17] = f26;
                        int i19 = i17 + 2;
                        fVar.j = i19;
                        fArr2[i18] = measuredHeight2 - f25;
                        int i20 = i17 + 3;
                        fVar.j = i20;
                        fArr2[i19] = f26;
                        fVar.j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.s) - f25;
                        f25 += measuredHeight;
                    } else {
                        i11 = min;
                        i12 = max;
                    }
                    i16++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            xf.h hVar = (xf.h) arrayList.get(i21);
            Paint paint = (z4 || this.c0) ? hVar.q : hVar.c;
            if (z4) {
                f14 = 255.0f;
                hVar.q.setColor(i0.a.d(this.s0, hVar.m, hVar.r));
            } else {
                f14 = 255.0f;
            }
            if (this.c0) {
                hVar.q.setColor(i0.a.d(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z4) {
            int i22 = 0;
            float f27 = 0.0f;
            while (i22 < arrayList.size()) {
                xf.f fVar2 = (xf.f) arrayList.get(i22);
                boolean z10 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z10 || fVar2.o != 0.0f) {
                    long[] jArr2 = fVar2.a.a;
                    float f28 = (((f18 - f11) * ((wf.d) this.e0).b[this.p0]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (jArr2[r15] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar2.o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.s) - f27, paint2);
                    f27 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // vf.g
    public final void n(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        wf.b bVar = this.e0;
        if (bVar != null) {
            int length = ((wf.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((xf.f) arrayList.get(i12)).j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.A1;
            if (jArr == null || jArr.length < size) {
                this.A1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f11 = ((wf.d) this.e0).b[i13] * this.z0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    xf.f fVar = (xf.f) arrayList.get(i14);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j10 = fVar.a.a[i13];
                        long[] jArr2 = this.A1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = 0;
                    float f12 = 0.0f;
                    while (i15 < size) {
                        xf.f fVar2 = (xf.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f10) {
                            float f13 = g.y1 ? this.g0 : ((wf.d) this.e0).e;
                            long[] jArr3 = this.A1;
                            i10 = i13;
                            float f14 = (jArr3[i15] / f13) * fVar2.o;
                            int i16 = this.y0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.k;
                            int i17 = fVar2.j;
                            int i18 = i17 + 1;
                            fVar2.j = i18;
                            fArr[i17] = f11;
                            int i19 = i17 + 2;
                            fVar2.j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f15) - f12;
                            int i20 = i17 + 3;
                            fVar2.j = i20;
                            fArr[i19] = f11;
                            fVar2.j = i17 + 4;
                            fArr[i20] = i16 - f12;
                            f12 += f15;
                            jArr3[i15] = 0;
                        } else {
                            i11 = length;
                            i10 = i13;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f10 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            wf.b bVar2 = this.e0;
            float f16 = ((wf.d) bVar2).b.length < 2 ? 1.0f : ((wf.d) bVar2).b[1] * this.z0;
            for (int i21 = 0; i21 < size; i21++) {
                xf.f fVar3 = (xf.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f16);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // vf.g, android.view.View
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
                l(canvas, (xf.d) arrayList.get(i11));
                p(canvas, (xf.d) arrayList.get(this.k0));
                i10 = this.k0 + 1;
            }
        }
    }

    @Override // vf.g
    public final long r(int i10, int i11) {
        return ((wf.d) this.e0).m.rMaxQ(i10, i11);
    }

    @Override // vf.g
    public final void u() {
        super.u();
        this.g0 = 0.0f;
        int length = ((wf.d) this.e0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                xf.h hVar = (xf.h) arrayList.get(i11);
                if (hVar.n) {
                    j10 += hVar.a.a[i10];
                }
            }
            float f10 = j10;
            if (f10 > this.g0) {
                this.g0 = f10;
            }
        }
    }

    @Override // vf.g
    public final void z() {
        int length = ((wf.a) ((wf.d) this.e0).d.get(0)).a.length;
        int size = ((wf.d) this.e0).d.size();
        ((wf.d) this.e0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((wf.d) this.e0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((xf.h) this.d.get(i11)).n) {
                    wf.b bVar = this.e0;
                    long[] jArr = ((wf.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((wf.a) ((wf.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        wf.b bVar2 = this.e0;
        ((wf.d) bVar2).m = new SegmentTree(((wf.d) bVar2).l);
        super.z();
    }

    @Override // vf.g
    public final void o(Canvas canvas) {
    }
}
