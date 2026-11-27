// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ww3 extends tw3 {
    public p39 i;
    public p39 j;
    public int k;
    public final mm l;
    public Timer m;
    public final z9b n;
    public final ArrayList o;
    public final /* synthetic */ xw3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww3(xw3 xw3Var) {
        super(xw3Var);
        ArrayList arrayList;
        this.p = xw3Var;
        this.i = new p39(xw3Var);
        this.j = new p39(xw3Var);
        this.l = new mm(xw3Var);
        this.n = new z9b(xw3Var);
        this.o = new ArrayList();
        this.a = (byte) 3;
        this.b = hl.L(44.0f);
        this.c = hl.L(36.0f);
        zw3 zw3Var = xw3Var.f;
        int i = zw3.C1;
        ArrayList arrayList2 = ls6.d0(zw3Var.a).h;
        int i2 = 0;
        while (true) {
            int min = Math.min(arrayList2.size(), 8);
            arrayList = this.o;
            if (i2 >= min) {
                break;
            }
            arrayList.add(w49.c((TLRPC.TL_availableReaction) arrayList2.get(i2)));
            i2++;
        }
        Collections.sort(arrayList, new f03((byte) 15));
        if (!this.o.isEmpty()) {
            this.i.e((w49) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override // tw3
    public final void a(Canvas canvas, float f, float f2) {
        float L = f2 - hl.L(4.0f);
        float f3 = (int) f;
        float f4 = (int) L;
        float f5 = this.b;
        float f6 = (int) (f + f5);
        float f7 = (int) (L + f5);
        RectF rectF = this.f;
        rectF.set(f3, f4, f6, f7);
        float a = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int i3 = (int) rectF.right;
        int i4 = (int) rectF.bottom;
        z9b z9bVar = this.n;
        z9bVar.setBounds(i, i2, i3, i4);
        z9bVar.draw(canvas);
        float L2 = hl.L(30.0f);
        Rect rect = hl.Q;
        float f8 = L2 / 2.0f;
        rect.set((int) (rectF.centerX() - f8), (int) (rectF.centerY() - f8), (int) (rectF.centerX() + f8), (int) (rectF.centerY() + f8));
        float e = this.l.e(false, 1.0f);
        this.j.c(rect);
        this.i.c(rect);
        if (e == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f9 = 1.0f - e;
            canvas.scale(f9, f9, rectF.centerX(), rectF.top);
            p39 p39Var = this.j;
            p39Var.h = f9;
            p39Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            p39 p39Var2 = this.i;
            p39Var2.h = e;
            p39Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // tw3
    public final void b(boolean z) {
        this.i.b(z);
        this.j.b(z);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new vw3(this, (byte) 0), 2000L, 2000L);
        }
    }
}
