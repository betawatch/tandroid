// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ya5 extends View implements tjb {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final wjb H;
    public final boolean I;
    public final byte J;
    public boolean K;
    public int L;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final pb0 r;
    public final nu2 s;
    public final int w;
    public final float x;
    public float y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ya5(Context context, Object obj, nu2 nu2Var, boolean z, wjb wjbVar) {
        super(context);
        String str;
        int i;
        pb0 pb0Var;
        String str2;
        gl5 gl5Var;
        TLRPC.Chat chat;
        boolean z2;
        boolean z3;
        gl5 m;
        TLRPC.Chat chat2;
        String str3;
        int D;
        StaticLayout staticLayout;
        this.f = new RectF();
        this.G = new int[8];
        this.H = wjbVar;
        this.I = z;
        this.d = false;
        this.s = nu2Var;
        this.e = getResources().getDrawable(R.drawable.delete);
        float L = gl.L(z ? 13.0f : 14.0f);
        TextPaint textPaint = M;
        textPaint.setTextSize(L);
        pb0 pb0Var2 = new pb0((wjb) null);
        this.r = pb0Var2;
        pb0Var2.s(gl.L(20.0f));
        boolean z4 = obj instanceof String;
        if (z4) {
            String str4 = (String) obj;
            pb0Var2.p = 0.8f;
            switch (str4.hashCode()) {
                case -1716307998:
                    str4.equals("archived");
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -1359418551:
                    if (str4.equals("miniapps")) {
                        this.d = true;
                        pb0Var2.h(bkb.v0(bkb.S7, wjbVar), bkb.v0(bkb.Z7, wjbVar));
                        this.J = (byte) 2;
                        str3 = k96.M0(2131746615, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        pb0Var2.f(6);
                        this.b = -9223372036854775806L;
                        str3 = k96.M0(2131750762, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        pb0Var2.f(5);
                        this.b = -9223372036854775807L;
                        str3 = k96.M0(2131750706, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        pb0Var2.f(4);
                        this.b = Long.MIN_VALUE;
                        str3 = k96.M0(2131750779, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -318452137:
                    if (str4.equals("premium")) {
                        this.d = true;
                        pb0Var2.g(bkb.v0(bkb.Gk, wjbVar));
                        this.J = (byte) 1;
                        str3 = k96.M0(2131746589, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        pb0Var2.f(24);
                        this.b = -9223372036854775799L;
                        str3 = k96.M0(2131750715, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        pb0Var2.f(8);
                        this.b = -9223372036854775804L;
                        str3 = k96.M0(2131750789, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        pb0Var2.f(10);
                        this.b = -9223372036854775802L;
                        str3 = k96.M0(2131750705, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        pb0Var2.f(9);
                        this.b = -9223372036854775803L;
                        str3 = k96.M0(2131750724, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        pb0Var2.f(23);
                        this.b = -9223372036854775800L;
                        str3 = k96.M0(2131750764, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        pb0Var2.f(7);
                        this.b = -9223372036854775805L;
                        str3 = k96.M0(2131750788, null);
                        break;
                    }
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
                default:
                    pb0Var2.f(11);
                    this.b = -9223372036854775801L;
                    str3 = k96.M0(2131750792, null);
                    break;
            }
            z3 = true;
            gl5Var = null;
            chat = null;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                    pb0Var2.p(chat3);
                    this.b = -chat3.id;
                    String str5 = chat3.title;
                    gl5 m2 = gl5.m(y6c.t0, 1, chat3);
                    chat = chat3;
                    z3 = true;
                    pb0Var = pb0Var2;
                    str = "premium";
                    gl5Var = m2;
                    str2 = str5;
                    z2 = true;
                    i = 2;
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String E0 = k96.E0(tL_help_country.iso2);
                        String str6 = tL_help_country.default_name;
                        pb0Var2.f(17);
                        pb0Var2.s(gl.L(24.0f));
                        i = 2;
                        str = "premium";
                        pb0Var2.j(0L, E0, null, null);
                        pb0Var2.g(bkb.p1(0.7f, bkb.v0(bkb.o7, wjbVar)));
                        this.J = (byte) 3;
                        pb0Var2.w = false;
                        this.b = tL_help_country.default_name.hashCode();
                        this.a = tL_help_country.iso2;
                        gl5Var = null;
                        chat = null;
                        pb0Var = pb0Var2;
                        str2 = str6;
                        z2 = false;
                    } else {
                        str = "premium";
                        i = 2;
                        pb0Var2.j(nu2Var.a, nu2Var.i, nu2Var.j, null);
                        pb0Var = pb0Var2;
                        this.b = nu2Var.a;
                        this.c = nu2Var.b;
                        str2 = !TextUtils.isEmpty(nu2Var.i) ? nu2Var.i : nu2Var.j;
                        gl5Var = null;
                        chat = null;
                        z2 = true;
                    }
                    z3 = true;
                }
                ImageReceiver imageReceiver = new ImageReceiver(null);
                this.h = imageReceiver;
                imageReceiver.q0(gl.L(16.0f));
                imageReceiver.p0(this);
                imageReceiver.i0(!z2 ? 0.0f : gl.L(4.0f), 0.0f, gl.L(!z ? 28.0f : 32.0f), gl.L(z ? 28.0f : 32.0f));
                if (gl.O1()) {
                    Point point = gl.q;
                    D = ug8.D((z ? 28 : 32) + kk7.P1, Math.min(point.x, point.y), i);
                } else {
                    D = gl.L(398 - (z ? 28 : 32)) / i;
                }
                staticLayout = new StaticLayout(TextUtils.ellipsize(vu3.m(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false, null, 0), textPaint, D, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.n = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.w = (int) Math.ceil(staticLayout.getLineWidth(0));
                    this.x = -staticLayout.getLineLeft(0);
                }
                if (z4) {
                    String str7 = (String) obj;
                    if (str.equals(str7)) {
                        imageReceiver.g0(za5.b(getContext(), z3));
                    } else {
                        boolean z5 = z3;
                        if ("miniapps".equals(str7)) {
                            getContext();
                            imageReceiver.g0(za5.a(z5));
                        }
                    }
                    c();
                    kk7.i(this);
                }
                imageReceiver.c0(gl5Var, "50_50", pb0Var, 0L, null, chat, 1);
                c();
                kk7.i(this);
            }
            TLRPC.User user = (TLRPC.User) obj;
            this.b = user.id;
            if (l7c.A(user)) {
                str3 = k96.M0(2131746073, null);
                pb0Var2.p = 0.8f;
                pb0Var2.f(12);
            } else if (l7c.C(user)) {
                str3 = k96.M0(2131745709, null);
                pb0Var2.p = 0.8f;
                pb0Var2.f(1);
            } else {
                pb0Var2.q(user);
                String k = l7c.k(user, true);
                int indexOf = k.indexOf(32);
                k = indexOf >= 0 ? k.substring(0, indexOf) : k;
                m = gl5.m(y6c.t0, 1, user);
                String str8 = k;
                chat2 = user;
                str3 = str8;
                chat = chat2;
                gl5Var = m;
                z3 = true;
            }
            chat2 = null;
            m = null;
            chat = chat2;
            gl5Var = m;
            z3 = true;
        }
        pb0Var = pb0Var2;
        str = "premium";
        str2 = str3;
        z2 = z3;
        i = 2;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.h = imageReceiver2;
        imageReceiver2.q0(gl.L(16.0f));
        imageReceiver2.p0(this);
        imageReceiver2.i0(!z2 ? 0.0f : gl.L(4.0f), 0.0f, gl.L(!z ? 28.0f : 32.0f), gl.L(z ? 28.0f : 32.0f));
        if (gl.O1()) {
        }
        staticLayout = new StaticLayout(TextUtils.ellipsize(vu3.m(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false, null, 0), textPaint, D, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
        }
        if (z4) {
        }
        imageReceiver2.c0(gl5Var, "50_50", pb0Var, 0L, null, chat, 1);
        c();
        kk7.i(this);
    }

    public final void a() {
        if (this.E) {
            this.E = false;
            this.F = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void b() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b = this.r.b();
        int i = bkb.F6;
        wjb wjbVar = this.H;
        int p1 = bkb.p1(0.05f, bkb.v0(i, wjbVar));
        int v0 = bkb.v0(bkb.Ti, wjbVar);
        int red = Color.red(p1);
        int[] iArr = this.G;
        iArr[0] = red;
        iArr[1] = Color.red(b);
        iArr[2] = Color.green(p1);
        iArr[3] = Color.green(b);
        iArr[4] = Color.blue(p1);
        iArr[5] = Color.blue(b);
        iArr[6] = Color.alpha(p1);
        iArr[7] = Color.alpha(b);
        if (!this.K || v0 != this.L) {
            this.K = true;
            this.L = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(p1);
    }

    public nu2 getContact() {
        return this.s;
    }

    public String getCountryIso2() {
        return this.a;
    }

    public String getKey() {
        return this.c;
    }

    public long getUid() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.E;
        float f = this.y;
        if (!z ? f != 0.0f : f != 1.0f) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            boolean z2 = this.E;
            float f2 = this.y;
            float f3 = currentTimeMillis / 120.0f;
            if (z2) {
                float f4 = f3 + f2;
                this.y = f4;
                if (f4 >= 1.0f) {
                    this.y = 1.0f;
                }
            } else {
                float f5 = f2 - f3;
                this.y = f5;
                if (f5 < 0.0f) {
                    this.y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z3 = this.I;
        float L = gl.L(z3 ? 28.0f : 32.0f);
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, measuredWidth, L);
        int[] iArr = this.G;
        int i = iArr[6];
        float f6 = iArr[7] - i;
        float f7 = this.y;
        int argb = Color.argb(i + ((int) (f6 * f7)), iArr[0] + ((int) ((iArr[1] - r6) * f7)), iArr[2] + ((int) ((iArr[3] - r8) * f7)), iArr[4] + ((int) ((iArr[5] - r9) * f7)));
        Paint paint = N;
        paint.setColor(argb);
        canvas.drawRoundRect(rectF, gl.L(z3 ? 14.0f : 16.0f), gl.L(z3 ? 14.0f : 16.0f), paint);
        if (this.y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.y != 0.0f) {
            paint.setColor(this.r.b());
            paint.setAlpha((int) (this.y * 255.0f * (Color.alpha(r3) / 255.0f)));
            canvas.drawCircle(gl.L(z3 ? 14.0f : 16.0f), gl.L(z3 ? 14.0f : 16.0f), gl.L(z3 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.y) * 45.0f, gl.L(16.0f), gl.L(16.0f));
            int L2 = gl.L(z3 ? 9.0f : 11.0f);
            int L3 = gl.L(z3 ? 9.0f : 11.0f);
            int L4 = gl.L(z3 ? 19.0f : 21.0f);
            int L5 = gl.L(z3 ? 19.0f : 21.0f);
            Drawable drawable = this.e;
            drawable.setBounds(L2, L3, L4, L5);
            drawable.setAlpha((int) (this.y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.x + gl.L((z3 ? 26 : 32) + 9), gl.L(z3 ? 6.0f : 8.0f));
        int i2 = bkb.Ri;
        wjb wjbVar = this.H;
        M.setColor(bm2.f(this.y, bkb.v0(i2, wjbVar), bkb.v0(bkb.I7, wjbVar)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), k96.M0(2131751586, null)));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.I;
        setMeasuredDimension(gl.L((z ? 20 : 32) + 25) + this.w, gl.L(z ? 28.0f : 32.0f));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            pb0 pb0Var = this.r;
            if (pb0Var != null) {
                byte b = this.J;
                wjb wjbVar = this.H;
                if (b == 1) {
                    pb0Var.g(bkb.v0(bkb.Gk, wjbVar));
                } else if (b == 2) {
                    pb0Var.h(bkb.v0(bkb.S7, wjbVar), bkb.v0(bkb.Z7, wjbVar));
                } else if (b == 3) {
                    pb0Var.g(bkb.p1(0.7f, bkb.v0(bkb.o7, wjbVar)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public ya5(Context context, Object obj) {
        this(context, obj, null, false, null);
    }
}
