// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class u78 extends wma {
    public int g0;
    public boolean h0;
    public final /* synthetic */ w78 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u78(w78 w78Var, Context context) {
        super(context, null);
        this.i0 = w78Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        iu3 iu3Var;
        int measuredHeight;
        int measuredHeight2;
        int i11 = this.g0;
        int i12 = i3 - i;
        w78 w78Var = this.i0;
        if (i11 != i12) {
            this.g0 = i12;
            n8 n8Var = w78Var.J;
            if (n8Var != null && n8Var.isShowing()) {
                w78Var.J.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (hl.L(20.0f) < 0 || hl.E || hl.O1()) ? 0 : w78Var.N.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & jn7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    i5 = ((i12 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i15 == 16) {
                        if (i15 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                        } else if (i15 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = qd4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        iu3Var = w78Var.N;
                        if (iu3Var != null && iu3Var.l(childAt)) {
                            if (hl.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    iu3Var = w78Var.N;
                    if (iu3Var != null) {
                        if (hl.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = (i12 - measuredWidth) - layoutParams.rightMargin;
                    i6 = getPaddingRight();
                }
                i7 = i5 - i6;
                if (i15 == 16) {
                }
                i10 = i8 - i9;
                iu3Var = w78Var.N;
                if (iu3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        u78 u78Var;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int L = hl.L(20.0f);
        int i4 = 0;
        w78 w78Var = this.i0;
        if (L < 0) {
            this.h0 = true;
            w78Var.N.j();
            this.h0 = false;
        } else if (!hl.E) {
            size2 -= w78Var.N.getEmojiPadding();
            i2 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
        }
        int i5 = i2;
        int childCount = getChildCount();
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                iu3 iu3Var = w78Var.N;
                if (iu3Var == null || !iu3Var.l(childAt)) {
                    u78Var = this;
                    i3 = i;
                    u78Var.measureChildWithMargins(childAt, i3, 0, i5, 0);
                    i4++;
                    this = u78Var;
                    i = i3;
                } else if (!hl.E && !hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), this.getPaddingTop() + (size2 - hl.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.getPaddingTop() + (size2 - hl.m), TLObject.FLAG_30));
                }
            }
            u78Var = this;
            i3 = i;
            i4++;
            this = u78Var;
            i = i3;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }
}
