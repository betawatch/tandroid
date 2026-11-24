// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w91 extends ela {
    public final /* synthetic */ byte m0;
    public Object n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w91(byte b, Context context, Object obj) {
        super(context, null);
        this.m0 = b;
        this.n0 = obj;
    }

    @Override // ela
    public final boolean O() {
        switch (this.m0) {
            case 3:
            case 9:
                return false;
            default:
                return super.O();
        }
    }

    @Override // ela
    public final boolean P() {
        switch (this.m0) {
            case 9:
                return false;
            default:
                return super.P();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        switch (this.m0) {
            case 2:
                if (view instanceof e34) {
                    ViewGroup.LayoutParams layoutParams = ((e34) view).getLayoutParams();
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

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sy4 sy4Var;
        switch (this.m0) {
            case 8:
                daa daaVar = (daa) this.n0;
                daaVar.p0();
                super.dispatchDraw(canvas);
                sy4Var = ((d) daaVar).glassEngine;
                sy4Var.g();
                if (!daaVar.O) {
                    gm.O(canvas, this, daaVar.getThemedColor(cmb.c6), daaVar.d0, 1.0f);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 6:
                if (motionEvent.getY() < ((f57) this.n0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // ela
    public final Drawable getNewDrawable() {
        switch (this.m0) {
            case 3:
                if (!gda.D0) {
                    break;
                } else {
                    int w0 = cmb.w0(null, cmb.ta, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.n0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.n0 = new ColorDrawable(w0);
                    }
                    break;
                }
            case 6:
                Drawable l = ((wv1) ((f57) this.n0).d0.G).l();
                if (l == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // ela
    public final boolean getNewDrawableMotion() {
        switch (this.m0) {
            case 3:
                return !gda.D0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // ela
    public final ylb getResourceProvider() {
        switch (this.m0) {
            case 9:
                return ((xhb) this.n0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        lf4 lf4Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 16;
        int i14 = 5;
        int i15 = -1;
        int i16 = 8;
        int i17 = 1;
        switch (this.m0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((ia1) this.n0).b0();
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
                contactsActivity.d0();
                zja zjaVar = contactsActivity.n;
                if (zjaVar != null) {
                    zu2 zu2Var = contactsActivity.b;
                    zjaVar.Y((zu2Var == null || zu2Var.J) ? false : true, true);
                }
                contactsActivity.e0();
                break;
            case 2:
                int childCount = getChildCount();
                int Q = Q();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i3 - i) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i18 = i4 - i2;
                int paddingBottom = i18 - getPaddingBottom();
                int i19 = 0;
                while (i19 < childCount) {
                    View childAt = getChildAt(i19);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i20 = layoutParams.gravity;
                        if (i20 == -1) {
                            i20 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection());
                        int i21 = i20 & nm7.w1;
                        int i22 = absoluteGravity & 7;
                        if (i22 == i17) {
                            i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i6 = layoutParams.rightMargin;
                        } else if (i22 != 5) {
                            i7 = layoutParams.leftMargin + paddingLeft;
                            if (i21 == i13) {
                                if (i21 == 48) {
                                    i9 = layoutParams.topMargin;
                                } else if (i21 != 80) {
                                    i9 = layoutParams.topMargin;
                                } else {
                                    i8 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                                }
                                i8 = i9 + paddingTop;
                            } else {
                                i8 = (((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                            }
                            if (childAt instanceof e34) {
                                WeakHashMap weakHashMap = kfc.a;
                                wzc a = dfc.a(this);
                                int i23 = a != null ? a.a.f(8).d : 0;
                                i8 = (i23 <= 0 || (lf4Var = ((qf4) this.n0).L) == null || !lf4Var.b.y) ? gm.O1() ? i18 - measuredHeight : (i18 + Q) - measuredHeight : (i18 - i23) - gm.L(200.0f);
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
                        } else {
                            i5 = paddingRight - measuredWidth;
                            i6 = layoutParams.rightMargin;
                        }
                        i7 = i5 - i6;
                        if (i21 == i13) {
                        }
                        if (childAt instanceof e34) {
                        }
                        childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
                    }
                    i19++;
                    i13 = 16;
                    i17 = 1;
                }
                R();
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 4:
                s56 s56Var = (s56) this.n0;
                int scrollY = s56Var.K.getScrollY();
                super.onLayout(z, i, i2, i3, i4);
                if (scrollY != s56Var.K.getScrollY()) {
                    s56Var.K.setTranslationY(r0.getScrollY() - scrollY);
                    s56Var.K.animate().cancel();
                    s56Var.K.animate().translationY(0.0f).setDuration(250L).setInterpolator(gb.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.n0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= gm.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                int i24 = 0;
                while (i24 < childCount2) {
                    View childAt2 = getChildAt(i24);
                    if (childAt2.getVisibility() != i16) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i25 = layoutParams2.gravity;
                        if (i25 == i15) {
                            i25 = 51;
                        }
                        int i26 = i25 & nm7.w1;
                        int i27 = i25 & 7;
                        int i28 = i27 != 1 ? i27 != i14 ? layoutParams2.leftMargin : (i3 - measuredWidth2) - layoutParams2.rightMargin : ((((i3 - i) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i26 == 16) {
                            i10 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i11 = layoutParams2.bottomMargin;
                        } else if (i26 != 80) {
                            i12 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.S0(childAt2)) {
                                i12 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i12 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.D2) {
                                i12 = ((popupNotificationActivity.F.getMeasuredHeight() + popupNotificationActivity.F.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i28 = ((popupNotificationActivity.F.getMeasuredWidth() + popupNotificationActivity.F.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i28, i12, i28 + measuredWidth2, measuredHeight2 + i12);
                        } else {
                            i10 = td4.f(i4, emojiPadding, i2, measuredHeight2);
                            i11 = layoutParams2.bottomMargin;
                        }
                        i12 = i10 - i11;
                        if (!popupNotificationActivity.b.S0(childAt2)) {
                        }
                        childAt2.layout(i28, i12, i28 + measuredWidth2, measuredHeight2 + i12);
                    }
                    i24++;
                    i14 = 5;
                    i15 = -1;
                    i16 = 8;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rja rjaVar;
        rja rjaVar2;
        switch (this.m0) {
            case 0:
                ((ia1) this.n0).c0();
                super.onMeasure(i, i2);
                break;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
                rjaVar = ((d) contactsActivity).simpleActionBar;
                measureChildWithMargins(rjaVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                rjaVar2 = ((d) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = rjaVar2.getMeasuredHeight();
                super.onMeasure(i, i2);
                break;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                s56 s56Var = (s56) this.n0;
                super.onMeasure(i, i2);
                Q();
                int i3 = this.f;
                if (i3 != 0 && i3 < gm.L(20.0f)) {
                    s56Var.G.clearFocus();
                    s56Var.L.clearFocus();
                }
                s56Var.I.setVisibility(this.f <= gm.L(20.0f) ? 0 : 8);
                break;
            case 5:
                mh6 mh6Var = (mh6) this.n0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) mh6Var.O.getLayoutParams();
                int L = mh6Var.s1() ? gm.L(226.0f) : 0;
                if (mh6Var.s1() && Q() > gm.L(20.0f)) {
                    L -= Q();
                }
                u31 u31Var = u31.x;
                if (u31Var == null || !u31Var.m) {
                    marginLayoutParams2.bottomMargin = gm.L(14.0f) + L;
                } else {
                    super.onMeasure(i, i2);
                    marginLayoutParams2.bottomMargin = b10.z(10.0f, u31.x.e.getMeasuredHeight() + gm.L(14.0f), L);
                }
                int i4 = gm.O1() ? 0 : gm.m;
                ((ViewGroup.MarginLayoutParams) mh6Var.V.getLayoutParams()).topMargin = gm.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) mh6Var.X.getLayoutParams()).topMargin = gm.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) mh6Var.W.getLayoutParams()).topMargin = gm.L(16.0f) + i4;
                TextView textView = mh6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = gm.L(16.0f) + i4;
                }
                if (mh6Var.n0.getMinimumHeight() != i4) {
                    mh6Var.n0.setMinimumHeight(i4);
                }
                if (Q() > gm.L(20.0f) && mh6Var.c.getVisibility() != 8 && !gm.A1() && !mh6Var.b0) {
                    ValueAnimator valueAnimator = mh6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mh6Var.c.setVisibility(8);
                }
                super.onMeasure(i, i2);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.n0;
                View.MeasureSpec.getMode(i);
                View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                if (Q() <= gm.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i5 = size2;
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.S0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.D2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), gm.L(2.0f) + i5), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((xhb) this.n0).d.getMeasuredHeight() + gm.L(24.0f));
                break;
        }
    }

    @Override // ela, vlb
    public final void updateColors() {
        switch (this.m0) {
            case 8:
                try {
                    ((daa) this.n0).q0();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w91(Context context, tk5 tk5Var) {
        super(context, tk5Var);
        this.m0 = (byte) 3;
    }
}
