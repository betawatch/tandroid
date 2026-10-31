package rh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w8 {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.t5 c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final org.telegram.ui.Components.r8 l;
    public final org.telegram.ui.Components.r8 m;
    public qz0 n;
    public qz0 o;
    public boolean p;
    public final dc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public qz0 u;
    public int v;
    public final /* synthetic */ x8 w;

    public w8(x8 x8Var, boolean z10, long j10) {
        String str;
        y8 y8Var = x8Var.w;
        this.w = x8Var;
        this.b = new RectF();
        gr grVar = gr.h;
        this.c = new org.telegram.ui.Components.t5(x8Var, 0L, 600L, grVar);
        this.d = new org.telegram.ui.Components.t5(x8Var, 0L, 200L, grVar);
        this.e = new org.telegram.ui.Components.t5(x8Var, 0L, 350L, grVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(x8Var);
        this.k = imageReceiver;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.l = r8Var;
        org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.m = r8Var2;
        this.q = new dc(x8Var);
        this.i = z10;
        this.j = j10;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(y8Var.j1).Z1(Long.valueOf(j10));
            str = h20.k(Z1);
            r8Var.r(Z1);
            imageReceiver.i0(Z1, r8Var, null);
        } else {
            TLRPC.Chat L0 = vp.r1(y8Var.j1).L0(Long.valueOf(-j10));
            str = L0 == null ? "" : L0.title;
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.i0.L(56.0f));
        imageReceiver.P();
        imageReceiver.A0 = true;
        r8Var2.g(21);
        r8Var2.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c8, y8Var.i1));
        this.n = new qz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float e = this.c.e(false, this.a);
        int i10 = this.a;
        x8 x8Var = this.w;
        if (i10 >= 0 && i10 < x8Var.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (x8Var.getWidth() - org.telegram.messenger.i0.L(80.0f)) / Math.max(1.0f, x8Var.n);
        float L = ((x8Var.n - (e + 0.5f)) * width) + org.telegram.messenger.i0.L(40.0f);
        float L2 = org.telegram.messenger.i0.L(40.0f);
        float f12 = width / 2.0f;
        this.b.set(L - f12, L2 - org.telegram.messenger.i0.L(50.0f), f12 + L, org.telegram.messenger.i0.L(50.0f) + L2);
        float f13 = (0.3f * d) + 0.7f;
        canvas.scale(f13, f13, L, L2);
        float a2 = this.q.a(0.04f);
        canvas.scale(a2, a2, L, L2);
        if (d > 0.0f) {
            float d10 = this.e.d(this.p);
            if (d10 < 1.0f) {
                f11 = 255.0f;
                float L3 = org.telegram.messenger.i0.L(56.0f);
                f7 = 40.0f;
                float L4 = org.telegram.messenger.i0.L(56.0f);
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.y0(L - (org.telegram.messenger.i0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.i0.L(56.0f) / 2.0f), L3, L4);
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (d10 > 0.0f) {
                int i11 = (int) L;
                int L5 = i11 - (org.telegram.messenger.i0.L(56.0f) / 2);
                int i12 = (int) L2;
                int L6 = i12 - (org.telegram.messenger.i0.L(56.0f) / 2);
                int L7 = (org.telegram.messenger.i0.L(56.0f) / 2) + i11;
                int L8 = (org.telegram.messenger.i0.L(56.0f) / 2) + i12;
                org.telegram.ui.Components.r8 r8Var = this.m;
                r8Var.setBounds(L5, L6, L7, L8);
                r8Var.y = (int) (d * f11 * d10);
                r8Var.draw(canvas);
                r8Var.y = zs.e4;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((L - (this.o.c / f10)) - org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(23.0f) + L2) - (org.telegram.messenger.i0.L(16.0f) / f10), (this.o.c / f10) + L + org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(16.0f) / f10) + org.telegram.messenger.i0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, x8Var.f);
        int i13 = (int) (d * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        qz0 qz0Var = this.o;
        qz0Var.c(L - (qz0Var.c / f10), org.telegram.messenger.i0.L(23.0f) + L2, d, -1, canvas);
        qz0 qz0Var2 = this.n;
        qz0Var2.p = width - org.telegram.messenger.i0.L(4.0f);
        qz0Var2.c(L - (this.n.k() / f10), org.telegram.messenger.i0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, x8Var.w.i1), canvas);
        if (this.v > 0) {
            int i14 = (int) L;
            int i15 = (int) L2;
            this.t.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.s.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.t.setAlpha(i13);
            this.s.setAlpha(i13);
            this.t.draw(canvas);
            this.s.draw(canvas);
            qz0 qz0Var3 = this.u;
            qz0Var3.c(L - (qz0Var3.c / f10), L2 - org.telegram.messenger.i0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        String str;
        String str2;
        x8 x8Var = this.w;
        y8 y8Var = x8Var.w;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == d20.i(y8Var.j1).e() ? 0L : this.j) != j10) {
                this.p = j10 == 2666000;
                if (j10 == 0 || j10 == 2666000) {
                    j10 = d20.i(y8Var.j1).e();
                }
                this.j = j10;
                if (this.p) {
                    str2 = cd.L0(2131745066, null);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    org.telegram.ui.Components.r8 r8Var = this.l;
                    if (j10 >= 0) {
                        TLRPC.User Z1 = vp.r1(y8Var.j1).Z1(Long.valueOf(this.j));
                        str = h20.k(Z1);
                        r8Var.r(Z1);
                        imageReceiver.i0(Z1, r8Var, null);
                    } else {
                        TLRPC.Chat L0 = vp.r1(y8Var.j1).L0(Long.valueOf(-this.j));
                        str = L0 == null ? "" : L0.title;
                        r8Var.q(L0);
                        imageReceiver.i0(L0, r8Var, null);
                    }
                    str2 = str;
                }
                this.n = new qz0(str2, 12.0f, null);
                x8Var.invalidate();
            }
        }
    }
}
