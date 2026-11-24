// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ut8 extends hg0 implements jm7, vlb {
    public final RectF A0;
    public final jh2 B0;
    public boolean C0;
    public qac D0;
    public TLRPC.User E;
    public jac E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public yv2 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final u51 J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public uib M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public nj8 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public zb1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public r68 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public final ln n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public final ImageReceiver r;
    public int r0;
    public final pc0 s;
    public StaticLayout s0;
    public final tm t0;
    public final tm u0;
    public final v4b v0;
    public CharSequence w;
    public final RectF w0;
    public final ylb x;
    public uib x0;
    public TLRPC.TL_sponsoredPeer y;
    public Paint y0;
    public final u51 z0;

    public ut8(Context context, ylb ylbVar) {
        super(context);
        this.O = z8c.t0;
        this.g0 = gm.L(19.0f);
        this.n0 = new ln(this, 0L, 350L, d53.h);
        this.v0 = new v4b(null, false);
        this.w0 = new RectF();
        this.z0 = new u51(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new u51(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = anb.b;
        this.x = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gm.L(23.0f));
        this.s = new pc0((ylb) null);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.B0 = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var);
        tm tmVar = new tm(gm.L(20.0f), this);
        this.t0 = tmVar;
        tmVar.setCallback(this);
        tm tmVar2 = new tm(gm.L(20.0f), this);
        this.u0 = tmVar2;
        tmVar2.setCallback(this);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.o6));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            invalidate();
            return;
        }
        if (i == nm7.k3) {
            TLRPC.User user = this.E;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i3 = this.O;
            if (user == null) {
                TLRPC.Chat chat = this.F;
                if (chat == null) {
                    yv2 yv2Var = this.H;
                    if (yv2Var == null) {
                        return;
                    }
                    if (this.m0 && yv2Var.m != null) {
                        requirementToContact = oc7.r1(i3).L2(this.H.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.m0) {
                requirementToContact = oc7.r1(i3).L2(this.E.id);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.o0 == z && this.p0 == pg3.j(requirementToContact)) {
                return;
            }
            this.o0 = z;
            this.p0 = pg3.j(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        nm7.e().b(this, nm7.m4);
        if (this.m0) {
            nm7.e().b(this, nm7.k3);
        }
        this.u0.a();
        this.t0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        nm7.e().n(this, nm7.m4);
        if (this.m0) {
            nm7.e().n(this, nm7.k3);
        }
        this.u0.b();
        this.t0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        nj8 nj8Var;
        int ceil;
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        boolean z = this.N;
        ylb ylbVar = this.x;
        if (z) {
            Paint d = (!this.F0 || ylbVar == null) ? null : ylbVar.d("paintDivider");
            if (d == null) {
                d = cmb.j0;
            }
            Paint paint = d;
            if (jb6.a0) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - gm.L(gm.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(gm.L(gm.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.S) {
            hg0.s(this.T, this.U, cmb.Z0);
            cmb.Z0.draw(canvas2);
        }
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            boolean z2 = jb6.a0;
            tm tmVar = this.t0;
            if (z2) {
                ceil = (int) (staticLayout.getLineRight(0) + this.P + gm.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.P - gm.L(3.0f)) - tmVar.s;
            } else {
                f = 6.0f;
                ceil = (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gm.L(3.0f)) - tmVar.s);
                hg0.t(tmVar, ceil, ((this.R.getHeight() - tmVar.s) / 2.0f) + this.Q);
                tmVar.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.P, this.Q);
                this.R.draw(canvas2);
                canvas2.restore();
                boolean z3 = jb6.a0;
                tm tmVar2 = this.u0;
                hg0.t(tmVar2, !z3 ? this.R.getLineLeft(0) == 0.0f ? (this.P - gm.L(3.0f)) - tmVar2.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gm.L(3.0f)) - tmVar2.s) : (int) (this.R.getLineRight(0) + this.P + gm.L(f)), ((this.R.getHeight() - tmVar2.s) / 2.0f) + this.Q);
                tmVar2.draw(canvas2);
            }
            f = 6.0f;
            hg0.t(tmVar, ceil, ((this.R.getHeight() - tmVar.s) / 2.0f) + this.Q);
            tmVar.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.P, this.Q);
            this.R.draw(canvas2);
            canvas2.restore();
            boolean z32 = jb6.a0;
            tm tmVar22 = this.u0;
            hg0.t(tmVar22, !z32 ? this.R.getLineLeft(0) == 0.0f ? (this.P - gm.L(3.0f)) - tmVar22.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gm.L(3.0f)) - tmVar22.s) : (int) (this.R.getLineRight(0) + this.P + gm.L(f)), ((this.R.getHeight() - tmVar22.s) / 2.0f) + this.Q);
            tmVar22.draw(canvas2);
        } else {
            f = 6.0f;
        }
        if (this.y == null || this.x0 == null || this.y0 == null) {
            f2 = 2.0f;
        } else {
            int v0 = cmb.v0(cmb.Ei, ylbVar);
            this.y0.setColor(cmb.p1(0.1f, v0));
            int L = gm.L(12.66f) + ((int) this.x0.j());
            int L2 = gm.L(17.33f);
            float L3 = jb6.a0 ? gm.L(12.0f) : kt6.y(12.0f, getWidth(), L);
            int i = this.Q;
            f2 = 2.0f;
            float f3 = f;
            RectF rectF = this.w0;
            rectF.set(L3, i, r6 + L, i + L2);
            rectF.inset(-gm.L(f3), -gm.L(f3));
            canvas2.save();
            float a = this.z0.a(0.1f);
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas2.translate(L3, this.Q);
            RectF rectF2 = gm.P;
            float f4 = L2;
            rectF2.set(0.0f, 0.0f, L, f4);
            float f5 = f4 / 2.0f;
            canvas2.drawRoundRect(rectF2, f5, f5, this.y0);
            this.x0.c(gm.L(6.33f), f5, 1.0f, v0, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.s0 != null) {
            canvas2.save();
            canvas2.translate(this.r0 + this.c0, gm.L(this.N0 ? 35.0f : 33.0f) + this.d0);
            this.s0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.j0;
        int i2 = this.g0;
        if (staticLayout2 != null) {
            int L4 = this.h0 - gm.L(5.5f);
            float L5 = gm.L(11.0f) + L4 + this.i0;
            float L6 = gm.L(23.0f) + i2;
            RectF rectF3 = this.A0;
            rectF3.set(L4, i2, L5, L6);
            float f6 = gm.p * 11.5f;
            canvas2.drawRoundRect(rectF3, f6, f6, oc7.r1(this.O).o2(this.I, 0L, null) ? cmb.x0 : cmb.v0);
            canvas2.save();
            canvas2.translate(this.h0, gm.L(4.0f) + i2);
            this.j0.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            zb1 zb1Var = this.W;
            int w0 = cmb.w0(null, cmb.T8, false);
            int w02 = cmb.w0(null, cmb.V8, false);
            zb1Var.g.setColor(w0);
            fg0 fg0Var = zb1Var.e;
            if (fg0Var != null) {
                cmb.F1(fg0Var, w02, true);
            }
            RectF rectF4 = gm.P;
            rectF4.set(this.b0, i2, this.a0.getWidth() + r12, gm.L(23.0f) + i2);
            rectF4.inset(-gm.L(16.0f), -gm.L(4.0f));
            zb1 zb1Var2 = this.W;
            zb1Var2.i = false;
            zb1Var2.c = 0;
            zb1Var2.a(rectF4);
            zb1 zb1Var3 = this.W;
            zb1Var3.n = true;
            zb1Var3.c(canvas2, zb1Var3.g);
            fg0 fg0Var2 = zb1Var3.e;
            if (fg0Var2 != null) {
                fg0Var2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.b0, gm.L(4.0f) + i2);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        boolean z4 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z4) {
            TLRPC.Chat chat = this.F;
            v4b v4bVar = this.v0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.E;
                if (user != null) {
                    y4b.h(user.id, canvas2, imageReceiver, v4bVar);
                } else if (chat != null) {
                    if (sd2.Y(chat)) {
                        Drawable drawable = cmb.R0;
                        RectF rectF5 = v4bVar.F;
                        RectF rectF6 = v4bVar.F;
                        ur3.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    y4b.h(-this.F.id, canvas2, imageReceiver, v4bVar);
                } else {
                    imageReceiver.k0(v4bVar.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                r68 r68Var = this.h;
                if (r68Var == null) {
                    r68Var = new r68();
                    this.h = r68Var;
                }
                RectF rectF7 = v4bVar.F;
                RectF rectF8 = v4bVar.F;
                r68Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f2));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.k0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d2 = this.n0.d(this.o0);
        if (d2 > 0.0f) {
            float s = imageReceiver.s() + gm.L(14.0f);
            float r = imageReceiver.r() + gm.L(16.0f);
            canvas2.save();
            cmb.s0.setColor(cmb.v0(cmb.c6, ylbVar));
            canvas2.drawCircle(r, s, gm.L(11.33f) * d2, cmb.s0);
            nj8 nj8Var2 = this.P0;
            if (nj8Var2 == null) {
                nj8Var = new nj8(cmb.Bk, cmb.Ck, -1, -1, this.x);
                this.P0 = nj8Var;
            } else {
                nj8Var = nj8Var2;
            }
            nj8Var.d((int) (r - gm.L(10.0f)), 0.0f, (int) (s - gm.L(10.0f)), (int) (gm.L(10.0f) + r), 0.0f, (int) (gm.L(10.0f) + s));
            canvas2.drawCircle(r, s, gm.L(10.0f) * d2, this.P0.f);
            if (this.Q0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.Q0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.Q0.setBounds((int) (r - (((r6.getIntrinsicWidth() / f2) * 0.875f) * d2)), (int) (s - (((this.Q0.getIntrinsicHeight() / f2) * 0.875f) * d2)), (int) (((this.Q0.getIntrinsicWidth() / f2) * 0.875f * d2) + r), (int) (((this.Q0.getIntrinsicHeight() / f2) * 0.875f * d2) + s));
            this.Q0.setAlpha((int) (d2 * 255.0f));
            this.Q0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.q0 || this.M0 == null) {
            return;
        }
        float L7 = gm.L(28.0f) + this.M0.c;
        float L8 = jb6.a0 ? gm.L(15.0f) : (getWidth() - L7) - gm.L(15.0f);
        float L9 = gm.L(28.0f);
        int w03 = cmb.w0(null, cmb.Ei, false);
        Paint paint2 = this.K0;
        paint2.setColor(w03);
        float height = (getHeight() + L9) / f2;
        RectF rectF9 = this.L0;
        rectF9.set(L8, (getHeight() - L9) / f2, L7 + L8, height);
        canvas2.save();
        float a2 = this.J0.a(0.06f);
        canvas2.scale(a2, a2, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f2, rectF9.height() / f2, paint2);
        this.M0.c(L8 + gm.L(14.0f), getHeight() / f2, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.l0) {
            sb.append(", ");
            sb.append(jb6.M0(2131754738, null));
            sb.append("\n");
        }
        if (this.s0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.s0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        jh2 jh2Var = this.B0;
        if (jh2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        jh2 jh2Var = this.B0;
        if (jh2Var != null) {
            int L = jb6.a0 ? (i3 - i) - gm.L(42.0f) : gm.L(42.0f);
            int L2 = gm.L(36.0f);
            jh2Var.layout(L, L2, jh2Var.getMeasuredWidth() + L, jh2Var.getMeasuredHeight() + L2);
        }
        if (z) {
            v();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        jh2 jh2Var = this.B0;
        if (jh2Var != null) {
            jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.N0 ? gm.L(56.0f) : gm.L(60.0f) + (this.N ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r6.i == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        if (r6.i == false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zb1 zb1Var;
        if (this.q0 && this.D0 != null && this.E != null) {
            boolean contains = this.L0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            u51 u51Var = this.J0;
            if (action == 0 || motionEvent.getAction() == 2) {
                u51Var.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (u51Var.i) {
                        this.D0.a(this.E);
                    }
                    u51Var.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    u51Var.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.y != null && this.E0 != null) {
            boolean contains2 = this.w0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            u51 u51Var2 = this.z0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                u51Var2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (u51Var2.i) {
                        this.E0.a(this, this.y);
                    }
                    u51Var2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    u51Var2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.E == null && this.F == null) || !this.v0.a(this, motionEvent)) && ((zb1Var = this.W) == null || !zb1Var.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.I0 = z;
    }

    public void setOnSponsoredOptionsClick(jac jacVar) {
        this.E0 = jacVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.q0 == z) {
            return;
        }
        uib uibVar = this.M0;
        if (uibVar == null) {
            uibVar = new uib(jb6.M0(2131752976, null), 14.0f, gm.o());
            this.M0 = uibVar;
        }
        if (z) {
            i = gm.L(30.0f) + ((int) uibVar.c);
        } else {
            i = 0;
        }
        if (jb6.a0) {
            i2 = i;
            i = 0;
        } else {
            i2 = 0;
        }
        setPadding(i2, 0, i, 0);
        this.q0 = z;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.O0 = z;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        y(0);
    }

    @Override // vlb
    public final void updateColors() {
        int i = this.R0;
        int i2 = anb.b;
        if (i == i2) {
            if (this.R == null || getMeasuredWidth() <= 0) {
                return;
            }
            v();
            return;
        }
        this.R0 = i2;
        try {
            y(0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        TLRPC.Chat L0;
        TextPaint textPaint;
        int measuredWidth;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i;
        int L;
        this.S = false;
        this.l0 = false;
        TLRPC.EncryptedChat encryptedChat = this.G;
        int i2 = this.O;
        if (encryptedChat != null) {
            this.S = true;
            this.I = pg3.E(encryptedChat.id);
            if (jb6.a0) {
                this.T = (getMeasuredWidth() - gm.L(gm.C + 2)) - cmb.Z0.getIntrinsicWidth();
                this.P = gm.L(11.0f);
            } else {
                this.T = gm.L(gm.C);
                this.P = cmb.Z0.getIntrinsicWidth() + gm.L(r2 + 4);
            }
            this.U = gm.L(22.0f);
            z(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                this.I = -chat.id;
                this.l0 = chat.verified;
                if (chat.monoforum && (L0 = oc7.r1(i2).L0(Long.valueOf(this.F.linked_monoforum_id))) != null) {
                    this.l0 = L0.verified;
                }
                if (jb6.a0) {
                    this.P = gm.L(11.0f);
                } else {
                    this.P = gm.L(gm.C);
                }
                z(this.l0, null, this.F, false);
            } else {
                TLRPC.User user = this.E;
                if (user != null) {
                    this.I = user.id;
                    if (jb6.a0) {
                        this.P = gm.L(11.0f);
                    } else {
                        this.P = gm.L(gm.C);
                    }
                    this.U = gm.L(21.0f);
                    TLRPC.User user2 = this.E;
                    this.l0 = user2.verified;
                    if (!this.M) {
                        oc7.r1(i2);
                        user2 = this.E;
                    }
                    z(this.l0, user2, null, false);
                } else if (this.H != null) {
                    this.I = 0L;
                    if (jb6.a0) {
                        this.P = gm.L(11.0f);
                    } else {
                        this.P = gm.L(gm.C);
                    }
                    if (this.W == null) {
                        zb1 zb1Var = new zb1(this);
                        this.W = zb1Var;
                        zb1Var.h = new pp8(this, (byte) 7);
                    }
                }
            }
        }
        if (jb6.a0) {
            this.r0 = gm.L(11.0f);
        } else {
            this.r0 = gm.L(gm.C);
        }
        if (this.y != null) {
            if (this.x0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(jb6.M0(2131745569, null)).append((CharSequence) " i");
                pn2 pn2Var = new pn2(R.drawable.ic_ab_other, 0);
                pn2Var.I = 0.55f;
                pn2Var.J = 0.55f;
                pn2Var.H = 0.7f;
                pn2Var.r = -gm.L(2.0f);
                pn2Var.s = 0.0f;
                append.setSpan(pn2Var, append.length() - 1, append.length(), 33);
                this.x0 = new uib(append, 12.0f, null);
            }
            if (this.y0 == null) {
                this.y0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat2 = this.F;
        ylb ylbVar = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat L02 = oc7.r1(i2).L0(Long.valueOf(this.F.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (L02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.U(L02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131748104, null));
                    spannableStringBuilder.setSpan(new pf4(jb6.M0(2131748104, null), cmb.x6, ylbVar), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = gm.C2(gm.A2(this.F.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = gm.C2(gm.A2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user3 = this.E;
            charSequence4 = charSequence3;
            if (user3 != null) {
                charSequence4 = gm.C2(gm.A2(m9c.r(user3)));
            }
        }
        CharSequence J2 = gm.J2(charSequence4);
        if (TextUtils.isEmpty(J2)) {
            TLRPC.User user4 = this.E;
            J2 = (user4 == null || TextUtils.isEmpty(user4.phone)) ? jb6.M0(2131749085, null) : mlb.l(new StringBuilder("+"), this.E.phone, r58.f());
        }
        if (this.F0) {
            if (this.G0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.G0 = textPaint2;
                textPaint2.setTypeface(gm.o());
            }
            this.G0.setTextSize(gm.L(this.N0 ? 15.0f : 16.0f));
            TLRPC.EncryptedChat encryptedChat2 = this.G;
            TextPaint textPaint3 = this.G0;
            if (encryptedChat2 != null) {
                textPaint3.setColor(cmb.v0(cmb.Y8, ylbVar));
            } else {
                textPaint3.setColor(cmb.v0(cmb.W8, ylbVar));
            }
            textPaint = this.G0;
        } else {
            textPaint = this.G != null ? cmb.D0 : cmb.C0;
        }
        TextPaint textPaint4 = textPaint;
        if (jb6.a0) {
            measuredWidth = (getMeasuredWidth() - this.P) - gm.L(gm.C);
            this.V = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.P) - gm.L(14.0f);
            this.V = measuredWidth;
        }
        int i3 = measuredWidth;
        if (this.S) {
            i3 -= cmb.Z0.getIntrinsicWidth() + gm.L(6.0f);
            this.V = i3;
        }
        if (this.y != null) {
            int L2 = gm.L(20.66f) + ((int) this.x0.c);
            i3 = this.V - L2;
            this.V = i3;
            if (jb6.a0) {
                this.P += L2;
            }
        }
        if (this.H != null) {
            int measureText = (int) (cmb.K0.measureText(jb6.M0(2131748931, null)) + 1.0f);
            this.a0 = new StaticLayout(jb6.M0(2131748931, null), cmb.K0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (jb6.a0) {
                this.b0 = gm.L(16.0f) + gm.L(19.0f);
                this.P += measureText;
                this.r0 += measureText;
            } else {
                this.b0 = ((getMeasuredWidth() - measureText) - gm.L(19.0f)) - gm.L(16.0f);
            }
            i3 = wi8.B(32.0f, measureText, this.V);
            this.V = i3;
        }
        this.V = i3 - (getPaddingRight() + getPaddingLeft());
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.e0) {
            int U0 = oc7.r1(i2).U0((TLRPC.Dialog) oc7.r1(i2).R.f(this.I));
            if (U0 != 0) {
                this.f0 = U0;
                Locale locale = Locale.US;
                String valueOf = String.valueOf(U0);
                this.i0 = Math.max(gm.L(12.0f), (int) Math.ceil(cmb.K0.measureText(valueOf)));
                this.j0 = new StaticLayout(valueOf, cmb.K0, this.i0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = gm.L(18.0f) + this.i0;
                this.V -= L3;
                paddingRight -= L3;
                if (jb6.a0) {
                    this.h0 = gm.L(19.0f);
                    this.P += L3;
                    this.r0 += L3;
                } else {
                    this.h0 = (getMeasuredWidth() - this.i0) - gm.L(19.0f);
                }
            } else {
                this.f0 = 0;
                this.j0 = null;
            }
        } else {
            this.f0 = 0;
            this.j0 = null;
        }
        int i4 = paddingRight;
        tm tmVar = this.t0;
        boolean d = tmVar.d();
        int i5 = tmVar.s;
        if (!d) {
            if (jb6.a0) {
                this.V -= i5;
            } else {
                this.P += i5;
            }
        }
        tm tmVar2 = this.u0;
        if (!tmVar2.d() && !jb6.a0) {
            this.V -= tmVar2.s;
        }
        int i6 = this.V;
        if (i6 < 0) {
            this.V = 0;
            i6 = 0;
        }
        float L4 = i6 - gm.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(J2, textPaint4, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = gw3.m(ellipsize, textPaint4.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i7 = this.V;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(charSequence5, textPaint4, i7, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = cmb.P0;
        TLRPC.Chat chat3 = this.F;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user5 = this.E;
                if (user5 == null) {
                    charSequence = null;
                } else if (oc7.G2(user5)) {
                    charSequence = jb6.M0(2131744010, null);
                } else {
                    TLRPC.User user6 = this.E;
                    if (user6.bot) {
                        int i8 = user6.bot_active_users;
                        charSequence = i8 != 0 ? jb6.H(' ', "BotUsersShort", i8) : jb6.M0(2131753121, null);
                    } else {
                        long j = user6.id;
                        if (j == 489000) {
                            charSequence = jb6.M0(2131743303, null);
                        } else if (m9c.C(j)) {
                            charSequence = jb6.M0(2131745295, null);
                        } else {
                            boolean[] zArr = this.k0;
                            if (zArr == null) {
                                zArr = new boolean[1];
                                this.k0 = zArr;
                            }
                            zArr[0] = false;
                            charSequence = jb6.d0(i2, this.E, zArr, null);
                            if (this.k0[0]) {
                                textPaint5 = cmb.O0;
                            }
                            TLRPC.User user7 = this.E;
                            if (user7 != null && (user7.id == z8c.h(i2).e() || ((userStatus = this.E.status) != null && userStatus.expires > ConnectionsManager.getInstance(i2).getCurrentTime()))) {
                                textPaint5 = cmb.O0;
                                charSequence = jb6.M0(2131747559, null);
                            }
                        }
                    }
                }
            }
            if (this.M || m9c.B(this.E)) {
                this.Q = gm.L(20.0f);
                charSequence = null;
            }
        } else {
            if (sd2.Y(chat3)) {
                charSequence = jb6.M0(2131751927, null).toLowerCase();
            } else {
                boolean V = sd2.V(this.F);
                TLRPC.Chat chat4 = this.F;
                if (V) {
                    int i9 = chat4.participants_count;
                    charSequence = i9 != 0 ? jb6.H(',', "Subscribers", i9) : !sd2.t0(chat4) ? jb6.M0(2131752271, null).toLowerCase() : jb6.M0(2131752260, null).toLowerCase();
                } else {
                    int i10 = chat4.participants_count;
                    charSequence = i10 != 0 ? jb6.H(',', "Members", i10) : chat4.has_geo ? jb6.M0(2131748399, null) : sd2.p0(chat4) ? jb6.M0(2131748105, null) : !sd2.t0(this.F) ? jb6.M0(2131748398, null).toLowerCase() : jb6.M0(2131748395, null).toLowerCase();
                }
            }
            this.Q = gm.L(19.0f);
        }
        if (this.F0) {
            TextPaint textPaint6 = this.H0;
            if (textPaint6 == null) {
                textPaint6 = new TextPaint(1);
                this.H0 = textPaint6;
            }
            textPaint6.setTextSize(gm.L(this.N0 ? 13.0f : 15.0f));
            if (textPaint5 == cmb.P0) {
                this.H0.setColor(cmb.v0(cmb.z6, ylbVar));
            } else if (textPaint5 == cmb.O0) {
                this.H0.setColor(cmb.v0(cmb.o6, ylbVar));
            }
            textPaint5 = this.H0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i = i4;
            this.Q = gm.L(20.0f);
            this.s0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i4 - gm.L(12.0f), truncateAt), textPaint5, i4, alignment, 1.0f, 0.0f, false);
            i = i4;
            this.s0 = staticLayout;
            this.Q = gm.L(9.0f);
            this.U -= gm.L(10.0f);
        }
        if (jb6.a0) {
            L = (getMeasuredWidth() - gm.L(57.0f)) - getPaddingRight();
        } else {
            L = gm.L(this.N0 ? 14.0f : this.O0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.v0.F.set(L, gm.L(this.N0 ? 6.0f : 7.0f), gm.L(this.N0 ? 44.0f : this.O0 ? 42.0f : 46.0f) + L, gm.L(this.N0 ? 44.0f : 46.0f) + gm.L(this.N0 ? 6.0f : 7.0f));
        boolean z = jb6.a0;
        StaticLayout staticLayout2 = this.R;
        if (z) {
            if (staticLayout2.getLineCount() > 0 && this.R.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.R.getLineWidth(0));
                double d2 = this.V;
                if (ceil < d2) {
                    this.P = (int) ((d2 - ceil) + this.P);
                }
            }
            StaticLayout staticLayout3 = this.s0;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0 && this.s0.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.s0.getLineWidth(0));
                double d3 = i;
                if (ceil2 < d3) {
                    this.r0 = (int) ((d3 - ceil2) + this.r0);
                }
            }
        } else {
            if (staticLayout2.getLineCount() > 0 && this.R.getLineRight(0) == this.V) {
                double ceil3 = Math.ceil(this.R.getLineWidth(0));
                double d4 = this.V;
                if (ceil3 < d4) {
                    this.P = (int) (this.P - (d4 - ceil3));
                }
            }
            StaticLayout staticLayout4 = this.s0;
            if (staticLayout4 != null && staticLayout4.getLineCount() > 0 && this.s0.getLineRight(0) == i) {
                double ceil4 = Math.ceil(this.s0.getLineWidth(0));
                double d5 = i;
                if (ceil4 < d5) {
                    this.r0 = (int) (this.r0 - (d5 - ceil4));
                }
            }
        }
        this.P = getPaddingLeft() + this.P;
        this.r0 = getPaddingLeft() + this.r0;
        this.T = getPaddingLeft() + this.T;
        if (this.N0) {
            this.P = gm.L(1.0f) + this.P;
            this.Q = gm.L(1.0f) + this.Q;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.u0 == drawable || this.t0 == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z, boolean z2) {
        jh2 jh2Var = this.B0;
        if (jh2Var == null) {
            return;
        }
        jh2Var.a(z, z2);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.n = charSequence;
        boolean z3 = obj instanceof TLRPC.User;
        int i = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z3) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            TL_account.RequirementToContact L2 = this.m0 ? oc7.r1(i).L2(this.E.id) : null;
            this.o0 = L2 instanceof TL_account.requirementToContactPremium;
            this.p0 = pg3.j(L2);
            setOpenBotButton(this.C0 && this.E.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.o0 = false;
            this.p0 = pg3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof yv2) {
            yv2 yv2Var = (yv2) obj;
            this.H = yv2Var;
            this.F = null;
            this.E = null;
            if (this.m0 && yv2Var.m != null) {
                requirementToContact = oc7.r1(i).L2(this.H.m.id);
            }
            this.o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.p0 = pg3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int L;
        TLRPC.Dialog dialog;
        String j;
        boolean z;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user2 = this.E;
        ImageReceiver imageReceiver = this.r;
        int i2 = this.O;
        pc0 pc0Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user2 != null) {
            pc0Var.q(user2);
            if (m9c.B(this.E)) {
                pc0Var.f(12);
                imageReceiver.d0(null, null, pc0Var, null, null, 0);
            } else if (this.M) {
                pc0Var.f(1);
                imageReceiver.d0(null, null, pc0Var, null, null, 0);
            } else {
                TLRPC.User user3 = this.E;
                TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.a0(gn5.m(i2, 1, user3), "50_50", gn5.m(z8c.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = pc0Var;
                fileLocation = fileLocation3;
                imageReceiver.a0(gn5.m(i2, 1, user3), "50_50", gn5.m(z8c.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            pc0Var.p(chat);
                            imageReceiver.a0(gn5.m(i2, 1, this.F), "50_50", gn5.m(z8c.t0, 2, this.F), "50_50", drawable, this.F, 0);
                        } else {
                            no4.p(i2, chat, pc0Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = pc0Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                yv2 yv2Var = this.H;
                if (yv2Var != null) {
                    pc0Var.j(0L, yv2Var.i, yv2Var.j, null);
                    imageReceiver.d0(null, null, pc0Var, null, null, 0);
                } else {
                    pc0Var.j(0L, null, null, null);
                    imageReceiver.d0(null, null, pc0Var, null, null, 0);
                }
            }
        }
        if (sd2.Y(this.F)) {
            int L2 = gm.L(46.0f);
            Rect rect = ur3.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.F;
            if (chat2 == null || !chat2.monoforum) {
                L = gm.L(this.O0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.q0(L);
        if (i != 0) {
            int i3 = oc7.s5;
            boolean z2 = !(((i & 2) == 0 || this.E == null) && ((i & 8) == 0 || this.F == null)) && ((fileLocation2 = this.L) == null ? fileLocation3 != null : !(fileLocation3 != null && fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id));
            if (!z2 && (i & 4) != 0 && (user = this.E) != null) {
                TLRPC.UserStatus userStatus = user.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.K) {
                    z2 = true;
                }
            }
            if (!z2 && (524288 & i) != 0) {
                TLRPC.User user4 = this.E;
                if (user4 == null) {
                    TLRPC.Chat chat3 = this.F;
                    if (chat3 != null) {
                        z = chat3.verified;
                    }
                } else {
                    z = user4.verified;
                }
                z(z, user4, this.F, true);
            }
            if ((!z2 && (i & 1) != 0 && this.E != null) || ((i & 16) != 0 && this.F != null)) {
                if (this.E != null) {
                    j = this.E.first_name + this.E.last_name;
                } else {
                    TLRPC.Chat chat4 = this.F;
                    j = chat4.monoforum ? no4.j(i2, chat4, false) : chat4.title;
                }
                if (!j.equals(this.J)) {
                    z2 = true;
                }
            }
            if (!((z2 || !this.e0 || (i & 256) == 0 || (dialog = (TLRPC.Dialog) oc7.r1(i2).R.f(this.I)) == null || oc7.r1(i2).U0(dialog) == this.f0) ? z2 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.E;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.K = userStatus2.expires;
            } else {
                this.K = 0;
            }
            this.J = this.E.first_name + this.E.last_name;
        } else {
            TLRPC.Chat chat5 = this.F;
            if (chat5 != null) {
                this.J = chat5.monoforum ? no4.j(i2, chat5, false) : chat5.title;
            }
        }
        this.L = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            v();
        }
        postInvalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        long c;
        tm tmVar;
        boolean z3 = jb6.a0;
        tm tmVar2 = this.u0;
        tmVar2.a = z3;
        boolean z4 = this.I0;
        ylb ylbVar = this.x;
        if (z4) {
            if (z) {
                tmVar2.g(new sn2(cmb.e1, cmb.h1, 0, 0), z2);
                tmVar2.k(null);
            } else if (user != null && !this.M && pg3.f(user.emoji_status) != 0) {
                tmVar2.j(pg3.f(user.emoji_status), z2);
                tmVar2.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
            }
            c = user == null ? pg3.c(user) : chat != null ? pg3.c(chat) : 0L;
            tmVar = this.t0;
            if (c != 0 || this.M) {
                tmVar.g(null, z2);
            } else {
                tmVar.j(c, z2);
            }
            tmVar.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
        }
        if (!this.I0 || chat == null || this.M || pg3.f(chat.emoji_status) == 0) {
            if (this.I0 && user != null && !this.M) {
                oc7.r1(this.O);
                if (oc7.C2(user)) {
                    tmVar2.g(oj8.d().e, z2);
                    tmVar2.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
                }
            }
            tmVar2.g(null, z2);
            tmVar2.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
        } else {
            tmVar2.j(pg3.f(chat.emoji_status), z2);
            tmVar2.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
        }
        if (user == null) {
        }
        tmVar = this.t0;
        if (c != 0) {
        }
        tmVar.g(null, z2);
        tmVar.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
    }
}
