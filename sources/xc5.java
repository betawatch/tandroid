// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xc5 extends FrameLayout implements vlb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final ylb N;
    public final ln O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public nj8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final bf0 a;
    public final dg0 b;
    public final lka c;
    public final jh2 d;
    public final pc0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    /* JADX WARN: Multi-variable type inference failed */
    public xc5(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = z8c.t0;
        this.O = new ln(this, 0L, 350L, d53.h);
        this.N = ylbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z3 = jb6.a0;
        addView(bf0Var, qoe.d(46, 46.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i2 + 13, 6.0f, z3 ? i2 + 13 : 0.0f, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 2);
        this.b = dg0Var;
        nm7.i(dg0Var);
        anb.W(dg0Var, z2 ? cmb.dh : cmb.F6, ylbVar);
        dg0Var.setTypeface(gm.o());
        dg0Var.setTextSize(16);
        dg0Var.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z4 = jb6.a0;
        addView(dg0Var, qoe.d(-1, 20.0f, (z4 ? 5 : 3) | 48, (z4 ? 28 : 72) + i2, 10.0f, (z4 ? 72 : 28) + i2, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(14);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z5 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z5 ? 5 : 3) | 48, (z5 ? 28 : 72) + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.d = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z6 = jb6.a0;
            addView(jh2Var, qoe.d(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : i2 + 40, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static pc0 a(boolean z) {
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.f(8);
        pc0Var.p = z ? 0.8f : 1.1f;
        pc0Var.h(cmb.w0(null, cmb.S7, false), cmb.w0(null, cmb.Z7, false));
        return pc0Var;
    }

    public static sn2 b(Context context, boolean z) {
        sn2 sn2Var = new sn2(new f6(new nj8(cmb.Ck, cmb.Bk, -1, -1, null), (byte) 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z) {
            int L = gm.L(18.0f);
            int L2 = gm.L(18.0f);
            sn2Var.e = L;
            sn2Var.f = L2;
        }
        return sn2Var;
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.a(z, z2);
            return;
        }
        if (this.w != 2 || this.I == z) {
            return;
        }
        this.I = z;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new fh4(this, (byte) 10));
            this.H.addListener(new v85(this, (byte) 3));
            this.H.setDuration(180L);
            this.H.setInterpolator(d53.g);
            this.H.start();
        } else {
            float f = this.I ? 0.82f : 1.0f;
            bf0 bf0Var = this.a;
            bf0Var.setScaleX(f);
            bf0Var.setScaleY(this.I ? 0.82f : 1.0f);
            this.J = this.I ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        nj8 nj8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            bf0 bf0Var = this.a;
            float height = (bf0Var.getHeight() / 2.0f) + bf0Var.getY() + gm.L(18.0f);
            float width = (bf0Var.getWidth() / 2.0f) + bf0Var.getX() + gm.L(18.0f);
            canvas.save();
            Paint paint2 = cmb.s0;
            int i = cmb.c6;
            ylb ylbVar = this.N;
            paint2.setColor(cmb.v0(i, ylbVar));
            canvas.drawCircle(width, height, gm.L(11.33f) * d, cmb.s0);
            if (this.R == null) {
                nj8 nj8Var2 = this.T;
                if (nj8Var2 == null) {
                    nj8 nj8Var3 = new nj8(cmb.Bk, cmb.Ck, -1, -1, this.N);
                    this.T = nj8Var3;
                    nj8Var = nj8Var3;
                } else {
                    nj8Var = nj8Var2;
                }
                nj8Var.d((int) (width - gm.L(10.0f)), 0.0f, (int) (height - gm.L(10.0f)), (int) (gm.L(10.0f) + width), 0.0f, (int) (gm.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(cmb.v0(cmb.b8, ylbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, gm.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.U = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.U.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.U.setAlpha((int) (d * 255.0f));
            this.U.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z) {
        d(tLObject, str, str2);
        this.F = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i) {
        String str;
        TLRPC.Chat chat;
        String str2;
        String str3;
        TLRPC.UserStatus userStatus;
        CharSequence charSequence;
        char c;
        Object obj = this.f;
        if (obj == null || this.r || this.s) {
            return;
        }
        boolean z = obj instanceof String;
        ylb ylbVar = this.N;
        jh2 jh2Var = this.d;
        boolean z2 = this.L;
        bf0 bf0Var = this.a;
        dg0 dg0Var = this.b;
        pc0 pc0Var = this.e;
        lka lkaVar = this.c;
        if (z) {
            ((FrameLayout.LayoutParams) dg0Var.getLayoutParams()).topMargin = gm.L(15.0f);
            ViewGroup.LayoutParams layoutParams = bf0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = bf0Var.getLayoutParams();
            int L = gm.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (jh2Var != null) {
                ((FrameLayout.LayoutParams) jh2Var.getLayoutParams()).topMargin = gm.L(25.0f);
                if (jb6.a0) {
                    ((FrameLayout.LayoutParams) jh2Var.getLayoutParams()).rightMargin = gm.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) jh2Var.getLayoutParams()).leftMargin = gm.L(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            char c2 = 65535;
            switch (str4.hashCode()) {
                case -1716307998:
                    if (str4.equals("archived")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        c = 2;
                        c2 = c;
                        break;
                    }
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        c2 = '\t';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    pc0Var.f(11);
                    break;
                case 1:
                    pc0Var.f(6);
                    break;
                case 2:
                    pc0Var.f(5);
                    break;
                case 3:
                    pc0Var.f(4);
                    break;
                case 4:
                    pc0Var.f(24);
                    break;
                case 5:
                    pc0Var.f(8);
                    break;
                case 6:
                    pc0Var.f(10);
                    break;
                case 7:
                    pc0Var.f(9);
                    break;
                case '\b':
                    pc0Var.f(23);
                    break;
                case '\t':
                    pc0Var.f(7);
                    break;
            }
            this.y = null;
            dg0Var.l(this.h, true);
            lkaVar.l(null, false);
            bf0Var.o(null, "50_50", pc0Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) dg0Var.getLayoutParams()).topMargin = gm.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) dg0Var.getLayoutParams()).topMargin = gm.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = bf0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = bf0Var.getLayoutParams();
            int L2 = gm.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (jh2Var != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) jh2Var.getLayoutParams();
                int L3 = gm.L(29.0f);
                byte b = this.G;
                layoutParams5.topMargin = L3 + b;
                if (jb6.a0) {
                    ((FrameLayout.LayoutParams) jh2Var.getLayoutParams()).rightMargin = gm.L(40.0f) + b;
                } else {
                    ((FrameLayout.LayoutParams) jh2Var.getLayoutParams()).leftMargin = gm.L(40.0f) + b;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    int i2 = oc7.s5;
                    boolean z3 = ((i & 2) == 0 || fileLocation == null) ? false : true;
                    if (z3 || this.h != null || (str2 = this.y) == null || (i & 1) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return;
                    }
                } else {
                    str = null;
                }
                pc0Var.p(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    dg0Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    dg0Var.l(str, false);
                }
                if (this.n == null) {
                    int i3 = cmb.x6;
                    lkaVar.setTag(Integer.valueOf(i3));
                    if (z2) {
                        i3 = cmb.eh;
                    }
                    anb.W(lkaVar, i3, null);
                    lkaVar.setEmojiColor(lkaVar.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!sd2.T(chat2) || chat2.megagroup) {
                            lkaVar.l(jb6.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            lkaVar.l(jb6.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        lkaVar.l(jb6.M0(2131748399, null), false);
                    } else if (sd2.t0(chat2)) {
                        if (!sd2.T(chat2) || chat2.megagroup) {
                            lkaVar.l(jb6.M0(2131748395, null), false);
                        } else {
                            lkaVar.l(jb6.M0(2131752260, null), false);
                        }
                    } else if (!sd2.T(chat2) || chat2.megagroup) {
                        lkaVar.l(jb6.M0(2131748398, null), false);
                    } else {
                        lkaVar.l(jb6.M0(2131752271, null), false);
                    }
                }
                bf0Var.f(chat2, pc0Var);
                chat = chat2;
                bf0Var.setRoundRadius(gm.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    lkaVar.l(charSequence, true);
                    int i4 = cmb.x6;
                    lkaVar.setTag(Integer.valueOf(i4));
                    if (z2) {
                        i4 = cmb.eh;
                    }
                    anb.W(lkaVar, i4, ylbVar);
                    lkaVar.setEmojiColor(lkaVar.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.M && m9c.D(user)) {
                dg0Var.l(jb6.M0(2131745635, null), true);
                lkaVar.l(null, false);
                pc0Var.f(1);
                bf0Var.m(null, "50_50", pc0Var, user);
                ((FrameLayout.LayoutParams) dg0Var.getLayoutParams()).topMargin = gm.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i5 = oc7.s5;
                boolean z4 = ((i & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z4 && (i & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.E) {
                        z4 = true;
                    }
                }
                if (z4 || this.h != null || this.y == null || (i & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = m9c.r(user);
                    if (!str3.equals(this.y)) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    return;
                }
            } else {
                str3 = null;
            }
            pc0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.E = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                dg0Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = m9c.r(user);
                }
                this.y = str3;
                dg0Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i6 = cmb.x6;
                    lkaVar.setTag(Integer.valueOf(i6));
                    if (z2) {
                        i6 = cmb.eh;
                    }
                    anb.W(lkaVar, i6, ylbVar);
                    lkaVar.l(jb6.M0(2131753121, null), false);
                } else {
                    long j = user.id;
                    int i7 = this.x;
                    if (j == z8c.h(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || oc7.r1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                        int i8 = cmb.m6;
                        lkaVar.setTag(Integer.valueOf(i8));
                        if (z2) {
                            i8 = cmb.fh;
                        }
                        anb.W(lkaVar, i8, ylbVar);
                        lkaVar.l(jb6.M0(2131747559, null), false);
                    } else {
                        int i9 = cmb.x6;
                        lkaVar.setTag(Integer.valueOf(i9));
                        if (z2) {
                            i9 = cmb.eh;
                        }
                        anb.W(lkaVar, i9, ylbVar);
                        lkaVar.l(jb6.d0(i7, user, null, null), false);
                    }
                }
                lkaVar.setEmojiColor(lkaVar.getTextColor());
            }
            bf0Var.f(user, pc0Var);
        }
        chat = null;
        bf0Var.setRoundRadius(gm.L((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = oc7.r1(this.x).L2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == pg3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = pg3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public jh2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public lka getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.O.d(this.P);
        ylb ylbVar = this.N;
        if (d <= 0.0f && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = cmb.v0(cmb.V6, ylbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            bf0 bf0Var = this.a;
            canvas.drawCircle((bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft(), (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop(), (gm.L(4.0f) * this.J) + gm.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = jb6.a0;
            byte b = this.G;
            int L = gm.L(z ? 0.0f : b + 72);
            int measuredWidth = getMeasuredWidth() - gm.L(jb6.a0 ? b + 72 : 0.0f);
            if (!this.L) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), cmb.U0("paintDivider", ylbVar));
            } else {
                cmb.k0.setColor(cmb.v0(cmb.Wg, ylbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), cmb.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.d;
        if (jh2Var != null ? jh2Var.a.q : this.I) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z) {
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.setEnabled(z);
        }
    }

    public void setDrawDivider(boolean z) {
        this.F = z;
        invalidate();
    }

    public void setForbiddenCheck(boolean z) {
        this.d.setForbidden(z);
    }

    @Override // vlb
    public final void updateColors() {
        int textColor;
        lka lkaVar = this.c;
        if (lkaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = lkaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    lkaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        bf0 bf0Var = this.a;
        if (bf0Var != null) {
            bf0Var.invalidate();
        }
        try {
            if (!this.s || bf0Var == null) {
                return;
            }
            Drawable t = bf0Var.getImageReceiver().t();
            if (t instanceof pc0) {
                ((pc0) t).h(cmb.w0(null, cmb.S7, false), cmb.w0(null, cmb.Z7, false));
                bf0Var.invalidate();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public xc5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
