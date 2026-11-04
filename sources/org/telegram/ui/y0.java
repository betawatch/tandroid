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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y0 extends View implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockAudio L;
    public TLRPC.Document M;
    public org.telegram.messenger.zi N;
    public final i50 a;
    public final g4 b;
    public a3 c;
    public a3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.mm0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String w;
    public a3 x;
    public StaticLayout y;

    public y0(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.r = org.telegram.messenger.g0.L(58.0f);
        this.a = i50Var;
        this.b = g4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        this.K = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this);
        this.f = mm0Var;
        mm0Var.h = new x0(this, 0);
    }

    private int getIconForCurrentState() {
        int i3 = this.I;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return i3 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        a(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i3 = ((i4) this.a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.M);
        org.telegram.messenger.w7.G(i3);
        boolean exists = org.telegram.messenger.w7.K(this.M, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.z5.q(i3).v(this);
            boolean I = MediaController.B().I(this.N);
            if (!I || (I && MediaController.B().H())) {
                this.I = 0;
            } else {
                this.I = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            if (org.telegram.messenger.w7.G(i3).T(r5)) {
                this.I = 3;
                Float w10 = org.telegram.messenger.zb.D().w(r5);
                if (w10 != null) {
                    radialProgress2.p(z10, w10.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.I = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.zi ziVar;
        int i3;
        if (this.M == null || (ziVar = this.N) == null) {
            return;
        }
        org.telegram.ui.Components.mm0 mm0Var = this.f;
        if (!mm0Var.e) {
            mm0Var.h(ziVar.b0);
        }
        if (!MediaController.B().I(this.N)) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.M.attributes.size()) {
                    i3 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i3 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i3 = this.N.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i3, false, false);
        String str = this.w;
        if (str == null || !str.equals(g02)) {
            this.w = g02;
            TextPaint textPaint = i4.g1;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            this.y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        TextPaint textPaint2 = i4.g1;
        ((i4) this.a).getClass();
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        invalidate();
    }

    public org.telegram.messenger.zi getMessageObject() {
        return this.N;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.K;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.e.p(true, Math.min(1.0f, j10 / j11));
        if (this.I != 3) {
            a(true);
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.x;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.c;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        a3 a3Var = this.x;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.c;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(((i4) this.a).Y).v(this);
        a3 a3Var = this.x;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.c;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.We;
        int i10 = org.telegram.ui.ActionBar.k6.Xe;
        int i11 = org.telegram.ui.ActionBar.k6.id;
        int i12 = org.telegram.ui.ActionBar.k6.jd;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i3, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.k6.pe;
        i50 i50Var = this.a;
        ((i4) i50Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.k6.v0(i13);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.E, this.F);
        int i14 = org.telegram.ui.ActionBar.k6.ie;
        ((i4) i50Var).getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14);
        int i15 = org.telegram.ui.ActionBar.k6.je;
        ((i4) i50Var).getClass();
        int v03 = org.telegram.ui.ActionBar.k6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.k6.le;
        ((i4) i50Var).getClass();
        int v04 = org.telegram.ui.ActionBar.k6.v0(i16);
        ((i4) i50Var).getClass();
        int v05 = org.telegram.ui.ActionBar.k6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.k6.ke;
        ((i4) i50Var).getClass();
        int v06 = org.telegram.ui.ActionBar.k6.v0(i17);
        org.telegram.ui.Components.mm0 mm0Var = this.f;
        mm0Var.g(v02, v03, v04, v05, v06);
        mm0Var.b(canvas);
        canvas.restore();
        if (this.y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.G, org.telegram.messenger.g0.L(6.0f) + this.F);
            this.y.draw(canvas);
            canvas.restore();
        }
        int i18 = 0;
        if (this.x != null) {
            canvas.save();
            this.x.s = org.telegram.messenger.g0.L(54.0f) + this.G;
            this.x.w = this.F - org.telegram.messenger.g0.L(16.0f);
            a3 a3Var = this.x;
            canvas.translate(a3Var.s, a3Var.w);
            i4.t(i50Var, canvas, this, 0);
            this.x.d(canvas, this);
            canvas.restore();
            i18 = 1;
        }
        a3 a3Var2 = this.c;
        int i19 = this.r;
        if (a3Var2 != null) {
            canvas.save();
            a3 a3Var3 = this.c;
            int i20 = this.n;
            a3Var3.s = i20;
            a3Var3.w = i19;
            canvas.translate(i20, i19);
            i4.t(i50Var, canvas, this, i18);
            this.c.d(canvas, this);
            canvas.restore();
            i18++;
        }
        if (this.d != null) {
            canvas.save();
            a3 a3Var4 = this.d;
            int i21 = this.n;
            a3Var4.s = i21;
            a3Var4.w = i19 + this.s;
            canvas.translate(i21, i19 + r5);
            i4.t(i50Var, canvas, this, i18);
            this.d.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.L, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754874, null));
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.L;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r0 * 14);
            } else {
                this.n = org.telegram.messenger.g0.L(18.0f);
            }
            int L2 = (size - this.n) - org.telegram.messenger.g0.L(18.0f);
            int L3 = org.telegram.messenger.g0.L(44.0f);
            this.G = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(5.0f);
            this.H = L4;
            int i12 = this.G;
            this.e.r(i12, L4, i12 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.L;
            a3 o10 = i4.o(this.a, this, null, pageblockaudio2.caption.text, L2, this.r, pageblockaudio2, this.b);
            this.c = o10;
            if (o10 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(8.0f);
                this.s = height;
                L = org.telegram.messenger.k5.C(8.0f, height, L);
            }
            i11 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.L;
            a3 n4 = i4.n(this.a, this, null, pageblockaudio3.caption.credit, L2, this.r + this.s, pageblockaudio3, this.b.H ? org.telegram.ui.Components.lu0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = n4;
            if (n4 != null) {
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
            }
            if (!this.h && this.L.level <= 0) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
            String x12 = this.N.x1(false);
            String z12 = this.N.z1(false);
            int C = org.telegram.messenger.k5.C(50.0f, this.G, L3);
            this.E = C;
            int L5 = (size - C) - org.telegram.messenger.g0.L(18.0f);
            if (TextUtils.isEmpty(z12) && TextUtils.isEmpty(x12)) {
                this.x = null;
                this.F = ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
                if (!TextUtils.isEmpty(x12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, x12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L5, TextUtils.TruncateAt.END);
                a3 a3Var = new a3(this.a);
                this.x = a3Var;
                a3Var.d = new StaticLayout(ellipsize, i4.g1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.x.n = this.L;
                this.F = org.telegram.messenger.g0.L(11.0f) + ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
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
    
        r18.J = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r18.I == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (this.f.e(motionEvent.getX() - this.E, motionEvent.getY() - this.F, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.I != -1) {
                if (x10 >= this.G && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                    if (y9 >= this.H) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.J == 1) {
                this.J = 0;
                playSoundEffect(0);
                int i3 = ((i4) this.a).Y;
                int i10 = this.I;
                g4 g4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i10 == 0) {
                    if (g4Var != null && MediaController.B().o0(g4Var.w, this.N, 0L, false, null, 0L)) {
                        this.I = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 1) {
                    if (MediaController.B().R(this.N, true)) {
                        this.I = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 2) {
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.w7.G(i3).X(this.M, g4Var == null ? null : g4Var.F, 1, 1);
                    this.I = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i10 == 3) {
                    org.telegram.messenger.w7.G(i3).f(this.M);
                    this.I = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.J = 0;
        }
        if (this.J == 0) {
            if (!i4.j(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!i4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
