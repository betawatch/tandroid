// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p14 extends yr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ r14 S;

    public p14(r14 r14Var) {
        this.S = r14Var;
    }

    @Override // yr3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        int i3;
        r14 r14Var = this.S;
        e34 e34Var = r14Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z = true;
        boolean z2 = arrayList.size() <= 4 || gda.o() == 0 || !e86.e(16388);
        if (!z2) {
            boolean z3 = e34Var.v2 > 0 && SystemClock.elapsedRealtime() - e34Var.v2 < r14Var.z1();
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                n24 n24Var = (n24) this.P.get(i4);
                if (n24Var.h != 0.0f || n24Var.n != null || ((i3 = n24Var.a) > e34Var.t2 && i3 < e34Var.u2 && z3)) {
                    break;
                }
            }
        }
        z = z2;
        if (!z) {
            super.a(canvas, j, i, i2, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // yr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            n24 n24Var = (n24) arrayList.get(i);
            vm vmVar = n24Var.b;
            if (vmVar != null) {
                in5 in5Var = n24Var.f[this.L];
                mm mmVar = vmVar.k;
                if (mmVar != null) {
                    mmVar.setAlpha(vmVar.l);
                    vmVar.k.h(canvas, in5Var);
                }
            }
            i++;
        }
    }

    @Override // yr3
    public final void d(Canvas canvas, float f) {
        int i;
        float f2;
        vm vmVar;
        r14 r14Var = this.S;
        e34 e34Var = r14Var.n3;
        if (this.P != null) {
            canvas.save();
            float f3 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f4 = f;
            while (i2 < this.P.size()) {
                n24 n24Var = (n24) this.P.get(i2);
                if (n24Var.getSpan() == null || (vmVar = (vm) e34Var.e2.get(n24Var.d.getDocumentId())) == null) {
                    i = i2;
                    f2 = f3;
                } else {
                    int height = (int) (n24Var.getHeight() * 0.03f);
                    Rect rect = gm.Q;
                    rect.set(n24Var.getPaddingLeft() + n24Var.getLeft(), height, n24Var.getRight() - n24Var.getPaddingRight(), ((n24Var.getMeasuredHeight() + height) - n24Var.getPaddingBottom()) - n24Var.getPaddingTop());
                    float f5 = n24Var.h;
                    float f6 = f5 != f3 ? (((1.0f - f5) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (e34Var.v2 > 0) {
                        i = i2;
                        if (SystemClock.elapsedRealtime() - e34Var.v2 < r14Var.z1() && e34Var.t2 >= 0 && e34Var.u2 >= 0 && e34Var.v2 > 0) {
                            int R = RecyclerView.R(n24Var);
                            int i3 = e34Var.t2;
                            int i4 = R - i3;
                            int i5 = e34Var.u2 - i3;
                            if (i4 >= 0 && i4 < i5) {
                                float max = Math.max(600L, Math.min(55, r7 - i3) * 40);
                                SystemClock.elapsedRealtime();
                                float elapsedRealtime = (SystemClock.elapsedRealtime() - e34Var.v2) / max;
                                f2 = 0.0f;
                                float interpolation = d53.g.getInterpolation(pqe.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i5;
                                float f8 = f7 / 4.0f;
                                float s = gm.s(interpolation, i4, f7, f8);
                                int i6 = i5 / 4;
                                f6 *= (this.R.getInterpolation(gm.s(interpolation, i4 + i6, i5 + i6, f8)) * 0.5f) + 0.5f;
                                f4 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i2;
                        f2 = f3;
                    }
                    vmVar.setAlpha((int) (255.0f * f4));
                    vmVar.setBounds(rect);
                    vmVar.setColorFilter(e34Var.f2);
                    if (f6 != 1.0f) {
                        canvas.save();
                        canvas.scale(f6, f6, rect.centerX(), rect.centerY());
                        vmVar.draw(canvas);
                        canvas.restore();
                    } else {
                        vmVar.draw(canvas);
                    }
                }
                float f9 = f2;
                i2 = i + 1;
                f3 = f9;
            }
            canvas.restore();
        }
    }

    @Override // yr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            in5[] in5VarArr = ((n24) arrayList.get(i)).f;
            if (in5VarArr != null) {
                in5VarArr[this.L].a();
            }
            i++;
        }
    }

    @Override // yr3
    public final void i(long j) {
        vm vmVar;
        e34 e34Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            n24 n24Var = (n24) this.P.get(i);
            gn span = n24Var.getSpan();
            in5[] in5VarArr = n24Var.f;
            if (span != null && (vmVar = (vm) e34Var.e2.get(n24Var.d.getDocumentId())) != null && vmVar.k != null) {
                vmVar.s(j);
                mm mmVar = vmVar.k;
                int i2 = this.L;
                in5 Q = mmVar.Q(in5VarArr[i2], i2);
                in5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                vmVar.setAlpha(nm7.d4);
                int height = (int) (n24Var.getHeight() * 0.03f);
                Rect rect = gm.Q;
                rect.set((n24Var.getPaddingLeft() + n24Var.getLeft()) - this.O, height, (n24Var.getRight() - n24Var.getPaddingRight()) - this.O, ((n24Var.getMeasuredHeight() + height) - n24Var.getPaddingTop()) - n24Var.getPaddingBottom());
                in5VarArr[i2].b(rect);
                n24Var.b = vmVar;
                in5VarArr[i2].z = vmVar.c() ? e34Var.f2 : null;
                arrayList.add(n24Var);
            }
        }
    }
}
