// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zoc {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public vpa F;
    public ValueAnimator G;
    public boolean H;
    public final woc I;
    public final mm J;
    public final mm K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final mm Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final v41 Y;
    public vpa Z;
    public final dl1 a;
    public float a0;
    public final vnb b;
    public vpa b0;
    public float c0;
    public xoc d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final hrc k;
    public gn1 k0;
    public final b29 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public yoc m;
    public boolean m0;
    public boolean n;
    public pkb n0;
    public boolean o;
    public pkb o0;
    public float p;
    public pkb p0;
    public float q;
    public pkb q0;
    public float r;
    public boolean r0;
    public float s;
    public wk1 s0;
    public float t;
    public int t0;
    public final zk u0;
    public long v;
    public int v0;
    public final mm w0;
    public final uoc x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final guc u = new guc();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public zoc(dl1 dl1Var, vnb vnbVar) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        this.t0 = -10624001;
        this.u0 = new zk(this, (byte) 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new uoc();
        this.a = dl1Var;
        this.b = vnbVar;
        this.i = dl1Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = dl1Var.getContext();
        hrc hrcVar = hrc.H;
        if (hrcVar == null) {
            hrcVar = new hrc(context.getApplicationContext());
            hrc.H = hrcVar;
        }
        this.k = hrcVar;
        b29 b29Var = new b29(R.raw.wallet_diamond_white, hl.L(42.0f), hl.L(42.0f), false, null);
        this.l = b29Var;
        b29Var.M(dl1Var);
        b29Var.F(0);
        dl1Var.addOnAttachStateChangeListener(new vl0(this, dl1Var, (byte) 2));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(1.0f));
        byte b = 7;
        wk1 wk1Var = new wk1(dl1Var, b);
        k43 k43Var = k43.h;
        this.Q = new mm(1.0f, wk1Var, 0L, 180L, k43Var);
        this.K = new mm(new wk1(dl1Var, b), 320L, k43Var, 0);
        this.J = new mm(new wk1(dl1Var, b), 320L, k43Var, 0);
        woc wocVar = new woc(dl1Var, dl1Var);
        this.I = wocVar;
        wocVar.y = -1;
        vx4.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(hl.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, hl.L(48.0f), hl.L(48.0f), new int[]{16777215, aob.p1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-hl.L(10.0f), 0.0f, hl.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        v41 v41Var = new v41(dl1Var);
        this.Y = v41Var;
        v41Var.f = new voc(this, (byte) 0);
        this.w0 = new mm(1.0f, new wk1(dl1Var, b), 0L, 400L, k43Var);
    }

    public static int h() {
        return hl.L(206.0f);
    }

    public final void a(float f) {
        if (this.F == null) {
            vpa vpaVar = new vpa(new xk4(this.C));
            this.F = vpaVar;
            wpa wpaVar = new wpa(f);
            wpaVar.a(0.55f);
            wpaVar.b(280.0f);
            vpaVar.m = wpaVar;
            this.F.f(0.001f);
            this.F.b(new toc(this, (byte) 0));
        }
        this.F.c(f);
    }

    public final void b() {
        dl1 dl1Var = this.a;
        if (dl1Var.isShown()) {
            hl.W3(dl1Var);
        }
        vpa vpaVar = this.Z;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa(new xk4(this.a0));
        this.Z = vpaVar2;
        wpa wpaVar = new wpa(1.0f);
        wpaVar.a(0.55f);
        wpaVar.b(280.0f);
        vpaVar2.m = wpaVar;
        this.Z.f(0.001f);
        vpa vpaVar3 = this.Z;
        vpaVar3.a = -3.0f;
        vpaVar3.b(new toc(this, (byte) 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f, float f2) {
        canvas.translate(0.0f, hl.L(4.0f) * this.c0);
        v41 v41Var = this.Y;
        canvas.scale(xnb.z(this.c0, 0.012f, 1.0f, v41Var.a(0.025f) * this.a0), xnb.B(this.c0, 0.04f, 1.0f, v41Var.a(0.025f) * this.a0), (hl.L(206.0f) / 2.0f) + f, f2 + hl.L(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f;
        float f2;
        guc gucVar;
        boolean z;
        boolean z2;
        pkb pkbVar;
        RectF rectF;
        Canvas canvas2;
        xoc xocVar;
        float e;
        boolean z3;
        float f3;
        float e2;
        float f4;
        long j;
        float f5;
        yoc yocVar;
        canvas.save();
        v41 v41Var = this.Y;
        float z4 = xnb.z(this.c0, 0.012f, 1.0f, v41Var.a(0.025f) * this.a0);
        float B = xnb.B(this.c0, 0.04f, 1.0f, v41Var.a(0.025f) * this.a0);
        float L = hl.L(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float L2 = hl.L(4.0f);
        RectF rectF2 = this.f;
        rectF2.set(L2, L2, hl.L(206.0f) - L2, hl.L(140.0f) - L2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF2, edgeType);
        dl1 dl1Var = this.a;
        hrc hrcVar = this.k;
        if (quickReject) {
            f = 4.0f;
        } else {
            Handler handler = hrcVar.d;
            f = 4.0f;
            Sensor sensor = hrcVar.b;
            if (sensor != null && dl1Var.isAttachedToWindow() && dl1Var.isShown() && dl1Var.getWindowVisibility() == 0) {
                f2 = 206.0f;
                hrcVar.e.put(dl1Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!hrcVar.r) {
                    hrcVar.s = false;
                    boolean registerListener = hrcVar.a.registerListener(hrcVar, sensor, 1, handler);
                    hrcVar.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(hrcVar.G, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float L3 = hl.L(16.0f);
                float L4 = hl.L(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, L3, L4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((hl.L(10.0f) * hrcVar.E) + rectF2.centerX(), (hl.L(8.0f) * hrcVar.F) + rectF2.centerY());
                q();
                canvas.rotate((hrcVar.F * 6.0f) + (hrcVar.E * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF2.width(), rectF2.height())) / 2.0f) + hl.L(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                float e3 = this.w0.e(false, 1.0f);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                this.t0 = e3 < 1.0f ? vm2.f(e3, -10624001, -10624001) : -10624001;
                canvas.restore();
                int L5 = hl.L(42.0f);
                float centerX = rectF2.centerX();
                float f6 = L5 / 2.0f;
                int round = Math.round(centerX - f6);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float L6 = rectF2.top + hl.L(8.0f);
                int round2 = Math.round((((rectF2.centerY() - f6) - L6) * max3) + L6);
                int i = round + L5;
                int i2 = L5 + round2;
                b29 b29Var = this.l;
                b29Var.setBounds(round, round2, i, i2);
                boolean quickReject2 = canvas.quickReject(round, round2, i, i2, edgeType);
                Rect bounds = b29Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                gucVar = this.u;
                if (gucVar.q()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    gucVar.p(canvas);
                    canvas.restore();
                    dl1Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (hl.L(f2) / 2.0f)) * z4) + (hl.L(f2) / 2.0f);
                    float A = qd4.A(rect.exactCenterY(), hl.L(70.0f), B, L + hl.L(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f6);
                    this.m.setTranslationY((this.q + A) - f6);
                    this.m.setScaleX(this.C * z4);
                    this.m.setScaleY(B * this.C);
                }
                z = quickReject2 && (yocVar = this.m) != null && yocVar.n;
                if (!z) {
                    b29Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z2 = true;
                    this.H = true;
                    b29Var.O(true, 0.0f);
                    b29Var.start();
                    if (!z && !this.E) {
                        b29Var.draw(canvas);
                    }
                    pkbVar = this.n0;
                    if (pkbVar != null) {
                        float j2 = pkbVar.j();
                        float width = rectF2.width() - hl.L(16.0f);
                        float f7 = j2 > width ? width / j2 : 1.0f;
                        rectF = rectF2;
                        float h = (this.n0.h() / 2.0f) + rectF.top + hl.L(55.0f);
                        canvas.save();
                        canvas.scale(f7, f7, rectF.centerX(), h);
                        this.n0.c(rectF.centerX() - (j2 / 2.0f), h, 1.0f, -1, canvas);
                        canvas.restore();
                    } else {
                        rectF = rectF2;
                    }
                    if (this.o0 != null) {
                        float L7 = (hl.L(f2) - this.o0.j()) / 2.0f;
                        float L8 = (rectF.bottom - hl.L(7.0f)) - this.o0.h();
                        pkb pkbVar2 = this.p0;
                        if (pkbVar2 != null) {
                            pkbVar2.c((hl.L(f2) - this.p0.j()) / 2.0f, (L8 - hl.L(f)) - (this.p0.h() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(L7, L8 + hl.L(1.0f), 1.0f, 268435455, canvas);
                        this.o0.c(L7, L8, 1.0f, e3 < 1.0f ? vm2.f(e3, -16693808, -16693808) : -16693808, canvas);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                    }
                    xocVar = this.d0;
                    if (xocVar != null && !xocVar.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z2;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / 2.0f;
                        RectF rectF3 = this.g;
                        rectF3.set(rectF);
                        rectF3.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, hl.L(16.0f) - strokeWidth);
                        Path path2 = this.h;
                        path2.rewind();
                        path2.addRoundRect(rectF3, max4, max4, direction);
                        this.d0.e(rectF);
                        this.d0.draw(canvas2);
                        if (this.e0 != 0 && this.d0.c()) {
                            this.e0 = 0L;
                        }
                    }
                    ValueAnimator valueAnimator = this.j0;
                    boolean z5 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z2;
                    float f8 = (!this.h0 || this.i0 || z5) ? 0.0f : 1.0f;
                    mm mmVar = this.K;
                    e = mmVar.e(false, f8);
                    z3 = this.h0;
                    vnb vnbVar = this.b;
                    if (!z3 || this.i0 || z5) {
                        f3 = 255.0f;
                    } else {
                        boolean z6 = this.y0;
                        mm mmVar2 = this.J;
                        if (z6) {
                            f4 = 1.0f;
                            if (mmVar2.c >= 1.0f) {
                                this.U = aob.v0(aob.q7, vnbVar);
                            }
                        } else {
                            f4 = 1.0f;
                        }
                        float e4 = mmVar2.e(false, f4);
                        int f9 = e4 >= f4 ? this.U : vm2.f(e4, this.T, this.U);
                        this.V = f9;
                        woc wocVar = this.I;
                        wocVar.f(f9);
                        f3 = 255.0f;
                        wocVar.setBounds(((int) rectF.right) - hl.L(46.0f), ((int) rectF.top) - hl.L(2.0f), hl.L(2.0f) + ((int) rectF.right), hl.L(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (e < 1.0f) {
                            float exactCenterX2 = wocVar.getBounds().exactCenterX();
                            f5 = 48.0f;
                            float exactCenterY = wocVar.getBounds().exactCenterY();
                            float L9 = hl.L(48.0f) * 0.70710677f * e;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            j = 0;
                            canvas2.clipRect(exactCenterX2 - L9, exactCenterY - hl.L(48.0f), L9 + exactCenterX2, hl.L(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j = 0;
                            f5 = 48.0f;
                        }
                        wocVar.draw(canvas2);
                        if (this.U != -15352320) {
                            e4 = this.T == -15352320 ? 1.0f - e4 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (e4 > 0.0f) {
                            Rect bounds2 = wocVar.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - hl.L(f5), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint = this.X;
                            paint.setAlpha((int) (e4 * 255.0f));
                            canvas2.drawPath(path3, paint);
                            canvas2.restore();
                        }
                        if (e < 1.0f || mmVar.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                dl1Var.postInvalidateDelayed(500L);
                            }
                            long j3 = this.N;
                            if (j3 != j && elapsedRealtime >= j3) {
                                float f10 = (elapsedRealtime - j3) / 600.0f;
                                if (f10 >= 1.0f) {
                                    this.N = j;
                                } else {
                                    Rect bounds3 = wocVar.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - hl.L(f5), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float L10 = hl.L(10.0f);
                                    float f11 = -L10;
                                    canvas2.translate(bp1.g(L10, 2.0f, hl.L(f5) * 1.4142135f, f10, f11), 0.0f);
                                    canvas2.drawRect(f11, -hl.L(f5), L10, hl.L(f5), this.L);
                                    canvas2.restore();
                                    dl1Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    int i3 = 0;
                    e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                    if (this.g0 && !this.E && e < 1.0f && e2 > 0.0f) {
                        int round3 = Math.round((1.0f - e) * e2 * f3);
                        Paint paint2 = this.O;
                        paint2.setAlpha(round3);
                        float N = rectF.right - hl.N(15.5f);
                        float N2 = hl.N(15.5f) + rectF.top;
                        canvas2.drawCircle(N, N2, hl.N(5.0f), paint2);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f12 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f12, N, N2);
                        canvas2.drawLine(N, N2, N, N2 - hl.N(f), paint2);
                        canvas2.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f12, N, N2);
                        canvas2.drawLine(N, N2, hl.N(2.5f) + N, N2, paint2);
                        canvas2.restore();
                        dl1Var.postInvalidateOnAnimation();
                    }
                    if (this.q0 != null) {
                        int v0 = aob.g1(vnbVar) ? aob.v0(aob.Fa, vnbVar) : -1;
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas2.save();
                            canvas2.translate((hl.L(f2) - this.q0.j()) / 2.0f, hl.L(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                npa npaVar = (npa) obj;
                                npaVar.h(v0);
                                npaVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            this.q0.c((hl.L(f2) - this.q0.j()) / 2.0f, hl.L(143.0f), 1.0f, v0, canvas);
                        }
                    }
                    canvas.restore();
                }
                z2 = true;
                if (!z) {
                    b29Var.draw(canvas);
                }
                pkbVar = this.n0;
                if (pkbVar != null) {
                }
                if (this.o0 != null) {
                }
                xocVar = this.d0;
                if (xocVar != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z2;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / 2.0f;
                    RectF rectF32 = this.g;
                    rectF32.set(rectF);
                    rectF32.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, hl.L(16.0f) - strokeWidth2);
                    Path path22 = this.h;
                    path22.rewind();
                    path22.addRoundRect(rectF32, max42, max42, direction);
                    this.d0.e(rectF);
                    this.d0.draw(canvas2);
                    if (this.e0 != 0) {
                        this.e0 = 0L;
                    }
                }
                ValueAnimator valueAnimator2 = this.j0;
                if (valueAnimator2 != null) {
                }
                if (this.h0) {
                }
                mm mmVar3 = this.K;
                e = mmVar3.e(false, f8);
                z3 = this.h0;
                vnb vnbVar2 = this.b;
                if (z3) {
                }
                f3 = 255.0f;
                int i32 = 0;
                e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                if (this.g0) {
                    int round32 = Math.round((1.0f - e) * e2 * f3);
                    Paint paint22 = this.O;
                    paint22.setAlpha(round32);
                    float N3 = rectF.right - hl.N(15.5f);
                    float N22 = hl.N(15.5f) + rectF.top;
                    canvas2.drawCircle(N3, N22, hl.N(5.0f), paint22);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f122 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f122, N3, N22);
                    canvas2.drawLine(N3, N22, N3, N22 - hl.N(f), paint22);
                    canvas2.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f122, N3, N22);
                    canvas2.drawLine(N3, N22, hl.N(2.5f) + N3, N22, paint22);
                    canvas2.restore();
                    dl1Var.postInvalidateOnAnimation();
                }
                if (this.q0 != null) {
                }
                canvas.restore();
            }
        }
        f2 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float L32 = hl.L(16.0f);
        float L42 = hl.L(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF2, L32, L42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((hl.L(10.0f) * hrcVar.E) + rectF2.centerX(), (hl.L(8.0f) * hrcVar.F) + rectF2.centerY());
        q();
        canvas.rotate((hrcVar.F * 6.0f) + (hrcVar.E * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF2.width(), rectF2.height())) / 2.0f) + hl.L(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        float e32 = this.w0.e(false, 1.0f);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        this.t0 = e32 < 1.0f ? vm2.f(e32, -10624001, -10624001) : -10624001;
        canvas.restore();
        int L52 = hl.L(42.0f);
        float centerX2 = rectF2.centerX();
        float f62 = L52 / 2.0f;
        int round4 = Math.round(centerX2 - f62);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float L62 = rectF2.top + hl.L(8.0f);
        int round22 = Math.round((((rectF2.centerY() - f62) - L62) * max32) + L62);
        int i4 = round4 + L52;
        int i22 = L52 + round22;
        b29 b29Var2 = this.l;
        b29Var2.setBounds(round4, round22, i4, i22);
        boolean quickReject22 = canvas.quickReject(round4, round22, i4, i22, edgeType);
        Rect bounds4 = b29Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        gucVar = this.u;
        if (gucVar.q()) {
        }
        p();
        if (this.m != null) {
        }
        if (quickReject22) {
        }
        if (!z) {
        }
        z2 = true;
        if (!z) {
        }
        pkbVar = this.n0;
        if (pkbVar != null) {
        }
        if (this.o0 != null) {
        }
        xocVar = this.d0;
        if (xocVar != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        mm mmVar32 = this.K;
        e = mmVar32.e(false, f8);
        z3 = this.h0;
        vnb vnbVar22 = this.b;
        if (z3) {
        }
        f3 = 255.0f;
        int i322 = 0;
        e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
        if (this.g0) {
        }
        if (this.q0 != null) {
        }
        canvas.restore();
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        xoc xocVar = new xoc(this, this.b);
        this.d0 = xocVar;
        xocVar.g(4969977, aob.p1(0.125f, -11807239), 4969977, aob.p1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(hl.N(2.0f));
        xoc xocVar2 = this.d0;
        xocVar2.t = 2.0f;
        xocVar2.y = this.h;
        xocVar2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            this.j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            mm mmVar = this.K;
            if (mmVar.i) {
                this.M = false;
                this.N = 0L;
            }
            mmVar.e(true, 1.0f);
            this.t = 0.0f;
            ((ArrayList) this.u.b).clear();
            gn1 gn1Var = this.k0;
            this.k0 = null;
            this.a.invalidate();
            if (gn1Var != null) {
                hl.d3(gn1Var, 1L);
            }
        }
    }

    public final float g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v != 0) {
            float min = Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
            float f = this.h0 ? 1.7883515f : 0.0f;
            float f2 = -min;
            float exp = (float) Math.exp(f2 / 0.2f);
            float f3 = (min * f) + this.r;
            float f4 = this.s - f;
            this.r = (((1.0f - exp) * (0.2f * f4)) + f3) % 6.2831855f;
            this.s = (f4 * exp) + f;
            float exp2 = (float) Math.exp(f2 / 0.75f);
            float f5 = this.r;
            float f6 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f6)) + f5) % 6.2831855f;
            float f7 = f6 * exp2;
            this.t = f7;
            if (f7 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z) {
        if (z) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z;
        yoc yocVar = this.m;
        if (yocVar != null) {
            yocVar.setAlpha(z ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        dl1 dl1Var = this.a;
        if (dl1Var.getParent() != null) {
            dl1Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(k43.h);
        this.G.addUpdateListener(new gy1(this, IEEEremainder, IEEEremainder2, (byte) 7));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            dl1 dl1Var = this.a;
            if (dl1Var.getParent() != null) {
                dl1Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        vpa vpaVar = this.F;
        if (vpaVar != null) {
            vpaVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.t = 0.0f;
        this.s = 0.0f;
        this.r = 0.0f;
        ((ArrayList) this.u.b).clear();
        yoc yocVar = this.m;
        if (yocVar != null) {
            yocVar.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        vpa vpaVar = this.b0;
        if (vpaVar != null) {
            vpaVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        dl1 dl1Var = this.a;
        dl1Var.invalidate();
        if (dl1Var.getParent() instanceof View) {
            ((View) dl1Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i, boolean z2, boolean z3) {
        dl1 dl1Var = this.a;
        if (z2) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            vpa vpaVar = this.Z;
            if (vpaVar != null) {
                vpaVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            dl1Var.invalidate();
            if (dl1Var.getParent() instanceof View) {
                ((View) dl1Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z;
        this.l0 = tL_messageActionGramTransfer;
        boolean z4 = !z && z3;
        this.i0 = z4;
        mm mmVar = this.K;
        if (z4) {
            mmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z2) {
            mmVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z5 = z && i == 2;
        boolean z6 = z && i == 1;
        if (this.h0 && z && i == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.z();
            dl1Var.invalidate();
        }
        if (z6) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            mmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z5) {
            mmVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z6;
        this.S = z6 ? SystemClock.elapsedRealtime() : 0L;
        if (z6) {
            e();
            xoc xocVar = this.d0;
            xocVar.v = 0L;
            if (xocVar.d() || this.d0.c()) {
                xoc xocVar2 = this.d0;
                xocVar2.b = -1L;
                xocVar2.c = -1L;
            }
            dl1Var.invalidate();
        } else {
            xoc xocVar3 = this.d0;
            if (xocVar3 != null && this.e0 == 0 && !xocVar3.d() && !this.d0.c()) {
                this.d0.a();
                dl1Var.invalidate();
            }
        }
        int v0 = z5 ? aob.v0(aob.q7, this.b) : z ? -15352320 : -11814402;
        this.y0 = z5;
        int i2 = this.U;
        if (i2 == 0) {
            this.V = v0;
            this.U = v0;
            this.T = v0;
        } else if (v0 != i2) {
            this.T = this.V;
            this.U = v0;
            this.J.e(true, 0.0f);
            dl1Var.invalidate();
        }
        String M0 = z5 ? ob6.M0(2131742610, null) : z ? ob6.M0(2131742608, null) : ob6.M0(2131742609, null);
        woc wocVar = this.I;
        if (z6) {
            wocVar.g(10, M0, true);
        } else {
            wocVar.h(10, M0);
        }
        SpannableStringBuilder u = c.u(c.s(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) u.getSpans(0, u.length(), RelativeSizeSpan.class)) {
            u.removeSpan(relativeSizeSpan);
        }
        u.insert(0, (CharSequence) (z ? "–" : "+"));
        int indexOf = u.toString().indexOf(46);
        if (indexOf >= 0) {
            u.setSpan(new RelativeSizeSpan(0.75f), indexOf, u.length(), 33);
        }
        Object obj = new Object();
        u.setSpan(obj, 0, u.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.p("Grams", u, 2131749261));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        zk zkVar = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(zkVar), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(zkVar), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new pkb(spannableStringBuilder, 16.0f, hl.o());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f = frc.f(frc.d(str2.toUpperCase(locale)));
        pkb pkbVar = new pkb("", 9.3f, hl.n1("fonts/rmono.ttf"));
        pkbVar.l(2);
        this.o0 = pkbVar;
        pkbVar.p(f);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            pkb pkbVar2 = new pkb("", 10.0f, Typeface.create(hl.n1("fonts/rmono.ttf"), 1));
            this.p0 = pkbVar2;
            pkbVar2.p(TextUtils.ellipsize(hl.J2(str.toUpperCase(locale)), this.p0.a, hl.L(206.0f) - hl.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        pkb pkbVar3 = new pkb("", 12.0f, null);
        pkbVar3.l(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar3.a();
        pkbVar3.o(hl.L(184.0f));
        this.q0 = pkbVar3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            pkbVar3.p(pv3.m(tL_messageActionGramTransfer.comment, pkbVar3.a.getFontMetricsInt(), false, null, 0));
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        for (int i3 = 0; i3 < 25; i3++) {
            sb.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
        rmb rmbVar = new rmb();
        rmbVar.a |= 256;
        spannableStringBuilder2.setSpan(new smb(rmbVar, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.p(spannableStringBuilder2);
        npa.c(dl1Var, this.q0.b, stack, arrayList);
        n(this.e);
    }

    public final void n(boolean z) {
        this.e = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).invalidateSelf();
        }
    }

    public final void o(float f, float f2) {
        this.p = f;
        this.q = f2;
    }

    public final void p() {
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = g();
            this.B = this.k.F * 0.14f;
        }
        boolean z = true;
        boolean z2 = this.x != -1 || this.D || this.C > 1.001f;
        yoc yocVar = this.m;
        float f = this.A;
        float f2 = this.B;
        if (!z2 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z = false;
        }
        yocVar.r = f;
        yocVar.s = f2;
        yocVar.w = z;
        yocVar.x = z2;
    }

    public final void q() {
        if (!this.h0 || this.S == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.R = ((((elapsedRealtime - this.S) * 360.0f) / 4000.0f) + this.R) % 360.0f;
        this.S = elapsedRealtime;
    }
}
