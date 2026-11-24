// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class p46 extends ViewGroup {
    public int E;
    public int F;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float h;
    public boolean n;
    public int[] r;
    public int[] s;
    public Drawable w;
    public int x;
    public int y;

    public p46(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = k09.n;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        kfc.j(this, context, iArr, attributeSet, (TypedArray) v.c, i);
        TypedArray typedArray = (TypedArray) v.c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.n = typedArray.getBoolean(7, false);
        setDividerDrawable(v.j(5));
        this.E = typedArray.getInt(8, 0);
        this.F = typedArray.getDimensionPixelSize(6, 0);
        v.y();
    }

    public final void c(Canvas canvas, int i) {
        this.w.setBounds(getPaddingLeft() + this.F, i, (getWidth() - getPaddingRight()) - this.F, this.y + i);
        this.w.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o46;
    }

    public final void d(Canvas canvas, int i) {
        this.w.setBounds(i, getPaddingTop() + this.F, this.x + i, (getHeight() - getPaddingBottom()) - this.F);
        this.w.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public o46 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new o46(-2, -2);
        }
        if (i == 1) {
            return new o46(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o46 generateLayoutParams(AttributeSet attributeSet) {
        return new o46(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o46 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new o46(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            zo4.k("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            zo4.k("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int i3 = this.c;
        if (this.d == 1 && (i = this.e & nm7.w1) != 48) {
            if (i == 16) {
                i3 = wi8.g(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((o46) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.w;
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getDividerWidth() {
        return this.x;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.E & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.E;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.w != null) {
            int i2 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((o46) childAt.getLayoutParams())).topMargin) - this.y);
                    }
                    i2++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.y : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((o46) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = ghc.a(this);
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                    o46 o46Var = (o46) childAt3.getLayoutParams();
                    d(canvas, a ? childAt3.getRight() + ((LinearLayout.LayoutParams) o46Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) o46Var).leftMargin) - this.x);
                }
                i2++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    o46 o46Var2 = (o46) childAt4.getLayoutParams();
                    if (a) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) o46Var2).leftMargin;
                        i = this.x;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) o46Var2).rightMargin;
                    }
                } else if (a) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.x;
                    right = left - i;
                }
                d(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int g;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int g2;
        int i14 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i15 = i3 - i;
            int paddingRight = i15 - getPaddingRight();
            int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i16 = this.e;
            int i17 = i16 & nm7.w1;
            int i18 = i16 & 8388615;
            int paddingTop = i17 != 16 ? i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f : wi8.g(i4 - i2, this.f, 2, getPaddingTop());
            int i19 = 0;
            while (i19 < virtualChildCount) {
                View childAt = getChildAt(i19);
                if (childAt != null && childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    o46 o46Var = (o46) childAt.getLayoutParams();
                    int i20 = ((LinearLayout.LayoutParams) o46Var).gravity;
                    if (i20 < 0) {
                        i20 = i18;
                    }
                    WeakHashMap weakHashMap = kfc.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                    int g3 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) o46Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) o46Var).rightMargin : (wi8.g(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) o46Var).leftMargin) - ((LinearLayout.LayoutParams) o46Var).rightMargin;
                    if (h(i19)) {
                        paddingTop += this.y;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) o46Var).topMargin;
                    childAt.layout(g3, i21, measuredWidth + g3, i21 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) o46Var).bottomMargin + i21;
                }
                i19++;
                i14 = 8;
            }
            return;
        }
        boolean a = ghc.a(this);
        int paddingTop2 = getPaddingTop();
        int i22 = i4 - i2;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i23 = this.e;
        int i24 = 8388615 & i23;
        int i25 = i23 & nm7.w1;
        boolean z2 = this.a;
        int[] iArr = this.r;
        int[] iArr2 = this.s;
        WeakHashMap weakHashMap2 = kfc.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i24, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            g = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f;
            i5 = 1;
        } else {
            i5 = 1;
            g = wi8.g(i3 - i, this.f, 2, getPaddingLeft());
        }
        if (a) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = i5;
            i7 = 0;
        }
        int i26 = 0;
        while (i26 < virtualChildCount2) {
            int i27 = (i6 * i26) + i7;
            View childAt2 = getChildAt(i27);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i28 = g;
                    o46 o46Var2 = (o46) childAt2.getLayoutParams();
                    if (z2) {
                        i9 = i6;
                        if (((LinearLayout.LayoutParams) o46Var2).height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = ((LinearLayout.LayoutParams) o46Var2).gravity;
                            if (i11 < 0) {
                                i11 = i25;
                            }
                            i12 = i11 & nm7.w1;
                            i13 = i26;
                            if (i12 != 16) {
                                g2 = (wi8.g(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) o46Var2).topMargin) - ((LinearLayout.LayoutParams) o46Var2).bottomMargin;
                            } else if (i12 == 48) {
                                g2 = ((LinearLayout.LayoutParams) o46Var2).topMargin + paddingTop2;
                                if (i10 != -1) {
                                    g2 = (iArr[i5] - i10) + g2;
                                }
                            } else if (i12 != 80) {
                                g2 = paddingTop2;
                            } else {
                                g2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) o46Var2).bottomMargin;
                                if (i10 != -1) {
                                    g2 -= iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                }
                            }
                            int i29 = (!h(i27) ? i28 + this.x : i28) + ((LinearLayout.LayoutParams) o46Var2).leftMargin;
                            childAt2.layout(i29, g2, i29 + measuredWidth2, measuredHeight2 + g2);
                            g = measuredWidth2 + ((LinearLayout.LayoutParams) o46Var2).rightMargin + i29;
                            i26 = i13 + 1;
                            i6 = i9;
                            i7 = i8;
                        }
                    } else {
                        i9 = i6;
                    }
                    i10 = -1;
                    i11 = ((LinearLayout.LayoutParams) o46Var2).gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & nm7.w1;
                    i13 = i26;
                    if (i12 != 16) {
                    }
                    int i292 = (!h(i27) ? i28 + this.x : i28) + ((LinearLayout.LayoutParams) o46Var2).leftMargin;
                    childAt2.layout(i292, g2, i292 + measuredWidth2, measuredHeight2 + g2);
                    g = measuredWidth2 + ((LinearLayout.LayoutParams) o46Var2).rightMargin + i292;
                    i26 = i13 + 1;
                    i6 = i9;
                    i7 = i8;
                }
            }
            i9 = i6;
            i13 = i26;
            i26 = i13 + 1;
            i6 = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        o46 o46Var;
        int i14;
        int[] iArr3;
        int i15;
        View view;
        int i16;
        boolean z4;
        boolean z5;
        int max;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z6;
        int i25;
        int i26;
        int i27;
        View view2;
        boolean z7;
        boolean z8;
        p46 p46Var = this;
        int i28 = p46Var.d;
        int i29 = -2;
        int i30 = 0;
        int i31 = TLObject.FLAG_30;
        int i32 = 8;
        if (i28 == 1) {
            p46Var.f = 0;
            int virtualChildCount = p46Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i33 = p46Var.b;
            boolean z9 = p46Var.n;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z10 = false;
            int i37 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i38 = 0;
            while (i34 < virtualChildCount) {
                int i39 = mode;
                View childAt = p46Var.getChildAt(i34);
                if (childAt == null) {
                    p46Var.f = p46Var.f;
                } else if (childAt.getVisibility() != i32) {
                    if (p46Var.h(i34)) {
                        p46Var.f += p46Var.y;
                    }
                    o46 o46Var2 = (o46) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) o46Var2).weight;
                    f += f2;
                    if (mode2 == i31 && ((LinearLayout.LayoutParams) o46Var2).height == 0 && f2 > 0.0f) {
                        int i40 = p46Var.f;
                        p46Var.f = Math.max(i40, ((LinearLayout.LayoutParams) o46Var2).topMargin + i40 + ((LinearLayout.LayoutParams) o46Var2).bottomMargin);
                        view2 = childAt;
                        i24 = mode2;
                        i25 = i33;
                        z6 = z9;
                        i26 = i34;
                        z10 = true;
                        i27 = i39;
                    } else {
                        if (((LinearLayout.LayoutParams) o46Var2).height != 0 || f2 <= 0.0f) {
                            i21 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) o46Var2).height = i29;
                            i21 = 0;
                        }
                        if (f == 0.0f) {
                            i22 = i34;
                            i23 = p46Var.f;
                        } else {
                            i22 = i34;
                            i23 = 0;
                        }
                        i24 = mode2;
                        z6 = z9;
                        i25 = i33;
                        i26 = i22;
                        i27 = i39;
                        p46Var.measureChildWithMargins(childAt, i, 0, i2, i23);
                        if (i21 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) o46Var2).height = i21;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i41 = p46Var.f;
                        view2 = childAt;
                        p46Var.f = Math.max(i41, i41 + measuredHeight + ((LinearLayout.LayoutParams) o46Var2).topMargin + ((LinearLayout.LayoutParams) o46Var2).bottomMargin);
                        if (z6) {
                            i38 = Math.max(measuredHeight, i38);
                        }
                    }
                    if (i25 >= 0 && i25 == i26 + 1) {
                        p46Var.c = p46Var.f;
                    }
                    if (i26 < i25 && ((LinearLayout.LayoutParams) o46Var2).weight > 0.0f) {
                        zo4.k("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (i27 == 1073741824 || ((LinearLayout.LayoutParams) o46Var2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i42 = ((LinearLayout.LayoutParams) o46Var2).leftMargin + ((LinearLayout.LayoutParams) o46Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i42;
                    i30 = Math.max(i30, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                    if (z12) {
                        i37 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) o46Var2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) o46Var2).weight <= 0.0f) {
                                if (!z13) {
                                    i42 = measuredWidth;
                                }
                                i36 = Math.max(i36, i42);
                            } else {
                                if (!z13) {
                                    i42 = measuredWidth;
                                }
                                i35 = Math.max(i35, i42);
                            }
                            z12 = z8;
                            i34 = i26 + 1;
                            i33 = i25;
                            mode = i27;
                            z9 = z6;
                            mode2 = i24;
                            i29 = -2;
                            i31 = TLObject.FLAG_30;
                            i32 = 8;
                        }
                    } else {
                        i37 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) o46Var2).weight <= 0.0f) {
                    }
                    z12 = z8;
                    i34 = i26 + 1;
                    i33 = i25;
                    mode = i27;
                    z9 = z6;
                    mode2 = i24;
                    i29 = -2;
                    i31 = TLObject.FLAG_30;
                    i32 = 8;
                }
                i24 = mode2;
                i25 = i33;
                z6 = z9;
                i26 = i34;
                i27 = i39;
                i34 = i26 + 1;
                i33 = i25;
                mode = i27;
                z9 = z6;
                mode2 = i24;
                i29 = -2;
                i31 = TLObject.FLAG_30;
                i32 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z14 = z9;
            int i45 = i37;
            int i46 = i2;
            if (p46Var.f > 0 && p46Var.h(virtualChildCount)) {
                p46Var.f += p46Var.y;
            }
            if (z14 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                p46Var.f = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = p46Var.getChildAt(i47);
                    if (childAt2 == null) {
                        p46Var.f = p46Var.f;
                    } else if (childAt2.getVisibility() != 8) {
                        o46 o46Var3 = (o46) childAt2.getLayoutParams();
                        int i48 = p46Var.f;
                        p46Var.f = Math.max(i48, i48 + i38 + ((LinearLayout.LayoutParams) o46Var3).topMargin + ((LinearLayout.LayoutParams) o46Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = p46Var.getPaddingBottom() + p46Var.getPaddingTop() + p46Var.f;
            p46Var.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, p46Var.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (resolveSizeAndState & 16777215) - p46Var.f;
            if (z10 || (i49 != 0 && f > 0.0f)) {
                float f3 = p46Var.h;
                if (f3 > 0.0f) {
                    f = f3;
                }
                p46Var.f = 0;
                int i50 = i45;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt3 = p46Var.getChildAt(i51);
                    if (childAt3.getVisibility() == 8) {
                        i18 = i51;
                    } else {
                        o46 o46Var4 = (o46) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) o46Var4).weight;
                        if (f4 > 0.0f) {
                            int i52 = (int) ((i49 * f4) / f);
                            f -= f4;
                            i49 -= i52;
                            i18 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, p46Var.getPaddingRight() + p46Var.getPaddingLeft() + ((LinearLayout.LayoutParams) o46Var4).leftMargin + ((LinearLayout.LayoutParams) o46Var4).rightMargin, ((LinearLayout.LayoutParams) o46Var4).width);
                            if (((LinearLayout.LayoutParams) o46Var4).height == 0) {
                                i20 = TLObject.FLAG_30;
                                if (i44 == 1073741824) {
                                    if (i52 <= 0) {
                                        i52 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, TLObject.FLAG_30));
                                    i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i20 = TLObject.FLAG_30;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i52;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i20));
                            i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                        } else {
                            i18 = i51;
                        }
                        int i53 = ((LinearLayout.LayoutParams) o46Var4).leftMargin + ((LinearLayout.LayoutParams) o46Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        i30 = Math.max(i30, measuredWidth2);
                        if (i43 != 1073741824) {
                            i19 = -1;
                            if (((LinearLayout.LayoutParams) o46Var4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i19 = -1;
                        }
                        i35 = Math.max(i35, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) o46Var4).width == i19;
                        int i54 = p46Var.f;
                        p46Var.f = Math.max(i54, childAt3.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) o46Var4).topMargin + ((LinearLayout.LayoutParams) o46Var4).bottomMargin);
                        z12 = z15;
                    }
                    i51 = i18 + 1;
                }
                p46Var.f = p46Var.getPaddingBottom() + p46Var.getPaddingTop() + p46Var.f;
                i45 = i50;
            } else {
                i35 = Math.max(i35, i36);
                if (z14 && i44 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt4 = p46Var.getChildAt(i55);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((o46) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i38, TLObject.FLAG_30));
                        }
                    }
                }
            }
            if (z12 || i43 == 1073741824) {
                i35 = i30;
            }
            p46Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(p46Var.getPaddingRight() + p46Var.getPaddingLeft() + i35, p46Var.getSuggestedMinimumWidth()), i, i45), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(p46Var.getMeasuredWidth(), TLObject.FLAG_30);
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt5 = p46Var.getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        o46 o46Var5 = (o46) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) o46Var5).width == -1) {
                            int i57 = ((LinearLayout.LayoutParams) o46Var5).height;
                            ((LinearLayout.LayoutParams) o46Var5).height = childAt5.getMeasuredHeight();
                            p46Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i46, 0);
                            ((LinearLayout.LayoutParams) o46Var5).height = i57;
                        }
                    }
                    i56++;
                    i46 = i2;
                }
                return;
            }
            return;
        }
        int i58 = i;
        p46Var.f = 0;
        int virtualChildCount2 = p46Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i58);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = p46Var.r;
        if (iArr4 == null || (iArr = p46Var.s) == null) {
            iArr4 = new int[4];
            p46Var.r = iArr4;
            iArr = new int[4];
            p46Var.s = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = p46Var.a;
        boolean z17 = p46Var.n;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i59 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = p46Var.getChildAt(i59);
            if (childAt6 == null) {
                p46Var.f = p46Var.f;
                i13 = i59;
                i17 = i61;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z2 = z16;
                z3 = z17;
            } else {
                int i65 = i60;
                if (childAt6.getVisibility() == 8) {
                    i58 = i;
                    i13 = i59;
                    i17 = i61;
                    iArr2 = iArr6;
                    z2 = z16;
                    z3 = z17;
                    i60 = i65;
                    iArr3 = iArr5;
                } else {
                    if (p46Var.h(i59)) {
                        p46Var.f += p46Var.x;
                    }
                    o46 o46Var6 = (o46) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) o46Var6).weight;
                    f5 += f6;
                    int i66 = i59;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) o46Var6).width == 0 && f6 > 0.0f) {
                        int i67 = p46Var.f;
                        int i68 = ((LinearLayout.LayoutParams) o46Var6).leftMargin;
                        if (z18) {
                            p46Var.f = i68 + ((LinearLayout.LayoutParams) o46Var6).rightMargin + i67;
                        } else {
                            p46Var.f = Math.max(i67, i67 + i68 + ((LinearLayout.LayoutParams) o46Var6).rightMargin);
                        }
                        if (z16) {
                            childAt6.measure(0, 0);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i14 = i65;
                            i13 = i66;
                            o46Var = o46Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i58 = i;
                            i15 = i61;
                            i12 = i62;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i14 = i65;
                            i13 = i66;
                            i16 = TLObject.FLAG_30;
                            o46Var = o46Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i58 = i;
                            i15 = i61;
                            i12 = i62;
                            if (mode4 == i16 && ((LinearLayout.LayoutParams) o46Var).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i69 = ((LinearLayout.LayoutParams) o46Var).topMargin + ((LinearLayout.LayoutParams) o46Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i69;
                            i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i70 = ((LinearLayout.LayoutParams) o46Var).gravity;
                                    if (i70 < 0) {
                                        i70 = p46Var.e;
                                    }
                                    int i71 = (((i70 & nm7.w1) >> 4) & (-2)) >> 1;
                                    iArr3[i71] = Math.max(iArr3[i71], baseline2);
                                    iArr2[i71] = Math.max(iArr2[i71], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i14, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) o46Var).height == -1;
                            if (((LinearLayout.LayoutParams) o46Var).weight <= 0.0f) {
                                if (!z5) {
                                    i69 = measuredHeight3;
                                }
                                i62 = Math.max(i12, i69);
                                max = i15;
                            } else {
                                if (!z5) {
                                    i69 = measuredHeight3;
                                }
                                max = Math.max(i15, i69);
                                i62 = i12;
                            }
                            int i72 = max;
                            i60 = max2;
                            i17 = i72;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) o46Var6).width != 0 || f6 <= 0.0f) {
                            i11 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) o46Var6).width = -2;
                            i11 = 0;
                        }
                        iArr2 = iArr6;
                        i12 = i62;
                        i13 = i66;
                        z2 = z16;
                        z3 = z17;
                        int i73 = i11;
                        o46Var = o46Var6;
                        i14 = i65;
                        i58 = i;
                        iArr3 = iArr5;
                        i15 = i61;
                        p46Var.measureChildWithMargins(childAt6, i58, f5 == 0.0f ? p46Var.f : 0, i2, 0);
                        if (i73 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) o46Var).width = i73;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i74 = p46Var.f;
                        int i75 = ((LinearLayout.LayoutParams) o46Var).leftMargin;
                        if (z18) {
                            view = childAt6;
                            p46Var.f = i75 + measuredWidth3 + ((LinearLayout.LayoutParams) o46Var).rightMargin + i74;
                        } else {
                            view = childAt6;
                            p46Var.f = Math.max(i74, i74 + measuredWidth3 + i75 + ((LinearLayout.LayoutParams) o46Var).rightMargin);
                        }
                        if (z3) {
                            i63 = Math.max(measuredWidth3, i63);
                        }
                    }
                    i16 = TLObject.FLAG_30;
                    if (mode4 == i16) {
                    }
                    z4 = false;
                    int i692 = ((LinearLayout.LayoutParams) o46Var).topMargin + ((LinearLayout.LayoutParams) o46Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i692;
                    i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i14, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) o46Var).weight <= 0.0f) {
                    }
                    int i722 = max;
                    i60 = max22;
                    i17 = i722;
                    z19 = z22;
                }
            }
            i61 = i17;
            i59 = i13 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i76 = i60;
        int i77 = i61;
        int i78 = i62;
        if (p46Var.f > 0 && p46Var.h(virtualChildCount2)) {
            p46Var.f += p46Var.x;
        }
        int i79 = iArr7[1];
        int max3 = (i79 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i76 : Math.max(i76, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i79, iArr7[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            p46Var.f = 0;
            for (int i80 = 0; i80 < virtualChildCount2; i80++) {
                View childAt7 = p46Var.getChildAt(i80);
                if (childAt7 == null) {
                    p46Var.f = p46Var.f;
                } else if (childAt7.getVisibility() != 8) {
                    o46 o46Var7 = (o46) childAt7.getLayoutParams();
                    int i81 = p46Var.f;
                    if (z18) {
                        p46Var.f = ((LinearLayout.LayoutParams) o46Var7).leftMargin + i63 + ((LinearLayout.LayoutParams) o46Var7).rightMargin + i81;
                    } else {
                        p46Var.f = Math.max(i81, i81 + i63 + ((LinearLayout.LayoutParams) o46Var7).leftMargin + ((LinearLayout.LayoutParams) o46Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = p46Var.getPaddingRight() + p46Var.getPaddingLeft() + p46Var.f;
        p46Var.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, p46Var.getSuggestedMinimumWidth()), i58, 0);
        int i82 = (resolveSizeAndState2 & 16777215) - p46Var.f;
        if (z21 || (i82 != 0 && f5 > 0.0f)) {
            float f7 = p46Var.h;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            p46Var.f = 0;
            max3 = -1;
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt8 = p46Var.getChildAt(i83);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    o46 o46Var8 = (o46) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) o46Var8).weight;
                    if (f8 > 0.0f) {
                        int i84 = (int) ((i82 * f8) / f5);
                        f5 -= f8;
                        i82 -= i84;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, p46Var.getPaddingBottom() + p46Var.getPaddingTop() + ((LinearLayout.LayoutParams) o46Var8).topMargin + ((LinearLayout.LayoutParams) o46Var8).bottomMargin, ((LinearLayout.LayoutParams) o46Var8).height);
                        if (((LinearLayout.LayoutParams) o46Var8).width == 0) {
                            i10 = TLObject.FLAG_30;
                            if (mode3 == 1073741824) {
                                if (i84 <= 0) {
                                    i84 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i84, TLObject.FLAG_30), childMeasureSpec2);
                                i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i10 = TLObject.FLAG_30;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i84;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                        i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i85 = p46Var.f;
                    if (z18) {
                        p46Var.f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) o46Var8).leftMargin + ((LinearLayout.LayoutParams) o46Var8).rightMargin + i85;
                    } else {
                        p46Var.f = Math.max(i85, childAt8.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) o46Var8).leftMargin + ((LinearLayout.LayoutParams) o46Var8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) o46Var8).height == -1;
                    int i86 = ((LinearLayout.LayoutParams) o46Var8).topMargin + ((LinearLayout.LayoutParams) o46Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i86;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i86 = measuredHeight4;
                    }
                    int max4 = Math.max(i77, i86);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) o46Var8).height == -1) {
                            z = true;
                            if (z23 && (baseline = childAt8.getBaseline()) != i8) {
                                i9 = ((LinearLayout.LayoutParams) o46Var8).gravity;
                                if (i9 < 0) {
                                    i9 = p46Var.e;
                                }
                                int i87 = (((i9 & nm7.w1) >> 4) & (-2)) >> 1;
                                iArr7[i87] = Math.max(iArr7[i87], baseline);
                                iArr8[i87] = Math.max(iArr8[i87], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i77 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (z23) {
                        i9 = ((LinearLayout.LayoutParams) o46Var8).gravity;
                        if (i9 < 0) {
                        }
                        int i872 = (((i9 & nm7.w1) >> 4) & (-2)) >> 1;
                        iArr7[i872] = Math.max(iArr7[i872], baseline);
                        iArr8[i872] = Math.max(iArr8[i872], measuredHeight4 - baseline);
                    }
                    z19 = z;
                    i77 = max4;
                }
                i83++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            p46Var.f = p46Var.getPaddingRight() + p46Var.getPaddingLeft() + p46Var.f;
            int i88 = iArr7[1];
            if (i88 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i88, iArr7[c3]))));
            }
            i6 = i77;
        } else {
            i6 = Math.max(i77, i78);
            if (z24 && mode3 != 1073741824) {
                for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                    View childAt9 = p46Var.getChildAt(i89);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((o46) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i63, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        p46Var.setMeasuredDimension(i3 | (i64 & i4), View.resolveSizeAndState(Math.max(p46Var.getPaddingBottom() + p46Var.getPaddingTop() + max3, p46Var.getSuggestedMinimumHeight()), i2, i64 << 16));
        if (z20) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(p46Var.getMeasuredHeight(), TLObject.FLAG_30);
            int i90 = i5;
            while (i90 < virtualChildCount2) {
                View childAt10 = p46Var.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    o46 o46Var9 = (o46) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) o46Var9).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) o46Var9).width;
                        ((LinearLayout.LayoutParams) o46Var9).width = childAt10.getMeasuredWidth();
                        p46Var.measureChildWithMargins(childAt10, i58, 0, makeMeasureSpec2, 0);
                        ((LinearLayout.LayoutParams) o46Var9).width = i91;
                    }
                }
                i90++;
                p46Var = this;
                i58 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.w) {
            return;
        }
        this.w = drawable;
        boolean z = false;
        if (drawable != null) {
            this.x = drawable.getIntrinsicWidth();
            this.y = drawable.getIntrinsicHeight();
        } else {
            this.x = 0;
            this.y = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.F = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & nm7.w1) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = (i3 & (-8388616)) | i2;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.n = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.E) {
            requestLayout();
        }
        this.E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & nm7.w1;
        int i3 = this.e;
        if ((i3 & nm7.w1) != i2) {
            this.e = (i3 & (-113)) | i2;
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
