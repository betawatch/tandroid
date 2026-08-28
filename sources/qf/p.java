package qf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import f2.f0;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.c91;
import org.telegram.ui.dl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] z1;

    public p(Context context, b6 b6Var) {
        super(context, b6Var);
        this.s0 = true;
        this.t0 = true;
    }

    @Override // qf.g
    public final void C(int i9, int i10) {
        rf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        int i11 = this.o0;
        float f10 = this.C0;
        float f11 = (this.c0.k * f10) - g.g1;
        rf.d dVar = (rf.d) bVar;
        float[] fArr = dVar.b;
        float f12 = (i9 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.o0 = 0;
        } else if (f12 > 1.0f) {
            this.o0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f12, this.B, this.C);
            this.o0 = b10;
            int i12 = this.C;
            if (b10 > i12) {
                this.o0 = i12;
            }
            int i13 = this.o0;
            int i14 = this.B;
            if (i13 < i14) {
                this.o0 = i14;
            }
        }
        if (i11 != this.o0) {
            this.q0 = true;
            c(true);
            x(f11);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                c91 c91Var = (c91) ((dl0) eVar).b;
                c91Var.f();
                c91Var.b.p0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // qf.g
    public final void K() {
        if (g.x1) {
            int length = ((rf.d) this.d0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    sf.h hVar = (sf.h) arrayList.get(i10);
                    if (hVar.n) {
                        j11 += hVar.a.a[i9];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.h0) {
                    this.h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f0, this.h0, new f0(this, 11));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // qf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // qf.g
    public final sf.f h(rf.a aVar) {
        return new sf.h(aVar, this.S0);
    }

    @Override // qf.g
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i9;
        float f14;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        rf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.c0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.g1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((rf.d) bVar).b;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f10 = (f18 - f22) * f21;
            f11 = f22;
        }
        int i12 = ((int) (f19 / f11)) + 1;
        int max = Math.max(0, (this.B - i12) - 2);
        int min = Math.min(((rf.d) this.d0).b.length - 1, this.C + i12 + 2);
        int i13 = 0;
        while (true) {
            arrayList = this.d;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((sf.f) arrayList.get(i13)).j = 0;
            i13++;
        }
        canvas2.save();
        int i14 = this.u0;
        if (i14 == 2) {
            this.b0 = true;
            this.r0 = 0.0f;
            sf.j jVar2 = this.v0;
            float f23 = jVar2.f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i14 == 1) {
                sf.j jVar3 = this.v0;
                float f24 = jVar3.f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.e);
                f13 = f24;
            } else {
                f13 = i14 == 3 ? this.v0.f : 1.0f;
            }
        }
        boolean z10 = this.o0 >= 0 && this.q0;
        while (true) {
            i9 = g.j1;
            if (max > min) {
                break;
            }
            if (this.o0 != max || !z10) {
                int i15 = 0;
                float f25 = 0.0f;
                while (i15 < arrayList.size()) {
                    sf.f fVar = (sf.f) arrayList.get(i15);
                    if (fVar.n || fVar.o != 0.0f) {
                        long[] jArr = fVar.a.a;
                        float f26 = (((f18 - f11) * ((rf.d) this.d0).b[max]) + (f11 / f12)) - f20;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (jArr[i11] / this.v) * ((getMeasuredHeight() - this.s) - i9) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i16 = fVar.j;
                        int i17 = i16 + 1;
                        fVar.j = i17;
                        fArr2[i16] = f26;
                        int i18 = i16 + 2;
                        fVar.j = i18;
                        fArr2[i17] = measuredHeight2 - f25;
                        int i19 = i16 + 3;
                        fVar.j = i19;
                        fArr2[i18] = f26;
                        fVar.j = i16 + 4;
                        fArr2[i19] = (getMeasuredHeight() - this.s) - f25;
                        f25 += measuredHeight;
                    } else {
                        i10 = min;
                        i11 = max;
                    }
                    i15++;
                    min = i10;
                    max = i11;
                }
            }
            max++;
            min = min;
        }
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            sf.h hVar = (sf.h) arrayList.get(i20);
            Paint paint = (z10 || this.b0) ? hVar.q : hVar.c;
            if (z10) {
                f14 = 255.0f;
                hVar.q.setColor(i0.a.d(this.r0, hVar.m, hVar.r));
            } else {
                f14 = 255.0f;
            }
            if (this.b0) {
                hVar.q.setColor(i0.a.d(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z10) {
            int i21 = 0;
            float f27 = 0.0f;
            while (i21 < arrayList.size()) {
                sf.f fVar2 = (sf.f) arrayList.get(i21);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != 0.0f) {
                    long[] jArr2 = fVar2.a.a;
                    float f28 = (((f18 - f11) * ((rf.d) this.d0).b[this.o0]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (jArr2[r15] / this.v) * ((getMeasuredHeight() - this.s) - i9) * fVar2.o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.s) - f27, paint2);
                    f27 += measuredHeight3;
                }
                i21++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // qf.g
    public final void n(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        rf.b bVar = this.d0;
        if (bVar != null) {
            int length = ((rf.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((sf.f) arrayList.get(i11)).j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.z1;
            if (jArr == null || jArr.length < size) {
                this.z1 = new long[size];
            }
            int i12 = 0;
            while (i12 < length) {
                float f11 = ((rf.d) this.d0).b[i12] * this.y0;
                int i13 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i13 >= size) {
                        break;
                    }
                    sf.f fVar = (sf.f) arrayList.get(i13);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j10 = fVar.a.a[i12];
                        long[] jArr2 = this.z1;
                        if (j10 > jArr2[i13]) {
                            jArr2[i13] = j10;
                        }
                    }
                    i13++;
                }
                if (i12 % max == 0) {
                    int i14 = 0;
                    float f12 = 0.0f;
                    while (i14 < size) {
                        sf.f fVar2 = (sf.f) arrayList.get(i14);
                        if (fVar2.n || fVar2.o != f10) {
                            float f13 = g.x1 ? this.f0 : ((rf.d) this.d0).e;
                            long[] jArr3 = this.z1;
                            i9 = i12;
                            float f14 = (jArr3[i14] / f13) * fVar2.o;
                            int i15 = this.x0;
                            float f15 = f14 * i15;
                            float[] fArr = fVar2.k;
                            int i16 = fVar2.j;
                            int i17 = i16 + 1;
                            fVar2.j = i17;
                            fArr[i16] = f11;
                            int i18 = i16 + 2;
                            fVar2.j = i18;
                            i10 = length;
                            fArr[i17] = (i15 - f15) - f12;
                            int i19 = i16 + 3;
                            fVar2.j = i19;
                            fArr[i18] = f11;
                            fVar2.j = i16 + 4;
                            fArr[i19] = i15 - f12;
                            f12 += f15;
                            jArr3[i14] = 0;
                        } else {
                            i10 = length;
                            i9 = i12;
                        }
                        i14++;
                        i12 = i9;
                        length = i10;
                        f10 = 0.0f;
                    }
                }
                i12++;
                length = length;
            }
            rf.b bVar2 = this.d0;
            float f16 = ((rf.d) bVar2).b.length < 2 ? 1.0f : ((rf.d) bVar2).b[1] * this.y0;
            for (int i20 = 0; i20 < size; i20++) {
                sf.f fVar3 = (sf.f) arrayList.get(i20);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f16);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
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
    public final long r(int i9, int i10) {
        return ((rf.d) this.d0).m.rMaxQ(i9, i10);
    }

    @Override // qf.g
    public final void u() {
        super.u();
        this.f0 = 0.0f;
        int length = ((rf.d) this.d0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < length; i9++) {
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                sf.h hVar = (sf.h) arrayList.get(i10);
                if (hVar.n) {
                    j10 += hVar.a.a[i9];
                }
            }
            float f10 = j10;
            if (f10 > this.f0) {
                this.f0 = f10;
            }
        }
    }

    @Override // qf.g
    public final void z() {
        int length = ((rf.a) ((rf.d) this.d0).d.get(0)).a.length;
        int size = ((rf.d) this.d0).d.size();
        ((rf.d) this.d0).l = new long[length];
        for (int i9 = 0; i9 < length; i9++) {
            ((rf.d) this.d0).l[i9] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((sf.h) this.d.get(i10)).n) {
                    rf.b bVar = this.d0;
                    long[] jArr = ((rf.d) bVar).l;
                    jArr[i9] = jArr[i9] + ((rf.a) ((rf.d) bVar).d.get(i10)).a[i9];
                }
            }
        }
        rf.b bVar2 = this.d0;
        ((rf.d) bVar2).m = new SegmentTree(((rf.d) bVar2).l);
        super.z();
    }

    @Override // qf.g
    public final void o(Canvas canvas) {
    }
}
