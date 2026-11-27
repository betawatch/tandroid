// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tt extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Context context, vnb vnbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 16:
                super(context);
                this.c = new n15(8);
                this.b = vnbVar;
                break;
            default:
                LinearLayout j = uh9.j(context, 1);
                in inVar = new in(context, false, false, false);
                this.b = inVar;
                int i = aob.G6;
                yob.U(inVar, i, vnbVar);
                inVar.setTextSize(hl.L(17.0f));
                inVar.setTypeface(hl.o());
                j.addView(inVar, tre.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                yob.X(textView, i, vnbVar);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                j.addView(textView, tre.r(-2, -2, 1));
                addView(j, tre.e(-2, -2, 17));
                break;
        }
    }

    public final void b(Canvas canvas) {
        fz7 fz7Var = (fz7) this.c;
        Drawable drawable = fz7Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof ih7) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            fz7Var.a.draw(canvas);
        } else {
            int max = Math.max(0, fz7Var.H);
            float max2 = Math.max(getMeasuredWidth() / fz7Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / fz7Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(fz7Var.a.getIntrinsicWidth() * max2);
            int ceil2 = (int) Math.ceil(fz7Var.a.getIntrinsicHeight() * max2);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
            fz7Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            fz7Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    public final /* synthetic */ Boolean c(MotionEvent motionEvent) {
        return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
    }

    public final /* synthetic */ Boolean d(MotionEvent motionEvent) {
        return Boolean.valueOf(super.onInterceptTouchEvent(motionEvent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vnb vnbVar;
        boolean z;
        float f;
        float f2;
        float f3;
        ?? r13;
        hf0 hf0Var;
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i = aob.a7;
                vnbVar = ((e) ((eo0) this.c).d).resourceProvider;
                paint.setColor(aob.v0(i, vnbVar));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 3:
                rr0 rr0Var = (rr0) this.c;
                if (rr0Var.s != null && rr0Var.w) {
                    canvas.drawColor(Color.argb((int) (rr0Var.x * 56.0f), 0, 0, 0));
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(aob.v0(aob.a7, ((rg1) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 6:
                float L = hl.L(20.0f);
                RectF rectF = hl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, jn7.d4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), hl.L(6.0f) + getPaddingTop());
                pm3 pm3Var = (pm3) this.c;
                pm3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - hl.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                pm3Var.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                cb2 cb2Var = (cb2) this.c;
                int measuredWidth = cb2Var.getMeasuredWidth();
                int i2 = cb2Var.e;
                float x = cb2Var.getX();
                float f4 = cb2Var.d;
                vnb vnbVar2 = cb2Var.c;
                if (vnbVar2 != null) {
                    vnbVar2.b(x, f4, measuredWidth, i2);
                } else {
                    aob.q(x, f4, measuredWidth, i2);
                }
                float L2 = hl.L(18.0f);
                float L3 = hl.L(18.0f);
                Paint d = vnbVar2 != null ? vnbVar2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = aob.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L2, L3, d);
                if (vnbVar2 != null ? vnbVar2.g() : aob.b1()) {
                    float L4 = hl.L(18.0f);
                    float L5 = hl.L(18.0f);
                    Paint d2 = vnbVar2 != null ? vnbVar2.d("paintChatActionBackgroundDarken") : null;
                    if (d2 == null) {
                        d2 = aob.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L4, L5, d2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(aob.v0(aob.d7, ((oe2) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 13:
                super.dispatchDraw(canvas);
                float L6 = hl.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L6, height, hl.N(9.2f), (Paint) this.b);
                for (int i3 = -1; i3 <= 1; i3++) {
                    canvas.drawCircle(bp1.e(4.0f, i3, L6), height, hl.N(1.35f), (Paint) this.c);
                }
                break;
            case 14:
                c24 c24Var = (c24) this.c;
                if (c24Var.H.v0 || c24Var.x <= 0.0f) {
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, hl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (c24Var.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, hl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                }
            case 16:
                n15 n15Var = (n15) this.c;
                n15Var.b(aob.p1(0.65f, aob.v0(aob.d6, (vnb) this.b)));
                n15Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 19:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                g75 g75Var = (g75) this.c;
                jc0 jc0Var = g75Var.K;
                TextView textView = g75Var.L;
                float f5 = g75Var.P;
                if (f5 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    jc0Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - k43.f.getInterpolation(f5);
                    float left = (g75Var.Q - getLeft()) * interpolation;
                    float left2 = (g75Var.R - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((g75Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    jc0Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 25:
                al8 al8Var = (al8) this.b;
                al8Var.d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF3 = hl.P;
                rectF3.set(0.0f, hl.L(2.0f), getMeasuredWidth(), hl.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint5 = al8Var.f;
                paint5.setAlpha(((xk8) this.c).E1);
                canvas.drawRoundRect(rectF3, hl.L(24.0f) - 1, hl.L(24.0f) - 1, paint5);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.a5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.b5, profileActivity.r.getY());
                    f = 0.0f;
                    f2 = 28.0f;
                    r13 = 0;
                    z = true;
                    f3 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.a5.getMeasuredWidth(), profileActivity.a5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.a5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    z = true;
                    f = 0.0f;
                    f2 = 28.0f;
                    f3 = 24.0f;
                    r13 = 0;
                }
                if (profileActivity.v5 && profileActivity.x6 != f && profileActivity.t5 != 1.0f) {
                    float measuredHeight = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float L7 = hl.L(22.0f);
                    float x2 = ((profileActivity.r.getX() + (hl.L(f2) - profileActivity.u5)) - L7) - profileActivity.l2();
                    profileActivity.x5.i0(x2, measuredHeight - (L7 / 2.0f), L7, L7);
                    profileActivity.x5.setAlpha(profileActivity.x6);
                    canvas.save();
                    float f6 = profileActivity.x6;
                    canvas.scale(f6, f6, profileActivity.x5.r(), profileActivity.x5.s());
                    profileActivity.x5.h(canvas, null);
                    canvas.restore();
                    float f7 = profileActivity.t5;
                    za1 za1Var = (za1) this.b;
                    if (f7 == f) {
                        if (za1Var == null) {
                            za1 za1Var2 = new za1(this);
                            this.b = za1Var2;
                            za1Var2.h = new uk8(this, (byte) 7);
                        }
                        float L8 = (1.0f - profileActivity.t5) * hl.L(f2);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? profileActivity.T.getVisibilityFactor() * (hl.L(f3) + textWidth + hl.L(4.0f)) : f) + L8;
                        RectF rectF4 = hl.P;
                        rectF4.set(x2 - hl.L(4.0f), measuredHeight - hl.L(14.0f), x2 + max + hl.L(4.0f), measuredHeight + hl.L(14.0f));
                        za1 za1Var3 = (za1) this.b;
                        za1Var3.i = r13;
                        za1Var3.c = r13;
                        za1Var3.a(rectF4);
                        za1 za1Var4 = (za1) this.b;
                        za1Var4.n = z;
                        int o = vm2.o(-1, 50);
                        za1Var4.g.setColor((int) r13);
                        hf0 hf0Var2 = za1Var4.e;
                        if (hf0Var2 != null) {
                            aob.F1(hf0Var2, o, z);
                        }
                        za1 za1Var5 = (za1) this.b;
                        za1Var5.c(canvas, za1Var5.g);
                        hf0 hf0Var3 = za1Var5.e;
                        if (hf0Var3 != null) {
                            hf0Var3.draw(canvas);
                            break;
                        }
                    } else if (za1Var != null && (hf0Var = za1Var.e) != null) {
                        hf0Var.setState(StateSet.NOTHING);
                        hf0Var.jumpToCurrentState();
                        break;
                    }
                }
                break;
            case 27:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                kjc kjcVar = (kjc) this.b;
                kjcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, hl.L(28.0f), hl.L(28.0f), kjcVar.b());
                super.dispatchDraw(canvas);
                break;
            case 28:
                Paint paint6 = (Paint) this.b;
                i49 i49Var = (i49) this.c;
                vnb vnbVar3 = i49Var.l0;
                byte b = i49Var.N0;
                paint6.setColor((b == 1 || b == 2 || b == 4) ? vm2.o(-1, 30) : vm2.f(0.7f, aob.v0(aob.F8, vnbVar3), aob.v0(aob.h5, vnbVar3)));
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - hl.N(6.0f)) / 2.0f;
                float d3 = i49Var.d();
                RectF rectF6 = hl.P;
                rectF6.set(measuredWidth2 - measuredWidth3, (measuredHeight2 - measuredWidth3) - d3, measuredWidth2 + measuredWidth3, measuredHeight2 + measuredWidth3 + d3);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight2);
                canvas.drawRoundRect(rectF6, measuredWidth3, measuredWidth3, paint6);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, d3);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 12:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                e53 e53Var = (e53) this.c;
                if (!e53Var.k) {
                    return true;
                }
                e53Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        switch (this.a) {
            case 12:
                break;
            default:
                super.dispatchSetPressed(z);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                o oVar = (o) this.c;
                lmb m = oVar.R0.m(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (oVar.R0.w() && oVar.R0.m(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (m.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !oVar.R0.w() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (oVar.R0.m(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 18:
                zj5 zj5Var = (zj5) ((am2) this.c).c;
                return zj5Var != null ? zj5Var.a(motionEvent, new a15(this, (byte) 0)) : super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        switch (this.a) {
            case 11:
                if (view instanceof qx7) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 22:
                Path path = (Path) this.b;
                uy5 uy5Var = (uy5) this.c;
                if (uy5Var.h != null) {
                    if (uy5Var.f) {
                        if (view == uy5Var.d) {
                            f = uy5Var.e;
                            canvas.save();
                            path.rewind();
                            path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                    } else if (view == uy5Var.c) {
                        f = 1.0f - uy5Var.e;
                        canvas.save();
                        path.rewind();
                        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path);
                        boolean drawChild2 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild2;
                    }
                }
                return super.drawChild(canvas, view, j);
            case 23:
                Path path2 = (Path) this.b;
                bx7 bx7Var = (bx7) this.c;
                if (bx7Var.h != null) {
                    if (bx7Var.f) {
                        if (view == bx7Var.d) {
                            f2 = bx7Var.e;
                            canvas.save();
                            path2.rewind();
                            path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path2);
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        }
                    } else if (view == bx7Var.c) {
                        f2 = 1.0f - bx7Var.e;
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        boolean drawChild32 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild32;
                    }
                }
                return super.drawChild(canvas, view, j);
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                float f3 = profileActivity.R1;
                if (f3 >= 1.0f || view == profileActivity.a0 || view == profileActivity.c0 || view == profileActivity.d0) {
                    return super.drawChild(canvas, view, j);
                }
                if (f3 <= 0.0f) {
                    return false;
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (profileActivity.R1 * 255.0f), 31);
                boolean drawChild4 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild4;
            case 29:
                return view != ((SecretMediaViewer) this.b).x && super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    public final void e(float f) {
        in inVar = (in) this.b;
        inVar.a();
        inVar.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(ete.a(f, 0.0f, 1.0f) * 100.0f))), !ob6.a0, true);
        s61 s61Var = (s61) this.c;
        s61Var.c = f;
        s61Var.invalidate();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 12:
                e53 e53Var = (e53) this.c;
                float f = e53Var.u;
                float f2 = rect.bottom;
                if (f != f2 && e53Var.v) {
                    e53Var.u = f2;
                    tt ttVar = e53Var.c;
                    d53 d53Var = e53Var.a;
                    if (!e53Var.q) {
                        float f3 = e53Var.t;
                        int L = hl.L(32.0f);
                        byte b = e53Var.y;
                        byte b2 = 1;
                        if (b == 1 || b == 2) {
                            L = hl.L(24.0f);
                        }
                        float f4 = L;
                        if (d53Var.getMeasuredHeight() + f3 > (ttVar.getMeasuredHeight() - e53Var.u) - f4) {
                            f3 = ((ttVar.getMeasuredHeight() - e53Var.u) - d53Var.getMeasuredHeight()) - f4;
                        }
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        d53Var.animate().translationY(f3).setDuration(250L).setUpdateListener(new z43(e53Var, b2)).setInterpolator(k43.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 15:
                super.invalidate();
                ((ll4) this.c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                ((p82) this.b).c();
                break;
            case 11:
                super.onAttachedToWindow();
                rw2 rw2Var = (rw2) this.c;
                rw2Var.A.I();
                rw2Var.B.I();
                break;
            case 12:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (t10) this.b);
                break;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).x5.I();
                break;
            case 29:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.I();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                super.onDetachedFromWindow();
                ((p82) this.b).d();
                break;
            case 11:
                super.onDetachedFromWindow();
                rw2 rw2Var = (rw2) this.c;
                rw2Var.A.K();
                rw2Var.B.K();
                break;
            case 12:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).x5.K();
                break;
            case 29:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.K();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int min;
        Drawable drawable;
        switch (this.a) {
            case 11:
                rw2 rw2Var = (rw2) this.b;
                Paint paint = rw2Var.N;
                ImageReceiver imageReceiver = rw2Var.B;
                ColorDrawable colorDrawable = rw2Var.u;
                ImageReceiver imageReceiver2 = rw2Var.A;
                if (rw2Var.z != null) {
                    byte b = 1;
                    if (rw2Var.K && rw2Var.v == null && rw2Var.w != null && !rw2Var.e0) {
                        rw2Var.e0 = true;
                        imageReceiver2.v0(false, false);
                        mu9.d(new n82(rw2Var, (byte) 11));
                    }
                    if (rw2Var.v != null) {
                        boolean z = rw2Var.K;
                        float f = rw2Var.M;
                        if (z) {
                            if (f != 1.0f) {
                                float f2 = f + 0.13333334f;
                                rw2Var.M = f2;
                                if (f2 > 1.0f) {
                                    rw2Var.M = 1.0f;
                                }
                                rw2Var.z.invalidate();
                            }
                        } else if (f != 0.0f) {
                            float f3 = f - 0.13333334f;
                            rw2Var.M = f3;
                            if (f3 < 0.0f) {
                                rw2Var.M = 0.0f;
                            }
                            rw2Var.z.invalidate();
                        }
                        float f4 = rw2Var.M;
                        if (f4 != 0.0f && rw2Var.v != null) {
                            paint.setAlpha((int) (f4 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(aob.p1(rw2Var.M, aob.v0(aob.a7, rw2Var.c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (rw2Var.F * 180.0f));
                    colorDrawable.setBounds(0, 0, rw2Var.z.getWidth(), rw2Var.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    mq5 mq5Var = rw2Var.q;
                    int i = mq5Var.d;
                    int i2 = mq5Var.b;
                    int i3 = i + i2;
                    if (rw2Var.V == 1) {
                        min = Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - i3) - hl.L(40.0f);
                    } else {
                        boolean z2 = rw2Var.S;
                        tt ttVar = rw2Var.z;
                        min = (int) (z2 ? Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i3) - hl.N(40.0f) : Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i3) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i2 + (rw2Var.G != null ? hl.L(40.0f) : 0), ((rw2Var.z.getHeight() - i3) - rw2Var.I) / 2);
                    if (rw2Var.S) {
                        max += hl.L(40.0f);
                    }
                    canvas.translate(rw2Var.z.getWidth() / 2, rw2Var.e + max);
                    int i4 = (int) (min * ((rw2Var.F * 0.8f) / 0.8f));
                    if (rw2Var.V == 3) {
                        canvas.translate(0.0f, hl.L(70.0f));
                    }
                    boolean z3 = rw2Var.S;
                    float f5 = rw2Var.F;
                    if (z3) {
                        float f6 = i4;
                        float f7 = 0.6669f * f6;
                        imageReceiver2.setAlpha(f5);
                        float f8 = f6 - f7;
                        float f9 = f6 / 2.0f;
                        imageReceiver2.i0((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(rw2Var.F);
                        float f10 = (-i4) / 2.0f;
                        imageReceiver.i0(f10, f10, f6, f6);
                        imageReceiver.h(canvas, null);
                    } else {
                        imageReceiver2.setAlpha(f5);
                        float f11 = (-i4) / 2.0f;
                        float f12 = i4;
                        imageReceiver2.i0(f11, f11, f12, f12);
                        imageReceiver2.h(canvas, null);
                    }
                    if (rw2Var.C != null) {
                        canvas.save();
                        float f13 = (-i4) / 2.0f;
                        canvas.translate(f13, f13);
                        float f14 = i4;
                        canvas.scale(f14 / rw2Var.C.getWidth(), f14 / rw2Var.C.getHeight());
                        rw2Var.C.setAlpha(rw2Var.F);
                        Path path = rw2Var.D;
                        if (path == null) {
                            path = new Path();
                            rw2Var.D = path;
                        }
                        path.rewind();
                        RectF rectF = hl.P;
                        rectF.set(0.0f, 0.0f, rw2Var.C.getWidth(), rw2Var.C.getHeight());
                        float f15 = f14 / 8.0f;
                        rw2Var.D.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                        canvas.clipPath(rw2Var.D);
                        rw2Var.C.draw(canvas);
                        canvas.restore();
                    }
                    if (rw2Var.V == 1 && !rw2Var.m && (drawable = rw2Var.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = rw2Var.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - hl.L(((rw2Var.d / hl.L(60.0f)) * 6.0f) + 17.0f));
                        rw2Var.J.setAlpha((int) ((1.0f - rw2Var.g) * 255.0f));
                        rw2Var.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        rw2Var.J.draw(canvas);
                    }
                    if (rw2Var.G != null) {
                        if (rw2Var.S) {
                            canvas.translate((-r2.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - hl.L(30.0f));
                        } else {
                            canvas.translate((-r2.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - hl.L(30.0f));
                        }
                        rw2.f0.setAlpha((int) (rw2Var.F * 255.0f));
                        rw2Var.G.draw(canvas);
                    }
                    canvas.restore();
                    boolean z4 = rw2Var.E;
                    float f16 = rw2Var.F;
                    if (z4) {
                        if (f16 != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - rw2Var.H;
                            rw2Var.H = currentTimeMillis;
                            rw2Var.F = (j / 120.0f) + rw2Var.F;
                            rw2Var.z.invalidate();
                            if (rw2Var.F > 1.0f) {
                                rw2Var.F = 1.0f;
                                break;
                            }
                        }
                    } else if (f16 != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = currentTimeMillis2 - rw2Var.H;
                        rw2Var.H = currentTimeMillis2;
                        rw2Var.F -= j2 / 120.0f;
                        rw2Var.z.invalidate();
                        float f17 = rw2Var.F;
                        if (f17 < 0.0f) {
                            rw2Var.F = 0.0f;
                            f17 = 0.0f;
                        }
                        if (f17 == 0.0f) {
                            imageReceiver2.g0(null);
                            hl.K3(rw2Var.w);
                            hl.c3(new cw2(rw2Var, b));
                            Bitmap bitmap = rw2Var.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                rw2Var.v = null;
                            }
                            hl.T3(rw2Var.O, false, 1.0f, true, false);
                            rw2Var.M = 0.0f;
                            try {
                                if (rw2Var.y.getParent() != null) {
                                    ((WindowManager) rw2Var.w.getSystemService("window")).removeView(rw2Var.y);
                                    break;
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 24:
                b(canvas);
                fz7 fz7Var = (fz7) this.c;
                if (fz7Var.K != null && fz7Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    fz7Var.K.eraseColor(0);
                    fz7Var.L.save();
                    fz7Var.L.scale(fz7Var.K.getWidth() / getMeasuredWidth(), fz7Var.K.getHeight() / getMeasuredHeight());
                    b(fz7Var.L);
                    fz7Var.L.restore();
                    fz7Var.J.d();
                    break;
                }
                break;
            case 29:
                ((SecretMediaViewer) this.b).g(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        za1 za1Var;
        switch (this.a) {
            case 18:
                zj5 zj5Var = (zj5) ((am2) this.c).d;
                return zj5Var != null ? zj5Var.a(motionEvent, new a15(this, (byte) 1)) : super.onInterceptTouchEvent(motionEvent);
            case 26:
                return (((ProfileActivity) this.c).t5 == 0.0f && (za1Var = (za1) this.b) != null && za1Var.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jla jlaVar;
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                rr0 rr0Var = (rr0) this.c;
                sr0 sr0Var = rr0Var.d;
                if (sr0Var != null) {
                    jlaVar = ((e) rr0Var).simpleActionBar;
                    sr0Var.setChromeTop(Math.max(0, jlaVar.getBottom() - rr0Var.d.x.top));
                }
                qr0 qr0Var = rr0Var.e;
                if (qr0Var != null) {
                    qr0Var.b();
                    break;
                }
                break;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                dc6 dc6Var = (dc6) ((am2) this.c).e;
                if (dc6Var != null) {
                    dc6Var.run();
                    break;
                }
                break;
            case 20:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = (i4 - i2) / 4;
                int i6 = i5 * 3;
                int D = ik8.D(275.0f, i6, 2);
                yr5 yr5Var = (yr5) this.c;
                FrameLayout frameLayout = yr5Var.r;
                frameLayout.layout(0, D, frameLayout.getMeasuredWidth(), yr5Var.r.getMeasuredHeight() + D);
                int L = hl.L(139.0f) + hl.L(150.0f) + D;
                int measuredWidth = (getMeasuredWidth() - yr5Var.e.getMeasuredWidth()) / 2;
                zw0 zw0Var = yr5Var.e;
                zw0Var.layout(measuredWidth, L, zw0Var.getMeasuredWidth() + measuredWidth, yr5Var.e.getMeasuredHeight() + L);
                fic ficVar = yr5Var.d;
                ficVar.layout(0, 0, ficVar.getMeasuredWidth(), yr5Var.d.getMeasuredHeight());
                int measuredHeight = ((i5 - yr5Var.n.getMeasuredHeight()) / 2) + i6;
                int measuredWidth2 = (getMeasuredWidth() - yr5Var.n.getMeasuredWidth()) / 2;
                u8 u8Var = yr5Var.n;
                u8Var.layout(measuredWidth2, measuredHeight, u8Var.getMeasuredWidth() + measuredWidth2, yr5Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - hl.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - yr5Var.f.getMeasuredWidth()) / 2;
                TextView textView = yr5Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), yr5Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = hl.L(4.0f) + (hl.O1() ? 0 : hl.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 21:
                int L4 = hl.L(25.0f) + hl.L(150.0f) + ik8.D(275.0f, ((i4 - i2) / 4) * 3, 2);
                int L5 = hl.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = hl.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = hl.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                ((ProfileActivity) this.c).K3();
                break;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + hl.m;
                    dy9 dy9Var = secretMediaViewer.n;
                    dy9Var.layout(dy9Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + hl.m)) - hl.L(10.0f);
                    kg5 kg5Var = secretMediaViewer.r;
                    kg5Var.layout(kg5Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight() + hl.m;
                    ic8 ic8Var = secretMediaViewer.Z;
                    ic8Var.layout(ic8Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i7 = i4 - i2;
                    view.layout(0, i7, i3 - i, hl.n + i7);
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                super.onMeasure(i, ik8.E(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(350.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                break;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.b;
                nu2 nu2Var = (nu2) this.c;
                if (!nu2Var.L || !nu2Var.K) {
                    int size = View.MeasureSpec.getSize(i2);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
                    }
                    int L = hl.L(50.0f);
                    int L2 = nu2Var.w != 0 ? 0 : hl.L(30.0f) + L;
                    if (!nu2Var.F && !nu2Var.x) {
                        L2 += L;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2 < paddingTop ? paddingTop - L2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
                break;
            case 17:
                yx4 yx4Var = (yx4) this.c;
                ArrayList arrayList = yx4Var.A2;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(hl.L(14.0f));
                textPaint.setTypeface(hl.o());
                int L3 = hl.L(14.0f);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    L3 = uh9.w(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) arrayList.get(i3)).toString())), L3);
                }
                int size2 = View.MeasureSpec.getSize(i);
                int min = Math.min(L3, Math.max(0, size2 - hl.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yx4Var.z2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size2 - min) / 2;
                super.onMeasure(i, i2);
                break;
            case 25:
                super.onMeasure(i, ik8.E(2.0f, ((xk8) this.c).t1, TLObject.FLAG_30));
                break;
            case 29:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                ic8 ic8Var = secretMediaViewer.Z;
                if (ic8Var != null) {
                    ic8Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - a.getCurrentActionBarHeight()) - hl.m) - (secretMediaViewer.T.getVisibility() == 0 ? secretMediaViewer.T.getMeasuredHeight() : 0), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.n, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 16:
                super.onSizeChanged(i, i2, i3, i4);
                n15 n15Var = (n15) this.c;
                n15Var.setBounds(0, 0, i, i2);
                n15Var.c(0, hl.L(24.0f) + getPaddingBottom());
                break;
            case 24:
                fz7 fz7Var = (fz7) this.c;
                nz4 nz4Var = fz7Var.I;
                super.onSizeChanged(i, i2, i3, i4);
                if (i > 0 && i2 > 0) {
                    fz7Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i2 * 54) / i)), Bitmap.Config.ARGB_8888);
                    fz7Var.L = new Canvas(fz7Var.K);
                    nz4Var.a(fz7Var.K);
                    nz4Var.b(i, i2);
                    break;
                }
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x027c, code lost:
    
        if (r12 > r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0289, code lost:
    
        if (r0 > r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (r1 > r2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02eb, code lost:
    
        if (r1 > r2) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f;
        za1 za1Var;
        float f2 = 0.0f;
        switch (this.a) {
            case 15:
                ll4 ll4Var = (ll4) this.c;
                gl4 gl4Var = ll4Var.r;
                boolean onTouchEvent = ((GestureDetector) ((kj4) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    hl.d3(gl4Var, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hl.r(gl4Var);
                    if (!ll4Var.h) {
                        wpa wpaVar = ll4Var.c.m;
                        if (((float) wpaVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f = -2.1474836E9f;
                        }
                        wpaVar.i = ll4.a(displayMetrics, f);
                        ll4Var.d.m.i = ll4.b(getResources().getDisplayMetrics(), (float) ll4Var.d.m.i);
                        ll4Var.c.h();
                        ll4Var.d.h();
                    }
                    ll4Var.n = false;
                    ll4Var.f = false;
                    ll4Var.h = false;
                }
                return onTouchEvent;
            case 26:
                return (((ProfileActivity) this.c).t5 == 0.0f && (za1Var = (za1) this.b) != null && za1Var.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 29:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.l0 == 0 && secretMediaViewer.I0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.K0.onTouchEvent(motionEvent) && secretMediaViewer.a1) {
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.Y0 = false;
                        secretMediaViewer.b(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.e1 = false;
                        dv9 dv9Var = secretMediaViewer.f1;
                        if (!dv9Var.q) {
                            dv9Var.a();
                        }
                        if (!secretMediaViewer.o0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.M0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.N0 = secretMediaViewer.x0;
                                secretMediaViewer.O0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.P0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.Q0 = secretMediaViewer.v0;
                                secretMediaViewer.R0 = secretMediaViewer.w0;
                                secretMediaViewer.Y0 = true;
                                secretMediaViewer.Z0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.S0 = motionEvent.getX();
                                float y = motionEvent.getY();
                                secretMediaViewer.T0 = y;
                                secretMediaViewer.p0 = y;
                                secretMediaViewer.o0 = false;
                                secretMediaViewer.c1 = true;
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 2) {
                        if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.o0 && secretMediaViewer.Y0) {
                            secretMediaViewer.e1 = true;
                            secretMediaViewer.x0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.M0) * secretMediaViewer.N0;
                            secretMediaViewer.v0 = uh9.x(secretMediaViewer.x0, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                            float height = secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2);
                            float height2 = (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0;
                            float f3 = secretMediaViewer.x0;
                            secretMediaViewer.w0 = uh9.x(f3, secretMediaViewer.N0, height2, height);
                            secretMediaViewer.o(f3);
                            secretMediaViewer.e.invalidate();
                        } else if (motionEvent.getPointerCount() == 1) {
                            float abs = Math.abs(motionEvent.getX() - secretMediaViewer.S0);
                            float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.p0);
                            if (abs > hl.L(3.0f) || abs2 > hl.L(3.0f)) {
                                secretMediaViewer.e1 = true;
                            }
                            if (secretMediaViewer.c1 && !secretMediaViewer.o0 && secretMediaViewer.x0 == 1.0f && abs2 >= hl.L(30.0f) && abs2 / 2.0f > abs) {
                                secretMediaViewer.o0 = true;
                                secretMediaViewer.Z0 = false;
                                secretMediaViewer.p0 = motionEvent.getY();
                                if (secretMediaViewer.j0) {
                                    secretMediaViewer.n(false, true);
                                }
                            } else if (secretMediaViewer.o0) {
                                secretMediaViewer.w0 = motionEvent.getY() - secretMediaViewer.p0;
                                secretMediaViewer.e.invalidate();
                            } else if (secretMediaViewer.b1 || secretMediaViewer.I0 != 0) {
                                secretMediaViewer.b1 = false;
                                secretMediaViewer.S0 = motionEvent.getX();
                                secretMediaViewer.T0 = motionEvent.getY();
                            } else {
                                float x = secretMediaViewer.S0 - motionEvent.getX();
                                float y2 = secretMediaViewer.T0 - motionEvent.getY();
                                if (secretMediaViewer.Z0 || ((secretMediaViewer.x0 == 1.0f && Math.abs(y2) + hl.L(12.0f) < Math.abs(x)) || secretMediaViewer.x0 != 1.0f)) {
                                    if (!secretMediaViewer.Z0) {
                                        secretMediaViewer.Z0 = true;
                                        secretMediaViewer.c1 = false;
                                        x = 0.0f;
                                        y2 = 0.0f;
                                    }
                                    secretMediaViewer.S0 = motionEvent.getX();
                                    secretMediaViewer.T0 = motionEvent.getY();
                                    secretMediaViewer.o(secretMediaViewer.x0);
                                    float f4 = secretMediaViewer.v0;
                                    if (f4 < secretMediaViewer.U0 || f4 > secretMediaViewer.V0) {
                                        x /= 3.0f;
                                    }
                                    float f5 = secretMediaViewer.X0;
                                    if (f5 == 0.0f) {
                                        float f6 = secretMediaViewer.W0;
                                        if (f6 == 0.0f) {
                                            float f7 = secretMediaViewer.w0;
                                            float f8 = f7 - y2;
                                            if (f8 < f6) {
                                                secretMediaViewer.w0 = f6;
                                                f5 = f6;
                                            } else if (f8 > f5) {
                                                secretMediaViewer.w0 = f5;
                                            } else {
                                                f5 = f7;
                                                f2 = y2;
                                            }
                                            secretMediaViewer.v0 = f4 - x;
                                            if (secretMediaViewer.x0 != 1.0f) {
                                                secretMediaViewer.w0 = f5 - f2;
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                    }
                                    float f9 = secretMediaViewer.w0;
                                    if (f9 < secretMediaViewer.W0 || f9 > f5) {
                                        y2 /= 3.0f;
                                    }
                                    f5 = f9;
                                    f2 = y2;
                                    secretMediaViewer.v0 = f4 - x;
                                    if (secretMediaViewer.x0 != 1.0f) {
                                    }
                                    secretMediaViewer.e.invalidate();
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        if (secretMediaViewer.Y0) {
                            secretMediaViewer.b1 = true;
                            float f10 = secretMediaViewer.x0;
                            if (f10 < 1.0f) {
                                secretMediaViewer.o(1.0f);
                                secretMediaViewer.a(1.0f, 0.0f, 0.0f, true);
                            } else if (f10 > 3.0f) {
                                float x2 = uh9.x(3.0f, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                float x3 = uh9.x(3.0f, secretMediaViewer.N0, (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2));
                                secretMediaViewer.o(3.0f);
                                float f11 = secretMediaViewer.U0;
                                if (x2 >= f11) {
                                    f11 = secretMediaViewer.V0;
                                    break;
                                }
                                x2 = f11;
                                float f12 = secretMediaViewer.W0;
                                if (x3 >= f12) {
                                    f12 = secretMediaViewer.X0;
                                    break;
                                }
                                x3 = f12;
                                secretMediaViewer.a(3.0f, x2, x3, true);
                            } else {
                                secretMediaViewer.b(true);
                            }
                            secretMediaViewer.Y0 = false;
                        } else if (secretMediaViewer.o0) {
                            if (Math.abs(secretMediaViewer.p0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                secretMediaViewer.c(true, false);
                            } else {
                                secretMediaViewer.a(1.0f, 0.0f, 0.0f, false);
                            }
                            secretMediaViewer.o0 = false;
                        } else if (secretMediaViewer.Z0) {
                            float f13 = secretMediaViewer.v0;
                            float f14 = secretMediaViewer.w0;
                            secretMediaViewer.o(secretMediaViewer.x0);
                            secretMediaViewer.Z0 = false;
                            secretMediaViewer.c1 = true;
                            float f15 = secretMediaViewer.v0;
                            float f16 = secretMediaViewer.U0;
                            if (f15 >= f16) {
                                f16 = secretMediaViewer.V0;
                                break;
                            }
                            f13 = f16;
                            float f17 = secretMediaViewer.w0;
                            float f18 = secretMediaViewer.W0;
                            if (f17 >= f18) {
                                f18 = secretMediaViewer.X0;
                                break;
                            }
                            f14 = f18;
                            secretMediaViewer.a(secretMediaViewer.x0, f13, f14, false);
                        }
                    }
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        switch (this.a) {
            case 3:
                super.onViewAdded(view);
                if (view instanceof sr0) {
                    view.setOutlineProvider(new dl0(this, (byte) 1));
                    view.setClipToOutline(true);
                    break;
                }
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        switch (this.a) {
            case 24:
                ((Paint) this.b).setColor(i);
                break;
            default:
                super.setBackgroundColor(i);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 15:
                super.setTranslationX(f);
                ((ll4) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 15:
                super.setTranslationY(f);
                ((ll4) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    private final void a(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(cb2 cb2Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = cb2Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(e53 e53Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.c = e53Var;
        this.b = new t10(this, (byte) 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(rg1 rg1Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = rg1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(eo0 eo0Var, Activity activity) {
        super(activity);
        this.a = (byte) 2;
        this.c = eo0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(t82 t82Var, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = t82Var;
        this.b = new p82(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = (byte) 27;
        this.c = new RectF();
        this.b = kjcVar;
        kjcVar.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        qd4.u(15.0f, 2131742906, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(hl.o());
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(2131742907, null));
        addView(textView, tre.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, tre.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(am2 am2Var, Context context) {
        super(context);
        this.a = (byte) 18;
        this.c = am2Var;
        xq2 xq2Var = new xq2();
        xq2Var.c = new j09((Object) xq2Var, (byte) 24);
        xq2Var.h = new ArrayList();
        xq2Var.d = this;
        xq2Var.e = context;
        this.b = xq2Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(fz7 fz7Var, Context context) {
        super(context);
        this.a = (byte) 24;
        this.c = fz7Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = (byte) 21;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(rr0 rr0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = rr0Var;
        this.b = new RectF();
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = (byte) 29;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(oe2 oe2Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = oe2Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Context context, int i, int i2) {
        super(context);
        this.a = (byte) 13;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        qd4.u(16.0f, 2131744992, 1, textView, null);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, tre.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.66f));
        paint.setColor(i2);
        paint2.setColor(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(rw2 rw2Var, Activity activity) {
        super(activity);
        this.a = (byte) 11;
        this.c = rw2Var;
        this.b = rw2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(i49 i49Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.c = i49Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 6:
                super(context);
                this.b = new Path();
                this.c = new pm3((byte) 7);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(uy5 uy5Var, Context context) {
        super(context);
        this.a = (byte) 22;
        this.c = uy5Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(bx7 bx7Var, Context context) {
        super(context);
        this.a = (byte) 23;
        this.c = bx7Var;
        this.b = new Path();
    }
}
