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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class uu0 extends org.telegram.ui.Components.pv0 {
    public final Paint A0;
    public boolean B0;
    public boolean C0;
    public ArrayList D0;
    public final /* synthetic */ PhotoViewer E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.E0 = photoViewer;
        Paint paint = new Paint();
        this.A0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override // org.telegram.ui.Components.pv0, org.telegram.ui.Components.ov0
    public final void S() {
        super.S();
        PhotoViewer photoViewer = this.E0;
        if (photoViewer.r1) {
            photoViewer.W0[0].e(2, getKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.D0 == null) {
                this.D0 = new ArrayList();
            }
            this.D0.clear();
            PhotoViewer photoViewer = this.E0;
            if (photoViewer.u4 == 1 || photoViewer.o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.D0.add(new Rect(0, org.telegram.messenger.vl.y(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.D0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.vl.y(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.D0);
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.E0;
        photoViewer.Q.o(photoViewer.g0.getContext()).draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.E0;
        org.telegram.ui.Cells.ca o9 = photoViewer.Q.o(getContext());
        org.telegram.ui.Cells.da daVar = o9.r;
        if (motionEvent.getAction() == 0) {
            o9.h = motionEvent.getX();
            o9.n = motionEvent.getY();
            daVar.e = daVar.y();
        } else if (daVar.e && Math.abs(motionEvent.getX() - o9.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o9.n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.da daVar2 = o9.r;
            if (!daVar2.i && daVar2.e) {
                daVar2.f(false);
            }
        }
        if (!photoViewer.Q.y()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.Q.o(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.E0;
        hu0 hu0Var = photoViewer.f0;
        if (hu0Var == null || !hu0Var.x) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.a6 - 1.0f) * hu0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.w61 w61Var = photoViewer.z1;
        if (w61Var != null && w61Var.j) {
            w61Var.setBounds(photoViewer.f0.getLeft(), (photoViewer.f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.a6)), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
            photoViewer.z1.draw(canvas);
        }
        org.telegram.ui.Components.ko0 ko0Var = photoViewer.A1;
        if (ko0Var == null || !ko0Var.a()) {
            return;
        }
        photoViewer.A1.setBounds(photoViewer.f0.getLeft(), (int) ((photoViewer.F.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f0.getRight(), photoViewer.f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
        photoViewer.A1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.E0;
        if (view == photoViewer.Q.o(photoViewer.g0.getContext()) || view == photoViewer.s5 || view == photoViewer.z4 || view == photoViewer.A4 || view == photoViewer.X0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.Q7;
        if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
            canvas.save();
            canvas.clipRect(photoViewer.Q7.getX(), photoViewer.Q7.getY(), photoViewer.Q7.getX() + photoViewer.Q7.getMeasuredWidth(), photoViewer.Q7.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        try {
            if (view == photoViewer.y2 || view == photoViewer.y4) {
                return false;
            }
            return super.drawChild(canvas, view, j3);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.Components.ov0
    public final int getBottomPadding() {
        return this.E0.P0.getHeight();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.qc.a(this, new z8(this, 6));
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.qc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.z7 z7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.T8;
        PhotoViewer photoViewer = this.E0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight == 0 || (z7Var = photoViewer.F) == null) {
            return;
        }
        int alpha = (int) (z7Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.A0;
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
            float alpha2 = (1.0f - photoViewer.F.getAlpha()) * AndroidUtilities.dpf2(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    @Override // org.telegram.ui.Components.pv0, org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        at0 at0Var;
        int top;
        int dp;
        int measuredHeight;
        int dp2;
        PhotoViewer photoViewer = this.E0;
        if (photoViewer.u5 != null && photoViewer.x5 != null) {
            int dp3 = (i12 - i10) - AndroidUtilities.dp(20.0f);
            photoViewer.x5.setTranslationY(((-dp3) / 2.0f) - AndroidUtilities.dp(47.0f));
            float f7 = dp3 / 2.0f;
            photoViewer.u5.setTranslationY(AndroidUtilities.dp(47.0f) + f7);
            photoViewer.t5.setTranslationY(AndroidUtilities.dp(47.0f) + f7);
            photoViewer.y5.setTranslationY(f7 + AndroidUtilities.dp(95.0f));
        }
        int childCount = getChildCount();
        R();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.y2) {
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
                        at0Var = photoViewer.U1;
                        if (childAt != at0Var.M) {
                            if (childAt == photoViewer.V1.M) {
                                i19 += photoViewer.F.getMeasuredHeight();
                            } else if (at0Var.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                                i19 = ((i13 - i11) - measuredHeight2) + ((photoViewer.s || AndroidUtilities.isInMultiwindow) ? 0 : AndroidUtilities.navigationBarHeight);
                            } else if (childAt == photoViewer.o1) {
                                i19 = AndroidUtilities.dp(5.0f) + photoViewer.F.getMeasuredHeight();
                            } else {
                                float f10 = 40.0f;
                                if (childAt == photoViewer.e1 || childAt == photoViewer.f1 || childAt == photoViewer.g1) {
                                    FrameLayout frameLayout = photoViewer.Q7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.P0.getTop();
                                        if (childAt == photoViewer.f1) {
                                            top -= AndroidUtilities.dp(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.Q7.getTop();
                                    }
                                    int i24 = photoViewer.c2;
                                    if (i24 != 4 && i24 != 5) {
                                        f10 = 15.0f;
                                    }
                                    dp = AndroidUtilities.dp(12.0f) + (top - AndroidUtilities.dp(f10));
                                    measuredHeight = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.i1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.h1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.Q7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.P0.getTop() : photoViewer.Q7.getTop();
                                            int i25 = photoViewer.c2;
                                            if (i25 != 4 && i25 != 5) {
                                                f10 = 15.0f;
                                            }
                                            dp = (AndroidUtilities.dp(12.0f) + (top2 - AndroidUtilities.dp(f10))) - AndroidUtilities.dp(36.0f);
                                            measuredHeight = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.Q7) {
                                            i19 -= photoViewer.P0.getHeight();
                                            if (photoViewer.c2 == 1) {
                                                dp2 = AndroidUtilities.dp(52.0f);
                                            } else if (photoViewer.U1.getVisibility() == 0) {
                                                dp2 = AndroidUtilities.dp(56.0f);
                                            }
                                            i19 -= dp2;
                                        } else if (childAt == photoViewer.X1) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                                            i19 = photoViewer.F.getMeasuredHeight();
                                        } else if (childAt == photoViewer.R0) {
                                            dp = ((paddingBottom - i11) - measuredHeight2) - layoutParams.bottomMargin;
                                            measuredHeight = photoViewer.P0.getHeight();
                                        } else if (childAt == photoViewer.S7) {
                                            i19 = org.telegram.messenger.vl.v(31.0f, photoViewer.P0.getHeight(), i19);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.Q7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.P0.getTop() - AndroidUtilities.dp(50.0f) : photoViewer.Q7.getTop();
                                        int i26 = photoViewer.c2;
                                        if (i26 != 4 && i26 != 5) {
                                            f10 = 15.0f;
                                        }
                                        dp = (AndroidUtilities.dp(12.0f) + (top3 - AndroidUtilities.dp(f10))) - AndroidUtilities.dp(36.0f);
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
                    at0Var = photoViewer.U1;
                    if (childAt != at0Var.M) {
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
                at0Var = photoViewer.U1;
                if (childAt != at0Var.M) {
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
        uu0 uu0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (uu0Var.getLayoutParams().height > 0) {
            size2 = uu0Var.getLayoutParams().height;
        }
        int i15 = size2;
        uu0Var.setMeasuredDimension(size, i15);
        PhotoViewer photoViewer = uu0Var.E0;
        boolean z10 = true;
        if (!photoViewer.r1) {
            uu0Var.B0 = true;
            if (photoViewer.i2) {
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x > point.y ? 5 : 10;
                photoViewer.Q1.getCurrentView().setMaxLines(i16);
                photoViewer.Q1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                photoViewer.Q1.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
            uu0Var.B0 = false;
        }
        int dp = photoViewer.i0.getVisibility() != 8 ? AndroidUtilities.dp(48.0f) : 0;
        org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
        if (v30Var == null || v30Var.getVisibility() == 8) {
            i12 = i10;
            i13 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = dp;
            i12 = i10;
            uu0Var.measureChildWithMargins(photoViewer.l1, i12, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            uu0Var.B0 = true;
            if (AndroidUtilities.isTablet() || i15 >= size) {
                if (photoViewer.l1.getVisibility() != 0) {
                    photoViewer.l1.setVisibility(0);
                }
            } else if (photoViewer.l1.getVisibility() != 4) {
                photoViewer.l1.setVisibility(4);
            }
            uu0Var.B0 = false;
            i13 = measuredHeight;
        }
        jv0 jv0Var = photoViewer.i3;
        if (jv0Var != null) {
            jv0Var.e = size;
            jv0Var.f = i15;
        }
        int paddingLeft = size - (uu0Var.getPaddingLeft() + uu0Var.getPaddingRight());
        int paddingBottom = i15 - uu0Var.getPaddingBottom();
        int childCount = uu0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = uu0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                rt0 rt0Var = photoViewer.y2;
                if (childAt == rt0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                } else if (childAt == photoViewer.y4) {
                    if (rt0Var == null || rt0Var.getVisibility() != 0) {
                        bitmapWidth = photoViewer.C4.getBitmapWidth();
                        bitmapHeight = photoViewer.C4.getBitmapHeight();
                    } else {
                        View view = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.y4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bitmapHeight, TLObject.FLAG_30));
                } else if (photoViewer.U1.f.l(childAt) || photoViewer.V1.f.l(childAt)) {
                    if (photoViewer.s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
                    } else if (!AndroidUtilities.isInMultiwindow) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.T1) {
                    if (photoViewer.m2) {
                        if (uu0Var.C0) {
                            i14 = dp + i13;
                            int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, TLObject.FLAG_30));
                        }
                        i14 = dp;
                        int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, TLObject.FLAG_30));
                    } else if (!photoViewer.l1.c() || (!AndroidUtilities.isTablet() && paddingBottom <= paddingLeft)) {
                        uu0Var.C0 = false;
                        i14 = dp;
                        int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, TLObject.FLAG_30));
                    } else {
                        i14 = dp + i13;
                        uu0Var.C0 = z10;
                        int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                        ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, TLObject.FLAG_30));
                    }
                } else if (childAt == photoViewer.Y1 || childAt == photoViewer.Q0) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else if (childAt == photoViewer.V1.M) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                } else {
                    uu0Var.measureChildWithMargins(childAt, i12, 0, i11, 0);
                }
            }
            i17++;
            z10 = true;
            uu0Var = this;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B0) {
            return;
        }
        super.requestLayout();
    }
}
