// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yd extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(cf4 cf4Var, Context context) {
        super(context);
        this.a = (byte) 20;
        this.b = cf4Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(22.0f);
        int i = cmb.Ei;
        byte b = 0;
        ShapeDrawable b0 = cmb.b0(L, cmb.w0(null, i, false));
        wmb M = anb.M(i);
        imageView.setBackground(b0);
        anb.j(imageView, b0, M, null, null);
        addView(imageView, qoe.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xna xnaVar = new xna(context);
        xnaVar.setTypeface(gm.o());
        xnaVar.setTextSize(1, 20.0f);
        int i2 = cmb.i5;
        anb.X(xnaVar, i2, null);
        xnaVar.setGravity(1);
        xnaVar.setText(cf4Var.Z0(xnaVar));
        ub7 ub7Var = cf4Var.T1;
        if (ub7Var != null && ub7Var.n) {
            b = 26;
        }
        xnaVar.s = b;
        addView(xnaVar, qoe.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(cf4Var.U1.isEmpty() ? jb6.M0(2131750576, null) : jb6.M0(2131750577, null));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        anb.X(textView, i2, null);
        addView(textView, qoe.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        anb.s(imageView2, cmb.B6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new sf3(this, (byte) 13));
        addView(imageView2, qoe.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    public final ae2 a() {
        return ((ae2[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        switch (this.a) {
            case 13:
                super.addView(view, i, i2);
                ((va2) this.b).e();
                break;
            default:
                super.addView(view, i, i2);
                break;
        }
    }

    public final void b(km0 km0Var, nm0 nm0Var) {
        e02 e02Var = (e02) this.b;
        e02Var.c(km0Var, nm0Var);
        e02Var.setIgnoreFastWay(true);
        e02Var.setFadeHeightTop(gm.L(48.0f));
        e02Var.setFadeHeightBottom(gm.L(48.0f));
    }

    public final void c() {
        ae2[] ae2VarArr = (ae2[]) this.b;
        ae2 ae2Var = ae2VarArr[0];
        ae2 ae2Var2 = ae2VarArr[1];
        ae2VarArr[0] = ae2Var2;
        ae2VarArr[1] = ae2Var;
        ae2Var2.n = true;
        ae2Var2.setVisibility(0);
        ae2VarArr[0].setScaleX(0.8f);
        ae2VarArr[0].setScaleY(0.8f);
        ae2VarArr[0].setAlpha(0.0f);
        ae2VarArr[0].setTranslationY(gm.L(20.0f));
        ViewPropertyAnimator translationY = ae2VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        d53 d53Var = d53.h;
        wi8.t(translationY, d53Var, 320L);
        ae2 ae2Var3 = ae2VarArr[1];
        ae2Var3.n = false;
        ae2Var3.setVisibility(0);
        ae2VarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gm.L(20.0f)).setInterpolator(d53Var).setDuration(320L).withEndAction(new fo1(ae2Var3, (byte) 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 29:
                Typeface typeface = gm.a;
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    getChildAt(i).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                int measuredWidth = getMeasuredWidth() - gm.L(8.0f);
                n71 n71Var = (n71) this.b;
                ho hoVar = n71Var.c;
                int c = measuredWidth - ((int) hoVar.c());
                ho hoVar2 = n71Var.b;
                int c2 = (c + ((int) hoVar2.c())) / 2;
                if (!jb6.a0) {
                    hoVar2.setBounds(0, 0, c2, getHeight());
                    hoVar2.draw(canvas);
                    hoVar.setBounds(gm.L(8.0f) + c2, 0, getWidth(), getHeight());
                    hoVar.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 24:
                oc5 oc5Var = (oc5) this.b;
                mr3 mr3Var = oc5Var.q0;
                nz4 nz4Var = oc5Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
                    oc5Var.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (nz4Var != null && !nz4Var.r && nz4Var.k(measuredWidth2, measuredHeight)) {
                        mr3Var.b(nz4Var.i(measuredWidth2, measuredHeight), -3);
                        nz4Var.j();
                    }
                }
                super.dispatchDraw(canvas);
                gm.O(canvas, this, oc5Var.getThemedColor(cmb.c6), oc5Var.n0, 1.0f);
                break;
            case 29:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                String str = LaunchActivity.C1;
                View view = launchActivity.F0;
                if (view != null && view.getBackground() != null) {
                    int[] iArr = launchActivity.y1;
                    if (iArr == null) {
                        iArr = new int[2];
                        launchActivity.y1 = iArr;
                    }
                    launchActivity.F0.getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.y1;
                    int i = iArr2[0];
                    int i2 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int[] iArr3 = launchActivity.y1;
                    int i3 = i - iArr3[0];
                    int i4 = i2 - iArr3[1];
                    canvas.save();
                    canvas.translate(i3, i4);
                    launchActivity.F0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 16:
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                hx2 hx2Var = (hx2) this.b;
                if (hx2Var.n || hx2Var.K) {
                    hx2Var.c();
                    return true;
                }
                hx2Var.b();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                ek1 ek1Var = (ek1) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    ek1Var.x.X0.D0();
                    for (View view : ek1Var.b.getViewPages()) {
                        if (view instanceof ck1) {
                            ((ck1) view).a.D0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                n52 n52Var = (n52) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= n52Var.x0 && motionEvent.getY() <= n52Var.y0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 10:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                n52 n52Var = (n52) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - n52Var.z0);
                boolean drawChild = n52Var.y ? false : super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 17:
                zv3 zv3Var = (zv3) this.b;
                tvc tvcVar = zv3Var.m1;
                vv3 vv3Var = zv3Var.l1;
                super.onDetachedFromWindow();
                try {
                    if ((!zv3Var.H0() || vv3Var.getVisibility() != 0) && vv3Var.getParent() != null) {
                        removeView(vv3Var);
                        vv3Var.stopLoading();
                        vv3Var.loadUrl("about:blank");
                        vv3Var.destroy();
                    }
                    if (!tvcVar.f() && !zv3Var.H0()) {
                        if (zv3.R1 == zv3Var) {
                            zv3.R1 = null;
                        }
                        tvcVar.b();
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.onDraw(canvas);
                ef1 ef1Var = (ef1) this.b;
                if (ef1Var == null) {
                    ef1Var = new ef1();
                    this.b = ef1Var;
                    ef1Var.k = false;
                    ef1Var.m = 2.0f;
                }
                ef1Var.f = getMeasuredWidth();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((ef1) this.b).a(gm.L(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 4:
                ((rl0) this.b).e.a(canvas);
                break;
            case 10:
                n52 n52Var = (n52) this.b;
                Paint paint = n52Var.a0;
                paint.setColor(cmb.v0(cmb.g5, n52Var.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - n52Var.z0, paint);
                break;
            case 12:
                super.onDraw(canvas);
                n92 n92Var = (n92) this.b;
                if (n92Var.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - n92Var.y, getWidth(), getHeight(), n92Var.E);
                    break;
                }
                break;
            case 28:
                super.onDraw(canvas);
                sa8 sa8Var = (sa8) this.b;
                Paint paint2 = sa8Var.r1;
                iu7 iu7Var = sa8Var.k1;
                paint2.setAlpha((int) ((1.0f - sa8Var.t1) * iu7Var.getAlpha() * 102.0f));
                RectF rectF2 = gm.P;
                iu7Var.b(rectF2);
                float translationY = iu7Var.getTranslationY() + sa8Var.S0.getTranslationY() + iu7Var.getTop() + r3.getTop();
                float f = rectF2.left;
                tu7 tu7Var = sa8Var.l1;
                rectF2.set(gm.R1(f, tu7Var.getLeft(), sa8Var.t1), gm.R1(rectF2.top + translationY, tu7Var.getTop() - tu7Var.getTranslationY(), sa8Var.t1), gm.R1(rectF2.right, tu7Var.getRight(), sa8Var.t1), gm.R1(translationY + rectF2.bottom, tu7Var.getBottom() - tu7Var.getTranslationY(), sa8Var.t1));
                float L = gm.L(gm.U1(sa8Var.t1, 32, 16));
                Paint paint3 = sa8Var.s1;
                int alpha = paint3.getAlpha();
                paint3.setAlpha((int) (alpha * sa8Var.t1));
                canvas.drawRoundRect(rectF2, L, L, paint3);
                paint3.setAlpha(alpha);
                canvas.drawRoundRect(rectF2, L, L, paint2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.b).f);
                accessibilityNodeInfo.setCheckable(true);
                break;
            case 6:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 10:
                n52 n52Var = (n52) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= n52Var.x0 && motionEvent.getY() <= n52Var.y0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        char c;
        int i5;
        int i6;
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i7;
        int i8;
        char c2 = 2;
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                int i9 = i3 - i;
                if (((he) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i9 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - gm.L(8.0f)) / 2);
                    int i10 = paddingRight - max;
                    if (!jb6.a0) {
                        paddingLeft = i10;
                        i10 = paddingLeft;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = gm.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i10, paddingTop, i10 + max, gm.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, gm.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i10, L2, i10 + max, gm.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, gm.L(40.0f) + L2);
                        break;
                    }
                } else {
                    View view = null;
                    int i11 = 0;
                    while (i11 < childCount) {
                        View childAt = getChildAt(i11);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            c = c2;
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            if (view != null) {
                                i6 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                i5 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                            } else {
                                i5 = 0;
                                i6 = 0;
                            }
                            childAt.layout(i6, i5, measuredWidth3 + i6, measuredHeight3 + i5);
                        } else if (num.intValue() == -1) {
                            if (jb6.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            c = c2;
                            view = childAt;
                        } else if (num.intValue() != -2) {
                            c = c2;
                            if (num.intValue() == -4) {
                                View findViewWithTag5 = findViewWithTag(-3);
                                if (jb6.a0) {
                                    if (findViewWithTag5 == null) {
                                        left = i9 - getPaddingRight();
                                        measuredWidth = childAt.getMeasuredWidth();
                                    } else {
                                        left = findViewWithTag5.getLeft() - gm.L(8.0f);
                                        measuredWidth = childAt.getMeasuredWidth();
                                    }
                                    int i12 = left - measuredWidth;
                                    childAt.layout(i12, getPaddingTop(), childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    int paddingLeft2 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + gm.L(8.0f);
                                    childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -3) {
                                if (jb6.a0) {
                                    childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            }
                        } else if (jb6.a0) {
                            int paddingLeft3 = getPaddingLeft();
                            if (view != null) {
                                paddingLeft3 = hg9.v(8.0f, view.getMeasuredWidth(), paddingLeft3);
                            }
                            c = c2;
                            childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                        } else {
                            c = c2;
                            int paddingRight2 = (i9 - getPaddingRight()) - childAt.getMeasuredWidth();
                            if (view != null) {
                                paddingRight2 = wi8.B(8.0f, view.getMeasuredWidth(), paddingRight2);
                            }
                            childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                        }
                        i11++;
                        c2 = c;
                    }
                    break;
                }
                break;
            case 2:
                int paddingLeft4 = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
                int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft4, paddingTop2) - gm.L(24.0f);
                int min2 = Math.min(gm.L(60.0f), min);
                int L3 = (paddingTop2 - min2) - gm.L(48.0f);
                bd0 bd0Var = (bd0) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bd0Var.d;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L3, TLObject.FLAG_31));
                int b = pqe.b((paddingTop2 - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()) - gm.L(48.0f), min2, min);
                tc0 tc0Var = bd0Var.c;
                tc0Var.measure(View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30));
                int D = wi8.D(48.0f, (paddingTop2 - b) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tc0Var.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
                layoutParams.topMargin = gm.L(8.0f) + D;
                layoutParams2.topMargin = gm.L(4.0f) + hg9.v(8.0f, D, b);
                layoutParams2.leftMargin = gm.L(4.0f);
                layoutParams2.rightMargin = gm.L(4.0f);
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                int L4 = gm.L(36.0f);
                int i13 = ((i3 - i) - L4) / 2;
                int i14 = ((i4 - i2) - L4) / 2;
                ((rl0) this.b).e.f(i13, i14, i13 + L4, L4 + i14);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                TextView textView = chatAttachAlertPhotoLayout.r0;
                if (getMeasuredWidth() == gm.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i7 = getMeasuredWidth() / 2;
                    int i15 = measuredHeight / 2;
                    measuredHeight2 = gm.L(17.0f) + measuredHeight + i15;
                    i8 = i15 - gm.L(17.0f);
                    L = i7;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - gm.L(13.0f);
                    int i16 = measuredWidth2 / 2;
                    int L5 = measuredWidth2 + i16 + gm.L(17.0f);
                    L = i16 - gm.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - gm.L(13.0f);
                    i7 = L5;
                    i8 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - textView.getMeasuredHeight()) - gm.L(12.0f);
                if (getMeasuredWidth() == gm.L(126.0f)) {
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (textView.getMeasuredWidth() / 2) + measuredWidth2, textView.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), measuredHeight4, (textView.getMeasuredWidth() / 2) + measuredWidth2, textView.getMeasuredHeight() + measuredHeight4);
                }
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (shutterButton.getMeasuredHeight() / 2), (shutterButton.getMeasuredWidth() / 2) + measuredWidth2, (shutterButton.getMeasuredHeight() / 2) + measuredHeight);
                imageView.layout(i7 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + i7, (imageView.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i17 = 0; i17 < 2; i17++) {
                    ImageView imageView2 = imageViewArr[i17];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i8 - (imageViewArr[i17].getMeasuredHeight() / 2), (imageViewArr[i17].getMeasuredWidth() / 2) + L, (imageViewArr[i17].getMeasuredHeight() / 2) + i8);
                }
                break;
            case 12:
                super.onLayout(z, i, i2, i3, i4);
                n92 n92Var = (n92) this.b;
                if (n92Var.P && z) {
                    n92Var.j0(n92Var.R.e);
                    break;
                }
                break;
            case 23:
                super.onLayout(z, i, i2, i3, i4);
                oa5 oa5Var = (oa5) this.b;
                yd ydVar = oa5Var.b;
                int[] iArr = oa5Var.I;
                ydVar.getLocationOnScreen(iArr);
                oa5Var.P = iArr[0];
                oa5Var.O = iArr[1] - gm.L(25.0f);
                break;
            case 24:
                super.onLayout(z, i, i2, i3, i4);
                oc5 oc5Var = (oc5) this.b;
                oc5Var.i0();
                oc5Var.j0();
                oq4 oq4Var = oc5Var.f;
                h94 h94Var = oc5Var.b;
                oq4Var.setTranslationY(h94Var.f);
                oc5Var.k0();
                oc5Var.e.setTranslationY(gm.L(48.0f) + h94Var.f);
                break;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                xl5 xl5Var = (xl5) this.b;
                TextView textView2 = xl5Var.b;
                if (textView2 != null) {
                    int measuredWidth4 = ((xl5Var.b.getMeasuredWidth() / 2) + textView2.getLeft()) - (xl5Var.c.getMeasuredWidth() / 2);
                    int top = (xl5Var.e.getTop() + ((xl5Var.b.getMeasuredHeight() - xl5Var.c.getMeasuredHeight()) / 2)) - gm.L(16.0f);
                    TextView textView3 = xl5Var.c;
                    textView3.layout(measuredWidth4, top, textView3.getMeasuredWidth() + measuredWidth4, xl5Var.c.getMeasuredHeight() + top);
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
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                if (!((he) this.b).L0) {
                    int i3 = 0;
                    while (r1 < childCount) {
                        View childAt = getChildAt(r1);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i3 = childAt.getMeasuredWidth() + i3;
                        }
                        r1++;
                    }
                    if (i3 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i3 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i3 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i3 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i3 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - gm.L(8.0f)) / 2);
                    while (r1 < childCount) {
                        View childAt2 = getChildAt(r1);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
                        }
                        r1++;
                    }
                    break;
                }
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                break;
            case 3:
                if (View.MeasureSpec.getSize(i) <= gm.L(260.0f)) {
                    super.onMeasure(i, i2);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(320.0f), TLObject.FLAG_30), i2);
                    break;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L((((zv3) this.b).D1 ? 22 : 0) + 84) + ((int) Math.min(r11.B1 / (r11.A1 / size), gm.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 18:
                e34 e34Var = ((e24) this.b).G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((View) e34Var.getParent()) != null ? (int) (r11.getMeasuredHeight() - e34Var.getY()) : gm.L(120.0f)) - e34Var.c1, TLObject.FLAG_30));
                break;
            case 19:
                e34 e34Var2 = ((z24) this.b).R;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (wi8.D(8.0f, e34Var2.E0.getMeasuredHeight() - e34Var2.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(171.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(156.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i, i2);
                ((ox4) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 24:
                oc5 oc5Var = (oc5) this.b;
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                if (gm.O1() || size3 > size2) {
                    oc5Var.d0 = gm.L(144.0f);
                } else {
                    oc5Var.d0 = gm.L(56.0f);
                }
                aVar = ((d) oc5Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oc5Var.s.getLayoutParams();
                aVar2 = ((d) oc5Var).actionBar;
                marginLayoutParams.topMargin = gm.L(48.0f) + aVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) oc5Var.e.getLayoutParams();
                aVar3 = ((d) oc5Var).actionBar;
                marginLayoutParams2.topMargin = aVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) oc5Var.f.getLayoutParams();
                aVar4 = ((d) oc5Var).actionBar;
                marginLayoutParams3.topMargin = aVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) oc5Var.h.getLayoutParams();
                aVar5 = ((d) oc5Var).actionBar;
                marginLayoutParams4.topMargin = aVar5.getMeasuredHeight();
                oc5Var.h.getLayoutParams().height = oc5Var.d0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) oc5Var.d.getLayoutParams();
                aVar6 = ((d) oc5Var).actionBar;
                marginLayoutParams5.height = gm.L(53.0f) + aVar6.getMeasuredHeight() + oc5Var.d0;
                oc5Var.l0();
                super.onMeasure(i, i2);
                break;
            case 27:
                int size4 = View.MeasureSpec.getSize(i);
                ((es5) this.b).x = (gm.O1() || View.MeasureSpec.getSize(i2) > size4) ? gm.L(144.0f) : gm.L(78.0f);
                super.onMeasure(i, i2);
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
                hx2 hx2Var = (hx2) this.b;
                tl0.c(hx2Var.s, hx2Var.y);
                hx2Var.t.d();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 28:
                if (motionEvent.getActionMasked() == 0) {
                    sa8 sa8Var = (sa8) this.b;
                    if (sa8Var.u1) {
                        sa8Var.B0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        switch (this.a) {
            case 9:
                super.onViewAdded(view);
                bringChildToFront((e02) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f);
                my0 my0Var = (my0) this.b;
                FrameLayout frameLayout = my0Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(my0Var.c.getHeight() - my0Var.b.getY())) + my0Var.t0);
                }
                my0Var.d0(f);
                break;
            case 6:
            default:
                super.setTranslationY(f);
                break;
            case 7:
                super.setTranslationY(f);
                ((vg1) this.b).Y.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 23:
                super.setVisibility(i);
                ((oa5) this.b).d.setVisibility(i);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 6:
                n71 n71Var = (n71) this.b;
                return drawable == n71Var.c || drawable == n71Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(Context context) {
        super(context);
        this.a = (byte) 9;
        e02 e02Var = new e02(context);
        this.b = e02Var;
        addView(e02Var, qoe.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 14;
        this.b = new ae2[2];
        int i = 0;
        while (true) {
            ae2[] ae2VarArr = (ae2[]) this.b;
            if (i < ae2VarArr.length) {
                ae2VarArr[i] = new ae2(context, ylbVar);
                addView(((ae2[]) this.b)[i], qoe.e(-1, -1, nm7.D1));
                i++;
            } else {
                ae2VarArr[0].setVisibility(0);
                ((ae2[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(Context context, String str, r63 r63Var) {
        super(context);
        this.a = (byte) 25;
        int L = gm.L(12.0f);
        int i = cmb.i5;
        Drawable b0 = cmb.b0(L, cmb.p1(0.06f, cmb.v0(i, r63Var)));
        wmb K = anb.K(0.06f, i);
        setBackground(b0);
        anb.j(this, b0, K, null, r63Var);
        LinearLayout i2 = hg9.i(context, 1);
        addView(i2, qoe.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        io ioVar = new io(context, false, true, true);
        this.b = ioVar;
        ioVar.b(0.6f, 450L, d53.h);
        ioVar.setTextSize(gm.L(17.0f));
        anb.U(ioVar, i, r63Var);
        ioVar.setScaleProperty(0.7f);
        ioVar.setGravity(17);
        ioVar.setTypeface(gm.o());
        ioVar.setAllowCancel(true);
        i2.addView(ioVar, qoe.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        anb.X(textView, i, r63Var);
        textView.setGravity(17);
        i2.addView(textView, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(n92 n92Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.b = n92Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(sa8 sa8Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.b = sa8Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
