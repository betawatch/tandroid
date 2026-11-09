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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x0 extends View implements org.telegram.messenger.x5, org.telegram.ui.Cells.h9 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public org.telegram.messenger.ij M;
    public final q50 a;
    public final e4 b;
    public z2 c;
    public z2 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.km0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String w;
    public z2 x;
    public StaticLayout y;

    public x0(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.r = org.telegram.messenger.g0.L(58.0f);
        this.a = q50Var;
        this.b = e4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        this.J = org.telegram.messenger.z5.q(((g4) q50Var).X).k();
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(this);
        this.f = km0Var;
        km0Var.h = new w0(this, 0);
    }

    private int getIconForCurrentState() {
        int i7 = this.H;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        a(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z9) {
        int i7 = ((g4) this.a).X;
        String r10 = org.telegram.messenger.w7.r(null, this.L);
        org.telegram.messenger.w7.G(i7);
        boolean exists = org.telegram.messenger.w7.J(this.L, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.z5.q(i7).v(this);
            boolean I = MediaController.B().I(this.M);
            if (!I || (I && MediaController.B().H())) {
                this.H = 0;
            } else {
                this.H = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            if (org.telegram.messenger.w7.G(i7).S(r10)) {
                this.H = 3;
                Float w10 = org.telegram.messenger.gc.D().w(r10);
                if (w10 != null) {
                    radialProgress2.p(z9, w10.floatValue());
                } else {
                    radialProgress2.p(z9, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z9);
            } else {
                this.H = 2;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z9);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.ij ijVar;
        int i7;
        if (this.L == null || (ijVar = this.M) == null) {
            return;
        }
        org.telegram.ui.Components.km0 km0Var = this.f;
        if (!km0Var.e) {
            km0Var.h(ijVar.b0);
        }
        if (!MediaController.B().I(this.M)) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.L.attributes.size()) {
                    i7 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i7 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i7 = this.M.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, false, false);
        String str = this.w;
        if (str == null || !str.equals(g02)) {
            this.w = g02;
            TextPaint textPaint = g4.f1;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            this.y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        TextPaint textPaint2 = g4.f1;
        ((g4) this.a).getClass();
        textPaint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        invalidate();
    }

    public org.telegram.messenger.ij getMessageObject() {
        return this.M;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.J;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.e.p(true, Math.min(1.0f, j3 / j10));
        if (this.H != 3) {
            a(true);
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
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
        org.telegram.messenger.z5.q(((g4) this.a).X).v(this);
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
        int i7 = org.telegram.ui.ActionBar.l6.We;
        int i10 = org.telegram.ui.ActionBar.l6.Xe;
        int i11 = org.telegram.ui.ActionBar.l6.id;
        int i12 = org.telegram.ui.ActionBar.l6.jd;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i7, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.l6.pe;
        q50 q50Var = this.a;
        ((g4) q50Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.l6.v0(i13);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.D, this.E);
        int i14 = org.telegram.ui.ActionBar.l6.ie;
        ((g4) q50Var).getClass();
        int v02 = org.telegram.ui.ActionBar.l6.v0(i14);
        int i15 = org.telegram.ui.ActionBar.l6.je;
        ((g4) q50Var).getClass();
        int v03 = org.telegram.ui.ActionBar.l6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.l6.le;
        ((g4) q50Var).getClass();
        int v04 = org.telegram.ui.ActionBar.l6.v0(i16);
        ((g4) q50Var).getClass();
        int v05 = org.telegram.ui.ActionBar.l6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.l6.ke;
        ((g4) q50Var).getClass();
        int v06 = org.telegram.ui.ActionBar.l6.v0(i17);
        org.telegram.ui.Components.km0 km0Var = this.f;
        km0Var.g(v02, v03, v04, v05, v06);
        km0Var.b(canvas);
        canvas.restore();
        if (this.y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.E);
            this.y.draw(canvas);
            canvas.restore();
        }
        int i18 = 0;
        if (this.x != null) {
            canvas.save();
            this.x.s = org.telegram.messenger.g0.L(54.0f) + this.F;
            this.x.w = this.E - org.telegram.messenger.g0.L(16.0f);
            z2 z2Var = this.x;
            canvas.translate(z2Var.s, z2Var.w);
            g4.t(q50Var, canvas, this, 0);
            this.x.d(canvas, this);
            canvas.restore();
            i18 = 1;
        }
        z2 z2Var2 = this.c;
        int i19 = this.r;
        if (z2Var2 != null) {
            canvas.save();
            z2 z2Var3 = this.c;
            int i20 = this.n;
            z2Var3.s = i20;
            z2Var3.w = i19;
            canvas.translate(i20, i19);
            g4.t(q50Var, canvas, this, i18);
            this.c.d(canvas, this);
            canvas.restore();
            i18++;
        }
        if (this.d != null) {
            canvas.save();
            z2 z2Var4 = this.d;
            int i21 = this.n;
            z2Var4.s = i21;
            z2Var4.w = i19 + this.s;
            canvas.translate(i21, i19 + r5);
            g4.t(q50Var, canvas, this, i18);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, q50Var, this.K, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131754874, null));
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r0 * 14);
            } else {
                this.n = org.telegram.messenger.g0.L(18.0f);
            }
            int L2 = (size - this.n) - org.telegram.messenger.g0.L(18.0f);
            int L3 = org.telegram.messenger.g0.L(44.0f);
            this.F = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(5.0f);
            this.G = L4;
            int i12 = this.F;
            this.e.r(i12, L4, i12 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            z2 o4 = g4.o(this.a, this, null, pageblockaudio2.caption.text, L2, this.r, pageblockaudio2, this.b);
            this.c = o4;
            if (o4 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(8.0f);
                this.s = height;
                L = org.telegram.messenger.k5.C(8.0f, height, L);
            }
            i11 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            z2 n10 = g4.n(this.a, this, null, pageblockaudio3.caption.credit, L2, this.r + this.s, pageblockaudio3, this.b.G ? org.telegram.ui.Components.ou0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = n10;
            if (n10 != null) {
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
            String w12 = this.M.w1(false);
            String y12 = this.M.y1(false);
            int C = org.telegram.messenger.k5.C(50.0f, this.F, L3);
            this.D = C;
            int L5 = (size - C) - org.telegram.messenger.g0.L(18.0f);
            if (TextUtils.isEmpty(y12) && TextUtils.isEmpty(w12)) {
                this.x = null;
                this.E = ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.G;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y12) || TextUtils.isEmpty(w12)) ? !TextUtils.isEmpty(y12) ? new SpannableStringBuilder(y12) : new SpannableStringBuilder(w12) : new SpannableStringBuilder(a8.p0.D(w12, " - ", y12));
                if (!TextUtils.isEmpty(w12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31(org.telegram.messenger.g0.o()), 0, w12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.l6.O2, L5, TextUtils.TruncateAt.END);
                z2 z2Var = new z2(this.a);
                this.x = z2Var;
                z2Var.d = new StaticLayout(ellipsize, g4.f1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.x.n = this.K;
                this.E = org.telegram.messenger.g0.L(11.0f) + ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.G;
            }
            this.f.i(L5, org.telegram.messenger.g0.L(30.0f));
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r1 <= (org.telegram.messenger.g0.L(48.0f) + r0)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r18.I = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r18.H == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f.e(motionEvent.getX() - this.D, motionEvent.getY() - this.E, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.H != -1) {
                if (x10 >= this.F && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                    if (y10 >= this.G) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.I == 1) {
                this.I = 0;
                playSoundEffect(0);
                int i7 = ((g4) this.a).X;
                int i10 = this.H;
                e4 e4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i10 == 0) {
                    if (e4Var != null && MediaController.B().o0(e4Var.w, this.M, 0L, false, null, 0L)) {
                        this.H = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 1) {
                    if (MediaController.B().R(this.M, true)) {
                        this.H = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 2) {
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.w7.G(i7).W(this.L, e4Var == null ? null : e4Var.E, 1, 1);
                    this.H = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i10 == 3) {
                    org.telegram.messenger.w7.G(i7).f(this.L);
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
            if (!g4.j(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!g4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
