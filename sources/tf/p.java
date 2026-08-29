package tf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import cg.c1;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.d91;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] z1;

    public p(Context context, c6 c6Var) {
        super(context, c6Var);
        this.s0 = true;
        this.t0 = true;
    }

    @Override // tf.g
    public final void C(int i10, int i11) {
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        int i12 = this.o0;
        float f9 = this.C0;
        float f10 = (this.c0.k * f9) - g.g1;
        uf.d dVar = (uf.d) bVar;
        float[] fArr = dVar.b;
        float f11 = (i10 + f10) / (f9 - (fArr.length < 2 ? 1.0f : fArr[1] * f9));
        if (f11 < 0.0f) {
            this.o0 = 0;
        } else if (f11 > 1.0f) {
            this.o0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f11, this.B, this.C);
            this.o0 = b10;
            int i13 = this.C;
            if (b10 > i13) {
                this.o0 = i13;
            }
            int i14 = this.o0;
            int i15 = this.B;
            if (i14 < i15) {
                this.o0 = i15;
            }
        }
        if (i12 != this.o0) {
            this.q0 = true;
            c(true);
            x(f10);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                d91 d91Var = (d91) ((zk0) eVar).b;
                d91Var.f();
                d91Var.b.p0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // tf.g
    public final void K() {
        if (g.x1) {
            int length = ((uf.d) this.d0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    vf.h hVar = (vf.h) arrayList.get(i11);
                    if (hVar.n) {
                        j11 += hVar.a.a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f9 = j10;
                if (f9 != this.h0) {
                    this.h0 = f9;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f0, this.h0, new c1(this, 13));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // tf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // tf.g
    public final vf.f h(uf.a aVar) {
        return new vf.h(aVar, this.S0);
    }

    @Override // tf.g
    public final void k(Canvas canvas) {
        float f9;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i10;
        float f13;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f14 = this.B0;
        j jVar = this.c0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.g1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((uf.d) bVar).b;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f9 = 1.0f;
        } else {
            float f20 = fArr[1];
            float f21 = f20 * f17;
            f9 = (f17 - f21) * f20;
            f10 = f21;
        }
        int i13 = ((int) (f18 / f10)) + 1;
        int max = Math.max(0, (this.B - i13) - 2);
        int min = Math.min(((uf.d) this.d0).b.length - 1, this.C + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((vf.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.u0;
        if (i15 == 2) {
            this.b0 = true;
            this.r0 = 0.0f;
            vf.j jVar2 = this.v0;
            float f22 = jVar2.f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                vf.j jVar3 = this.v0;
                float f23 = jVar3.f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.e);
                f12 = f23;
            } else {
                f12 = i15 == 3 ? this.v0.f : 1.0f;
            }
        }
        boolean z10 = this.o0 >= 0 && this.q0;
        while (true) {
            i10 = g.j1;
            if (max > min) {
                break;
            }
            if (this.o0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    vf.f fVar = (vf.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        long[] jArr = fVar.a.a;
                        float f25 = (((f17 - f10) * ((uf.d) this.d0).b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (jArr[i12] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i17 = fVar.j;
                        int i18 = i17 + 1;
                        fVar.j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.j = i20;
                        fArr2[i19] = f25;
                        fVar.j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.s) - f24;
                        f24 += measuredHeight;
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
            vf.h hVar = (vf.h) arrayList.get(i21);
            Paint paint = (z10 || this.b0) ? hVar.q : hVar.c;
            if (z10) {
                f13 = 255.0f;
                hVar.q.setColor(i0.a.d(this.r0, hVar.m, hVar.r));
            } else {
                f13 = 255.0f;
            }
            if (this.b0) {
                hVar.q.setColor(i0.a.d(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f9);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                vf.f fVar2 = (vf.f) arrayList.get(i22);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != 0.0f) {
                    long[] jArr2 = fVar2.a.a;
                    float f27 = (((f17 - f10) * ((uf.d) this.d0).b[this.o0]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (jArr2[r15] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar2.o;
                    paint2.setStrokeWidth(f9);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.s) - f26, paint2);
                    f26 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // tf.g
    public final void n(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        uf.b bVar = this.d0;
        if (bVar != null) {
            int length = ((uf.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((vf.f) arrayList.get(i12)).j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.z1;
            if (jArr == null || jArr.length < size) {
                this.z1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f10 = ((uf.d) this.d0).b[i13] * this.y0;
                int i14 = 0;
                while (true) {
                    f9 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    vf.f fVar = (vf.f) arrayList.get(i14);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j10 = fVar.a.a[i13];
                        long[] jArr2 = this.z1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = 0;
                    float f11 = 0.0f;
                    while (i15 < size) {
                        vf.f fVar2 = (vf.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f9) {
                            float f12 = g.x1 ? this.f0 : ((uf.d) this.d0).e;
                            long[] jArr3 = this.z1;
                            i10 = i13;
                            float f13 = (jArr3[i15] / f12) * fVar2.o;
                            int i16 = this.x0;
                            float f14 = f13 * i16;
                            float[] fArr = fVar2.k;
                            int i17 = fVar2.j;
                            int i18 = i17 + 1;
                            fVar2.j = i18;
                            fArr[i17] = f10;
                            int i19 = i17 + 2;
                            fVar2.j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f14) - f11;
                            int i20 = i17 + 3;
                            fVar2.j = i20;
                            fArr[i19] = f10;
                            fVar2.j = i17 + 4;
                            fArr[i20] = i16 - f11;
                            f11 += f14;
                            jArr3[i15] = 0;
                        } else {
                            i11 = length;
                            i10 = i13;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f9 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            uf.b bVar2 = this.d0;
            float f15 = ((uf.d) bVar2).b.length < 2 ? 1.0f : ((uf.d) bVar2).b[1] * this.y0;
            for (int i21 = 0; i21 < size; i21++) {
                vf.f fVar3 = (vf.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f15);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // tf.g, android.view.View
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
                l(canvas, (vf.d) arrayList.get(i11));
                p(canvas, (vf.d) arrayList.get(this.j0));
                i10 = this.j0 + 1;
            }
        }
    }

    @Override // tf.g
    public final long r(int i10, int i11) {
        return ((uf.d) this.d0).m.rMaxQ(i10, i11);
    }

    @Override // tf.g
    public final void u() {
        super.u();
        this.f0 = 0.0f;
        int length = ((uf.d) this.d0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                vf.h hVar = (vf.h) arrayList.get(i11);
                if (hVar.n) {
                    j10 += hVar.a.a[i10];
                }
            }
            float f9 = j10;
            if (f9 > this.f0) {
                this.f0 = f9;
            }
        }
    }

    @Override // tf.g
    public final void z() {
        int length = ((uf.a) ((uf.d) this.d0).d.get(0)).a.length;
        int size = ((uf.d) this.d0).d.size();
        ((uf.d) this.d0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((uf.d) this.d0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((vf.h) this.d.get(i11)).n) {
                    uf.b bVar = this.d0;
                    long[] jArr = ((uf.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((uf.a) ((uf.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        uf.b bVar2 = this.d0;
        ((uf.d) bVar2).m = new SegmentTree(((uf.d) bVar2).l);
        super.z();
    }

    @Override // tf.g
    public final void o(Canvas canvas) {
    }
}
