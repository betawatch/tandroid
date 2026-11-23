package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ym0 extends org.telegram.ui.Components.du0 {
    public int g0;
    public boolean h0;
    public int i0;
    public final /* synthetic */ cn0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(cn0 cn0Var, Context context) {
        super(context, null);
        this.j0 = cn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.yt ytVar;
        int measuredHeight;
        int measuredHeight2;
        int i19 = this.g0;
        int i20 = i11 - i7;
        cn0 cn0Var = this.j0;
        if (i19 != i20) {
            this.g0 = i20;
            l4 l4Var = cn0Var.M;
            if (l4Var != null) {
                l4Var.f();
            }
            org.telegram.ui.ActionBar.g1 g1Var = cn0Var.n0;
            if (g1Var != null && g1Var.isShowing()) {
                cn0Var.n0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (cn0Var.e0 == null || cn0Var.a0.getParent() != this || org.telegram.messenger.g0.L(20.0f) < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : cn0Var.e0.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.ls.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i23 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - emojiPadding) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        ytVar = cn0Var.e0;
                        if (ytVar != null && ytVar.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - emojiPadding) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    ytVar = cn0Var.e0;
                    if (ytVar != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (i20 - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i23 == 16) {
                }
                i18 = i16 - i17;
                ytVar = cn0Var.e0;
                if (ytVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.yt ytVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        cn0 cn0Var = this.j0;
        if (Q1) {
            cn0Var.h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                cn0Var.h0 = 4;
            } else {
                cn0Var.h0 = 3;
            }
        }
        this.h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / cn0Var.h0;
        cn0Var.S = L;
        if (this.i0 != L) {
            this.i0 = L;
            org.telegram.messenger.g0.g3(new hf0(this, 16));
        }
        if (cn0Var.Z) {
            cn0Var.N.y1(1);
        } else {
            cn0Var.N.y1(Math.max(1, ((cn0Var.h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (cn0Var.S * cn0Var.h0)));
        }
        this.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && cn0Var.e0 != null && cn0Var.a0.getParent() == this) {
            size4 -= cn0Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (ytVar = cn0Var.e0) != null) {
            this.h0 = true;
            ytVar.j();
            this.h0 = false;
        }
        org.telegram.ui.Components.yt ytVar2 = cn0Var.e0;
        if (ytVar2 != null && ytVar2.e) {
            cn0Var.fragmentView.setTranslationY(0.0f);
            cn0Var.L.setTranslationY(0.0f);
            cn0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.yt ytVar3 = cn0Var.e0;
                if (ytVar3 == null || !ytVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (i11 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
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
