package sg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c00;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.t8;
import org.telegram.ui.ex0;
import org.telegram.ui.km;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 {
    public static int W;
    public float A;
    public boolean B;
    public int C;
    public boolean D;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float N;
    public float O;
    public m0 P;
    public boolean Q;
    public rh.o R;
    public float a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final float q;
    public int r;
    public final org.telegram.ui.Cells.z w;
    public jj x;
    public p6 y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final l0 X = new l0();
    public static int Y = 1;
    public static final ex0 Z = new ex0(16);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = d20.s0;

    public p0(org.telegram.ui.Cells.z zVar) {
        this.w = zVar;
        n(this.y);
        this.q = ViewConfiguration.get(w0.b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f7 = rectF.left;
        rectF2.set(f7, rectF.top, org.telegram.messenger.i0.L(12.0f) + f7, rectF.top + org.telegram.messenger.i0.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - org.telegram.messenger.i0.L(12.0f), rectF.left + org.telegram.messenger.i0.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f10 = rectF.height() > ((float) org.telegram.messenger.i0.L(26.0f)) ? 1.4f : 0.0f;
        float N = rectF.right - org.telegram.messenger.i0.N(9.09f);
        float N2 = N - org.telegram.messenger.i0.N(0.056f);
        float N3 = org.telegram.messenger.i0.N(1.22f) + N;
        float N4 = org.telegram.messenger.i0.N(3.07f) + N;
        float N5 = org.telegram.messenger.i0.N(2.406f) + N;
        float N6 = org.telegram.messenger.i0.N(8.27f + f10) + N;
        float N7 = org.telegram.messenger.i0.N(8.923f + f10) + N;
        float N8 = org.telegram.messenger.i0.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - org.telegram.messenger.i0.N(1.753f);
        float N10 = org.telegram.messenger.i0.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - org.telegram.messenger.i0.N(0.663f);
        float f11 = 10.263f + f10;
        float N12 = org.telegram.messenger.i0.N(f11) + rectF.top;
        float N13 = rectF.bottom - org.telegram.messenger.i0.N(f11);
        float f12 = f10 + 11.333f;
        float N14 = org.telegram.messenger.i0.N(f12) + rectF.top;
        float N15 = rectF.bottom - org.telegram.messenger.i0.N(f12);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f13 = rectF.top;
        path.cubicTo(N5, N10, N3, f13, N2, f13);
        path.close();
    }

    public static long j(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static void n(p6 p6Var) {
        S.setColor(t6.w0(t6.We, p6Var));
        int w02 = t6.w0(t6.Gi, p6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        t8 t8Var;
        int i10;
        int i11;
        if (this.x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.t;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i12)).b();
            i12++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i13 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i13);
            String str = m0Var.n;
            kq kqVar = m0Var.E;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null) {
                hashMap.remove(m0Var.n);
                int i14 = m0Var.w;
                int i15 = m0Var2.w;
                if (i14 == i15 && m0Var.x == m0Var2.x && m0Var.z == m0Var2.z && m0Var.v == m0Var2.v && m0Var.o == m0Var2.o && m0Var.S == null && m0Var2.S == null) {
                    m0Var.b = 0;
                    i13++;
                } else {
                    m0Var.c = i15;
                    m0Var.d = m0Var2.x;
                    m0Var.e = m0Var2.z;
                    m0Var.h = m0Var2.M;
                    m0Var.f = m0Var2.N;
                    m0Var.g = m0Var2.O;
                    m0Var.b = 3;
                    int i16 = m0Var.v;
                    int i17 = m0Var2.v;
                    if (i16 != i17 && kqVar != null) {
                        kqVar.c(i17, false);
                        kqVar.c(m0Var.v, true);
                    }
                    t8 t8Var2 = m0Var.S;
                    if (t8Var2 != null || m0Var2.S != null) {
                        if (t8Var2 == null) {
                            m0Var.o(new ArrayList());
                        }
                        if (m0Var2.S == null) {
                            m0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.T;
                        ArrayList arrayList4 = m0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (0; i11 < arrayList3.size(); i11 + 1) {
                                TLObject tLObject = (TLObject) arrayList3.get(i11);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i11);
                                i11 = (tLObject == null || tLObject2 == null || j(tLObject) != j(tLObject2)) ? 0 : i11 + 1;
                            }
                        }
                        t8 t8Var3 = m0Var.S;
                        if (t8Var3 != null && (t8Var = m0Var2.S) != null) {
                            ValueAnimator valueAnimator = t8Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (t8Var3.w) {
                                    t8Var3.w = false;
                                    t8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.l;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = t8Var3.b[i18].h;
                                t8Var3.j(i18, i10, t8Var.b[i18].h);
                                i18++;
                            }
                            t8Var3.a(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                t8Var3.j(i19, i10, tLObjectArr[i19]);
                            }
                            t8Var3.d = true;
                            t8Var3.a(true, false);
                        }
                    }
                }
            } else {
                m0Var.b = 1;
            }
            z10 = true;
            i13++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((m0) arrayList.get(i20)).k = ((m0) arrayList.get(i20)).m;
                ((m0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f7 = this.f;
            if (f7 != this.b || this.g != this.c) {
                this.i = true;
                this.d = f7;
                this.e = this.g;
                z10 = true;
            }
        }
        if (this.C != this.o) {
            z10 = true;
        }
        int i21 = this.F;
        if (i21 == this.n) {
            return z10;
        }
        this.j = true;
        this.G = i21;
        return true;
    }

    public final void b(o0 o0Var) {
        int i10 = 0;
        if (o0Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.w);
                int i11 = W;
                W = i11 + 1;
                imageReceiver.v1 = Integer.toString(i11);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.l).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(ic.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || o0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (o0Var.f(((m0) arrayList.get(i10)).q)) {
                ((m0) arrayList.get(i10)).p();
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        jj jjVar;
        TLRPC.Message message;
        int i10 = 0;
        if (this.p || (jjVar = this.x) == null || (message = jjVar.k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.w;
        if (c3.i0.t(zVar)) {
            y3 -= zVar.getPaddingTop();
            if (zVar instanceof s0) {
                x10 -= ((s0) zVar).j0 / 2.0f;
            }
        }
        float f7 = x10 - this.b;
        float f10 = y3 - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (f7 <= ((m0) arrayList.get(i10)).w || f7 >= ((m0) arrayList.get(i10)).w + ((m0) arrayList.get(i10)).z || f10 <= ((m0) arrayList.get(i10)).x || f10 >= ((m0) arrayList.get(i10)).x + ((m0) arrayList.get(i10)).A) {
                    i10++;
                } else {
                    this.N = motionEvent.getX();
                    this.O = y3;
                    this.P = (m0) arrayList.get(i10);
                    rh.o oVar = this.R;
                    if (oVar != null) {
                        org.telegram.messenger.i0.r(oVar);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    rh.o oVar2 = new rh.o(25, this, this.P);
                    this.R = oVar2;
                    org.telegram.messenger.i0.h3(oVar2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f11 = this.q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f11) || Math.abs(y3 - this.O) > f11) {
                this.Q = false;
                m0 m0Var = this.P;
                if (m0Var != null) {
                    m0Var.X.c(false);
                }
                this.P = null;
                rh.o oVar3 = this.R;
                if (oVar3 != null) {
                    org.telegram.messenger.i0.r(oVar3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rh.o oVar4 = this.R;
            if (oVar4 != null) {
                org.telegram.messenger.i0.r(oVar4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.a;
                float x11 = motionEvent.getX();
                if (c3.i0.t(zVar)) {
                    ((r4) zVar).e(reactionCount, false, x11, y3);
                }
            }
            this.Q = false;
            m0 m0Var2 = this.P;
            if (m0Var2 != null) {
                m0Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        boolean z10 = this.p;
        ArrayList arrayList = this.t;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f13 = this.b;
        float f14 = this.c;
        if (this.p) {
            f13 = this.f;
            f14 = this.g;
        } else if (this.i) {
            float f15 = 1.0f - f7;
            f13 = (f13 * f7) + (this.d * f15);
            f14 = (f14 * f7) + (this.e * f15);
        }
        float f16 = f13;
        float f17 = f14;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i11);
            if (this.z == null && num == null && this.A < 0.5f) {
                m0Var.c();
            }
            if (!Integer.valueOf(m0Var.q.hashCode()).equals(this.z) && (num == null || m0Var.q.hashCode() == num.intValue())) {
                canvas2.save();
                float f18 = m0Var.w;
                float f19 = m0Var.x;
                if (f7 != 1.0f && m0Var.b == 3) {
                    float f20 = 1.0f - f7;
                    f18 = (f18 * f7) + (m0Var.c * f20);
                    f19 = (f19 * f7) + (m0Var.d * f20);
                }
                if (f7 == 1.0f || m0Var.b != 1) {
                    f10 = 1.0f;
                } else {
                    float f21 = (f7 * 0.5f) + 0.5f;
                    canvas2.scale(f21, f21, (m0Var.z / 2.0f) + f16 + f18, (m0Var.A / 2.0f) + f17 + f19);
                    f10 = f7;
                }
                float f22 = f18 + f16;
                float f23 = f19 + f17;
                if (m0Var.b == 3) {
                    f11 = f10;
                    f12 = f7;
                } else {
                    f11 = f10;
                    f12 = 1.0f;
                }
                m0Var.d(canvas2, f22, f23, f12, f11, num != null, this.B, this.A);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            m0 m0Var2 = (m0) arrayList.get(i10);
            float f24 = 1.0f - f7;
            float f25 = (f24 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f25, f25, (m0Var2.z / 2.0f) + m0Var2.w + f16, (m0Var2.A / 2.0f) + m0Var2.x + f17);
            ((m0) arrayList.get(i10)).d(canvas2, m0Var2.w + f16, m0Var2.x + f17, 1.0f, f24, false, this.B, this.A);
            canvas.restore();
            i10++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f7) {
        float f10;
        boolean z10 = this.p;
        ArrayList arrayList = this.t;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.b;
        float f12 = this.c;
        float f13 = 1.0f;
        if (this.p) {
            f11 = this.f;
            f12 = this.g;
        } else if (this.i) {
            float f14 = 1.0f - f7;
            f11 = (f11 * f7) + (this.d * f14);
            f12 = (f12 * f7) + (this.e * f14);
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i10);
            if (m0Var.l) {
                canvas.save();
                float f15 = m0Var.w;
                float f16 = m0Var.x;
                if (f7 != f13) {
                    f10 = f13;
                    if (m0Var.b == 3) {
                        float f17 = f10 - f7;
                        f15 = (f15 * f7) + (m0Var.c * f17);
                        f16 = (f16 * f7) + (m0Var.d * f17);
                    }
                } else {
                    f10 = f13;
                }
                if (f7 != f13 && m0Var.b == 1) {
                    float f18 = (f7 * 0.5f) + 0.5f;
                    canvas.scale(f18, f18, (m0Var.z / 2.0f) + f11 + f15, (m0Var.A / 2.0f) + f12 + f16);
                }
                z11 = z11 || m0Var.f(canvas, f15 + f11, f16 + f12);
                canvas.restore();
            } else {
                f10 = f13;
            }
            i10++;
            f13 = f10;
        }
        float f19 = f13;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            m0 m0Var2 = (m0) arrayList.get(i11);
            if (m0Var2.l) {
                float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f20, f20, (m0Var2.z / 2.0f) + m0Var2.w + f11, (m0Var2.A / 2.0f) + m0Var2.x + f12);
                boolean z12 = z11 || ((m0) arrayList.get(i11)).f(canvas, ((float) m0Var2.w) + f11, ((float) m0Var2.x) + f12);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(km kmVar, Canvas canvas, int i10, Integer num) {
        if (this.p && this.t.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i11 >= arrayList.size()) {
                return;
            }
            m0 m0Var = (m0) arrayList.get(i11);
            if ((num == null || m0Var.q.hashCode() == num.intValue()) && num != null) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(m0Var.s);
                float L = org.telegram.messenger.i0.L(140.0f);
                float L2 = org.telegram.messenger.i0.L(14.0f);
                float i12 = Utilities.i(rectF.left - org.telegram.messenger.i0.L(12.0f), ((this.w instanceof q1 ? ((q1) r8).getParentWidth() : org.telegram.messenger.i0.q.x) - L) - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                float f7 = rectF.top - L2;
                float f10 = i10;
                float f11 = f7 + f10;
                RectF rectF2 = this.L;
                rectF2.set(i12, (f7 - L) + f10, L + i12, f11);
                float interpolation = gr.h.getInterpolation(this.A);
                org.telegram.messenger.i0.Z1(rectF, rectF2, interpolation, rectF2);
                int i13 = m0Var.U;
                o0 o0Var = m0Var.r;
                View view = m0Var.V;
                if (m0Var.e0 == null && m0Var.f0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (m0Var.q != null && !o0Var.a) {
                        if (o0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i13).r.get(o0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                c00 f12 = v5.f(tL_availableReaction.static_icon, t6.a7, 1.0f, null);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                m0Var.e0 = imageReceiver;
                                imageReceiver.E0(7);
                                m0Var.e0.P();
                                m0Var.e0.J0(org.telegram.messenger.i0.L(14.0f));
                                ImageReceiver imageReceiver2 = m0Var.e0;
                                imageReceiver2.u0 = true;
                                imageReceiver2.t0 = true;
                                imageReceiver2.W(1);
                                ImageReceiver imageReceiver3 = m0Var.e0;
                                imageReceiver3.w0 = true;
                                imageReceiver3.q0(ic.b(tL_availableReaction.activate_animation), "140_140", f12, null, tL_availableReaction, 1);
                            }
                        } else if (o0Var.g != 0) {
                            f5 f5Var = new f5(24, i13, o0Var.g);
                            m0Var.f0 = f5Var;
                            f5Var.a(view);
                        }
                    }
                }
                this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver4 = m0Var.e0;
                    if (imageReceiver4 != null) {
                        imageReceiver4.A0(rectF2);
                        m0Var.e0.setAlpha(interpolation);
                        m0Var.e0.h(canvas, null);
                    } else {
                        f5 f5Var2 = m0Var.f0;
                        if (f5Var2 != null) {
                            f5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            m0Var.f0.setAlpha((int) (interpolation * 255.0f));
                            m0Var.f0.draw(canvas);
                        }
                    }
                    kmVar.invalidate();
                }
            }
            i11++;
        }
    }

    public final float i(float f7) {
        if (!this.j) {
            return this.n;
        }
        return (this.n * f7) + ((1.0f - f7) * this.G);
    }

    public final m0 k(String str) {
        return (m0) this.u.get(str);
    }

    public final m0 l(o0 o0Var) {
        String l4;
        if (o0Var.a) {
            l4 = "stars";
        } else {
            String str = o0Var.f;
            l4 = str != null ? str : Long.toString(o0Var.g);
        }
        return k(l4);
    }

    public final boolean m() {
        if (this.I) {
            return !(this.p && this.t.isEmpty()) && sc.e(8200) && sc.e(131072);
        }
        return false;
    }

    public final void o(int i10, int i11) {
        ArrayList arrayList;
        this.m = 0;
        this.o = 0;
        this.k = 0;
        this.n = 0;
        if (this.p) {
            return;
        }
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.s;
            if (i12 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i12);
            m0Var.getClass();
            e6 e6Var = m0Var.F;
            kq kqVar = m0Var.E;
            if (m0Var.R) {
                m0Var.z = org.telegram.messenger.i0.L(42.0f);
                m0Var.A = org.telegram.messenger.i0.L(26.0f);
                if (m0Var.t) {
                    m0Var.z = (int) (e6Var.d + org.telegram.messenger.i0.L(8.0f) + m0Var.z);
                } else if (kqVar != null && m0Var.v > 1) {
                    m0Var.z = m5.C(8.0f, (int) Math.ceil(kqVar.m), m0Var.z);
                }
            } else {
                m0Var.z = org.telegram.messenger.i0.L(m0Var.C != null ? 6.0f : 4.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(8.0f);
                if (m0Var.S != null && m0Var.T.size() > 0) {
                    m0Var.T.size();
                    m0Var.z = (int) ((org.telegram.messenger.i0.L(20.0f) * (m0Var.T.size() > 1 ? m0Var.T.size() - 1 : 0) * 0.8f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(2.0f) + org.telegram.messenger.i0.L(1.0f) + m0Var.z);
                    m0Var.S.o = org.telegram.messenger.i0.L(26.0f);
                } else if (m0Var.t) {
                    m0Var.z = (int) (e6Var.d + org.telegram.messenger.i0.L(8.0f) + m0Var.z);
                } else if (((int) Math.ceil(kqVar.m)) > 0) {
                    m0Var.z = m5.C(8.0f, (int) Math.ceil(kqVar.m), m0Var.z);
                } else {
                    m0Var.z -= org.telegram.messenger.i0.L(1.0f);
                }
                m0Var.A = org.telegram.messenger.i0.L(26.0f);
            }
            if (m0Var.z + i13 > i10) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = m5.C(4.0f, m0Var.A, i15);
                i16++;
                i13 = 0;
            }
            m0Var.w = i13;
            m0Var.x = i15;
            m0Var.y = i16;
            i13 = m5.C(4.0f, m0Var.z, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i17 = ((m0) arrayList.get(0)).x;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((m0) arrayList.get(i19)).x != i17) {
                    int i20 = i19 - 1;
                    int i21 = i10 - (((m0) arrayList.get(i20)).w + ((m0) arrayList.get(i20)).z);
                    while (i18 < i19) {
                        ((m0) arrayList.get(i18)).w += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i10 - (((m0) arrayList.get(size)).w + ((m0) arrayList.get(size)).z);
            while (i18 <= size) {
                ((m0) arrayList.get(i18)).w += i22;
                i18++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                m0 m0Var2 = (m0) arrayList.get(i23);
                int i24 = m0Var2.y;
                m0Var2.w = (int) c3.i0.B(i10, (i24 < 0 || i24 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(m0Var2.y)).intValue(), 2.0f, m0Var2.w);
            }
        }
        this.r = i13;
        if (i11 == 5 || i11 == 1) {
            this.o = i10;
        } else {
            this.o = i14;
        }
        this.m = i15 + (arrayList.size() == 0 ? 0 : org.telegram.messenger.i0.L(26.0f));
        this.a = 0.0f;
    }

    public final void p() {
        int i10 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).R();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.u;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                this.h = !this.p;
                this.f = this.b;
                this.g = this.c;
                this.C = this.o;
                this.F = this.n;
                return;
            }
            hashMap.put(((m0) arrayList.get(i10)).n, (m0) arrayList.get(i10));
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(jj jjVar, boolean z10, p6 p6Var) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        ?? r72;
        boolean z11;
        int i11;
        TLRPC.ReactionCount reactionCount;
        m0 m0Var;
        boolean z12;
        int i12;
        boolean z13 = z10;
        this.y = p6Var;
        this.J = z13;
        this.x = jjVar;
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        this.H = false;
        this.I = false;
        arrayList.clear();
        if (jjVar != null) {
            long B0 = jj.B0(jjVar.k);
            l0 l0Var = X;
            l0Var.a = B0;
            TLRPC.TL_messageReactions tL_messageReactions2 = jjVar.k.reactions;
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null) {
                int i13 = 0;
                for (int i14 = 0; i14 < jjVar.k.reactions.results.size(); i14++) {
                    i13 += jjVar.k.reactions.results.get(i14).count;
                }
                int i15 = this.l;
                TLRPC.ChatFull M0 = vp.r1(i15).M0(-jj.B0(jjVar.k));
                if (!jjVar.k.reactions.results.isEmpty() && M0 != null && M0.paid_reactions_available) {
                    boolean z14 = false;
                    for (int i16 = 0; i16 < jjVar.k.reactions.results.size(); i16++) {
                        TLRPC.Reaction reaction = jjVar.k.reactions.results.get(i16).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z14 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z14) {
                        z11 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z11) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i11 = -arrayList3.size();
                        while (i11 < jjVar.k.reactions.results.size()) {
                            if (i11 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i11);
                                reactionCount.chosen = r52;
                                reactionCount.count = r52 == true ? 1 : 0;
                            } else {
                                reactionCount = jjVar.k.reactions.results.get(i11);
                            }
                            int i17 = r52 == true ? 1 : 0;
                            while (true) {
                                if (i17 >= arrayList2.size()) {
                                    m0Var = null;
                                    break;
                                }
                                m0Var = (m0) arrayList2.get(i17);
                                if (m0Var.q.equals(reactionCount.reaction)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            n0 n0Var = new n0(this, m0Var, reactionCount, z13);
                            n0Var.Q = jjVar.z2();
                            arrayList.add(n0Var);
                            this.I = (this.I || n0Var.l) ? true : r52 == true ? 1 : 0;
                            if (!z13) {
                                TLRPC.Message message = jjVar.k;
                                if (message.reactions.recent_reactions != null) {
                                    if (jj.B0(message) > 0 && !h20.y(jj.B0(jjVar.k))) {
                                        ArrayList arrayList4 = new ArrayList();
                                        TLRPC.User f7 = d20.i(i15).f();
                                        TLRPC.User Z1 = vp.r1(i15).Z1(Long.valueOf(jj.B0(jjVar.k)));
                                        if (reactionCount.count == 2) {
                                            if (f7 != null) {
                                                arrayList4.add(f7);
                                            }
                                            if (Z1 != null) {
                                                arrayList4.add(Z1);
                                            }
                                        } else if (reactionCount.chosen) {
                                            if (f7 != null) {
                                                arrayList4.add(f7);
                                            }
                                        } else if (Z1 != null) {
                                            arrayList4.add(Z1);
                                        }
                                        n0Var.o(arrayList4);
                                        if (!arrayList4.isEmpty()) {
                                            z12 = false;
                                            n0Var.v = 0;
                                            n0Var.E.c(0, false);
                                            i12 = i15;
                                            if (this.D) {
                                            }
                                            i11++;
                                            r52 = z12;
                                            i15 = i12;
                                            z13 = z10;
                                        }
                                    } else if (reactionCount.count <= 3 && i13 <= 3) {
                                        int i18 = 0;
                                        ArrayList arrayList5 = null;
                                        while (i18 < jjVar.k.reactions.recent_reactions.size()) {
                                            TLRPC.MessagePeerReaction messagePeerReaction = jjVar.k.reactions.recent_reactions.get(i18);
                                            o0 d = o0.d(messagePeerReaction.reaction);
                                            o0 d10 = o0.d(reactionCount.reaction);
                                            int i19 = i18;
                                            int i20 = i15;
                                            TLObject d22 = vp.r1(i15).d2(jj.C1(messagePeerReaction.peer_id));
                                            if (d.equals(d10) && d22 != null) {
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(d22);
                                            }
                                            i18 = i19 + 1;
                                            i15 = i20;
                                        }
                                        i12 = i15;
                                        n0Var.o(arrayList5);
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            z12 = false;
                                            n0Var.v = 0;
                                            n0Var.E.c(0, false);
                                            if (this.D) {
                                                n0Var.a();
                                            }
                                            i11++;
                                            r52 = z12;
                                            i15 = i12;
                                            z13 = z10;
                                        }
                                        z12 = false;
                                        if (this.D) {
                                        }
                                        i11++;
                                        r52 = z12;
                                        i15 = i12;
                                        z13 = z10;
                                    }
                                    i12 = i15;
                                    z12 = false;
                                    if (this.D) {
                                    }
                                    i11++;
                                    r52 = z12;
                                    i15 = i12;
                                    z13 = z10;
                                }
                            }
                            z12 = r52 == true ? 1 : 0;
                            i12 = i15;
                            if (this.D) {
                            }
                            i11++;
                            r52 = z12;
                            i15 = i12;
                            z13 = z10;
                        }
                    }
                }
                z11 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z11) {
                }
                i11 = -arrayList32.size();
                while (i11 < jjVar.k.reactions.results.size()) {
                }
            }
            i10 = r52;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, l0Var);
                for (int i21 = i10; i21 < arrayList.size(); i21++) {
                    TLRPC.ReactionCount reactionCount2 = ((m0) arrayList.get(i21)).a;
                    int i22 = Y;
                    Y = i22 + 1;
                    reactionCount2.lastDrawnPosition = i22;
                }
            }
            TLRPC.Message message2 = jjVar.k;
            if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                for (int i23 = i10; i23 < tL_messageReactions.recent_reactions.size(); i23++) {
                    if (tL_messageReactions.recent_reactions.get(i23).unread) {
                        r72 = 1;
                        break;
                    }
                }
            }
            r72 = i10;
            this.H = r72;
        } else {
            i10 = 0;
        }
        for (int i24 = i10; i24 < arrayList2.size(); i24++) {
            ((m0) arrayList2.get(i24)).b();
        }
        this.p = arrayList.isEmpty();
    }
}
