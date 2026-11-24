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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class su extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(Context context, ylb ylbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 16:
                super(context);
                this.c = new i15(8);
                this.b = ylbVar;
                break;
            default:
                LinearLayout i = hg9.i(context, 1);
                io ioVar = new io(context, false, false, false);
                this.b = ioVar;
                int i2 = cmb.F6;
                anb.U(ioVar, i2, ylbVar);
                ioVar.setTextSize(gm.L(17.0f));
                ioVar.setTypeface(gm.o());
                i.addView(ioVar, qoe.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                anb.X(textView, i2, ylbVar);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                i.addView(textView, qoe.r(-2, -2, 1));
                addView(i, qoe.e(-2, -2, 17));
                break;
        }
    }

    public final void b(Canvas canvas) {
        by7 by7Var = (by7) this.c;
        Drawable drawable = by7Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof ah7) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            by7Var.a.draw(canvas);
        } else {
            int max = Math.max(0, by7Var.H);
            float max2 = Math.max(getMeasuredWidth() / by7Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / by7Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(by7Var.a.getIntrinsicWidth() * max2);
            int ceil2 = (int) Math.ceil(by7Var.a.getIntrinsicHeight() * max2);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
            by7Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            by7Var.a.draw(canvas);
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
        ylb ylbVar;
        boolean z;
        float f;
        float f2;
        float f3;
        ?? r13;
        fg0 fg0Var;
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i = cmb.Z6;
                ylbVar = ((d) ((ep0) this.c).d).resourceProvider;
                paint.setColor(cmb.v0(i, ylbVar));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 3:
                rs0 rs0Var = (rs0) this.c;
                if (rs0Var.s != null && rs0Var.w) {
                    canvas.drawColor(Color.argb((int) (rs0Var.x * 56.0f), 0, 0, 0));
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
                paint2.setColor(cmb.v0(cmb.Z6, ((qh1) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 6:
                float L = gm.L(20.0f);
                RectF rectF = gm.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, nm7.d4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), gm.L(6.0f) + getPaddingTop());
                in3 in3Var = (in3) this.c;
                in3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - gm.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                in3Var.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                xb2 xb2Var = (xb2) this.c;
                int measuredWidth = xb2Var.getMeasuredWidth();
                int i2 = xb2Var.e;
                float x = xb2Var.getX();
                float f4 = xb2Var.d;
                ylb ylbVar2 = xb2Var.c;
                if (ylbVar2 != null) {
                    ylbVar2.b(x, f4, measuredWidth, i2);
                } else {
                    cmb.q(x, f4, measuredWidth, i2);
                }
                float L2 = gm.L(18.0f);
                float L3 = gm.L(18.0f);
                Paint d = ylbVar2 != null ? ylbVar2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = cmb.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L2, L3, d);
                if (ylbVar2 != null ? ylbVar2.g() : cmb.b1()) {
                    float L4 = gm.L(18.0f);
                    float L5 = gm.L(18.0f);
                    Paint d2 = ylbVar2 != null ? ylbVar2.d("paintChatActionBackgroundDarken") : null;
                    if (d2 == null) {
                        d2 = cmb.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L4, L5, d2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(cmb.v0(cmb.c7, ((if2) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 13:
                super.dispatchDraw(canvas);
                float L6 = gm.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L6, height, gm.N(9.2f), (Paint) this.b);
                for (int i3 = -1; i3 <= 1; i3++) {
                    canvas.drawCircle(aq1.e(4.0f, i3, L6), height, gm.N(1.35f), (Paint) this.c);
                }
                break;
            case 14:
                s24 s24Var = (s24) this.c;
                if (s24Var.H.v0 || s24Var.x <= 0.0f) {
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, gm.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), nm7.d4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (s24Var.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gm.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                }
            case 16:
                i15 i15Var = (i15) this.c;
                i15Var.b(cmb.p1(0.65f, cmb.v0(cmb.c6, (ylb) this.b)));
                i15Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 19:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                c75 c75Var = (c75) this.c;
                hd0 hd0Var = c75Var.K;
                TextView textView = c75Var.L;
                float f5 = c75Var.P;
                if (f5 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    hd0Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - d53.f.getInterpolation(f5);
                    float left = (c75Var.Q - getLeft()) * interpolation;
                    float left2 = (c75Var.R - textView.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((c75Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    hd0Var.setTranslationX(left);
                    textView.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 25:
                nj8 nj8Var = (nj8) this.b;
                nj8Var.d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF3 = gm.P;
                rectF3.set(0.0f, gm.L(2.0f), getMeasuredWidth(), gm.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint5 = nj8Var.f;
                paint5.setAlpha(((kj8) this.c).E1);
                canvas.drawRoundRect(rectF3, gm.L(24.0f) - 1, gm.L(24.0f) - 1, paint5);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.f5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.g5, profileActivity.r.getY());
                    f = 0.0f;
                    f2 = 28.0f;
                    r13 = 0;
                    z = true;
                    f3 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.f5.getMeasuredWidth(), profileActivity.f5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.f5.draw(canvas);
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
                if (profileActivity.A5 && profileActivity.C6 != f && profileActivity.y5 != 1.0f) {
                    float measuredHeight = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float L7 = gm.L(22.0f);
                    float x2 = ((profileActivity.r.getX() + (gm.L(f2) - profileActivity.z5)) - L7) - profileActivity.m2();
                    profileActivity.C5.i0(x2, measuredHeight - (L7 / 2.0f), L7, L7);
                    profileActivity.C5.setAlpha(profileActivity.C6);
                    canvas.save();
                    float f6 = profileActivity.C6;
                    canvas.scale(f6, f6, profileActivity.C5.r(), profileActivity.C5.s());
                    profileActivity.C5.h(canvas, null);
                    canvas.restore();
                    float f7 = profileActivity.y5;
                    zb1 zb1Var = (zb1) this.b;
                    if (f7 == f) {
                        if (zb1Var == null) {
                            zb1 zb1Var2 = new zb1(this);
                            this.b = zb1Var2;
                            zb1Var2.h = new q78(this, (byte) 29);
                        }
                        float L8 = (1.0f - profileActivity.y5) * gm.L(f2);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? profileActivity.T.getVisibilityFactor() * (gm.L(f3) + textWidth + gm.L(4.0f)) : f) + L8;
                        RectF rectF4 = gm.P;
                        rectF4.set(x2 - gm.L(4.0f), measuredHeight - gm.L(14.0f), x2 + max + gm.L(4.0f), measuredHeight + gm.L(14.0f));
                        zb1 zb1Var3 = (zb1) this.b;
                        zb1Var3.i = r13;
                        zb1Var3.c = r13;
                        zb1Var3.a(rectF4);
                        zb1 zb1Var4 = (zb1) this.b;
                        zb1Var4.n = z;
                        int p = on2.p(-1, 50);
                        zb1Var4.g.setColor((int) r13);
                        fg0 fg0Var2 = zb1Var4.e;
                        if (fg0Var2 != null) {
                            cmb.F1(fg0Var2, p, z);
                        }
                        zb1 zb1Var5 = (zb1) this.b;
                        zb1Var5.c(canvas, zb1Var5.g);
                        fg0 fg0Var3 = zb1Var5.e;
                        if (fg0Var3 != null) {
                            fg0Var3.draw(canvas);
                            break;
                        }
                    } else if (zb1Var != null && (fg0Var = zb1Var.e) != null) {
                        fg0Var.setState(StateSet.NOTHING);
                        fg0Var.jumpToCurrentState();
                        break;
                    }
                }
                break;
            case 27:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                lhc lhcVar = (lhc) this.b;
                lhcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, gm.L(28.0f), gm.L(28.0f), lhcVar.b());
                super.dispatchDraw(canvas);
                break;
            case 28:
                Paint paint6 = (Paint) this.b;
                v29 v29Var = (v29) this.c;
                ylb ylbVar3 = v29Var.l0;
                byte b = v29Var.N0;
                paint6.setColor((b == 1 || b == 2 || b == 4) ? on2.p(-1, 30) : on2.f(0.7f, cmb.v0(cmb.E8, ylbVar3), cmb.v0(cmb.g5, ylbVar3)));
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - gm.N(6.0f)) / 2.0f;
                float d3 = v29Var.d();
                RectF rectF6 = gm.P;
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
                x53 x53Var = (x53) this.c;
                if (!x53Var.k) {
                    return true;
                }
                x53Var.d();
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
                rkb m = oVar.R0.m(getContext());
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
                wj5 wj5Var = (wj5) ((sm2) this.c).c;
                return wj5Var != null ? wj5Var.a(motionEvent, new v05(this, (byte) 0)) : super.dispatchTouchEvent(motionEvent);
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
                if (view instanceof kw7) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 22:
                Path path = (Path) this.b;
                py5 py5Var = (py5) this.c;
                if (py5Var.h != null) {
                    if (py5Var.f) {
                        if (view == py5Var.d) {
                            f = py5Var.e;
                            canvas.save();
                            path.rewind();
                            path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                    } else if (view == py5Var.c) {
                        f = 1.0f - py5Var.e;
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
                vv7 vv7Var = (vv7) this.c;
                if (vv7Var.h != null) {
                    if (vv7Var.f) {
                        if (view == vv7Var.d) {
                            f2 = vv7Var.e;
                            canvas.save();
                            path2.rewind();
                            path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path2);
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        }
                    } else if (view == vv7Var.c) {
                        f2 = 1.0f - vv7Var.e;
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
        io ioVar = (io) this.b;
        ioVar.a();
        ioVar.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(pqe.a(f, 0.0f, 1.0f) * 100.0f))), !jb6.a0, true);
        r71 r71Var = (r71) this.c;
        r71Var.c = f;
        r71Var.invalidate();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 12:
                x53 x53Var = (x53) this.c;
                float f = x53Var.u;
                float f2 = rect.bottom;
                if (f != f2 && x53Var.v) {
                    x53Var.u = f2;
                    su suVar = x53Var.c;
                    w53 w53Var = x53Var.a;
                    if (!x53Var.q) {
                        float f3 = x53Var.t;
                        int L = gm.L(32.0f);
                        byte b = x53Var.y;
                        byte b2 = 1;
                        if (b == 1 || b == 2) {
                            L = gm.L(24.0f);
                        }
                        float f4 = L;
                        if (w53Var.getMeasuredHeight() + f3 > (suVar.getMeasuredHeight() - x53Var.u) - f4) {
                            f3 = ((suVar.getMeasuredHeight() - x53Var.u) - w53Var.getMeasuredHeight()) - f4;
                        }
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        w53Var.animate().translationY(f3).setDuration(250L).setUpdateListener(new s53(x53Var, b2)).setInterpolator(d53.f).start();
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
                ((j92) this.b).c();
                break;
            case 11:
                super.onAttachedToWindow();
                hx2 hx2Var = (hx2) this.c;
                hx2Var.A.I();
                hx2Var.B.I();
                break;
            case 12:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (s20) this.b);
                break;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).C5.I();
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
                ((j92) this.b).d();
                break;
            case 11:
                super.onDetachedFromWindow();
                hx2 hx2Var = (hx2) this.c;
                hx2Var.A.K();
                hx2Var.B.K();
                break;
            case 12:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).C5.K();
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
                hx2 hx2Var = (hx2) this.b;
                Paint paint = hx2Var.N;
                ImageReceiver imageReceiver = hx2Var.B;
                ColorDrawable colorDrawable = hx2Var.u;
                ImageReceiver imageReceiver2 = hx2Var.A;
                if (hx2Var.z != null) {
                    byte b = 1;
                    if (hx2Var.K && hx2Var.v == null && hx2Var.w != null && !hx2Var.e0) {
                        hx2Var.e0 = true;
                        imageReceiver2.v0(false, false);
                        vs9.d(new h92(hx2Var, (byte) 11));
                    }
                    if (hx2Var.v != null) {
                        boolean z = hx2Var.K;
                        float f = hx2Var.M;
                        if (z) {
                            if (f != 1.0f) {
                                float f2 = f + 0.13333334f;
                                hx2Var.M = f2;
                                if (f2 > 1.0f) {
                                    hx2Var.M = 1.0f;
                                }
                                hx2Var.z.invalidate();
                            }
                        } else if (f != 0.0f) {
                            float f3 = f - 0.13333334f;
                            hx2Var.M = f3;
                            if (f3 < 0.0f) {
                                hx2Var.M = 0.0f;
                            }
                            hx2Var.z.invalidate();
                        }
                        float f4 = hx2Var.M;
                        if (f4 != 0.0f && hx2Var.v != null) {
                            paint.setAlpha((int) (f4 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(cmb.p1(hx2Var.M, cmb.v0(cmb.Z6, hx2Var.c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (hx2Var.F * 180.0f));
                    colorDrawable.setBounds(0, 0, hx2Var.z.getWidth(), hx2Var.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    iq5 iq5Var = hx2Var.q;
                    int i = iq5Var.d;
                    int i2 = iq5Var.b;
                    int i3 = i + i2;
                    if (hx2Var.V == 1) {
                        min = Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - i3) - gm.L(40.0f);
                    } else {
                        boolean z2 = hx2Var.S;
                        su suVar = hx2Var.z;
                        min = (int) (z2 ? Math.min(suVar.getWidth(), hx2Var.z.getHeight() - i3) - gm.N(40.0f) : Math.min(suVar.getWidth(), hx2Var.z.getHeight() - i3) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i2 + (hx2Var.G != null ? gm.L(40.0f) : 0), ((hx2Var.z.getHeight() - i3) - hx2Var.I) / 2);
                    if (hx2Var.S) {
                        max += gm.L(40.0f);
                    }
                    canvas.translate(hx2Var.z.getWidth() / 2, hx2Var.e + max);
                    int i4 = (int) (min * ((hx2Var.F * 0.8f) / 0.8f));
                    if (hx2Var.V == 3) {
                        canvas.translate(0.0f, gm.L(70.0f));
                    }
                    boolean z3 = hx2Var.S;
                    float f5 = hx2Var.F;
                    if (z3) {
                        float f6 = i4;
                        float f7 = 0.6669f * f6;
                        imageReceiver2.setAlpha(f5);
                        float f8 = f6 - f7;
                        float f9 = f6 / 2.0f;
                        imageReceiver2.i0((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(hx2Var.F);
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
                    if (hx2Var.C != null) {
                        canvas.save();
                        float f13 = (-i4) / 2.0f;
                        canvas.translate(f13, f13);
                        float f14 = i4;
                        canvas.scale(f14 / hx2Var.C.getWidth(), f14 / hx2Var.C.getHeight());
                        hx2Var.C.setAlpha(hx2Var.F);
                        Path path = hx2Var.D;
                        if (path == null) {
                            path = new Path();
                            hx2Var.D = path;
                        }
                        path.rewind();
                        RectF rectF = gm.P;
                        rectF.set(0.0f, 0.0f, hx2Var.C.getWidth(), hx2Var.C.getHeight());
                        float f15 = f14 / 8.0f;
                        hx2Var.D.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                        canvas.clipPath(hx2Var.D);
                        hx2Var.C.draw(canvas);
                        canvas.restore();
                    }
                    if (hx2Var.V == 1 && !hx2Var.m && (drawable = hx2Var.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = hx2Var.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - gm.L(((hx2Var.d / gm.L(60.0f)) * 6.0f) + 17.0f));
                        hx2Var.J.setAlpha((int) ((1.0f - hx2Var.g) * 255.0f));
                        hx2Var.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        hx2Var.J.draw(canvas);
                    }
                    if (hx2Var.G != null) {
                        if (hx2Var.S) {
                            canvas.translate((-r2.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - gm.L(30.0f));
                        } else {
                            canvas.translate((-r2.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - gm.L(30.0f));
                        }
                        hx2.f0.setAlpha((int) (hx2Var.F * 255.0f));
                        hx2Var.G.draw(canvas);
                    }
                    canvas.restore();
                    boolean z4 = hx2Var.E;
                    float f16 = hx2Var.F;
                    if (z4) {
                        if (f16 != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - hx2Var.H;
                            hx2Var.H = currentTimeMillis;
                            hx2Var.F = (j / 120.0f) + hx2Var.F;
                            hx2Var.z.invalidate();
                            if (hx2Var.F > 1.0f) {
                                hx2Var.F = 1.0f;
                                break;
                            }
                        }
                    } else if (f16 != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = currentTimeMillis2 - hx2Var.H;
                        hx2Var.H = currentTimeMillis2;
                        hx2Var.F -= j2 / 120.0f;
                        hx2Var.z.invalidate();
                        float f17 = hx2Var.F;
                        if (f17 < 0.0f) {
                            hx2Var.F = 0.0f;
                            f17 = 0.0f;
                        }
                        if (f17 == 0.0f) {
                            imageReceiver2.g0(null);
                            gm.K3(hx2Var.w);
                            gm.c3(new sw2(hx2Var, b));
                            Bitmap bitmap = hx2Var.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                hx2Var.v = null;
                            }
                            gm.T3(hx2Var.O, false, 1.0f, true, false);
                            hx2Var.M = 0.0f;
                            try {
                                if (hx2Var.y.getParent() != null) {
                                    ((WindowManager) hx2Var.w.getSystemService("window")).removeView(hx2Var.y);
                                    break;
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 24:
                b(canvas);
                by7 by7Var = (by7) this.c;
                if (by7Var.K != null && by7Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    by7Var.K.eraseColor(0);
                    by7Var.L.save();
                    by7Var.L.scale(by7Var.K.getWidth() / getMeasuredWidth(), by7Var.K.getHeight() / getMeasuredHeight());
                    b(by7Var.L);
                    by7Var.L.restore();
                    by7Var.J.d();
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
        zb1 zb1Var;
        switch (this.a) {
            case 18:
                wj5 wj5Var = (wj5) ((sm2) this.c).d;
                return wj5Var != null ? wj5Var.a(motionEvent, new v05(this, (byte) 1)) : super.onInterceptTouchEvent(motionEvent);
            case 26:
                return (((ProfileActivity) this.c).y5 == 0.0f && (zb1Var = (zb1) this.b) != null && zb1Var.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        rja rjaVar;
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                rs0 rs0Var = (rs0) this.c;
                ss0 ss0Var = rs0Var.d;
                if (ss0Var != null) {
                    rjaVar = ((d) rs0Var).simpleActionBar;
                    ss0Var.setChromeTop(Math.max(0, rjaVar.getBottom() - rs0Var.d.x.top));
                }
                qs0 qs0Var = rs0Var.e;
                if (qs0Var != null) {
                    qs0Var.b();
                    break;
                }
                break;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                sb6 sb6Var = (sb6) ((sm2) this.c).e;
                if (sb6Var != null) {
                    sb6Var.run();
                    break;
                }
                break;
            case 20:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = (i4 - i2) / 4;
                int i6 = i5 * 3;
                int D = wi8.D(275.0f, i6, 2);
                vr5 vr5Var = (vr5) this.c;
                FrameLayout frameLayout = vr5Var.r;
                frameLayout.layout(0, D, frameLayout.getMeasuredWidth(), vr5Var.r.getMeasuredHeight() + D);
                int L = gm.L(139.0f) + gm.L(150.0f) + D;
                int measuredWidth = (getMeasuredWidth() - vr5Var.e.getMeasuredWidth()) / 2;
                yx0 yx0Var = vr5Var.e;
                yx0Var.layout(measuredWidth, L, yx0Var.getMeasuredWidth() + measuredWidth, vr5Var.e.getMeasuredHeight() + L);
                ggc ggcVar = vr5Var.d;
                ggcVar.layout(0, 0, ggcVar.getMeasuredWidth(), vr5Var.d.getMeasuredHeight());
                int measuredHeight = ((i5 - vr5Var.n.getMeasuredHeight()) / 2) + i6;
                int measuredWidth2 = (getMeasuredWidth() - vr5Var.n.getMeasuredWidth()) / 2;
                t8 t8Var = vr5Var.n;
                t8Var.layout(measuredWidth2, measuredHeight, t8Var.getMeasuredWidth() + measuredWidth2, vr5Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - gm.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - vr5Var.f.getMeasuredWidth()) / 2;
                TextView textView = vr5Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), vr5Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = gm.L(4.0f) + (gm.O1() ? 0 : gm.m);
                if (marginLayoutParams.topMargin != L3) {
                    marginLayoutParams.topMargin = L3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 21:
                int L4 = gm.L(25.0f) + gm.L(150.0f) + wi8.D(275.0f, ((i4 - i2) / 4) * 3, 2);
                int L5 = gm.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = gm.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = gm.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                break;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                ((ProfileActivity) this.c).N3();
                break;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gm.m;
                    lw9 lw9Var = secretMediaViewer.n;
                    lw9Var.layout(lw9Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gm.m)) - gm.L(10.0f);
                    hg5 hg5Var = secretMediaViewer.r;
                    hg5Var.layout(hg5Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight() + gm.m;
                    ta8 ta8Var = secretMediaViewer.Z;
                    ta8Var.layout(ta8Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i7 = i4 - i2;
                    view.layout(0, i7, i3 - i, gm.n + i7);
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
                super.onMeasure(i, wi8.E(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(350.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                break;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.b;
                ev2 ev2Var = (ev2) this.c;
                if (!ev2Var.L || !ev2Var.K) {
                    int size = View.MeasureSpec.getSize(i2);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
                    }
                    int L = gm.L(50.0f);
                    int L2 = ev2Var.w != 0 ? 0 : gm.L(30.0f) + L;
                    if (!ev2Var.F && !ev2Var.x) {
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
                ux4 ux4Var = (ux4) this.c;
                ArrayList arrayList = ux4Var.A2;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(gm.L(14.0f));
                textPaint.setTypeface(gm.o());
                int L3 = gm.L(14.0f);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    L3 = hg9.v(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) arrayList.get(i3)).toString())), L3);
                }
                int size2 = View.MeasureSpec.getSize(i);
                int min = Math.min(L3, Math.max(0, size2 - gm.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ux4Var.z2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size2 - min) / 2;
                super.onMeasure(i, i2);
                break;
            case 25:
                super.onMeasure(i, wi8.E(2.0f, ((kj8) this.c).t1, TLObject.FLAG_30));
                break;
            case 29:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                ta8 ta8Var = secretMediaViewer.Z;
                if (ta8Var != null) {
                    ta8Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - a.getCurrentActionBarHeight()) - gm.m) - (secretMediaViewer.T.getVisibility() == 0 ? secretMediaViewer.T.getMeasuredHeight() : 0), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.n, TLObject.FLAG_30));
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
                i15 i15Var = (i15) this.c;
                i15Var.setBounds(0, 0, i, i2);
                i15Var.c(0, gm.L(24.0f) + getPaddingBottom());
                break;
            case 24:
                by7 by7Var = (by7) this.c;
                jz4 jz4Var = by7Var.I;
                super.onSizeChanged(i, i2, i3, i4);
                if (i > 0 && i2 > 0) {
                    by7Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i2 * 54) / i)), Bitmap.Config.ARGB_8888);
                    by7Var.L = new Canvas(by7Var.K);
                    jz4Var.a(by7Var.K);
                    jz4Var.b(i, i2);
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
        zb1 zb1Var;
        float f2 = 0.0f;
        switch (this.a) {
            case 15:
                ll4 ll4Var = (ll4) this.c;
                gl4 gl4Var = ll4Var.r;
                boolean onTouchEvent = ((GestureDetector) ((lj4) this.b).a).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    gm.d3(gl4Var, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gm.r(gl4Var);
                    if (!ll4Var.h) {
                        aoa aoaVar = ll4Var.c.m;
                        if (((float) aoaVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f = -2.1474836E9f;
                        }
                        aoaVar.i = ll4.a(displayMetrics, f);
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
                return (((ProfileActivity) this.c).y5 == 0.0f && (zb1Var = (zb1) this.b) != null && zb1Var.b(motionEvent)) || super.onTouchEvent(motionEvent);
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
                        mt9 mt9Var = secretMediaViewer.f1;
                        if (!mt9Var.q) {
                            mt9Var.a();
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
                            secretMediaViewer.v0 = hg9.x(secretMediaViewer.x0, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                            float height = secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2);
                            float height2 = (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0;
                            float f3 = secretMediaViewer.x0;
                            secretMediaViewer.w0 = hg9.x(f3, secretMediaViewer.N0, height2, height);
                            secretMediaViewer.o(f3);
                            secretMediaViewer.e.invalidate();
                        } else if (motionEvent.getPointerCount() == 1) {
                            float abs = Math.abs(motionEvent.getX() - secretMediaViewer.S0);
                            float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.p0);
                            if (abs > gm.L(3.0f) || abs2 > gm.L(3.0f)) {
                                secretMediaViewer.e1 = true;
                            }
                            if (secretMediaViewer.c1 && !secretMediaViewer.o0 && secretMediaViewer.x0 == 1.0f && abs2 >= gm.L(30.0f) && abs2 / 2.0f > abs) {
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
                                if (secretMediaViewer.Z0 || ((secretMediaViewer.x0 == 1.0f && Math.abs(y2) + gm.L(12.0f) < Math.abs(x)) || secretMediaViewer.x0 != 1.0f)) {
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
                                float x2 = hg9.x(3.0f, secretMediaViewer.N0, (secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.Q0, secretMediaViewer.O0 - (secretMediaViewer.e.getWidth() / 2));
                                float x3 = hg9.x(3.0f, secretMediaViewer.N0, (secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getHeight() / 2));
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
                if (view instanceof ss0) {
                    view.setOutlineProvider(new cm0(this, (byte) 1));
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
    public /* synthetic */ su(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(xb2 xb2Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = xb2Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(x53 x53Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.c = x53Var;
        this.b = new s20(this, (byte) 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(qh1 qh1Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = qh1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(ep0 ep0Var, Activity activity) {
        super(activity);
        this.a = (byte) 2;
        this.c = ep0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(n92 n92Var, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = n92Var;
        this.b = new j92(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = (byte) 27;
        this.c = new RectF();
        this.b = lhcVar;
        lhcVar.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        td4.v(15.0f, 2131742938, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(gm.o());
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(jb6.M0(2131742939, null));
        addView(textView, qoe.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, qoe.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(sm2 sm2Var, Context context) {
        super(context);
        this.a = (byte) 18;
        this.c = sm2Var;
        pr2 pr2Var = new pr2();
        pr2Var.c = new cf9((Object) pr2Var, (byte) 19);
        pr2Var.h = new ArrayList();
        pr2Var.d = this;
        pr2Var.e = context;
        this.b = pr2Var;
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(by7 by7Var, Context context) {
        super(context);
        this.a = (byte) 24;
        this.c = by7Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = (byte) 21;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(rs0 rs0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = rs0Var;
        this.b = new RectF();
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = (byte) 29;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(Context context, int i, int i2) {
        super(context);
        this.a = (byte) 13;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        td4.v(16.0f, 2131745000, 1, textView, null);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, qoe.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(1.66f));
        paint.setColor(i2);
        paint2.setColor(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(if2 if2Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = if2Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(hx2 hx2Var, Activity activity) {
        super(activity);
        this.a = (byte) 11;
        this.c = hx2Var;
        this.b = hx2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(v29 v29Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.c = v29Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 6:
                super(context);
                this.b = new Path();
                this.c = new in3((byte) 7);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(py5 py5Var, Context context) {
        super(context);
        this.a = (byte) 22;
        this.c = py5Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(vv7 vv7Var, Context context) {
        super(context);
        this.a = (byte) 23;
        this.c = vv7Var;
        this.b = new Path();
    }
}
