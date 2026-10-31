package vh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a5 extends View {
    public boolean D;
    public z4 E;
    public View F;
    public Object G;
    public org.telegram.messenger.o7 H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int a;
    public final y6 b;
    public z6 c;
    public final org.telegram.ui.Components.t5 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public qz0 r;
    public qz0 s;
    public final Path w;
    public final Paint x;
    public final dc y;

    public a5(Activity activity, int i10, y6 y6Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new dc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.a = i10;
        this.b = y6Var;
    }

    public final void a() {
        z4 z4Var = this.E;
        if (z4Var == null) {
            return;
        }
        this.r = new qz0(z4Var.b(), 16.0f, org.telegram.messenger.i0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            dq dqVar = new dq(R.drawable.settings_arrow, 0);
            dqVar.H = 1.25f;
            dqVar.I = 1.25f;
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new qz0(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Object obj;
        float d = this.d.d(this.D);
        qz0 qz0Var = this.r;
        if (qz0Var == null || this.s == null || d <= 0.0f) {
            return;
        }
        qz0Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float L = org.telegram.messenger.i0.L(5.0f);
        float L2 = org.telegram.messenger.i0.L(10.0f);
        float L3 = org.telegram.messenger.i0.L(32.0f);
        float L4 = org.telegram.messenger.i0.L(2.0f);
        float L5 = org.telegram.messenger.i0.L(11.0f);
        float max = Math.max(Math.min(org.telegram.messenger.i0.L(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? L5 + L3 + L5 : 0.0f) + L + org.telegram.messenger.i0.L(15.0f) + L);
        float max2 = Math.max(this.n ? L3 : 0.0f, this.s.i() + this.r.i() + L4) + L2 + L2;
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, d) * this.y.a(0.05f);
        float L6 = (1.0f - d) * org.telegram.messenger.i0.L(15.0f);
        float width = (getWidth() - max) / 2.0f;
        float height = (getHeight() - max2) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height2 = (getHeight() + max2) / 2.0f;
        RectF rectF = this.e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        org.telegram.messenger.i0.i3(rectF2, T1, rectF2.centerX(), rectF2.centerY());
        rectF2.offset(0.0f, L6);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.x;
        if (i10 < 29 || (obj = this.G) == null || this.F == null) {
            f7 = L;
            f10 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(d, -587202560));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paint);
        } else {
            RenderNode b10 = m4.v0.b(obj);
            Path path = this.w;
            path.rewind();
            f10 = 2.0f;
            f7 = L;
            path.addRoundRect(rectF2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.J);
            this.F.getLocationOnScreen(this.K);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.F.getWidth() / b10.getWidth(), this.F.getHeight() / b10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(b10);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(d, 1879048192));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, L6);
        canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f11 = L3 / f10;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.J0((int) f11);
            imageReceiver.y0(rectF.left + f7 + L5, rectF.centerY() - f11, L3, L3);
            imageReceiver.setAlpha(d);
            imageReceiver.h(canvas, null);
        }
        float centerY = rectF.centerY() - ((this.s.i() + (this.r.i() + L4)) / f10);
        qz0 qz0Var2 = this.r;
        qz0Var2.c(rectF.left + (this.n ? L5 + L3 + L5 : 0.0f) + f7, (qz0Var2.i() / f10) + centerY, d, -1, canvas);
        this.s.c(rectF.left + (this.n ? L3 + L5 + L5 : 0.0f) + f7, this.r.i() + centerY + L4 + (this.s.i() / f10), d, org.telegram.ui.ActionBar.t6.w(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z6 z6Var;
        boolean z10 = this.D;
        dc dcVar = this.y;
        if (!z10 || this.E == null) {
            this.L = false;
            dcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.L = true;
                dcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (dcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.i && (z6Var = this.c) != null && this.E != null) {
                z6Var.a(new w4(this, 1));
            }
            dcVar.c(false);
            this.L = false;
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
            this.L = false;
        }
        return this.L || dcVar.i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.R();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        y6 y6Var = this.b;
        org.telegram.messenger.o7 o7Var = null;
        if (isEmpty) {
            org.telegram.messenger.o7 o7Var2 = this.H;
            if (o7Var2 != null) {
                o7Var2.run();
                this.H = null;
            }
            if (this.D) {
                invalidate();
            }
            this.D = false;
            this.I = null;
            if (y6Var != null) {
                y6Var.run();
                return;
            }
            return;
        }
        z4 z4Var = this.E;
        if (!(z4Var == null && this.H == null) && (z4Var == null || TextUtils.equals(z4Var.a, str) || TextUtils.equals(this.I, str))) {
            z4 z4Var2 = this.E;
            if (z4Var2 == null || this.D || !TextUtils.equals(z4Var2.a, str)) {
                return;
            }
            this.D = true;
            a();
            invalidate();
            if (y6Var != null) {
                y6Var.run();
                return;
            }
            return;
        }
        org.telegram.messenger.o7 o7Var3 = this.H;
        if (o7Var3 != null) {
            o7Var3.run();
            this.H = null;
        }
        this.E = null;
        this.I = str;
        int i10 = this.a;
        w4 w4Var = new w4(this, 0);
        try {
            vp r12 = vp.r1(i10);
            String str2 = r12.U2;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject e22 = r12.e2(str3);
                        if (e22 instanceof TLRPC.User) {
                            w4Var.a(new x4(str, (TLRPC.User) e22));
                        } else if (e22 instanceof TLRPC.Chat) {
                            w4Var.a(new y4(str, (TLRPC.Chat) e22));
                        }
                    }
                    o7Var = r12.c2().a(str3, queryParameter, new kg.d0(w4Var, r12, str, 12));
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            w4Var.a(o7Var);
        }
        this.H = o7Var;
    }
}
