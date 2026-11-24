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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class waa extends FrameLayout implements gk7 {
    public final wjb E;
    public final lm F;
    public boolean G;
    public final lm H;
    public long I;
    public mh8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public tgb N;
    public final be0 a;
    public final px8 b;
    public final jia c;
    public final wf2 d;
    public final uaa e;
    public vaa f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public waa(int i, wjb wjbVar, Context context) {
        super(context);
        this.y = y6c.t0;
        s33 s33Var = s33.h;
        this.F = new lm(this, 0L, 350L, s33Var);
        this.H = new lm(this, 0L, 350L, s33Var);
        this.L = new Paint();
        this.E = wjbVar;
        this.e = new uaa(this, wjbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(28.0f));
        byte b = 2;
        if (i == 2) {
            addView(be0Var, nme.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(be0Var, nme.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        px8 px8Var = new px8(context, b);
        this.b = px8Var;
        kk7.i(px8Var);
        zkb.X(px8Var, this.G ? bkb.B6 : bkb.i5, wjbVar);
        px8Var.setTextSize(1, 12.0f);
        px8Var.setMaxLines(2);
        px8Var.setGravity(49);
        px8Var.setLines(2);
        px8Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(px8Var, nme.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        zkb.W(jiaVar, bkb.i5, wjbVar);
        jiaVar.setTextSize(12);
        jiaVar.setMaxLines(2);
        jiaVar.setGravity(49);
        jiaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(jiaVar, nme.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.d = wf2Var;
        wf2Var.b(bkb.A5, bkb.g5, bkb.B5);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(4);
        wf2Var.setProgressDelegate(new wh9(this, (byte) 14));
        addView(wf2Var, nme.d(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i2 = bkb.h6;
        Drawable Y = bkb.Y(bkb.v0(i2, wjbVar), gl.L(2.0f), gl.L(2.0f));
        vkb M = zkb.M(i2);
        setBackground(Y);
        zkb.j(this, Y, null, M, wjbVar);
    }

    public String a() {
        return k96.M0(2131750472, null);
    }

    public final void b(boolean z, boolean z2) {
        this.d.a(z, z2);
        if (z) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j, boolean z, CharSequence charSequence) {
        uaa uaaVar = this.e;
        uaaVar.p = 1.0f;
        be0 be0Var = this.a;
        px8 px8Var = this.b;
        if (j == Long.MAX_VALUE) {
            px8Var.setText(a());
            vaa vaaVar = this.f;
            if (vaaVar == null) {
                vaa vaaVar2 = new vaa(getContext(), be0Var, true, R.drawable.large_repost_story, this.E);
                this.f = vaaVar2;
                vaaVar = vaaVar2;
            }
            be0Var.m(null, null, vaaVar, null);
        } else {
            boolean D = cf3.D(j);
            lm lmVar = this.H;
            lm lmVar2 = this.F;
            int i = this.y;
            if (D) {
                this.h = na7.q1(i).V1(Long.valueOf(j));
                TL_account.RequirementToContact I2 = na7.q1(i).I2(j);
                this.G = I2 instanceof TL_account.requirementToContactPremium;
                this.I = cf3.j(I2);
                zkb.X(px8Var, this.G ? bkb.B6 : bkb.i5, this.E);
                lmVar2.a(this.G);
                lmVar.a(this.I > 0);
                invalidate();
                uaaVar.q(this.h);
                if (this.n != 2) {
                    if (l7c.A(this.h)) {
                        px8Var.setText(k96.M0(2131746073, null));
                        uaaVar.f(12);
                        be0Var.m(null, null, uaaVar, this.h);
                    } else if (l7c.C(this.h)) {
                        px8Var.setText(k96.M0(2131745709, null));
                        uaaVar.f(1);
                        be0Var.m(null, null, uaaVar, this.h);
                    }
                    be0Var.setRoundRadius(gl.L(28.0f));
                }
                if (charSequence != null) {
                    px8Var.setText(charSequence);
                } else {
                    TLRPC.User user = this.h;
                    if (user != null) {
                        px8Var.setText(qu2.m(0, user.first_name, user.last_name));
                    } else {
                        px8Var.setText("");
                    }
                }
                be0Var.f(this.h, uaaVar);
                be0Var.setRoundRadius(gl.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                lmVar2.e(true, 0.0f);
                this.I = na7.q1(i).K1(j);
                lmVar.getClass();
                lmVar.e(true, 0.0f);
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                if (charSequence != null) {
                    px8Var.setText(charSequence);
                } else if (K0 == null) {
                    px8Var.setText("");
                } else if (K0.monoforum) {
                    px8Var.setText(mm4.j(i, K0, false));
                } else {
                    px8Var.setText(K0.title);
                }
                if (hc2.p0(K0)) {
                    mm4.o(i, K0, uaaVar, be0Var);
                } else {
                    uaaVar.p(K0);
                    be0Var.f(K0, uaaVar);
                }
                be0Var.setRoundRadius((K0 == null || !(K0.forum || K0.monoforum)) ? gl.L(28.0f) : gl.L(16.0f));
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
        jia jiaVar = this.c;
        yla ylaVar = (yla) jiaVar.getTag(R.id.spring_tag);
        if (ylaVar != null) {
            ylaVar.d();
        }
        if (z4) {
            if (z) {
                jiaVar.l(na7.q1(this.y).y1(cf3.n(tL_forumTopic.from_id), false), false);
            } else {
                jiaVar.l(mm4.k(tL_forumTopic, jiaVar.getTextPaint(), null), false);
            }
            jiaVar.requestLayout();
        }
        if (z2) {
            yla ylaVar2 = new yla(new ti4(z4 ? 0.0f : 1000.0f));
            zla zlaVar = new zla(z4 ? 1000.0f : 0.0f);
            zlaVar.b(1500.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            ylaVar2.b(new h10(this, (byte) 16));
            ylaVar2.a(new zv0(this, (byte) 11));
            jiaVar.setTag(R.id.spring_tag, ylaVar2);
            ylaVar2.h();
        } else {
            px8 px8Var = this.b;
            if (z4) {
                jiaVar.setAlpha(1.0f);
                px8Var.setAlpha(0.0f);
                jiaVar.setTranslationX(0.0f);
                px8Var.setTranslationX(gl.L(10.0f));
            } else {
                jiaVar.setAlpha(0.0f);
                px8Var.setAlpha(1.0f);
                jiaVar.setTranslationX(-gl.L(10.0f));
                px8Var.setTranslationX(0.0f);
            }
        }
        this.x = z4;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.j3) {
            TLRPC.User user = this.h;
            int i3 = this.y;
            TL_account.RequirementToContact I2 = user != null ? na7.q1(i3).I2(this.h.id) : null;
            long K1 = this.w < 0 ? na7.q1(i3).K1(this.w) : cf3.j(I2);
            boolean z = I2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z && this.I == K1) {
                return;
            }
            this.G = z;
            this.I = K1;
            zkb.X(this.b, z ? bkb.B6 : bkb.i5, this.E);
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
        wjb wjbVar;
        float f;
        float f2;
        float f3;
        boolean z;
        mh8 mh8Var;
        float f4;
        tgb tgbVar;
        boolean drawChild = super.drawChild(canvas, view, j);
        be0 be0Var = this.a;
        if (view == be0Var && this.n != 2 && (user = this.h) != null && !na7.E2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.s;
            long j3 = j2 <= 17 ? j2 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            wjb wjbVar2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (be0Var.getMeasuredWidth() / 2.0f) + be0Var.getLeft() + gl.L(18.0f);
                float measuredHeight = ((be0Var.getMeasuredHeight() / 2.0f) + be0Var.getTop()) - gl.L(20.83f);
                tgb tgbVar2 = this.N;
                if (tgbVar2 != null) {
                    f = 0.0f;
                    f3 = 5.0f;
                    long j4 = this.M;
                    f4 = measuredWidth;
                    long j5 = this.I;
                    if (j4 == j5 || j5 <= 0) {
                        f2 = 9.33f;
                        float L = tgbVar2.c + gl.L(10.0f);
                        float L2 = gl.L(14.33f);
                        RectF rectF = gl.P;
                        float f5 = L / 2.0f;
                        float f6 = f4 - f5;
                        float f7 = L2 / 2.0f;
                        rectF.set(f6, measuredHeight - f7, f4 + f5, f7 + measuredHeight);
                        rectF.inset(-gl.L(1.33f), gl.L(-1.33f));
                        int v0 = bkb.v0(bkb.g5, wjbVar2);
                        Paint paint = this.L;
                        paint.setColor(v0);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(gl.L(1.33f), gl.L(1.33f));
                        paint.setColor(bkb.v0(bkb.A5, wjbVar2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        tgbVar = this.N;
                        if (tgbVar == null) {
                            wjbVar = wjbVar2;
                            tgbVar.c(gl.L(f3) + f6, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            wjbVar = wjbVar2;
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
                sb.append(gl.o0((int) j6, 0));
                f2 = 9.33f;
                tgbVar2 = new tgb(jva.T0(sb.toString(), 0.65f, null), 9.33f, gl.o());
                this.N = tgbVar2;
                float L3 = tgbVar2.c + gl.L(10.0f);
                float L22 = gl.L(14.33f);
                RectF rectF2 = gl.P;
                float f52 = L3 / 2.0f;
                float f62 = f4 - f52;
                float f72 = L22 / 2.0f;
                rectF2.set(f62, measuredHeight - f72, f4 + f52, f72 + measuredHeight);
                rectF2.inset(-gl.L(1.33f), gl.L(-1.33f));
                int v02 = bkb.v0(bkb.g5, wjbVar2);
                Paint paint2 = this.L;
                paint2.setColor(v02);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(gl.L(1.33f), gl.L(1.33f));
                paint2.setColor(bkb.v0(bkb.A5, wjbVar2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                tgbVar = this.N;
                if (tgbVar == null) {
                }
            } else {
                wjbVar = wjbVar2;
                f = 0.0f;
                f2 = 9.33f;
                f3 = 5.0f;
            }
            float d2 = this.F.d(this.G);
            if (d2 > f) {
                int bottom = be0Var.getBottom() - gl.L(9.0f);
                int right = be0Var.getRight() - gl.L(f2);
                canvas.save();
                bkb.s0.setColor(bkb.v0(bkb.c6, wjbVar));
                float f8 = right;
                float f9 = bottom;
                canvas.drawCircle(f8, f9, gl.L(12.0f) * d2, bkb.s0);
                mh8 mh8Var2 = this.J;
                if (mh8Var2 == null) {
                    mh8Var = new mh8(bkb.Bk, bkb.Ck, -1, -1, this.E);
                    this.J = mh8Var;
                } else {
                    mh8Var = mh8Var2;
                }
                mh8Var.d(right - gl.L(10.0f), 0.0f, bottom - gl.L(10.0f), gl.L(10.0f) + right, 0.0f, gl.L(10.0f) + bottom);
                canvas.drawCircle(f8, f9, gl.L(10.0f) * d2, this.J.f);
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
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || na7.q1(i).a0.containsKey(Long.valueOf(this.h.id))) {
                        z = true;
                        if (!z || this.r != f) {
                            int bottom2 = be0Var.getBottom() - gl.L(6.0f);
                            int right2 = be0Var.getRight() - gl.L(10.0f);
                            bkb.s0.setColor(bkb.v0(bkb.c6, wjbVar));
                            float f10 = right2;
                            float f11 = bottom2;
                            float f12 = 1.0f - d2;
                            float f13 = 1.0f - d;
                            canvas.drawCircle(f10, f11, gl.L(7.0f) * this.r * f12 * f13, bkb.s0);
                            bkb.s0.setColor(bkb.v0(bkb.S8, wjbVar));
                            canvas.drawCircle(f10, f11, yjb.C(gl.L(f3), this.r, f12, f13), bkb.s0);
                            float f14 = this.r;
                            if (z) {
                                if (f14 > f) {
                                    float f15 = f14 - (j3 / 150.0f);
                                    this.r = f15;
                                    if (f15 < f) {
                                        this.r = f;
                                    }
                                    be0Var.invalidate();
                                    invalidate();
                                }
                            } else if (f14 < 1.0f) {
                                float f16 = (j3 / 150.0f) + f14;
                                this.r = f16;
                                if (f16 > 1.0f) {
                                    this.r = 1.0f;
                                }
                                be0Var.invalidate();
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
            int bottom22 = be0Var.getBottom() - gl.L(6.0f);
            int right22 = be0Var.getRight() - gl.L(10.0f);
            bkb.s0.setColor(bkb.v0(bkb.c6, wjbVar));
            float f102 = right22;
            float f112 = bottom22;
            float f122 = 1.0f - d2;
            float f132 = 1.0f - d;
            canvas.drawCircle(f102, f112, gl.L(7.0f) * this.r * f122 * f132, bkb.s0);
            bkb.s0.setColor(bkb.v0(bkb.S8, wjbVar));
            canvas.drawCircle(f102, f112, yjb.C(gl.L(f3), this.r, f122, f132), bkb.s0);
            float f142 = this.r;
            if (z) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public be0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.y).b(this, kk7.j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.y).n(this, kk7.j3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        be0 be0Var = this.a;
        int measuredWidth = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
        int measuredHeight = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
        bkb.n0.setColor(bkb.v0(bkb.A5, this.E));
        bkb.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = gl.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = gl.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, be0Var.getRoundRadius()[0], be0Var.getRoundRadius()[0], bkb.n0);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
