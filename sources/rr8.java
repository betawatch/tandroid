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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rr8 extends hf0 implements gk7, tjb {
    public final RectF A0;
    public final wf2 B0;
    public boolean C0;
    public p8c D0;
    public TLRPC.User E;
    public i8c E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public nu2 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final n41 J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public tgb M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public mh8 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public ra1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public p48 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public final lm n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public final ImageReceiver r;
    public int r0;
    public final pb0 s;
    public StaticLayout s0;
    public final tl t0;
    public final tl u0;
    public final u2b v0;
    public CharSequence w;
    public final RectF w0;
    public final wjb x;
    public tgb x0;
    public TLRPC.TL_sponsoredPeer y;
    public Paint y0;
    public final n41 z0;

    public rr8(Context context, wjb wjbVar) {
        super(context);
        this.O = y6c.t0;
        this.g0 = gl.L(19.0f);
        this.n0 = new lm(this, 0L, 350L, s33.h);
        this.v0 = new u2b(null, false);
        this.w0 = new RectF();
        this.z0 = new n41(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new n41(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = zkb.b;
        this.x = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gl.L(23.0f));
        this.s = new pb0((wjb) null);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.B0 = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var);
        tl tlVar = new tl(gl.L(20.0f), this);
        this.t0 = tlVar;
        tlVar.setCallback(this);
        tl tlVar2 = new tl(gl.L(20.0f), this);
        this.u0 = tlVar2;
        tlVar2.setCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i) {
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
        pb0 pb0Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user2 != null) {
            pb0Var.q(user2);
            if (l7c.B(this.E)) {
                pb0Var.f(12);
                imageReceiver.d0(null, null, pb0Var, null, null, 0);
            } else if (this.M) {
                pb0Var.f(1);
                imageReceiver.d0(null, null, pb0Var, null, null, 0);
            } else {
                TLRPC.User user3 = this.E;
                TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.a0(gl5.m(i2, 1, user3), "50_50", gl5.m(y6c.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = pb0Var;
                fileLocation = fileLocation3;
                imageReceiver.a0(gl5.m(i2, 1, user3), "50_50", gl5.m(y6c.t0, 2, this.E), "50_50", drawable2, this.E, 0);
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
                            pb0Var.p(chat);
                            imageReceiver.a0(gl5.m(i2, 1, this.F), "50_50", gl5.m(y6c.t0, 2, this.F), "50_50", drawable, this.F, 0);
                        } else {
                            mm4.p(i2, chat, pb0Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = pb0Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                nu2 nu2Var = this.H;
                if (nu2Var != null) {
                    pb0Var.j(0L, nu2Var.i, nu2Var.j, null);
                    imageReceiver.d0(null, null, pb0Var, null, null, 0);
                } else {
                    pb0Var.j(0L, null, null, null);
                    imageReceiver.d0(null, null, pb0Var, null, null, 0);
                }
            }
        }
        if (hc2.Y(this.F)) {
            int L2 = gl.L(46.0f);
            Rect rect = kq3.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.F;
            if (chat2 == null || !chat2.monoforum) {
                L = gl.L(this.O0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.q0(L);
        if (i != 0) {
            int i3 = na7.q5;
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
                D(z, user4, this.F, true);
            }
            if ((!z2 && (i & 1) != 0 && this.E != null) || ((i & 16) != 0 && this.F != null)) {
                if (this.E != null) {
                    j = this.E.first_name + this.E.last_name;
                } else {
                    TLRPC.Chat chat4 = this.F;
                    j = chat4.monoforum ? mm4.j(i2, chat4, false) : chat4.title;
                }
                if (!j.equals(this.J)) {
                    z2 = true;
                }
            }
            if (!((z2 || !this.e0 || (i & 256) == 0 || (dialog = (TLRPC.Dialog) na7.q1(i2).R.f(this.I)) == null || na7.q1(i2).T0(dialog) == this.f0) ? z2 : true)) {
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
                this.J = chat5.monoforum ? mm4.j(i2, chat5, false) : chat5.title;
            }
        }
        this.L = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            x();
        }
        postInvalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        long c;
        tl tlVar;
        boolean z3 = k96.a0;
        tl tlVar2 = this.u0;
        tlVar2.a = z3;
        boolean z4 = this.I0;
        wjb wjbVar = this.x;
        if (z4) {
            if (z) {
                tlVar2.g(new fm2(bkb.e1, bkb.h1, 0, 0), z2);
                tlVar2.k(null);
            } else if (user != null && !this.M && cf3.f(user.emoji_status) != 0) {
                tlVar2.j(cf3.f(user.emoji_status), z2);
                tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
            }
            c = user == null ? cf3.c(user) : chat != null ? cf3.c(chat) : 0L;
            tlVar = this.t0;
            if (c != 0 || this.M) {
                tlVar.g(null, z2);
            } else {
                tlVar.j(c, z2);
            }
            tlVar.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
        }
        if (!this.I0 || chat == null || this.M || cf3.f(chat.emoji_status) == 0) {
            if (this.I0 && user != null && !this.M) {
                na7.q1(this.O);
                if (na7.A2(user)) {
                    tlVar2.g(nh8.d().e, z2);
                    tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
                }
            }
            tlVar2.g(null, z2);
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
        } else {
            tlVar2.j(cf3.f(chat.emoji_status), z2);
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
        }
        if (user == null) {
        }
        tlVar = this.t0;
        if (c != 0) {
        }
        tlVar.g(null, z2);
        tlVar.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.o6));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            invalidate();
            return;
        }
        if (i == kk7.j3) {
            TLRPC.User user = this.E;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i3 = this.O;
            if (user == null) {
                TLRPC.Chat chat = this.F;
                if (chat == null) {
                    nu2 nu2Var = this.H;
                    if (nu2Var == null) {
                        return;
                    }
                    if (this.m0 && nu2Var.m != null) {
                        requirementToContact = na7.q1(i3).J2(this.H.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.m0) {
                requirementToContact = na7.q1(i3).J2(this.E.id);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.o0 == z && this.p0 == cf3.j(requirementToContact)) {
                return;
            }
            this.o0 = z;
            this.p0 = cf3.j(requirementToContact);
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
        kk7.e().b(this, kk7.k4);
        if (this.m0) {
            kk7.e().b(this, kk7.j3);
        }
        this.u0.a();
        this.t0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        kk7.e().n(this, kk7.k4);
        if (this.m0) {
            kk7.e().n(this, kk7.j3);
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
        mh8 mh8Var;
        int ceil;
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        boolean z = this.N;
        wjb wjbVar = this.x;
        if (z) {
            Paint d = (!this.F0 || wjbVar == null) ? null : wjbVar.d("paintDivider");
            if (d == null) {
                d = bkb.j0;
            }
            Paint paint = d;
            if (k96.a0) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - gl.L(gl.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(gl.L(gl.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.S) {
            hf0.t(this.T, this.U, bkb.Z0);
            bkb.Z0.draw(canvas2);
        }
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            boolean z2 = k96.a0;
            tl tlVar = this.t0;
            if (z2) {
                ceil = (int) (staticLayout.getLineRight(0) + this.P + gl.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.P - gl.L(3.0f)) - tlVar.s;
            } else {
                f = 6.0f;
                ceil = (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gl.L(3.0f)) - tlVar.s);
                hf0.u(tlVar, ceil, ((this.R.getHeight() - tlVar.s) / 2.0f) + this.Q);
                tlVar.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.P, this.Q);
                this.R.draw(canvas2);
                canvas2.restore();
                boolean z3 = k96.a0;
                tl tlVar2 = this.u0;
                hf0.u(tlVar2, !z3 ? this.R.getLineLeft(0) == 0.0f ? (this.P - gl.L(3.0f)) - tlVar2.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gl.L(3.0f)) - tlVar2.s) : (int) (this.R.getLineRight(0) + this.P + gl.L(f)), ((this.R.getHeight() - tlVar2.s) / 2.0f) + this.Q);
                tlVar2.draw(canvas2);
            }
            f = 6.0f;
            hf0.u(tlVar, ceil, ((this.R.getHeight() - tlVar.s) / 2.0f) + this.Q);
            tlVar.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.P, this.Q);
            this.R.draw(canvas2);
            canvas2.restore();
            boolean z32 = k96.a0;
            tl tlVar22 = this.u0;
            hf0.u(tlVar22, !z32 ? this.R.getLineLeft(0) == 0.0f ? (this.P - gl.L(3.0f)) - tlVar22.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - gl.L(3.0f)) - tlVar22.s) : (int) (this.R.getLineRight(0) + this.P + gl.L(f)), ((this.R.getHeight() - tlVar22.s) / 2.0f) + this.Q);
            tlVar22.draw(canvas2);
        } else {
            f = 6.0f;
        }
        if (this.y == null || this.x0 == null || this.y0 == null) {
            f2 = 2.0f;
        } else {
            int v0 = bkb.v0(bkb.Ei, wjbVar);
            this.y0.setColor(bkb.p1(0.1f, v0));
            int L = gl.L(12.66f) + ((int) this.x0.j());
            int L2 = gl.L(17.33f);
            float L3 = k96.a0 ? gl.L(12.0f) : ls6.x(12.0f, getWidth(), L);
            int i = this.Q;
            f2 = 2.0f;
            float f3 = f;
            RectF rectF = this.w0;
            rectF.set(L3, i, r6 + L, i + L2);
            rectF.inset(-gl.L(f3), -gl.L(f3));
            canvas2.save();
            float a = this.z0.a(0.1f);
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas2.translate(L3, this.Q);
            RectF rectF2 = gl.P;
            float f4 = L2;
            rectF2.set(0.0f, 0.0f, L, f4);
            float f5 = f4 / 2.0f;
            canvas2.drawRoundRect(rectF2, f5, f5, this.y0);
            this.x0.c(gl.L(6.33f), f5, 1.0f, v0, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.s0 != null) {
            canvas2.save();
            canvas2.translate(this.r0 + this.c0, gl.L(this.N0 ? 35.0f : 33.0f) + this.d0);
            this.s0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.j0;
        int i2 = this.g0;
        if (staticLayout2 != null) {
            int L4 = this.h0 - gl.L(5.5f);
            float L5 = gl.L(11.0f) + L4 + this.i0;
            float L6 = gl.L(23.0f) + i2;
            RectF rectF3 = this.A0;
            rectF3.set(L4, i2, L5, L6);
            float f6 = gl.p * 11.5f;
            canvas2.drawRoundRect(rectF3, f6, f6, na7.q1(this.O).n2(this.I, 0L, null) ? bkb.x0 : bkb.v0);
            canvas2.save();
            canvas2.translate(this.h0, gl.L(4.0f) + i2);
            this.j0.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            ra1 ra1Var = this.W;
            int w0 = bkb.w0(null, bkb.T8, false);
            int w02 = bkb.w0(null, bkb.V8, false);
            ra1Var.g.setColor(w0);
            ff0 ff0Var = ra1Var.e;
            if (ff0Var != null) {
                bkb.F1(ff0Var, w02, true);
            }
            RectF rectF4 = gl.P;
            rectF4.set(this.b0, i2, this.a0.getWidth() + r12, gl.L(23.0f) + i2);
            rectF4.inset(-gl.L(16.0f), -gl.L(4.0f));
            ra1 ra1Var2 = this.W;
            ra1Var2.i = false;
            ra1Var2.c = 0;
            ra1Var2.a(rectF4);
            ra1 ra1Var3 = this.W;
            ra1Var3.n = true;
            ra1Var3.c(canvas2, ra1Var3.g);
            ff0 ff0Var2 = ra1Var3.e;
            if (ff0Var2 != null) {
                ff0Var2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.b0, gl.L(4.0f) + i2);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        boolean z4 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z4) {
            TLRPC.Chat chat = this.F;
            u2b u2bVar = this.v0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.E;
                if (user != null) {
                    x2b.h(user.id, canvas2, imageReceiver, u2bVar);
                } else if (chat != null) {
                    if (hc2.Y(chat)) {
                        Drawable drawable = bkb.R0;
                        RectF rectF5 = u2bVar.F;
                        RectF rectF6 = u2bVar.F;
                        kq3.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    x2b.h(-this.F.id, canvas2, imageReceiver, u2bVar);
                } else {
                    imageReceiver.k0(u2bVar.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                p48 p48Var = this.h;
                if (p48Var == null) {
                    p48Var = new p48();
                    this.h = p48Var;
                }
                RectF rectF7 = u2bVar.F;
                RectF rectF8 = u2bVar.F;
                p48Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f2));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.k0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d2 = this.n0.d(this.o0);
        if (d2 > 0.0f) {
            float s = imageReceiver.s() + gl.L(14.0f);
            float r = imageReceiver.r() + gl.L(16.0f);
            canvas2.save();
            bkb.s0.setColor(bkb.v0(bkb.c6, wjbVar));
            canvas2.drawCircle(r, s, gl.L(11.33f) * d2, bkb.s0);
            mh8 mh8Var2 = this.P0;
            if (mh8Var2 == null) {
                mh8Var = new mh8(bkb.Bk, bkb.Ck, -1, -1, this.x);
                this.P0 = mh8Var;
            } else {
                mh8Var = mh8Var2;
            }
            mh8Var.d((int) (r - gl.L(10.0f)), 0.0f, (int) (s - gl.L(10.0f)), (int) (gl.L(10.0f) + r), 0.0f, (int) (gl.L(10.0f) + s));
            canvas2.drawCircle(r, s, gl.L(10.0f) * d2, this.P0.f);
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
        float L7 = gl.L(28.0f) + this.M0.c;
        float L8 = k96.a0 ? gl.L(15.0f) : (getWidth() - L7) - gl.L(15.0f);
        float L9 = gl.L(28.0f);
        int w03 = bkb.w0(null, bkb.Ei, false);
        Paint paint2 = this.K0;
        paint2.setColor(w03);
        float height = (getHeight() + L9) / f2;
        RectF rectF9 = this.L0;
        rectF9.set(L8, (getHeight() - L9) / f2, L7 + L8, height);
        canvas2.save();
        float a2 = this.J0.a(0.06f);
        canvas2.scale(a2, a2, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f2, rectF9.height() / f2, paint2);
        this.M0.c(L8 + gl.L(14.0f), getHeight() / f2, 1.0f, -1, canvas);
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
            sb.append(k96.M0(2131754738, null));
            sb.append("\n");
        }
        if (this.s0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.s0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        wf2 wf2Var = this.B0;
        if (wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(wf2Var.a.q);
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
        wf2 wf2Var = this.B0;
        if (wf2Var != null) {
            int L = k96.a0 ? (i3 - i) - gl.L(42.0f) : gl.L(42.0f);
            int L2 = gl.L(36.0f);
            wf2Var.layout(L, L2, wf2Var.getMeasuredWidth() + L, wf2Var.getMeasuredHeight() + L2);
        }
        if (z) {
            x();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        wf2 wf2Var = this.B0;
        if (wf2Var != null) {
            wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.N0 ? gl.L(56.0f) : gl.L(60.0f) + (this.N ? 1 : 0));
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
        ra1 ra1Var;
        if (this.q0 && this.D0 != null && this.E != null) {
            boolean contains = this.L0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            n41 n41Var = this.J0;
            if (action == 0 || motionEvent.getAction() == 2) {
                n41Var.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (n41Var.i) {
                        this.D0.a(this.E);
                    }
                    n41Var.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    n41Var.c(false);
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
            n41 n41Var2 = this.z0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                n41Var2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (n41Var2.i) {
                        this.E0.a(this, this.y);
                    }
                    n41Var2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    n41Var2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.E == null && this.F == null) || !this.v0.a(this, motionEvent)) && ((ra1Var = this.W) == null || !ra1Var.b(motionEvent))) {
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

    public void setOnSponsoredOptionsClick(i8c i8cVar) {
        this.E0 = i8cVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.q0 == z) {
            return;
        }
        tgb tgbVar = this.M0;
        if (tgbVar == null) {
            tgbVar = new tgb(k96.M0(2131753008, null), 14.0f, gl.o());
            this.M0 = tgbVar;
        }
        if (z) {
            i = gl.L(30.0f) + ((int) tgbVar.c);
        } else {
            i = 0;
        }
        if (k96.a0) {
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
        A(0);
    }

    @Override // tjb
    public final void updateColors() {
        int i = this.R0;
        int i2 = zkb.b;
        if (i == i2) {
            if (this.R == null || getMeasuredWidth() <= 0) {
                return;
            }
            x();
            return;
        }
        this.R0 = i2;
        try {
            A(0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.u0 == drawable || this.t0 == drawable || super.verifyDrawable(drawable);
    }

    public final void x() {
        TLRPC.Chat K0;
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
            this.I = cf3.E(encryptedChat.id);
            if (k96.a0) {
                this.T = (getMeasuredWidth() - gl.L(gl.C + 2)) - bkb.Z0.getIntrinsicWidth();
                this.P = gl.L(11.0f);
            } else {
                this.T = gl.L(gl.C);
                this.P = bkb.Z0.getIntrinsicWidth() + gl.L(r2 + 4);
            }
            this.U = gl.L(22.0f);
            D(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                this.I = -chat.id;
                this.l0 = chat.verified;
                if (chat.monoforum && (K0 = na7.q1(i2).K0(Long.valueOf(this.F.linked_monoforum_id))) != null) {
                    this.l0 = K0.verified;
                }
                if (k96.a0) {
                    this.P = gl.L(11.0f);
                } else {
                    this.P = gl.L(gl.C);
                }
                D(this.l0, null, this.F, false);
            } else {
                TLRPC.User user = this.E;
                if (user != null) {
                    this.I = user.id;
                    if (k96.a0) {
                        this.P = gl.L(11.0f);
                    } else {
                        this.P = gl.L(gl.C);
                    }
                    this.U = gl.L(21.0f);
                    TLRPC.User user2 = this.E;
                    this.l0 = user2.verified;
                    if (!this.M) {
                        na7.q1(i2);
                        user2 = this.E;
                    }
                    D(this.l0, user2, null, false);
                } else if (this.H != null) {
                    this.I = 0L;
                    if (k96.a0) {
                        this.P = gl.L(11.0f);
                    } else {
                        this.P = gl.L(gl.C);
                    }
                    if (this.W == null) {
                        ra1 ra1Var = new ra1(this);
                        this.W = ra1Var;
                        ra1Var.h = new w88(this, (byte) 29);
                    }
                }
            }
        }
        if (k96.a0) {
            this.r0 = gl.L(11.0f);
        } else {
            this.r0 = gl.L(gl.C);
        }
        if (this.y != null) {
            if (this.x0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(k96.M0(2131745643, null)).append((CharSequence) " i");
                cm2 cm2Var = new cm2(R.drawable.ic_ab_other, 0);
                cm2Var.I = 0.55f;
                cm2Var.J = 0.55f;
                cm2Var.H = 0.7f;
                cm2Var.r = -gl.L(2.0f);
                cm2Var.s = 0.0f;
                append.setSpan(cm2Var, append.length() - 1, append.length(), 33);
                this.x0 = new tgb(append, 12.0f, null);
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
        wjb wjbVar = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat K02 = na7.q1(i2).K0(Long.valueOf(this.F.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (K02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.U(K02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) k96.M0(2131748155, null));
                    spannableStringBuilder.setSpan(new od4(k96.M0(2131748155, null), bkb.x6, wjbVar), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = gl.C2(gl.A2(this.F.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = gl.C2(gl.A2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user3 = this.E;
            charSequence4 = charSequence3;
            if (user3 != null) {
                charSequence4 = gl.C2(gl.A2(l7c.r(user3)));
            }
        }
        CharSequence J2 = gl.J2(charSequence4);
        if (TextUtils.isEmpty(J2)) {
            TLRPC.User user4 = this.E;
            J2 = (user4 == null || TextUtils.isEmpty(user4.phone)) ? k96.M0(2131749136, null) : yjb.k(new StringBuilder("+"), this.E.phone, p38.f());
        }
        if (this.F0) {
            if (this.G0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.G0 = textPaint2;
                textPaint2.setTypeface(gl.o());
            }
            this.G0.setTextSize(gl.L(this.N0 ? 15.0f : 16.0f));
            TLRPC.EncryptedChat encryptedChat2 = this.G;
            TextPaint textPaint3 = this.G0;
            if (encryptedChat2 != null) {
                textPaint3.setColor(bkb.v0(bkb.Y8, wjbVar));
            } else {
                textPaint3.setColor(bkb.v0(bkb.W8, wjbVar));
            }
            textPaint = this.G0;
        } else {
            textPaint = this.G != null ? bkb.D0 : bkb.C0;
        }
        TextPaint textPaint4 = textPaint;
        if (k96.a0) {
            measuredWidth = (getMeasuredWidth() - this.P) - gl.L(gl.C);
            this.V = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.P) - gl.L(14.0f);
            this.V = measuredWidth;
        }
        int i3 = measuredWidth;
        if (this.S) {
            i3 -= bkb.Z0.getIntrinsicWidth() + gl.L(6.0f);
            this.V = i3;
        }
        if (this.y != null) {
            int L2 = gl.L(20.66f) + ((int) this.x0.c);
            i3 = this.V - L2;
            this.V = i3;
            if (k96.a0) {
                this.P += L2;
            }
        }
        if (this.H != null) {
            int measureText = (int) (bkb.K0.measureText(k96.M0(2131748982, null)) + 1.0f);
            this.a0 = new StaticLayout(k96.M0(2131748982, null), bkb.K0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (k96.a0) {
                this.b0 = gl.L(16.0f) + gl.L(19.0f);
                this.P += measureText;
                this.r0 += measureText;
            } else {
                this.b0 = ((getMeasuredWidth() - measureText) - gl.L(19.0f)) - gl.L(16.0f);
            }
            i3 = ug8.B(32.0f, measureText, this.V);
            this.V = i3;
        }
        this.V = i3 - (getPaddingRight() + getPaddingLeft());
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.e0) {
            int T0 = na7.q1(i2).T0((TLRPC.Dialog) na7.q1(i2).R.f(this.I));
            if (T0 != 0) {
                this.f0 = T0;
                Locale locale = Locale.US;
                String valueOf = String.valueOf(T0);
                this.i0 = Math.max(gl.L(12.0f), (int) Math.ceil(bkb.K0.measureText(valueOf)));
                this.j0 = new StaticLayout(valueOf, bkb.K0, this.i0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = gl.L(18.0f) + this.i0;
                this.V -= L3;
                paddingRight -= L3;
                if (k96.a0) {
                    this.h0 = gl.L(19.0f);
                    this.P += L3;
                    this.r0 += L3;
                } else {
                    this.h0 = (getMeasuredWidth() - this.i0) - gl.L(19.0f);
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
        tl tlVar = this.t0;
        boolean d = tlVar.d();
        int i5 = tlVar.s;
        if (!d) {
            if (k96.a0) {
                this.V -= i5;
            } else {
                this.P += i5;
            }
        }
        tl tlVar2 = this.u0;
        if (!tlVar2.d() && !k96.a0) {
            this.V -= tlVar2.s;
        }
        int i6 = this.V;
        if (i6 < 0) {
            this.V = 0;
            i6 = 0;
        }
        float L4 = i6 - gl.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(J2, textPaint4, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = vu3.m(ellipsize, textPaint4.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i7 = this.V;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(charSequence5, textPaint4, i7, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = bkb.P0;
        TLRPC.Chat chat3 = this.F;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user5 = this.E;
                if (user5 == null) {
                    charSequence = null;
                } else if (na7.E2(user5)) {
                    charSequence = k96.M0(2131744084, null);
                } else {
                    TLRPC.User user6 = this.E;
                    if (user6.bot) {
                        int i8 = user6.bot_active_users;
                        charSequence = i8 != 0 ? k96.H(' ', "BotUsersShort", i8) : k96.M0(2131753153, null);
                    } else {
                        long j = user6.id;
                        if (j == 489000) {
                            charSequence = k96.M0(2131743377, null);
                        } else if (l7c.C(j)) {
                            charSequence = k96.M0(2131745369, null);
                        } else {
                            boolean[] zArr = this.k0;
                            if (zArr == null) {
                                zArr = new boolean[1];
                                this.k0 = zArr;
                            }
                            zArr[0] = false;
                            charSequence = k96.d0(i2, this.E, zArr, null);
                            if (this.k0[0]) {
                                textPaint5 = bkb.O0;
                            }
                            TLRPC.User user7 = this.E;
                            if (user7 != null && (user7.id == y6c.h(i2).e() || ((userStatus = this.E.status) != null && userStatus.expires > ConnectionsManager.getInstance(i2).getCurrentTime()))) {
                                textPaint5 = bkb.O0;
                                charSequence = k96.M0(2131747633, null);
                            }
                        }
                    }
                }
            }
            if (this.M || l7c.B(this.E)) {
                this.Q = gl.L(20.0f);
                charSequence = null;
            }
        } else {
            if (hc2.Y(chat3)) {
                charSequence = k96.M0(2131751978, null).toLowerCase();
            } else {
                boolean V = hc2.V(this.F);
                TLRPC.Chat chat4 = this.F;
                if (V) {
                    int i9 = chat4.participants_count;
                    charSequence = i9 != 0 ? k96.H(',', "Subscribers", i9) : !hc2.t0(chat4) ? k96.M0(2131752317, null).toLowerCase() : k96.M0(2131752306, null).toLowerCase();
                } else {
                    int i10 = chat4.participants_count;
                    charSequence = i10 != 0 ? k96.H(',', "Members", i10) : chat4.has_geo ? k96.M0(2131748450, null) : hc2.p0(chat4) ? k96.M0(2131748156, null) : !hc2.t0(this.F) ? k96.M0(2131748449, null).toLowerCase() : k96.M0(2131748446, null).toLowerCase();
                }
            }
            this.Q = gl.L(19.0f);
        }
        if (this.F0) {
            TextPaint textPaint6 = this.H0;
            if (textPaint6 == null) {
                textPaint6 = new TextPaint(1);
                this.H0 = textPaint6;
            }
            textPaint6.setTextSize(gl.L(this.N0 ? 13.0f : 15.0f));
            if (textPaint5 == bkb.P0) {
                this.H0.setColor(bkb.v0(bkb.z6, wjbVar));
            } else if (textPaint5 == bkb.O0) {
                this.H0.setColor(bkb.v0(bkb.o6, wjbVar));
            }
            textPaint5 = this.H0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i = i4;
            this.Q = gl.L(20.0f);
            this.s0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i4 - gl.L(12.0f), truncateAt), textPaint5, i4, alignment, 1.0f, 0.0f, false);
            i = i4;
            this.s0 = staticLayout;
            this.Q = gl.L(9.0f);
            this.U -= gl.L(10.0f);
        }
        if (k96.a0) {
            L = (getMeasuredWidth() - gl.L(57.0f)) - getPaddingRight();
        } else {
            L = gl.L(this.N0 ? 14.0f : this.O0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.v0.F.set(L, gl.L(this.N0 ? 6.0f : 7.0f), gl.L(this.N0 ? 44.0f : this.O0 ? 42.0f : 46.0f) + L, gl.L(this.N0 ? 44.0f : 46.0f) + gl.L(this.N0 ? 6.0f : 7.0f));
        boolean z = k96.a0;
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
            this.P = gl.L(1.0f) + this.P;
            this.Q = gl.L(1.0f) + this.Q;
        }
    }

    public final void y(boolean z, boolean z2) {
        wf2 wf2Var = this.B0;
        if (wf2Var == null) {
            return;
        }
        wf2Var.a(z, z2);
    }

    public final void z(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
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
            TL_account.RequirementToContact J2 = this.m0 ? na7.q1(i).J2(this.E.id) : null;
            this.o0 = J2 instanceof TL_account.requirementToContactPremium;
            this.p0 = cf3.j(J2);
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
            this.p0 = cf3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof nu2) {
            nu2 nu2Var = (nu2) obj;
            this.H = nu2Var;
            this.F = null;
            this.E = null;
            if (this.m0 && nu2Var.m != null) {
                requirementToContact = na7.q1(i).J2(this.H.m.id);
            }
            this.o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.p0 = cf3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        A(0);
    }
}
