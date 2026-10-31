package vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ex0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s1 extends q1 {
    public sg.f0 i;
    public sg.f0 j;
    public int k;
    public final org.telegram.ui.Components.t5 l;
    public Timer m;
    public final th.u6 n;
    public final ArrayList o;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(org.telegram.ui.ActionBar.f5 f5Var) {
        super(f5Var);
        this.p = f5Var;
        this.i = new sg.f0(f5Var);
        this.j = new sg.f0(f5Var);
        this.l = new org.telegram.ui.Components.t5(f5Var);
        this.n = new th.u6(f5Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = org.telegram.messenger.i0.L(44.0f);
        this.c = org.telegram.messenger.i0.L(36.0f);
        u1 u1Var = (u1) f5Var.h;
        int i10 = u1.y1;
        ArrayList arrayList = ui.b0(u1Var.a).h;
        for (int i11 = 0; i11 < Math.min(arrayList.size(), 8); i11++) {
            this.o.add(sg.o0.c((TLRPC.TL_availableReaction) arrayList.get(i11)));
        }
        Collections.sort(this.o, new ex0(25));
        if (!this.o.isEmpty()) {
            this.i.e((sg.o0) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // vh.q1
    public final void a(Canvas canvas, float f7, float f10) {
        float L = f10 - org.telegram.messenger.i0.L(4.0f);
        float f11 = (int) f7;
        float f12 = (int) L;
        float f13 = this.b;
        float f14 = (int) (f7 + f13);
        float f15 = (int) (L + f13);
        RectF rectF = this.f;
        rectF.set(f11, f12, f14, f15);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        th.u6 u6Var = this.n;
        u6Var.setBounds(i10, i11, i12, i13);
        u6Var.draw(canvas);
        float L2 = org.telegram.messenger.i0.L(30.0f);
        Rect rect = org.telegram.messenger.i0.Q;
        float f16 = L2 / 2.0f;
        rect.set((int) (rectF.centerX() - f16), (int) (rectF.centerY() - f16), (int) (rectF.centerX() + f16), (int) (rectF.centerY() + f16));
        float e = this.l.e(false, 1.0f);
        this.j.c(rect);
        this.i.c(rect);
        if (e == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f17 = 1.0f - e;
            canvas.scale(f17, f17, rectF.centerX(), rectF.top);
            sg.f0 f0Var = this.j;
            f0Var.h = f17;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            sg.f0 f0Var2 = this.i;
            f0Var2.h = e;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // vh.q1
    public final void b(boolean z10) {
        this.i.b(z10);
        this.j.b(z10);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new e6.r(this, 5), 2000L, 2000L);
        }
    }
}
