// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class z82 extends FrameLayout implements g94, jm7, vlb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final sqb G;
    public final yv1 H;
    public final e0b[] I;
    public final pc0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public e0b O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final fn0 a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final byte d;
    public final fha d0;
    public final v82 e;
    public final ylb e0;
    public final boolean f;
    public boolean f0;
    public final tm g0;
    public final mt1 h;
    public final tm h0;
    public final u51 i0;
    public final r82 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final mt1 r;
    public String r0;
    public final io s;
    public Drawable s0;
    public Drawable t0;
    public Drawable u0;
    public boolean v0;
    public final AtomicReference w;
    public PorterDuffColorFilter w0;
    public final ImageView x;
    public PorterDuffColorFilter x0;
    public final ImageView y;
    public int y0;
    public int z0;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0104, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cd, code lost:
    
        if (r0.v4 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f6, code lost:
    
        if (r3.v4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033e A[EDGE_INSN: B:65:0x033e->B:73:0x033e BREAK  A[LOOP:0: B:56:0x032c->B:62:0x0338], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z82(Context context, d dVar, boolean z, ylb ylbVar) {
        super(context);
        boolean z2;
        int i;
        int i2;
        ?? r7;
        TLRPC.Chat chat;
        int i3;
        e0b[] e0bVarArr;
        int i4;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 320L, false);
        this.d = (byte) 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.w = atomicReference2;
        e0b[] e0bVarArr2 = new e0b[6];
        this.I = e0bVarArr2;
        this.J = new pc0((ylb) null);
        this.K = z8c.t0;
        this.L = true;
        this.M = gm.L(8.0f);
        this.N = 0;
        this.P = -1;
        this.Q = -1;
        this.S = new boolean[1];
        this.T = new boolean[1];
        this.V = -1;
        this.b0 = -1;
        this.f0 = false;
        this.i0 = new u51(this);
        this.j0 = new r82(this, (byte) 2);
        this.o0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.e0 = ylbVar;
        boolean z3 = dVar instanceof yv1;
        if (z3) {
            this.H = (yv1) dVar;
        }
        yv1 yv1Var = this.H;
        boolean z4 = yv1Var != null && ((i4 = yv1Var.g4) == 0 || i4 == 8) && !m9c.B(yv1Var.h()) && (this.H.h() == null || this.H.h().id != 489000);
        v82 v82Var = new v82(this, context, dVar, z4, ylbVar);
        this.e = v82Var;
        if (z3 || (dVar instanceof sxb)) {
            yv1 yv1Var2 = this.H;
            if (yv1Var2 == null || ((i = yv1Var2.g4) != 5 && i != 9 && i != 6 && i != 8 && !m9c.w(yv1Var2.f))) {
                this.d0 = new fha(dVar);
            }
            yv1 yv1Var3 = this.H;
            if (yv1Var3 != null) {
                if (yv1Var3.j8()) {
                    yv1 yv1Var4 = this.H;
                    if (yv1Var4.m4 != null) {
                    }
                    z2 = true;
                    this.f = z2;
                    if (z2) {
                        v82Var.setVisibility(8);
                    }
                }
                int i5 = this.H.g4;
                if (i5 != 2) {
                    if (i5 != 5) {
                        if (i5 != 9) {
                        }
                    }
                }
                z2 = true;
                this.f = z2;
                if (z2) {
                }
            }
            z2 = false;
            this.f = z2;
            if (z2) {
            }
        }
        v82Var.setContentDescription(jb6.M0(2131754797, null));
        v82Var.setRoundRadius(gm.L(21.0f));
        addView(v82Var);
        if (z4) {
            yv1 yv1Var5 = this.H;
            TLRPC.Chat chat2 = yv1Var5 != null ? yv1Var5.e : null;
            if (chat2 != null && chat2.linked_community_id != 0) {
                rve.b(v82Var, 0.05f, 1.2f);
            }
            final byte b = 0;
            v82Var.setOnClickListener(new View.OnClickListener(this) { // from class: t82
                public final /* synthetic */ z82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    z82 z82Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!z82Var.d()) {
                                z82Var.e(true, false);
                                break;
                            }
                            break;
                        default:
                            z82Var.e(false, false);
                            break;
                    }
                }
            });
        }
        mt1 mt1Var = new mt1(context, atomicReference);
        this.h = mt1Var;
        mt1Var.setEllipsizeByGradient(true);
        anb.W(mt1Var, cmb.z8, ylbVar);
        mt1Var.setTextSize(18);
        mt1Var.setGravity(3);
        mt1Var.setTypeface(gm.o());
        mt1Var.setLeftDrawableTopPadding(-gm.L(1.3f));
        mt1Var.setCanHideRightDrawable(false);
        mt1Var.setRightDrawableOutside(true);
        mt1Var.setPadding(0, gm.L(6.0f), 0, gm.L(12.0f));
        addView(mt1Var);
        if (o()) {
            io ioVar = new io(context, true, true, true);
            this.s = ioVar;
            ioVar.b(0.3f, 320L, d53Var);
            ioVar.setEllipsizeByGradient(true);
            int i6 = cmb.A8;
            anb.U(ioVar, i6, ylbVar);
            ioVar.setTag(Integer.valueOf(i6));
            ioVar.setTextSize(gm.L(14.0f));
            ioVar.setGravity(3);
            ioVar.setPadding(0, 0, gm.L(10.0f), 0);
            ioVar.setTranslationY(-gm.L(1.0f));
            addView(ioVar);
        } else {
            mt1 mt1Var2 = new mt1(context, atomicReference2);
            this.r = mt1Var2;
            mt1Var2.setEllipsizeByGradient(true);
            int i7 = cmb.A8;
            anb.W(mt1Var2, i7, ylbVar);
            mt1Var2.setTag(Integer.valueOf(i7));
            mt1Var2.setTextSize(14);
            mt1Var2.setGravity(3);
            mt1Var2.setPadding(0, 0, gm.L(10.0f), 0);
            addView(mt1Var2);
        }
        if (this.H != null) {
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new sl0());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.x = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            sqb sqbVar = new sqb(context, ylbVar);
            this.G = sqbVar;
            imageView2.setImageDrawable(sqbVar);
            sqbVar.k = true;
            sqbVar.b.setColor(0);
            addView(imageView2);
            this.U = z;
            imageView2.setOnClickListener(new rc1((Object) this, (Object) ylbVar, (byte) 12));
            if (z) {
                imageView2.setContentDescription(jb6.M0(2131745243, null));
            } else {
                imageView2.setContentDescription(jb6.M0(2131754925, null));
            }
            ImageView imageView3 = new ImageView(context);
            this.E = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            anb.s(imageView3, cmb.r8, ylbVar, PorterDuff.Mode.SRC_IN);
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.F = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        yv1 yv1Var6 = this.H;
        if (yv1Var6 != null && ((i2 = yv1Var6.g4) == 0 || i2 == 8 || i2 == 3)) {
            if (yv1Var6.j8()) {
                yv1 yv1Var7 = this.H;
                if (!yv1Var7.x4) {
                }
            }
            if (!m9c.B(this.H.h()) && (this.H.h() == null || this.H.h().id != 489000)) {
                r7 = 1;
                final char c = 1 == true ? 1 : 0;
                setOnClickListener(new View.OnClickListener(this) { // from class: t82
                    public final /* synthetic */ z82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = c;
                        z82 z82Var = this.b;
                        switch (b2) {
                            case 0:
                                if (!z82Var.d()) {
                                    z82Var.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                z82Var.e(false, false);
                                break;
                        }
                    }
                });
                chat = this.H.e;
                e0bVarArr2[0] = new a6c(r7);
                e0bVarArr2[r7] = new di2(r7);
                e0bVarArr2[2] = new o6a(r7);
                e0bVarArr2[3] = new df8(ylbVar, false);
                e0bVarArr2[4] = new ql9(r7);
                e0bVarArr2[5] = new di2();
                i3 = 0;
                while (true) {
                    e0bVarArr = this.I;
                    if (i3 < e0bVarArr.length) {
                        break;
                    }
                    e0bVarArr[i3].c(chat != null ? r7 : false);
                    i3++;
                }
            }
            r7 = 1;
            chat = this.H.e;
            e0bVarArr2[0] = new a6c(r7);
            e0bVarArr2[r7] = new di2(r7);
            e0bVarArr2[2] = new o6a(r7);
            e0bVarArr2[3] = new df8(ylbVar, false);
            e0bVarArr2[4] = new ql9(r7);
            e0bVarArr2[5] = new di2();
            i3 = 0;
            while (true) {
                e0bVarArr = this.I;
                if (i3 < e0bVarArr.length) {
                }
                e0bVarArr[i3].c(chat != null ? r7 : false);
                i3++;
            }
        }
        this.g0 = new tm(gm.L(24.0f), this.h);
        this.h0 = new tm(gm.L(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z) {
        yv1 yv1Var = this.H;
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            int i = 0;
            e0b[] e0bVarArr = this.I;
            if (!z) {
                this.O = null;
                mt1Var.setLeftDrawable((Drawable) null);
                mt1Var.g(null, null);
                while (i < e0bVarArr.length) {
                    e0b e0bVar = e0bVarArr[i];
                    if (e0bVar != null) {
                        e0bVar.e();
                    }
                    i++;
                }
                return;
            }
            try {
                int intValue = oc7.r1(this.K).C1(yv1Var.a(), yv1Var.s4).intValue();
                e0b e0bVar2 = e0bVarArr[intValue];
                if (e0bVar2 != null) {
                    ylb ylbVar = this.e0;
                    if (intValue == 5) {
                        mt1Var.g(e0bVar2, "**oo**");
                        e0bVarArr[intValue].b(cmb.v0(cmb.oa, ylbVar));
                        mt1Var.setLeftDrawable((Drawable) null);
                    } else {
                        mt1Var.g(null, null);
                        e0bVarArr[intValue].b(cmb.v0(cmb.oa, ylbVar));
                        mt1Var.setLeftDrawable(e0bVarArr[intValue]);
                    }
                    this.O = e0bVarArr[intValue];
                    while (i < e0bVarArr.length) {
                        e0b e0bVar3 = e0bVarArr[i];
                        if (e0bVar3 != null) {
                            if (i == intValue) {
                                e0bVar3.d();
                            } else {
                                e0bVar3.e();
                            }
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        ImageView imageView;
        if (i != 0 || (imageView = this.x) == null) {
            return;
        }
        imageView.setAlpha(f);
        float f3 = 0.85f * f;
        imageView.setScaleX(f3);
        imageView.setScaleY(f3);
        imageView.setVisibility(f > 0.0f ? 0 : 8);
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            TLRPC.User h = yv1Var.h();
            TLRPC.Chat chat = yv1Var.e;
            if (yv1Var.g4 == 3) {
                long f7 = yv1Var.f7();
                if (f7 >= 0) {
                    user = yv1Var.getMessagesController().W1(Long.valueOf(f7));
                    chat = null;
                } else {
                    chat = yv1Var.getMessagesController().L0(Long.valueOf(-f7));
                    user = null;
                }
            } else {
                user = h;
            }
            pc0 pc0Var = this.J;
            v82 v82Var = this.e;
            if (user == null) {
                if (!sd2.p0(chat)) {
                    if (chat != null) {
                        pc0Var.p = 1.0f;
                        pc0Var.p(chat);
                        if (v82Var != null) {
                            v82Var.setAnimatedEmojiDrawable(null);
                            v82Var.f(chat, pc0Var);
                            if (chat.forum) {
                                L = gm.L(oc7.r1(z8c.t0).N1().J(-chat.id) ? 11.0f : 16.0f);
                            } else {
                                L = gm.L(21.0f);
                            }
                            v82Var.setRoundRadius(L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                long d = yv1Var.d();
                int i = this.K;
                if (!sd2.A(i, chat, 24) || d == 0) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    no4.o(i, chat, pc0Var, v82Var);
                } else if (d > 0) {
                    TLRPC.User W1 = yv1Var.getMessagesController().W1(Long.valueOf(d));
                    pc0Var.q(W1);
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.f(W1, pc0Var);
                } else {
                    TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-d));
                    pc0Var.p(L0);
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.f(L0, pc0Var);
                }
                v82Var.setRoundRadius(gm.L(21.0f));
                return;
            }
            pc0Var.q(user);
            if (m9c.B(user)) {
                pc0Var.p = 0.8f;
                pc0Var.f(12);
                if (v82Var != null) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.m(null, null, pc0Var, user);
                    return;
                }
                return;
            }
            if (m9c.u(user)) {
                pc0Var.p = 0.8f;
                pc0Var.f(21);
                if (v82Var != null) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.m(null, null, pc0Var, user);
                    return;
                }
                return;
            }
            if (m9c.D(user) && yv1Var.g4 == 3) {
                pc0Var.p = 0.8f;
                pc0Var.f(22);
                if (v82Var != null) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.m(null, null, pc0Var, user);
                    return;
                }
                return;
            }
            if (!m9c.D(user)) {
                pc0Var.p = 1.0f;
                if (v82Var != null) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.a.V(user, pc0Var, null, true, 3, false);
                    return;
                }
                return;
            }
            pc0Var.p = 0.8f;
            pc0Var.f(1);
            if (v82Var != null) {
                v82Var.setAnimatedEmojiDrawable(null);
                v82Var.m(null, null, pc0Var, user);
            }
        }
    }

    public final tm c(long j) {
        if (j == 0) {
            return null;
        }
        tm tmVar = this.h0;
        tmVar.j(j, false);
        tmVar.k(Integer.valueOf(cmb.v0(cmb.pi, this.e0)));
        int L = gm.L(1.0f);
        tmVar.J = 0;
        tmVar.K = L;
        return tmVar;
    }

    public boolean d() {
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
                return;
            }
            return;
        }
        if (i != nm7.m4) {
            if (i == nm7.i3) {
                n(true);
            }
        } else {
            mt1 mt1Var = this.h;
            if (mt1Var != null) {
                mt1Var.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a = this.i0.a(0.02f);
        canvas.scale(a, a, getPivotX(), getHeight() - (a.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.e) {
            boolean z = false;
            ImageView imageView = this.x;
            boolean z2 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z = true;
            }
            if (z2 || z) {
                RectF rectF = gm.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-gm.L(3.0f), -gm.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z2) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - gm.N(0.33f), imageView.getScaleX() * gm.N(12.0f), cmb.Fm);
                }
                if (z) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * gm.N(7.66f), cmb.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2.getImageReceiver().E() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z, boolean z2) {
        boolean z3;
        yv1 yv1Var;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String str;
        fn5 z4;
        long j;
        r02 r02Var;
        Drawable t;
        TLRPC.User W1;
        v82 v82Var = this.e;
        if (z) {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x <= point.y) {
                }
            }
            z3 = false;
            yv1Var = this.H;
            TLRPC.User h = yv1Var.h();
            chat = yv1Var.e;
            boolean z5 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = yv1Var.getMessagesController().L0(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (yv1Var.k7() != 0 && (W1 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.k7()))) != null) {
                    chat = null;
                    h = W1;
                }
            }
            imageReceiver = v82Var.getImageReceiver();
            str = imageReceiver.R;
            z4 = fn5.z();
            if (str != null && !z4.F(str, false)) {
                t = imageReceiver.t();
                if ((t instanceof BitmapDrawable) && !(t instanceof kn)) {
                    z4.K((BitmapDrawable) t, str, false);
                }
            }
            if (!yv1Var.v4) {
                if (chat != null) {
                    yv1Var.presentFragment(ProfileActivity.S2(-chat.id), z2);
                    return;
                }
                return;
            }
            fha fhaVar = this.d0;
            if (h == null) {
                boolean z6 = z3;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (yv1Var.g4 == 3) {
                        bundle.putLong("topic_id", yv1Var.f7());
                    } else if (yv1Var.x4) {
                        bundle.putLong("topic_id", yv1Var.m4.e1());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, fhaVar);
                    if (!z5) {
                        profileActivity.u3(yv1Var.r8);
                    }
                    profileActivity.B3(z6 ? 2 : 1);
                    yv1Var.presentFragment(profileActivity, z2);
                    return;
                }
                return;
            }
            if (h.id != 489000) {
                Bundle bundle2 = new Bundle();
                if (m9c.D(h)) {
                    d dVar = fhaVar.x;
                    int[] iArr = fhaVar.c;
                    int i = 0;
                    while (true) {
                        if (i < iArr.length) {
                            if (iArr[i] > 0) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!fhaVar.f && (dVar == null || fhaVar.r != dVar.getUserConfig().e() || fhaVar.s != 0 || !dVar.getMessagesController().E1().e())) {
                            return;
                        }
                    }
                    bundle2.putLong("dialog_id", yv1Var.a());
                    if (yv1Var.g4 == 3) {
                        bundle2.putLong("topic_id", yv1Var.f7());
                    }
                    cm6 cm6Var = new cm6(bundle2, fhaVar);
                    cm6Var.c = yv1Var.r8;
                    yv1Var.presentFragment(cm6Var, z2);
                    return;
                }
                if (yv1Var.g4 != 0 || z5 || m9c.w(h)) {
                    j = 0;
                } else {
                    j = 0;
                    rs0 f0 = rs0.f0(yv1Var.getCurrentAccount(), h.id);
                    if (f0 != null) {
                        yv1Var.presentFragment(f0, z2);
                        return;
                    }
                }
                boolean z7 = z3;
                if (yv1Var.g4 == 3) {
                    long f7 = yv1Var.f7();
                    bundle2.putBoolean("saved", true);
                    if (f7 >= j) {
                        bundle2.putLong("user_id", f7);
                    } else {
                        bundle2.putLong("chat_id", -f7);
                    }
                } else {
                    bundle2.putLong("user_id", h.id);
                    if (this.x != null && !z5) {
                        bundle2.putLong("dialog_id", yv1Var.a());
                    }
                }
                if (m9c.w(h)) {
                    bundle2.putLong("topic_id", yv1Var.d());
                }
                k7 k7Var = yv1Var.Z1;
                bundle2.putBoolean("reportSpam", (k7Var == null || (r02Var = yv1Var.b1) == null || !r02Var.d(k7Var) || yv1Var.c2.getVisibility() == 8) ? false : true);
                bundle2.putInt("actionBarColor", cmb.v0(cmb.r8, this.e0));
                ProfileActivity profileActivity2 = new ProfileActivity(bundle2, fhaVar);
                if (!z5) {
                    profileActivity2.C3(yv1Var.s8, yv1Var.t8, yv1Var.u8);
                }
                profileActivity2.B3(z7 ? 2 : 1);
                yv1Var.presentFragment(profileActivity2, z2);
                return;
            }
            return;
        }
        z3 = z;
        yv1Var = this.H;
        TLRPC.User h2 = yv1Var.h();
        chat = yv1Var.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = yv1Var.getMessagesController().L0(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = v82Var.getImageReceiver();
        str = imageReceiver.R;
        z4 = fn5.z();
        if (str != null) {
            t = imageReceiver.t();
            if (t instanceof BitmapDrawable) {
                z4.K((BitmapDrawable) t, str, false);
            }
        }
        if (!yv1Var.v4) {
        }
    }

    public final void g(int i, boolean z) {
        sqb sqbVar = this.G;
        if (sqbVar != null) {
            boolean z2 = this.n0;
            if (i != 0 || this.U) {
                fn0 fn0Var = this.a;
                if (z2) {
                    fn0Var.a(false, z);
                } else {
                    fn0Var.a(true, z);
                    sqbVar.b(i);
                }
            }
        }
    }

    public bf0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public fha getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        mt1 mt1Var = this.r;
        return mt1Var != null ? mt1Var.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            return mt1Var;
        }
        io ioVar = this.s;
        if (ioVar != null) {
            return ioVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public lka getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        mt1 mt1Var = this.h;
        float max = mt1Var != null ? Math.max(0.0f, mt1Var.getExactWidthIncludeDrawables()) : 0.0f;
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            max = Math.max(max, mt1Var2.getExactWidthIncludeDrawables());
        }
        v82 v82Var = this.e;
        return (int) (max + ((v82Var == null || v82Var.getVisibility() != 0) ? gm.L(34.0f) : gm.L(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = gw3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (z || z2) {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof hs9)) {
                hs9 hs9Var = new hs9(!z ? 1 : 0);
                hs9Var.b(cmb.v0(cmb.A8, this.e0));
                this.h.j(hs9Var);
                this.r0 = jb6.M0(2131745596, null);
                this.o0 = true;
            }
        } else if (z3) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.t0 = mutate;
            int i = cmb.pi;
            ylb ylbVar = this.e0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(this, mutate, i, ylbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.u0 = mutate2;
            anb.x(this, mutate2, cmb.qi, this.e0, mode);
            this.h.j(new sn2(this.t0, this.u0));
            this.o0 = true;
            this.r0 = jb6.M0(2131754738, null);
        } else if (this.h.getRightDrawable() instanceof hs9) {
            this.h.j(null);
            this.o0 = false;
            this.r0 = null;
        }
        if (z4 || pg3.f(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof um) && (((um) this.h.getRightDrawable()).a instanceof vm)) {
                ((vm) ((um) this.h.getRightDrawable()).a).o(this.h);
            }
            if (pg3.f(emojiStatus) != 0) {
                this.g0.j(pg3.f(emojiStatus), z5);
            } else if (z4) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.s0 = mutate3;
                anb.x(this, mutate3, cmb.pi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z5);
            } else {
                this.g0.g(null, z5);
            }
            this.g0.k(Integer.valueOf(cmb.v0(cmb.pi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = jb6.M0(2131754801, null);
        } else {
            this.h.i(null);
            this.q0 = null;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(z5);
        }
    }

    public final void i(int i, int i2) {
        mt1 mt1Var = this.h;
        anb.q(mt1Var);
        mt1 mt1Var2 = this.r;
        anb.q(mt1Var2);
        mt1Var.setTextColor(i);
        mt1Var2.setTextColor(i2);
        mt1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        mt1 mt1Var = this.h;
        mt1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = jb6.M0(2131747634, null);
            } else {
                this.r0 = null;
            }
            mt1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        pc0 pc0Var = this.J;
        pc0Var.q(user);
        boolean B = m9c.B(user);
        v82 v82Var = this.e;
        if (B) {
            pc0Var.f(12);
            pc0Var.p = 0.8f;
            if (v82Var != null) {
                v82Var.m(null, null, pc0Var, user);
                return;
            }
            return;
        }
        if (m9c.u(user)) {
            pc0Var.f(21);
            pc0Var.p = 0.8f;
            if (v82Var != null) {
                v82Var.m(null, null, pc0Var, user);
                return;
            }
            return;
        }
        if (!m9c.D(user) || z) {
            pc0Var.p = 1.0f;
            if (v82Var != null) {
                v82Var.f(user, pc0Var);
                return;
            }
            return;
        }
        pc0Var.f(1);
        pc0Var.p = 0.8f;
        if (v82Var != null) {
            v82Var.m(null, null, pc0Var, user);
        }
    }

    public final void l() {
        int i = this.W;
        String M0 = i == 2 ? jb6.M0(2131742896, null) : i == 1 ? jb6.M0(2131751746, null) : i == 5 ? jb6.M0(2131743497, null) : i == 4 ? jb6.M0(2131751744, null) : null;
        ylb ylbVar = this.e0;
        io ioVar = this.s;
        mt1 mt1Var = this.r;
        if (M0 == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (mt1Var != null) {
                    mt1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        mt1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            anb.W(mt1Var, i2, ylbVar);
                            mt1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (ioVar != null) {
                    ioVar.c(charSequence, !jb6.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        ioVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            anb.U(ioVar, i3, ylbVar);
                            ioVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (mt1Var != null) {
            if (this.a0 == null) {
                this.a0 = mt1Var.getText();
            }
            mt1Var.k(M0);
            Integer num3 = this.c0;
            if (num3 != null) {
                mt1Var.setTextColor(num3.intValue());
            } else {
                int i4 = cmb.A8;
                anb.W(mt1Var, i4, ylbVar);
                mt1Var.setTag(Integer.valueOf(i4));
            }
        } else if (ioVar != null) {
            if (this.a0 == null) {
                this.a0 = ioVar.getText();
            }
            ioVar.c(M0, !jb6.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                ioVar.setTextColor(num4.intValue());
            } else {
                int i5 = cmb.A8;
                anb.U(ioVar, i5, ylbVar);
                ioVar.setTag(Integer.valueOf(i5));
            }
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z;
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = yv1Var.r8;
            if (chatFull != null) {
                int i = this.K;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (!z || chatFull.participants_count <= 200) {
                        return;
                    }
                    this.V = chatFull.online_count;
                    return;
                }
                for (int i2 = 0; i2 < chatFull.participants.participants.size(); i2++) {
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (W1 != null && (userStatus = W1.status) != null && ((userStatus.expires > currentTime || W1.id == z8c.h(i).e()) && W1.status.expires > 10000)) {
                        this.V++;
                    }
                }
            }
        }
    }

    public final void n(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i2;
        String S;
        int i3;
        int i4;
        int i5;
        ArrayList l;
        int i6;
        ylb ylbVar = this.e0;
        boolean[] zArr = this.S;
        io ioVar = this.s;
        mt1 mt1Var = this.r;
        mt1 mt1Var2 = this.h;
        int i7 = this.K;
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            if (yv1Var.g4 == 6) {
                String str = yv1Var.e4.link;
                q51[] q51VarArr = q51.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = yv1Var.h();
            TLRPC.Chat chat = yv1Var.e;
            boolean z4 = m9c.D(h) && yv1Var.g4 == 0 && yv1Var.getMessagesController().E1().c() >= 3 && (this.v0 || oc7.d1().getInt("savedmsgschatshint", 0) < 3);
            if (((m9c.D(h) && !z4) || m9c.B(h) || ((h != null && h.id == 489000) || ((i = yv1Var.g4) != 0 && i != 8))) && yv1Var.g4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z4) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i6 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i6 = 0;
                }
                if (!this.v0) {
                    oc7.d1().edit().putInt("savedmsgschatshint", oc7.d1().getInt("savedmsgschatshint", i6) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence B1 = oc7.r1(i7).B1(yv1Var.a(), yv1Var.s4, false);
            CharSequence charSequence = "";
            if (B1 != null) {
                B1 = TextUtils.replace(B1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z4;
            if (B1 != null && B1.length() != 0 && (!sd2.T(chat) || chat.megagroup)) {
                if (yv1Var.j8() && mt1Var2.getTag() != null) {
                    mt1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(mt1Var2, (Property<mt1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                        this.R.addListener(new y82(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        mt1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer C1 = oc7.r1(i7).C1(yv1Var.a(), yv1Var.s4);
                charSequence = (C1 == null || C1.intValue() != 5) ? B1 : gw3.m(B1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                setTypingAnimation(true);
                z3 = true;
            } else {
                if (yv1Var.j8() && !yv1Var.x4) {
                    if (mt1Var2.getTag() == null) {
                        mt1Var2.setTag(1);
                        AnimatorSet animatorSet3 = this.R;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.R = null;
                        }
                        if (!z) {
                            mt1Var2.setTranslationY(gm.L(9.7f));
                            getSubtitleTextView().setAlpha(0.0f);
                            getSubtitleTextView().setVisibility(4);
                            return;
                        } else {
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            this.R = animatorSet4;
                            animatorSet4.playTogether(ObjectAnimator.ofFloat(mt1Var2, (Property<mt1, Float>) property2, gm.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                            this.R.addListener(new y82(this, (byte) 0));
                            this.R.setDuration(180L);
                            this.R.start();
                            return;
                        }
                    }
                    return;
                }
                setTypingAnimation(false);
                int i8 = yv1Var.g4;
                if (i8 != 8) {
                    if (i8 == 3) {
                        wr9 E1 = yv1Var.getMessagesController().E1();
                        long f7 = yv1Var.f7();
                        ArrayList arrayList = E1.j;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                i5 = 0;
                                break;
                            }
                            vr9 vr9Var = (vr9) arrayList.get(i9);
                            if (vr9Var.a == f7) {
                                i5 = vr9Var.e;
                                break;
                            }
                            i9++;
                        }
                        charSequence = jb6.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (yv1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f = oc7.r1(i7).g4.f(chat.id, yv1Var.d());
                            if (f != null) {
                                i3 = 1;
                                i4 = f.totalMessagesCount - 1;
                            } else {
                                i3 = 1;
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                Object[] objArr = new Object[i3];
                                objArr[0] = Integer.valueOf(i4);
                                G = jb6.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = jb6.a0(null, null, 2131743699, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = yv1Var.r8;
                            int i10 = this.V;
                            if (sd2.T(chat)) {
                                if (chatFull == null || (i2 = chatFull.participants_count) == 0) {
                                    G = chat.megagroup ? chatFull == null ? jb6.M0(2131748536, null).toLowerCase() : chat.has_geo ? jb6.M0(2131748399, null).toLowerCase() : sd2.t0(chat) ? jb6.M0(2131748395, null).toLowerCase() : jb6.M0(2131748398, null).toLowerCase() : sd2.t0(chat) ? jb6.M0(2131752260, null).toLowerCase() : jb6.M0(2131752271, null).toLowerCase();
                                } else if (chat.megagroup) {
                                    G = i10 > 1 ? kt6.o(jb6.G(i2, "Members", new Object[0]), ", ", jb6.G(Math.min(i10, chatFull.participants_count), "OnlineCount", new Object[0])) : jb6.G(i2, "Members", new Object[0]);
                                } else {
                                    int[] iArr = new int[1];
                                    boolean A1 = gm.A1();
                                    int i11 = chatFull.participants_count;
                                    if (A1) {
                                        iArr[0] = i11;
                                        S = String.valueOf(i11);
                                    } else {
                                        S = jb6.S(iArr, i11);
                                    }
                                    G = chat.megagroup ? jb6.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S) : jb6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                }
                            } else if (sd2.k0(chat)) {
                                G = jb6.M0(2131742492, null);
                            } else if (sd2.l0(chat)) {
                                G = jb6.M0(2131742498, null);
                            } else {
                                int i12 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i12 = chatParticipants.participants.size();
                                }
                                G = (i10 <= 1 || i12 == 0) ? jb6.G(i12, "Members", new Object[0]) : kt6.o(jb6.G(i12, "Members", new Object[0]), ", ", jb6.G(i10, "OnlineCount", new Object[0]));
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User W1 = oc7.r1(i7).W1(Long.valueOf(h.id));
                                if (W1 != null) {
                                    h = W1;
                                }
                                if (!m9c.B(h)) {
                                    long j = h.id;
                                    if (j != 489000) {
                                        if (j == z8c.h(i7).e()) {
                                            charSequence = z5 ? gm.D2(jb6.M0(2131745626, null), false) : jb6.M0(2131752126, null);
                                        } else {
                                            long j2 = h.id;
                                            if (j2 == 333000 || j2 == 777000 || j2 == 42777) {
                                                z2 = false;
                                                charSequence = jb6.M0(2131745295, null);
                                            } else if (oc7.G2(h)) {
                                                charSequence = jb6.M0(2131744010, null);
                                            } else if (h.bot) {
                                                int i13 = h.bot_active_users;
                                                charSequence = i13 != 0 ? jb6.H(',', "BotUsers", i13) : m9c.e(h);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = jb6.d0(i7, h, zArr, this.f0 ? this.T : null);
                                                z3 = zArr[0];
                                            }
                                        }
                                    }
                                }
                            } else {
                                z2 = false;
                            }
                            z3 = z2;
                        }
                        charSequence = G;
                    }
                    z3 = false;
                } else if (yv1Var.i4) {
                    charSequence = jb6.M0(2131752156, null);
                    z3 = false;
                } else {
                    if (yv1Var.d() == 0) {
                        qwb qwbVar = yv1Var.getMessagesController().g4;
                        long j3 = -yv1Var.a();
                        int size = (!qwbVar.e(j3) || (l = qwbVar.l(j3)) == null) ? 0 : l.size();
                        G = size > 0 ? jb6.H(',', "Chats", size) : jb6.M0(2131752156, null);
                    } else {
                        TLRPC.TL_forumTopic f2 = oc7.r1(i7).g4.f(chat.id, yv1Var.d());
                        int i14 = f2 != null ? f2.totalMessagesCount : 0;
                        G = i14 > 0 ? jb6.G(i14, "messages", Integer.valueOf(i14)) : jb6.a0(null, null, 2131743699, no4.j(i7, chat, false));
                    }
                    charSequence = G;
                    z3 = false;
                }
            }
            this.b0 = z3 ? cmb.oa : cmb.A8;
            if (this.a0 != null) {
                this.a0 = charSequence;
            } else if (mt1Var != null) {
                mt1Var.k(charSequence);
                Integer num = this.c0;
                if (num == null) {
                    anb.W(mt1Var, this.b0, ylbVar);
                    mt1Var.setTag(Integer.valueOf(this.b0));
                } else {
                    mt1Var.setTextColor(num.intValue());
                }
            } else {
                ioVar.c(charSequence, z, true);
                Integer num2 = this.c0;
                if (num2 == null) {
                    anb.U(ioVar, this.b0, ylbVar);
                    ioVar.setTag(Integer.valueOf(this.b0));
                } else {
                    ioVar.setTextColor(num2.intValue());
                }
            }
            a aVar = this.A0;
            if (aVar != null) {
                aVar.l(z);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            int i = this.K;
            nm7.f(i).b(this, nm7.T1);
            nm7.e().b(this, nm7.m4);
            if (yv1Var.g4 == 3) {
                nm7.f(i).b(this, nm7.i3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        tm tmVar = this.g0;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = this.h0;
        if (tmVar2 != null) {
            tmVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            int i = this.K;
            nm7.f(i).n(this, nm7.T1);
            nm7.e().n(this, nm7.m4);
            if (yv1Var.g4 == 3) {
                nm7.f(i).n(this, nm7.i3);
            }
        }
        tm tmVar = this.g0;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = this.h0;
        if (tmVar2 != null) {
            tmVar2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getText());
        if (this.q0 != null) {
            sb.append(", ");
            sb.append(this.q0);
        }
        if (this.r0 != null) {
            sb.append(", ");
            sb.append(this.r0);
        }
        sb.append("\n");
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            sb.append(mt1Var.getText());
        } else {
            io ioVar = this.s;
            if (ioVar != null) {
                sb.append(ioVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131747519, null)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        v82 v82Var = this.e;
        int measuredHeight = (((currentActionBarHeight - v82Var.getMeasuredHeight()) - 2) / 2) + (this.L ? gm.m : 0);
        int L = gm.L(this.m0 ? 23.66f : 24.0f) + measuredHeight;
        int i5 = this.M + 1;
        int i6 = measuredHeight + 1;
        v82Var.layout(i5, i6, v82Var.getMeasuredWidth() + i5, v82Var.getMeasuredHeight() + i6);
        int i7 = this.M;
        int visibility = v82Var.getVisibility();
        boolean z2 = this.m0;
        int L2 = i7 + gm.L(visibility == 0 ? z2 ? 49.66f : 55.0f : z2 ? 13.0f : 1.0f) + this.N;
        lka lkaVar = (lka) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        mt1 mt1Var = this.h;
        if (visibility2 != 8) {
            mt1Var.layout(L2, (gm.L(1.66f) + measuredHeight) - mt1Var.getPaddingTop(), mt1Var.getMeasuredWidth() + L2, mt1Var.getPaddingBottom() + ((gm.L(1.66f) + (mt1Var.getTextHeight() + measuredHeight)) - mt1Var.getPaddingTop()));
            if (lkaVar != null) {
                lkaVar.layout(L2, gm.L(1.66f) + measuredHeight, lkaVar.getMeasuredWidth() + L2, gm.L(1.66f) + lkaVar.getTextHeight() + measuredHeight);
            }
        } else {
            mt1Var.layout(L2, (gm.L(11.0f) + measuredHeight) - mt1Var.getPaddingTop(), mt1Var.getMeasuredWidth() + L2, mt1Var.getPaddingBottom() + ((gm.L(11.0f) + (mt1Var.getTextHeight() + measuredHeight)) - mt1Var.getPaddingTop()));
            if (lkaVar != null) {
                lkaVar.layout(L2, gm.L(10.0f) + measuredHeight, lkaVar.getMeasuredWidth() + L2, gm.L(10.0f) + lkaVar.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(gm.L(29.0f) + this.M, gm.L(27.33f) + measuredHeight, imageView.getMeasuredWidth() + gm.L(29.0f) + this.M, imageView.getMeasuredHeight() + gm.L(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(gm.L(19.333f) + this.M, measuredHeight - gm.L(8.0f), imageView2.getMeasuredWidth() + gm.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (measuredHeight - gm.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(gm.L(28.0f) + this.M, gm.L(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + gm.L(28.0f) + this.M, imageView3.getMeasuredHeight() + gm.L(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(gm.L(28.0f) + this.M, gm.L(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + gm.L(28.0f) + this.M, imageView4.getMeasuredHeight() + gm.L(24.0f) + measuredHeight);
        }
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            mt1Var2.layout(L2, L, mt1Var2.getMeasuredWidth() + L2, mt1Var2.getTextHeight() + L);
        } else {
            io ioVar = this.s;
            if (ioVar != null) {
                ioVar.layout(L2, L, ioVar.getMeasuredWidth() + L2, ioVar.getTextHeight() + L);
            }
        }
        lka lkaVar2 = (lka) this.w.get();
        if (lkaVar2 != null) {
            lkaVar2.layout(L2, L, lkaVar2.getMeasuredWidth() + L2, lkaVar2.getTextHeight() + L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        v82 v82Var = this.e;
        int L = size - gm.L((v82Var.getVisibility() == 0 ? 54 : 0) + 16);
        float f = this.d;
        v82Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(f) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_31);
        mt1 mt1Var = this.h;
        mt1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        io ioVar = this.s;
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            mt1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_31));
        } else if (ioVar != null) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i3 = this.P;
        AtomicReference atomicReference = this.n;
        if (i3 != -1 && i3 != size && i3 > size) {
            this.Q = i3;
            View view = (lka) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            lka lkaVar = new lka(getContext());
            atomicReference.set(lkaVar);
            int i4 = cmb.z8;
            ylb ylbVar = this.e0;
            anb.W(lkaVar, i4, ylbVar);
            lkaVar.setTextSizePx(gm.L(this.m0 ? 17.5f : 18.0f));
            lkaVar.setGravity(3);
            lkaVar.setTypeface(gm.o());
            lkaVar.setLeftDrawableTopPadding(-gm.L(1.3f));
            lkaVar.i(mt1Var.getRightDrawable());
            lkaVar.j(mt1Var.getRightDrawable2());
            lkaVar.setRightDrawableOutside(mt1Var.getRightDrawableOutside());
            lkaVar.setLeftDrawable(mt1Var.getLeftDrawable());
            lkaVar.l(mt1Var.getText(), false);
            ViewPropertyAnimator duration = lkaVar.animate().alpha(0.0f).setDuration(350L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new r82(this, (byte) 0)).start();
            addView(lkaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (lka) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            lka lkaVar2 = new lka(getContext());
            atomicReference2.set(lkaVar2);
            int i5 = cmb.A8;
            anb.W(lkaVar2, i5, ylbVar);
            lkaVar2.setTag(Integer.valueOf(i5));
            lkaVar2.setTextSizePx(gm.L(this.m0 ? 13.5f : 14.0f));
            lkaVar2.setGravity(3);
            if (mt1Var2 != null) {
                lkaVar2.l(mt1Var2.getText(), false);
            } else if (ioVar != null) {
                lkaVar2.l(ioVar.getText(), false);
            }
            lkaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).withEndAction(new r82(this, (byte) 1)).start();
            addView(lkaVar2);
            setClipChildren(false);
        }
        lka lkaVar3 = (lka) atomicReference.get();
        if (lkaVar3 != null) {
            lkaVar3.measure(wi8.f((v82Var.getVisibility() == 0 ? 54 : 0) + 16, this.Q, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_31));
        }
        this.P = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        u51 u51Var = this.i0;
        r82 r82Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            u51Var.c(true);
            gm.r(r82Var);
            gm.d3(r82Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            u51Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            gm.r(r82Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        pc0 pc0Var = this.J;
        pc0Var.p(chat);
        v82 v82Var = this.e;
        if (v82Var != null) {
            v82Var.f(chat, pc0Var);
            v82Var.setRoundRadius(gm.L(sd2.c0(chat) ? (chat == null || !oc7.r1(z8c.t0).N1().J(-chat.id)) ? 16.0f : 11.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((!z || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i) {
        this.M = i;
    }

    public void setOccupyStatusBar(boolean z) {
        this.L = z;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.c0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.i0.c(z);
    }

    public void setRightAvatarPadding(int i) {
        this.N = i;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.a0 == null) {
            mt1 mt1Var = this.r;
            if (mt1Var != null) {
                mt1Var.k(charSequence);
            } else {
                io ioVar = this.s;
                if (ioVar != null) {
                    ioVar.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override // vlb
    public final void updateColors() {
        e0b e0bVar = this.O;
        ylb ylbVar = this.e0;
        if (e0bVar != null) {
            e0bVar.b(cmb.v0(cmb.oa, ylbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = cmb.v0(cmb.pi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        tm tmVar = this.h0;
        if (tmVar != null) {
            tmVar.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        tm tmVar2 = this.g0;
        if (tmVar2 != null) {
            tmVar2.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = cmb.v0(cmb.pi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = cmb.v0(cmb.qi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        mt1 mt1Var = this.h;
        if (mt1Var != null) {
            try {
                if (mt1Var.getRightDrawable2() instanceof hs9) {
                    ((hs9) mt1Var.getRightDrawable2()).b(cmb.v0(cmb.A8, ylbVar));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
