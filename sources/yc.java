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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yc extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(cd4 cd4Var, Context context) {
        super(context);
        this.a = (byte) 20;
        this.b = cd4Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(22.0f);
        int i = bkb.Ei;
        byte b = 0;
        ShapeDrawable b0 = bkb.b0(L, bkb.w0(null, i, false));
        vkb M = zkb.M(i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, null);
        addView(imageView, nme.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        wla wlaVar = new wla(context);
        wlaVar.setTypeface(gl.o());
        wlaVar.setTextSize(1, 20.0f);
        int i2 = bkb.i5;
        zkb.X(wlaVar, i2, null);
        wlaVar.setGravity(1);
        wlaVar.setText(cd4Var.Z0(wlaVar));
        t97 t97Var = cd4Var.T1;
        if (t97Var != null && t97Var.n) {
            b = 26;
        }
        wlaVar.s = b;
        addView(wlaVar, nme.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(cd4Var.U1.isEmpty() ? k96.M0(2131750627, null) : k96.M0(2131750628, null));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i2, null);
        addView(textView, nme.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        zkb.s(imageView2, bkb.B6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new yj3(this, (byte) 10));
        addView(imageView2, nme.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    public final pc2 a() {
        return ((pc2[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        switch (this.a) {
            case 13:
                super.addView(view, i, i2);
                ((j92) this.b).e();
                break;
            default:
                super.addView(view, i, i2);
                break;
        }
    }

    public final void b(kl0 kl0Var, nl0 nl0Var) {
        ry1 ry1Var = (ry1) this.b;
        ry1Var.c(kl0Var, nl0Var);
        ry1Var.setIgnoreFastWay(true);
        ry1Var.setFadeHeightTop(gl.L(48.0f));
        ry1Var.setFadeHeightBottom(gl.L(48.0f));
    }

    public final void c() {
        pc2[] pc2VarArr = (pc2[]) this.b;
        pc2 pc2Var = pc2VarArr[0];
        pc2 pc2Var2 = pc2VarArr[1];
        pc2VarArr[0] = pc2Var2;
        pc2VarArr[1] = pc2Var;
        pc2Var2.n = true;
        pc2Var2.setVisibility(0);
        pc2VarArr[0].setScaleX(0.8f);
        pc2VarArr[0].setScaleY(0.8f);
        pc2VarArr[0].setAlpha(0.0f);
        pc2VarArr[0].setTranslationY(gl.L(20.0f));
        ViewPropertyAnimator translationY = pc2VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 320L);
        pc2 pc2Var3 = pc2VarArr[1];
        pc2Var3.n = false;
        pc2Var3.setVisibility(0);
        pc2VarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gl.L(20.0f)).setInterpolator(s33Var).setDuration(320L).withEndAction(new hq1(pc2Var3, (byte) 23)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 29:
                Typeface typeface = gl.a;
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
                int measuredWidth = getMeasuredWidth() - gl.L(8.0f);
                g61 g61Var = (g61) this.b;
                gn gnVar = g61Var.c;
                int c = measuredWidth - ((int) gnVar.c());
                gn gnVar2 = g61Var.b;
                int c2 = (c + ((int) gnVar2.c())) / 2;
                if (!k96.a0) {
                    gnVar2.setBounds(0, 0, c2, getHeight());
                    gnVar2.draw(canvas);
                    gnVar.setBounds(gl.L(8.0f) + c2, 0, getWidth(), getHeight());
                    gnVar.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 24:
                qa5 qa5Var = (qa5) this.b;
                cq3 cq3Var = qa5Var.q0;
                lx4 lx4Var = qa5Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
                    qa5Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (lx4Var != null && !lx4Var.r && lx4Var.k(measuredWidth2, measuredHeight)) {
                        cq3Var.b(lx4Var.i(measuredWidth2, measuredHeight), -3);
                        lx4Var.j();
                    }
                }
                super.dispatchDraw(canvas);
                gl.O(canvas, this, qa5Var.getThemedColor(bkb.c6), qa5Var.n0, 1.0f);
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
                xv2 xv2Var = (xv2) this.b;
                if (xv2Var.n || xv2Var.K) {
                    xv2Var.c();
                    return true;
                }
                xv2Var.b();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                vi1 vi1Var = (vi1) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    vi1Var.x.X0.D0();
                    for (View view : vi1Var.b.getViewPages()) {
                        if (view instanceof ti1) {
                            ((ti1) view).a.D0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                c42 c42Var = (c42) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= c42Var.x0 && motionEvent.getY() <= c42Var.y0)) {
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
                c42 c42Var = (c42) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - c42Var.z0);
                boolean drawChild = c42Var.y ? false : super.drawChild(canvas, view, j);
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
                ou3 ou3Var = (ou3) this.b;
                stc stcVar = ou3Var.m1;
                ku3 ku3Var = ou3Var.l1;
                super.onDetachedFromWindow();
                try {
                    if ((!ou3Var.H0() || ku3Var.getVisibility() != 0) && ku3Var.getParent() != null) {
                        removeView(ku3Var);
                        ku3Var.stopLoading();
                        ku3Var.loadUrl("about:blank");
                        ku3Var.destroy();
                    }
                    if (!stcVar.f() && !ou3Var.H0()) {
                        if (ou3.R1 == ou3Var) {
                            ou3.R1 = null;
                        }
                        stcVar.b();
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
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
                wd1 wd1Var = (wd1) this.b;
                if (wd1Var == null) {
                    wd1Var = new wd1();
                    this.b = wd1Var;
                    wd1Var.k = false;
                    wd1Var.m = 2.0f;
                }
                wd1Var.f = getMeasuredWidth();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((wd1) this.b).a(gl.L(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 4:
                ((rk0) this.b).e.a(canvas);
                break;
            case 10:
                c42 c42Var = (c42) this.b;
                Paint paint = c42Var.a0;
                paint.setColor(bkb.v0(bkb.g5, c42Var.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - c42Var.z0, paint);
                break;
            case 12:
                super.onDraw(canvas);
                c82 c82Var = (c82) this.b;
                if (c82Var.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - c82Var.y, getWidth(), getHeight(), c82Var.E);
                    break;
                }
                break;
            case 28:
                super.onDraw(canvas);
                q88 q88Var = (q88) this.b;
                Paint paint2 = q88Var.r1;
                hs7 hs7Var = q88Var.k1;
                paint2.setAlpha((int) ((1.0f - q88Var.t1) * hs7Var.getAlpha() * 102.0f));
                RectF rectF2 = gl.P;
                hs7Var.b(rectF2);
                float translationY = hs7Var.getTranslationY() + q88Var.S0.getTranslationY() + hs7Var.getTop() + r3.getTop();
                float f = rectF2.left;
                ss7 ss7Var = q88Var.l1;
                rectF2.set(gl.R1(f, ss7Var.getLeft(), q88Var.t1), gl.R1(rectF2.top + translationY, ss7Var.getTop() - ss7Var.getTranslationY(), q88Var.t1), gl.R1(rectF2.right, ss7Var.getRight(), q88Var.t1), gl.R1(translationY + rectF2.bottom, ss7Var.getBottom() - ss7Var.getTranslationY(), q88Var.t1));
                float L = gl.L(gl.U1(q88Var.t1, 32, 16));
                Paint paint3 = q88Var.s1;
                int alpha = paint3.getAlpha();
                paint3.setAlpha((int) (alpha * q88Var.t1));
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
                c42 c42Var = (c42) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= c42Var.x0 && motionEvent.getY() <= c42Var.y0)) {
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
                if (((hd) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i9 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - gl.L(8.0f)) / 2);
                    int i10 = paddingRight - max;
                    if (!k96.a0) {
                        paddingLeft = i10;
                        i10 = paddingLeft;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = gl.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i10, paddingTop, i10 + max, gl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, gl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i10, L2, i10 + max, gl.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, gl.L(40.0f) + L2);
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
                            if (k96.a0) {
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
                                if (k96.a0) {
                                    if (findViewWithTag5 == null) {
                                        left = i9 - getPaddingRight();
                                        measuredWidth = childAt.getMeasuredWidth();
                                    } else {
                                        left = findViewWithTag5.getLeft() - gl.L(8.0f);
                                        measuredWidth = childAt.getMeasuredWidth();
                                    }
                                    int i12 = left - measuredWidth;
                                    childAt.layout(i12, getPaddingTop(), childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    int paddingLeft2 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + gl.L(8.0f);
                                    childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -3) {
                                if (k96.a0) {
                                    childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            }
                        } else if (k96.a0) {
                            int paddingLeft3 = getPaddingLeft();
                            if (view != null) {
                                paddingLeft3 = de9.w(8.0f, view.getMeasuredWidth(), paddingLeft3);
                            }
                            c = c2;
                            childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                        } else {
                            c = c2;
                            int paddingRight2 = (i9 - getPaddingRight()) - childAt.getMeasuredWidth();
                            if (view != null) {
                                paddingRight2 = ug8.B(8.0f, view.getMeasuredWidth(), paddingRight2);
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
                int min = Math.min(paddingLeft4, paddingTop2) - gl.L(24.0f);
                int min2 = Math.min(gl.L(60.0f), min);
                int L3 = (paddingTop2 - min2) - gl.L(48.0f);
                bc0 bc0Var = (bc0) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bc0Var.d;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L3, TLObject.FLAG_31));
                int b = moe.b((paddingTop2 - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()) - gl.L(48.0f), min2, min);
                tb0 tb0Var = bc0Var.c;
                tb0Var.measure(View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30));
                int D = ug8.D(48.0f, (paddingTop2 - b) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tb0Var.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
                layoutParams.topMargin = gl.L(8.0f) + D;
                layoutParams2.topMargin = gl.L(4.0f) + de9.w(8.0f, D, b);
                layoutParams2.leftMargin = gl.L(4.0f);
                layoutParams2.rightMargin = gl.L(4.0f);
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                int L4 = gl.L(36.0f);
                int i13 = ((i3 - i) - L4) / 2;
                int i14 = ((i4 - i2) - L4) / 2;
                ((rk0) this.b).e.f(i13, i14, i13 + L4, L4 + i14);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                TextView textView = chatAttachAlertPhotoLayout.r0;
                if (getMeasuredWidth() == gl.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i7 = getMeasuredWidth() / 2;
                    int i15 = measuredHeight / 2;
                    measuredHeight2 = gl.L(17.0f) + measuredHeight + i15;
                    i8 = i15 - gl.L(17.0f);
                    L = i7;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - gl.L(13.0f);
                    int i16 = measuredWidth2 / 2;
                    int L5 = measuredWidth2 + i16 + gl.L(17.0f);
                    L = i16 - gl.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - gl.L(13.0f);
                    i7 = L5;
                    i8 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - textView.getMeasuredHeight()) - gl.L(12.0f);
                if (getMeasuredWidth() == gl.L(126.0f)) {
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
                c82 c82Var = (c82) this.b;
                if (c82Var.P && z) {
                    c82Var.i0(c82Var.R.e);
                    break;
                }
                break;
            case 23:
                super.onLayout(z, i, i2, i3, i4);
                o85 o85Var = (o85) this.b;
                yc ycVar = o85Var.b;
                int[] iArr = o85Var.I;
                ycVar.getLocationOnScreen(iArr);
                o85Var.P = iArr[0];
                o85Var.O = iArr[1] - gl.L(25.0f);
                break;
            case 24:
                super.onLayout(z, i, i2, i3, i4);
                qa5 qa5Var = (qa5) this.b;
                qa5Var.h0();
                qa5Var.i0();
                no4 no4Var = qa5Var.f;
                y74 y74Var = qa5Var.b;
                no4Var.setTranslationY(y74Var.f);
                qa5Var.j0();
                qa5Var.e.setTranslationY(gl.L(48.0f) + y74Var.f);
                break;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                xj5 xj5Var = (xj5) this.b;
                TextView textView2 = xj5Var.b;
                if (textView2 != null) {
                    int measuredWidth4 = ((xj5Var.b.getMeasuredWidth() / 2) + textView2.getLeft()) - (xj5Var.c.getMeasuredWidth() / 2);
                    int top = (xj5Var.e.getTop() + ((xj5Var.b.getMeasuredHeight() - xj5Var.c.getMeasuredHeight()) / 2)) - gl.L(16.0f);
                    TextView textView3 = xj5Var.c;
                    textView3.layout(measuredWidth4, top, textView3.getMeasuredWidth() + measuredWidth4, xj5Var.c.getMeasuredHeight() + top);
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
                if (!((hd) this.b).L0) {
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
                    int max = Math.max(0, (measuredWidth - gl.L(8.0f)) / 2);
                    while (r1 < childCount) {
                        View childAt2 = getChildAt(r1);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
                        }
                        r1++;
                    }
                    break;
                }
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                break;
            case 3:
                if (View.MeasureSpec.getSize(i) <= gl.L(260.0f)) {
                    super.onMeasure(i, i2);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(320.0f), TLObject.FLAG_30), i2);
                    break;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L((((ou3) this.b).D1 ? 22 : 0) + 84) + ((int) Math.min(r11.B1 / (r11.A1 / size), gl.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 18:
                t14 t14Var = ((t04) this.b).G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((View) t14Var.getParent()) != null ? (int) (r11.getMeasuredHeight() - t14Var.getY()) : gl.L(120.0f)) - t14Var.c1, TLObject.FLAG_30));
                break;
            case 19:
                t14 t14Var2 = ((o14) this.b).R;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (ug8.D(8.0f, t14Var2.E0.getMeasuredHeight() - t14Var2.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(171.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(156.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i, i2);
                ((nv4) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 24:
                qa5 qa5Var = (qa5) this.b;
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                if (gl.O1() || size3 > size2) {
                    qa5Var.d0 = gl.L(144.0f);
                } else {
                    qa5Var.d0 = gl.L(56.0f);
                }
                aVar = ((d) qa5Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qa5Var.s.getLayoutParams();
                aVar2 = ((d) qa5Var).actionBar;
                marginLayoutParams.topMargin = gl.L(48.0f) + aVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qa5Var.e.getLayoutParams();
                aVar3 = ((d) qa5Var).actionBar;
                marginLayoutParams2.topMargin = aVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) qa5Var.f.getLayoutParams();
                aVar4 = ((d) qa5Var).actionBar;
                marginLayoutParams3.topMargin = aVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) qa5Var.h.getLayoutParams();
                aVar5 = ((d) qa5Var).actionBar;
                marginLayoutParams4.topMargin = aVar5.getMeasuredHeight();
                qa5Var.h.getLayoutParams().height = qa5Var.d0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) qa5Var.d.getLayoutParams();
                aVar6 = ((d) qa5Var).actionBar;
                marginLayoutParams5.height = gl.L(53.0f) + aVar6.getMeasuredHeight() + qa5Var.d0;
                qa5Var.k0();
                super.onMeasure(i, i2);
                break;
            case 27:
                int size4 = View.MeasureSpec.getSize(i);
                ((gq5) this.b).x = (gl.O1() || View.MeasureSpec.getSize(i2) > size4) ? gl.L(144.0f) : gl.L(78.0f);
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
                xv2 xv2Var = (xv2) this.b;
                tk0.c(xv2Var.s, xv2Var.y);
                xv2Var.t.d();
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
                    q88 q88Var = (q88) this.b;
                    if (q88Var.u1) {
                        q88Var.B0(false);
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
                bringChildToFront((ry1) this.b);
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
                fx0 fx0Var = (fx0) this.b;
                FrameLayout frameLayout = fx0Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(fx0Var.c.getHeight() - fx0Var.b.getY())) + fx0Var.t0);
                }
                fx0Var.d0(f);
                break;
            case 6:
            default:
                super.setTranslationY(f);
                break;
            case 7:
                super.setTranslationY(f);
                ((nf1) this.b).Y.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 23:
                super.setVisibility(i);
                ((o85) this.b).d.setVisibility(i);
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
                g61 g61Var = (g61) this.b;
                return drawable == g61Var.c || drawable == g61Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(Context context) {
        super(context);
        this.a = (byte) 9;
        ry1 ry1Var = new ry1(context);
        this.b = ry1Var;
        addView(ry1Var, nme.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 14;
        this.b = new pc2[2];
        int i = 0;
        while (true) {
            pc2[] pc2VarArr = (pc2[]) this.b;
            if (i < pc2VarArr.length) {
                pc2VarArr[i] = new pc2(context, wjbVar);
                addView(((pc2[]) this.b)[i], nme.e(-1, -1, kk7.D1));
                i++;
            } else {
                pc2VarArr[0].setVisibility(0);
                ((pc2[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(Context context, String str, f53 f53Var) {
        super(context);
        this.a = (byte) 25;
        int L = gl.L(12.0f);
        int i = bkb.i5;
        Drawable b0 = bkb.b0(L, bkb.p1(0.06f, bkb.v0(i, f53Var)));
        vkb K = zkb.K(0.06f, i);
        setBackground(b0);
        zkb.j(this, b0, K, null, f53Var);
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        hn hnVar = new hn(context, false, true, true);
        this.b = hnVar;
        hnVar.b(0.6f, 450L, s33.h);
        hnVar.setTextSize(gl.L(17.0f));
        zkb.U(hnVar, i, f53Var);
        hnVar.setScaleProperty(0.7f);
        hnVar.setGravity(17);
        hnVar.setTypeface(gl.o());
        hnVar.setAllowCancel(true);
        j.addView(hnVar, nme.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        zkb.X(textView, i, f53Var);
        textView.setGravity(17);
        j.addView(textView, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(c82 c82Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.b = c82Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(q88 q88Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.b = q88Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
