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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zi9 extends qi9 implements cr3 {
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

    public zi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockDocument pageblockdocument) {
        super(uj9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.a0 = new Paint(1);
        this.b0 = new TextPaint(1);
        this.c0 = new TextPaint(1);
        int L = gm.L(16.0f);
        this.f0 = L;
        int L2 = gm.L(9.0f);
        int L3 = gm.L(42.0f);
        this.h0 = L3;
        this.i0 = gm.L(14.0f);
        this.j0 = new RectF();
        this.o0 = -1;
        TLRPC.Document s = uj9Var.s(pageblockdocument.document_id);
        this.X = s;
        int L4 = gm.L(10.0f) + uj9Var.S;
        this.g0 = L4;
        boolean W2 = k47.W2(s);
        this.k0 = W2;
        this.p0 = er3.q(uj9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        if (W2) {
            L = ((gm.L(86.0f) - L3) / 2) + L4;
            L2 = gm.L(10.0f) + ((gm.L(86.0f) - L3) / 2);
        }
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        imageReceiver.q0(gm.L(6.0f));
        imageReceiver.A1 = true;
        if (W2) {
            TLRPC.PhotoSize w = bc4.w(s.thumbs, nm7.q5, false, null, true);
            imageReceiver.i0(L4, gm.L(10.0f), gm.L(86.0f), gm.L(86.0f));
            imageReceiver.d0(w != null ? gn5.c(w, s) : null, "86_86", fn5.i(s.thumbs), null, uj9Var.b, 1);
        }
        j0();
        k0(false);
    }

    @Override // cr3
    public final void A(boolean z) {
        k0(true);
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return gm.L(this.k0 ? 106.0f : 60.0f) + rect.top + rect.bottom;
    }

    @Override // qi9
    public final int I() {
        int i;
        int i2;
        boolean z = this.k0;
        uj9 uj9Var = this.a;
        if (z) {
            i2 = gm.L(86.0f) + (this.g0 - uj9Var.S);
        } else {
            StaticLayout staticLayout = this.e0;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                i = 0;
            } else {
                StaticLayout staticLayout2 = this.e0;
                i = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            }
            i2 = (this.f0 - uj9Var.S) + this.h0 + this.i0 + i;
        }
        Rect rect = this.b;
        return rect.left + i2 + rect.right;
    }

    @Override // qi9
    public final int J() {
        String B;
        String i0;
        TLRPC.Document document = this.X;
        if (document == null) {
            i0 = "";
            B = "";
        } else {
            B = bc4.B(document);
            i0 = gm.i0(document.size, false, false);
        }
        int min = Math.min(this.c, Math.max(gm.L(220.0f), gm.L(48.0f) + (this.k0 ? gm.L(107.0f) : this.f0 + this.h0 + this.i0) + ((int) Math.ceil(Math.max(this.b0.measureText(B), this.c0.measureText(i0))))));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override // cr3
    public final void N(String str) {
        this.Y.o(true, 1.0f);
        k0(true);
    }

    @Override // qi9
    public final void S() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.m(view);
            imageReceiver.p0(this.W);
        }
        imageReceiver.I();
        k0(false);
    }

    @Override // qi9
    public final void U() {
        this.Z.K();
        er3.q(this.a.a).v(this);
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        rc2 rc2Var;
        mc2 mc2Var;
        Drawable drawable;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.o0 != h0()) {
            j0();
        }
        canvas.save();
        uj9 uj9Var = this.a;
        canvas.translate(-uj9Var.S, 0.0f);
        boolean z = this.k0;
        int i = this.g0;
        if (z && !this.Z.h(canvas, null)) {
            int v0 = cmb.v0(uj9Var.D() ? cmb.yc : cmb.we, uj9Var.D);
            Paint paint = this.a0;
            paint.setColor(v0);
            canvas.drawRoundRect(i, gm.L(10.0f), gm.L(86.0f) + i, gm.L(96.0f), gm.L(6.0f), gm.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        this.b0.setColor(cmb.v0(uj9Var.D() ? cmb.vc : cmb.te, uj9Var.D));
        this.c0.setColor(cmb.v0(uj9Var.D() ? cmb.ic : cmb.de, uj9Var.D));
        int L = z ? gm.L(97.0f) + i : this.f0 + this.h0 + this.i0;
        int L2 = gm.L(11.0f);
        int L3 = gm.L(2.0f) + this.d0.getHeight() + L2;
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
        if (document == null || (rc2Var = uj9Var.E) == null || (mc2Var = uj9Var.F) == null || !mc2Var.Z1(rc2Var)) {
            rectF.setEmpty();
        } else {
            if (uj9Var.D()) {
                ylb ylbVar = uj9Var.D;
                drawable = ylbVar != null ? ylbVar.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = cmb.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = cmb.b4;
            }
            int L4 = (this.o0 + this.b.right) - gm.L(32.0f);
            int L5 = gm.L(7.0f);
            drawable.setBounds(L4, L5, drawable.getIntrinsicWidth() + L4, drawable.getIntrinsicHeight() + L5);
            drawable.draw(canvas);
            rectF.set(L4 - gm.L(8.0f), 0.0f, gm.L(8.0f) + drawable.getIntrinsicWidth() + L4, gm.L(54.0f));
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    @Override // qi9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        rc2 rc2Var;
        mc2 mc2Var;
        float x = motionEvent.getX();
        uj9 uj9Var = this.a;
        int i = uj9Var.S;
        int i2 = uj9Var.a;
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
                if (z3 && document != null && document != null && (rc2Var = uj9Var.E) != null && (mc2Var = uj9Var.F) != null && mc2Var.Z1(rc2Var)) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    uj9Var.F.F(uj9Var.E, document, E());
                }
                return true;
            }
        }
        boolean z4 = this.k0;
        if (f >= (z4 ? this.g0 : this.f0) && f <= this.o0 - gm.L(12.0f) && y >= gm.L(10.0f)) {
            if (y <= gm.L(z4 ? 96.0f : 53.0f)) {
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
                        File i0 = i0();
                        if (activity2 != null && i0 != null) {
                            gm.s2(i0, bc4.B(document), document.mime_type, activity2, uj9Var.D, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.Y;
                        if (b == 1 && document != null) {
                            bc4.G(i2).X(document, uj9Var.b, 1, 1);
                            this.l0 = (byte) 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (b == 2 && document != null) {
                            bc4.G(i2).f(document);
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

    @Override // cr3
    public final int getObserverTag() {
        return this.p0;
    }

    public final int h0() {
        uj9 uj9Var = this.a;
        int i = uj9Var.C;
        int i2 = this.c;
        if (i > 0) {
            Rect rect = this.b;
            i2 = Math.min(i2, Math.max(0, (i - rect.left) - rect.right));
        }
        return i2 + uj9Var.S + uj9Var.T;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.Y.o(true, j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2));
        if (this.l0 != 2) {
            k0(true);
        }
    }

    public final File i0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        uj9 uj9Var = this.a;
        bc4.G(uj9Var.a);
        File J = bc4.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        bc4.G(uj9Var.a);
        return bc4.J(document, null, true, true);
    }

    public final void j0() {
        int i;
        int i2;
        this.o0 = h0();
        if (this.k0) {
            i = gm.L(97.0f);
            i2 = this.g0;
        } else {
            i = this.f0 + this.h0;
            i2 = this.i0;
        }
        int c = b10.c(48.0f, this.o0 - (i + i2), gm.L(40.0f));
        uj9 uj9Var = this.a;
        float L = gm.L(uj9Var.M - 1);
        TextPaint textPaint = this.b0;
        hg9.o(textPaint, L);
        this.c0.setTextSize(gm.L(uj9Var.M - 3));
        TLRPC.Document document = this.X;
        CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : bc4.B(document), textPaint, c, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.d0 = new StaticLayout(ellipsize, this.b0, c, alignment, 1.0f, 0.0f, false);
        this.e0 = new StaticLayout(document != null ? gm.i0(document.size, false, false) : "", this.c0, c, alignment, 1.0f, 0.0f, false);
    }

    public final void k0(boolean z) {
        uj9 uj9Var = this.a;
        boolean z2 = this.k0;
        RadialProgress2 radialProgress2 = this.Y;
        if (z2) {
            radialProgress2.g(cmb.bf, cmb.cf, cmb.df, cmb.ef);
            radialProgress2.d = cmb.v0(cmb.Xd, uj9Var.D);
        } else {
            radialProgress2.g(uj9Var.D() ? cmb.Dc : cmb.Ye, uj9Var.D() ? cmb.Ec : cmb.Ze, uj9Var.D() ? cmb.Fb : cmb.kd, uj9Var.D() ? cmb.Gb : cmb.ld);
            radialProgress2.d = cmb.v0(uj9Var.D() ? cmb.tc : cmb.re, uj9Var.D);
        }
        String r = bc4.r(null, this.X);
        File i0 = i0();
        if (i0 != null && i0.exists()) {
            er3.q(uj9Var.a).v(this);
            this.l0 = (byte) 0;
            radialProgress2.setIcon(z2 ? 4 : 5, false, z);
        } else if (TextUtils.isEmpty(r)) {
            radialProgress2.setIcon(4, false, z);
        } else {
            er3.q(uj9Var.a).a(r, null, this);
            if (bc4.G(uj9Var.a).S(r)) {
                this.l0 = (byte) 2;
                Float s = fn5.z().s(r);
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

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
