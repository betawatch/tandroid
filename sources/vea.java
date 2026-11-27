// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class vea extends FrameLayout implements jq3, fn7, snb {
    public int E;
    public dm F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public dm K;
    public float L;
    public float M;
    public StaticLayout N;
    public r47 O;
    public boolean P;
    public final int Q;
    public final int R;
    public byte S;
    public int T;
    public final RadialProgress2 U;
    public final boolean V;
    public StaticLayout W;
    public final SpannableStringBuilder a;
    public int a0;
    public final og2 b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final vnb d0;
    public boolean e;
    public boolean e0;
    public byte f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public qcc j0;
    public float k0;
    public tk4 l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public dm y;

    /* JADX WARN: Multi-variable type inference failed */
    public vea(int i, vnb vnbVar, Context context) {
        super(context);
        this.r = hl.L(9.0f);
        this.E = hl.L(29.0f);
        this.J = hl.L(29.0f);
        int i2 = yac.t0;
        this.Q = i2;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = vnbVar;
        this.V = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.U = radialProgress2;
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        this.R = lq3.q(i2).k();
        setWillNotDraw(false);
        og2 og2Var = new og2(22, vnbVar, context);
        this.b = og2Var;
        og2Var.setVisibility(4);
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        boolean z = ob6.a0;
        addView(og2Var, tre.d(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 38.1f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(hl.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(hl.L(13.0f));
        if (vnbVar != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(hl.o());
            textPaint3.setTextSize(hl.L(15.0f));
            textPaint3.setColor(aob.v0(aob.G6, vnbVar));
        }
    }

    private int getIconForCurrentState() {
        byte b = this.S;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.T;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    @Override // jq3
    public final void B(boolean z) {
        g(true, z);
    }

    @Override // jq3
    public final void N(String str) {
        this.U.o(true, 1.0f);
        g(false, true);
    }

    public void a() {
        byte b = this.S;
        int i = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b == 0) {
            if (this.T == 0) {
                this.O.P = true;
                xb4.G(i).X(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.o(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = (byte) 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 1) {
            if (MediaController.z().U(this.O, true)) {
                this.S = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 2) {
            radialProgress2.o(false, 0.0f);
            this.O.P = true;
            xb4.G(i).X(this.O.F0(), this.O, 1, 0);
            this.S = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (b == 4) {
            xb4.G(i).f(this.O.F0());
            this.S = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        vnb vnbVar = this.d0;
        if (this.V) {
            this.b0.setColor(aob.v0(aob.A6, vnbVar));
        }
        StaticLayout staticLayout2 = this.W;
        int i = this.r;
        int i2 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? 24.0f : hl.C) + (ob6.a0 ? 0 : this.a0), i);
            this.W.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = aob.f3.getAlpha();
            float f = this.h0;
            if (f != 1.0f) {
                aob.f3.setAlpha((int) (alpha * f));
            }
            canvas.save();
            int L = hl.L(ob6.a0 ? 24.0f : hl.C);
            if (ob6.a0 && (staticLayout = this.W) != null) {
                i2 = staticLayout.getWidth() + hl.L(ob6.a0 ? 12.0f : 4.0f);
            }
            canvas.translate(((L + i2) + (ob6.a0 ? this.s.getWidth() - this.x : 0.0f)) - this.w, i);
            this.s.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                aob.f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(aob.v0(aob.G6, vnbVar));
            canvas.save();
            canvas.translate((hl.L(ob6.a0 ? 24.0f : hl.C) + (ob6.a0 ? this.N.getWidth() - this.M : 0.0f)) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            aob.g3.setColor(aob.v0(aob.z6, vnbVar));
            int alpha2 = aob.g3.getAlpha();
            float f2 = this.h0;
            if (f2 != 1.0f) {
                aob.g3.setAlpha((int) (alpha2 * f2));
            }
            canvas.save();
            canvas.translate((hl.L(ob6.a0 ? 24.0f : hl.C) + (ob6.a0 ? this.I.getWidth() - this.H : 0.0f)) - this.G, this.E);
            this.I.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                aob.g3.setAlpha(alpha2);
            }
        }
        int v0 = aob.v0(this.d ? aob.ae : aob.Zd, vnbVar);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = v0;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (ob6.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - hl.L(72.0f)) - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", vnbVar));
            } else {
                canvas.drawLine(hl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", vnbVar));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z = this.e0;
        float f = this.f0;
        if (z) {
            if (f != 1.0f) {
                this.f0 = f + 0.10666667f;
                invalidate();
            }
        } else {
            if (f == 0.0f) {
                return;
            }
            if (f != 0.0f) {
                this.f0 = f - 0.10666667f;
                invalidate();
            }
        }
        this.f0 = Utilities.i(this.f0, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - hl.L(12.0f)) - aob.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - aob.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.f0;
        canvas.scale(f2, f2, (aob.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (aob.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = aob.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, aob.Y0.getIntrinsicHeight() + measuredHeight);
        aob.Y0.draw(canvas);
        canvas.restore();
    }

    public boolean d(r47 r47Var) {
        qcc qccVar = this.j0;
        return qccVar != null && ((Boolean) qccVar.a(r47Var)).booleanValue();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.g0;
        if (z) {
            float f = this.h0;
            if (f != 1.0f) {
                this.h0 = f + 0.10666667f;
                invalidate();
                this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
                if (this.k0 != 1.0f || this.l0 == null) {
                    b(canvas);
                    c(canvas);
                    super.dispatchDraw(canvas);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.k0) * 255.0f), 31);
                this.l0.setViewType(4);
                this.l0.updateColors();
                this.l0.f();
                this.l0.draw(canvas);
                canvas.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.k0 * 255.0f), 31);
                b(canvas);
                super.dispatchDraw(canvas);
                c(canvas);
                canvas.restore();
                return;
            }
        }
        if (!z) {
            float f2 = this.h0;
            if (f2 != 0.0f) {
                this.h0 = f2 - 0.10666667f;
                invalidate();
            }
        }
        this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
        if (this.k0 != 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        og2 og2Var = this.b;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, z2);
    }

    public final void f(r47 r47Var, boolean z) {
        this.c = z;
        this.O = r47Var;
        TLRPC.Document F0 = r47Var.F0();
        TLRPC.PhotoSize w = F0 != null ? xb4.w(F0.thumbs, 360, false, null, false) : null;
        boolean z2 = w instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (z2 || (w instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w, F0, r47Var);
        } else {
            Bitmap bitmap = r47Var.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.f0(bitmap);
            } else {
                String u0 = r47Var.u0(true);
                if (TextUtils.isEmpty(u0)) {
                    radialProgress2.i(null, null, null);
                } else {
                    radialProgress2.h(u0);
                }
            }
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z, boolean z2) {
        byte b;
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        r47 r47Var = this.O;
        boolean z3 = r47Var.y0 || r47Var.z0;
        if (xea.x0 && r47Var.I3() && ((int) r47.B0(this.O.k)) != 0) {
            b = z3 ? (byte) 1 : (byte) 2;
            this.f = b;
            z3 = true;
        } else {
            this.f = (byte) 0;
            this.T = -1;
            b = 0;
        }
        int i = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b == 0) {
            if (z3) {
                lq3.q(i).v(this);
                boolean H = MediaController.z().H(this.O);
                if (!H || (H && MediaController.z().G())) {
                    this.S = (byte) 0;
                } else {
                    this.S = (byte) 1;
                }
                radialProgress2.o(z2, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            lq3.q(i).a(S0, this.O, this);
            if (xb4.G(i).S(S0)) {
                this.S = (byte) 4;
                Float s = in5.z().s(S0);
                if (s != null) {
                    radialProgress2.o(z2, s.floatValue());
                } else {
                    radialProgress2.o(z2, 0.0f);
                }
            } else {
                this.S = (byte) 2;
                radialProgress2.o(z2, 0.0f);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
            return;
        }
        radialProgress2.l(aob.v0(this.O.O3() ? aob.Ec : aob.Ze, this.d0));
        boolean H2 = MediaController.z().H(this.O);
        if (!H2 || (H2 && MediaController.z().G())) {
            this.S = (byte) 0;
        } else {
            this.S = (byte) 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.f == 1) {
            lq3.q(i).v(this);
            this.T = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        lq3.q(i).a(S0, this.O, this);
        if (!xb4.G(i).S(S0)) {
            this.T = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.T = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z, z2);
        Float s2 = in5.z().s(S0);
        if (s2 != null) {
            radialProgress2.o(z2, s2.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
    }

    public r47 getMessage() {
        return this.O;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.R;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.U.o(true, Math.min(1.0f, j / j2));
        if (this.f != 0) {
            if (this.T != 1) {
                g(false, true);
            }
        } else if (this.S != 4) {
            g(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        g(false, false);
        int i = this.Q;
        jn7.f(i).b(this, jn7.f2);
        jn7.f(i).b(this, jn7.g2);
        jn7.f(i).b(this, jn7.h2);
        this.y = hm.update(0, this, this.y, this.s);
        this.F = hm.update(0, this, this.F, this.I);
        this.K = hm.update(0, this, this.K, this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.Q;
        lq3.q(i).v(this);
        this.U.f();
        jn7.f(i).n(this, jn7.f2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.h2);
        hm.release(this, this.y);
        hm.release(this, this.F);
        hm.release(this, this.K);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(ob6.a0("AccDescrMusicInfo", null, 2131754827, this.O.w1(true), this.O.y1(true)));
        } else if (this.s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? ob6.M0(2131754925, "AccActionPlay") : ob6.M0(2131754937, "AccActionCancelDownload") : ob6.M0(2131754934, "AccActionDownload") : ob6.M0(2131754926, "AccActionPause")));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(1:3)(1:100)|4|(3:92|93|(33:97|7|8|9|(1:11)|12|(1:14)|15|(1:17)(1:89)|18|(1:20)(1:88)|21|22|(5:24|(1:26)(1:39)|27|(5:29|(1:31)(1:37)|32|(1:34)(1:36)|35)|38)|(3:78|79|(14:83|(1:85)|86|52|(1:54)(1:77)|55|(1:57)(1:76)|58|59|(1:61)|62|(1:64)(1:72)|65|(2:67|68)(2:70|71)))|41|(1:43)|(1:45)|(1:47)|48|(1:50)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)))|6|7|8|9|(0)|12|(0)|15|(0)(0)|18|(0)(0)|21|22|(0)|(0)|41|(0)|(0)|(0)|48|(0)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fd A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0272 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        CharSequence c;
        StaticLayout staticLayout;
        CharSequence v1;
        CharSequence v12;
        TextPaint textPaint;
        this.I = null;
        this.s = null;
        this.N = null;
        int size = (View.MeasureSpec.getSize(i) - hl.L(hl.C)) - hl.L(28.0f);
        TextPaint textPaint2 = this.b0;
        boolean z = this.V;
        if (z) {
            String e1 = ob6.e1(this.O.k.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(e1));
            this.W = wb2.K1(e1, textPaint2, ceil, ceil, 0, 1);
            this.a0 = hl.L(20.0f) + ((size - ceil) - hl.L(8.0f));
            i3 = hl.L(12.0f) + ceil;
        } else {
            i3 = 0;
        }
        vnb vnbVar = this.d0;
        if (z) {
            try {
            } catch (Exception e) {
                e = e;
                f = 4.0f;
                cc4.g(e, true);
                if (this.O.r2()) {
                }
                if (z) {
                }
                CharSequence replace = this.O.w1(true).replace('\n', ' ');
                v1 = hl.v1(replace, this.O.a2, vnbVar);
                if (v1 != null) {
                }
                if (z) {
                }
                if (!z) {
                }
                if (this.O.L0() > 0.0d) {
                }
                staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(r5), TextUtils.TruncateAt.END)).append((CharSequence) r5), textPaint2, size + hl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.I = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                this.F = hm.update(0, this, this.F, this.I);
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(56.0f) + (this.N != null ? hl.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (ob6.a0) {
                }
                int L = hl.L(f) + r0;
                this.h = L;
                int L2 = hl.L(6.0f);
                this.n = L2;
                this.U.p(L, L2, hl.L(48.0f) + r0, hl.L(50.0f));
                measureChildWithMargins(this.b, i, 0, i2, 0);
                if (this.N == null) {
                }
            }
            if (r47.Q4(this.O.k) || this.O.g4()) {
                c = yg4.c(this.O, true, 1, null);
                f = 4.0f;
                v12 = hl.v1(c, this.O.a2, vnbVar);
                if (v12 != null) {
                    c = v12;
                }
                textPaint = this.i0;
                if (textPaint == null) {
                    textPaint = aob.f3;
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(c, textPaint, size - i3, TextUtils.TruncateAt.END), textPaint, (hl.L(4.0f) + size) - i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout2;
                this.w = staticLayout2.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.y = hm.update(0, this, this.y, this.s);
                if (this.O.r2()) {
                    CharSequence v13 = hl.v1(TextUtils.isEmpty(this.O.k.message) ? "" : pv3.m(this.O.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), aob.o2.getFontMetricsInt(), false, null, 0), this.O.a2, vnbVar);
                    if (v13 != null) {
                        String str = (String) this.O.a2.get(0);
                        TextPaint textPaint3 = this.c0;
                        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(hl.Q(v13, str, size, textPaint3), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, hl.L(f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.N = staticLayout3;
                        this.L = staticLayout3.getLineCount() > 0 ? this.N.getLineLeft(0) : 0.0f;
                        this.M = this.N.getLineCount() > 0 ? this.N.getLineWidth(0) : 0.0f;
                    }
                    this.K = hm.update(0, this, this.K, this.N);
                }
                if (z) {
                    try {
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    if (r47.Q4(this.O.k) || this.O.g4()) {
                        String g0 = hl.g0((int) this.O.L0(), false, false);
                        if (!z) {
                            textPaint2 = aob.g3;
                        }
                        staticLayout = new StaticLayout(TextUtils.ellipsize(g0, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + hl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.I = staticLayout;
                        this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                        this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                        this.F = hm.update(0, this, this.F, this.I);
                        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(56.0f) + (this.N != null ? hl.L(18.0f) : 0) + (this.c ? 1 : 0));
                        int x = ob6.a0 ? qu6.x(8.0f, View.MeasureSpec.getSize(i), hl.L(52.0f)) : hl.L(8.0f);
                        int L3 = hl.L(f) + x;
                        this.h = L3;
                        int L22 = hl.L(6.0f);
                        this.n = L22;
                        this.U.p(L3, L22, hl.L(48.0f) + x, hl.L(50.0f));
                        measureChildWithMargins(this.b, i, 0, i2, 0);
                        if (this.N == null) {
                            this.E = hl.L(29.0f);
                            return;
                        } else {
                            this.J = hl.L(29.0f);
                            this.E = hl.L(18.0f) + hl.L(29.0f);
                            return;
                        }
                    }
                }
                CharSequence replace2 = this.O.w1(true).replace('\n', ' ');
                v1 = hl.v1(replace2, this.O.a2, vnbVar);
                if (v1 != null) {
                    replace2 = v1;
                }
                if (z) {
                    replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(yg4.c(this.O, true, 1, null));
                }
                if (!z) {
                    textPaint2 = aob.g3;
                }
                String concat = this.O.L0() > 0.0d ? " • ".concat(ob6.R((int) Math.ceil(this.O.L0()))) : "";
                staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(concat), TextUtils.TruncateAt.END)).append((CharSequence) concat), textPaint2, size + hl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.I = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                this.F = hm.update(0, this, this.F, this.I);
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(56.0f) + (this.N != null ? hl.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (ob6.a0) {
                }
                int L32 = hl.L(f) + x;
                this.h = L32;
                int L222 = hl.L(6.0f);
                this.n = L222;
                this.U.p(L32, L222, hl.L(48.0f) + x, hl.L(50.0f));
                measureChildWithMargins(this.b, i, 0, i2, 0);
                if (this.N == null) {
                }
            }
        }
        c = this.O.y1(true).replace('\n', ' ');
        f = 4.0f;
        v12 = hl.v1(c, this.O.a2, vnbVar);
        if (v12 != null) {
        }
        textPaint = this.i0;
        if (textPaint == null) {
        }
        StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(c, textPaint, size - i3, TextUtils.TruncateAt.END), textPaint, (hl.L(4.0f) + size) - i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout22;
        this.w = staticLayout22.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.y = hm.update(0, this, this.y, this.s);
        if (this.O.r2()) {
        }
        if (z) {
        }
        CharSequence replace22 = this.O.w1(true).replace('\n', ' ');
        v1 = hl.v1(replace22, this.O.a2, vnbVar);
        if (v1 != null) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (this.O.L0() > 0.0d) {
        }
        staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(concat), TextUtils.TruncateAt.END)).append((CharSequence) concat), textPaint2, size + hl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.I = staticLayout;
        this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
        this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
        this.F = hm.update(0, this, this.F, this.I);
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(56.0f) + (this.N != null ? hl.L(18.0f) : 0) + (this.c ? 1 : 0));
        if (ob6.a0) {
        }
        int L322 = hl.L(f) + x;
        this.h = L322;
        int L2222 = hl.L(6.0f);
        this.n = L2222;
        this.U.p(L322, L2222, hl.L(48.0f) + x, hl.L(50.0f));
        measureChildWithMargins(this.b, i, 0, i2, 0);
        if (this.N == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int L;
        int L2;
        int i;
        if (this.O == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int L3 = hl.L(36.0f);
        boolean z2 = this.T >= 0 && x >= (L2 = this.h + (L = hl.L(27.0f))) && x <= L2 + L3 && y >= (i = this.n + L) && y <= i + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.U;
        if (action == 0) {
            if (z2) {
                this.e = true;
                radialProgress2.n(true, true);
                invalidate();
            } else if (this.P && radialProgress2.a.contains(x, y)) {
                requestDisallowInterceptTouchEvent(true);
                this.d = true;
                radialProgress2.n(true, false);
                invalidate();
            }
            z = true;
            radialProgress2.n(this.e, true);
            boolean z3 = !z || this.d;
            if (motionEvent.getAction() == 3) {
                return z3;
            }
            this.e = false;
            this.d = false;
            radialProgress2.n(false, false);
            radialProgress2.n(this.e, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.e) {
                this.e = false;
                playSoundEffect(0);
                int i2 = this.T;
                int i3 = this.Q;
                if (i2 == 0) {
                    this.T = 1;
                    radialProgress2.o(false, 0.0f);
                    xb4.G(i3).X(this.O.F0(), this.O, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.z().H(this.O)) {
                        MediaController.z().m(true, true, false, false);
                    }
                    this.T = 0;
                    xb4.G(i3).f(this.O.F0());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (this.d) {
                this.d = false;
                playSoundEffect(0);
                a();
                invalidate();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            this.e = false;
            this.d = false;
            invalidate();
        } else if (motionEvent.getAction() == 2 && !z2 && this.e) {
            this.e = false;
            invalidate();
        }
        z = false;
        radialProgress2.n(this.e, true);
        if (z) {
        }
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z) {
        this.P = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.l0 = tk4Var;
    }

    public void setNeedPlayMessageListener(qcc qccVar) {
        this.j0 = qccVar;
    }

    @Override // snb
    public final void updateColors() {
        r47 r47Var;
        try {
            TextPaint textPaint = this.i0;
            vnb vnbVar = this.d0;
            if (textPaint != null) {
                textPaint.setColor(aob.v0(aob.G6, vnbVar));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (r47Var = this.O) != null) {
                radialProgress2.l(aob.v0(r47Var.O3() ? aob.Ec : aob.Ze, vnbVar));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }

    public vea(Context context) {
        this(0, null, context);
    }
}
