// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t75 extends ViewGroup implements gi2, gk7, x74 {
    public static final Rect M = new Rect();
    public final iu4 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public q75 J;
    public final r21 K;
    public final RectF L;
    public final fm0 a;
    public final fm0 b;
    public final hi2 c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final wd1 h;
    public final ImageReceiver n;
    public vl r;
    public h19 s;
    public final wla w;
    public r75 x;
    public boolean y;

    public t75(Context context) {
        super(context);
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 320L, false);
        this.b = new fm0(1, this, s33Var, 320L, false);
        this.c = new hi2(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        wd1 wd1Var = new wd1();
        this.h = wd1Var;
        this.E = new iu4(this, (byte) 15);
        this.K = new r21(this, (byte) 5);
        this.L = new RectF();
        wla wlaVar = new wla(context);
        this.w = wlaVar;
        wlaVar.setDisablePaddingsOffset(true);
        wlaVar.setTextSize(14.0f);
        wlaVar.setTextColor(-1);
        wlaVar.setLinkTextColor(-11683585);
        wlaVar.setHintTextColor(-1);
        addView(wlaVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.q0(gl.L(11.0f));
        wd1Var.c.setStrokeWidth(gl.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            i += Character.charCount(codePointAt);
            byte directionality = Character.getDirectionality(codePointAt);
            if (directionality == 0) {
                break;
            }
            if (directionality == 1 || directionality == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // gi2
    public final void D(float f, float f2) {
        q75 q75Var;
        GroupCallMessage groupCallMessage;
        if (a(f, f2) != 1 || (q75Var = this.J) == null || (groupCallMessage = this.I) == null) {
            return;
        }
        ((m55) q75Var).a(groupCallMessage);
    }

    @Override // gi2
    public final boolean H0(float f, float f2) {
        return a(f, f2) == 1;
    }

    @Override // gi2
    public final boolean K0(View view, float f, float f2) {
        return false;
    }

    @Override // gi2
    public final boolean S() {
        return true;
    }

    public final int a(float f, float f2) {
        r75 r75Var = this.x;
        if (r75Var == null) {
            return -1;
        }
        RectF rectF = (RectF) r75Var.d;
        RectF rectF2 = this.L;
        rectF2.set(rectF);
        rectF2.inset(-gl.L(5.0f), -gl.L(5.0f));
        if (rectF2.contains(f, f2)) {
            return 1;
        }
        return ((RectF) this.x.c).contains(f, f2) ? 0 : -1;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r75 r75Var = this.x;
        if (r75Var != null) {
            canvas.drawPath((Path) r75Var.f, this.e);
            if (Build.VERSION.SDK_INT >= 29 && this.F != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f = 0.0f;
                while (view != this.H) {
                    f += view.getY();
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        return;
                    } else {
                        view = (View) parent;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.x.f);
                canvas.translate(0.0f, -f);
                float f2 = this.G;
                canvas.scale(f2, f2);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.x.f, paint);
            }
            if (this.a.e > 0.0f) {
                RectF rectF = (RectF) this.x.c;
                RectF rectF2 = this.L;
                rectF2.set(rectF);
                rectF2.inset(gl.L(1.0f), gl.L(1.0f));
                this.h.a(gl.L(14.0f), canvas, rectF2, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.n.h(canvas, null);
            vl vlVar = this.r;
            if (vlVar != null) {
                vlVar.draw(canvas);
            }
        }
    }

    @Override // gi2
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.I;
    }

    public float getReactionCenterX() {
        r75 r75Var = this.x;
        if (r75Var != null) {
            return ((RectF) r75Var.e).centerX();
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.n.I();
        vl vlVar = this.r;
        if (vlVar != null) {
            vlVar.b(this);
        }
        kk7.e().b(this, kk7.k4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.n.K();
        vl vlVar = this.r;
        if (vlVar != null) {
            vlVar.o(this);
        }
        kk7.e().n(this, kk7.k4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        r75 r75Var = this.x;
        if (r75Var == null) {
            return;
        }
        int round = Math.round(((PointF) r75Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        wla wlaVar = this.w;
        wlaVar.layout(round, round2, wlaVar.getMeasuredWidth() + round, wlaVar.getMeasuredHeight() + round2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        r75 r75Var = this.x;
        if (r75Var == null || this.y || r75Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            h19 h19Var = this.s;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((size - paddingLeft) - paddingRight) - gl.L(44.0f), TLObject.FLAG_31);
            wla wlaVar = this.w;
            wlaVar.measure(makeMeasureSpec, 0);
            float measuredWidth = wlaVar.getMeasuredWidth();
            int L = h19Var == null ? gl.L(44.0f) + ((int) Math.ceil(measuredWidth)) : ((int) Math.ceil(measuredWidth)) + gl.L(70.0f);
            int e = ls6.e(8.0f, wlaVar.getMeasuredHeight(), gl.L(28.0f));
            r75 r75Var2 = new r75();
            r75Var2.c = new RectF();
            r75Var2.f = new Path();
            r75Var2.d = new RectF();
            r75Var2.e = new RectF();
            r75Var2.g = new PointF();
            RectF rectF = (RectF) r75Var2.d;
            PointF pointF = (PointF) r75Var2.g;
            RectF rectF2 = (RectF) r75Var2.e;
            RectF rectF3 = (RectF) r75Var2.c;
            r75Var2.a = size;
            r75Var2.b = e;
            rectF3.set(0.0f, 0.0f, L, e);
            rectF3.offset((size - L) / 2.0f, 0.0f);
            ((Path) r75Var2.f).addRoundRect(rectF3, gl.L(14.0f), gl.L(14.0f), Path.Direction.CW);
            boolean z = wlaVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, gl.L(22.0f), gl.L(22.0f));
            if (z) {
                f = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-gl.L(4.0f)) - rectF.width(), gl.L(3.0f));
            } else {
                f = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(gl.L(4.0f), gl.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, gl.L(f), gl.L(f));
            if (z) {
                rectF2.offset(rectF3.left + gl.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - gl.L(33.0f), 0.0f);
            }
            rectF2.inset(gl.L(1.0f), gl.L(1.0f));
            pointF.set(0.0f, (rectF3.top + gl.L(19.0f)) - wlaVar.getLayout().getLineBaseline(0));
            if (z) {
                pointF.offset((rectF3.right - gl.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + gl.L(32.0f), 0.0f);
            }
            this.x = r75Var2;
            this.d.k0(rectF);
            this.n.k0((RectF) this.x.e);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.x.e;
                Rect rect = M;
                rectF4.round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.x.b);
        this.h.f = Math.round(((RectF) this.x.c).width() + gl.L(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(this, motionEvent);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        wd1 wd1Var = this.h;
        wd1Var.a.setAlpha(round);
        wd1Var.c.setAlpha(round);
        invalidate();
    }

    @Override // gi2
    public final boolean s1() {
        return false;
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        iu4 iu4Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(iu4Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(iu4Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.I.isSendError(), false);
        }
        TLObject Z1 = na7.q1(y6c.t0).Z1(groupCallMessage.fromId);
        String l = cf3.l(Z1);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.o(Z1);
        this.d.U(Z1, pb0Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.d0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l);
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        h19 h19Var = groupCallMessage.visibleReaction;
        wla wlaVar = this.w;
        if (h19Var == null) {
            CharSequence j0 = k27.j0(groupCallMessage.message, false, true, wlaVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b = b(spannableStringBuilder);
            boolean b2 = b(j0);
            if (b != b2) {
                spannableStringBuilder2.append(b2 ? (char) 8295 : (char) 8294);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(j0);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (h19Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.d0(gl5.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (h19Var.g != 0) {
            vl vlVar = new vl(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = vlVar;
            vlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.b(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.y = true;
        wlaVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.e.setColor(i);
    }

    public void setDelegate(q75 q75Var) {
        this.J = q75Var;
    }

    @Override // gi2
    public final void h0() {
    }

    @Override // gi2
    public final void n0() {
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    @Override // gi2
    public final void k(float f, float f2) {
    }

    @Override // gi2
    public final void f1(View view, float f, float f2) {
    }

    @Override // gi2
    public final void g(View view, float f, float f2) {
    }

    @Override // gi2
    public final void n(View view, float f, float f2) {
    }
}
