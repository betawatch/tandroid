package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e6 {
    public static CharSequence[] y;
    public int a;
    public Long b;
    public Integer c;
    public Integer d;
    public boolean e;
    public TLRPC.Document g;
    public SpannableStringBuilder k;
    public String l;
    public boolean m;
    public qz0 n;
    public qz0 o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final org.telegram.ui.Components.t5 h = new org.telegram.ui.Components.t5(0, 350, gr.h);
    public final dc i = new dc((View) null);
    public final org.telegram.ui.Cells.y j = org.telegram.ui.ActionBar.t6.a0(553648127, 0, 0);
    public final Paint t = new Paint(1);
    public final Paint u = new Paint(1);
    public final Path v = new Path();
    public final RectF w = new RectF();

    public static CharSequence d() {
        if (y == null) {
            y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            dq dqVar = new dq(R.drawable.filled_widget_music, 0);
            dqVar.c(org.telegram.messenger.i0.L(16.0f));
            dqVar.G = 1.0f;
            float f7 = -org.telegram.messenger.i0.L(1.0f);
            float L = org.telegram.messenger.i0.L(1.0f);
            dqVar.r = f7;
            dqVar.s = L;
            ((SpannableStringBuilder) y[0]).setSpan(dqVar, 0, 1, 33);
        }
        return y[0];
    }

    public final void a(Canvas canvas, float f7) {
        if (this.n == null) {
            CharSequence charSequence = this.k;
            if (charSequence == null) {
                charSequence = "";
            }
            TLRPC.Document document = this.g;
            this.n = new qz0(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : org.telegram.messenger.i0.o());
        }
        if (this.o == null || this.m) {
            String str = this.l;
            this.o = new qz0(str != null ? str : "", 14.0f, null);
        }
        float d = this.h.d(this.f);
        Paint paint = this.t;
        paint.setColor(TLObject.FLAG_30);
        int min = (int) Math.min(f7, Math.max(this.n.c, this.o.c) + org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(18.0f)));
        this.x = min;
        int W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(22.0f));
        float f10 = min;
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, f10, W1);
        canvas.save();
        float a2 = this.i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(42.0f));
        Paint paint2 = this.u;
        paint2.setColor(-1);
        float f11 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f11));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.i0.L(20.0f);
        if (f10 < f7) {
            L = (int) Math.min(org.telegram.messenger.i0.L(12.0f) + L, f7 - org.telegram.messenger.i0.L(20.0f));
        }
        qz0 qz0Var = this.n;
        float f12 = L;
        qz0Var.p = f12;
        qz0Var.c(org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f)), org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(11.0f)), 1.0f, -1, canvas);
        qz0 qz0Var2 = this.o;
        qz0Var2.p = f12;
        qz0Var2.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(30.0f), f11, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        return org.telegram.messenger.i0.L(this.f ? 22.0f : 42.0f);
    }

    public final void c() {
        if (this.p || this.q || this.b == null || this.c == null || this.r == null) {
            return;
        }
        this.q = true;
        vp.r1(this.a).O1().g0(this.c.intValue(), this.b.longValue(), new ph.h1(this, 17));
    }

    public final void e(float f7, float f10, boolean z10) {
        this.i.c(z10);
        int[] iArr = z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0];
        org.telegram.ui.Cells.y yVar = this.j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f7, f10);
        }
    }
}
