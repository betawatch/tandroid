// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x49 {
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
    public u49 P;
    public boolean Q;
    public z09 R;
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
    public final jf0 w;
    public r47 x;
    public vnb y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final t49 X = new t49();
    public static int Y = 1;
    public static final qq7 Z = new qq7((byte) 13);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = yac.t0;

    public x49(jf0 jf0Var) {
        this.w = jf0Var;
        n(this.y);
        this.q = ViewConfiguration.get(a.b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f = rectF.left;
        rectF2.set(f, rectF.top, hl.L(12.0f) + f, rectF.top + hl.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - hl.L(12.0f), rectF.left + hl.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f2 = rectF.height() > ((float) hl.L(26.0f)) ? 1.4f : 0.0f;
        float N = rectF.right - hl.N(9.09f);
        float N2 = N - hl.N(0.056f);
        float N3 = hl.N(1.22f) + N;
        float N4 = hl.N(3.07f) + N;
        float N5 = hl.N(2.406f) + N;
        float N6 = hl.N(8.27f + f2) + N;
        float N7 = hl.N(8.923f + f2) + N;
        float N8 = hl.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - hl.N(1.753f);
        float N10 = hl.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - hl.N(0.663f);
        float f3 = 10.263f + f2;
        float N12 = hl.N(f3) + rectF.top;
        float N13 = rectF.bottom - hl.N(f3);
        float f4 = f2 + 11.333f;
        float N14 = hl.N(f4) + rectF.top;
        float N15 = rectF.bottom - hl.N(f4);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f5 = rectF.top;
        path.cubicTo(N5, N10, N3, f5, N2, f5);
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

    public static void n(vnb vnbVar) {
        S.setColor(aob.v0(aob.Ze, vnbVar));
        int v0 = aob.v0(aob.Ji, vnbVar);
        TextPaint textPaint = V;
        textPaint.setColor(v0);
        uh9.p(textPaint, hl.L(12.0f));
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        ic0 ic0Var;
        int i;
        int i2;
        if (this.x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i3 = 0;
        while (true) {
            arrayList = this.t;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((u49) arrayList.get(i3)).b();
            i3++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i4 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i4 >= arrayList2.size()) {
                break;
            }
            u49 u49Var = (u49) arrayList2.get(i4);
            String str = u49Var.n;
            dy2 dy2Var = u49Var.E;
            u49 u49Var2 = (u49) hashMap.get(str);
            if (u49Var2 != null) {
                hashMap.remove(u49Var.n);
                int i5 = u49Var.w;
                int i6 = u49Var2.w;
                if (i5 == i6 && u49Var.x == u49Var2.x && u49Var.z == u49Var2.z && u49Var.v == u49Var2.v && u49Var.o == u49Var2.o && u49Var.S == null && u49Var2.S == null) {
                    u49Var.b = (byte) 0;
                    i4++;
                } else {
                    u49Var.c = i6;
                    u49Var.d = u49Var2.x;
                    u49Var.e = u49Var2.z;
                    u49Var.h = u49Var2.M;
                    u49Var.f = u49Var2.N;
                    u49Var.g = u49Var2.O;
                    u49Var.b = (byte) 3;
                    int i7 = u49Var.v;
                    int i8 = u49Var2.v;
                    if (i7 != i8 && dy2Var != null) {
                        dy2Var.c(i8, false);
                        dy2Var.c(u49Var.v, true);
                    }
                    if (u49Var.S == null) {
                        if (u49Var2.S != null) {
                            u49Var.o(new ArrayList());
                        }
                    }
                    if (u49Var2.S == null) {
                        u49Var2.o(new ArrayList());
                    }
                    ArrayList arrayList3 = u49Var2.T;
                    ArrayList arrayList4 = u49Var.T;
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (0; i2 < arrayList3.size(); i2 + 1) {
                            TLObject tLObject = (TLObject) arrayList3.get(i2);
                            TLObject tLObject2 = (TLObject) arrayList4.get(i2);
                            i2 = (tLObject == null || tLObject2 == null || j(tLObject) != j(tLObject2)) ? 0 : i2 + 1;
                        }
                    }
                    ic0 ic0Var2 = u49Var.S;
                    if (ic0Var2 != null && (ic0Var = u49Var2.S) != null) {
                        ValueAnimator valueAnimator = ic0Var.f;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (ic0Var2.w) {
                                ic0Var2.w = false;
                                ic0Var2.k();
                            }
                        }
                        TLObject[] tLObjectArr = new TLObject[3];
                        int i9 = 0;
                        while (true) {
                            i = this.l;
                            if (i9 >= 3) {
                                break;
                            }
                            tLObjectArr[i9] = ic0Var2.b[i9].h;
                            ic0Var2.j(i9, i, ic0Var.b[i9].h);
                            i9++;
                        }
                        ic0Var2.a(false, true);
                        for (int i10 = 0; i10 < 3; i10++) {
                            ic0Var2.j(i10, i, tLObjectArr[i10]);
                        }
                        ic0Var2.d = true;
                        ic0Var2.a(true, false);
                    }
                }
            } else {
                u49Var.b = (byte) 1;
            }
            z = true;
            i4++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((u49) arrayList.get(i11)).k = ((u49) arrayList.get(i11)).m;
                ((u49) arrayList.get(i11)).a();
            }
            z = true;
        }
        if (this.h) {
            float f = this.f;
            if (f != this.b || this.g != this.c) {
                this.i = true;
                this.d = f;
                this.e = this.g;
                z = true;
            }
        }
        if (this.C != this.o) {
            z = true;
        }
        int i12 = this.F;
        if (i12 == this.n) {
            return z;
        }
        this.j = true;
        this.G = i12;
        return true;
    }

    public final void b(w49 w49Var) {
        int i = 0;
        if (w49Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(w49Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.p0(this.w);
                int i2 = W;
                W = i2 + 1;
                imageReceiver.w1 = Integer.toString(i2);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.l).r.get(w49Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.d0(jn5.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.M(0);
                imageReceiver.I();
                hashMap.put(w49Var, imageReceiver);
                return;
            }
        }
        if (!this.J || w49Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return;
            }
            if (w49Var.f(((u49) arrayList.get(i)).q)) {
                ((u49) arrayList.get(i)).p();
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        r47 r47Var;
        TLRPC.Message message;
        int i = 0;
        if (this.p || (r47Var = this.x) == null || (message = r47Var.k) == null || message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        jf0 jf0Var = this.w;
        float paddingTop = y - jf0Var.getPaddingTop();
        if (jf0Var instanceof dl1) {
            x -= ((dl1) jf0Var).k0 / 2.0f;
        }
        float f = x - this.b;
        float f2 = paddingTop - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (f <= ((u49) arrayList.get(i)).w || f >= ((u49) arrayList.get(i)).w + ((u49) arrayList.get(i)).z || f2 <= ((u49) arrayList.get(i)).x || f2 >= ((u49) arrayList.get(i)).x + ((u49) arrayList.get(i)).A) {
                    i++;
                } else {
                    this.N = motionEvent.getX();
                    this.O = paddingTop;
                    this.P = (u49) arrayList.get(i);
                    z09 z09Var = this.R;
                    if (z09Var != null) {
                        hl.r(z09Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    z09 z09Var2 = new z09(this, this.P, (byte) 6);
                    this.R = z09Var2;
                    hl.d3(z09Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z = this.Q;
            float f3 = this.q;
            if ((z && Math.abs(motionEvent.getX() - this.N) > f3) || Math.abs(paddingTop - this.O) > f3) {
                this.Q = false;
                u49 u49Var = this.P;
                if (u49Var != null) {
                    u49Var.X.c(false);
                }
                this.P = null;
                z09 z09Var3 = this.R;
                if (z09Var3 != null) {
                    hl.r(z09Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z09 z09Var4 = this.R;
            if (z09Var4 != null) {
                hl.r(z09Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                ((pk5) jf0Var).c(this.P.a, false, motionEvent.getX(), paddingTop);
            }
            this.Q = false;
            u49 u49Var2 = this.P;
            if (u49Var2 != null) {
                u49Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f, Integer num) {
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        boolean z = this.p;
        ArrayList arrayList = this.t;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f5 = this.b;
        float f6 = this.c;
        if (this.p) {
            f5 = this.f;
            f6 = this.g;
        } else if (this.i) {
            float f7 = 1.0f - f;
            f5 = (f5 * f) + (this.d * f7);
            f6 = (f6 * f) + (this.e * f7);
        }
        float f8 = f5;
        float f9 = f6;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i2 >= arrayList2.size()) {
                break;
            }
            u49 u49Var = (u49) arrayList2.get(i2);
            if (this.z == null && num == null && this.A < 0.5f) {
                u49Var.c();
            }
            if (!Integer.valueOf(u49Var.q.hashCode()).equals(this.z) && (num == null || u49Var.q.hashCode() == num.intValue())) {
                canvas2.save();
                float f10 = u49Var.w;
                float f11 = u49Var.x;
                if (f != 1.0f && u49Var.b == 3) {
                    float f12 = 1.0f - f;
                    f10 = (f10 * f) + (u49Var.c * f12);
                    f11 = (f11 * f) + (u49Var.d * f12);
                }
                if (f == 1.0f || u49Var.b != 1) {
                    f2 = 1.0f;
                } else {
                    float f13 = (f * 0.5f) + 0.5f;
                    canvas2.scale(f13, f13, (u49Var.z / 2.0f) + f8 + f10, (u49Var.A / 2.0f) + f9 + f11);
                    f2 = f;
                }
                float f14 = f10 + f8;
                float f15 = f11 + f9;
                if (u49Var.b == 3) {
                    f3 = f2;
                    f4 = f;
                } else {
                    f3 = f2;
                    f4 = 1.0f;
                }
                u49Var.d(canvas2, f14, f15, f4, f3, num != null, this.B, this.A);
                canvas2.restore();
            }
            i2++;
        }
        while (i < arrayList.size()) {
            u49 u49Var2 = (u49) arrayList.get(i);
            float f16 = 1.0f - f;
            float f17 = (f16 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f17, f17, (u49Var2.z / 2.0f) + u49Var2.w + f8, (u49Var2.A / 2.0f) + u49Var2.x + f9);
            ((u49) arrayList.get(i)).d(canvas2, u49Var2.w + f8, u49Var2.x + f9, 1.0f, f16, false, this.B, this.A);
            canvas.restore();
            i++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f) {
        float f2;
        boolean z = this.p;
        ArrayList arrayList = this.t;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f3 = this.b;
        float f4 = this.c;
        float f5 = 1.0f;
        if (this.p) {
            f3 = this.f;
            f4 = this.g;
        } else if (this.i) {
            float f6 = 1.0f - f;
            f3 = (f3 * f) + (this.d * f6);
            f4 = (f4 * f) + (this.e * f6);
        }
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            u49 u49Var = (u49) arrayList2.get(i);
            if (u49Var.l) {
                canvas.save();
                float f7 = u49Var.w;
                float f8 = u49Var.x;
                if (f != f5) {
                    f2 = f5;
                    if (u49Var.b == 3) {
                        float f9 = f2 - f;
                        f7 = (f7 * f) + (u49Var.c * f9);
                        f8 = (f8 * f) + (u49Var.d * f9);
                    }
                } else {
                    f2 = f5;
                }
                if (f != f5 && u49Var.b == 1) {
                    float f10 = (f * 0.5f) + 0.5f;
                    canvas.scale(f10, f10, (u49Var.z / 2.0f) + f3 + f7, (u49Var.A / 2.0f) + f4 + f8);
                }
                z2 = z2 || u49Var.f(canvas, f7 + f3, f8 + f4);
                canvas.restore();
            } else {
                f2 = f5;
            }
            i++;
            f5 = f2;
        }
        float f11 = f5;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            u49 u49Var2 = (u49) arrayList.get(i2);
            if (u49Var2.l) {
                float f12 = ((f11 - f) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f12, f12, (u49Var2.z / 2.0f) + u49Var2.w + f3, (u49Var2.A / 2.0f) + u49Var2.x + f4);
                boolean z3 = z2 || ((u49) arrayList.get(i2)).f(canvas, ((float) u49Var2.w) + f3, ((float) u49Var2.x) + f4);
                canvas.restore();
                z2 = z3;
            }
        }
    }

    public final void f(nt1 nt1Var, Canvas canvas, int i, Integer num) {
        if (this.p && this.t.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 >= arrayList.size()) {
                return;
            }
            u49 u49Var = (u49) arrayList.get(i2);
            if (num != null && u49Var.q.hashCode() == num.intValue()) {
                RectF rectF = hl.P;
                rectF.set(u49Var.s);
                float L = hl.L(140.0f);
                float L2 = hl.L(14.0f);
                float i3 = Utilities.i(rectF.left - hl.L(12.0f), ((this.w instanceof wb2 ? ((wb2) r8).getParentWidth() : hl.q.x) - L) - hl.L(24.0f), hl.L(24.0f));
                float f = rectF.top - L2;
                float f2 = i;
                float f3 = f + f2;
                RectF rectF2 = this.L;
                rectF2.set(i3, (f - L) + f2, L + i3, f3);
                float interpolation = k43.h.getInterpolation(this.A);
                hl.X1(rectF, rectF2, interpolation, rectF2);
                int i4 = u49Var.U;
                w49 w49Var = u49Var.r;
                View view = u49Var.V;
                if (u49Var.e0 == null && u49Var.f0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (u49Var.q != null && !w49Var.a) {
                        if (w49Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i4).r.get(w49Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                ggb f4 = lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                u49Var.e0 = imageReceiver;
                                imageReceiver.m0(7);
                                u49Var.e0.I();
                                u49Var.e0.q0(hl.L(14.0f));
                                ImageReceiver imageReceiver2 = u49Var.e0;
                                imageReceiver2.v0 = true;
                                imageReceiver2.u0 = true;
                                imageReceiver2.M(1);
                                ImageReceiver imageReceiver3 = u49Var.e0;
                                imageReceiver3.x0 = true;
                                imageReceiver3.d0(jn5.b(tL_availableReaction.activate_animation), "140_140", f4, null, tL_availableReaction, 1);
                            }
                        } else if (w49Var.g != 0) {
                            wl wlVar = new wl(24, i4, w49Var.g);
                            u49Var.f0 = wlVar;
                            wlVar.b(view);
                        }
                    }
                }
                this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver4 = u49Var.e0;
                    if (imageReceiver4 != null) {
                        imageReceiver4.k0(rectF2);
                        u49Var.e0.setAlpha(interpolation);
                        u49Var.e0.h(canvas, null);
                    } else {
                        wl wlVar2 = u49Var.f0;
                        if (wlVar2 != null) {
                            wlVar2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            u49Var.f0.setAlpha((int) (interpolation * 255.0f));
                            u49Var.f0.draw(canvas);
                        }
                    }
                    nt1Var.invalidate();
                }
            }
            i2++;
        }
    }

    public final float i(float f) {
        if (!this.j) {
            return this.n;
        }
        return (this.n * f) + ((1.0f - f) * this.G);
    }

    public final u49 k(w49 w49Var) {
        String l;
        if (w49Var.a) {
            l = "stars";
        } else {
            String str = w49Var.f;
            l = str != null ? str : Long.toString(w49Var.g);
        }
        return l(l);
    }

    public final u49 l(String str) {
        return (u49) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            return !(this.p && this.t.isEmpty()) && i86.e(8200) && i86.e(131072);
        }
        return false;
    }

    public final void o(int i, int i2) {
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
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.s;
            if (i3 >= arrayList.size()) {
                break;
            }
            u49 u49Var = (u49) arrayList.get(i3);
            u49Var.getClass();
            hn hnVar = u49Var.F;
            dy2 dy2Var = u49Var.E;
            if (u49Var.R) {
                u49Var.z = hl.L(42.0f);
                u49Var.A = hl.L(26.0f);
                if (u49Var.t) {
                    u49Var.z = (int) (hnVar.d + hl.L(8.0f) + u49Var.z);
                } else if (dy2Var != null && u49Var.v > 1) {
                    u49Var.z = uh9.w(8.0f, (int) Math.ceil(dy2Var.m), u49Var.z);
                }
            } else {
                u49Var.z = hl.L(u49Var.C != null ? 6.0f : 4.0f) + hl.L(20.0f) + hl.L(8.0f);
                if (u49Var.S != null && u49Var.T.size() > 0) {
                    u49Var.T.size();
                    u49Var.z = (int) ((hl.L(20.0f) * (u49Var.T.size() > 1 ? u49Var.T.size() - 1 : 0) * 0.8f) + hl.L(20.0f) + hl.L(2.0f) + hl.L(1.0f) + u49Var.z);
                    u49Var.S.o = hl.L(26.0f);
                } else if (u49Var.t) {
                    u49Var.z = (int) (hnVar.d + hl.L(8.0f) + u49Var.z);
                } else {
                    int ceil = (int) Math.ceil(dy2Var.m);
                    int i8 = u49Var.z;
                    if (ceil > 0) {
                        u49Var.z = uh9.w(8.0f, (int) Math.ceil(dy2Var.m), i8);
                    } else {
                        u49Var.z = i8 - hl.L(1.0f);
                    }
                }
                u49Var.A = hl.L(26.0f);
            }
            if (u49Var.z + i4 > i) {
                arrayList2.add(Integer.valueOf(i4));
                i6 = uh9.w(4.0f, u49Var.A, i6);
                i7++;
                i4 = 0;
            }
            u49Var.w = i4;
            u49Var.x = i6;
            u49Var.y = i7;
            i4 = uh9.w(4.0f, u49Var.z, i4);
            if (i4 > i5) {
                i5 = i4;
            }
            i3++;
        }
        arrayList2.add(Integer.valueOf(i4));
        if (i2 == 5 && !arrayList.isEmpty()) {
            int i9 = ((u49) arrayList.get(0)).x;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((u49) arrayList.get(i11)).x != i9) {
                    int i12 = i11 - 1;
                    int i13 = i - (((u49) arrayList.get(i12)).w + ((u49) arrayList.get(i12)).z);
                    while (i10 < i11) {
                        ((u49) arrayList.get(i10)).w += i13;
                        i10++;
                    }
                    i10 = i11;
                }
            }
            int size = arrayList.size() - 1;
            int i14 = i - (((u49) arrayList.get(size)).w + ((u49) arrayList.get(size)).z);
            while (i10 <= size) {
                ((u49) arrayList.get(i10)).w += i14;
                i10++;
            }
        } else if (i2 == 1 && !arrayList.isEmpty()) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                u49 u49Var2 = (u49) arrayList.get(i15);
                int i16 = u49Var2.y;
                u49Var2.w = (int) bp1.z(i, (i16 < 0 || i16 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(u49Var2.y)).intValue(), 2.0f, u49Var2.w);
            }
        }
        this.r = i4;
        if (i2 == 5 || i2 == 1) {
            this.o = i;
        } else {
            this.o = i5;
        }
        this.m = i6 + (arrayList.size() == 0 ? 0 : hl.L(26.0f));
        this.a = 0.0f;
    }

    public final void p() {
        int i = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            ((u49) arrayList.get(i)).b();
            i++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).K();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.u;
        hashMap.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                this.h = !this.p;
                this.f = this.b;
                this.g = this.c;
                this.C = this.o;
                this.F = this.n;
                return;
            }
            hashMap.put(((u49) arrayList.get(i)).n, (u49) arrayList.get(i));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(r47 r47Var, boolean z, vnb vnbVar) {
        int i;
        ?? r7;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z2;
        int i2;
        TLRPC.ReactionCount reactionCount;
        u49 u49Var;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4 = z;
        this.y = vnbVar;
        this.J = z4;
        this.x = r47Var;
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        this.H = false;
        this.I = false;
        arrayList.clear();
        if (r47Var != null) {
            long B0 = r47.B0(r47Var.k);
            t49 t49Var = X;
            t49Var.a = B0;
            TLRPC.TL_messageReactions tL_messageReactions2 = r47Var.k.reactions;
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null) {
                int i6 = 0;
                for (int i7 = 0; i7 < r47Var.k.reactions.results.size(); i7++) {
                    i6 += r47Var.k.reactions.results.get(i7).count;
                }
                int i8 = this.l;
                TLRPC.ChatFull N0 = uc7.s1(i8).N0(-r47.B0(r47Var.k));
                if (!r47Var.k.reactions.results.isEmpty() && N0 != null && N0.paid_reactions_available) {
                    boolean z5 = false;
                    for (int i9 = 0; i9 < r47Var.k.reactions.results.size(); i9++) {
                        TLRPC.Reaction reaction = r47Var.k.reactions.results.get(i9).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z5 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z5) {
                        z2 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z2) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i2 = -arrayList3.size();
                        while (i2 < r47Var.k.reactions.results.size()) {
                            if (i2 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i2);
                                reactionCount.chosen = r5;
                                reactionCount.count = r5 == true ? 1 : 0;
                            } else {
                                reactionCount = r47Var.k.reactions.results.get(i2);
                            }
                            int i10 = r5 == true ? 1 : 0;
                            while (true) {
                                if (i10 >= arrayList2.size()) {
                                    u49Var = null;
                                    break;
                                }
                                u49Var = (u49) arrayList2.get(i10);
                                if (u49Var.q.equals(reactionCount.reaction)) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            v49 v49Var = new v49(this, u49Var, reactionCount, z4);
                            v49Var.Q = r47Var.z2();
                            arrayList.add(v49Var);
                            this.I = (this.I || v49Var.l) ? true : r5 == true ? 1 : 0;
                            if (!z4) {
                                TLRPC.Message message = r47Var.k;
                                if (message.reactions.recent_reactions != null) {
                                    long B02 = r47.B0(message);
                                    dy2 dy2Var = v49Var.E;
                                    if (B02 <= 0 || lbc.A(r47.B0(r47Var.k))) {
                                        i3 = i8;
                                        if (reactionCount.count <= 3 && i6 <= 3) {
                                            int i11 = 0;
                                            ArrayList arrayList4 = null;
                                            while (i11 < r47Var.k.reactions.recent_reactions.size()) {
                                                TLRPC.MessagePeerReaction messagePeerReaction = r47Var.k.reactions.recent_reactions.get(i11);
                                                w49 d = w49.d(messagePeerReaction.reaction);
                                                w49 d2 = w49.d(reactionCount.reaction);
                                                int i12 = i11;
                                                int i13 = i6;
                                                int i14 = i2;
                                                TLObject b2 = uc7.s1(i3).b2(r47.B1(messagePeerReaction.peer_id));
                                                if (d.equals(d2) && b2 != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(b2);
                                                }
                                                i11 = i12 + 1;
                                                i6 = i13;
                                                i2 = i14;
                                            }
                                            i4 = i6;
                                            i5 = i2;
                                            v49Var.o(arrayList4);
                                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                z3 = false;
                                                v49Var.v = 0;
                                                dy2Var.c(0, false);
                                                if (!this.D) {
                                                    v49Var.a();
                                                }
                                                i2 = i5 + 1;
                                                r5 = z3;
                                                i8 = i3;
                                                i6 = i4;
                                                z4 = z;
                                            }
                                            z3 = false;
                                            if (!this.D) {
                                            }
                                            i2 = i5 + 1;
                                            r5 = z3;
                                            i8 = i3;
                                            i6 = i4;
                                            z4 = z;
                                        }
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        TLRPC.User f = yac.h(i8).f();
                                        TLRPC.User X1 = uc7.s1(i8).X1(Long.valueOf(r47.B0(r47Var.k)));
                                        i3 = i8;
                                        if (reactionCount.count == 2) {
                                            if (f != null) {
                                                arrayList5.add(f);
                                            }
                                            if (X1 != null) {
                                                arrayList5.add(X1);
                                            }
                                        } else if (reactionCount.chosen) {
                                            if (f != null) {
                                                arrayList5.add(f);
                                            }
                                        } else if (X1 != null) {
                                            arrayList5.add(X1);
                                        }
                                        v49Var.o(arrayList5);
                                        if (!arrayList5.isEmpty()) {
                                            v49Var.v = 0;
                                            dy2Var.c(0, false);
                                        }
                                    }
                                    i4 = i6;
                                    i5 = i2;
                                    z3 = false;
                                    if (!this.D) {
                                    }
                                    i2 = i5 + 1;
                                    r5 = z3;
                                    i8 = i3;
                                    i6 = i4;
                                    z4 = z;
                                }
                            }
                            z3 = r5 == true ? 1 : 0;
                            i3 = i8;
                            i4 = i6;
                            i5 = i2;
                            if (!this.D) {
                            }
                            i2 = i5 + 1;
                            r5 = z3;
                            i8 = i3;
                            i6 = i4;
                            z4 = z;
                        }
                    }
                }
                z2 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z2) {
                }
                i2 = -arrayList32.size();
                while (i2 < r47Var.k.reactions.results.size()) {
                }
            }
            i = r5;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, t49Var);
                for (int i15 = i; i15 < arrayList.size(); i15++) {
                    TLRPC.ReactionCount reactionCount2 = ((u49) arrayList.get(i15)).a;
                    int i16 = Y;
                    Y = i16 + 1;
                    reactionCount2.lastDrawnPosition = i16;
                }
            }
            TLRPC.Message message2 = r47Var.k;
            if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                for (int i17 = i; i17 < tL_messageReactions.recent_reactions.size(); i17++) {
                    if (tL_messageReactions.recent_reactions.get(i17).unread) {
                        r7 = 1;
                        break;
                    }
                }
            }
            r7 = i;
            this.H = r7;
        } else {
            i = 0;
        }
        for (int i18 = i; i18 < arrayList2.size(); i18++) {
            ((u49) arrayList2.get(i18)).b();
        }
        this.p = arrayList.isEmpty();
    }
}
