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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tt0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ PhotoViewer A0;
    public final Paint w0;
    public boolean x0;
    public boolean y0;
    public ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.A0 = photoViewer;
        Paint paint = new Paint();
        this.w0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0
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
                this.z0.add(new Rect(0, org.telegram.messenger.ll.y(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.z0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.ll.y(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.z0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.A0;
        photoViewer.M.o(photoViewer.c0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.A0;
        org.telegram.ui.Cells.z9 o6 = photoViewer.M.o(getContext());
        org.telegram.ui.Cells.aa aaVar = o6.r;
        if (motionEvent.getAction() == 0) {
            o6.h = motionEvent.getX();
            o6.n = motionEvent.getY();
            aaVar.e = aaVar.y();
        } else if (aaVar.e && Math.abs(motionEvent.getX() - o6.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o6.n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.aa aaVar2 = o6.r;
            if (!aaVar2.i && aaVar2.e) {
                aaVar2.f(false);
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
        gt0 gt0Var = photoViewer.b0;
        if (gt0Var == null || !gt0Var.x) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.W5 - 1.0f) * gt0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.a61 a61Var = photoViewer.v1;
        if (a61Var != null && a61Var.j) {
            a61Var.setBounds(photoViewer.b0.getLeft(), (photoViewer.b0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.U5 / photoViewer.W5)), photoViewer.b0.getRight(), photoViewer.b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
            photoViewer.v1.draw(canvas);
        }
        org.telegram.ui.Components.tn0 tn0Var = photoViewer.w1;
        if (tn0Var == null || !tn0Var.a()) {
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

    @Override // org.telegram.ui.Components.xu0
    public final int getBottomPadding() {
        return this.A0.L0.getHeight();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.gc.a(this, new x8(this, 6));
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.gc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.r7 r7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.A0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight == 0 || (r7Var = photoViewer.B) == null) {
            return;
        }
        int alpha = (int) (r7Var.getAlpha() * 255.0f * 0.498f);
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
    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        yr0 yr0Var;
        int top;
        int dp;
        int measuredHeight;
        int dp2;
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.q5 != null && photoViewer.t5 != null) {
            int dp3 = (i11 - i9) - AndroidUtilities.dp(20.0f);
            photoViewer.t5.setTranslationY(((-dp3) / 2.0f) - AndroidUtilities.dp(47.0f));
            float f10 = dp3 / 2.0f;
            photoViewer.q5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.p5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.u5.setTranslationY(f10 + AndroidUtilities.dp(95.0f));
        }
        int childCount = getChildCount();
        R();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.u2) {
                    paddingLeft = i9;
                    paddingRight = i11;
                    paddingBottom = i12;
                } else {
                    paddingLeft = getPaddingLeft() + i9;
                    paddingRight = i11 - getPaddingRight();
                    paddingBottom = i12 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 7;
                int i22 = i20 & 112;
                if (i21 == 1) {
                    i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i21 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 != 16) {
                        i16 = (((paddingBottom - i10) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i22 != 80) {
                        i18 = layoutParams.topMargin;
                        yr0Var = photoViewer.Q1;
                        if (childAt != yr0Var.I) {
                            if (childAt == photoViewer.R1.I) {
                                i18 += photoViewer.B.getMeasuredHeight();
                            } else if (yr0Var.f.l(childAt) || photoViewer.R1.f.l(childAt)) {
                                i18 = ((i12 - i10) - measuredHeight2) + ((photoViewer.s || AndroidUtilities.isInMultiwindow) ? 0 : AndroidUtilities.navigationBarHeight);
                            } else if (childAt == photoViewer.k1) {
                                i18 = AndroidUtilities.dp(5.0f) + photoViewer.B.getMeasuredHeight();
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
                                    int i23 = photoViewer.Y1;
                                    if (i23 != 4 && i23 != 5) {
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
                                            int i24 = photoViewer.Y1;
                                            if (i24 != 4 && i24 != 5) {
                                                f11 = 15.0f;
                                            }
                                            dp = (AndroidUtilities.dp(12.0f) + (top2 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.M7) {
                                            i18 -= photoViewer.L0.getHeight();
                                            if (photoViewer.Y1 == 1) {
                                                dp2 = AndroidUtilities.dp(52.0f);
                                            } else if (photoViewer.Q1.getVisibility() == 0) {
                                                dp2 = AndroidUtilities.dp(56.0f);
                                            }
                                            i18 -= dp2;
                                        } else if (childAt == photoViewer.T1) {
                                            dp = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                                            i18 = photoViewer.B.getMeasuredHeight();
                                        } else if (childAt == photoViewer.N0) {
                                            dp = ((paddingBottom - i10) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.O7) {
                                            i18 = org.telegram.messenger.ll.w(31.0f, photoViewer.L0.getHeight(), i18);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.M7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.L0.getTop() - AndroidUtilities.dp(50.0f) : photoViewer.M7.getTop();
                                        int i25 = photoViewer.Y1;
                                        if (i25 != 4 && i25 != 5) {
                                            f11 = 15.0f;
                                        }
                                        dp = (AndroidUtilities.dp(12.0f) + (top3 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                        measuredHeight = childAt.getMeasuredHeight();
                                    }
                                }
                                i18 = dp - measuredHeight;
                            }
                        }
                        childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
                    } else {
                        i16 = (paddingBottom - i10) - measuredHeight2;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    yr0Var = photoViewer.Q1;
                    if (childAt != yr0Var.I) {
                    }
                    childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
                } else {
                    i13 = (paddingRight - paddingLeft) - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 != 16) {
                }
                i18 = i16 - i17;
                yr0Var = photoViewer.Q1;
                if (childAt != yr0Var.I) {
                }
                childAt.layout(i15 + paddingLeft, i18, i15 + measuredWidth + paddingLeft, measuredHeight2 + i18);
            }
        }
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int bitmapWidth;
        int bitmapHeight;
        tt0 tt0Var = this;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (tt0Var.getLayoutParams().height > 0) {
            size2 = tt0Var.getLayoutParams().height;
        }
        int i14 = size2;
        tt0Var.setMeasuredDimension(size, i14);
        PhotoViewer photoViewer = tt0Var.A0;
        boolean z10 = true;
        if (!photoViewer.n1) {
            tt0Var.x0 = true;
            if (photoViewer.e2) {
                Point point = AndroidUtilities.displaySize;
                int i15 = point.x > point.y ? 5 : 10;
                photoViewer.M1.getCurrentView().setMaxLines(i15);
                photoViewer.M1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.M1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.M1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            tt0Var.x0 = false;
        }
        int dp = photoViewer.e0.getVisibility() != 8 ? AndroidUtilities.dp(48.0f) : 0;
        org.telegram.ui.Components.f30 f30Var = photoViewer.h1;
        if (f30Var == null || f30Var.getVisibility() == 8) {
            i11 = i9;
            i12 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.h1.getLayoutParams()).bottomMargin = dp;
            i11 = i9;
            tt0Var.measureChildWithMargins(photoViewer.h1, i11, 0, i10, 0);
            int measuredHeight = photoViewer.h1.getMeasuredHeight();
            tt0Var.x0 = true;
            if (AndroidUtilities.isTablet() || i14 >= size) {
                if (photoViewer.h1.getVisibility() != 0) {
                    photoViewer.h1.setVisibility(0);
                }
            } else if (photoViewer.h1.getVisibility() != 4) {
                photoViewer.h1.setVisibility(4);
            }
            tt0Var.x0 = false;
            i12 = measuredHeight;
        }
        iu0 iu0Var = photoViewer.e3;
        if (iu0Var != null) {
            iu0Var.e = size;
            iu0Var.f = i14;
        }
        int paddingLeft = size - (tt0Var.getPaddingLeft() + tt0Var.getPaddingRight());
        int paddingBottom = i14 - tt0Var.getPaddingBottom();
        int childCount = tt0Var.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = tt0Var.getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.h1) {
                ps0 ps0Var = photoViewer.u2;
                if (childAt == ps0Var) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                } else if (childAt == photoViewer.u4) {
                    if (ps0Var == null || ps0Var.getVisibility() != 0) {
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
                        if (tt0Var.y0) {
                            i13 = dp + i12;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i13;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i13;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i13 = dp;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.h1.c() || (!AndroidUtilities.isTablet() && paddingBottom <= paddingLeft)) {
                        tt0Var.y0 = false;
                        i13 = dp;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i13 = dp + i12;
                        tt0Var.y0 = z10;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i13;
                        ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i13;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else if (childAt == photoViewer.R1.I) {
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else {
                    tt0Var.measureChildWithMargins(childAt, i11, 0, i10, 0);
                }
            }
            i16++;
            z10 = true;
            tt0Var = this;
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
