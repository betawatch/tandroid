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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class za5 extends FrameLayout implements tjb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final wjb N;
    public final lm O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public mh8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final be0 a;
    public final df0 b;
    public final jia c;
    public final wf2 d;
    public final pb0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    /* JADX WARN: Multi-variable type inference failed */
    public za5(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = y6c.t0;
        this.O = new lm(this, 0L, 350L, s33.h);
        this.N = wjbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z3 = k96.a0;
        addView(be0Var, nme.d(46, 46.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i2 + 13, 6.0f, z3 ? i2 + 13 : 0.0f, 0.0f));
        df0 df0Var = new df0(context, (byte) 2);
        this.b = df0Var;
        kk7.i(df0Var);
        zkb.W(df0Var, z2 ? bkb.dh : bkb.F6, wjbVar);
        df0Var.setTypeface(gl.o());
        df0Var.setTextSize(16);
        df0Var.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z4 = k96.a0;
        addView(df0Var, nme.d(-1, 20.0f, (z4 ? 5 : 3) | 48, (z4 ? 28 : 72) + i2, 10.0f, (z4 ? 72 : 28) + i2, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z5 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z5 ? 5 : 3) | 48, (z5 ? 28 : 72) + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.d = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z6 = k96.a0;
            addView(wf2Var, nme.d(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : i2 + 40, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static pb0 a(boolean z) {
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.f(8);
        pb0Var.p = z ? 0.8f : 1.1f;
        pb0Var.h(bkb.w0(null, bkb.S7, false), bkb.w0(null, bkb.Z7, false));
        return pb0Var;
    }

    public static fm2 b(Context context, boolean z) {
        fm2 fm2Var = new fm2(new f6(new mh8(bkb.Ck, bkb.Bk, -1, -1, null), (byte) 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z) {
            int L = gl.L(18.0f);
            int L2 = gl.L(18.0f);
            fm2Var.e = L;
            fm2Var.f = L2;
        }
        return fm2Var;
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.a(z, z2);
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
            ofFloat.addUpdateListener(new ni4(this, (byte) 8));
            this.H.addListener(new v85(this, (byte) 1));
            this.H.setDuration(180L);
            this.H.setInterpolator(s33.g);
            this.H.start();
        } else {
            float f = this.I ? 0.82f : 1.0f;
            be0 be0Var = this.a;
            be0Var.setScaleX(f);
            be0Var.setScaleY(this.I ? 0.82f : 1.0f);
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
        mh8 mh8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            be0 be0Var = this.a;
            float height = (be0Var.getHeight() / 2.0f) + be0Var.getY() + gl.L(18.0f);
            float width = (be0Var.getWidth() / 2.0f) + be0Var.getX() + gl.L(18.0f);
            canvas.save();
            Paint paint2 = bkb.s0;
            int i = bkb.c6;
            wjb wjbVar = this.N;
            paint2.setColor(bkb.v0(i, wjbVar));
            canvas.drawCircle(width, height, gl.L(11.33f) * d, bkb.s0);
            if (this.R == null) {
                mh8 mh8Var2 = this.T;
                if (mh8Var2 == null) {
                    mh8 mh8Var3 = new mh8(bkb.Bk, bkb.Ck, -1, -1, this.N);
                    this.T = mh8Var3;
                    mh8Var = mh8Var3;
                } else {
                    mh8Var = mh8Var2;
                }
                mh8Var.d((int) (width - gl.L(10.0f)), 0.0f, (int) (height - gl.L(10.0f)), (int) (gl.L(10.0f) + width), 0.0f, (int) (gl.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(bkb.v0(bkb.b8, wjbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, gl.L(10.0f) * d, paint);
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
        wjb wjbVar = this.N;
        wf2 wf2Var = this.d;
        boolean z2 = this.L;
        be0 be0Var = this.a;
        df0 df0Var = this.b;
        pb0 pb0Var = this.e;
        jia jiaVar = this.c;
        if (z) {
            ((FrameLayout.LayoutParams) df0Var.getLayoutParams()).topMargin = gl.L(15.0f);
            ViewGroup.LayoutParams layoutParams = be0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = be0Var.getLayoutParams();
            int L = gl.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (wf2Var != null) {
                ((FrameLayout.LayoutParams) wf2Var.getLayoutParams()).topMargin = gl.L(25.0f);
                if (k96.a0) {
                    ((FrameLayout.LayoutParams) wf2Var.getLayoutParams()).rightMargin = gl.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) wf2Var.getLayoutParams()).leftMargin = gl.L(32.0f);
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
                    pb0Var.f(11);
                    break;
                case 1:
                    pb0Var.f(6);
                    break;
                case 2:
                    pb0Var.f(5);
                    break;
                case 3:
                    pb0Var.f(4);
                    break;
                case 4:
                    pb0Var.f(24);
                    break;
                case 5:
                    pb0Var.f(8);
                    break;
                case 6:
                    pb0Var.f(10);
                    break;
                case 7:
                    pb0Var.f(9);
                    break;
                case '\b':
                    pb0Var.f(23);
                    break;
                case '\t':
                    pb0Var.f(7);
                    break;
            }
            this.y = null;
            df0Var.l(this.h, true);
            jiaVar.l(null, false);
            be0Var.o(null, "50_50", pb0Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) df0Var.getLayoutParams()).topMargin = gl.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) df0Var.getLayoutParams()).topMargin = gl.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = be0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = be0Var.getLayoutParams();
            int L2 = gl.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (wf2Var != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) wf2Var.getLayoutParams();
                int L3 = gl.L(29.0f);
                byte b = this.G;
                layoutParams5.topMargin = L3 + b;
                if (k96.a0) {
                    ((FrameLayout.LayoutParams) wf2Var.getLayoutParams()).rightMargin = gl.L(40.0f) + b;
                } else {
                    ((FrameLayout.LayoutParams) wf2Var.getLayoutParams()).leftMargin = gl.L(40.0f) + b;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    int i2 = na7.q5;
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
                pb0Var.p(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    df0Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    df0Var.l(str, false);
                }
                if (this.n == null) {
                    int i3 = bkb.x6;
                    jiaVar.setTag(Integer.valueOf(i3));
                    if (z2) {
                        i3 = bkb.eh;
                    }
                    zkb.W(jiaVar, i3, null);
                    jiaVar.setEmojiColor(jiaVar.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!hc2.T(chat2) || chat2.megagroup) {
                            jiaVar.l(k96.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            jiaVar.l(k96.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        jiaVar.l(k96.M0(2131748450, null), false);
                    } else if (hc2.t0(chat2)) {
                        if (!hc2.T(chat2) || chat2.megagroup) {
                            jiaVar.l(k96.M0(2131748446, null), false);
                        } else {
                            jiaVar.l(k96.M0(2131752306, null), false);
                        }
                    } else if (!hc2.T(chat2) || chat2.megagroup) {
                        jiaVar.l(k96.M0(2131748449, null), false);
                    } else {
                        jiaVar.l(k96.M0(2131752317, null), false);
                    }
                }
                be0Var.f(chat2, pb0Var);
                chat = chat2;
                be0Var.setRoundRadius(gl.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    jiaVar.l(charSequence, true);
                    int i4 = bkb.x6;
                    jiaVar.setTag(Integer.valueOf(i4));
                    if (z2) {
                        i4 = bkb.eh;
                    }
                    zkb.W(jiaVar, i4, wjbVar);
                    jiaVar.setEmojiColor(jiaVar.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.M && l7c.D(user)) {
                df0Var.l(k96.M0(2131745709, null), true);
                jiaVar.l(null, false);
                pb0Var.f(1);
                be0Var.m(null, "50_50", pb0Var, user);
                ((FrameLayout.LayoutParams) df0Var.getLayoutParams()).topMargin = gl.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i5 = na7.q5;
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
                    str3 = l7c.r(user);
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
            pb0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.E = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                df0Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = l7c.r(user);
                }
                this.y = str3;
                df0Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i6 = bkb.x6;
                    jiaVar.setTag(Integer.valueOf(i6));
                    if (z2) {
                        i6 = bkb.eh;
                    }
                    zkb.W(jiaVar, i6, wjbVar);
                    jiaVar.l(k96.M0(2131753153, null), false);
                } else {
                    long j = user.id;
                    int i7 = this.x;
                    if (j == y6c.h(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || na7.q1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                        int i8 = bkb.m6;
                        jiaVar.setTag(Integer.valueOf(i8));
                        if (z2) {
                            i8 = bkb.fh;
                        }
                        zkb.W(jiaVar, i8, wjbVar);
                        jiaVar.l(k96.M0(2131747633, null), false);
                    } else {
                        int i9 = bkb.x6;
                        jiaVar.setTag(Integer.valueOf(i9));
                        if (z2) {
                            i9 = bkb.eh;
                        }
                        zkb.W(jiaVar, i9, wjbVar);
                        jiaVar.l(k96.d0(i7, user, null, null), false);
                    }
                }
                jiaVar.setEmojiColor(jiaVar.getTextColor());
            }
            be0Var.f(user, pb0Var);
        }
        chat = null;
        be0Var.setRoundRadius(gl.L((chat == null && chat.forum) ? 14.0f : 24.0f));
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
                requirementToContact = na7.q1(this.x).J2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == cf3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = cf3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public wf2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public jia getStatusTextView() {
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
        wjb wjbVar = this.N;
        if (d <= 0.0f && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = bkb.v0(bkb.V6, wjbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            be0 be0Var = this.a;
            canvas.drawCircle((be0Var.getMeasuredWidth() / 2) + be0Var.getLeft(), (be0Var.getMeasuredHeight() / 2) + be0Var.getTop(), (gl.L(4.0f) * this.J) + gl.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = k96.a0;
            byte b = this.G;
            int L = gl.L(z ? 0.0f : b + 72);
            int measuredWidth = getMeasuredWidth() - gl.L(k96.a0 ? b + 72 : 0.0f);
            if (!this.L) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), bkb.U0("paintDivider", wjbVar));
            } else {
                bkb.k0.setColor(bkb.v0(bkb.Wg, wjbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), bkb.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.d;
        if (wf2Var != null ? wf2Var.a.q : this.I) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z) {
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.setEnabled(z);
        }
    }

    public void setDrawDivider(boolean z) {
        this.F = z;
        invalidate();
    }

    public void setForbiddenCheck(boolean z) {
        this.d.setForbidden(z);
    }

    @Override // tjb
    public final void updateColors() {
        int textColor;
        jia jiaVar = this.c;
        if (jiaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = jiaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    jiaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        be0 be0Var = this.a;
        if (be0Var != null) {
            be0Var.invalidate();
        }
        try {
            if (!this.s || be0Var == null) {
                return;
            }
            Drawable t = be0Var.getImageReceiver().t();
            if (t instanceof pb0) {
                ((pb0) t).h(bkb.w0(null, bkb.S7, false), bkb.w0(null, bkb.Z7, false));
                be0Var.invalidate();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public za5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
