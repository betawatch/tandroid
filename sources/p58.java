// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p58 extends cja {
    public int m0;
    public boolean n0;
    public int o0;
    public final /* synthetic */ u58 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p58(u58 u58Var, Context context) {
        super(context, null);
        this.p0 = u58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        rt3 rt3Var;
        int measuredHeight;
        int measuredHeight2;
        int i11 = this.m0;
        int i12 = i3 - i;
        u58 u58Var = this.p0;
        if (i11 != i12) {
            this.m0 = i12;
            s20 s20Var = u58Var.M;
            if (s20Var != null) {
                s20Var.f();
            }
            m8 m8Var = u58Var.n0;
            if (m8Var != null && m8Var.isShowing()) {
                u58Var.n0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (u58Var.e0 == null || u58Var.a0.getParent() != this || gl.L(20.0f) < 0 || gl.E || gl.O1()) ? 0 : u58Var.e0.getEmojiPadding();
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
                int i15 = i14 & kk7.w1;
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
                            i8 = tb4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        rt3Var = u58Var.e0;
                        if (rt3Var != null && rt3Var.l(childAt)) {
                            if (gl.O1()) {
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
                    rt3Var = u58Var.e0;
                    if (rt3Var != null) {
                        if (gl.O1()) {
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
                rt3Var = u58Var.e0;
                if (rt3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rt3 rt3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = gl.O1();
        u58 u58Var = this.p0;
        if (O1) {
            u58Var.h0 = (byte) 4;
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                u58Var.h0 = (byte) 4;
            } else {
                u58Var.h0 = (byte) 3;
            }
        }
        this.n0 = true;
        int L = ((size2 - gl.L(4.0f)) - gl.L(4.0f)) / u58Var.h0;
        u58Var.S = L;
        if (this.o0 != L) {
            this.o0 = L;
            gl.c3(new oq7(this, (byte) 23));
        }
        boolean z = u58Var.Z;
        q58 q58Var = u58Var.N;
        if (z) {
            q58Var.x1(1);
        } else {
            q58Var.x1(Math.max(1, ((u58Var.h0 - 1) * gl.L(2.0f)) + (u58Var.S * u58Var.h0)));
        }
        this.n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (gl.L(20.0f) >= 0 && !gl.E && u58Var.e0 != null && u58Var.a0.getParent() == this) {
            size4 -= u58Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i3 = size4;
        int i4 = makeMeasureSpec;
        if (Q > gl.L(20.0f) && (rt3Var = u58Var.e0) != null) {
            this.n0 = true;
            rt3Var.j();
            this.n0 = false;
        }
        rt3 rt3Var2 = u58Var.e0;
        if (rt3Var2 != null && rt3Var2.e) {
            u58Var.fragmentView.setTranslationY(0.0f);
            u58Var.L.setTranslationY(0.0f);
            u58Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                rt3 rt3Var3 = u58Var.e0;
                if (rt3Var3 == null || !rt3Var3.l(childAt)) {
                    measureChildWithMargins(childAt, i, 0, i4, 0);
                } else if (!gl.E && !gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(gl.O1() ? 200.0f : 320.0f), getPaddingTop() + (i3 - gl.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - gl.m), TLObject.FLAG_30));
                }
            }
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
