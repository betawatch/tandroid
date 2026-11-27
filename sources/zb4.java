// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zb4 {
    public final int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public zb4(View view) {
        this.h = new Paint(1);
        this.d = new mm(350L, view, k43.h);
        this.f = new o19(view);
        this.g = new v41(view);
        hn hnVar = new hn(false, false, false);
        this.e = hnVar;
        hnVar.w(hl.L(11.0f));
        hnVar.r(true, true);
        hnVar.setCallback(view);
        hnVar.N = (int) (hl.q.x * 0.3f);
        this.b = false;
        hnVar.t(ob6.M0(2131746166, null), false, true);
        String M0 = ob6.M0(2131746165, null);
        TextPaint textPaint = hnVar.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(ob6.M0(2131746166, null))));
    }

    public final void a(hb4 hb4Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i = 0;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == hb4Var) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (hb4Var.W0 > ((hb4) arrayList.get(i)).W0) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(i, hb4Var);
        } else {
            arrayList.add(hb4Var);
        }
    }

    public final void b(boolean z) {
        to3 to3Var = (to3) this.f;
        yb4 yb4Var = (yb4) this.h;
        if (z) {
            to3Var.a(yb4Var);
            yb4Var.run();
        } else {
            if (this.c) {
                return;
            }
            this.c = true;
            to3Var.a(yb4Var);
            to3Var.d(yb4Var, 20L);
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z, boolean z2) {
        Paint paint = (Paint) this.h;
        o19 o19Var = (o19) this.f;
        hn hnVar = (hn) this.e;
        if (z != this.b) {
            this.b = z;
            hnVar.t(ob6.M0(z ? 2131746165 : 2131746166, null), true, true);
        }
        int c = (int) (hnVar.c() + hl.L(23.66f));
        float L = hl.L(17.66f);
        rectF.set(f - c, f2 - L, f, f2);
        float a = ((v41) this.g).a(0.02f) * ((mm) this.d).d(z2);
        if (a > 0.0f) {
            paint.setColor(vm2.o(i, 30));
            canvas.save();
            canvas.scale(a, a, f, f2);
            float f3 = L / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            hnVar.setBounds((int) (rectF.left + hl.L(6.0f)), (int) rectF.top, (int) (rectF.right - hl.L(17.66f)), (int) rectF.bottom);
            hnVar.u(i);
            hnVar.draw(canvas);
            float L2 = hl.L(14.0f);
            int L3 = (int) ((rectF.right - hl.L(3.33f)) - L2);
            float f4 = L2 / 2.0f;
            o19Var.setBounds(L3, (int) ((rectF.centerY() - f4) + hl.L(0.33f)), (int) (rectF.right - hl.L(3.33f)), (int) (rectF.centerY() + f4 + hl.L(0.33f)));
            Paint paint2 = o19Var.b;
            paint2.setColor(i);
            paint2.setAlpha(o19Var.d);
            boolean z3 = !z;
            if (o19Var.e != z3) {
                o19Var.e = z3;
                o19Var.a.invalidate();
            }
            o19Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void d(boolean z) {
        this.c = z;
        ((v41) this.g).c(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zb4(int i, int i2, to3 to3Var) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = false;
        this.g = new yb4(this, (byte) 0);
        this.h = new yb4(this, (byte) 1);
        this.a = i;
        this.b = i2;
        this.f = to3Var;
    }
}
