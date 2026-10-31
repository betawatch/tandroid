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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w8 extends org.telegram.ui.Components.uu0 {
    public final /* synthetic */ int f0;
    public Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context, z4Var);
        this.f0 = 5;
    }

    @Override // org.telegram.ui.Components.uu0
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

    @Override // org.telegram.ui.Components.uu0
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
                if (view instanceof org.telegram.ui.Components.vy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.vy) view).getLayoutParams();
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

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ei.r rVar;
        switch (this.f0) {
            case 9:
                e51 e51Var = (e51) this.g0;
                e51Var.o0();
                super.dispatchDraw(canvas);
                rVar = ((org.telegram.ui.ActionBar.k2) e51Var).glassEngine;
                rVar.g();
                if (!e51Var.N) {
                    org.telegram.messenger.i0.O(canvas, this, e51Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6), e51Var.c0, 1.0f);
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
                if (motionEvent.getY() < ((org.telegram.ui.Components.ua0) this.g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.uu0
    public Drawable getNewDrawable() {
        switch (this.f0) {
            case 1:
                Drawable m10 = ((sn) ((org.telegram.ui.Components.ua0) this.g0).c0.F).m();
                if (m10 == null) {
                    break;
                }
                break;
            case 5:
                if (!org.telegram.messenger.tz.H0) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ua, false);
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

    @Override // org.telegram.ui.Components.uu0
    public boolean getNewDrawableMotion() {
        switch (this.f0) {
            case 5:
                return !org.telegram.messenger.tz.H0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // org.telegram.ui.Components.uu0
    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        switch (this.f0) {
            case 2:
                return ((org.telegram.ui.Components.iz0) this.g0).c;
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
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        d00 d00Var;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = 80;
        int i27 = 5;
        int i28 = -1;
        int i29 = 8;
        int i30 = 1;
        switch (this.f0) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                ((j9) this.g0).f0();
                break;
            case 1:
            case 2:
            case 5:
            case 7:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.g0;
                contactsActivity.h0();
                org.telegram.ui.ActionBar.p5 p5Var = contactsActivity.n;
                if (p5Var != null) {
                    ss ssVar = contactsActivity.b;
                    p5Var.Y((ssVar == null || ssVar.I) ? false : true, true);
                }
                contactsActivity.i0();
                break;
            case 4:
                int childCount = getChildCount();
                int Q = Q();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i12 - i10) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i31 = i13 - i11;
                int paddingBottom = i31 - getPaddingBottom();
                int i32 = 0;
                while (i32 < childCount) {
                    View childAt = getChildAt(i32);
                    if (childAt.getVisibility() != i29) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i33 = layoutParams.gravity;
                        if (i33 == -1) {
                            i33 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i33, getLayoutDirection());
                        int i34 = i33 & org.telegram.messenger.zs.x1;
                        int i35 = absoluteGravity & 7;
                        if (i35 == i30) {
                            i15 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i16 = layoutParams.rightMargin;
                        } else if (i35 != 5) {
                            i17 = layoutParams.leftMargin + paddingLeft;
                            if (i34 == 16) {
                                if (i34 == 48) {
                                    i22 = layoutParams.topMargin;
                                } else if (i34 != i26) {
                                    i22 = layoutParams.topMargin;
                                } else {
                                    i18 = paddingBottom - measuredHeight;
                                    i19 = layoutParams.bottomMargin;
                                }
                                i20 = i22 + paddingTop;
                                if (childAt instanceof org.telegram.ui.Components.vy) {
                                    WeakHashMap weakHashMap = r0.h0.a;
                                    r0.j1 a2 = r0.a0.a(this);
                                    if (a2 != null) {
                                        i14 = 8;
                                        i21 = a2.a.f(8).d;
                                    } else {
                                        i14 = 8;
                                        i21 = 0;
                                    }
                                    i20 = (i21 <= 0 || (d00Var = ((i00) this.g0).K) == null || !d00Var.b.y) ? org.telegram.messenger.i0.Q1() ? i31 - measuredHeight : (i31 + Q) - measuredHeight : (i31 - i21) - org.telegram.messenger.i0.L(200.0f);
                                } else {
                                    i14 = 8;
                                }
                                childAt.layout(i17, i20, i17 + measuredWidth, i20 + measuredHeight);
                            } else {
                                i18 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i19 = layoutParams.bottomMargin;
                            }
                            i20 = i18 - i19;
                            if (childAt instanceof org.telegram.ui.Components.vy) {
                            }
                            childAt.layout(i17, i20, i17 + measuredWidth, i20 + measuredHeight);
                        } else {
                            i15 = paddingRight - measuredWidth;
                            i16 = layoutParams.rightMargin;
                        }
                        i17 = i15 - i16;
                        if (i34 == 16) {
                        }
                        i20 = i18 - i19;
                        if (childAt instanceof org.telegram.ui.Components.vy) {
                        }
                        childAt.layout(i17, i20, i17 + measuredWidth, i20 + measuredHeight);
                    } else {
                        i14 = i29;
                    }
                    i32++;
                    i29 = i14;
                    i26 = 80;
                    i30 = 1;
                }
                R();
                break;
            case 6:
                ma0 ma0Var = (ma0) this.g0;
                int scrollY = ma0Var.J.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != ma0Var.J.getScrollY()) {
                    ma0Var.J.setTranslationY(r3.getScrollY() - scrollY);
                    ma0Var.J.animate().cancel();
                    ma0Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
                    break;
                }
                break;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.g0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= org.telegram.messenger.i0.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i37 = layoutParams2.gravity;
                        if (i37 == i28) {
                            i37 = 51;
                        }
                        int i38 = i37 & org.telegram.messenger.zs.x1;
                        int i39 = i37 & 7;
                        int i40 = i39 != 1 ? i39 != i27 ? layoutParams2.leftMargin : (i12 - measuredWidth2) - layoutParams2.rightMargin : ((((i12 - i10) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i38 == 16) {
                            i23 = ((((i13 - emojiPadding) - i11) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i24 = layoutParams2.bottomMargin;
                        } else if (i38 != 80) {
                            i25 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.r0(childAt2)) {
                                i25 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i25 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.N1) {
                                i25 = ((popupNotificationActivity.E.getMeasuredHeight() + popupNotificationActivity.E.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i40 = ((popupNotificationActivity.E.getMeasuredWidth() + popupNotificationActivity.E.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i40, i25, measuredWidth2 + i40, measuredHeight2 + i25);
                        } else {
                            i23 = ((i13 - emojiPadding) - i11) - measuredHeight2;
                            i24 = layoutParams2.bottomMargin;
                        }
                        i25 = i23 - i24;
                        if (!popupNotificationActivity.b.r0(childAt2)) {
                        }
                        childAt2.layout(i40, i25, measuredWidth2 + i40, measuredHeight2 + i25);
                    }
                    i36++;
                    i27 = 5;
                    i28 = -1;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        switch (this.f0) {
            case 0:
                ((j9) this.g0).g0();
                super.onMeasure(i10, i11);
                break;
            case 1:
            case 4:
            case 5:
            case 9:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.iz0) this.g0).d.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.g0;
                i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                measureChildWithMargins(i5Var, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                i5Var2 = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = i5Var2.getMeasuredHeight();
                super.onMeasure(i10, i11);
                break;
            case 6:
                ma0 ma0Var = (ma0) this.g0;
                super.onMeasure(i10, i11);
                Q();
                int i12 = this.f;
                if (i12 != 0 && i12 < org.telegram.messenger.i0.L(20.0f)) {
                    ma0Var.F.clearFocus();
                    ma0Var.K.clearFocus();
                }
                ma0Var.H.setVisibility(this.f > org.telegram.messenger.i0.L(20.0f) ? 8 : 0);
                break;
            case 7:
                hf0 hf0Var = (hf0) this.g0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) hf0Var.N.getLayoutParams();
                int L = hf0Var.p1() ? org.telegram.messenger.i0.L(226.0f) : 0;
                if (hf0Var.p1() && Q() > org.telegram.messenger.i0.L(20.0f)) {
                    L -= Q();
                }
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
                if (wbVar == null || !wbVar.l) {
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.i0.L(14.0f) + L;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.z20.D(10.0f, org.telegram.ui.Components.wb.w.e.getMeasuredHeight() + org.telegram.messenger.i0.L(14.0f), L);
                }
                int i13 = org.telegram.messenger.i0.Q1() ? 0 : org.telegram.messenger.i0.m;
                ((ViewGroup.MarginLayoutParams) hf0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) hf0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) hf0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i13;
                TextView textView = hf0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i13;
                }
                if (Q() > org.telegram.messenger.i0.L(20.0f) && hf0Var.c.getVisibility() != 8 && !org.telegram.messenger.i0.C1() && !hf0Var.a0) {
                    ValueAnimator valueAnimator = hf0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hf0Var.c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.g0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.i0.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i14 = size2;
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.r0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f) + i14), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 10:
                ph.r3 r3Var = (ph.r3) this.g0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r3Var.D.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar = ((org.telegram.ui.ActionBar.k2) r3Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r3Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar2 = ((org.telegram.ui.ActionBar.k2) r3Var).actionBar;
                layoutParams2.topMargin = org.telegram.messenger.i0.L(47.0f) + currentActionBarHeight2 + (lVar2.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r3Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar3 = ((org.telegram.ui.ActionBar.k2) r3Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (lVar3.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) r3Var.x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar4 = ((org.telegram.ui.ActionBar.k2) r3Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (lVar4.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public void updateColors() {
        switch (this.f0) {
            case 9:
                try {
                    ((e51) this.g0).p0();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Object obj, Context context, int i10) {
        super(context, null);
        this.f0 = i10;
        this.g0 = obj;
    }
}
