// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pi9 extends qi9 implements cr3, jm7 {
    public final k47 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final ax9 a0;
    public final TextPaint b0;
    public StaticLayout c0;
    public StaticLayout d0;
    public String e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final RectF n0;
    public byte o0;
    public boolean p0;
    public boolean q0;
    public final int r0;

    public pi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(uj9Var, rect, i);
        this.b0 = new TextPaint(1);
        int L = gm.L(16.0f);
        this.f0 = L;
        int L2 = gm.L(9.0f);
        this.g0 = L2;
        int L3 = gm.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        k47 k47Var = (k47) uj9Var.m.get(pageblockaudio);
        this.X = k47Var;
        this.Y = k47Var != null ? k47Var.F0() : null;
        this.r0 = er3.q(uj9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        ax9 ax9Var = new ax9(null);
        this.a0 = ax9Var;
        ax9Var.h = new yf9(this, (byte) 3);
        j0();
        k0(false);
    }

    @Override // cr3
    public final void A(boolean z) {
        k0(true);
    }

    @Override // qi9
    public final int I() {
        return J();
    }

    @Override // cr3
    public final void N(String str) {
        this.Z.o(true, 1.0f);
        k0(true);
    }

    @Override // qi9
    public final boolean P() {
        return this.a0.e;
    }

    @Override // qi9
    public final void S() {
        View view = this.W;
        if (view != null) {
            this.Z.m(view);
            this.a0.s = this.W;
        }
        k0(false);
        uj9 uj9Var = this.a;
        int i = uj9Var.a;
        int i2 = uj9Var.a;
        nm7.f(i).b(this, nm7.h2);
        nm7.f(i2).b(this, nm7.f2);
        nm7.f(i2).b(this, nm7.g2);
        nm7.f(i2).b(this, nm7.e2);
    }

    @Override // qi9
    public final void U() {
        uj9 uj9Var = this.a;
        er3.q(uj9Var.a).v(this);
        int i = uj9Var.a;
        nm7.f(i).n(this, nm7.h2);
        nm7.f(i).n(this, nm7.f2);
        nm7.f(i).n(this, nm7.g2);
        nm7.f(i).n(this, nm7.e2);
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i = this.l0;
        int i2 = this.c;
        uj9 uj9Var = this.a;
        if (i != i2 + uj9Var.S + uj9Var.T || this.m0 != h0()) {
            j0();
        }
        canvas.save();
        canvas.translate(-uj9Var.S, 0.0f);
        int i3 = uj9Var.D() ? cmb.Dc : cmb.Ye;
        int i4 = uj9Var.D() ? cmb.Ec : cmb.Ze;
        int i5 = uj9Var.D() ? cmb.Fb : cmb.kd;
        int i6 = uj9Var.D() ? cmb.Gb : cmb.ld;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i3, i4, i5, i6);
        radialProgress2.d = cmb.v0(uj9Var.D() ? cmb.tc : cmb.re, uj9Var.D);
        radialProgress2.draw(canvas);
        int v0 = cmb.v0(uj9Var.D() ? cmb.mc : cmb.ke, uj9Var.D);
        int v02 = cmb.v0(uj9Var.D() ? cmb.nc : cmb.le, uj9Var.D);
        int v03 = cmb.v0(uj9Var.D() ? cmb.pc : cmb.ne, uj9Var.D);
        int v04 = cmb.v0(uj9Var.D() ? cmb.pc : cmb.ne, uj9Var.D);
        int v05 = cmb.v0(uj9Var.D() ? cmb.oc : cmb.me, uj9Var.D);
        ax9 ax9Var = this.a0;
        ax9Var.f(v0, v02, v03, v04, v05);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        ax9Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.d0;
        int i7 = this.f0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(gm.L(54.0f) + i7, gm.L(6.0f) + this.j0);
            this.d0.draw(canvas);
            canvas.restore();
        }
        if (this.c0 != null) {
            canvas.save();
            canvas.translate(gm.L(54.0f) + i7, this.j0 - gm.L(16.0f));
            this.c0.draw(canvas);
            canvas.restore();
        }
        boolean z = this.m0;
        RectF rectF = this.n0;
        if (z) {
            if (uj9Var.D()) {
                ylb ylbVar = uj9Var.D;
                drawable = ylbVar != null ? ylbVar.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = cmb.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = cmb.b4;
            }
            int L = (this.l0 + this.b.right) - gm.L(32.0f);
            int L2 = gm.L(7.0f);
            drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
            drawable.draw(canvas);
            rectF.set(L - gm.L(8.0f), 0.0f, gm.L(8.0f) + drawable.getIntrinsicWidth() + L, gm.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1 == 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // qi9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        uj9 uj9Var = this.a;
        float f = x + uj9Var.S;
        float y = motionEvent.getY();
        boolean contains = this.n0.contains(f, y);
        if (actionMasked == 0 && contains) {
            this.q0 = true;
            return true;
        }
        boolean z2 = this.q0;
        TLRPC.Document document = this.Y;
        if (z2) {
            if (actionMasked == 2 && !contains) {
                this.q0 = false;
                return true;
            }
            if (actionMasked == 1) {
                if (contains) {
                    z = true;
                    this.q0 = false;
                    if (z && h0()) {
                        view = this.W;
                        if (view != null) {
                            view.playSoundEffect(0);
                        }
                        uj9Var.F.F(uj9Var.E, document, E());
                        return true;
                    }
                    return true;
                }
            }
            z = false;
            this.q0 = false;
            if (z) {
                view = this.W;
                if (view != null) {
                }
                uj9Var.F.F(uj9Var.E, document, E());
                return true;
            }
            return true;
        }
        if (!this.a0.e(f - this.i0, y - this.j0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.o0 != -1) {
                    if (f >= this.f0 && f <= gm.L(48.0f) + r1) {
                        if (y >= this.g0 && y <= gm.L(48.0f) + r1) {
                            this.p0 = true;
                            View view2 = this.W;
                            if (view2 != null) {
                                view2.invalidate();
                                return true;
                            }
                        }
                    }
                }
                return this.p0;
            }
            if (actionMasked == 1) {
                if (this.p0) {
                    this.p0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    int i = uj9Var.a;
                    byte b = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (b == 0) {
                        if (MediaController.w().n0(uj9Var.l, this.X, 0L, false, null, 0L)) {
                            this.o0 = (byte) 1;
                            radialProgress2.setIcon(i0(), false, true);
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (b == 1) {
                        if (MediaController.w().Q(this.X, true)) {
                            this.o0 = (byte) 0;
                            radialProgress2.setIcon(i0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (b == 2) {
                        radialProgress2.o(false, 0.0f);
                        bc4.G(i).X(document, uj9Var.b, 1, 1);
                        this.o0 = (byte) 3;
                        radialProgress2.setIcon(i0(), true, true);
                        View view6 = this.W;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (b == 3) {
                        bc4.G(i).f(document);
                        this.o0 = (byte) 2;
                        radialProgress2.setIcon(i0(), false, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    }
                    View view8 = this.W;
                    if (view8 != null) {
                        view8.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.p0 = false;
            }
            return this.p0;
        }
        if (actionMasked == 0) {
            Z(true);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            Z(false);
        }
        View view9 = this.W;
        if (view9 != null) {
            view9.invalidate();
            return true;
        }
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        k47 k47Var2 = this.X;
        if (k47Var2 != null) {
            if (i == nm7.h2) {
                k0(true);
                return;
            }
            if (i == nm7.f2 || i == nm7.g2) {
                k0(true);
                return;
            }
            if (i == nm7.e2) {
                if (k47Var2.e1() != ((Integer) objArr[0]).intValue() || (k47Var = MediaController.w().v0) == null) {
                    return;
                }
                k47Var2.b0 = k47Var.b0;
                k47Var2.i0 = k47Var.i0;
                k47Var2.j0 = k47Var.j0;
                l0();
            }
        }
    }

    @Override // cr3
    public final int getObserverTag() {
        return this.r0;
    }

    public final boolean h0() {
        uj9 uj9Var;
        rc2 rc2Var;
        mc2 mc2Var;
        return (this.Y == null || (rc2Var = (uj9Var = this.a).E) == null || (mc2Var = uj9Var.F) == null || !mc2Var.Z1(rc2Var)) ? false : true;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.Z.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        if (this.o0 != 3) {
            k0(true);
        }
    }

    public final int i0() {
        byte b = this.o0;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 3 ? 3 : 0;
    }

    public final void j0() {
        uj9 uj9Var = this.a;
        this.l0 = this.c + uj9Var.S + uj9Var.T;
        this.m0 = h0();
        int L = gm.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        this.k0 = b10.c(this.m0 ? 42.0f : 18.0f, this.l0 - i2, 0);
        k47 k47Var = this.X;
        String w1 = k47Var != null ? k47Var.w1(false) : null;
        String y1 = k47Var != null ? k47Var.y1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(y1);
        int i3 = this.g0;
        if (isEmpty && TextUtils.isEmpty(w1)) {
            this.c0 = null;
            this.j0 = ((i - gm.L(30.0f)) / 2) + i3;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y1) || TextUtils.isEmpty(w1)) ? !TextUtils.isEmpty(y1) ? new SpannableStringBuilder(y1) : new SpannableStringBuilder(w1) : new SpannableStringBuilder(td4.q(w1, " - ", y1));
            if (!TextUtils.isEmpty(w1)) {
                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, w1.length(), 18);
            }
            this.b0.setTextSize(gm.L(16.0f));
            int L2 = gm.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, cmb.N2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = gm.L(11.0f) + ((i - gm.L(30.0f)) / 2) + i3;
        }
        this.a0.h(this.k0, gm.L(30.0f));
    }

    public final void k0(boolean z) {
        File J;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = bc4.r(null, document);
        if (document == null) {
            J = null;
        } else {
            bc4.G(i);
            J = bc4.J(document, null, true, true);
        }
        boolean z2 = J != null && J.exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        k47 k47Var = this.X;
        if (z2) {
            er3.q(i).v(this);
            if (!MediaController.w().D(k47Var) || MediaController.w().C()) {
                this.o0 = (byte) 0;
            } else {
                this.o0 = (byte) 1;
            }
            radialProgress2.setIcon(i0(), false, z);
        } else {
            er3.q(i).a(r, null, this);
            if (!gda.x0 || k47Var == null || !k47Var.I3() || k47.Q5(k47Var.k) || pg3.B(k47.B0(k47Var.k))) {
                if (bc4.G(i).S(r)) {
                    this.o0 = (byte) 3;
                    Float s = fn5.z().s(r);
                    radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                    radialProgress2.setIcon(i0(), true, z);
                } else {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(i0(), false, z);
                }
            } else {
                this.o0 = (!MediaController.w().D(k47Var) || MediaController.w().C()) ? (byte) 0 : (byte) 1;
                radialProgress2.setIcon(i0(), false, z);
            }
        }
        l0();
    }

    public final void l0() {
        k47 k47Var;
        int i;
        TLRPC.Document document = this.Y;
        if (document == null || (k47Var = this.X) == null) {
            return;
        }
        ax9 ax9Var = this.a0;
        if (!ax9Var.e) {
            ax9Var.g(k47Var.b0);
        }
        if (!MediaController.w().D(k47Var)) {
            int i2 = 0;
            while (true) {
                if (i2 >= document.attributes.size()) {
                    i = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i = (int) documentAttribute.duration;
                    break;
                }
                i2++;
            }
        } else {
            i = k47Var.i0;
        }
        String g0 = gm.g0(i, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g0)) {
            this.e0 = g0;
            textPaint.setTextSize(gm.L(16.0f));
            this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        uj9 uj9Var = this.a;
        textPaint.setColor(cmb.v0(uj9Var.D() ? cmb.Vc : cmb.Uc, uj9Var.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
