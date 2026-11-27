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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w81 extends wma {
    public final /* synthetic */ byte g0;
    public Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(byte b, Context context, Object obj) {
        super(context, null);
        this.g0 = b;
        this.h0 = obj;
    }

    @Override // wma
    public final boolean O() {
        switch (this.g0) {
            case 3:
            case 9:
                return false;
            default:
                return super.O();
        }
    }

    @Override // wma
    public final boolean P() {
        switch (this.g0) {
            case 9:
                return false;
            default:
                return super.P();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        switch (this.g0) {
            case 2:
                if (view instanceof o24) {
                    ViewGroup.LayoutParams layoutParams = ((o24) view).getLayoutParams();
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

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vy4 vy4Var;
        switch (this.g0) {
            case 8:
                tba tbaVar = (tba) this.h0;
                tbaVar.o0();
                super.dispatchDraw(canvas);
                vy4Var = ((e) tbaVar).glassEngine;
                vy4Var.g();
                if (!tbaVar.O) {
                    hl.O(canvas, this, tbaVar.getThemedColor(aob.d6), tbaVar.d0, 1.0f);
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
        switch (this.g0) {
            case 6:
                if (motionEvent.getY() < ((m57) this.h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // wma
    public final Drawable getNewDrawable() {
        switch (this.g0) {
            case 3:
                if (!xea.D0) {
                    break;
                } else {
                    int w0 = aob.w0(null, aob.ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.h0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.h0 = new ColorDrawable(w0);
                    }
                    break;
                }
            case 6:
                Drawable l = ((xu1) ((m57) this.h0).d0.G).l();
                if (l == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // wma
    public final boolean getNewDrawableMotion() {
        switch (this.g0) {
            case 3:
                return !xea.D0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // wma
    public final vnb getResourceProvider() {
        switch (this.g0) {
            case 9:
                return ((sjb) this.h0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if4 if4Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 16;
        int i14 = 5;
        int i15 = -1;
        int i16 = 8;
        int i17 = 1;
        switch (this.g0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((i91) this.h0).a0();
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ContactsActivity contactsActivity = (ContactsActivity) this.h0;
                contactsActivity.c0();
                sla slaVar = contactsActivity.n;
                if (slaVar != null) {
                    iu2 iu2Var = contactsActivity.b;
                    slaVar.Y((iu2Var == null || iu2Var.J) ? false : true, true);
                }
                contactsActivity.d0();
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
                        int i21 = i20 & jn7.w1;
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
                            if (childAt instanceof o24) {
                                WeakHashMap weakHashMap = ihc.a;
                                l2d a = bhc.a(this);
                                int i23 = a != null ? a.a.f(8).d : 0;
                                i8 = (i23 <= 0 || (if4Var = ((nf4) this.h0).L) == null || !if4Var.b.y) ? hl.O1() ? i18 - measuredHeight : (i18 + Q) - measuredHeight : (i18 - i23) - hl.L(200.0f);
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
                        } else {
                            i5 = paddingRight - measuredWidth;
                            i6 = layoutParams.rightMargin;
                        }
                        i7 = i5 - i6;
                        if (i21 == i13) {
                        }
                        if (childAt instanceof o24) {
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
                v56 v56Var = (v56) this.h0;
                int scrollY = v56Var.K.getScrollY();
                super.onLayout(z, i, i2, i3, i4);
                if (scrollY != v56Var.K.getScrollY()) {
                    v56Var.K.setTranslationY(r0.getScrollY() - scrollY);
                    v56Var.K.animate().cancel();
                    v56Var.K.animate().translationY(0.0f).setDuration(250L).setInterpolator(hb.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.h0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= hl.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
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
                        int i26 = i25 & jn7.w1;
                        int i27 = i25 & 7;
                        int i28 = i27 != 1 ? i27 != i14 ? layoutParams2.leftMargin : (i3 - measuredWidth2) - layoutParams2.rightMargin : ((((i3 - i) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i26 == 16) {
                            i10 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i11 = layoutParams2.bottomMargin;
                        } else if (i26 != 80) {
                            i12 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.V0(childAt2)) {
                                i12 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i12 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.C2) {
                                i12 = ((popupNotificationActivity.F.getMeasuredHeight() + popupNotificationActivity.F.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i28 = ((popupNotificationActivity.F.getMeasuredWidth() + popupNotificationActivity.F.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i28, i12, i28 + measuredWidth2, measuredHeight2 + i12);
                        } else {
                            i10 = qd4.f(i4, emojiPadding, i2, measuredHeight2);
                            i11 = layoutParams2.bottomMargin;
                        }
                        i12 = i10 - i11;
                        if (!popupNotificationActivity.b.V0(childAt2)) {
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
        jla jlaVar;
        jla jlaVar2;
        switch (this.g0) {
            case 0:
                ((i91) this.h0).b0();
                super.onMeasure(i, i2);
                break;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.h0;
                jlaVar = ((e) contactsActivity).simpleActionBar;
                measureChildWithMargins(jlaVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                jlaVar2 = ((e) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = jlaVar2.getMeasuredHeight();
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
                v56 v56Var = (v56) this.h0;
                super.onMeasure(i, i2);
                Q();
                int i3 = this.f;
                if (i3 != 0 && i3 < hl.L(20.0f)) {
                    v56Var.G.clearFocus();
                    v56Var.L.clearFocus();
                }
                v56Var.I.setVisibility(this.f <= hl.L(20.0f) ? 0 : 8);
                break;
            case 5:
                qh6 qh6Var = (qh6) this.h0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qh6Var.O.getLayoutParams();
                int L = qh6Var.s1() ? hl.L(226.0f) : 0;
                if (qh6Var.s1() && Q() > hl.L(20.0f)) {
                    L -= Q();
                }
                v21 v21Var = v21.x;
                if (v21Var == null || !v21Var.m) {
                    marginLayoutParams2.bottomMargin = hl.L(14.0f) + L;
                } else {
                    super.onMeasure(i, i2);
                    marginLayoutParams2.bottomMargin = c00.A(10.0f, v21.x.e.getMeasuredHeight() + hl.L(14.0f), L);
                }
                int i4 = hl.O1() ? 0 : hl.m;
                ((ViewGroup.MarginLayoutParams) qh6Var.V.getLayoutParams()).topMargin = hl.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) qh6Var.X.getLayoutParams()).topMargin = hl.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) qh6Var.W.getLayoutParams()).topMargin = hl.L(16.0f) + i4;
                TextView textView = qh6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = hl.L(16.0f) + i4;
                }
                if (qh6Var.n0.getMinimumHeight() != i4) {
                    qh6Var.n0.setMinimumHeight(i4);
                }
                if (Q() > hl.L(20.0f) && qh6Var.c.getVisibility() != 8 && !hl.A1() && !qh6Var.b0) {
                    ValueAnimator valueAnimator = qh6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qh6Var.c.setVisibility(8);
                }
                super.onMeasure(i, i2);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.h0;
                View.MeasureSpec.getMode(i);
                View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                if (Q() <= hl.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i5 = size2;
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.V0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.C2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), hl.L(2.0f) + i5), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((sjb) this.h0).d.getMeasuredHeight() + hl.L(24.0f));
                break;
        }
    }

    @Override // wma, snb
    public final void updateColors() {
        switch (this.g0) {
            case 8:
                try {
                    ((tba) this.h0).p0();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(Context context, wk5 wk5Var) {
        super(context, wk5Var);
        this.g0 = (byte) 3;
    }
}
