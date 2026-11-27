// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class u49 {
    public int A;
    public final ImageReceiver B;
    public final wl C;
    public int D;
    public final dy2 E;
    public final hn F;
    public final hn G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final boolean P;
    public boolean Q;
    public boolean R;
    public ic0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final vnb W;
    public final v41 X;
    public final yza Y;
    public final b29 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public wl f0;
    public int g;
    public int h;
    public final int i;
    public final int j;
    public final boolean l;
    public boolean m;
    public final String n;
    public boolean o;
    public boolean p;
    public final TLRPC.Reaction q;
    public final w49 r;
    public boolean t;
    public final String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean k = true;
    public final Rect s = new Rect();
    public final RectF a0 = new RectF();
    public final RectF b0 = new RectF();
    public final Path c0 = new Path();

    public u49(u49 u49Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, vnb vnbVar) {
        yza yzaVar;
        b29 b29Var;
        jn jnVar = new jn(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new v41(view);
        this.W = vnbVar;
        this.R = z;
        if (u49Var != null) {
            this.E = u49Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new dy2(view, false, null);
        }
        if (this.F == null) {
            hn hnVar = new hn(true, true, true);
            this.F = hnVar;
            hnVar.L = true;
            hnVar.n(0.4f, 320L, k43.h);
            hnVar.w(hl.L(13.0f));
            hnVar.setCallback(jnVar);
            hnVar.x(hl.o());
            hnVar.N = hl.q.x;
        }
        if (this.G == null) {
            hn hnVar2 = new hn(false, false, false, true, false);
            this.G = hnVar2;
            hnVar2.w(hl.L(12.0f));
            hnVar2.setCallback(jnVar);
            hnVar2.x(hl.o());
            hnVar2.N = hl.q.x;
            hnVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        w49 d = w49.d(reaction);
        this.r = d;
        int i2 = reactionCount.count;
        this.v = i2;
        this.o = reactionCount.chosen;
        this.i = i2;
        this.j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                xi4.l("unsupported");
                throw null;
            }
            this.n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        dy2 dy2Var = this.E;
        dy2Var.F = false;
        dy2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (i86.e(8200)) {
                    if (u49Var == null || (b29Var = u49Var.Z) == null) {
                        b29Var = new b29(R.raw.star_reaction_click, hl.L(40.0f), hl.L(40.0f));
                        this.Z = b29Var;
                    } else {
                        this.Z = b29Var;
                    }
                    this.B.g0(b29Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (u49Var == null || (yzaVar = u49Var.Y) == null) {
                    yzaVar = new yza(1, xea.o() == 2 ? 18 : 8);
                }
                this.Y = yzaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new wl(i(), i, d.g);
            }
        }
        this.E.d(hl.L(26.0f), hl.L(100.0f));
        this.E.e = x49.V;
        if (z) {
            this.u = uc7.s1(i).J1(reaction);
            this.t = !TextUtils.isEmpty(r1);
        }
        boolean z2 = this.t;
        hn hnVar3 = this.F;
        if (z2) {
            hnVar3.t(pv3.m(this.u, hnVar3.a.getFontMetricsInt(), false, null, 0), !ob6.a0, true);
            boolean z3 = this instanceof mw9;
            dy2 dy2Var2 = this.E;
            if (z3) {
                dy2Var2.c(this.v, false);
            } else {
                dy2Var2.c(0, false);
            }
        } else {
            if (hnVar3 != null) {
                hnVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        dy2 dy2Var3 = this.E;
        dy2Var3.H = (byte) 2;
        dy2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.e();
        }
        wl wlVar = this.C;
        if (wlVar != null) {
            wlVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.f();
        }
        wl wlVar = this.C;
        if (wlVar != null) {
            wlVar.o(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.e0;
        if (imageReceiver == null && this.f0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.K();
            this.e0 = null;
        } else if (this.f0 != null) {
            View view = this.V;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.f0.o(view);
            this.f0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5) {
        dy2 dy2Var;
        float f6;
        ImageReceiver imageReceiver;
        hn hnVar;
        vnb vnbVar;
        View view;
        float f7;
        float f8;
        float f9;
        RectF rectF;
        float f10;
        boolean z3;
        float f11;
        boolean z4;
        float f12;
        float f13;
        ImageReceiver imageReceiver2;
        float f14;
        float f15;
        ic0 ic0Var;
        float f16;
        float f17;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        ln5 ln5Var;
        float f18;
        ln5 ln5Var2;
        boolean z5;
        Paint paint;
        View view2;
        t37 O1;
        int v0;
        dy2 dy2Var2 = this.E;
        View view3 = this.V;
        boolean z6 = this.l;
        Rect rect = this.s;
        hn hnVar2 = this.F;
        hn hnVar3 = this.G;
        vnb vnbVar2 = this.W;
        wl wlVar = this.C;
        ImageReceiver imageReceiver4 = wlVar != null ? wlVar.k : this.B;
        if (this.o) {
            if (z6) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = aob.v0(l() ? aob.Jc : aob.tk, vnbVar2);
                this.J = aob.v0(l() ? aob.xk : aob.wk, vnbVar2);
                if (view3 instanceof dl1) {
                    this.L = aob.v0(aob.zk, vnbVar2);
                    this.K = aob.v0(aob.yk, vnbVar2);
                } else {
                    this.L = aob.v0(l() ? aob.Jc : aob.tk, vnbVar2);
                    this.K = aob.v0(l() ? aob.rb : aob.ra, vnbVar2);
                }
            }
        } else if (z6) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = aob.v0(l() ? aob.uk : aob.vk, vnbVar2);
            int v02 = aob.v0(l() ? aob.Jc : aob.tk, vnbVar2);
            this.I = v02;
            this.I = vm2.o(v02, (int) (Color.alpha(v02) * 0.156f));
            this.L = aob.v0(aob.Zc, vnbVar2);
            this.K = 0;
        }
        if (!z6 && (view3 instanceof wb2) && ((wb2) view3).w2()) {
            if (this.o) {
                this.I = aob.v0(aob.jb, vnbVar2);
                v0 = aob.v0(aob.kb, vnbVar2);
                this.J = v0;
            } else {
                this.I = vm2.k(aob.v0(aob.hb, vnbVar2), l() ? vm2.k(aob.v0(aob.La, vnbVar2), aob.v0(aob.ua, vnbVar2)) : aob.v0(aob.ua, vnbVar2));
                v0 = aob.v0(aob.ib, vnbVar2);
                this.J = v0;
            }
            this.L = v0;
            this.K = this.I;
        }
        if (this.p) {
            this.I = 0;
            this.K = 0;
        }
        r(f3);
        TextPaint textPaint = x49.V;
        textPaint.setColor(this.M);
        if (hnVar2 != null) {
            hnVar2.u(this.M);
        }
        Paint paint2 = x49.S;
        paint2.setColor(this.N);
        boolean z7 = this.R && h() && Color.alpha(this.O) == 0;
        if (f4 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f4));
            paint2.setAlpha((int) (paint2.getAlpha() * f4));
        }
        if (imageReceiver4 != null) {
            imageReceiver4.setAlpha(f4);
        }
        if (f5 <= 0.0f || this.H == z2) {
            dy2Var = dy2Var2;
            f6 = 0.0f;
            imageReceiver = imageReceiver4;
            hnVar = hnVar3;
            vnbVar = vnbVar2;
            view = view3;
        } else {
            if (z2) {
                f6 = 0.0f;
                hnVar = hnVar3;
                dy2Var = dy2Var2;
                vnbVar = vnbVar2;
                imageReceiver = imageReceiver4;
                hnVar.m(0.6f, 650L, 1.6f, k43.k);
                hnVar.t(hl.o0(this.v, 0), false, true);
                view = view3;
                hnVar.t(ob6.E(this.v, ','), true, true);
            } else {
                dy2Var = dy2Var2;
                f6 = 0.0f;
                imageReceiver = imageReceiver4;
                hnVar = hnVar3;
                vnbVar = vnbVar2;
                view = view3;
                hnVar.m(0.6f, 320L, 1.6f, k43.h);
                hnVar.t(hl.o0(this.v, 0), true, true);
            }
            this.H = z2;
        }
        float a = this.X.a(0.1f);
        int i = this.z;
        if (f5 <= 0.0f || this.R || hnVar == null || this.S != null) {
            f7 = 1.0f;
            f8 = 8.0f;
            if (f3 != 1.0f) {
                f9 = 4.0f;
                if (this.b == 3) {
                    i = (int) qd4.A(1.0f, f3, this.e, i * f3);
                }
                rectF = hl.P;
                float f19 = i;
                f10 = f7;
                rectF.set(f, f2, f + f19, this.A + f2);
                if (a == f10) {
                    canvas.save();
                    canvas.scale(a, a, (f19 / 2.0f) + f, (this.A / 2.0f) + f2);
                    z3 = true;
                } else {
                    z3 = false;
                }
                f11 = this.A / 2.0f;
                if (j() > f6 || this.p) {
                    z4 = z3;
                    f12 = 2.0f;
                    f13 = 20.0f;
                } else {
                    f12 = 2.0f;
                    vnb vnbVar3 = vnbVar;
                    Paint U0 = aob.U0("paintChatActionBackground", vnbVar3);
                    f13 = 20.0f;
                    Paint U02 = aob.U0("paintChatActionBackgroundDarken", vnbVar3);
                    z4 = z3;
                    int alpha = U0.getAlpha();
                    int alpha2 = U02.getAlpha();
                    U0.setAlpha((int) (alpha * f4 * j()));
                    U02.setAlpha((int) (alpha2 * f4 * j()));
                    g(canvas, rectF, f11, U0);
                    if (vnbVar3 == null ? aob.b1() : vnbVar3.g()) {
                        g(canvas, rectF, f11, U02);
                    }
                    U0.setAlpha(alpha);
                    U02.setAlpha(alpha2);
                }
                if (z && j() < f10) {
                    view2 = view;
                    if ((view2 instanceof wb2) && (O1 = ((wb2) view2).O1(false)) != null && !this.R) {
                        canvas.drawRoundRect(rectF, f11, f11, O1.c);
                    }
                }
                if (z7) {
                    rectF.right += hl.L(f9);
                    canvas.saveLayerAlpha(rectF, jn7.d4, 31);
                    rectF.right -= hl.L(f9);
                }
                if (this.Y != null) {
                    i86.e(8200);
                }
                g(canvas, rectF, f11, paint2);
                if (this.R && h()) {
                    if (z7) {
                        paint = x49.T;
                        paint.setColor(this.O);
                        paint.setAlpha((int) (paint.getAlpha() * f4));
                    } else {
                        paint = x49.U;
                    }
                    canvas.drawCircle(rectF.right - hl.L(8.4f), rectF.centerY(), hl.L(2.66f), paint);
                }
                if (z7) {
                    canvas.restore();
                }
                imageReceiver2 = imageReceiver;
                if (imageReceiver2 != null) {
                    if (z6) {
                        L = hl.L(22.0f);
                        L2 = hl.L(f9);
                    } else if (wlVar != null) {
                        L = hl.L(24.0f);
                        L2 = hl.L(6.0f);
                        imageReceiver2.q0(hl.L(6.0f));
                    } else {
                        L = hl.L(f13);
                        L2 = hl.L(f8);
                        imageReceiver2.q0(0);
                    }
                    int i2 = (int) ((this.A - L) / f12);
                    if (this.R) {
                        L2 -= hl.L(f12);
                    }
                    int i3 = ((int) f) + L2;
                    int i4 = ((int) f2) + i2;
                    rect.set(i3, i4, i3 + L, L + i4);
                    wl wlVar2 = this.C;
                    if (wlVar2 == null || (imageReceiver3 = wlVar2.k) == null) {
                        imageReceiver3 = this.B;
                    }
                    if (imageReceiver3 != null && rect != null) {
                        imageReceiver3.j0(rect);
                    }
                    wl wlVar3 = this.C;
                    if (wlVar3 != null && this.D != this.M) {
                        int i5 = this.M;
                        this.D = i5;
                        wlVar3.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                    }
                    if (!this.k) {
                        ln5Var = null;
                        f18 = f6;
                    } else if (this.l || this.i > 1 || !m() || !this.P) {
                        ImageReceiver k = k();
                        if (k != null) {
                            boolean z8 = k.y() == null || !k.y().p();
                            if (f4 != f10) {
                                k.setAlpha(f4);
                                if (f4 <= f6) {
                                    k.K();
                                    n();
                                }
                            } else if (k.y() != null && !k.y().l0) {
                                float alpha3 = k.getAlpha() - 0.08f;
                                if (alpha3 <= f6) {
                                    k.K();
                                    n();
                                } else {
                                    k.setAlpha(alpha3);
                                }
                                this.V.invalidate();
                                z5 = true;
                                float f20 = imageReceiver3.L0 - (imageReceiver3.N0 / f12);
                                float f21 = imageReceiver3.M0 - (imageReceiver3.O0 / f12);
                                float floor = (int) Math.floor(f20);
                                float floor2 = (int) Math.floor(f21);
                                k.i0(floor, floor2, imageReceiver3.N0 * f12, imageReceiver3.O0 * f12);
                                canvas.save();
                                canvas.translate(f20 - floor, f21 - floor2);
                                ln5Var2 = null;
                                k.h(canvas, null);
                                canvas.restore();
                            }
                            z5 = z8;
                            float f202 = imageReceiver3.L0 - (imageReceiver3.N0 / f12);
                            float f212 = imageReceiver3.M0 - (imageReceiver3.O0 / f12);
                            float floor3 = (int) Math.floor(f202);
                            float floor22 = (int) Math.floor(f212);
                            k.i0(floor3, floor22, imageReceiver3.N0 * f12, imageReceiver3.O0 * f12);
                            canvas.save();
                            canvas.translate(f202 - floor3, f212 - floor22);
                            ln5Var2 = null;
                            k.h(canvas, null);
                            canvas.restore();
                        } else {
                            ln5Var2 = null;
                            z5 = true;
                        }
                        if (z5) {
                            imageReceiver3.h(canvas, ln5Var2);
                        }
                        this.m = true;
                    } else {
                        f18 = f6;
                        ln5Var = null;
                    }
                    imageReceiver3.setAlpha(f18);
                    imageReceiver3.h(canvas, ln5Var);
                    this.m = false;
                }
                if (hnVar2 != null || hnVar2.i() <= 0.0f) {
                    f14 = 0.0f;
                } else {
                    canvas.save();
                    if (!this.t || h()) {
                        f17 = this.t ? 9 : 8;
                    } else {
                        f17 = 10.0f;
                    }
                    canvas.translate(hl.L(f17) + f + hl.L(f13) + hl.L(f12), f2);
                    hnVar2.setBounds(0, 0, this.z, this.A);
                    hnVar2.draw(canvas);
                    hnVar2.C = (int) (f4 * 255.0f);
                    canvas.restore();
                    f14 = hnVar2.c() + (hnVar2.i() * hl.L(f9));
                }
                if (f5 <= 0.0f && !this.R && hnVar != null && this.S == null) {
                    float max = Math.max(0.0f, (hl.L(12.0f) - hnVar.c()) / f12);
                    canvas.save();
                    if (!this.t || h()) {
                        f16 = this.t ? 9 : 8;
                    } else {
                        f16 = 10.0f;
                    }
                    canvas.translate(hl.L(f16) + f + hl.L(f13) + hl.L(wlVar == null ? f12 : 5.0f) + max, f2 - hl.L(f10));
                    hnVar.setBounds(0, 0, this.z, this.A);
                    hnVar.draw(canvas);
                    hnVar.C = (int) (255.0f * f4);
                    canvas.restore();
                } else if (dy2Var != null && e()) {
                    canvas.save();
                    if (this.t || h()) {
                        f15 = this.t ? 9 : 8;
                    } else {
                        f15 = 10.0f;
                    }
                    canvas.translate(hl.L(f15) + f + hl.L(f13) + hl.L(wlVar == null ? f12 : 5.0f) + f14 + (!z6 ? -hl.L(f10) : 0), f2);
                    dy2Var.a(canvas);
                    canvas.restore();
                }
                if (!this.R && this.S != null) {
                    canvas.save();
                    canvas.translate(f + hl.L(10.0f) + hl.L(f13) + hl.L(f12), f2);
                    ic0Var = this.S;
                    ic0Var.u = f4;
                    if (ic0Var.w && ic0Var.e != f3) {
                        ic0Var.e = f3;
                        if (f3 == f10) {
                            ic0Var.k();
                            ic0Var.w = false;
                        }
                    }
                    this.S.g(canvas);
                    canvas.restore();
                }
                if (z4) {
                    return;
                }
                canvas.restore();
                return;
            }
        } else {
            i = (int) (hnVar.c() + hl.L(wlVar != null ? 6.0f : 4.0f) + hl.L(20.0f) + hl.L(8.0f) + hl.L(8.0f));
            hnVar.u(this.M);
            f8 = 8.0f;
            f7 = 1.0f;
        }
        f9 = 4.0f;
        rectF = hl.P;
        float f192 = i;
        f10 = f7;
        rectF.set(f, f2, f + f192, this.A + f2);
        if (a == f10) {
        }
        f11 = this.A / 2.0f;
        if (j() > f6) {
        }
        z4 = z3;
        f12 = 2.0f;
        f13 = 20.0f;
        if (z) {
            view2 = view;
            if (view2 instanceof wb2) {
                canvas.drawRoundRect(rectF, f11, f11, O1.c);
            }
        }
        if (z7) {
        }
        if (this.Y != null) {
        }
        g(canvas, rectF, f11, paint2);
        if (this.R) {
            if (z7) {
            }
            canvas.drawCircle(rectF.right - hl.L(8.4f), rectF.centerY(), hl.L(2.66f), paint);
        }
        if (z7) {
        }
        imageReceiver2 = imageReceiver;
        if (imageReceiver2 != null) {
        }
        if (hnVar2 != null) {
        }
        f14 = 0.0f;
        if (f5 <= 0.0f) {
        }
        if (dy2Var != null) {
            canvas.save();
            if (this.t) {
            }
            f15 = this.t ? 9 : 8;
            canvas.translate(hl.L(f15) + f + hl.L(f13) + hl.L(wlVar == null ? f12 : 5.0f) + f14 + (!z6 ? -hl.L(f10) : 0), f2);
            dy2Var.a(canvas);
            canvas.restore();
        }
        if (!this.R) {
            canvas.save();
            canvas.translate(f + hl.L(10.0f) + hl.L(f13) + hl.L(f12), f2);
            ic0Var = this.S;
            ic0Var.u = f4;
            if (ic0Var.w) {
                ic0Var.e = f3;
                if (f3 == f10) {
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z4) {
        }
    }

    public boolean e() {
        int i = this.v;
        return ((i == 0 || (this.R && !this.t && i == 1)) && this.E.l == 1.0f) ? false : true;
    }

    public final boolean f(Canvas canvas, float f, float f2) {
        yza yzaVar = this.Y;
        if (yzaVar == null) {
            return false;
        }
        RectF rectF = yzaVar.c;
        if (!i86.e(8200) || !i86.e(131072)) {
            return false;
        }
        RectF rectF2 = hl.P;
        rectF2.set(f, f2, this.z + f, this.A + f2);
        float f3 = this.A / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-hl.L(4.0f), -hl.L(4.0f));
        yzaVar.g(rectF);
        boolean d = yzaVar.d();
        yzaVar.a(canvas, vm2.f(j(), vm2.o(this.I, jn7.d4), vm2.f(0.4f, this.L, vm2.o(this.I, jn7.d4))));
        if (this.P) {
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            yzaVar.a(canvas, this.J);
            canvas.restore();
        }
        return d;
    }

    public final void g(Canvas canvas, RectF rectF, float f, Paint paint) {
        if (!this.R) {
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        RectF rectF2 = this.a0;
        float f2 = rectF2.left;
        float f3 = rectF.left;
        Path path = this.c0;
        if (f2 != f3 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            x49.h(rectF2, this.b0, path);
        }
        canvas.drawPath(path, paint);
    }

    public boolean h() {
        return true;
    }

    public int i() {
        return this.R ? 18 : 3;
    }

    public float j() {
        return 0.0f;
    }

    public ImageReceiver k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void o(ArrayList arrayList) {
        this.T = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, x49.Z);
            if (this.S == null) {
                ic0 ic0Var = new ic0(this.V, false);
                this.S = ic0Var;
                ic0Var.v = (short) 250;
                k43 k43Var = bb2.V;
                ic0Var.s = hl.L(20.0f);
                this.S.p = hl.L(100.0f);
                ic0 ic0Var2 = this.S;
                ic0Var2.o = this.A;
                ic0Var2.h(hl.L(22.0f));
            }
            if (this.d0) {
                this.S.e();
            }
            for (int i = 0; i < arrayList.size() && i != 3; i++) {
                this.S.j(i, this.U, (TLObject) arrayList.get(i));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        wl wlVar = this.C;
        if (wlVar == null || (imageReceiver = wlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            b29 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            lm m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        wl wlVar = this.C;
        if (wlVar == null || (imageReceiver = wlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            b29 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            lm m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        this.M = vm2.f(f, this.h, vm2.f(j(), this.J, this.L));
        int f2 = vm2.f(f, this.f, vm2.f(j(), this.I, this.K));
        this.N = f2;
        this.O = vm2.f(f, this.g, hl.B(f2) > 0.8f ? 0 : 1526726655);
    }

    public void n() {
    }
}
