// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r78 extends ela {
    public int m0;
    public boolean n0;
    public int o0;
    public final /* synthetic */ w78 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r78(w78 w78Var, Context context) {
        super(context, null);
        this.p0 = w78Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        cv3 cv3Var;
        int measuredHeight;
        int measuredHeight2;
        int i11 = this.m0;
        int i12 = i3 - i;
        w78 w78Var = this.p0;
        if (i11 != i12) {
            this.m0 = i12;
            s30 s30Var = w78Var.M;
            if (s30Var != null) {
                s30Var.f();
            }
            m8 m8Var = w78Var.n0;
            if (m8Var != null && m8Var.isShowing()) {
                w78Var.n0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (w78Var.e0 == null || w78Var.a0.getParent() != this || gm.L(20.0f) < 0 || gm.E || gm.O1()) ? 0 : w78Var.e0.getEmojiPadding();
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
                int i15 = i14 & nm7.w1;
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
                            i8 = td4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        cv3Var = w78Var.e0;
                        if (cv3Var != null && cv3Var.l(childAt)) {
                            if (gm.O1()) {
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
                    cv3Var = w78Var.e0;
                    if (cv3Var != null) {
                        if (gm.O1()) {
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
                cv3Var = w78Var.e0;
                if (cv3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        cv3 cv3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = gm.O1();
        w78 w78Var = this.p0;
        if (O1) {
            w78Var.h0 = (byte) 4;
        } else {
            Point point = gm.q;
            if (point.x > point.y) {
                w78Var.h0 = (byte) 4;
            } else {
                w78Var.h0 = (byte) 3;
            }
        }
        this.n0 = true;
        int L = ((size2 - gm.L(4.0f)) - gm.L(4.0f)) / w78Var.h0;
        w78Var.S = L;
        if (this.o0 != L) {
            this.o0 = L;
            gm.c3(new q78(this, (byte) 0));
        }
        boolean z = w78Var.Z;
        s78 s78Var = w78Var.N;
        if (z) {
            s78Var.x1(1);
        } else {
            s78Var.x1(Math.max(1, ((w78Var.h0 - 1) * gm.L(2.0f)) + (w78Var.S * w78Var.h0)));
        }
        this.n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (gm.L(20.0f) >= 0 && !gm.E && w78Var.e0 != null && w78Var.a0.getParent() == this) {
            size4 -= w78Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i3 = size4;
        if (Q > gm.L(20.0f) && (cv3Var = w78Var.e0) != null) {
            this.n0 = true;
            cv3Var.j();
            this.n0 = false;
        }
        cv3 cv3Var2 = w78Var.e0;
        if (cv3Var2 != null && cv3Var2.e) {
            w78Var.fragmentView.setTranslationY(0.0f);
            w78Var.L.setTranslationY(0.0f);
            w78Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = makeMeasureSpec;
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                cv3 cv3Var3 = w78Var.e0;
                if (cv3Var3 == null || !cv3Var3.l(childAt)) {
                    measureChildWithMargins(childAt, i, 0, i5, 0);
                } else if (!gm.E && !gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(gm.O1() ? 200.0f : 320.0f), getPaddingTop() + (i3 - gm.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - gm.m), TLObject.FLAG_30));
                }
            }
            i4++;
            makeMeasureSpec = i5;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }
}
