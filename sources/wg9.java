// default package

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wg9 extends mg9 implements sp3 {
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ImageReceiver Z;
    public final Paint a0;
    public final TextPaint b0;
    public final TextPaint c0;
    public StaticLayout d0;
    public StaticLayout e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final RectF j0;
    public final boolean k0;
    public byte l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public final int p0;

    public wg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockDocument pageblockdocument) {
        super(rh9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.a0 = new Paint(1);
        this.b0 = new TextPaint(1);
        this.c0 = new TextPaint(1);
        int L = gl.L(16.0f);
        this.f0 = L;
        int L2 = gl.L(9.0f);
        int L3 = gl.L(42.0f);
        this.h0 = L3;
        this.i0 = gl.L(14.0f);
        this.j0 = new RectF();
        this.o0 = -1;
        TLRPC.Document s = rh9Var.s(pageblockdocument.document_id);
        this.X = s;
        int L4 = gl.L(10.0f) + rh9Var.S;
        this.g0 = L4;
        boolean W2 = k27.W2(s);
        this.k0 = W2;
        this.p0 = up3.q(rh9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        if (W2) {
            L = ((gl.L(86.0f) - L3) / 2) + L4;
            L2 = gl.L(10.0f) + ((gl.L(86.0f) - L3) / 2);
        }
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        imageReceiver.q0(gl.L(6.0f));
        imageReceiver.A1 = true;
        if (W2) {
            TLRPC.PhotoSize w = ba4.w(s.thumbs, kk7.q5, false, null, true);
            imageReceiver.i0(L4, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
            imageReceiver.d0(w != null ? gl5.c(w, s) : null, "86_86", fl5.i(s.thumbs), null, rh9Var.b, 1);
        }
        k0();
        l0(false);
    }

    @Override // sp3
    public final void B(boolean z) {
        l0(true);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return gl.L(this.k0 ? 106.0f : 60.0f) + rect.top + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        int i;
        int i2;
        boolean z = this.k0;
        rh9 rh9Var = this.a;
        if (z) {
            i2 = gl.L(86.0f) + (this.g0 - rh9Var.S);
        } else {
            StaticLayout staticLayout = this.e0;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                i = 0;
            } else {
                StaticLayout staticLayout2 = this.e0;
                i = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            }
            i2 = (this.f0 - rh9Var.S) + this.h0 + this.i0 + i;
        }
        Rect rect = this.b;
        return rect.left + i2 + rect.right;
    }

    @Override // mg9
    public final int K() {
        String B;
        String i0;
        TLRPC.Document document = this.X;
        if (document == null) {
            i0 = "";
            B = "";
        } else {
            B = ba4.B(document);
            i0 = gl.i0(document.size, false, false);
        }
        int min = Math.min(this.c, Math.max(gl.L(220.0f), gl.L(48.0f) + (this.k0 ? gl.L(107.0f) : this.f0 + this.h0 + this.i0) + ((int) Math.ceil(Math.max(this.b0.measureText(B), this.c0.measureText(i0))))));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override // sp3
    public final void N(String str) {
        this.Y.o(true, 1.0f);
        l0(true);
    }

    @Override // mg9
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.m(view);
            imageReceiver.p0(this.W);
        }
        imageReceiver.I();
        l0(false);
    }

    @Override // mg9
    public final void V() {
        this.Z.K();
        up3.q(this.a.a).v(this);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        gb2 gb2Var;
        bb2 bb2Var;
        Drawable drawable;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.o0 != i0()) {
            k0();
        }
        canvas.save();
        rh9 rh9Var = this.a;
        canvas.translate(-rh9Var.S, 0.0f);
        boolean z = this.k0;
        int i = this.g0;
        if (z && !this.Z.h(canvas, null)) {
            int v0 = bkb.v0(rh9Var.D() ? bkb.yc : bkb.we, rh9Var.D);
            Paint paint = this.a0;
            paint.setColor(v0);
            canvas.drawRoundRect(i, gl.L(10.0f), gl.L(86.0f) + i, gl.L(96.0f), gl.L(6.0f), gl.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        this.b0.setColor(bkb.v0(rh9Var.D() ? bkb.vc : bkb.te, rh9Var.D));
        this.c0.setColor(bkb.v0(rh9Var.D() ? bkb.ic : bkb.de, rh9Var.D));
        int L = z ? gl.L(97.0f) + i : this.f0 + this.h0 + this.i0;
        int L2 = gl.L(11.0f);
        int L3 = gl.L(2.0f) + this.d0.getHeight() + L2;
        canvas.save();
        float f = L;
        canvas.translate(f, L2);
        this.d0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f, L3);
        this.e0.draw(canvas);
        canvas.restore();
        RectF rectF = this.j0;
        if (document == null || (gb2Var = rh9Var.E) == null || (bb2Var = rh9Var.F) == null || !bb2Var.l2(gb2Var)) {
            rectF.setEmpty();
        } else {
            if (rh9Var.D()) {
                wjb wjbVar = rh9Var.D;
                drawable = wjbVar != null ? wjbVar.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = bkb.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = bkb.b4;
            }
            int L4 = (this.o0 + this.b.right) - gl.L(32.0f);
            int L5 = gl.L(7.0f);
            drawable.setBounds(L4, L5, drawable.getIntrinsicWidth() + L4, drawable.getIntrinsicHeight() + L5);
            drawable.draw(canvas);
            rectF.set(L4 - gl.L(8.0f), 0.0f, gl.L(8.0f) + drawable.getIntrinsicWidth() + L4, gl.L(54.0f));
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    @Override // mg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z;
        gb2 gb2Var;
        bb2 bb2Var;
        float x = motionEvent.getX();
        rh9 rh9Var = this.a;
        int i = rh9Var.S;
        int i2 = rh9Var.a;
        float f = x + i;
        float y = motionEvent.getY();
        boolean contains = this.j0.contains(f, y);
        if (motionEvent.getActionMasked() == 0 && contains) {
            this.n0 = true;
            return true;
        }
        boolean z2 = this.n0;
        TLRPC.Document document = this.X;
        if (z2) {
            if (motionEvent.getActionMasked() == 2 && !contains) {
                this.n0 = false;
                return true;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                boolean z3 = motionEvent.getActionMasked() == 1 && contains;
                this.n0 = false;
                if (z3 && document != null && document != null && (gb2Var = rh9Var.E) != null && (bb2Var = rh9Var.F) != null && bb2Var.l2(gb2Var)) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    rh9Var.F.H(rh9Var.E, document, F());
                }
                return true;
            }
        }
        boolean z4 = this.k0;
        if (f >= (z4 ? this.g0 : this.f0) && f <= this.o0 - gl.L(12.0f) && y >= gl.L(10.0f)) {
            if (y <= gl.L(z4 ? 96.0f : 53.0f)) {
                z = true;
                if (motionEvent.getActionMasked() != 0 && z) {
                    this.m0 = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.m0) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.m0 = false;
                    }
                    return this.m0;
                }
                this.m0 = false;
                if (z) {
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    byte b = this.l0;
                    if (b == 0) {
                        View view3 = this.W;
                        Activity activity = null;
                        Context context = view3 == null ? null : view3.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else if (context instanceof Activity) {
                                activity = (Activity) context;
                            }
                        }
                        Activity activity2 = activity;
                        File j0 = j0();
                        if (activity2 != null && j0 != null) {
                            gl.s2(j0, ba4.B(document), document.mime_type, activity2, rh9Var.D, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.Y;
                        if (b == 1 && document != null) {
                            ba4.G(i2).X(document, rh9Var.b, 1, 1);
                            this.l0 = (byte) 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (b == 2 && document != null) {
                            ba4.G(i2).f(document);
                            this.l0 = (byte) 1;
                            radialProgress2.setIcon(2, false, true);
                        }
                    }
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
                return true;
            }
        }
        z = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        return this.m0;
    }

    @Override // sp3
    public final int getObserverTag() {
        return this.p0;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.Y.o(true, j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2));
        if (this.l0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        int i2 = this.c;
        if (i > 0) {
            Rect rect = this.b;
            i2 = Math.min(i2, Math.max(0, (i - rect.left) - rect.right));
        }
        return i2 + rh9Var.S + rh9Var.T;
    }

    public final File j0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        rh9 rh9Var = this.a;
        ba4.G(rh9Var.a);
        File J = ba4.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        ba4.G(rh9Var.a);
        return ba4.J(document, null, true, true);
    }

    public final void k0() {
        int i;
        int i2;
        this.o0 = i0();
        if (this.k0) {
            i = gl.L(97.0f);
            i2 = this.g0;
        } else {
            i = this.f0 + this.h0;
            i2 = this.i0;
        }
        int c = b00.c(48.0f, this.o0 - (i + i2), gl.L(40.0f));
        rh9 rh9Var = this.a;
        float L = gl.L(rh9Var.M - 1);
        TextPaint textPaint = this.b0;
        de9.p(textPaint, L);
        this.c0.setTextSize(gl.L(rh9Var.M - 3));
        TLRPC.Document document = this.X;
        CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : ba4.B(document), textPaint, c, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.d0 = new StaticLayout(ellipsize, this.b0, c, alignment, 1.0f, 0.0f, false);
        this.e0 = new StaticLayout(document != null ? gl.i0(document.size, false, false) : "", this.c0, c, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z) {
        rh9 rh9Var = this.a;
        boolean z2 = this.k0;
        RadialProgress2 radialProgress2 = this.Y;
        if (z2) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            radialProgress2.d = bkb.v0(bkb.Xd, rh9Var.D);
        } else {
            radialProgress2.g(rh9Var.D() ? bkb.Dc : bkb.Ye, rh9Var.D() ? bkb.Ec : bkb.Ze, rh9Var.D() ? bkb.Fb : bkb.kd, rh9Var.D() ? bkb.Gb : bkb.ld);
            radialProgress2.d = bkb.v0(rh9Var.D() ? bkb.tc : bkb.re, rh9Var.D);
        }
        String r = ba4.r(null, this.X);
        File j0 = j0();
        if (j0 != null && j0.exists()) {
            up3.q(rh9Var.a).v(this);
            this.l0 = (byte) 0;
            radialProgress2.setIcon(z2 ? 4 : 5, false, z);
        } else if (TextUtils.isEmpty(r)) {
            radialProgress2.setIcon(4, false, z);
        } else {
            up3.q(rh9Var.a).a(r, null, this);
            if (ba4.G(rh9Var.a).S(r)) {
                this.l0 = (byte) 2;
                Float s = fl5.z().s(r);
                radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z);
            } else {
                this.l0 = (byte) 1;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(2, false, z);
            }
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
