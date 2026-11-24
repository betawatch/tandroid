// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p99 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final km E;
    public final km F;
    public final km G;
    public final km H;
    public final km I;
    public final ln J;
    public final ln K;
    public final ln L;
    public final ln M;
    public final ln N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public byte S;
    public ylb T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public o99[] a0;
    public float b0;
    public boolean c0;
    public qa6 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public tm t;
    public tm u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;
    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f = new Path();
    public final Paint g = new Paint();
    public int q = 0;
    public float r = 1.0f;

    public p99(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new wd(this, (byte) 13));
        }
        d53 d53Var = d53.h;
        this.E = new km(view, 400L, d53Var, 0);
        this.F = new km(view, 400L, d53Var, 0);
        this.G = new km(view, 400L, d53Var, 0);
        this.H = new km(view, 400L, d53Var, 0);
        this.I = new km(view, 400L, d53Var, 0);
        this.J = new ln(view, 0L, 400L, d53Var);
        this.K = new ln(view, 0L, 400L, d53Var);
        this.L = new ln(view, 0L, 440L, d53Var);
        this.M = new ln(view, 0L, 320L, d53Var);
        this.N = new ln(view, 0L, 320L, d53Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(k47 k47Var, TLRPC.User user, TLRPC.Chat chat, ylb ylbVar, int i) {
        km kmVar;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        k47 k47Var2;
        TLRPC.Message message2;
        int F;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int f;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int v0;
        boolean z;
        View view;
        TLRPC.Message message4;
        int i2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        this.R = false;
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        if (k47Var != null && !k47Var.O3() && i != 2 && (tL_peerColorCollectible = k47Var.g1) != null) {
            return l(k47Var, tL_peerColorCollectible, ylbVar);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = k47Var != null && k47Var.q4();
        km kmVar2 = this.I;
        if (k47Var == null) {
            this.R = true;
            this.S = i;
            this.T = ylbVar;
            this.U = anb.b;
            this.j = false;
            this.i = false;
            int v02 = cmb.v0(cmb.Kd, ylbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.x = cmb.p1(a ? 0.12f : 0.1f, v02);
            this.C = h();
            int v03 = cmb.v0(cmb.Md, ylbVar);
            this.y = v03;
            return kmVar2.a(v03, false);
        }
        int i3 = k47Var.K1;
        if (i != 4 || (message4 = k47Var.k) == null || k47.n1(message4) == null || !(k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaContact)) {
            kmVar = kmVar2;
            if (i != 0 && (k47Var.e1 >= 0 || (k47Var.k != null && (((k47Var.p3() || pg3.B(k47.B0(k47Var.k))) && user2 != null) || ((k47Var.n3() && chat != null) || (((message3 = k47Var.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (k47Var.q4() && (peerColor2 = k47Var.Z0) != null && peerColor2.color != -1))))))) {
                int i4 = k47Var.e1;
                if (i4 < 0) {
                    if (!k47Var.q4() || (peerColor = k47Var.Z0) == null || (f = peerColor.color) == -1) {
                        TLRPC.Message message5 = k47Var.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long n = pg3.n(peer);
                            if (n < 0) {
                                TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-n));
                                if (!k47Var.O3() && i != 2 && L0 != null) {
                                    TLRPC.PeerColor peerColor3 = L0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor3, ylbVar);
                                    }
                                }
                                f = L0 != null ? sd2.F(L0) : 5;
                                if (i == 3) {
                                    this.v = sd2.G(L0);
                                }
                            } else {
                                TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(n));
                                if (!k47Var.O3() && i != 2 && W1 != null) {
                                    TLRPC.PeerColor peerColor4 = W1.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor4, ylbVar);
                                    }
                                }
                                f = W1 != null ? m9c.f(W1) : 5;
                                if (i == 3) {
                                    this.v = m9c.g(W1);
                                }
                            }
                        } else if (pg3.B(k47.B0(message5)) && user2 != null) {
                            TLRPC.User f2 = k47Var.O3() ? z8c.h(i3).f() : user2;
                            if (f2 != null) {
                                user2 = f2;
                            }
                            if (!k47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor5, ylbVar);
                                }
                            }
                            i4 = m9c.f(user2);
                            if (i == 3) {
                                this.v = m9c.g(user2);
                            }
                        } else if (k47Var.p3() && user2 != null) {
                            if (!k47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor6, ylbVar);
                                }
                            }
                            i4 = m9c.f(user2);
                            if (i == 3) {
                                this.v = m9c.g(user2);
                            }
                        } else if (!k47Var.n3() || chat == null) {
                            i4 = 0;
                        } else {
                            if (!k47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor7, ylbVar);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = k47Var.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User W12 = oc7.r1(i3).W1(Long.valueOf(Z0));
                                    F = m9c.f(W12);
                                    if (i == 3) {
                                        this.v = m9c.g(W12);
                                    }
                                } else {
                                    TLRPC.Chat L02 = oc7.r1(i3).L0(Long.valueOf(-Z0));
                                    F = sd2.F(L02);
                                    if (i == 3) {
                                        this.v = sd2.G(L02);
                                    }
                                }
                                i4 = F;
                            } else {
                                i4 = sd2.F(chat);
                                if (i == 3) {
                                    this.v = sd2.G(chat);
                                }
                            }
                        }
                    } else if (i == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i4 = f;
                }
                m(k47Var, i4, ylbVar);
                this.x = cmb.p1(0.1f, this.z);
                this.y = this.z;
            } else if (i != 0 || (k47Var.e1 < 0 && ((message = k47Var.k) == null || k47Var.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (k47Var2 = k47Var.C).k) == null || message2.from_id == null || !(k47Var2.p3() || pg3.B(k47.B0(k47Var.k)) || k47Var.C.n3()))))) {
                this.i = false;
                this.j = false;
                int v04 = cmb.v0(cmb.Kd, ylbVar);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = cmb.p1(0.1f, v04);
                this.y = cmb.v0(cmb.Md, ylbVar);
            } else {
                int i5 = k47Var.e1;
                if (i5 < 0) {
                    boolean B = pg3.B(k47.B0(k47Var.C.k));
                    k47 k47Var3 = k47Var.C;
                    if (B) {
                        if (k47Var3.O3()) {
                            user2 = z8c.h(k47Var.C.K1).f();
                        }
                        if (user2 != null) {
                            i5 = m9c.f(user2);
                            this.v = m9c.g(user2);
                        }
                        i5 = 0;
                    } else if (k47Var3.p3()) {
                        TLRPC.User W13 = oc7.r1(i3).W1(Long.valueOf(k47Var.C.k.from_id.user_id));
                        if (!k47Var.O3() && i != 2 && W13 != null) {
                            TLRPC.PeerColor peerColor8 = W13.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor8, ylbVar);
                            }
                        }
                        if (W13 != null) {
                            i5 = m9c.f(W13);
                            this.v = m9c.g(W13);
                        }
                        i5 = 0;
                    } else {
                        if (k47Var.C.n3()) {
                            TLRPC.Chat L03 = oc7.r1(i3).L0(Long.valueOf(k47Var.C.k.from_id.channel_id));
                            if (!k47Var.O3() && i != 2 && L03 != null) {
                                TLRPC.PeerColor peerColor9 = L03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor9, ylbVar);
                                }
                            }
                            if (L03 != null) {
                                i5 = sd2.F(L03);
                                this.v = sd2.G(L03);
                            }
                        }
                        i5 = 0;
                    }
                }
                m(k47Var.C, i5, ylbVar);
                this.x = cmb.p1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j = k47.n1(k47Var.k).user_id;
            TLRPC.User W14 = j != 0 ? oc7.r1(i3).W1(Long.valueOf(j)) : null;
            if (!k47Var.O3() && i != 2 && W14 != null) {
                TLRPC.PeerColor peerColor10 = W14.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(k47Var, (TLRPC.TL_peerColorCollectible) peerColor10, ylbVar);
                }
            }
            if (W14 != null) {
                i2 = m9c.f(W14);
                kmVar = kmVar2;
                this.v = m9c.g(W14);
            } else {
                kmVar = kmVar2;
                i2 = 0;
            }
            m(k47Var, i2, ylbVar);
            this.x = cmb.p1(0.1f, this.z);
            this.y = this.z;
        }
        if (k47Var.O5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = cmb.v0(cmb.Nd, ylbVar);
        } else if (k47Var.O3() || i == 2) {
            if (i != 2 || k47Var.O3()) {
                int i6 = cmb.Qb;
                Integer y0 = cmb.y0(i6, ylbVar);
                if (y0 != null) {
                    v0 = y0.intValue();
                } else {
                    if (this.i || this.j) {
                        i6 = cmb.Rb;
                    }
                    v0 = cmb.v0(i6, ylbVar);
                }
                this.B = v0;
                this.A = v0;
                this.z = v0;
            } else {
                v0 = cmb.v0(cmb.fl, ylbVar);
                this.B = v0;
                this.A = v0;
                this.z = v0;
            }
            if (this.j) {
                this.V = true;
                this.z = cmb.p1(0.2f, v0);
                this.A = cmb.p1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = cmb.p1(0.35f, v0);
            }
            this.x = cmb.p1(a ? 0.12f : 0.1f, this.B);
            int i7 = cmb.Sb;
            this.y = cmb.v0(i7, ylbVar);
            if (k47Var.P2() && k47Var.O3()) {
                this.x = on2.l(cmb.v0(cmb.Na, ylbVar), on2.l(cmb.v0(cmb.Ka, ylbVar), cmb.v0(cmb.ta, ylbVar)));
                this.y = cmb.y0(i7, ylbVar).intValue();
            }
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = k47Var.f1;
            if (j2 != -1) {
                this.v = j2;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new tm(gm.L(20.0f), 13, view, false);
            if (!(view instanceof rc2) ? view.isAttachedToWindow() : ((rc2) view).O0) {
                this.t.a();
            }
        }
        tm tmVar = this.t;
        if (tmVar != null) {
            z = true;
            if (tmVar.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z = true;
        }
        tm tmVar2 = this.u;
        if (tmVar2 != null) {
            tmVar2.j(this.w, z);
        }
        this.C = h();
        return kmVar.a(this.y, false);
    }

    public final void b() {
        p99 p99Var;
        if (!this.R || this.U == anb.b) {
            return;
        }
        try {
            p99Var = this;
        } catch (Exception e) {
            e = e;
            p99Var = this;
        }
        try {
            p99Var.a(null, null, null, this.T, this.S);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            p99Var.R = false;
            fc4.g(exc, true);
        }
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float max = Math.max(gm.L((int) Math.floor(gda.U0 / 3.0f)), gm.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = gm.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = gm.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(gm.L((int) Math.floor(gda.U0 / 3.0f)), gm.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f4, z, z2);
    }

    public final void e(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        boolean z3;
        mm mmVar;
        float d;
        int i;
        tm tmVar;
        b();
        if (!z2) {
            int p1 = cmb.p1(f, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(p1);
            float[] fArr = this.e;
            if (kue.a(fArr)) {
                float f2 = fArr[0];
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        tm tmVar2 = this.t;
        if (tmVar2 != null) {
            if (!this.c0) {
                Drawable drawable = tmVar2.f[0];
                if ((drawable instanceof vm) && (mmVar = ((vm) drawable).k) != null && mmVar.C()) {
                    this.c0 = true;
                } else {
                    z3 = false;
                    d = this.L.d(z3);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i = 0;
                        this.a0 = new o99[]{new o99(4.0f, -6.33f, 1.0f, 1.0f), new o99(30.0f, 3.0f, 0.78f, 0.9f), new o99(46.0f, -17.0f, 0.6f, 0.6f), new o99(69.66f, -0.666f, 0.87f, 0.7f), new o99(98.0f, -12.6f, 1.03f, 0.3f), new o99(51.0f, 24.0f, 1.0f, 0.5f), new o99(6.33f, 20.0f, 0.77f, 0.7f), new o99(-19.0f, 12.0f, 0.8f, 0.6f, 0), new o99(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - gm.L(15.0f), rectF.centerX());
                    if (z) {
                        max -= gm.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + gm.L(21.0f));
                    tm tmVar3 = this.u;
                    if (tmVar3 != null) {
                        tmVar3.w = (int) (f * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i2 = i;
                    while (true) {
                        o99[] o99VarArr = this.a0;
                        if (i2 >= o99VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i2 != 0 || (tmVar = this.u) == null || this.w == 0) {
                            tmVar = this.t;
                        }
                        o99 o99Var = o99VarArr[i2];
                        if (!o99Var.e || z) {
                            tmVar.w = (int) ((tmVar == this.u ? 1.0f : 0.3f) * 255.0f * o99Var.d * this.r);
                            float L = max - gm.L(o99Var.a);
                            float L2 = gm.L(o99Var.b) + min;
                            float L3 = gm.L(10.0f) * o99Var.c * d;
                            tmVar.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            tmVar.draw(canvas);
                        }
                        i2++;
                    }
                }
            }
            z3 = true;
            d = this.L.d(z3);
            if (d > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0182, code lost:
    
        if ((((r10 ^ r18) >> 31) | 1) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a5, code lost:
    
        r19 = r19 + r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a2, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0244, code lost:
    
        if (r26.k.getHeight() == r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a0, code lost:
    
        if ((((r10 ^ r18) >> 31) | 1) > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas, RectF rectF, float f) {
        float f2;
        float height;
        int L;
        int i;
        int i2;
        float f3;
        b();
        int floor = (int) Math.floor(gda.U0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(gm.L(3.0f), gm.L(floor << 1));
        int a = this.F.a(this.z, false);
        int p1 = cmb.p1(f, a);
        Paint paint = this.b;
        paint.setColor(p1);
        float d = this.M.d(this.W);
        float d2 = this.J.d(this.i);
        float d3 = this.K.d(this.j);
        RectF rectF2 = this.a;
        if (d > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f4 = rectF2.left;
            canvas.clipRect(f4, rectF2.top, gm.L(3.0f) + f4, rectF2.bottom);
            float f5 = floor;
            canvas.drawRoundRect(rectF2, gm.L(f5), gm.L(f5), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.X / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (gm.R1(0.0f, 1.0f - d53.i.getInterpolation(pqe.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + gm.L(6.0f), (gm.R1(1.0f, 1.0f - d53.g.getInterpolation(pqe.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (d2 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f6 = rectF2.left;
            canvas.clipRect(f6, rectF2.top, gm.L(3.0f) + f6, rectF2.bottom);
            float f7 = floor;
            canvas.drawRoundRect(rectF2, gm.L(f7), gm.L(f7), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.j) {
            height = rectF.height();
            f2 = 12.66f;
            int height2 = (int) rectF.height();
            L = gm.L(18.99f);
            i = height2 % L;
            if (i != 0) {
            }
            i2 = 0;
        } else {
            f2 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            L = gm.L(12.66f);
            i = height3 % L;
            if (i != 0) {
            }
            i2 = 0;
        }
        float e = ((((this.N.e(false, this.q * 425) + this.Y) + (this.V ? 100 : 0)) / 1000.0f) * gm.L(30.0f)) % (height - i2);
        int a2 = this.G.a(this.A, false);
        int a3 = this.H.a(this.B, false);
        int p12 = cmb.p1(f, a);
        int l = on2.l(cmb.p1(d2 * f, a2), p12);
        int l2 = this.j ? on2.l(cmb.p1(f * d3, a3), p12) : 0;
        int round = Math.round(gm.N(6.33f));
        int max2 = Math.max(1, gm.L(3.0f));
        int L2 = this.j ? gm.L(18.99f) : gm.L(f2);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == p12 && this.m == l && this.n == l2) {
            f3 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f3 = max;
        }
        this.l = p12;
        this.m = l;
        this.n = l2;
        this.p = this.j;
        this.o = round;
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.getWidth() != max2 || this.k.getHeight() != L2) {
            Bitmap bitmap3 = this.k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.k = Bitmap.createBitmap(max2, L2, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.k, p12, l, l2, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -e);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(nm7.d4);
        rectF2.set(0.0f, 0.0f, f3 - rectF.left, rectF.bottom - rectF.top);
        float f8 = rectF2.left;
        canvas.clipRect(f8, rectF2.top, gm.L(3.0f) + f8, rectF2.bottom);
        float f9 = floor;
        canvas.drawRoundRect(rectF2, gm.L(f9), gm.L(f9), paint2);
        canvas.restore();
    }

    public final void g(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        qa6 qa6Var;
        float max = Math.max(gm.L((int) Math.floor(gda.U0 / 3.0f)), gm.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = gm.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = gm.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(gm.L((int) Math.floor(gda.U0 / 3.0f)), gm.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((qa6Var = this.h) == null || !qa6Var.d())) {
            qa6 qa6Var2 = this.h;
            if (qa6Var2 != null) {
                qa6Var2.b = -1L;
                return;
            }
            return;
        }
        qa6 qa6Var3 = this.h;
        if (qa6Var3 == null) {
            qa6Var3 = new qa6();
            this.h = qa6Var3;
            qa6Var3.D = true;
            qa6Var3.t = 3.5f;
            qa6Var3.u = 0.5f;
        }
        qa6Var3.g(cmb.p1(0.1f, this.z), cmb.p1(0.3f, this.z), cmb.p1(0.3f, this.z), cmb.p1(1.25f, this.z));
        this.h.e(rectF);
        this.h.i(fArr);
        this.h.x.setStrokeWidth(gm.L(1.0f));
        this.h.setAlpha((int) (f4 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.V ? this.A : this.z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.X;
        this.Y = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void j(float f) {
        this.b0 = f;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        tm tmVar = this.t;
        if (tmVar != null) {
            tmVar.d.e(true, 1.0f);
        }
    }

    public final int l(k47 k47Var, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, ylb ylbVar) {
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        int i = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int e1 = k47Var != null ? k47Var.e1() : 0;
            if (e1 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = e1;
        }
        this.V = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z = arrayList.size() >= 2;
        this.i = z;
        if (z) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z2 = arrayList.size() >= 3;
        this.j = z2;
        if (z2) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i2 = i | (-16777216);
        this.y = i2;
        this.x = cmb.p1(0.1f, i2);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.v = j;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j != 0 && this.t == null && view != null) {
            this.t = new tm(gm.L(20.0f), 13, view, false);
            if (!(view instanceof rc2) ? view.isAttachedToWindow() : ((rc2) view).O0) {
                this.t.a();
            }
        }
        tm tmVar = this.t;
        if (tmVar != null && tmVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new tm(gm.L(20.0f), 13, view, false);
            if (!(view instanceof rc2) ? view.isAttachedToWindow() : ((rc2) view).O0) {
                this.u.a();
            }
        }
        tm tmVar2 = this.u;
        if (tmVar2 != null) {
            tmVar2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(k47 k47Var, int i, ylb ylbVar) {
        if (ylbVar != null) {
            ylbVar.a();
        } else {
            cmb.h1();
        }
        if (this.P != i) {
            int e1 = k47Var != null ? k47Var.e1() : 0;
            if (e1 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i;
            this.O = e1;
        }
        if (i < 7) {
            int v0 = cmb.v0(cmb.q8[i], ylbVar);
            this.B = v0;
            this.A = v0;
            this.z = v0;
            this.j = false;
            this.i = false;
            return;
        }
        fc7 fc7Var = oc7.r1(k47Var != null ? k47Var.K1 : z8c.t0).E3;
        ec7 d = fc7Var != null ? fc7Var.d(i) : null;
        if (d == null) {
            int v02 = cmb.v0((k47Var == null || !k47Var.O3()) ? cmb.Kd : cmb.Qb, ylbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, ylbVar);
        this.A = d.e(1, ylbVar);
        int e = d.e(2, ylbVar);
        this.B = e;
        int i2 = this.A;
        int i3 = this.z;
        this.i = i2 != i3;
        boolean z = e != i3;
        this.j = z;
        if (z) {
            this.B = i2;
            this.A = e;
        }
    }

    public final int n(ylb ylbVar) {
        View view;
        this.R = false;
        int i = cmb.p7;
        this.y = cmb.v0(i, ylbVar);
        this.z = cmb.v0(i, ylbVar);
        this.i = false;
        this.j = false;
        this.x = cmb.p1(0.1f, cmb.v0(i, ylbVar));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new tm(gm.L(20.0f), 13, view, false);
            if (!(view instanceof rc2) ? view.isAttachedToWindow() : ((rc2) view).O0) {
                this.t.a();
            }
        }
        tm tmVar = this.t;
        if (tmVar != null && tmVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void o(boolean z) {
        qa6 qa6Var;
        boolean z2 = this.W;
        if (z) {
            if (!z2 && (qa6Var = this.h) != null) {
                qa6Var.c = -1L;
                qa6Var.b = -1L;
            }
        } else if (z2) {
            this.X = 0.0f;
            qa6 qa6Var2 = this.h;
            if (qa6Var2 != null) {
                qa6Var2.a();
            }
        }
        this.W = z;
    }

    public final void p(int i, boolean z) {
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i;
        this.A = i;
        this.z = i;
        this.x = cmb.p1(z ? 0.12f : 0.1f, i);
        this.C = i;
    }
}
