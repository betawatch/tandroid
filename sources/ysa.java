// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ysa {
    public float A;
    public float B;
    public uib C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final yxa G;
    public final u51 H;
    public final u51 I;
    public final u51 J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public k47 R;
    public boolean S;
    public final h94 T;
    public yv4 U;
    public yv4 V;
    public final int a;
    public final View b;
    public final ylb c;
    public final ImageReceiver d;
    public final tm e;
    public int g;
    public RadialGradient h;
    public final rx4 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public uib r;
    public float s;
    public uib t;
    public float u;
    public float v;
    public float x;
    public final gw4 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public ysa(int i, ylb ylbVar, View view) {
        gw4 gw4Var = new gw4();
        this.y = gw4Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new yxa(1, 25);
        this.K = new RectF();
        this.T = new h94(0, new yf9(this, (byte) 26), d53.h, 320L);
        this.a = i;
        this.b = view;
        this.c = ylbVar;
        this.j = new rx4(view, 1.0f);
        this.H = new u51(view);
        this.I = new u51(view);
        this.J = new u51(view);
        this.d = new ImageReceiver(view);
        this.e = new tm(gm.L(28.0f), view);
        gw4Var.r = view;
        gw4Var.d.p0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.I();
            this.e.a();
            this.y.d.I();
        }
    }

    public final void b(Canvas canvas) {
        boolean z = this.L;
        rx4 rx4Var = this.j;
        if (z && rx4Var != null) {
            int i = this.M;
            int i2 = anb.b;
            if (i != i2) {
                this.M = i2;
                try {
                    rx4Var.f(cmb.v0(cmb.p7, this.c));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        h94 h94Var = this.T;
        float f = h94Var.f;
        float f2 = f / 2.0f;
        float f3 = this.P;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, f3);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f2, f2);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, gm.L(14.0f), gm.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a = this.I.a(0.0125f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, gm.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        tm tmVar = this.e;
        if (stargiftattributebackdrop2 != null) {
            tmVar.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        bpa.a(canvas, 1, tmVar, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = gm.L(10.0f);
        float L2 = gm.L(110.0f);
        float L3 = gm.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(f2 - (gm.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int p1 = cmb.p1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            p1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i3 = p1;
        this.r.p = h94Var.f - gm.L(12.0f);
        uib uibVar = this.r;
        uibVar.c(f2 - (uibVar.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = h94Var.f - gm.L(12.0f);
        uib uibVar2 = this.t;
        Canvas canvas2 = canvas;
        int i4 = i3;
        uibVar2.c(f2 - (uibVar2.c / 2.0f), this.s, 1.0f, i4, canvas2);
        if (this.z) {
            gw4 gw4Var = this.y;
            int i5 = gw4Var.t;
            int i6 = gw4Var.u;
            int i7 = (int) (f2 - (i5 / 2.0f));
            int i8 = (int) this.x;
            int i9 = i5 + i7;
            gw4Var.setBounds(i7, i8, i9, i8 + i6);
            float f4 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i7, f4, i9, i6 + f4);
            float a2 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            gw4Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f5 = 9.0f;
            float L4 = this.u + gm.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                xsa xsaVar = (xsa) arrayList.get(i10);
                uib uibVar3 = xsaVar.b;
                float f6 = f2 - (L4 / 2.0f);
                uibVar3.c((f6 + this.u) - uibVar3.c, xsaVar.a, 1.0f, i4, canvas2);
                canvas2 = canvas;
                xsaVar.c.c(f6 + this.u + gm.L(r19), xsaVar.a, 1.0f, -1, canvas2);
                i4 = i4;
                i10 = i11;
                f5 = f5;
            }
        }
        int i12 = i4;
        if (!this.p) {
            float L5 = f2 - ((this.C.c + gm.L(30.0f)) / 2.0f);
            float f7 = this.A;
            float e2 = td4.e(this.C.c, gm.L(30.0f), 2.0f, f2);
            float f8 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(L5, f7, e2, f8);
            Path path2 = this.E;
            path2.rewind();
            float f9 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
            int p12 = cmb.p1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(p12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            rx4Var.setBounds(((int) rectF.right) - gm.L(46.67f), ((int) rectF.top) - gm.L(1.33f), gm.L(1.33f) + ((int) rectF.right), gm.L(46.67f) + ((int) rectF.top));
            rx4Var.y = i12;
            rx4Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float a2 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        yxa yxaVar = this.G;
        yxaVar.g(rectF2);
        yxaVar.d();
        yxaVar.a(canvas, cmb.p1(0.7f, -1));
        this.C.c(rectF2.left + gm.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof cm1) {
            ((cm1) view).T();
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
    public final boolean e(float f, float f2, MotionEvent motionEvent) {
        boolean z;
        int action;
        boolean z2;
        boolean contains = this.D.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f, motionEvent.getY() - f2)) {
                z = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
                action = motionEvent.getAction();
                u51 u51Var = this.J;
                u51 u51Var2 = this.H;
                u51 u51Var3 = this.I;
                if (action != 0) {
                    u51Var3.c((!contains2 || contains || z) ? false : true);
                    u51Var2.c(contains);
                    u51Var.c(z);
                } else if (motionEvent.getAction() == 2) {
                    if (u51Var2.i && !contains) {
                        u51Var2.c(false);
                    } else if (u51Var.i && !z) {
                        u51Var.c(false);
                    } else if (u51Var3.i && !contains2) {
                        u51Var3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && u51Var.i) {
                        u51Var.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z2 = u51Var2.i) || u51Var3.i)) {
                        yv4 yv4Var = this.V;
                        if (yv4Var != null) {
                            if (z2) {
                                yv4Var.run();
                            }
                        } else if (this.L) {
                            d S = LaunchActivity.S();
                            if (S != null) {
                                ts2.u(null, 2131743567, c41.b0(S), R.raw.fire_on, 36);
                            }
                        } else {
                            wsa wsaVar = new wsa(this.b.getContext(), this.a, k47.B0(this.R.k), this.c, null);
                            wsaVar.l2(this.R, null);
                            wsaVar.show();
                        }
                        u51Var2.c(false);
                        u51Var3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (u51Var2.i || u51Var3.i || u51Var.i)) {
                        u51Var2.c(false);
                        u51Var3.c(false);
                        u51Var.c(false);
                        return true;
                    }
                }
                return !u51Var2.i || u51Var3.i || u51Var.i;
            }
        }
        z = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        action = motionEvent.getAction();
        u51 u51Var4 = this.J;
        u51 u51Var22 = this.H;
        u51 u51Var32 = this.I;
        if (action != 0) {
        }
        if (u51Var22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(k47 k47Var, boolean z) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z2;
        tm tmVar;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = k47Var;
        if (k47Var != null && (message = k47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z2 = this.S;
                tmVar = this.e;
                imageReceiver = this.d;
                if (z2 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.I();
                    tmVar.a();
                    this.y.d.I();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = k47Var == null && k47Var.j2;
                if (tL_messageActionStarGiftUnique == null) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                    this.k = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    this.l = (TL_stars.starGiftAttributePattern) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                    this.m = (TL_stars.starGiftAttributeModel) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                    this.h = null;
                    this.f.setShader(null);
                    TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                    if (stargiftattributepattern != null) {
                        tmVar.i(stargiftattributepattern.document, z);
                    } else {
                        tmVar.g(null, z);
                    }
                    TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.m;
                    if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
                        if (this.p) {
                            imageReceiver.v0 = true;
                            imageReceiver.u0 = true;
                            imageReceiver.M(1);
                        } else {
                            imageReceiver.N(0);
                            imageReceiver.e();
                            imageReceiver.M(0);
                        }
                        nxa.e1(imageReceiver, this.m.document, nm7.u1);
                    }
                    boolean z3 = tL_starGiftUnique.burned;
                    this.L = z3;
                    rx4 rx4Var = this.j;
                    if (z3) {
                        rx4Var.f(cmb.v0(cmb.p7, this.c));
                        this.M = anb.b;
                        rx4Var.g(11, jb6.M0(2131749826, null), true);
                    } else {
                        rx4Var.e(this.k, true, false);
                        rx4Var.g(11, jb6.M0(2131749827, null), true);
                    }
                    if (this.p) {
                        this.O = gm.L(200.0f);
                    } else {
                        this.O = b10.x(64.0f, (gm.q.y - a.getCurrentActionBarHeight()) - gm.m, (int) (gm.O1() ? gm.P0() * 0.6f : (gm.q.x * 0.62f) - gm.L(34.0f)));
                        if (!gm.O1()) {
                            this.O = (int) (this.O * 1.2f);
                        }
                        this.O -= gm.L(8.0f);
                    }
                    g(k47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    h94 h94Var = this.T;
                    if (!z) {
                        h94Var.c(this.O);
                        return;
                    }
                    int round = Math.round(h94Var.h ? h94Var.g : h94Var.f);
                    int i = this.O;
                    if (round != i) {
                        h94Var.a(i);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        tL_messageActionStarGiftUnique = null;
        if (tL_messageActionStarGiftUnique != null) {
        }
        tL_messageActionStarGiftUnique = null;
        z2 = this.S;
        tmVar = this.e;
        imageReceiver = this.d;
        if (z2) {
            imageReceiver.I();
            tmVar.a();
            this.y.d.I();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = k47Var == null && k47Var.j2;
        if (tL_messageActionStarGiftUnique == null) {
        }
    }

    public final void g(k47 k47Var, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        uib uibVar;
        float f;
        uib uibVar2;
        int i;
        int L;
        float f2 = this.O;
        boolean O3 = k47Var.O3();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i2 = this.a;
        long e = z == O3 ? z8c.h(i2).e() : k47.B0(k47Var.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e = pg3.n(peer);
        }
        String s = pg3.s(e);
        float L2 = gm.L(10.0f) + 0.0f + gm.L(110.0f) + gm.L(9.33f);
        if (this.p) {
            uibVar = new uib(tL_starGiftUnique.title, 14.0f, gm.o());
            this.r = uibVar;
        } else if (tL_messageActionStarGiftUnique.peer != null || m9c.C(k47.B0(k47Var.k))) {
            uibVar = new uib(jb6.M0(2131749824, null), 14.0f, gm.o());
            this.r = uibVar;
        } else if (k47.B0(k47Var.k) != z8c.h(i2).e()) {
            uib uibVar3 = new uib(jb6.a0(null, null, 2131749825, s), 14.0f, gm.o());
            this.r = uibVar3;
            uibVar = uibVar3;
        } else if (tL_starGiftUnique.crafted) {
            uibVar = new uib(jb6.M0(2131750394, null), 14.0f, gm.o());
            this.r = uibVar;
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            uibVar = new uib(jb6.M0(2131750381, null), 14.0f, gm.o());
            this.r = uibVar;
        } else {
            uibVar = new uib(jb6.M0(2131750359, null), 14.0f, gm.o());
            this.r = uibVar;
        }
        this.q = (uibVar.h() / 2.0f) + L2;
        float h = this.r.h() + L2 + gm.L(3.0f);
        if (this.p) {
            f = 2.0f;
            uibVar2 = new uib(jb6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, gm.o());
            this.t = uibVar2;
            i = i2;
        } else {
            f = 2.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            i = i2;
            uibVar2 = new uib(kt6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
            this.t = uibVar2;
        }
        this.s = (uibVar2.h() / f) + h;
        float h2 = this.t.h() + h + gm.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        gw4 gw4Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = gw4Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            k47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = k47.A5(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject a2 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? oc7.r1(i).a2(pg3.n(tL_messageActionStarGiftUnique.from_id)) : oc7.r1(i).a2(k47Var.Z0());
            this.z = true;
            gw4Var.c(a2);
            gw4Var.m = A5;
            gw4Var.s = -1;
            gw4Var.b(((int) f2) - gm.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = gw4Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((gw4Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(k47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = h2 + gm.L(4.0f);
            this.x = L3;
            h2 = L3 + gw4Var.u + gm.L(3.0f);
        } else {
            this.z = false;
            gw4Var.c(null);
            gw4Var.m = null;
            gw4Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    h2 += gm.L(6.0f);
                }
                xsa xsaVar = new xsa(h2, jb6.M0(2131750320, null), this.m.name);
                arrayList.add(xsaVar);
                float f3 = f2 * 0.5f;
                uib uibVar4 = xsaVar.b;
                uibVar4.p = f3;
                this.u = Math.max(this.u, uibVar4.c);
                uib uibVar5 = xsaVar.c;
                uibVar5.p = f3;
                this.v = Math.max(this.v, uibVar5.c);
                h2 += xsaVar.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    h2 += gm.L(6.0f);
                }
                xsa xsaVar2 = new xsa(h2, jb6.M0(2131750321, null), this.k.name);
                arrayList.add(xsaVar2);
                float f4 = f2 * 0.5f;
                uib uibVar6 = xsaVar2.b;
                uibVar6.p = f4;
                this.u = Math.max(this.u, uibVar6.c);
                uib uibVar7 = xsaVar2.c;
                uibVar7.p = f4;
                this.v = Math.max(this.v, uibVar7.c);
                h2 = xsaVar2.a() + h2;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    h2 += gm.L(6.0f);
                }
                xsa xsaVar3 = new xsa(h2, jb6.M0(2131750313, null), this.l.name);
                arrayList.add(xsaVar3);
                float f5 = f2 * 0.5f;
                uib uibVar8 = xsaVar3.b;
                uibVar8.p = f5;
                this.u = Math.max(this.u, uibVar8.c);
                uib uibVar9 = xsaVar3.c;
                uibVar9.p = f5;
                this.v = Math.max(this.v, uibVar9.c);
                h2 += xsaVar3.a();
            }
        }
        float L4 = h2 + gm.L(11.66f);
        if (this.p) {
            L = gm.L(10.0f);
        } else {
            this.A = L4;
            this.C = new uib(jb6.M0(2131749821, null), 14.0f, gm.o());
            float L5 = gm.L(30.0f);
            this.B = L5;
            L4 += L5;
            L = gm.L(11.0f);
        }
        this.P = (int) (L4 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f = this.O;
        float L = gm.L(10.0f) + 0.0f + gm.L(110.0f) + gm.L(9.33f);
        uib uibVar = new uib(jb6.a0(null, null, 2131749825, pg3.s(j)), 14.0f, gm.o());
        this.r = uibVar;
        this.q = (uibVar.h() / 2.0f) + L;
        float h = this.r.h() + L + gm.L(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        uib uibVar2 = new uib(kt6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        this.t = uibVar2;
        this.s = (uibVar2.h() / 2.0f) + h;
        float h2 = this.t.h() + h + gm.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        gw4 gw4Var = this.y;
        TextPaint textPaint = gw4Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749680, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            k47.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = k47.A5(gw3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject a2 = j != 0 ? oc7.r1(this.a).a2(j) : null;
        this.z = true;
        gw4Var.c(a2);
        gw4Var.m = spanned;
        gw4Var.s = -1;
        gw4Var.b(((int) f) - gm.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = gw4Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((gw4Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = h2 + gm.L(4.0f);
        this.x = L2;
        float L3 = L2 + gw4Var.u + gm.L(3.0f) + gm.L(11.66f);
        this.A = L3;
        this.C = new uib(str, 14.0f, gm.o());
        float L4 = gm.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + gm.L(11.0f));
    }
}
