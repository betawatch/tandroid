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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wi0 extends org.telegram.ui.Components.qm0 {
    public final ArrayList V2;
    public final org.telegram.ui.Components.g6 W2;
    public final org.telegram.ui.Components.g6 X2;
    public final j20 Y2;
    public final /* synthetic */ dj0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.Z2 = dj0Var;
        this.V2 = new ArrayList(10);
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        this.W2 = new org.telegram.ui.Components.g6(this, 0L, 360L, hsVar);
        this.X2 = new org.telegram.ui.Components.g6(this, 0L, 360L, hsVar);
        this.Y2 = new j20();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03bf, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i11;
        float f7;
        dj0 dj0Var;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        wi0 wi0Var;
        wi0 wi0Var2;
        dj0 dj0Var2;
        ArrayList arrayList5;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        dj0 dj0Var3 = this.Z2;
        vi0 vi0Var = dj0Var3.G;
        int measuredHeight = vi0Var.getMeasuredHeight();
        wi0 wi0Var3 = dj0Var3.K;
        int childCount = wi0Var3.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = wi0Var3.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                RectF rectF = hh.j.h;
                hh.j.c(u1Var2, vi0Var, rectF);
                float f10 = rectF.top;
                int i13 = (int) f10;
                childAt.getMeasuredHeight();
                int i14 = i13 >= 0 ? 0 : -i13;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i14 + measuredHeight;
                }
                u1Var2.b4(i14, measuredHeight2 - i14, measuredHeight, f10, f10, vi0Var.getMeasuredWidth(), vi0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.u1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i16 = 0;
        while (true) {
            arrayList = this.V2;
            int i17 = 2;
            i10 = 3;
            if (i16 >= 3) {
                break;
            }
            arrayList.clear();
            if (i16 != 2 || wi0Var3.V1) {
                int i18 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i18 < childCount2) {
                    View childAt3 = wi0Var3.getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) childAt3;
                        if (childAt3.getY() <= wi0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = u1Var3.getCurrentMessagesGroup()) != null && ((i16 != 0 || currentMessagesGroup3.messages.size() != z11) && ((i16 != z11 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i16 != 0 || !u1Var3.getMessageObject().deleted) && ((i16 != z11 || u1Var3.getMessageObject().deleted) && ((i16 != i17 || u1Var3.oc) && (i16 == i17 || !u1Var3.oc))))))) {
                            if (!arrayList.contains(currentMessagesGroup3)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                transitionParams.left = r92;
                                transitionParams.top = r92;
                                transitionParams.right = r92;
                                transitionParams.bottom = r92;
                                transitionParams.pinnedBotton = r92;
                                transitionParams.pinnedTop = r92;
                                transitionParams.cell = u1Var3;
                                arrayList.add(currentMessagesGroup3);
                            }
                            currentMessagesGroup3.transitionParams.pinnedTop = u1Var3.n3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = u1Var3.m3();
                            int x10 = (int) (u1Var3.getX() + u1Var3.getBackgroundDrawableLeft());
                            int x11 = (int) (u1Var3.getX() + u1Var3.getBackgroundDrawableRight());
                            int y3 = (int) (u1Var3.getY() + u1Var3.getPaddingTop() + u1Var3.getBackgroundDrawableTop());
                            int y10 = (int) (u1Var3.getY() + u1Var3.getPaddingTop() + u1Var3.getBackgroundDrawableBottom());
                            if ((u1Var3.getCurrentPosition().flags & 4) == 0) {
                                y3 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((u1Var3.getCurrentPosition().flags & 8) == 0) {
                                y10 += AndroidUtilities.dp(10.0f);
                            }
                            if (u1Var3.oc) {
                                currentMessagesGroup3.transitionParams.cell = u1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i19 = transitionParams2.top;
                            if (i19 == 0 || y3 < i19) {
                                transitionParams2.top = y3;
                            }
                            int i20 = transitionParams2.bottom;
                            if (i20 == 0 || y10 > i20) {
                                transitionParams2.bottom = y10;
                            }
                            int i21 = transitionParams2.left;
                            if (i21 == 0 || x10 < i21) {
                                transitionParams2.left = x10;
                            }
                            int i22 = transitionParams2.right;
                            if (i22 == 0 || x11 > i22) {
                                transitionParams2.right = x11;
                            }
                            i18++;
                            i17 = 2;
                            r92 = 0;
                        }
                    }
                    i18++;
                    i17 = 2;
                    r92 = 0;
                }
                int i23 = 0;
                ArrayList arrayList6 = arrayList;
                while (i23 < arrayList6.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList6.get(i23);
                    if (groupedMessages2 == null) {
                        arrayList5 = arrayList6;
                        wi0Var2 = wi0Var3;
                        dj0Var2 = dj0Var3;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z11);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.offsetRight + transitionParams3.right + E2;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        float f15 = f12;
                        if (f14 > AndroidUtilities.dp(20.0f) + wi0Var3.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + wi0Var3.getMeasuredHeight();
                        }
                        float f16 = f14;
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            wi0Var = wi0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.z(f13, f11, 2.0f, f11), com.google.android.gms.internal.vision.e2.z(f16, f15, 2.0f, f15));
                        } else {
                            arrayList4 = arrayList6;
                            wi0Var = wi0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        wi0Var2 = wi0Var;
                        ArrayList arrayList7 = arrayList4;
                        dj0Var2 = dj0Var3;
                        arrayList5 = arrayList7;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f15, (int) f13, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i24 = 0; i24 < childCount2; i24++) {
                                View childAt4 = wi0Var2.getChildAt(i24);
                                if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                    org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt4;
                                    if (u1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = u1Var4.getLeft();
                                        int top = u1Var4.getTop();
                                        childAt4.setPivotX(((f13 - f11) / 2.0f) + (f11 - left));
                                        childAt4.setPivotY(((f16 - f15) / 2.0f) + (f15 - top));
                                    }
                                }
                            }
                        }
                    }
                    i23++;
                    canvas2 = canvas;
                    wi0Var3 = wi0Var2;
                    dj0Var3 = dj0Var2;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i16++;
            canvas2 = canvas;
            wi0Var3 = wi0Var3;
            dj0Var3 = dj0Var3;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList8 = arrayList;
        wi0 wi0Var4 = wi0Var3;
        dj0 dj0Var4 = dj0Var3;
        float f17 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i25 = 0;
        while (i25 < childCount3) {
            View childAt5 = getChildAt(i25);
            if (!(childAt5 instanceof org.telegram.ui.Cells.u1) || ((currentMessagesGroup2 = (u1Var = (org.telegram.ui.Cells.u1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                i11 = i10;
                f7 = f17;
                dj0Var = dj0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = u1Var.getBoundsLeft();
                    float y11 = u1Var.getY();
                    float boundsRight = u1Var.getBoundsRight();
                    float y12 = u1Var.getY() + u1Var.getHeight();
                    i11 = i10;
                    f7 = f17;
                    dj0Var = dj0Var4;
                    dj0Var.j(canvas, boundsLeft, y11, boundsRight, y12);
                } else {
                    i11 = i10;
                    f7 = f17;
                    dj0Var = dj0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i25++;
            dj0Var4 = dj0Var;
            i10 = i11;
            f17 = f7;
        }
        int i26 = i10;
        float f18 = f17;
        dj0 dj0Var5 = dj0Var4;
        int i27 = 0;
        while (i27 < i26) {
            arrayList8.clear();
            if (i27 != 2 || wi0Var4.V1) {
                int i28 = 0;
                while (i28 < childCount3) {
                    View childAt6 = wi0Var4.getChildAt(i28);
                    if (childAt6 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) childAt6;
                        if (childAt6.getY() <= wi0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f18 && (currentMessagesGroup = u1Var5.getCurrentMessagesGroup()) != null) {
                            int i29 = i27 == 0 ? 1 : 1;
                            if ((i27 != i29 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i27 != 0 || !u1Var5.getMessageObject().deleted) && ((i27 != 1 || u1Var5.getMessageObject().deleted) && ((i27 != 2 || u1Var5.oc) && (i27 == 2 || !u1Var5.oc))))) {
                                arrayList3 = arrayList8;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                    transitionParams6.left = 0;
                                    transitionParams6.top = 0;
                                    transitionParams6.right = 0;
                                    transitionParams6.bottom = 0;
                                    transitionParams6.pinnedBotton = false;
                                    transitionParams6.pinnedTop = false;
                                    transitionParams6.cell = u1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = u1Var5.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = u1Var5.m3();
                                int x12 = (int) (u1Var5.getX() + u1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (u1Var5.getX() + u1Var5.getBackgroundDrawableRight());
                                int y13 = (int) (u1Var5.getY() + u1Var5.getPaddingTop() + u1Var5.getBackgroundDrawableTop());
                                int y14 = (int) (u1Var5.getY() + u1Var5.getPaddingTop() + u1Var5.getBackgroundDrawableBottom());
                                if ((u1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y13 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((u1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y14 += AndroidUtilities.dp(10.0f);
                                }
                                if (u1Var5.oc) {
                                    currentMessagesGroup.transitionParams.cell = u1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i30 = transitionParams7.top;
                                if (i30 == 0 || y13 < i30) {
                                    transitionParams7.top = y13;
                                }
                                int i31 = transitionParams7.bottom;
                                if (i31 == 0 || y14 > i31) {
                                    transitionParams7.bottom = y14;
                                }
                                int i32 = transitionParams7.left;
                                if (i32 == 0 || x12 < i32) {
                                    transitionParams7.left = x12;
                                }
                                int i33 = transitionParams7.right;
                                if (i33 == 0 || x13 > i33) {
                                    transitionParams7.right = x13;
                                }
                                i28++;
                                arrayList8 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList8;
                    i28++;
                    arrayList8 = arrayList3;
                }
                arrayList2 = arrayList8;
                for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i34);
                    float E22 = groupedMessages4.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f19 = transitionParams8.left + E22 + transitionParams8.offsetLeft;
                    float f20 = transitionParams8.top + transitionParams8.offsetTop;
                    float f21 = transitionParams8.right + E22 + transitionParams8.offsetRight;
                    float f22 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f20 < (-AndroidUtilities.dp(20.0f))) {
                        f20 = -AndroidUtilities.dp(20.0f);
                    }
                    if (f22 > AndroidUtilities.dp(20.0f) + wi0Var4.getMeasuredHeight()) {
                        f22 = AndroidUtilities.dp(20.0f) + wi0Var4.getMeasuredHeight();
                    }
                    dj0Var5.j(canvas, f19, f20, f21, f22);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList8;
            }
            i27++;
            arrayList8 = arrayList2;
        }
        canvas.save();
        float e7 = this.W2.e(canScrollVertically(-1));
        float e10 = this.X2.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f18, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        j20 j20Var = this.Y2;
        j20Var.b(canvas, rectF2, 1, e7);
        rectF2.set(f18, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        j20Var.b(canvas, rectF2, i26, e10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.u1 u1Var;
        dj0 dj0Var = this.Z2;
        if (dj0Var.w && ((view == (u1Var = dj0Var.Q) && u1Var != null && u1Var.getCurrentPosition() == null) || view == dj0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            return true;
        }
        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
        u1Var2.setInvalidatesParent(true);
        u1Var2.K1(canvas);
        canvas.save();
        canvas.translate(u1Var2.getX(), u1Var2.getY());
        canvas.scale(u1Var2.getScaleX(), u1Var2.getScaleY(), u1Var2.getPivotX(), u1Var2.getPivotY());
        if (u1Var2.C1() && u1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, u1Var2.getPaddingTop());
            u1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(u1Var2.getX(), u1Var2.getY() + u1Var2.getPaddingTop());
        canvas.scale(u1Var2.getScaleX(), u1Var2.getScaleY(), u1Var2.getPivotX(), u1Var2.getPivotY());
        if (u1Var2.getCurrentPosition() != null && (((u1Var2.getCurrentPosition().flags & u1Var2.t0()) != 0 && (u1Var2.getCurrentPosition().flags & 1) != 0) || (u1Var2.getCurrentMessagesGroup() != null && u1Var2.getCurrentMessagesGroup().isDocuments))) {
            u1Var2.I1(u1Var2.getAlpha(), canvas, false);
        }
        if (u1Var2.getCurrentPosition() != null && (((u1Var2.getCurrentPosition().flags & 8) != 0 && (u1Var2.getCurrentPosition().flags & 1) != 0) || (u1Var2.getCurrentMessagesGroup() != null && u1Var2.getCurrentMessagesGroup().isDocuments))) {
            u1Var2.d2(canvas, u1Var2.getAlpha(), null);
            u1Var2.N1(canvas, u1Var2.getAlpha());
        }
        if (u1Var2.getCurrentPosition() != null) {
            u1Var2.W1(canvas, u1Var2.getAlpha());
        }
        if (u1Var2.getCurrentPosition() == null || u1Var2.getCurrentPosition().last) {
            u1Var2.m2(u1Var2.getAlpha(), canvas, true);
        }
        u1Var2.X1(canvas);
        u1Var2.getTransitionParams().i();
        canvas.restore();
        u1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof cj0)) {
                cj0 cj0Var = (cj0) childAt;
                cj0Var.Ge = childAt.getTop();
                cj0Var.He = childAt.getBottom();
                cj0Var.Ie = cj0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        dj0 dj0Var = this.Z2;
        int dp = AndroidUtilities.dp(dj0Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = dj0Var.Z;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - dj0Var.e.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (dj0Var.m0 ? dj0Var.Y : dj0Var.W.l()), -((AndroidUtilities.dp(7.0f) + dj0Var.o0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, dj0Var.O - ((getMeasuredWidth() - max) - AndroidUtilities.dp((dj0Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
