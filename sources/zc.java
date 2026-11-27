// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ShutterButton;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zc extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(af4 af4Var, Context context) {
        super(context);
        this.a = (byte) 21;
        this.b = af4Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(22.0f);
        int i = aob.Fi;
        byte b = 0;
        ShapeDrawable b0 = aob.b0(L, aob.w0(null, i, false));
        uob M = yob.M(i);
        imageView.setBackground(b0);
        yob.j(imageView, b0, M, null, null);
        addView(imageView, tre.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        tpa tpaVar = new tpa(context);
        tpaVar.setTypeface(hl.o());
        tpaVar.setTextSize(1, 20.0f);
        int i2 = aob.j5;
        yob.X(tpaVar, i2, null);
        tpaVar.setGravity(1);
        tpaVar.setText(af4Var.a1(tpaVar));
        ac7 ac7Var = af4Var.T1;
        if (ac7Var != null && ac7Var.n) {
            b = 26;
        }
        tpaVar.s = b;
        addView(tpaVar, tre.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(af4Var.U1.isEmpty() ? ob6.M0(2131750604, null) : ob6.M0(2131750605, null));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        yob.X(textView, i2, null);
        addView(textView, tre.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        yob.s(imageView2, aob.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new mh3(this, (byte) 12));
        addView(imageView2, tre.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    public final fd2 a() {
        return ((fd2[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        switch (this.a) {
            case 13:
                super.addView(view, i, i2);
                ((z92) this.b).e();
                break;
            default:
                super.addView(view, i, i2);
                break;
        }
    }

    public final void b(ll0 ll0Var, ol0 ol0Var) {
        jz1 jz1Var = (jz1) this.b;
        jz1Var.c(ll0Var, ol0Var);
        jz1Var.setIgnoreFastWay(true);
        jz1Var.setFadeHeightTop(hl.L(48.0f));
        jz1Var.setFadeHeightBottom(hl.L(48.0f));
    }

    public final void c() {
        fd2[] fd2VarArr = (fd2[]) this.b;
        fd2 fd2Var = fd2VarArr[0];
        fd2 fd2Var2 = fd2VarArr[1];
        fd2VarArr[0] = fd2Var2;
        fd2VarArr[1] = fd2Var;
        fd2Var2.n = true;
        fd2Var2.setVisibility(0);
        fd2VarArr[0].setScaleX(0.8f);
        fd2VarArr[0].setScaleY(0.8f);
        fd2VarArr[0].setAlpha(0.0f);
        fd2VarArr[0].setTranslationY(hl.L(20.0f));
        ViewPropertyAnimator translationY = fd2VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 320L);
        fd2 fd2Var3 = fd2VarArr[1];
        fd2Var3.n = false;
        fd2Var3.setVisibility(0);
        fd2VarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-hl.L(20.0f)).setInterpolator(k43Var).setDuration(320L).withEndAction(new go1(fd2Var3, (byte) 29)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                int measuredWidth = getMeasuredWidth() - hl.L(8.0f);
                o61 o61Var = (o61) this.b;
                hn hnVar = o61Var.c;
                int c = measuredWidth - ((int) hnVar.c());
                hn hnVar2 = o61Var.b;
                int c2 = (c + ((int) hnVar2.c())) / 2;
                if (!ob6.a0) {
                    hnVar2.setBounds(0, 0, c2, getHeight());
                    hnVar2.draw(canvas);
                    hnVar.setBounds(hl.L(8.0f) + c2, 0, getWidth(), getHeight());
                    hnVar.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 25:
                rc5 rc5Var = (rc5) this.b;
                tq3 tq3Var = rc5Var.q0;
                rz4 rz4Var = rc5Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
                    rc5Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (rz4Var != null && !rz4Var.r && rz4Var.k(measuredWidth2, measuredHeight)) {
                        tq3Var.b(rz4Var.i(measuredWidth2, measuredHeight), -3);
                        rz4Var.j();
                    }
                }
                super.dispatchDraw(canvas);
                hl.O(canvas, this, rc5Var.getThemedColor(aob.d6), rc5Var.n0, 1.0f);
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
                rw2 rw2Var = (rw2) this.b;
                if (rw2Var.n || rw2Var.K) {
                    rw2Var.c();
                    return true;
                }
                rw2Var.b();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                ej1 ej1Var = (ej1) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    ej1Var.x.X0.E0();
                    for (View view : ej1Var.b.getViewPages()) {
                        if (view instanceof cj1) {
                            ((cj1) view).a.E0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                s42 s42Var = (s42) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= s42Var.x0 && motionEvent.getY() <= s42Var.y0)) {
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
                s42 s42Var = (s42) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - s42Var.z0);
                boolean drawChild = s42Var.y ? false : super.drawChild(canvas, view, j);
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
                iv3 iv3Var = (iv3) this.b;
                hyc hycVar = iv3Var.m1;
                ev3 ev3Var = iv3Var.l1;
                super.onDetachedFromWindow();
                try {
                    if ((!iv3Var.I0() || ev3Var.getVisibility() != 0) && ev3Var.getParent() != null) {
                        removeView(ev3Var);
                        ev3Var.stopLoading();
                        ev3Var.loadUrl("about:blank");
                        ev3Var.destroy();
                    }
                    if (!hycVar.f() && !iv3Var.I0()) {
                        if (iv3.R1 == iv3Var) {
                            iv3.R1 = null;
                        }
                        hycVar.b();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
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
                fe1 fe1Var = (fe1) this.b;
                if (fe1Var == null) {
                    fe1Var = new fe1();
                    this.b = fe1Var;
                    fe1Var.k = false;
                    fe1Var.m = 2.0f;
                }
                fe1Var.f = getMeasuredWidth();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((fe1) this.b).a(hl.L(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 4:
                ((sk0) this.b).e.a(canvas);
                break;
            case 10:
                s42 s42Var = (s42) this.b;
                Paint paint = s42Var.a0;
                paint.setColor(aob.v0(aob.h5, s42Var.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - s42Var.z0, paint);
                break;
            case 12:
                super.onDraw(canvas);
                t82 t82Var = (t82) this.b;
                if (t82Var.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - t82Var.y, getWidth(), getHeight(), t82Var.E);
                    break;
                }
                break;
            case 29:
                super.onDraw(canvas);
                hc8 hc8Var = (hc8) this.b;
                Paint paint2 = hc8Var.l1;
                nv7 nv7Var = hc8Var.e1;
                paint2.setAlpha((int) ((1.0f - hc8Var.n1) * nv7Var.getAlpha() * 102.0f));
                RectF rectF2 = hl.P;
                nv7Var.b(rectF2);
                float translationY = nv7Var.getTranslationY() + hc8Var.M0.getTranslationY() + nv7Var.getTop() + r3.getTop();
                float f = rectF2.left;
                zv7 zv7Var = hc8Var.f1;
                rectF2.set(hl.R1(f, zv7Var.getLeft(), hc8Var.n1), hl.R1(rectF2.top + translationY, zv7Var.getTop() - zv7Var.getTranslationY(), hc8Var.n1), hl.R1(rectF2.right, zv7Var.getRight(), hc8Var.n1), hl.R1(translationY + rectF2.bottom, zv7Var.getBottom() - zv7Var.getTranslationY(), hc8Var.n1));
                float L = hl.L(hl.U1(hc8Var.n1, 32, 16));
                Paint paint3 = hc8Var.m1;
                int alpha = paint3.getAlpha();
                paint3.setAlpha((int) (alpha * hc8Var.n1));
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
                s42 s42Var = (s42) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= s42Var.x0 && motionEvent.getY() <= s42Var.y0)) {
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
                if (((id) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i9 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - hl.L(8.0f)) / 2);
                    int i10 = paddingRight - max;
                    if (!ob6.a0) {
                        paddingLeft = i10;
                        i10 = paddingLeft;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = hl.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i10, paddingTop, i10 + max, hl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, hl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i10, L2, i10 + max, hl.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, hl.L(40.0f) + L2);
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
                            if (ob6.a0) {
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
                                if (ob6.a0) {
                                    if (findViewWithTag5 == null) {
                                        left = i9 - getPaddingRight();
                                        measuredWidth = childAt.getMeasuredWidth();
                                    } else {
                                        left = findViewWithTag5.getLeft() - hl.L(8.0f);
                                        measuredWidth = childAt.getMeasuredWidth();
                                    }
                                    int i12 = left - measuredWidth;
                                    childAt.layout(i12, getPaddingTop(), childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    int paddingLeft2 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + hl.L(8.0f);
                                    childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -3) {
                                if (ob6.a0) {
                                    childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            }
                        } else if (ob6.a0) {
                            int paddingLeft3 = getPaddingLeft();
                            if (view != null) {
                                paddingLeft3 = uh9.w(8.0f, view.getMeasuredWidth(), paddingLeft3);
                            }
                            c = c2;
                            childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                        } else {
                            c = c2;
                            int paddingRight2 = (i9 - getPaddingRight()) - childAt.getMeasuredWidth();
                            if (view != null) {
                                paddingRight2 = ik8.B(8.0f, view.getMeasuredWidth(), paddingRight2);
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
                int min = Math.min(paddingLeft4, paddingTop2) - hl.L(24.0f);
                int min2 = Math.min(hl.L(60.0f), min);
                int L3 = (paddingTop2 - min2) - hl.L(48.0f);
                dc0 dc0Var = (dc0) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = dc0Var.d;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L3, TLObject.FLAG_31));
                int b = ete.b((paddingTop2 - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()) - hl.L(48.0f), min2, min);
                vb0 vb0Var = dc0Var.c;
                vb0Var.measure(View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b, TLObject.FLAG_30));
                int D = ik8.D(48.0f, (paddingTop2 - b) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vb0Var.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
                layoutParams.topMargin = hl.L(8.0f) + D;
                layoutParams2.topMargin = hl.L(4.0f) + uh9.w(8.0f, D, b);
                layoutParams2.leftMargin = hl.L(4.0f);
                layoutParams2.rightMargin = hl.L(4.0f);
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                int L4 = hl.L(36.0f);
                int i13 = ((i3 - i) - L4) / 2;
                int i14 = ((i4 - i2) - L4) / 2;
                ((sk0) this.b).e.f(i13, i14, i13 + L4, L4 + i14);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                TextView textView = chatAttachAlertPhotoLayout.r0;
                if (getMeasuredWidth() == hl.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i7 = getMeasuredWidth() / 2;
                    int i15 = measuredHeight / 2;
                    measuredHeight2 = hl.L(17.0f) + measuredHeight + i15;
                    i8 = i15 - hl.L(17.0f);
                    L = i7;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - hl.L(13.0f);
                    int i16 = measuredWidth2 / 2;
                    int L5 = measuredWidth2 + i16 + hl.L(17.0f);
                    L = i16 - hl.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - hl.L(13.0f);
                    i7 = L5;
                    i8 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - textView.getMeasuredHeight()) - hl.L(12.0f);
                if (getMeasuredWidth() == hl.L(126.0f)) {
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
                t82 t82Var = (t82) this.b;
                if (t82Var.P && z) {
                    t82Var.i0(t82Var.R.e);
                    break;
                }
                break;
            case 20:
                v94 v94Var = (v94) this.b;
                for (int i18 = 0; i18 < getChildCount(); i18++) {
                    View childAt2 = getChildAt(i18);
                    if (childAt2.getVisibility() != 8) {
                        int intValue = ((Integer) childAt2.getTag()).intValue();
                        int g = v94.g() + v94Var.d0[intValue];
                        boolean z2 = childAt2 instanceof de0;
                        int[] iArr = v94Var.e0;
                        if (z2) {
                            childAt2.layout(g, 0, iArr[intValue] + g, v94Var.c0);
                        } else {
                            int L6 = (g + iArr[intValue]) - hl.L(6.0f);
                            childAt2.layout(L6 - childAt2.getMeasuredWidth(), v94Var.c0 - hl.L(22.0f), L6, v94Var.c0 - hl.L(6.0f));
                        }
                    }
                }
                break;
            case 24:
                super.onLayout(z, i, i2, i3, i4);
                ra5 ra5Var = (ra5) this.b;
                zc zcVar = ra5Var.b;
                int[] iArr2 = ra5Var.I;
                zcVar.getLocationOnScreen(iArr2);
                ra5Var.P = iArr2[0];
                ra5Var.O = iArr2[1] - hl.L(25.0f);
                break;
            case 25:
                super.onLayout(z, i, i2, i3, i4);
                rc5 rc5Var = (rc5) this.b;
                rc5Var.h0();
                rc5Var.i0();
                rq4 rq4Var = rc5Var.f;
                t84 t84Var = rc5Var.b;
                rq4Var.setTranslationY(t84Var.f);
                rc5Var.j0();
                rc5Var.e.setTranslationY(hl.L(48.0f) + t84Var.f);
                break;
            case 27:
                super.onLayout(z, i, i2, i3, i4);
                am5 am5Var = (am5) this.b;
                TextView textView2 = am5Var.b;
                if (textView2 != null) {
                    int measuredWidth4 = ((am5Var.b.getMeasuredWidth() / 2) + textView2.getLeft()) - (am5Var.c.getMeasuredWidth() / 2);
                    int top = (am5Var.e.getTop() + ((am5Var.b.getMeasuredHeight() - am5Var.c.getMeasuredHeight()) / 2)) - hl.L(16.0f);
                    TextView textView3 = am5Var.c;
                    textView3.layout(measuredWidth4, top, textView3.getMeasuredWidth() + measuredWidth4, am5Var.c.getMeasuredHeight() + top);
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
                if (!((id) this.b).L0) {
                    int i3 = 0;
                    while (r4 < childCount) {
                        View childAt = getChildAt(r4);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i3 = childAt.getMeasuredWidth() + i3;
                        }
                        r4++;
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
                    int max = Math.max(0, (measuredWidth - hl.L(8.0f)) / 2);
                    while (r4 < childCount) {
                        View childAt2 = getChildAt(r4);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), TLObject.FLAG_30));
                        }
                        r4++;
                    }
                    break;
                }
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                break;
            case 3:
                if (View.MeasureSpec.getSize(i) <= hl.L(260.0f)) {
                    super.onMeasure(i, i2);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(320.0f), TLObject.FLAG_30), i2);
                    break;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L((((iv3) this.b).D1 ? 22 : 0) + 84) + ((int) Math.min(r11.B1 / (r11.A1 / size), hl.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 18:
                o24 o24Var = ((o14) this.b).G;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((View) o24Var.getParent()) != null ? (int) (r11.getMeasuredHeight() - o24Var.getY()) : hl.L(120.0f)) - o24Var.c1, TLObject.FLAG_30));
                break;
            case 19:
                o24 o24Var2 = ((j24) this.b).R;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (ik8.D(8.0f, o24Var2.E0.getMeasuredHeight() - o24Var2.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 20:
                v94 v94Var = (v94) this.b;
                int g = v94.g() + hl.L(ob6.a0 ? 60.0f : 14.0f);
                int i4 = 0;
                while (true) {
                    int[] iArr = v94Var.e0;
                    if (i4 >= iArr.length) {
                        while (r4 < getChildCount()) {
                            View childAt3 = getChildAt(r4);
                            if (childAt3.getVisibility() != 8) {
                                int intValue = ((Integer) childAt3.getTag()).intValue();
                                boolean z = childAt3 instanceof de0;
                                int[] iArr2 = v94Var.e0;
                                if (z) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iArr2[intValue], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v94Var.c0, TLObject.FLAG_30));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iArr2[intValue], TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30));
                                }
                            }
                            r4++;
                        }
                        setMeasuredDimension(g, v94Var.c0);
                        break;
                    } else {
                        g += iArr[i4] + (i4 > 0 ? hl.L(4.0f) : 0);
                        i4++;
                    }
                }
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(171.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(156.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(i, i2);
                ((sx4) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 25:
                rc5 rc5Var = (rc5) this.b;
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                if (hl.O1() || size3 > size2) {
                    rc5Var.d0 = hl.L(144.0f);
                } else {
                    rc5Var.d0 = hl.L(56.0f);
                }
                aVar = ((e) rc5Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rc5Var.s.getLayoutParams();
                aVar2 = ((e) rc5Var).actionBar;
                marginLayoutParams.topMargin = hl.L(48.0f) + aVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rc5Var.e.getLayoutParams();
                aVar3 = ((e) rc5Var).actionBar;
                marginLayoutParams2.topMargin = aVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) rc5Var.f.getLayoutParams();
                aVar4 = ((e) rc5Var).actionBar;
                marginLayoutParams3.topMargin = aVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) rc5Var.h.getLayoutParams();
                aVar5 = ((e) rc5Var).actionBar;
                marginLayoutParams4.topMargin = aVar5.getMeasuredHeight();
                rc5Var.h.getLayoutParams().height = rc5Var.d0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) rc5Var.d.getLayoutParams();
                aVar6 = ((e) rc5Var).actionBar;
                marginLayoutParams5.height = hl.L(53.0f) + aVar6.getMeasuredHeight() + rc5Var.d0;
                rc5Var.k0();
                super.onMeasure(i, i2);
                break;
            case 28:
                int size4 = View.MeasureSpec.getSize(i);
                ((hs5) this.b).x = (hl.O1() || View.MeasureSpec.getSize(i2) > size4) ? hl.L(144.0f) : hl.L(78.0f);
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
                rw2 rw2Var = (rw2) this.b;
                uk0.c(rw2Var.s, rw2Var.y);
                rw2Var.t.d();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 29:
                if (motionEvent.getActionMasked() == 0) {
                    hc8 hc8Var = (hc8) this.b;
                    if (hc8Var.o1) {
                        hc8Var.B0(false);
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
                bringChildToFront((jz1) this.b);
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
                nx0 nx0Var = (nx0) this.b;
                FrameLayout frameLayout = nx0Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(nx0Var.c.getHeight() - nx0Var.b.getY())) + nx0Var.t0);
                }
                nx0Var.d0(f);
                break;
            case 6:
            default:
                super.setTranslationY(f);
                break;
            case 7:
                super.setTranslationY(f);
                ((wf1) this.b).Y.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 24:
                super.setVisibility(i);
                ((ra5) this.b).d.setVisibility(i);
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
                o61 o61Var = (o61) this.b;
                return drawable == o61Var.c || drawable == o61Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(Context context) {
        super(context);
        this.a = (byte) 9;
        jz1 jz1Var = new jz1(context);
        this.b = jz1Var;
        addView(jz1Var, tre.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 14;
        this.b = new fd2[2];
        int i = 0;
        while (true) {
            fd2[] fd2VarArr = (fd2[]) this.b;
            if (i < fd2VarArr.length) {
                fd2VarArr[i] = new fd2(context, vnbVar);
                addView(((fd2[]) this.b)[i], tre.e(-1, -1, jn7.D1));
                i++;
            } else {
                fd2VarArr[0].setVisibility(0);
                ((fd2[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(Context context, String str, x53 x53Var) {
        super(context);
        this.a = (byte) 26;
        int L = hl.L(12.0f);
        int i = aob.j5;
        Drawable b0 = aob.b0(L, aob.p1(0.06f, aob.v0(i, x53Var)));
        uob K = yob.K(0.06f, i);
        setBackground(b0);
        yob.j(this, b0, K, null, x53Var);
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        in inVar = new in(context, false, true, true);
        this.b = inVar;
        inVar.b(0.6f, 450L, k43.h);
        inVar.setTextSize(hl.L(17.0f));
        yob.U(inVar, i, x53Var);
        inVar.setScaleProperty(0.7f);
        inVar.setGravity(17);
        inVar.setTypeface(hl.o());
        inVar.setAllowCancel(true);
        j.addView(inVar, tre.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        yob.X(textView, i, x53Var);
        textView.setGravity(17);
        j.addView(textView, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(t82 t82Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.b = t82Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(hc8 hc8Var, Context context) {
        super(context);
        this.a = (byte) 29;
        this.b = hc8Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
