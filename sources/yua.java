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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yua {
    public float A;
    public float B;
    public pkb C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final yza G;
    public final v41 H;
    public final v41 I;
    public final v41 J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public r47 R;
    public boolean S;
    public final t84 T;
    public aw4 U;
    public aw4 V;
    public final int a;
    public final View b;
    public final vnb c;
    public final ImageReceiver d;
    public final ul e;
    public int g;
    public RadialGradient h;
    public final vx4 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public pkb r;
    public float s;
    public pkb t;
    public float u;
    public float v;
    public float x;
    public final iw4 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public yua(int i, vnb vnbVar, View view) {
        iw4 iw4Var = new iw4();
        this.y = iw4Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new yza(1, 25);
        this.K = new RectF();
        this.T = new t84(0, new hja(this, (byte) 5), k43.h, 320L);
        this.a = i;
        this.b = view;
        this.c = vnbVar;
        this.j = new vx4(view, 1.0f);
        this.H = new v41(view);
        this.I = new v41(view);
        this.J = new v41(view);
        this.d = new ImageReceiver(view);
        this.e = new ul(hl.L(28.0f), view);
        iw4Var.r = view;
        iw4Var.d.p0(view);
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
        vx4 vx4Var = this.j;
        if (z && vx4Var != null) {
            int i = this.M;
            int i2 = yob.b;
            if (i != i2) {
                this.M = i2;
                try {
                    vx4Var.f(aob.v0(aob.q7, this.c));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        t84 t84Var = this.T;
        float f = t84Var.f;
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
        path.addRoundRect(rectF, hl.L(14.0f), hl.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a = this.I.a(0.0125f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, hl.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        ul ulVar = this.e;
        if (stargiftattributebackdrop2 != null) {
            ulVar.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        xqa.a(canvas, 1, ulVar, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = hl.L(10.0f);
        float L2 = hl.L(110.0f);
        float L3 = hl.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(f2 - (hl.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int p1 = aob.p1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            p1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i3 = p1;
        this.r.p = t84Var.f - hl.L(12.0f);
        pkb pkbVar = this.r;
        pkbVar.c(f2 - (pkbVar.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = t84Var.f - hl.L(12.0f);
        pkb pkbVar2 = this.t;
        Canvas canvas2 = canvas;
        int i4 = i3;
        pkbVar2.c(f2 - (pkbVar2.c / 2.0f), this.s, 1.0f, i4, canvas2);
        if (this.z) {
            iw4 iw4Var = this.y;
            int i5 = iw4Var.t;
            int i6 = iw4Var.u;
            int i7 = (int) (f2 - (i5 / 2.0f));
            int i8 = (int) this.x;
            int i9 = i5 + i7;
            iw4Var.setBounds(i7, i8, i9, i8 + i6);
            float f4 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i7, f4, i9, i6 + f4);
            float a2 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            iw4Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f5 = 9.0f;
            float L4 = this.u + hl.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                xua xuaVar = (xua) arrayList.get(i10);
                pkb pkbVar3 = xuaVar.b;
                float f6 = f2 - (L4 / 2.0f);
                pkbVar3.c((f6 + this.u) - pkbVar3.c, xuaVar.a, 1.0f, i4, canvas2);
                canvas2 = canvas;
                xuaVar.c.c(f6 + this.u + hl.L(r19), xuaVar.a, 1.0f, -1, canvas2);
                i4 = i4;
                i10 = i11;
                f5 = f5;
            }
        }
        int i12 = i4;
        if (!this.p) {
            float L5 = f2 - ((this.C.c + hl.L(30.0f)) / 2.0f);
            float f7 = this.A;
            float e2 = qd4.e(this.C.c, hl.L(30.0f), 2.0f, f2);
            float f8 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(L5, f7, e2, f8);
            Path path2 = this.E;
            path2.rewind();
            float f9 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
            int p12 = aob.p1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(p12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            vx4Var.setBounds(((int) rectF.right) - hl.L(46.67f), ((int) rectF.top) - hl.L(1.33f), hl.L(1.33f) + ((int) rectF.right), hl.L(46.67f) + ((int) rectF.top));
            vx4Var.y = i12;
            vx4Var.draw(canvas2);
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
        yza yzaVar = this.G;
        yzaVar.g(rectF2);
        yzaVar.d();
        yzaVar.a(canvas, aob.p1(0.7f, -1));
        this.C.c(rectF2.left + hl.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof dl1) {
            ((dl1) view).V();
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
                v41 v41Var = this.J;
                v41 v41Var2 = this.H;
                v41 v41Var3 = this.I;
                if (action != 0) {
                    v41Var3.c((!contains2 || contains || z) ? false : true);
                    v41Var2.c(contains);
                    v41Var.c(z);
                } else if (motionEvent.getAction() == 2) {
                    if (v41Var2.i && !contains) {
                        v41Var2.c(false);
                    } else if (v41Var.i && !z) {
                        v41Var.c(false);
                    } else if (v41Var3.i && !contains2) {
                        v41Var3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && v41Var.i) {
                        v41Var.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z2 = v41Var2.i) || v41Var3.i)) {
                        aw4 aw4Var = this.V;
                        if (aw4Var != null) {
                            if (z2) {
                                aw4Var.run();
                            }
                        } else if (this.L) {
                            e S = LaunchActivity.S();
                            if (S != null) {
                                bs2.v(null, 2131743535, d31.b0(S), R.raw.fire_on, 36);
                            }
                        } else {
                            wua wuaVar = new wua(this.b.getContext(), this.a, r47.B0(this.R.k), this.c, null);
                            wuaVar.m2(this.R, null);
                            wuaVar.show();
                        }
                        v41Var2.c(false);
                        v41Var3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (v41Var2.i || v41Var3.i || v41Var.i)) {
                        v41Var2.c(false);
                        v41Var3.c(false);
                        v41Var.c(false);
                        return true;
                    }
                }
                return !v41Var2.i || v41Var3.i || v41Var.i;
            }
        }
        z = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        action = motionEvent.getAction();
        v41 v41Var4 = this.J;
        v41 v41Var22 = this.H;
        v41 v41Var32 = this.I;
        if (action != 0) {
        }
        if (v41Var22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(r47 r47Var, boolean z) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z2;
        ul ulVar;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = r47Var;
        if (r47Var != null && (message = r47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z2 = this.S;
                ulVar = this.e;
                imageReceiver = this.d;
                if (z2 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.I();
                    ulVar.a();
                    this.y.d.I();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = r47Var == null && r47Var.j2;
                if (tL_messageActionStarGiftUnique == null) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                    this.k = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    this.l = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                    this.m = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                    this.h = null;
                    this.f.setShader(null);
                    TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                    if (stargiftattributepattern != null) {
                        ulVar.i(stargiftattributepattern.document, z);
                    } else {
                        ulVar.g(null, z);
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
                        nza.e1(imageReceiver, this.m.document, jn7.u1);
                    }
                    boolean z3 = tL_starGiftUnique.burned;
                    this.L = z3;
                    vx4 vx4Var = this.j;
                    if (z3) {
                        vx4Var.f(aob.v0(aob.q7, this.c));
                        this.M = yob.b;
                        vx4Var.g(11, ob6.M0(2131749839, null), true);
                    } else {
                        vx4Var.e(this.k, true, false);
                        vx4Var.g(11, ob6.M0(2131749840, null), true);
                    }
                    if (this.p) {
                        this.O = hl.L(200.0f);
                    } else {
                        this.O = c00.y(64.0f, (hl.q.y - a.getCurrentActionBarHeight()) - hl.m, (int) (hl.O1() ? hl.P0() * 0.6f : (hl.q.x * 0.62f) - hl.L(34.0f)));
                        if (!hl.O1()) {
                            this.O = (int) (this.O * 1.2f);
                        }
                        this.O -= hl.L(8.0f);
                    }
                    g(r47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    t84 t84Var = this.T;
                    if (!z) {
                        t84Var.c(this.O);
                        return;
                    }
                    int round = Math.round(t84Var.h ? t84Var.g : t84Var.f);
                    int i = this.O;
                    if (round != i) {
                        t84Var.a(i);
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
        ulVar = this.e;
        imageReceiver = this.d;
        if (z2) {
            imageReceiver.I();
            ulVar.a();
            this.y.d.I();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = r47Var == null && r47Var.j2;
        if (tL_messageActionStarGiftUnique == null) {
        }
    }

    public final void g(r47 r47Var, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        pkb pkbVar;
        float f;
        pkb pkbVar2;
        int i;
        int L;
        float f2 = this.O;
        boolean O3 = r47Var.O3();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i2 = this.a;
        long e = z == O3 ? yac.h(i2).e() : r47.B0(r47Var.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e = wf3.n(peer);
        }
        String s = wf3.s(e);
        float L2 = hl.L(10.0f) + 0.0f + hl.L(110.0f) + hl.L(9.33f);
        if (this.p) {
            pkbVar = new pkb(tL_starGiftUnique.title, 14.0f, hl.o());
            this.r = pkbVar;
        } else if (tL_messageActionStarGiftUnique.peer != null || lbc.C(r47.B0(r47Var.k))) {
            pkbVar = new pkb(ob6.M0(2131749837, null), 14.0f, hl.o());
            this.r = pkbVar;
        } else if (r47.B0(r47Var.k) != yac.h(i2).e()) {
            pkb pkbVar3 = new pkb(ob6.a0(null, null, 2131749838, s), 14.0f, hl.o());
            this.r = pkbVar3;
            pkbVar = pkbVar3;
        } else if (tL_starGiftUnique.crafted) {
            pkbVar = new pkb(ob6.M0(2131750422, null), 14.0f, hl.o());
            this.r = pkbVar;
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            pkbVar = new pkb(ob6.M0(2131750409, null), 14.0f, hl.o());
            this.r = pkbVar;
        } else {
            pkbVar = new pkb(ob6.M0(2131750387, null), 14.0f, hl.o());
            this.r = pkbVar;
        }
        this.q = (pkbVar.h() / 2.0f) + L2;
        float h = this.r.h() + L2 + hl.L(3.0f);
        if (this.p) {
            f = 2.0f;
            pkbVar2 = new pkb(ob6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, hl.o());
            this.t = pkbVar2;
            i = i2;
        } else {
            f = 2.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            i = i2;
            pkbVar2 = new pkb(qu6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
            this.t = pkbVar2;
        }
        this.s = (pkbVar2.h() / f) + h;
        float h2 = this.t.h() + h + hl.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        iw4 iw4Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = iw4Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            r47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = r47.A5(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject b2 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? uc7.s1(i).b2(wf3.n(tL_messageActionStarGiftUnique.from_id)) : uc7.s1(i).b2(r47Var.Z0());
            this.z = true;
            iw4Var.c(b2);
            iw4Var.m = A5;
            iw4Var.s = -1;
            iw4Var.b(((int) f2) - hl.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = iw4Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((iw4Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(r47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = h2 + hl.L(4.0f);
            this.x = L3;
            h2 = L3 + iw4Var.u + hl.L(3.0f);
        } else {
            this.z = false;
            iw4Var.c(null);
            iw4Var.m = null;
            iw4Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    h2 += hl.L(6.0f);
                }
                xua xuaVar = new xua(h2, ob6.M0(2131750348, null), this.m.name);
                arrayList.add(xuaVar);
                float f3 = f2 * 0.5f;
                pkb pkbVar4 = xuaVar.b;
                pkbVar4.p = f3;
                this.u = Math.max(this.u, pkbVar4.c);
                pkb pkbVar5 = xuaVar.c;
                pkbVar5.p = f3;
                this.v = Math.max(this.v, pkbVar5.c);
                h2 += xuaVar.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    h2 += hl.L(6.0f);
                }
                xua xuaVar2 = new xua(h2, ob6.M0(2131750349, null), this.k.name);
                arrayList.add(xuaVar2);
                float f4 = f2 * 0.5f;
                pkb pkbVar6 = xuaVar2.b;
                pkbVar6.p = f4;
                this.u = Math.max(this.u, pkbVar6.c);
                pkb pkbVar7 = xuaVar2.c;
                pkbVar7.p = f4;
                this.v = Math.max(this.v, pkbVar7.c);
                h2 = xuaVar2.a() + h2;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    h2 += hl.L(6.0f);
                }
                xua xuaVar3 = new xua(h2, ob6.M0(2131750341, null), this.l.name);
                arrayList.add(xuaVar3);
                float f5 = f2 * 0.5f;
                pkb pkbVar8 = xuaVar3.b;
                pkbVar8.p = f5;
                this.u = Math.max(this.u, pkbVar8.c);
                pkb pkbVar9 = xuaVar3.c;
                pkbVar9.p = f5;
                this.v = Math.max(this.v, pkbVar9.c);
                h2 += xuaVar3.a();
            }
        }
        float L4 = h2 + hl.L(11.66f);
        if (this.p) {
            L = hl.L(10.0f);
        } else {
            this.A = L4;
            this.C = new pkb(ob6.M0(2131749834, null), 14.0f, hl.o());
            float L5 = hl.L(30.0f);
            this.B = L5;
            L4 += L5;
            L = hl.L(11.0f);
        }
        this.P = (int) (L4 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f = this.O;
        float L = hl.L(10.0f) + 0.0f + hl.L(110.0f) + hl.L(9.33f);
        pkb pkbVar = new pkb(ob6.a0(null, null, 2131749838, wf3.s(j)), 14.0f, hl.o());
        this.r = pkbVar;
        this.q = (pkbVar.h() / 2.0f) + L;
        float h = this.r.h() + L + hl.L(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        pkb pkbVar2 = new pkb(qu6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        this.t = pkbVar2;
        this.s = (pkbVar2.h() / 2.0f) + h;
        float h2 = this.t.h() + h + hl.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        iw4 iw4Var = this.y;
        TextPaint textPaint = iw4Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749693, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            r47.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = r47.A5(pv3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject b2 = j != 0 ? uc7.s1(this.a).b2(j) : null;
        this.z = true;
        iw4Var.c(b2);
        iw4Var.m = spanned;
        iw4Var.s = -1;
        iw4Var.b(((int) f) - hl.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = iw4Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((iw4Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = h2 + hl.L(4.0f);
        this.x = L2;
        float L3 = L2 + iw4Var.u + hl.L(3.0f) + hl.L(11.66f);
        this.A = L3;
        this.C = new pkb(str, 14.0f, hl.o());
        float L4 = hl.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + hl.L(11.0f));
    }
}
