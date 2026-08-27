package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ut0 extends org.telegram.ui.Components.av0 {
    public final /* synthetic */ PhotoViewer A0;
    public final Paint w0;
    public boolean x0;
    public boolean y0;
    public ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.A0 = photoViewer;
        Paint paint = new Paint();
        this.w0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.av0, org.telegram.ui.Components.zu0
    public final void S() {
        super.S();
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.n1) {
            photoViewer.S0[0].e(2, getKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.z0 == null) {
                this.z0 = new ArrayList();
            }
            this.z0.clear();
            PhotoViewer photoViewer = this.A0;
            if (photoViewer.q4 == 1 || photoViewer.k6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.z0.add(new Rect(0, org.telegram.messenger.rl.x(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.z0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.rl.x(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.z0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.A0;
        photoViewer.M.o(photoViewer.c0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.A0;
        org.telegram.ui.Cells.v9 o10 = photoViewer.M.o(getContext());
        org.telegram.ui.Cells.w9 w9Var = o10.r;
        if (motionEvent.getAction() == 0) {
            o10.h = motionEvent.getX();
            o10.n = motionEvent.getY();
            w9Var.e = w9Var.y();
        } else if (w9Var.e && Math.abs(motionEvent.getX() - o10.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o10.n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = o10.r;
            if (!w9Var2.i && w9Var2.e) {
                w9Var2.f(false);
            }
        }
        if (!photoViewer.M.y()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.M.o(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.A0;
        ht0 ht0Var = photoViewer.b0;
        if (ht0Var == null || !ht0Var.x) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.W5 - 1.0f) * ht0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.c61 c61Var = photoViewer.v1;
        if (c61Var != null && c61Var.j) {
            c61Var.setBounds(photoViewer.b0.getLeft(), (photoViewer.b0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.U5 / photoViewer.W5)), photoViewer.b0.getRight(), photoViewer.b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
            photoViewer.v1.draw(canvas);
        }
        org.telegram.ui.Components.un0 un0Var = photoViewer.w1;
        if (un0Var == null || !un0Var.a()) {
            return;
        }
        photoViewer.w1.setBounds(photoViewer.b0.getLeft(), (int) ((photoViewer.B.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.b0.getRight(), photoViewer.b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
        photoViewer.w1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.A0;
        if (view == photoViewer.M.o(photoViewer.c0.getContext()) || view == photoViewer.o5 || view == photoViewer.v4 || view == photoViewer.w4 || view == photoViewer.T0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.M7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.L0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.M7.getX(), photoViewer.M7.getY(), photoViewer.M7.getX() + photoViewer.M7.getMeasuredWidth(), photoViewer.M7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.u2 || view == photoViewer.u4) {
                return false;
            }
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getBottomPadding() {
        return this.A0.L0.getHeight();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.ec.a(this, new y8(this, 6));
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.ec.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ag.d2 d2Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.A0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight == 0 || (d2Var = photoViewer.B) == null) {
            return;
        }
        int alpha = (int) (d2Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.w0;
        paint.setAlpha(alpha);
        if (getPaddingRight() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (getPaddingLeft() > 0) {
            canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
        }
        if (getPaddingBottom() > 0) {
            float alpha2 = (1.0f - photoViewer.B.getAlpha()) * AndroidUtilities.dpf2(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.av0, org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zr0 zr0Var;
        int top;
        int dp;
        int measuredHeight;
        int dp2;
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.q5 != null && photoViewer.t5 != null) {
            int dp3 = (i12 - i10) - AndroidUtilities.dp(20.0f);
            photoViewer.t5.setTranslationY(((-dp3) / 2.0f) - AndroidUtilities.dp(47.0f));
            float f10 = dp3 / 2.0f;
            photoViewer.q5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.p5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.u5.setTranslationY(f10 + AndroidUtilities.dp(95.0f));
        }
        int childCount = getChildCount();
        R();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.u2) {
                    paddingLeft = i10;
                    paddingRight = i12;
                    paddingBottom = i13;
                } else {
                    paddingLeft = getPaddingLeft() + i10;
                    paddingRight = i12 - getPaddingRight();
                    paddingBottom = i13 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 7;
                int i23 = i21 & 112;
                if (i22 == 1) {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 != 16) {
                        i17 = (((paddingBottom - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i23 != 80) {
                        i19 = layoutParams.topMargin;
                        zr0Var = photoViewer.Q1;
                        if (childAt != zr0Var.I) {
                            if (childAt == photoViewer.R1.I) {
                                i19 += photoViewer.B.getMeasuredHeight();
                            } else if (zr0Var.f.l(childAt) || photoViewer.R1.f.l(childAt)) {
                                i19 = ((i13 - i11) - measuredHeight2) + ((photoViewer.s || AndroidUtilities.isInMultiwindow) ? 0 : AndroidUtilities.navigationBarHeight);
                            } else if (childAt == photoViewer.k1) {
                                i19 = AndroidUtilities.dp(5.0f) + photoViewer.B.getMeasuredHeight();
                            } else {
                                float f11 = 40.0f;
                                if (childAt == photoViewer.a1 || childAt == photoViewer.b1 || childAt == photoViewer.c1) {
                                    FrameLayout frameLayout = photoViewer.M7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.L0.getTop();
                                        if (childAt == photoViewer.b1) {
                                            top -= AndroidUtilities.dp(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.M7.getTop();
                                    }
                                    int i24 = photoViewer.Y1;
                                    if (i24 != 4 && i24 != 5) {
                                        f11 = 15.0f;
                                    }
                                    dp = AndroidUtilities.dp(12.0f) + (top - AndroidUtilities.dp(f11));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.e1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.d1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.M7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.L0.getTop() : photoViewer.M7.getTop();
                                            int i25 = photoViewer.Y1;
                                            if (i25 != 4 && i25 != 5) {
                                                f11 = 15.0f;
                                            }
                                            dp = (AndroidUtilities.dp(12.0f) + (top2 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.M7) {
                                            i19 -= photoViewer.L0.getHeight();
                                            if (photoViewer.Y1 == 1) {
                                                dp2 = AndroidUtilities.dp(52.0f);
                                            } else if (photoViewer.Q1.getVisibility() == 0) {
                                                dp2 = AndroidUtilities.dp(56.0f);
                                            }
                                            i19 -= dp2;
                                        } else if (childAt == photoViewer.T1) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                                            i19 = photoViewer.B.getMeasuredHeight();
                                        } else if (childAt == photoViewer.N0) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.O7) {
                                            i19 = org.telegram.messenger.rl.u(31.0f, photoViewer.L0.getHeight(), i19);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.M7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.L0.getTop() - AndroidUtilities.dp(50.0f) : photoViewer.M7.getTop();
                                        int i26 = photoViewer.Y1;
                                        if (i26 != 4 && i26 != 5) {
                                            f11 = 15.0f;
                                        }
                                        dp = (AndroidUtilities.dp(12.0f) + (top3 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i19 = dp - measuredHeight;
                            }
                        }
                        childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
                    } else {
                        i17 = (paddingBottom - i11) - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    zr0Var = photoViewer.Q1;
                    if (childAt != zr0Var.I) {
                    }
                    childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
                } else {
                    i14 = (paddingRight - paddingLeft) - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 != 16) {
                }
                i19 = i17 - i18;
                zr0Var = photoViewer.Q1;
                if (childAt != zr0Var.I) {
                }
                childAt.layout(i16 + paddingLeft, i19, i16 + measuredWidth + paddingLeft, measuredHeight2 + i19);
            }
        }
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int bitmapWidth;
        int bitmapHeight;
        ut0 ut0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (ut0Var.getLayoutParams().height > 0) {
            size2 = ut0Var.getLayoutParams().height;
        }
        int i15 = size2;
        ut0Var.setMeasuredDimension(size, i15);
        PhotoViewer photoViewer = ut0Var.A0;
        boolean z10 = true;
        if (!photoViewer.n1) {
            ut0Var.x0 = true;
            if (photoViewer.e2) {
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x > point.y ? 5 : 10;
                photoViewer.M1.getCurrentView().setMaxLines(i16);
                photoViewer.M1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.M1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.M1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            ut0Var.x0 = false;
        }
        int dp = photoViewer.e0.getVisibility() != 8 ? AndroidUtilities.dp(48.0f) : 0;
        org.telegram.ui.Components.k30 k30Var = photoViewer.h1;
        if (k30Var == null || k30Var.getVisibility() == 8) {
            i12 = i10;
            i13 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.h1.getLayoutParams()).bottomMargin = dp;
            i12 = i10;
            ut0Var.measureChildWithMargins(photoViewer.h1, i12, 0, i11, 0);
            int measuredHeight = photoViewer.h1.getMeasuredHeight();
            ut0Var.x0 = true;
            if (AndroidUtilities.isTablet() || i15 >= size) {
                if (photoViewer.h1.getVisibility() != 0) {
                    photoViewer.h1.setVisibility(0);
                }
            } else if (photoViewer.h1.getVisibility() != 4) {
                photoViewer.h1.setVisibility(4);
            }
            ut0Var.x0 = false;
            i13 = measuredHeight;
        }
        ju0 ju0Var = photoViewer.e3;
        if (ju0Var != null) {
            ju0Var.e = size;
            ju0Var.f = i15;
        }
        int paddingLeft = size - (ut0Var.getPaddingLeft() + ut0Var.getPaddingRight());
        int paddingBottom = i15 - ut0Var.getPaddingBottom();
        int childCount = ut0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = ut0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.h1) {
                qs0 qs0Var = photoViewer.u2;
                if (childAt == qs0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                } else if (childAt == photoViewer.u4) {
                    if (qs0Var == null || qs0Var.getVisibility() != 0) {
                        bitmapWidth = photoViewer.y4.getBitmapWidth();
                        bitmapHeight = photoViewer.y4.getBitmapHeight();
                    } else {
                        View view = photoViewer.z2 ? photoViewer.y2 : photoViewer.x2;
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.u4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bitmapHeight, TLObject.FLAG_30));
                } else if (photoViewer.Q1.f.l(childAt) || photoViewer.R1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!AndroidUtilities.isInMultiwindow) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.P1) {
                    if (photoViewer.i2) {
                        if (ut0Var.y0) {
                            i14 = dp + i13;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i14 = dp;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.h1.c() || (!AndroidUtilities.isTablet() && paddingBottom <= paddingLeft)) {
                        ut0Var.y0 = false;
                        i14 = dp;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i14 = dp + i13;
                        ut0Var.y0 = z10;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else if (childAt == photoViewer.R1.I) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else {
                    ut0Var.measureChildWithMargins(childAt, i12, 0, i11, 0);
                }
            }
            i17++;
            z10 = true;
            ut0Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0) {
            return;
        }
        super.requestLayout();
    }
}
