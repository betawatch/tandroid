// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class wca extends FrameLayout implements jm7 {
    public final ylb E;
    public final ln F;
    public boolean G;
    public final ln H;
    public long I;
    public nj8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public uib N;
    public final bf0 a;
    public final qz8 b;
    public final lka c;
    public final jh2 d;
    public final uca e;
    public vca f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public wca(int i, ylb ylbVar, Context context) {
        super(context);
        this.y = z8c.t0;
        d53 d53Var = d53.h;
        this.F = new ln(this, 0L, 350L, d53Var);
        this.H = new ln(this, 0L, 350L, d53Var);
        this.L = new Paint();
        this.E = ylbVar;
        this.e = new uca(this, ylbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(28.0f));
        byte b = 2;
        if (i == 2) {
            addView(bf0Var, qoe.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(bf0Var, qoe.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        qz8 qz8Var = new qz8(context, b);
        this.b = qz8Var;
        nm7.i(qz8Var);
        anb.X(qz8Var, this.G ? cmb.B6 : cmb.i5, ylbVar);
        qz8Var.setTextSize(1, 12.0f);
        qz8Var.setMaxLines(2);
        qz8Var.setGravity(49);
        qz8Var.setLines(2);
        qz8Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(qz8Var, qoe.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setTextSize(12);
        lkaVar.setMaxLines(2);
        lkaVar.setGravity(49);
        lkaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(lkaVar, qoe.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.d = jh2Var;
        jh2Var.b(cmb.A5, cmb.g5, cmb.B5);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(4);
        jh2Var.setProgressDelegate(new yf9(this, (byte) 18));
        addView(jh2Var, qoe.d(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i2 = cmb.h6;
        Drawable Y = cmb.Y(cmb.v0(i2, ylbVar), gm.L(2.0f), gm.L(2.0f));
        wmb M = anb.M(i2);
        setBackground(Y);
        anb.j(this, Y, null, M, ylbVar);
    }

    public String a() {
        return jb6.M0(2131750421, null);
    }

    public final void b(boolean z, boolean z2) {
        this.d.a(z, z2);
        if (z) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j, boolean z, CharSequence charSequence) {
        uca ucaVar = this.e;
        ucaVar.p = 1.0f;
        bf0 bf0Var = this.a;
        qz8 qz8Var = this.b;
        if (j == Long.MAX_VALUE) {
            qz8Var.setText(a());
            vca vcaVar = this.f;
            if (vcaVar == null) {
                vca vcaVar2 = new vca(getContext(), bf0Var, true, R.drawable.large_repost_story, this.E);
                this.f = vcaVar2;
                vcaVar = vcaVar2;
            }
            bf0Var.m(null, null, vcaVar, null);
        } else {
            boolean D = pg3.D(j);
            ln lnVar = this.H;
            ln lnVar2 = this.F;
            int i = this.y;
            if (D) {
                this.h = oc7.r1(i).W1(Long.valueOf(j));
                TL_account.RequirementToContact L2 = oc7.r1(i).L2(j);
                this.G = L2 instanceof TL_account.requirementToContactPremium;
                this.I = pg3.j(L2);
                anb.X(qz8Var, this.G ? cmb.B6 : cmb.i5, this.E);
                lnVar2.a(this.G);
                lnVar.a(this.I > 0);
                invalidate();
                ucaVar.q(this.h);
                if (this.n != 2) {
                    if (m9c.B(this.h)) {
                        qz8Var.setText(jb6.M0(2131745999, null));
                        ucaVar.f(12);
                        bf0Var.m(null, null, ucaVar, this.h);
                    } else if (m9c.D(this.h)) {
                        qz8Var.setText(jb6.M0(2131745635, null));
                        ucaVar.f(1);
                        bf0Var.m(null, null, ucaVar, this.h);
                    }
                    bf0Var.setRoundRadius(gm.L(28.0f));
                }
                if (charSequence != null) {
                    qz8Var.setText(charSequence);
                } else {
                    TLRPC.User user = this.h;
                    if (user != null) {
                        qz8Var.setText(bw2.m(0, user.first_name, user.last_name));
                    } else {
                        qz8Var.setText("");
                    }
                }
                bf0Var.f(this.h, ucaVar);
                bf0Var.setRoundRadius(gm.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                lnVar2.e(true, 0.0f);
                this.I = oc7.r1(i).L1(j);
                lnVar.getClass();
                lnVar.e(true, 0.0f);
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (charSequence != null) {
                    qz8Var.setText(charSequence);
                } else if (L0 == null) {
                    qz8Var.setText("");
                } else if (L0.monoforum) {
                    qz8Var.setText(no4.j(i, L0, false));
                } else {
                    qz8Var.setText(L0.title);
                }
                if (sd2.p0(L0)) {
                    no4.o(i, L0, ucaVar, bf0Var);
                } else {
                    ucaVar.p(L0);
                    bf0Var.f(L0, ucaVar);
                }
                bf0Var.setRoundRadius((L0 == null || !(L0.forum || L0.monoforum)) ? gm.L(28.0f) : gm.L(16.0f));
            }
        }
        this.w = j;
        this.d.a(z, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
        boolean z3 = this.x;
        boolean z4 = tL_forumTopic != null;
        if (z3 == z4 && z2) {
            return;
        }
        lka lkaVar = this.c;
        zna znaVar = (zna) lkaVar.getTag(R.id.spring_tag);
        if (znaVar != null) {
            znaVar.d();
        }
        if (z4) {
            if (z) {
                lkaVar.l(oc7.r1(this.y).z1(pg3.n(tL_forumTopic.from_id), false), false);
            } else {
                lkaVar.l(no4.k(tL_forumTopic, lkaVar.getTextPaint(), null), false);
            }
            lkaVar.requestLayout();
        }
        if (z2) {
            zna znaVar2 = new zna(new xk4(z4 ? 0.0f : 1000.0f));
            aoa aoaVar = new aoa(z4 ? 1000.0f : 0.0f);
            aoaVar.b(1500.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            znaVar2.b(new h20(this, (byte) 16));
            znaVar2.a(new hx0(this, (byte) 11));
            lkaVar.setTag(R.id.spring_tag, znaVar2);
            znaVar2.h();
        } else {
            qz8 qz8Var = this.b;
            if (z4) {
                lkaVar.setAlpha(1.0f);
                qz8Var.setAlpha(0.0f);
                lkaVar.setTranslationX(0.0f);
                qz8Var.setTranslationX(gm.L(10.0f));
            } else {
                lkaVar.setAlpha(0.0f);
                qz8Var.setAlpha(1.0f);
                lkaVar.setTranslationX(-gm.L(10.0f));
                qz8Var.setTranslationX(0.0f);
            }
        }
        this.x = z4;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.k3) {
            TLRPC.User user = this.h;
            int i3 = this.y;
            TL_account.RequirementToContact L2 = user != null ? oc7.r1(i3).L2(this.h.id) : null;
            long L1 = this.w < 0 ? oc7.r1(i3).L1(this.w) : pg3.j(L2);
            boolean z = L2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z && this.I == L1) {
                return;
            }
            this.G = z;
            this.I = L1;
            anb.X(this.b, z ? cmb.B6 : cmb.i5, this.E);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC.User user;
        ylb ylbVar;
        float f;
        float f2;
        float f3;
        boolean z;
        nj8 nj8Var;
        float f4;
        uib uibVar;
        boolean drawChild = super.drawChild(canvas, view, j);
        bf0 bf0Var = this.a;
        if (view == bf0Var && this.n != 2 && (user = this.h) != null && !oc7.G2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.s;
            long j3 = j2 <= 17 ? j2 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            ylb ylbVar2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (bf0Var.getMeasuredWidth() / 2.0f) + bf0Var.getLeft() + gm.L(18.0f);
                float measuredHeight = ((bf0Var.getMeasuredHeight() / 2.0f) + bf0Var.getTop()) - gm.L(20.83f);
                uib uibVar2 = this.N;
                if (uibVar2 != null) {
                    f = 0.0f;
                    f3 = 5.0f;
                    long j4 = this.M;
                    f4 = measuredWidth;
                    long j5 = this.I;
                    if (j4 == j5 || j5 <= 0) {
                        f2 = 9.33f;
                        float L = uibVar2.c + gm.L(10.0f);
                        float L2 = gm.L(14.33f);
                        RectF rectF = gm.P;
                        float f5 = L / 2.0f;
                        float f6 = f4 - f5;
                        float f7 = L2 / 2.0f;
                        rectF.set(f6, measuredHeight - f7, f4 + f5, f7 + measuredHeight);
                        rectF.inset(-gm.L(1.33f), gm.L(-1.33f));
                        int v0 = cmb.v0(cmb.g5, ylbVar2);
                        Paint paint = this.L;
                        paint.setColor(v0);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(gm.L(1.33f), gm.L(1.33f));
                        paint.setColor(cmb.v0(cmb.A5, ylbVar2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        uibVar = this.N;
                        if (uibVar == null) {
                            ylbVar = ylbVar2;
                            uibVar.c(gm.L(f3) + f6, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            ylbVar = ylbVar2;
                        }
                    }
                } else {
                    f4 = measuredWidth;
                    f = 0.0f;
                    f3 = 5.0f;
                }
                StringBuilder sb = new StringBuilder("⭐️");
                long j6 = this.I;
                this.M = j6;
                sb.append(gm.o0((int) j6, 0));
                f2 = 9.33f;
                uibVar2 = new uib(nxa.U0(sb.toString(), 0.65f, null), 9.33f, gm.o());
                this.N = uibVar2;
                float L3 = uibVar2.c + gm.L(10.0f);
                float L22 = gm.L(14.33f);
                RectF rectF2 = gm.P;
                float f52 = L3 / 2.0f;
                float f62 = f4 - f52;
                float f72 = L22 / 2.0f;
                rectF2.set(f62, measuredHeight - f72, f4 + f52, f72 + measuredHeight);
                rectF2.inset(-gm.L(1.33f), gm.L(-1.33f));
                int v02 = cmb.v0(cmb.g5, ylbVar2);
                Paint paint2 = this.L;
                paint2.setColor(v02);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(gm.L(1.33f), gm.L(1.33f));
                paint2.setColor(cmb.v0(cmb.A5, ylbVar2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                uibVar = this.N;
                if (uibVar == null) {
                }
            } else {
                ylbVar = ylbVar2;
                f = 0.0f;
                f2 = 9.33f;
                f3 = 5.0f;
            }
            float d2 = this.F.d(this.G);
            if (d2 > f) {
                int bottom = bf0Var.getBottom() - gm.L(9.0f);
                int right = bf0Var.getRight() - gm.L(f2);
                canvas.save();
                cmb.s0.setColor(cmb.v0(cmb.c6, ylbVar));
                float f8 = right;
                float f9 = bottom;
                canvas.drawCircle(f8, f9, gm.L(12.0f) * d2, cmb.s0);
                nj8 nj8Var2 = this.J;
                if (nj8Var2 == null) {
                    nj8Var = new nj8(cmb.Bk, cmb.Ck, -1, -1, this.E);
                    this.J = nj8Var;
                } else {
                    nj8Var = nj8Var2;
                }
                nj8Var.d(right - gm.L(10.0f), 0.0f, bottom - gm.L(10.0f), gm.L(10.0f) + right, 0.0f, gm.L(10.0f) + bottom);
                canvas.drawCircle(f8, f9, gm.L(10.0f) * d2, this.J.f);
                if (this.K == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.K = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.K.setBounds((int) (f8 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d2)), (int) (f9 - (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f) * d2)), (int) (((this.K.getIntrinsicWidth() / 2.0f) * 0.875f * d2) + f8), (int) (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f * d2) + f9));
                this.K.setAlpha((int) (255.0f * d2));
                this.K.draw(canvas);
                canvas.restore();
            }
            if (!this.G) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || oc7.r1(i).a0.containsKey(Long.valueOf(this.h.id))) {
                        z = true;
                        if (!z || this.r != f) {
                            int bottom2 = bf0Var.getBottom() - gm.L(6.0f);
                            int right2 = bf0Var.getRight() - gm.L(10.0f);
                            cmb.s0.setColor(cmb.v0(cmb.c6, ylbVar));
                            float f10 = right2;
                            float f11 = bottom2;
                            float f12 = 1.0f - d2;
                            float f13 = 1.0f - d;
                            canvas.drawCircle(f10, f11, gm.L(7.0f) * this.r * f12 * f13, cmb.s0);
                            cmb.s0.setColor(cmb.v0(cmb.S8, ylbVar));
                            canvas.drawCircle(f10, f11, mlb.C(gm.L(f3), this.r, f12, f13), cmb.s0);
                            float f14 = this.r;
                            if (z) {
                                if (f14 > f) {
                                    float f15 = f14 - (j3 / 150.0f);
                                    this.r = f15;
                                    if (f15 < f) {
                                        this.r = f;
                                    }
                                    bf0Var.invalidate();
                                    invalidate();
                                }
                            } else if (f14 < 1.0f) {
                                float f16 = (j3 / 150.0f) + f14;
                                this.r = f16;
                                if (f16 > 1.0f) {
                                    this.r = 1.0f;
                                }
                                bf0Var.invalidate();
                                invalidate();
                                return drawChild;
                            }
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
            int bottom22 = bf0Var.getBottom() - gm.L(6.0f);
            int right22 = bf0Var.getRight() - gm.L(10.0f);
            cmb.s0.setColor(cmb.v0(cmb.c6, ylbVar));
            float f102 = right22;
            float f112 = bottom22;
            float f122 = 1.0f - d2;
            float f132 = 1.0f - d;
            canvas.drawCircle(f102, f112, gm.L(7.0f) * this.r * f122 * f132, cmb.s0);
            cmb.s0.setColor(cmb.v0(cmb.S8, ylbVar));
            canvas.drawCircle(f102, f112, mlb.C(gm.L(f3), this.r, f122, f132), cmb.s0);
            float f142 = this.r;
            if (z) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public bf0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.y).b(this, nm7.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.y).n(this, nm7.k3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bf0 bf0Var = this.a;
        int measuredWidth = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
        int measuredHeight = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
        cmb.n0.setColor(cmb.v0(cmb.A5, this.E));
        cmb.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = gm.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = gm.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, bf0Var.getRoundRadius()[0], bf0Var.getRoundRadius()[0], cmb.n0);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
