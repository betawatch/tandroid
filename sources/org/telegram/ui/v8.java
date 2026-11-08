package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v8 extends org.telegram.ui.Components.rt0 {
    public final /* synthetic */ int f0;
    public Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f0 = i7;
        this.g0 = obj;
    }

    @Override // org.telegram.ui.Components.rt0
    public boolean O() {
        switch (this.f0) {
            case 2:
                return false;
            case 5:
                return false;
            default:
                return super.O();
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public boolean P() {
        switch (this.f0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        switch (this.f0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.hy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.hy) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                break;
            default:
                super.addView(view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        switch (this.f0) {
            case 9:
                m31 m31Var = (m31) this.g0;
                m31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.f2) m31Var).glassEngine;
                qVar.g();
                if (!m31Var.N) {
                    org.telegram.messenger.g0.O(canvas, this, m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), m31Var.c0, 1.0f);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ca0) this.g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public Drawable getNewDrawable() {
        switch (this.f0) {
            case 1:
                Drawable m10 = ((ym) ((org.telegram.ui.Components.ca0) this.g0).c0.F).m();
                if (m10 == null) {
                    break;
                }
                break;
            case 5:
                if (!org.telegram.messenger.iz.H0) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.g0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.g0 = new ColorDrawable(x02);
                    }
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.rt0
    public boolean getNewDrawableMotion() {
        switch (this.f0) {
            case 5:
                return !org.telegram.messenger.iz.H0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f0) {
            case 2:
                return ((org.telegram.ui.Components.ey0) this.g0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        bz bzVar;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 80;
        int i26 = 5;
        int i27 = -1;
        int i28 = 8;
        int i29 = 1;
        switch (this.f0) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                ((i9) this.g0).g0();
                break;
            case 1:
            case 2:
            case 5:
            case 7:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 3:
                super.onLayout(z9, i7, i10, i11, i12);
                ContactsActivity contactsActivity = (ContactsActivity) this.g0;
                contactsActivity.i0();
                org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.n;
                if (f5Var != null) {
                    sr srVar = contactsActivity.b;
                    f5Var.Y((srVar == null || srVar.I) ? false : true, true);
                }
                contactsActivity.j0();
                break;
            case 4:
                int childCount = getChildCount();
                int Q = Q();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i11 - i7) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i30 = i12 - i10;
                int paddingBottom = i30 - getPaddingBottom();
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt = getChildAt(i31);
                    if (childAt.getVisibility() != i28) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i32 = layoutParams.gravity;
                        if (i32 == -1) {
                            i32 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
                        int i33 = i32 & org.telegram.messenger.qs.x1;
                        int i34 = absoluteGravity & 7;
                        if (i34 == i29) {
                            i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i34 != 5) {
                            i16 = layoutParams.leftMargin + paddingLeft;
                            if (i33 == 16) {
                                if (i33 == 48) {
                                    i21 = layoutParams.topMargin;
                                } else if (i33 != i25) {
                                    i21 = layoutParams.topMargin;
                                } else {
                                    i17 = paddingBottom - measuredHeight;
                                    i18 = layoutParams.bottomMargin;
                                }
                                i19 = i21 + paddingTop;
                                if (childAt instanceof org.telegram.ui.Components.hy) {
                                    WeakHashMap weakHashMap = r0.i0.a;
                                    r0.k1 a10 = r0.b0.a(this);
                                    if (a10 != null) {
                                        i13 = 8;
                                        i20 = a10.a.f(8).d;
                                    } else {
                                        i13 = 8;
                                        i20 = 0;
                                    }
                                    i19 = (i20 <= 0 || (bzVar = ((gz) this.g0).K) == null || !bzVar.b.y) ? org.telegram.messenger.g0.Q1() ? i30 - measuredHeight : (i30 + Q) - measuredHeight : (i30 - i20) - org.telegram.messenger.g0.L(200.0f);
                                } else {
                                    i13 = 8;
                                }
                                childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                            } else {
                                i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (childAt instanceof org.telegram.ui.Components.hy) {
                            }
                            childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i33 == 16) {
                        }
                        i19 = i17 - i18;
                        if (childAt instanceof org.telegram.ui.Components.hy) {
                        }
                        childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                    } else {
                        i13 = i28;
                    }
                    i31++;
                    i28 = i13;
                    i25 = 80;
                    i29 = 1;
                }
                R();
                break;
            case 6:
                h90 h90Var = (h90) this.g0;
                int scrollY = h90Var.J.getScrollY();
                super.onLayout(z9, i7, i10, i11, i12);
                if (scrollY != h90Var.J.getScrollY()) {
                    h90Var.J.setTranslationY(r3.getScrollY() - scrollY);
                    h90Var.J.animate().cancel();
                    h90Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                    break;
                }
                break;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.g0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= org.telegram.messenger.g0.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                int i35 = 0;
                while (i35 < childCount2) {
                    View childAt2 = getChildAt(i35);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i36 = layoutParams2.gravity;
                        if (i36 == i27) {
                            i36 = 51;
                        }
                        int i37 = i36 & org.telegram.messenger.qs.x1;
                        int i38 = i36 & 7;
                        int i39 = i38 != 1 ? i38 != i26 ? layoutParams2.leftMargin : (i11 - measuredWidth2) - layoutParams2.rightMargin : ((((i11 - i7) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i37 == 16) {
                            i22 = ((((i12 - emojiPadding) - i10) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i23 = layoutParams2.bottomMargin;
                        } else if (i37 != 80) {
                            i24 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.t0(childAt2)) {
                                i24 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i24 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.N1) {
                                i24 = ((popupNotificationActivity.E.getMeasuredHeight() + popupNotificationActivity.E.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i39 = ((popupNotificationActivity.E.getMeasuredWidth() + popupNotificationActivity.E.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i39, i24, measuredWidth2 + i39, measuredHeight2 + i24);
                        } else {
                            i22 = ((i12 - emojiPadding) - i10) - measuredHeight2;
                            i23 = layoutParams2.bottomMargin;
                        }
                        i24 = i22 - i23;
                        if (!popupNotificationActivity.b.t0(childAt2)) {
                        }
                        childAt2.layout(i39, i24, measuredWidth2 + i39, measuredHeight2 + i24);
                    }
                    i35++;
                    i26 = 5;
                    i27 = -1;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        switch (this.f0) {
            case 0:
                ((i9) this.g0).h0();
                super.onMeasure(i7, i10);
                break;
            case 1:
            case 4:
            case 5:
            case 9:
            default:
                super.onMeasure(i7, i10);
                break;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.ey0) this.g0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.g0;
                y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                measureChildWithMargins(y4Var, i7, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                y4Var2 = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = y4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                break;
            case 6:
                h90 h90Var = (h90) this.g0;
                super.onMeasure(i7, i10);
                Q();
                int i11 = this.f;
                if (i11 != 0 && i11 < org.telegram.messenger.g0.L(20.0f)) {
                    h90Var.F.clearFocus();
                    h90Var.K.clearFocus();
                }
                h90Var.H.setVisibility(this.f > org.telegram.messenger.g0.L(20.0f) ? 8 : 0);
                break;
            case 7:
                ce0 ce0Var = (ce0) this.g0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ce0Var.N.getLayoutParams();
                int L = ce0Var.z1() ? org.telegram.messenger.g0.L(226.0f) : 0;
                if (ce0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    L -= Q();
                }
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
                if (ccVar == null || !ccVar.l) {
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.g0.L(14.0f) + L;
                } else {
                    super.onMeasure(i7, i10);
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, org.telegram.ui.Components.cc.w.e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), L);
                }
                int i12 = org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m;
                ((ViewGroup.MarginLayoutParams) ce0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) ce0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) ce0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                TextView textView = ce0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && ce0Var.c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !ce0Var.a0) {
                    ValueAnimator valueAnimator = ce0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ce0Var.c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                break;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.g0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i13 = size2;
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.N1) {
                            measureChildWithMargins(childAt, i7, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f) + i13), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 10:
                zh.l3 l3Var = (zh.l3) this.g0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l3Var.D.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.f2) l3Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) l3Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.f2) l3Var).actionBar;
                layoutParams2.topMargin = org.telegram.messenger.g0.L(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l3Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.f2) l3Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) l3Var.x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.f2) l3Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.ActionBar.a6
    public void updateColors() {
        switch (this.f0) {
            case 9:
                try {
                    ((m31) this.g0).q0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.f0 = 5;
    }
}
