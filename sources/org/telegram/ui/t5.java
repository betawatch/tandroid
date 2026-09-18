package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ t5(Context context) {
        super(context);
    }

    public float a() {
        yh.y3 y3Var = (yh.y3) this.e;
        return (y3Var.Y0.a(3) * y3Var.A0.getMeasuredHeight()) + (y3Var.Y0.a(2) * y3Var.y0.getMeasuredHeight()) + (y3Var.Y0.a(1) * y3Var.r0.getMeasuredHeight()) + (y3Var.Y0.a(0) * y3Var.f0.getMeasuredHeight()) + y3Var.e0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.c).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(w7.y5.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        yh.y3 y3Var = (yh.y3) this.e;
        org.telegram.ui.Components.wl0 wl0Var = y3Var.d;
        int childCount = wl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = wl0Var.getChildAt(childCount);
            wl0Var.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                if (S == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                }
                if (S == 1) {
                    max = childAt.getY();
                    break;
                }
                if (S == 0) {
                    max = childAt.getY() - y3Var.e0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (y3Var.Y0.a(4) * y3Var.getBottomInset()) + max;
        Float f7 = y3Var.X0;
        return (f7 == null || (dVar = y3Var.Y0) == null || dVar.c >= 1.0f) ? a2 : AndroidUtilities.lerp(f7.floatValue(), a2, y3Var.Y0.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        switch (this.a) {
            case 2:
                Path path = (Path) this.c;
                org.telegram.ui.Components.k41 k41Var = (org.telegram.ui.Components.k41) this.e;
                float z10 = k41Var.z(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.q.a(z10 / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                k41Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, z10));
                boolean z11 = z10 <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.b;
                if (bool == null || bool.booleanValue() != z11) {
                    this.b = Boolean.valueOf(z11);
                    AndroidUtilities.setLightStatusBar(k41Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z11 ? k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5) : org.telegram.ui.ActionBar.j6.v(k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f);
                }
                k41Var.topBulletinContainer.setTranslationY(Math.max(k41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z10) + getTranslationY() + ((-r3.getTop()) - k41Var.topBulletinContainer.getHeight()));
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, z10, getWidth(), getHeight() + lerp);
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path, (Paint) this.d);
                super.dispatchDraw(canvas);
                break;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix = (Matrix) this.b;
                Paint paint = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    int measuredHeight = photoViewer.n0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i13 = photoViewer.c2;
                    if (i13 == 0 || i13 == 2 || i13 == -1) {
                        matrix.reset();
                        float min = Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight);
                        matrix.postTranslate(0.0f, measuredHeight);
                        matrix.postScale(1.0f, min / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint.setShader(linearGradient);
                    } else {
                        paint.setShader(null);
                        paint.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
            case 6:
            case 10:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                Paint paint2 = (Paint) this.b;
                Paint paint3 = (Paint) this.d;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp = AndroidUtilities.dp(8.0f);
                Paint paint4 = (Paint) this.c;
                paint4.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                vd1 vd1Var = (vd1) this.e;
                paint4.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (vd1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp, dp, paint4);
                kd1 kd1Var = vd1Var.x0;
                vc1 vc1Var = vd1Var.a;
                org.telegram.ui.ActionBar.j6.s(this, kd1Var, vc1Var);
                Paint G = vc1Var.G("paintChatActionBackground");
                int alpha = G.getAlpha();
                G.setAlpha((int) (vd1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp, dp, G);
                G.setAlpha(alpha);
                if (vd1Var.M1) {
                    float f7 = vd1Var.n1;
                    if (f7 > 0.0f) {
                        paint2.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f * vd1Var.o1)));
                        canvas.drawRoundRect(rectF2, dp, dp, paint2);
                    }
                }
                paint3.setColor(520093695);
                paint3.setAlpha((int) (vd1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp, dp, paint3);
                super.dispatchDraw(canvas);
                break;
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                Paint paint5 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.P) {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, e6Var));
                } else if (limitPreviewView.c0 || limitPreviewView.R) {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var));
                } else {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, e6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rg.t tVar = limitPreviewView.e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((y0) tVar).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.R ? limitPreviewView.K : limitPreviewView.e0 != null ? (Paint) this.d : rg.a1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    rg.z0 z0Var = limitPreviewView.E;
                    if (z0Var != null) {
                        e = z0Var.f;
                        float f10 = limitPreviewView.c;
                        float f11 = -limitPreviewView.F;
                        z0Var.a();
                        Matrix matrix2 = z0Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f11);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        rg.a1 d = rg.a1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight2);
                    }
                } else {
                    rg.a1 d10 = rg.a1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight3 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight3);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (limitPreviewView.L || limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                Paint paint6 = (Paint) this.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ii, (org.telegram.ui.ActionBar.e6) this.b));
                rg.f0 f0Var = (rg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + f0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                rg.z0 z0Var2 = (rg.z0) this.c;
                z0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), z0Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                Drawable drawable3 = (Drawable) this.b;
                rg.x0 x0Var = (rg.x0) this.e;
                drawable = ((org.telegram.ui.ActionBar.f3) x0Var).shadowDrawable;
                int i14 = x0Var.M;
                i10 = ((org.telegram.ui.ActionBar.f3) x0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.messenger.wh.D(2.0f, i10 + i14, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) x0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.y7 y7Var = x0Var.N;
                if (y7Var != null && y7Var.getVisibility() == 0 && x0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, x0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + x0Var.N.getBottom());
                    drawable3.setAlpha((int) (x0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                y3Var.I(canvas, this);
                canvas.save();
                float d11 = d();
                float dp2 = AndroidUtilities.dp(12.0f);
                RectF rectF5 = (RectF) this.b;
                i11 = ((org.telegram.ui.ActionBar.f3) y3Var).backgroundPaddingLeft;
                int width = getWidth();
                i12 = ((org.telegram.ui.ActionBar.f3) y3Var).backgroundPaddingLeft;
                rectF5.set(i11, d11, width - i12, getHeight() + dp2);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(y3Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                Path path2 = (Path) this.d;
                path2.rewind();
                path2.addRoundRect(rectF5, dp2, dp2, Path.Direction.CW);
                canvas.drawPath(path2, paint7);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                org.telegram.ui.Components.xa xaVar = y3Var.e;
                if (xaVar != null && xaVar.getVisibility() == 0 && xaVar.getAlpha() > 0.0f) {
                    if (xaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(xaVar.getX(), xaVar.getY(), xaVar.getX() + xaVar.getMeasuredWidth(), xaVar.getY() + xaVar.getMeasuredHeight(), (int) (xaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(xaVar.getX(), xaVar.getY(), xaVar.getX() + xaVar.getMeasuredWidth(), xaVar.getY() + xaVar.getMeasuredHeight());
                    }
                    canvas.translate(xaVar.getX(), xaVar.getY());
                    xaVar.draw(canvas);
                    canvas.restore();
                }
                y3Var.H(canvas, this);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        ViewGroup viewGroup;
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.k41 k41Var = (org.telegram.ui.Components.k41) this.e;
                if (k41Var.J != null && k41Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + k41Var.J.y());
                    }
                    if (k41Var.J.y() && k41Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = k41Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                rg.x0 x0Var = (rg.x0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = x0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.f3) x0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        x0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) y3Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        y3Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.u1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 6:
                float[] fArr = (float[]) this.d;
                Path path = (Path) this.b;
                Matrix matrix = (Matrix) this.c;
                ci.c6 c6Var = (ci.c6) this.e;
                qg.x0 x0Var = c6Var.r0;
                if (view != c6Var.w0) {
                    return super.drawChild(canvas, view, j3);
                }
                cell = c6Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / c6Var.y0, photoImage.getImageHeight() / c6Var.z0);
                matrix.postScale((c6Var.y0 / c6Var.w0.getWidth()) * max, (c6Var.z0 / c6Var.w0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((c6Var.y0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((c6Var.z0 * max) / 2.0f));
                c6Var.w0.setTransform(matrix);
                canvas.save();
                path.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + x0Var.getX(), photoImage.getImageY() + cell.getY() + x0Var.getY(), photoImage.getImageX2() + cell.getX() + x0Var.getX(), photoImage.getImageY2() + cell.getY() + x0Var.getY());
                for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                    int i11 = i10 * 2;
                    fArr[i11] = photoImage.getRoundRadius()[i10];
                    fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                }
                path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 7:
            case 8:
            default:
                return super.drawChild(canvas, view, j3);
            case 9:
                Path path2 = (Path) this.c;
                if (view != ((ScrollView) this.d)) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                path2.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((rg.x0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j3);
                canvas.restore();
                return true;
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                yf.z zVar = (yf.z) this.d;
                yf.z zVar2 = (yf.z) this.c;
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                th.f fVar = (th.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.h0 && i12 > 0) {
                    zVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.j6.h5;
                    zVar2.b(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
                    zVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    zVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    zVar.b(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
                    zVar.draw(canvas);
                }
                return drawChild2;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                if (view == y3Var.e) {
                    return false;
                }
                if (view == y3Var.d0) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipPath((Path) this.d);
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
        }
    }

    public void e() {
        float d = d();
        yh.y3 y3Var = (yh.y3) this.e;
        yh.j2 j2Var = y3Var.d0;
        j2Var.setTranslationY(d - j2Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - j2Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        j2Var.setAlpha(y3Var.Y0.a(0) * clamp01);
        j2Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        j2Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        yh.v3 v3Var = y3Var.e0;
        v3Var.setTranslationY(d);
        y3Var.f0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.r0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.y0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.A0.setTranslationY(v3Var.getRealHeight() + d);
        FrameLayout frameLayout = y3Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(y3Var.n0, y3Var.d.canScrollVertically(1));
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                org.telegram.ui.Components.qc.a(this, new ci.d9(9));
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.qc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.d;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        switch (this.a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    int dp = (((i12 - i10) - (photoViewer.S0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.H0.getMeasuredWidth()) / 2;
                    bc1 bc1Var = photoViewer.H0;
                    bc1Var.layout(dp, bc1Var.getTop(), photoViewer.H0.getMeasuredWidth() + dp, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    break;
                }
                break;
            case 6:
                ci.c6 c6Var = (ci.c6) this.e;
                qg.x0 x0Var = c6Var.r0;
                int measuredWidth = x0Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                    View childAt = x0Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        left2 = childAt.getLeft() + u1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i14 = Math.max(right, i14);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i14 = Math.max(right, i14);
                }
                x0Var.layout(-measuredWidth, 0, x0Var.getMeasuredWidth() - measuredWidth, x0Var.getMeasuredHeight());
                TextureView textureView = c6Var.w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                    break;
                }
                break;
            case 7:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i16 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth2, i16);
                    childAt3.layout(measuredWidth2, 0, i12 - i10, i16);
                    break;
                } else {
                    super.onLayout(z10, i10, i11, i12, i13);
                    break;
                }
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                yh.y3 y3Var = (yh.y3) this.e;
                gg.n0 n0Var = y3Var.Q0;
                if (n0Var != null) {
                    n0Var.F(y3Var.e0.getFinalHeight(), y3Var.z1() + ((y3Var.Y0.d(1) && y3Var.m0.getVisibility() == 0) ? y3Var.m0.getMeasuredHeight() : 0));
                }
                y3Var.T1();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int left;
        int boundsRight;
        int i12;
        switch (this.a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                ((FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams()).rightMargin = photoViewer.S0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 5:
            case 8:
            case 10:
            default:
                super.onMeasure(i10, i11);
                break;
            case 6:
                ci.c6 c6Var = (ci.c6) this.e;
                qg.x0 x0Var = c6Var.r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = c6Var.w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = x0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < x0Var.getChildCount(); i14++) {
                    View childAt = x0Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        left2 = childAt.getLeft() + u1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i13 = Math.max(right, i13);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i13 = Math.max(right, i13);
                }
                setMeasuredDimension(i13 - measuredWidth, x0Var.getMeasuredHeight());
                break;
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                org.telegram.ui.Components.tg0 tg0Var = limitPreviewView.g0;
                org.telegram.ui.Components.p6 p6Var = limitPreviewView.N;
                org.telegram.ui.Components.tg0 tg0Var2 = limitPreviewView.f0;
                org.telegram.ui.Components.p6 p6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    tg0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(tg0Var2.getMeasuredWidth(), p6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    tg0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.a;
                        if (f7 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                p6Var2.setTextColor((!limitPreviewView.L && limitPreviewView.e0 == null) ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var) : -1);
                                p6Var.setTextColor(limitPreviewView.e0 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var) : -1);
                            }
                        } else if (f7 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.L ? 0.0f : tg0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth2) - (limitPreviewView.L ? 0.0f : tg0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                p6Var2.setTextColor((!limitPreviewView.L && limitPreviewView.e0 == null) ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var) : -1);
                                p6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                p6Var2.setTextColor(-1);
                                p6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.a, size - Math.max(tg0Var.getMeasuredWidth(), (limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (p6Var2.getVisibility() == 0 ? p6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        tg0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                        tg0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 9:
                rg.x0 x0Var2 = (rg.x0) this.e;
                x0Var2.L = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.f3) x0Var2).backgroundPaddingTop;
                x0Var2.L = i12 + size3;
                super.onMeasure(i10, i11);
                x0Var2.y();
                break;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                int bottomInset = y3Var.getBottomInset();
                int i15 = 0;
                setPadding(0, 0, 0, bottomInset);
                y3Var.e0.L.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                y3Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 instanceof ci.f4) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt2 == y3Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt2.getLayoutParams() == null || childAt2.getLayoutParams().height != -1) ? 9999 : size4, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size5, size4);
                gg.n0 n0Var = y3Var.Q0;
                if (n0Var != null) {
                    int finalHeight = y3Var.e0.getFinalHeight();
                    int z12 = y3Var.z1();
                    if (y3Var.Y0.d(1) && y3Var.m0.getVisibility() == 0) {
                        i15 = y3Var.m0.getMeasuredHeight();
                    }
                    n0Var.F(finalHeight, z12 + i15);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                bt0 bt0Var = photoViewer.U1;
                if (bt0Var != null && bt0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.y7[0] * f7);
                }
                ct0 ct0Var = photoViewer.V1;
                if (ct0Var != null && ct0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.z7[0]);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f7);
                org.telegram.ui.Components.k41 k41Var = (org.telegram.ui.Components.k41) this.e;
                k41Var.topBulletinContainer.setTranslationY(Math.max(k41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, k41Var.z(true)) + ((-r1.getTop()) - k41Var.topBulletinContainer.getHeight()) + f7);
                break;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.q.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                j0 j0Var = photoViewer.X1;
                if (j0Var != null) {
                    j0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    break;
                }
                break;
            case 9:
                super.setTranslationY(f7);
                ((rg.x0) this.e).onContainerTranslationYChanged(f7);
                break;
            case 11:
                super.setTranslationY(f7);
                FrameLayout frameLayout2 = ((yh.y3) this.e).topBulletinContainer;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 3:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(ci.c6 c6Var, Context context) {
        super(context);
        this.e = c6Var;
        this.c = new Matrix();
        this.d = new float[8];
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = limitPreviewView;
        this.b = e6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(Context context, org.telegram.ui.ActionBar.e6 e6Var, th.f fVar) {
        super(context);
        this.e = fVar;
        this.b = e6Var;
        this.c = new yf.z(2);
        this.d = new yf.z(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(rg.x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = x0Var;
        this.d = scrollView;
        this.b = drawable;
        this.c = new Path();
    }

    public t5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.wh.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, e6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.b = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new k60(this, 29));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Context context) {
        super(context);
        this.e = v5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.y5.e(-2, -2, 1));
        addView(textView, w7.y5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(org.telegram.ui.Components.k41 k41Var, Context context) {
        super(context);
        this.e = k41Var;
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        org.telegram.ui.ActionBar.j6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(vd1 vd1Var, Activity activity) {
        super(activity);
        this.e = vd1Var;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(yh.y3 y3Var, Context context) {
        super(context);
        this.e = y3Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(rg.f0 f0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = f0Var;
        this.b = e6Var;
        this.c = new rg.z0(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, e6Var);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
    }
}
