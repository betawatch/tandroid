// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z04 extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ b14 S;

    public z04(b14 b14Var) {
        this.S = b14Var;
    }

    @Override // fr3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        int i3;
        b14 b14Var = this.S;
        o24 o24Var = b14Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z = true;
        boolean z2 = arrayList.size() <= 4 || xea.o() == 0 || !i86.e(16388);
        if (!z2) {
            boolean z3 = o24Var.v2 > 0 && SystemClock.elapsedRealtime() - o24Var.v2 < b14Var.A1();
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                x14 x14Var = (x14) this.P.get(i4);
                if (x14Var.h != 0.0f || x14Var.n != null || ((i3 = x14Var.a) > o24Var.t2 && i3 < o24Var.u2 && z3)) {
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

    @Override // fr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            x14 x14Var = (x14) arrayList.get(i);
            wl wlVar = x14Var.b;
            if (wlVar != null) {
                ln5 ln5Var = x14Var.f[this.L];
                nl nlVar = wlVar.k;
                if (nlVar != null) {
                    nlVar.setAlpha(wlVar.l);
                    wlVar.k.h(canvas, ln5Var);
                }
            }
            i++;
        }
    }

    @Override // fr3
    public final void d(Canvas canvas, float f) {
        int i;
        float f2;
        wl wlVar;
        b14 b14Var = this.S;
        o24 o24Var = b14Var.n3;
        if (this.P != null) {
            canvas.save();
            float f3 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f4 = f;
            while (i2 < this.P.size()) {
                x14 x14Var = (x14) this.P.get(i2);
                if (x14Var.getSpan() == null || (wlVar = (wl) o24Var.e2.get(x14Var.d.getDocumentId())) == null) {
                    i = i2;
                    f2 = f3;
                } else {
                    int height = (int) (x14Var.getHeight() * 0.03f);
                    Rect rect = hl.Q;
                    rect.set(x14Var.getPaddingLeft() + x14Var.getLeft(), height, x14Var.getRight() - x14Var.getPaddingRight(), ((x14Var.getMeasuredHeight() + height) - x14Var.getPaddingBottom()) - x14Var.getPaddingTop());
                    float f5 = x14Var.h;
                    float f6 = f5 != f3 ? (((1.0f - f5) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (o24Var.v2 > 0) {
                        i = i2;
                        if (SystemClock.elapsedRealtime() - o24Var.v2 < b14Var.A1() && o24Var.t2 >= 0 && o24Var.u2 >= 0 && o24Var.v2 > 0) {
                            int S = RecyclerView.S(x14Var);
                            int i3 = o24Var.t2;
                            int i4 = S - i3;
                            int i5 = o24Var.u2 - i3;
                            if (i4 >= 0 && i4 < i5) {
                                float max = Math.max(600L, Math.min(55, r7 - i3) * 40);
                                SystemClock.elapsedRealtime();
                                float elapsedRealtime = (SystemClock.elapsedRealtime() - o24Var.v2) / max;
                                f2 = 0.0f;
                                float interpolation = k43.g.getInterpolation(ete.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i5;
                                float f8 = f7 / 4.0f;
                                float s = hl.s(interpolation, i4, f7, f8);
                                int i6 = i5 / 4;
                                f6 *= (this.R.getInterpolation(hl.s(interpolation, i4 + i6, i5 + i6, f8)) * 0.5f) + 0.5f;
                                f4 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i2;
                        f2 = f3;
                    }
                    wlVar.setAlpha((int) (255.0f * f4));
                    wlVar.setBounds(rect);
                    wlVar.setColorFilter(o24Var.f2);
                    if (f6 != 1.0f) {
                        canvas.save();
                        canvas.scale(f6, f6, rect.centerX(), rect.centerY());
                        wlVar.draw(canvas);
                        canvas.restore();
                    } else {
                        wlVar.draw(canvas);
                    }
                }
                float f9 = f2;
                i2 = i + 1;
                f3 = f9;
            }
            canvas.restore();
        }
    }

    @Override // fr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            ln5[] ln5VarArr = ((x14) arrayList.get(i)).f;
            if (ln5VarArr != null) {
                ln5VarArr[this.L].a();
            }
            i++;
        }
    }

    @Override // fr3
    public final void i(long j) {
        wl wlVar;
        o24 o24Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            x14 x14Var = (x14) this.P.get(i);
            hm span = x14Var.getSpan();
            ln5[] ln5VarArr = x14Var.f;
            if (span != null && (wlVar = (wl) o24Var.e2.get(x14Var.d.getDocumentId())) != null && wlVar.k != null) {
                wlVar.s(j);
                nl nlVar = wlVar.k;
                int i2 = this.L;
                ln5 Q = nlVar.Q(ln5VarArr[i2], i2);
                ln5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                wlVar.setAlpha(jn7.d4);
                int height = (int) (x14Var.getHeight() * 0.03f);
                Rect rect = hl.Q;
                rect.set((x14Var.getPaddingLeft() + x14Var.getLeft()) - this.O, height, (x14Var.getRight() - x14Var.getPaddingRight()) - this.O, ((x14Var.getMeasuredHeight() + height) - x14Var.getPaddingTop()) - x14Var.getPaddingBottom());
                ln5VarArr[i2].b(rect);
                x14Var.b = wlVar;
                ln5VarArr[i2].z = wlVar.c() ? o24Var.f2 : null;
                arrayList.add(x14Var);
            }
        }
    }
}
