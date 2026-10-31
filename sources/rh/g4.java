package rh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g4 {
    public float A;
    public float B;
    public qz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final s8 G;
    public final dc H;
    public final dc I;
    public final dc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public jj R;
    public boolean S;
    public final fe.f T;
    public ph.e0 U;
    public ph.e0 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.d5 e;
    public int g;
    public RadialGradient h;
    public final ph.f1 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public qz0 r;
    public float s;
    public qz0 t;
    public float u;
    public float v;
    public float x;
    public final ph.l0 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public g4(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        ph.l0 l0Var = new ph.l0();
        this.y = l0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new s8(1, 25);
        this.K = new RectF();
        this.T = new fe.f(0, new d0(this, 3), gr.h, 320L);
        this.a = i10;
        this.b = view;
        this.c = p6Var;
        this.j = new ph.f1(view);
        this.H = new dc(view);
        this.I = new dc(view);
        this.J = new dc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(28.0f), view);
        l0Var.r = view;
        l0Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.e.a();
            this.y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        ph.f1 f1Var = this.j;
        if (z10 && f1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.a7.b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, this.c);
                    Paint paint = (Paint) f1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        fe.f fVar = this.T;
        float f7 = fVar.f;
        float f10 = f7 / 2.0f;
        float f11 = this.P;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f7, f11);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f10, org.telegram.messenger.i0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        org.telegram.ui.Components.d5 d5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            d5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        j0.a(canvas, 1, d5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = org.telegram.messenger.i0.L(10.0f);
        float L2 = org.telegram.messenger.i0.L(110.0f);
        float L3 = org.telegram.messenger.i0.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f10 - (org.telegram.messenger.i0.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = r12;
        this.r.p = fVar.f - org.telegram.messenger.i0.L(12.0f);
        qz0 qz0Var = this.r;
        qz0Var.c(f10 - (qz0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = fVar.f - org.telegram.messenger.i0.L(12.0f);
        qz0 qz0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        qz0Var2.c(f10 - (qz0Var2.c / 2.0f), this.s, 1.0f, i13, canvas2);
        if (this.z) {
            ph.l0 l0Var = this.y;
            int i14 = l0Var.t;
            int i15 = l0Var.u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.x;
            int i18 = i14 + i16;
            l0Var.setBounds(i16, i17, i18, i17 + i15);
            float f12 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f12, i18, i15 + f12);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            l0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float L4 = this.u + org.telegram.messenger.i0.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                f4 f4Var = (f4) arrayList.get(i19);
                qz0 qz0Var3 = f4Var.b;
                float f14 = f10 - (L4 / 2.0f);
                qz0Var3.c((f14 + this.u) - qz0Var3.c, f4Var.a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                f4Var.c.c(f14 + this.u + org.telegram.messenger.i0.L(r19), f4Var.a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f13 = f13;
            }
        }
        int i21 = i13;
        if (!this.p) {
            float L5 = f10 - ((this.C.c + org.telegram.messenger.i0.L(30.0f)) / 2.0f);
            float f15 = this.A;
            float a11 = org.telegram.messenger.m5.a(this.C.c, org.telegram.messenger.i0.L(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(L5, f15, a11, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.t6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a12 = this.H.a(0.075f);
            canvas2.scale(a12, a12, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            f1Var.setBounds(((int) rectF.right) - org.telegram.messenger.i0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.i0.L(46.67f) + ((int) rectF.top));
            f1Var.y = i21;
            f1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        s8 s8Var = this.G;
        s8Var.g(rectF2);
        s8Var.d();
        s8Var.a(canvas, org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.i0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).U();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        int action;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f7, motionEvent.getY() - f10)) {
                z10 = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
                action = motionEvent.getAction();
                dc dcVar = this.J;
                dc dcVar2 = this.H;
                dc dcVar3 = this.I;
                if (action != 0) {
                    dcVar3.c((!contains2 || contains || z10) ? false : true);
                    dcVar2.c(contains);
                    dcVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (dcVar2.i && !contains) {
                        dcVar2.c(false);
                    } else if (dcVar.i && !z10) {
                        dcVar.c(false);
                    } else if (dcVar3.i && !contains2) {
                        dcVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && dcVar.i) {
                        dcVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z11 = dcVar2.i) || dcVar3.i)) {
                        ph.e0 e0Var = this.V;
                        if (e0Var != null) {
                            if (z11) {
                                e0Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T != null) {
                                org.telegram.messenger.m5.n(null, 2131743905, cc.a0(T), R.raw.fire_on, 36);
                            }
                        } else {
                            e4 e4Var = new e4(this.b.getContext(), this.a, jj.B0(this.R.k), this.c, null);
                            e4Var.i2(this.R, null);
                            e4Var.show();
                        }
                        dcVar2.c(false);
                        dcVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (dcVar2.i || dcVar3.i || dcVar.i)) {
                        dcVar2.c(false);
                        dcVar3.c(false);
                        dcVar.c(false);
                        return true;
                    }
                }
                return !dcVar2.i || dcVar3.i || dcVar.i;
            }
        }
        z10 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        action = motionEvent.getAction();
        dc dcVar4 = this.J;
        dc dcVar22 = this.H;
        dc dcVar32 = this.I;
        if (action != 0) {
        }
        if (dcVar22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(jj jjVar, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z11;
        org.telegram.ui.Components.d5 d5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = jjVar;
        if (jjVar != null && (message = jjVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z11 = this.S;
                d5Var = this.e;
                imageReceiver = this.d;
                if (z11 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.P();
                    d5Var.a();
                    this.y.d.P();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = jjVar == null && jjVar.h2;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    d5Var.i(stargiftattributepattern.document, z10);
                } else {
                    d5Var.g(null, z10);
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.m;
                if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
                    if (this.p) {
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = true;
                        imageReceiver.W(1);
                    } else {
                        imageReceiver.X(0);
                        imageReceiver.e();
                        imageReceiver.W(0);
                    }
                    h8.b1(imageReceiver, this.m.document, zs.v1);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.L = z12;
                ph.f1 f1Var = this.j;
                if (z12) {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, this.c);
                    Paint paint = (Paint) f1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                    this.M = org.telegram.ui.ActionBar.a7.b;
                    f1Var.f(11, cd.L0(2131749902, null), true);
                } else {
                    f1Var.e(this.k, true, false);
                    f1Var.f(11, cd.L0(2131749903, null), true);
                }
                if (this.p) {
                    this.O = org.telegram.messenger.i0.L(200.0f);
                } else {
                    this.O = z20.C(64.0f, (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m, (int) (org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() * 0.6f : (org.telegram.messenger.i0.q.x * 0.62f) - org.telegram.messenger.i0.L(34.0f)));
                    if (!org.telegram.messenger.i0.Q1()) {
                        this.O = (int) (this.O * 1.2f);
                    }
                    this.O -= org.telegram.messenger.i0.L(8.0f);
                }
                g(jjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                fe.f fVar = this.T;
                if (!z10) {
                    fVar.c(this.O);
                    return;
                }
                int round = Math.round(fVar.h ? fVar.g : fVar.f);
                int i10 = this.O;
                if (round != i10) {
                    fVar.a(i10);
                    return;
                }
                return;
            }
        }
        tL_messageActionStarGiftUnique = null;
        if (tL_messageActionStarGiftUnique != null) {
        }
        tL_messageActionStarGiftUnique = null;
        z11 = this.S;
        d5Var = this.e;
        imageReceiver = this.d;
        if (z11) {
            imageReceiver.P();
            d5Var.a();
            this.y.d.P();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = jjVar == null && jjVar.h2;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(jj jjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f7;
        int i10;
        int L;
        float f10 = this.O;
        boolean P3 = jjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.a;
        long e = z10 == P3 ? d20.i(i11).e() : jj.B0(jjVar.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e = org.telegram.messenger.o5.o(peer);
        }
        String t10 = org.telegram.messenger.o5.t(e);
        float L2 = org.telegram.messenger.i0.L(10.0f) + 0.0f + org.telegram.messenger.i0.L(110.0f) + org.telegram.messenger.i0.L(9.33f);
        if (this.p) {
            this.r = new qz0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.i0.o());
        } else if (tL_messageActionStarGiftUnique.peer != null || h20.A(jj.B0(jjVar.k))) {
            this.r = new qz0(cd.L0(2131749900, null), 14.0f, org.telegram.messenger.i0.o());
        } else if (jj.B0(jjVar.k) != d20.i(i11).e()) {
            this.r = new qz0(cd.a0(null, null, 2131749901, t10), 14.0f, org.telegram.messenger.i0.o());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new qz0(cd.L0(2131750470, null), 14.0f, org.telegram.messenger.i0.o());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new qz0(cd.L0(2131750457, null), 14.0f, org.telegram.messenger.i0.o());
        } else {
            this.r = new qz0(cd.L0(2131750435, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.q = (this.r.i() / 2.0f) + L2;
        float i12 = this.r.i() + L2 + org.telegram.messenger.i0.L(3.0f);
        if (this.p) {
            f7 = 2.0f;
            this.t = new qz0(cd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.i0.o());
            i10 = i11;
        } else {
            f7 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i10 = i11;
            this.t = new qz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.i() / f7) + i12;
        float i13 = this.t.i() + i12 + org.telegram.messenger.i0.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ph.l0 l0Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l0Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            jj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject d22 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? vp.r1(i10).d2(org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.from_id)) : vp.r1(i10).d2(jjVar.Z0());
            this.z = true;
            l0Var.c(d22);
            l0Var.m = A5;
            l0Var.s = -1;
            l0Var.b(((int) f10) - org.telegram.messenger.i0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = l0Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((l0Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(jjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = i13 + org.telegram.messenger.i0.L(4.0f);
            this.x = L3;
            i13 = L3 + l0Var.u + org.telegram.messenger.i0.L(3.0f);
        } else {
            this.z = false;
            l0Var.c(null);
            l0Var.m = null;
            l0Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    i13 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var = new f4(i13, cd.L0(2131750396, null), this.m.name);
                arrayList.add(f4Var);
                float f11 = f10 * 0.5f;
                qz0 qz0Var = f4Var.b;
                qz0Var.p = f11;
                this.u = Math.max(this.u, qz0Var.c);
                qz0 qz0Var2 = f4Var.c;
                qz0Var2.p = f11;
                this.v = Math.max(this.v, qz0Var2.c);
                i13 += f4Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    i13 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var2 = new f4(i13, cd.L0(2131750397, null), this.k.name);
                arrayList.add(f4Var2);
                float f12 = f10 * 0.5f;
                qz0 qz0Var3 = f4Var2.b;
                qz0Var3.p = f12;
                this.u = Math.max(this.u, qz0Var3.c);
                qz0 qz0Var4 = f4Var2.c;
                qz0Var4.p = f12;
                this.v = Math.max(this.v, qz0Var4.c);
                i13 = f4Var2.a() + i13;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    i13 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var3 = new f4(i13, cd.L0(2131750389, null), this.l.name);
                arrayList.add(f4Var3);
                float f13 = f10 * 0.5f;
                qz0 qz0Var5 = f4Var3.b;
                qz0Var5.p = f13;
                this.u = Math.max(this.u, qz0Var5.c);
                qz0 qz0Var6 = f4Var3.c;
                qz0Var6.p = f13;
                this.v = Math.max(this.v, qz0Var6.c);
                i13 += f4Var3.a();
            }
        }
        float L4 = i13 + org.telegram.messenger.i0.L(11.66f);
        if (this.p) {
            L = org.telegram.messenger.i0.L(10.0f);
        } else {
            this.A = L4;
            this.C = new qz0(cd.L0(2131749897, null), 14.0f, org.telegram.messenger.i0.o());
            float L5 = org.telegram.messenger.i0.L(30.0f);
            this.B = L5;
            L4 += L5;
            L = org.telegram.messenger.i0.L(11.0f);
        }
        this.P = (int) (L4 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f7 = this.O;
        float L = org.telegram.messenger.i0.L(10.0f) + 0.0f + org.telegram.messenger.i0.L(110.0f) + org.telegram.messenger.i0.L(9.33f);
        qz0 qz0Var = new qz0(cd.a0(null, null, 2131749901, org.telegram.messenger.o5.t(j10)), 14.0f, org.telegram.messenger.i0.o());
        this.r = qz0Var;
        this.q = (qz0Var.i() / 2.0f) + L;
        float i10 = this.r.i() + L + org.telegram.messenger.i0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        qz0 qz0Var2 = new qz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = qz0Var2;
        this.s = (qz0Var2.i() / 2.0f) + i10;
        float i11 = this.t.i() + i10 + org.telegram.messenger.i0.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        ph.l0 l0Var = this.y;
        TextPaint textPaint = l0Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131749757, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            jj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject d22 = j10 != 0 ? vp.r1(this.a).d2(j10) : null;
        this.z = true;
        l0Var.c(d22);
        l0Var.m = spanned;
        l0Var.s = -1;
        l0Var.b(((int) f7) - org.telegram.messenger.i0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = l0Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((l0Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i11 + org.telegram.messenger.i0.L(4.0f);
        this.x = L2;
        float L3 = L2 + l0Var.u + org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(11.66f);
        this.A = L3;
        this.C = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
        float L4 = org.telegram.messenger.i0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.i0.L(11.0f));
    }
}
