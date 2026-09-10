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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u5 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ u5(Context context) {
        super(context);
    }

    public float a() {
        xh.x3 x3Var = (xh.x3) this.e;
        return (x3Var.Y0.a(3) * x3Var.A0.getMeasuredHeight()) + (x3Var.Y0.a(2) * x3Var.y0.getMeasuredHeight()) + (x3Var.Y0.a(1) * x3Var.r0.getMeasuredHeight()) + (x3Var.Y0.a(0) * x3Var.f0.getMeasuredHeight()) + x3Var.e0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.c).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(w7.a6.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        xh.x3 x3Var = (xh.x3) this.e;
        org.telegram.ui.Components.vl0 vl0Var = x3Var.d;
        int childCount = vl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = vl0Var.getChildAt(childCount);
            vl0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                }
                if (R == 1) {
                    max = childAt.getY();
                    break;
                }
                if (R == 0) {
                    max = childAt.getY() - x3Var.e0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (x3Var.Y0.a(4) * x3Var.getBottomInset()) + max;
        Float f7 = x3Var.X0;
        return (f7 == null || (dVar = x3Var.Y0) == null || dVar.c >= 1.0f) ? a2 : AndroidUtilities.lerp(f7.floatValue(), a2, x3Var.Y0.c);
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
                org.telegram.ui.Components.i41 i41Var = (org.telegram.ui.Components.i41) this.e;
                float z10 = i41Var.z(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.q.a(z10 / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                i41Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, z10));
                boolean z11 = z10 <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.b;
                if (bool == null || bool.booleanValue() != z11) {
                    this.b = Boolean.valueOf(z11);
                    AndroidUtilities.setLightStatusBar(i41Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z11 ? i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5) : org.telegram.ui.ActionBar.j6.v(i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f);
                }
                i41Var.topBulletinContainer.setTranslationY(Math.max(i41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z10) + getTranslationY() + ((-r3.getTop()) - i41Var.topBulletinContainer.getHeight()));
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
                ae1 ae1Var = (ae1) this.e;
                paint4.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (ae1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp, dp, paint4);
                pd1 pd1Var = ae1Var.x0;
                ad1 ad1Var = ae1Var.a;
                org.telegram.ui.ActionBar.j6.s(this, pd1Var, ad1Var);
                Paint F = ad1Var.F("paintChatActionBackground");
                int alpha = F.getAlpha();
                F.setAlpha((int) (ae1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp, dp, F);
                F.setAlpha(alpha);
                if (ae1Var.M1) {
                    float f7 = ae1Var.n1;
                    if (f7 > 0.0f) {
                        paint2.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f * ae1Var.o1)));
                        canvas.drawRoundRect(rectF2, dp, dp, paint2);
                    }
                }
                paint3.setColor(520093695);
                paint3.setAlpha((int) (ae1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp, dp, paint3);
                super.dispatchDraw(canvas);
                break;
            case 7:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.b;
                Paint paint5 = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (!limitPreviewView.P) {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
                } else if (limitPreviewView.c0 || limitPreviewView.R) {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
                } else {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qg.u uVar = limitPreviewView.e0;
                if (uVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((w5) ((a1) uVar).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint e = limitPreviewView.R ? limitPreviewView.K : limitPreviewView.e0 != null ? (Paint) this.d : qg.d1.d().e();
                ViewGroup viewGroup = limitPreviewView.y;
                if (viewGroup != null) {
                    qg.c1 c1Var = limitPreviewView.E;
                    if (c1Var != null) {
                        e = c1Var.f;
                        float f10 = limitPreviewView.c;
                        float f11 = -limitPreviewView.F;
                        c1Var.a();
                        Matrix matrix2 = c1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, f11);
                        c1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        qg.d1 d = qg.d1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight2 = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f12, measuredWidth, measuredHeight2);
                    }
                } else {
                    qg.d1 d10 = qg.d1.d();
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
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ii, (org.telegram.ui.ActionBar.f6) this.b));
                qg.g0 g0Var = (qg.g0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, g0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + g0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(g0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((g0Var.d.getBottom() + g0Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + g0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (g0Var.d.getBottom() + g0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                qg.c1 c1Var2 = (qg.c1) this.c;
                c1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), c1Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 9:
                Drawable drawable3 = (Drawable) this.b;
                qg.a1 a1Var = (qg.a1) this.e;
                drawable = ((org.telegram.ui.ActionBar.h3) a1Var).shadowDrawable;
                int i14 = a1Var.M;
                i10 = ((org.telegram.ui.ActionBar.h3) a1Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.messenger.em.D(2.0f, i10 + i14, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.h3) a1Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.y7 y7Var = a1Var.N;
                if (y7Var != null && y7Var.getVisibility() == 0 && a1Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, a1Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + a1Var.N.getBottom());
                    drawable3.setAlpha((int) (a1Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    break;
                }
                break;
            case 11:
                xh.x3 x3Var = (xh.x3) this.e;
                x3Var.I(canvas, this);
                canvas.save();
                float d11 = d();
                float dp2 = AndroidUtilities.dp(12.0f);
                RectF rectF5 = (RectF) this.b;
                i11 = ((org.telegram.ui.ActionBar.h3) x3Var).backgroundPaddingLeft;
                int width = getWidth();
                i12 = ((org.telegram.ui.ActionBar.h3) x3Var).backgroundPaddingLeft;
                rectF5.set(i11, d11, width - i12, getHeight() + dp2);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(x3Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                Path path2 = (Path) this.d;
                path2.rewind();
                path2.addRoundRect(rectF5, dp2, dp2, Path.Direction.CW);
                canvas.drawPath(path2, paint7);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                org.telegram.ui.Components.wa waVar = x3Var.e;
                if (waVar != null && waVar.getVisibility() == 0 && waVar.getAlpha() > 0.0f) {
                    if (waVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(waVar.getX(), waVar.getY(), waVar.getX() + waVar.getMeasuredWidth(), waVar.getY() + waVar.getMeasuredHeight(), (int) (waVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(waVar.getX(), waVar.getY(), waVar.getX() + waVar.getMeasuredWidth(), waVar.getY() + waVar.getMeasuredHeight());
                    }
                    canvas.translate(waVar.getX(), waVar.getY());
                    waVar.draw(canvas);
                    canvas.restore();
                }
                x3Var.H(canvas, this);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        ViewGroup viewGroup;
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.i41 i41Var = (org.telegram.ui.Components.i41) this.e;
                if (i41Var.J != null && i41Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + i41Var.J.y());
                    }
                    if (i41Var.J.y() && i41Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = i41Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                qg.a1 a1Var = (qg.a1) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = a1Var.M;
                    i10 = ((org.telegram.ui.ActionBar.h3) a1Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        a1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                xh.x3 x3Var = (xh.x3) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d()) {
                    viewGroup = ((org.telegram.ui.ActionBar.h3) x3Var).containerView;
                    if (viewGroup.isAttachedToWindow()) {
                        x3Var.dismiss();
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
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((w5) this.e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        org.telegram.ui.Cells.t1 cell;
        ImageReceiver photoImage;
        switch (this.a) {
            case 6:
                float[] fArr = (float[]) this.d;
                Path path = (Path) this.b;
                Matrix matrix = (Matrix) this.c;
                bi.b7 b7Var = (bi.b7) this.e;
                pg.x0 x0Var = b7Var.r0;
                if (view != b7Var.w0) {
                    return super.drawChild(canvas, view, j3);
                }
                cell = b7Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float max = Math.max(photoImage.getImageWidth() / b7Var.y0, photoImage.getImageHeight() / b7Var.z0);
                matrix.postScale((b7Var.y0 / b7Var.w0.getWidth()) * max, (b7Var.z0 / b7Var.w0.getHeight()) * max);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((b7Var.y0 * max) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((b7Var.z0 * max) / 2.0f));
                b7Var.w0.setTransform(matrix);
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
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((qg.a1) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                super.drawChild(canvas, view, j3);
                canvas.restore();
                return true;
            case 10:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.b;
                xf.z zVar = (xf.z) this.d;
                xf.z zVar2 = (xf.z) this.c;
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                sh.f fVar = (sh.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.h0 && i12 > 0) {
                    zVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.j6.h5;
                    zVar2.b(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                    zVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    zVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    zVar.b(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                    zVar.draw(canvas);
                }
                return drawChild2;
            case 11:
                xh.x3 x3Var = (xh.x3) this.e;
                if (view == x3Var.e) {
                    return false;
                }
                if (view == x3Var.d0) {
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
        xh.x3 x3Var = (xh.x3) this.e;
        xh.j2 j2Var = x3Var.d0;
        j2Var.setTranslationY(d - j2Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - j2Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        j2Var.setAlpha(x3Var.Y0.a(0) * clamp01);
        j2Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        j2Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        xh.u3 u3Var = x3Var.e0;
        u3Var.setTranslationY(d);
        x3Var.f0.setTranslationY(u3Var.getRealHeight() + d);
        x3Var.r0.setTranslationY(u3Var.getRealHeight() + d);
        x3Var.y0.setTranslationY(u3Var.getRealHeight() + d);
        x3Var.A0.setTranslationY(u3Var.getRealHeight() + d);
        FrameLayout frameLayout = x3Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(x3Var.n0, x3Var.d.canScrollVertically(1));
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
                org.telegram.ui.Components.pc.a(this, new bi.fa(9));
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
                org.telegram.ui.Components.pc.h(this);
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
                    gc1 gc1Var = photoViewer.H0;
                    gc1Var.layout(dp, gc1Var.getTop(), photoViewer.H0.getMeasuredWidth() + dp, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    break;
                }
                break;
            case 6:
                bi.b7 b7Var = (bi.b7) this.e;
                pg.x0 x0Var = b7Var.r0;
                int measuredWidth = x0Var.getMeasuredWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                    View childAt = x0Var.getChildAt(i15);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                TextureView textureView = b7Var.w0;
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
                xh.x3 x3Var = (xh.x3) this.e;
                fg.n0 n0Var = x3Var.Q0;
                if (n0Var != null) {
                    n0Var.F(x3Var.e0.getFinalHeight(), x3Var.z1() + ((x3Var.Y0.d(1) && x3Var.m0.getVisibility() == 0) ? x3Var.m0.getMeasuredHeight() : 0));
                }
                x3Var.T1();
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
                bi.b7 b7Var = (bi.b7) this.e;
                pg.x0 x0Var = b7Var.r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = b7Var.w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), TLObject.FLAG_30));
                }
                int measuredWidth = x0Var.getMeasuredWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < x0Var.getChildCount(); i14++) {
                    View childAt = x0Var.getChildAt(i14);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.w;
                org.telegram.ui.Components.sg0 sg0Var = limitPreviewView.g0;
                org.telegram.ui.Components.o6 o6Var = limitPreviewView.N;
                org.telegram.ui.Components.sg0 sg0Var2 = limitPreviewView.f0;
                org.telegram.ui.Components.o6 o6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    sg0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    int max = Math.max(sg0Var2.getMeasuredWidth(), o6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    sg0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.a;
                        if (f7 == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                o6Var2.setTextColor((!limitPreviewView.L && limitPreviewView.e0 == null) ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var) : -1);
                                o6Var.setTextColor(limitPreviewView.e0 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var) : -1);
                            }
                        } else if (f7 < 1.0f) {
                            float measuredWidth2 = limitPreviewView.L ? 0.0f : sg0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.n = (int) ((((size - measuredWidth2) - (limitPreviewView.L ? 0.0f : sg0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.a) + measuredWidth2);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                o6Var2.setTextColor((!limitPreviewView.L && limitPreviewView.e0 == null) ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var) : -1);
                                o6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                o6Var2.setTextColor(-1);
                                o6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.a, size - Math.max(sg0Var.getMeasuredWidth(), (limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (o6Var2.getVisibility() == 0 ? o6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), max);
                        limitPreviewView.n = clamp;
                        sg0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                        sg0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 9:
                qg.a1 a1Var = (qg.a1) this.e;
                a1Var.L = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_31));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.h3) a1Var).backgroundPaddingTop;
                a1Var.L = i12 + size3;
                super.onMeasure(i10, i11);
                a1Var.y();
                break;
            case 11:
                xh.x3 x3Var = (xh.x3) this.e;
                int bottomInset = x3Var.getBottomInset();
                int i15 = 0;
                setPadding(0, 0, 0, bottomInset);
                x3Var.e0.L.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                x3Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 instanceof bi.x4) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                    } else if (childAt2 == x3Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, TLObject.FLAG_30));
                    } else {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt2.getLayoutParams() == null || childAt2.getLayoutParams().height != -1) ? 9999 : size4, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size5, size4);
                fg.n0 n0Var = x3Var.Q0;
                if (n0Var != null) {
                    int finalHeight = x3Var.e0.getFinalHeight();
                    int z12 = x3Var.z1();
                    if (x3Var.Y0.d(1) && x3Var.m0.getVisibility() == 0) {
                        i15 = x3Var.m0.getMeasuredHeight();
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
                FrameLayout frameLayout = photoViewer.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.Q7.setAlpha(f7);
                }
                at0 at0Var = photoViewer.U1;
                if (at0Var != null && at0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.y7[0] * f7);
                }
                bt0 bt0Var = photoViewer.V1;
                if (bt0Var != null && bt0Var.getVisibility() != 8) {
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
                org.telegram.ui.Components.i41 i41Var = (org.telegram.ui.Components.i41) this.e;
                i41Var.topBulletinContainer.setTranslationY(Math.max(i41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, i41Var.z(true)) + ((-r1.getTop()) - i41Var.topBulletinContainer.getHeight()) + f7);
                break;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.Q7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * hc.b.g(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                k0 k0Var = photoViewer.X1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.S7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.S7.setTranslationY(f7);
                    break;
                }
                break;
            case 9:
                super.setTranslationY(f7);
                ((qg.a1) this.e).onContainerTranslationYChanged(f7);
                break;
            case 11:
                super.setTranslationY(f7);
                FrameLayout frameLayout2 = ((xh.x3) this.e).topBulletinContainer;
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
                FrameLayout frameLayout = photoViewer.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.Q7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(bi.b7 b7Var, Context context) {
        super(context);
        this.e = b7Var;
        this.c = new Matrix();
        this.d = new float[8];
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = limitPreviewView;
        this.b = f6Var;
        this.c = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var, sh.f fVar) {
        super(context);
        this.e = fVar;
        this.b = f6Var;
        this.c = new xf.z(2);
        this.d = new xf.z(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(qg.a1 a1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = a1Var;
        this.d = scrollView;
        this.b = drawable;
        this.c = new Path();
    }

    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.em.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.b = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(-1);
        addView(imageView, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new l60(this, 29));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(w5 w5Var, Context context) {
        super(context);
        this.e = w5Var;
        this.b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.a6.e(-2, -2, 1));
        addView(textView, w7.a6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(org.telegram.ui.Components.i41 i41Var, Context context) {
        super(context);
        this.e = i41Var;
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        org.telegram.ui.ActionBar.j6.m(paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(ae1 ae1Var, Activity activity) {
        super(activity);
        this.e = ae1Var;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(xh.x3 x3Var, Context context) {
        super(context);
        this.e = x3Var;
        this.b = new RectF();
        this.c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(qg.g0 g0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = g0Var;
        this.b = f6Var;
        this.c = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, f6Var);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = new Matrix();
    }
}
