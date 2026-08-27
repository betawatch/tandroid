package rf;

import ag.q1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.a91;
import org.telegram.ui.dl0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] z1;

    public p(Context context, c6 c6Var) {
        super(context, c6Var);
        this.s0 = true;
        this.t0 = true;
    }

    @Override // rf.g
    public final void C(int i10, int i11) {
        sf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        int i12 = this.o0;
        float f10 = this.C0;
        float f11 = (this.c0.k * f10) - g.g1;
        sf.d dVar = (sf.d) bVar;
        float[] fArr = dVar.b;
        float f12 = (i10 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.o0 = 0;
        } else if (f12 > 1.0f) {
            this.o0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f12, this.B, this.C);
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
            x(f11);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                a91 a91Var = (a91) ((dl0) eVar).b;
                a91Var.f();
                a91Var.b.p0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // rf.g
    public final void K() {
        if (g.x1) {
            int length = ((sf.d) this.d0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    tf.h hVar = (tf.h) arrayList.get(i11);
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
                if (f10 != this.h0) {
                    this.h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e9 = g.e(this.f0, this.h0, new q1(this, 13));
                    this.W = e9;
                    e9.start();
                }
            }
        }
    }

    @Override // rf.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // rf.g
    public final tf.f h(sf.a aVar) {
        return new tf.h(aVar, this.S0);
    }

    @Override // rf.g
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
        sf.b bVar = this.d0;
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
        float[] fArr = ((sf.d) bVar).b;
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
        int max = Math.max(0, (this.B - i13) - 2);
        int min = Math.min(((sf.d) this.d0).b.length - 1, this.C + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((tf.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.u0;
        if (i15 == 2) {
            this.b0 = true;
            this.r0 = 0.0f;
            tf.j jVar2 = this.v0;
            float f23 = jVar2.f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                tf.j jVar3 = this.v0;
                float f24 = jVar3.f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.e);
                f13 = f24;
            } else {
                f13 = i15 == 3 ? this.v0.f : 1.0f;
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
                float f25 = 0.0f;
                while (i16 < arrayList.size()) {
                    tf.f fVar = (tf.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        long[] jArr = fVar.a.a;
                        float f26 = (((f18 - f11) * ((sf.d) this.d0).b[max]) + (f11 / f12)) - f20;
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
            tf.h hVar = (tf.h) arrayList.get(i21);
            Paint paint = (z10 || this.b0) ? hVar.q : hVar.c;
            if (z10) {
                f14 = 255.0f;
                hVar.q.setColor(i0.b.d(this.r0, hVar.m, hVar.r));
            } else {
                f14 = 255.0f;
            }
            if (this.b0) {
                hVar.q.setColor(i0.b.d(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f27 = 0.0f;
            while (i22 < arrayList.size()) {
                tf.f fVar2 = (tf.f) arrayList.get(i22);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != 0.0f) {
                    long[] jArr2 = fVar2.a.a;
                    float f28 = (((f18 - f11) * ((sf.d) this.d0).b[this.o0]) + (f11 / f12)) - f20;
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

    @Override // rf.g
    public final void n(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        sf.b bVar = this.d0;
        if (bVar != null) {
            int length = ((sf.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((tf.f) arrayList.get(i12)).j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.z1;
            if (jArr == null || jArr.length < size) {
                this.z1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f11 = ((sf.d) this.d0).b[i13] * this.y0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    tf.f fVar = (tf.f) arrayList.get(i14);
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
                    float f12 = 0.0f;
                    while (i15 < size) {
                        tf.f fVar2 = (tf.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f10) {
                            float f13 = g.x1 ? this.f0 : ((sf.d) this.d0).e;
                            long[] jArr3 = this.z1;
                            i10 = i13;
                            float f14 = (jArr3[i15] / f13) * fVar2.o;
                            int i16 = this.x0;
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
            sf.b bVar2 = this.d0;
            float f16 = ((sf.d) bVar2).b.length < 2 ? 1.0f : ((sf.d) bVar2).b[1] * this.y0;
            for (int i21 = 0; i21 < size; i21++) {
                tf.f fVar3 = (tf.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f16);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // rf.g, android.view.View
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
                l(canvas, (tf.d) arrayList.get(i11));
                p(canvas, (tf.d) arrayList.get(this.j0));
                i10 = this.j0 + 1;
            }
        }
    }

    @Override // rf.g
    public final long r(int i10, int i11) {
        return ((sf.d) this.d0).m.rMaxQ(i10, i11);
    }

    @Override // rf.g
    public final void u() {
        super.u();
        this.f0 = 0.0f;
        int length = ((sf.d) this.d0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                tf.h hVar = (tf.h) arrayList.get(i11);
                if (hVar.n) {
                    j10 += hVar.a.a[i10];
                }
            }
            float f10 = j10;
            if (f10 > this.f0) {
                this.f0 = f10;
            }
        }
    }

    @Override // rf.g
    public final void z() {
        int length = ((sf.a) ((sf.d) this.d0).d.get(0)).a.length;
        int size = ((sf.d) this.d0).d.size();
        ((sf.d) this.d0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((sf.d) this.d0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((tf.h) this.d.get(i11)).n) {
                    sf.b bVar = this.d0;
                    long[] jArr = ((sf.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((sf.a) ((sf.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        sf.b bVar2 = this.d0;
        ((sf.d) bVar2).m = new SegmentTree(((sf.d) bVar2).l);
        super.z();
    }

    @Override // rf.g
    public final void o(Canvas canvas) {
    }
}
