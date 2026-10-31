package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z0 extends View implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public org.telegram.messenger.jj M;
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.kn0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String w;
    public z2 x;
    public StaticLayout y;

    public z0(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.r = org.telegram.messenger.i0.L(58.0f);
        this.a = m60Var;
        this.b = f4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        this.J = org.telegram.messenger.b6.q(((h4) m60Var).X).k();
        org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(this);
        this.f = kn0Var;
        kn0Var.h = new y0(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        a(true);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i10 = ((h4) this.a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.L);
        org.telegram.messenger.b8.G(i10);
        boolean exists = org.telegram.messenger.b8.K(this.L, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.b6.q(i10).v(this);
            boolean I = MediaController.B().I(this.M);
            if (!I || (I && MediaController.B().H())) {
                this.H = 0;
            } else {
                this.H = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            if (org.telegram.messenger.b8.G(i10).T(r10)) {
                this.H = 3;
                Float w9 = org.telegram.messenger.hc.D().w(r10);
                if (w9 != null) {
                    radialProgress2.p(z10, w9.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.H = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.jj jjVar;
        int i10;
        if (this.L == null || (jjVar = this.M) == null) {
            return;
        }
        org.telegram.ui.Components.kn0 kn0Var = this.f;
        if (!kn0Var.e) {
            kn0Var.h(jjVar.b0);
        }
        if (!MediaController.B().I(this.M)) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.L.attributes.size()) {
                    i10 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.M.g0;
        }
        String g02 = org.telegram.messenger.i0.g0(i10, false, false);
        String str = this.w;
        if (str == null || !str.equals(g02)) {
            this.w = g02;
            TextPaint textPaint = h4.f1;
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            this.y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        TextPaint textPaint2 = h4.f1;
        ((h4) this.a).getClass();
        textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        invalidate();
    }

    public org.telegram.messenger.jj getMessageObject() {
        return this.M;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.J;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.x;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.c;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.e.p(true, Math.min(1.0f, j10 / j11));
        if (this.H != 3) {
            a(true);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        z2 z2Var = this.x;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.c;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            z2Var3.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.b6.q(((h4) this.a).X).v(this);
        z2 z2Var = this.x;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.c;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            z2Var3.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.We;
        int i11 = org.telegram.ui.ActionBar.t6.Xe;
        int i12 = org.telegram.ui.ActionBar.t6.id;
        int i13 = org.telegram.ui.ActionBar.t6.jd;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.t6.pe;
        m60 m60Var = this.a;
        ((h4) m60Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.t6.v0(i14);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.D, this.E);
        int i15 = org.telegram.ui.ActionBar.t6.ie;
        ((h4) m60Var).getClass();
        int v02 = org.telegram.ui.ActionBar.t6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.t6.je;
        ((h4) m60Var).getClass();
        int v03 = org.telegram.ui.ActionBar.t6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.t6.le;
        ((h4) m60Var).getClass();
        int v04 = org.telegram.ui.ActionBar.t6.v0(i17);
        ((h4) m60Var).getClass();
        int v05 = org.telegram.ui.ActionBar.t6.v0(i17);
        int i18 = org.telegram.ui.ActionBar.t6.ke;
        ((h4) m60Var).getClass();
        int v06 = org.telegram.ui.ActionBar.t6.v0(i18);
        org.telegram.ui.Components.kn0 kn0Var = this.f;
        kn0Var.g(v02, v03, v04, v05, v06);
        kn0Var.b(canvas);
        canvas.restore();
        if (this.y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.F, org.telegram.messenger.i0.L(6.0f) + this.E);
            this.y.draw(canvas);
            canvas.restore();
        }
        int i19 = 0;
        if (this.x != null) {
            canvas.save();
            this.x.s = org.telegram.messenger.i0.L(54.0f) + this.F;
            this.x.w = this.E - org.telegram.messenger.i0.L(16.0f);
            z2 z2Var = this.x;
            canvas.translate(z2Var.s, z2Var.w);
            h4.t(m60Var, canvas, this, 0);
            this.x.d(canvas, this);
            canvas.restore();
            i19 = 1;
        }
        z2 z2Var2 = this.c;
        int i20 = this.r;
        if (z2Var2 != null) {
            canvas.save();
            z2 z2Var3 = this.c;
            int i21 = this.n;
            z2Var3.s = i21;
            z2Var3.w = i20;
            canvas.translate(i21, i20);
            h4.t(m60Var, canvas, this, i19);
            this.c.d(canvas, this);
            canvas.restore();
            i19++;
        }
        if (this.d != null) {
            canvas.save();
            z2 z2Var4 = this.d;
            int i22 = this.n;
            z2Var4.s = i22;
            z2Var4.w = i20 + this.s;
            canvas.translate(i22, i20 + r5);
            h4.t(m60Var, canvas, this, i19);
            this.d.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.K, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754874, null));
        if (this.x != null) {
            sb2.append(", ");
            sb2.append(this.x.d.getText());
        }
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(r0 * 14);
            } else {
                this.n = org.telegram.messenger.i0.L(18.0f);
            }
            int L2 = (size - this.n) - org.telegram.messenger.i0.L(18.0f);
            int L3 = org.telegram.messenger.i0.L(44.0f);
            this.F = org.telegram.messenger.i0.L(16.0f);
            int L4 = org.telegram.messenger.i0.L(5.0f);
            this.G = L4;
            int i13 = this.F;
            this.e.r(i13, L4, i13 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            z2 o10 = h4.o(this.a, this, null, pageblockaudio2.caption.text, L2, this.r, pageblockaudio2, this.b);
            this.c = o10;
            if (o10 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.i0.L(8.0f);
                this.s = height;
                L = org.telegram.messenger.m5.C(8.0f, height, L);
            }
            i12 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            z2 n10 = h4.n(this.a, this, null, pageblockaudio3.caption.credit, L2, this.r + this.s, pageblockaudio3, this.b.G ? org.telegram.ui.Components.ov0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = n10;
            if (n10 != null) {
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += org.telegram.messenger.i0.L(8.0f);
            }
            String x12 = this.M.x1(false);
            String z12 = this.M.z1(false);
            int C = org.telegram.messenger.m5.C(50.0f, this.F, L3);
            this.D = C;
            int L5 = (size - C) - org.telegram.messenger.i0.L(18.0f);
            if (TextUtils.isEmpty(z12) && TextUtils.isEmpty(x12)) {
                this.x = null;
                this.E = ((L3 - org.telegram.messenger.i0.L(30.0f)) / 2) + this.G;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
                if (!TextUtils.isEmpty(x12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, x12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.t6.O2, L5, TextUtils.TruncateAt.END);
                z2 z2Var = new z2(this.a);
                this.x = z2Var;
                z2Var.d = new StaticLayout(ellipsize, h4.f1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.x.n = this.K;
                this.E = org.telegram.messenger.i0.L(11.0f) + ((L3 - org.telegram.messenger.i0.L(30.0f)) / 2) + this.G;
            }
            this.f.i(L5, org.telegram.messenger.i0.L(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r1 <= (org.telegram.messenger.i0.L(48.0f) + r0)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r14.I = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r14.H == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (this.f.e(motionEvent.getX() - this.D, motionEvent.getY() - this.E, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.H != -1) {
                if (x10 >= this.F && x10 <= org.telegram.messenger.i0.L(48.0f) + r2) {
                    if (y3 >= this.G) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.I == 1) {
                this.I = 0;
                playSoundEffect(0);
                int i10 = ((h4) this.a).X;
                int i11 = this.H;
                f4 f4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i11 == 0) {
                    if (f4Var != null && MediaController.B().o0(f4Var.w, this.M, 0L, false, null)) {
                        this.H = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 1) {
                    if (MediaController.B().R(this.M, true)) {
                        this.H = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 2) {
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.b8.G(i10).X(this.L, f4Var == null ? null : f4Var.E, 1, 1);
                    this.H = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i11 == 3) {
                    org.telegram.messenger.b8.G(i10).f(this.L);
                    this.H = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.I = 0;
        }
        if (this.I == 0) {
            if (!h4.j(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!h4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
