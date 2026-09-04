package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vi0 extends org.telegram.ui.Components.ll0 {
    public final ArrayList X2;
    public final org.telegram.ui.Components.e6 Y2;
    public final org.telegram.ui.Components.e6 Z2;
    public final l20 a3;
    public final /* synthetic */ cj0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.b3 = cj0Var;
        this.X2 = new ArrayList(10);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.Y2 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.Z2 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.a3 = new l20();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b9, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v44 */
    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        cj0 cj0Var;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        vi0 vi0Var;
        vi0 vi0Var2;
        ArrayList arrayList5;
        cj0 cj0Var2;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        cj0 cj0Var3 = this.b3;
        ui0 ui0Var = cj0Var3.G;
        int measuredHeight = ui0Var.getMeasuredHeight();
        vi0 vi0Var3 = cj0Var3.K;
        int childCount = vi0Var3.getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vi0Var3.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                RectF rectF = ih.k.h;
                ih.k.c(t1Var2, ui0Var, rectF);
                float f7 = rectF.top;
                int i11 = (int) f7;
                childAt.getMeasuredHeight();
                int i12 = i11 >= 0 ? 0 : -i11;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                t1Var2.b4(i12, measuredHeight2 - i12, measuredHeight, f7, f7, ui0Var.getMeasuredWidth(), ui0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i14 = 0;
        while (true) {
            arrayList = this.X2;
            int i15 = 2;
            if (i14 >= 3) {
                break;
            }
            arrayList.clear();
            if (i14 != 2 || vi0Var3.X1) {
                int i16 = 0;
                ?? r92 = z10;
                while (i16 < childCount2) {
                    View childAt3 = vi0Var3.getChildAt(i16);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= vi0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = t1Var3.getCurrentMessagesGroup()) != null && ((i14 != 0 || currentMessagesGroup3.messages.size() != z11) && ((i14 != z11 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i14 != 0 || !t1Var3.getMessageObject().deleted) && ((i14 != z11 || t1Var3.getMessageObject().deleted) && ((i14 != i15 || t1Var3.oc) && (i14 == i15 || !t1Var3.oc))))))) {
                            if (!arrayList.contains(currentMessagesGroup3)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                transitionParams.left = r92;
                                transitionParams.top = r92;
                                transitionParams.right = r92;
                                transitionParams.bottom = r92;
                                transitionParams.pinnedBotton = r92;
                                transitionParams.pinnedTop = r92;
                                transitionParams.cell = t1Var3;
                                arrayList.add(currentMessagesGroup3);
                            }
                            currentMessagesGroup3.transitionParams.pinnedTop = t1Var3.n3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = t1Var3.m3();
                            int x10 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableLeft());
                            int x11 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableRight());
                            int y3 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableTop());
                            int y10 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableBottom());
                            if ((t1Var3.getCurrentPosition().flags & 4) == 0) {
                                y3 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                y10 += AndroidUtilities.dp(10.0f);
                            }
                            if (t1Var3.oc) {
                                currentMessagesGroup3.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i17 = transitionParams2.top;
                            if (i17 == 0 || y3 < i17) {
                                transitionParams2.top = y3;
                            }
                            int i18 = transitionParams2.bottom;
                            if (i18 == 0 || y10 > i18) {
                                transitionParams2.bottom = y10;
                            }
                            int i19 = transitionParams2.left;
                            if (i19 == 0 || x10 < i19) {
                                transitionParams2.left = x10;
                            }
                            int i20 = transitionParams2.right;
                            if (i20 == 0 || x11 > i20) {
                                transitionParams2.right = x11;
                            }
                            i16++;
                            i15 = 2;
                            r92 = 0;
                        }
                    }
                    i16++;
                    i15 = 2;
                    r92 = 0;
                }
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i21);
                    if (groupedMessages2 == null) {
                        arrayList5 = arrayList;
                        vi0Var2 = vi0Var3;
                        cj0Var2 = cj0Var3;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z11);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f10 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f11 = transitionParams3.top + transitionParams3.offsetTop;
                        float f12 = transitionParams3.offsetRight + transitionParams3.right + E2;
                        float f13 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f11 < (-AndroidUtilities.dp(20.0f))) {
                            f11 = -AndroidUtilities.dp(20.0f);
                        }
                        float f14 = f11;
                        if (f13 > AndroidUtilities.dp(20.0f) + vi0Var3.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + vi0Var3.getMeasuredHeight();
                        }
                        float f15 = f13;
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList;
                            vi0Var = vi0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                        } else {
                            arrayList4 = arrayList;
                            vi0Var = vi0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        vi0Var2 = vi0Var;
                        arrayList5 = arrayList4;
                        cj0Var2 = cj0Var3;
                        transitionParams4.cell.B1(canvas2, (int) f10, (int) f14, (int) f12, (int) f15, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                View childAt4 = vi0Var2.getChildAt(i22);
                                if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                    if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = t1Var4.getLeft();
                                        int top = t1Var4.getTop();
                                        childAt4.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                        childAt4.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                    }
                                }
                            }
                        }
                    }
                    i21++;
                    canvas2 = canvas;
                    vi0Var3 = vi0Var2;
                    cj0Var3 = cj0Var2;
                    arrayList = arrayList5;
                    z11 = true;
                }
            }
            i14++;
            canvas2 = canvas;
            vi0Var3 = vi0Var3;
            cj0Var3 = cj0Var3;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList6 = arrayList;
        vi0 vi0Var4 = vi0Var3;
        cj0 cj0Var4 = cj0Var3;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i23 = 0;
        while (i23 < childCount3) {
            View childAt5 = getChildAt(i23);
            if (!(childAt5 instanceof org.telegram.ui.Cells.t1) || ((currentMessagesGroup2 = (t1Var = (org.telegram.ui.Cells.t1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                cj0Var = cj0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = t1Var.getBoundsLeft();
                    float y11 = t1Var.getY();
                    float boundsRight = t1Var.getBoundsRight();
                    float y12 = t1Var.getY() + t1Var.getHeight();
                    cj0Var = cj0Var4;
                    cj0Var.j(canvas, boundsLeft, y11, boundsRight, y12);
                } else {
                    cj0Var = cj0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i23++;
            cj0Var4 = cj0Var;
        }
        cj0 cj0Var5 = cj0Var4;
        int i24 = 0;
        while (i24 < 3) {
            arrayList6.clear();
            if (i24 != 2 || vi0Var4.X1) {
                int i25 = 0;
                while (i25 < childCount3) {
                    View childAt6 = vi0Var4.getChildAt(i25);
                    if (childAt6 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) childAt6;
                        if (childAt6.getY() <= vi0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= 0.0f && (currentMessagesGroup = t1Var5.getCurrentMessagesGroup()) != null) {
                            int i26 = i24 == 0 ? 1 : 1;
                            if ((i24 != i26 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i24 != 0 || !t1Var5.getMessageObject().deleted) && ((i24 != 1 || t1Var5.getMessageObject().deleted) && ((i24 != 2 || t1Var5.oc) && (i24 == 2 || !t1Var5.oc))))) {
                                arrayList3 = arrayList6;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                    transitionParams6.left = 0;
                                    transitionParams6.top = 0;
                                    transitionParams6.right = 0;
                                    transitionParams6.bottom = 0;
                                    transitionParams6.pinnedBotton = false;
                                    transitionParams6.pinnedTop = false;
                                    transitionParams6.cell = t1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = t1Var5.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var5.m3();
                                int x12 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableRight());
                                int y13 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableTop());
                                int y14 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableBottom());
                                if ((t1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y13 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((t1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y14 += AndroidUtilities.dp(10.0f);
                                }
                                if (t1Var5.oc) {
                                    currentMessagesGroup.transitionParams.cell = t1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i27 = transitionParams7.top;
                                if (i27 == 0 || y13 < i27) {
                                    transitionParams7.top = y13;
                                }
                                int i28 = transitionParams7.bottom;
                                if (i28 == 0 || y14 > i28) {
                                    transitionParams7.bottom = y14;
                                }
                                int i29 = transitionParams7.left;
                                if (i29 == 0 || x12 < i29) {
                                    transitionParams7.left = x12;
                                }
                                int i30 = transitionParams7.right;
                                if (i30 == 0 || x13 > i30) {
                                    transitionParams7.right = x13;
                                }
                                i25++;
                                arrayList6 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList6;
                    i25++;
                    arrayList6 = arrayList3;
                }
                arrayList2 = arrayList6;
                for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i31);
                    float E22 = groupedMessages4.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f16 = transitionParams8.left + E22 + transitionParams8.offsetLeft;
                    float f17 = transitionParams8.top + transitionParams8.offsetTop;
                    float f18 = transitionParams8.right + E22 + transitionParams8.offsetRight;
                    float f19 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f17 < (-AndroidUtilities.dp(20.0f))) {
                        f17 = -AndroidUtilities.dp(20.0f);
                    }
                    if (f19 > AndroidUtilities.dp(20.0f) + vi0Var4.getMeasuredHeight()) {
                        f19 = AndroidUtilities.dp(20.0f) + vi0Var4.getMeasuredHeight();
                    }
                    cj0Var5.j(canvas, f16, f17, f18, f19);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList6;
            }
            i24++;
            arrayList6 = arrayList2;
        }
        canvas.save();
        float e7 = this.Y2.e(canScrollVertically(-1));
        float e10 = this.Z2.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        l20 l20Var = this.a3;
        l20Var.b(canvas, rectF2, 1, e7);
        rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        l20Var.b(canvas, rectF2, 3, e10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.t1 t1Var;
        cj0 cj0Var = this.b3;
        if (cj0Var.w && ((view == (t1Var = cj0Var.Q) && t1Var != null && t1Var.getCurrentPosition() == null) || view == cj0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            return true;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.setInvalidatesParent(true);
        t1Var2.K1(canvas);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.C1() && t1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, t1Var2.getPaddingTop());
            t1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY() + t1Var2.getPaddingTop());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.t0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.I1(t1Var2.getAlpha(), canvas, false);
        }
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & 8) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.d2(canvas, t1Var2.getAlpha(), null);
            t1Var2.N1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() != null) {
            t1Var2.W1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() == null || t1Var2.getCurrentPosition().last) {
            t1Var2.m2(t1Var2.getAlpha(), canvas, true);
        }
        t1Var2.X1(canvas);
        t1Var2.getTransitionParams().i();
        canvas.restore();
        t1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof bj0)) {
                bj0 bj0Var = (bj0) childAt;
                bj0Var.Fe = childAt.getTop();
                bj0Var.Ge = childAt.getBottom();
                bj0Var.He = bj0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        cj0 cj0Var = this.b3;
        int dp = AndroidUtilities.dp(cj0Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = cj0Var.Z;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - cj0Var.e.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (cj0Var.m0 ? cj0Var.Y : cj0Var.W.l()), -((AndroidUtilities.dp(7.0f) + cj0Var.o0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, cj0Var.O - ((getMeasuredWidth() - max) - AndroidUtilities.dp((cj0Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
