package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.tj0 {
    public final ArrayList f3;
    public final org.telegram.ui.Components.u5 g3;
    public final org.telegram.ui.Components.u5 h3;
    public final k4.j i3;
    public final /* synthetic */ vf0 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(vf0 vf0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.j3 = vf0Var;
        this.f3 = new ArrayList(10);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.g3 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.h3 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.i3 = new k4.j(24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a6, code lost:
    
        if (r2.d.size() != 1) goto L169;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.ui currentMessagesGroup;
        int i10;
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ui currentMessagesGroup2;
        ArrayList arrayList4;
        org.telegram.messenger.ui uiVar;
        rf0 rf0Var;
        ArrayList arrayList5;
        vf0 vf0Var;
        int i11;
        rf0 rf0Var2;
        org.telegram.messenger.ui currentMessagesGroup3;
        org.telegram.messenger.ui currentMessagesGroup4;
        vf0 vf0Var2 = this.j3;
        qf0 qf0Var = vf0Var2.G;
        int measuredHeight = qf0Var.getMeasuredHeight();
        rf0 rf0Var3 = vf0Var2.K;
        int childCount = rf0Var3.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = rf0Var3.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                RectF rectF = kh.k.h;
                kh.k.c(q1Var2, qf0Var, rectF);
                float f11 = rectF.top;
                int i13 = (int) f11;
                childAt.getMeasuredHeight();
                int i14 = i13 >= 0 ? 0 : -i13;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i14 + measuredHeight;
                }
                q1Var2.y3(i14, measuredHeight2 - i14, measuredHeight, f11, f11, qf0Var.getMeasuredWidth(), qf0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, org.telegram.messenger.hs.e4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        org.telegram.messenger.ui uiVar2 = null;
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != uiVar2)) {
                uiVar2 = currentMessagesGroup4;
            }
        }
        int i16 = 0;
        while (true) {
            arrayList = this.f3;
            int i17 = 2;
            i3 = 3;
            if (i16 >= 3) {
                break;
            }
            arrayList.clear();
            if (i16 != 2 || rf0Var3.W1) {
                int i18 = z10 ? 1 : 0;
                ?? r9 = z10;
                while (i18 < childCount2) {
                    View childAt3 = rf0Var3.getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= rf0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ti tiVar = currentMessagesGroup3.m;
                            if ((i16 != 0 || currentMessagesGroup3.d.size() != z11) && ((i16 != z11 || tiVar.i) && ((i16 != 0 || !q1Var3.getMessageObject().Z) && ((i16 != z11 || q1Var3.getMessageObject().Z) && ((i16 != i17 || q1Var3.ya) && (i16 == i17 || !q1Var3.ya)))))) {
                                if (!arrayList.contains(currentMessagesGroup3)) {
                                    tiVar.a = r9;
                                    tiVar.b = r9;
                                    tiVar.c = r9;
                                    tiVar.d = r9;
                                    tiVar.l = r9;
                                    tiVar.k = r9;
                                    tiVar.m = q1Var3;
                                    arrayList.add(currentMessagesGroup3);
                                }
                                tiVar.k = q1Var3.H2();
                                tiVar.l = q1Var3.G2();
                                int x10 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableLeft());
                                int x11 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableRight());
                                int y9 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableTop());
                                int y10 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableBottom());
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    y9 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    y10 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (q1Var3.ya) {
                                    tiVar.m = q1Var3;
                                }
                                int i19 = tiVar.b;
                                if (i19 == 0 || y9 < i19) {
                                    tiVar.b = y9;
                                }
                                int i20 = tiVar.d;
                                if (i20 == 0 || y10 > i20) {
                                    tiVar.d = y10;
                                }
                                int i21 = tiVar.a;
                                if (i21 == 0 || x10 < i21) {
                                    tiVar.a = x10;
                                }
                                int i22 = tiVar.c;
                                if (i22 == 0 || x11 > i22) {
                                    tiVar.c = x11;
                                }
                            }
                        }
                    }
                    i18++;
                    i17 = 2;
                    r9 = 0;
                }
                int i23 = 0;
                ArrayList arrayList6 = arrayList;
                while (i23 < arrayList6.size()) {
                    org.telegram.messenger.ui uiVar3 = (org.telegram.messenger.ui) arrayList6.get(i23);
                    if (uiVar3 == null) {
                        arrayList5 = arrayList6;
                        rf0Var2 = rf0Var3;
                        vf0Var = vf0Var2;
                        i11 = i23;
                    } else {
                        org.telegram.messenger.ti tiVar2 = uiVar3.m;
                        float R1 = tiVar2.m.R1(z11);
                        float f12 = tiVar2.a + R1 + tiVar2.e;
                        float f13 = tiVar2.b + tiVar2.f;
                        float f14 = tiVar2.g + tiVar2.c + R1;
                        float f15 = tiVar2.d + tiVar2.h;
                        if (f13 < (-org.telegram.messenger.g0.L(20.0f))) {
                            f13 = -org.telegram.messenger.g0.L(20.0f);
                        }
                        if (f15 > org.telegram.messenger.g0.L(20.0f) + rf0Var3.getMeasuredHeight()) {
                            f15 = org.telegram.messenger.g0.L(20.0f) + rf0Var3.getMeasuredHeight();
                        }
                        boolean z12 = (tiVar2.m.getScaleX() == 1.0f && tiVar2.m.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            uiVar = uiVar3;
                            rf0Var = rf0Var3;
                            canvas2.scale(tiVar2.m.getScaleX(), tiVar2.m.getScaleY(), com.google.android.recaptcha.internal.a.z(f14, f12, 2.0f, f12), com.google.android.recaptcha.internal.a.z(f15, f13, 2.0f, f13));
                        } else {
                            arrayList4 = arrayList6;
                            uiVar = uiVar3;
                            rf0Var = rf0Var3;
                        }
                        float f16 = f13;
                        float f17 = f15;
                        arrayList5 = arrayList4;
                        vf0Var = vf0Var2;
                        org.telegram.messenger.ui uiVar4 = uiVar;
                        i11 = i23;
                        rf0Var2 = rf0Var;
                        tiVar2.m.K0(canvas2, (int) f12, (int) f13, (int) f14, (int) f15, tiVar2.k, tiVar2.l, false, 0);
                        tiVar2.m = null;
                        tiVar2.o = uiVar4.c;
                        if (z12) {
                            canvas.restore();
                            for (int i24 = 0; i24 < childCount2; i24++) {
                                View childAt4 = rf0Var2.getChildAt(i24);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (q1Var4.getCurrentMessagesGroup() == uiVar4) {
                                        int left = q1Var4.getLeft();
                                        int top = q1Var4.getTop();
                                        childAt4.setPivotX(((f14 - f12) / 2.0f) + (f12 - left));
                                        childAt4.setPivotY(((f17 - f16) / 2.0f) + (f16 - top));
                                    }
                                }
                            }
                        }
                    }
                    i23 = i11 + 1;
                    canvas2 = canvas;
                    rf0Var3 = rf0Var2;
                    vf0Var2 = vf0Var;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i16++;
            canvas2 = canvas;
            rf0Var3 = rf0Var3;
            vf0Var2 = vf0Var2;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList7 = arrayList;
        rf0 rf0Var4 = rf0Var3;
        vf0 vf0Var3 = vf0Var2;
        float f18 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        org.telegram.messenger.ui uiVar5 = null;
        int i25 = 0;
        while (i25 < childCount3) {
            View childAt5 = getChildAt(i25);
            if (!(childAt5 instanceof org.telegram.ui.Cells.q1) || ((currentMessagesGroup2 = (q1Var = (org.telegram.ui.Cells.q1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == uiVar5)) {
                i10 = i3;
                f10 = f18;
            } else {
                if (currentMessagesGroup2 == null) {
                    i10 = i3;
                    f10 = f18;
                    vf0Var3.i(canvas, q1Var.getBoundsLeft(), q1Var.getY(), q1Var.getBoundsRight(), q1Var.getY() + q1Var.getHeight());
                } else {
                    i10 = i3;
                    f10 = f18;
                }
                uiVar5 = currentMessagesGroup2;
            }
            i25++;
            i3 = i10;
            f18 = f10;
        }
        int i26 = i3;
        float f19 = f18;
        int i27 = 0;
        while (i27 < i26) {
            arrayList7.clear();
            if (i27 != 2 || rf0Var4.W1) {
                int i28 = 0;
                while (i28 < childCount3) {
                    View childAt6 = rf0Var4.getChildAt(i28);
                    if (childAt6 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt6;
                        if (childAt6.getY() <= rf0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f19 && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ti tiVar3 = currentMessagesGroup.m;
                            int i29 = i27 == 0 ? 1 : 1;
                            if ((i27 != i29 || tiVar3.i) && ((i27 != 0 || !q1Var5.getMessageObject().Z) && ((i27 != 1 || q1Var5.getMessageObject().Z) && ((i27 != 2 || q1Var5.ya) && (i27 == 2 || !q1Var5.ya))))) {
                                arrayList3 = arrayList7;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    tiVar3.a = 0;
                                    tiVar3.b = 0;
                                    tiVar3.c = 0;
                                    tiVar3.d = 0;
                                    tiVar3.l = false;
                                    tiVar3.k = false;
                                    tiVar3.m = q1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                tiVar3.k = q1Var5.H2();
                                tiVar3.l = q1Var5.G2();
                                int x12 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableRight());
                                int y11 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableTop());
                                int y12 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableBottom());
                                if ((q1Var5.getCurrentPosition().l & 4) == 0) {
                                    y11 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((q1Var5.getCurrentPosition().l & 8) == 0) {
                                    y12 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (q1Var5.ya) {
                                    tiVar3.m = q1Var5;
                                }
                                int i30 = tiVar3.b;
                                if (i30 == 0 || y11 < i30) {
                                    tiVar3.b = y11;
                                }
                                int i31 = tiVar3.d;
                                if (i31 == 0 || y12 > i31) {
                                    tiVar3.d = y12;
                                }
                                int i32 = tiVar3.a;
                                if (i32 == 0 || x12 < i32) {
                                    tiVar3.a = x12;
                                }
                                int i33 = tiVar3.c;
                                if (i33 == 0 || x13 > i33) {
                                    tiVar3.c = x13;
                                }
                                i28++;
                                arrayList7 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList7;
                    i28++;
                    arrayList7 = arrayList3;
                }
                arrayList2 = arrayList7;
                for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                    org.telegram.messenger.ti tiVar4 = ((org.telegram.messenger.ui) arrayList2.get(i34)).m;
                    float R12 = tiVar4.m.R1(true);
                    float f20 = tiVar4.e + tiVar4.a + R12;
                    float f21 = tiVar4.b + tiVar4.f;
                    float f22 = tiVar4.c + R12 + tiVar4.g;
                    float f23 = tiVar4.d + tiVar4.h;
                    if (f21 < (-org.telegram.messenger.g0.L(20.0f))) {
                        f21 = -org.telegram.messenger.g0.L(20.0f);
                    }
                    float f24 = f21;
                    if (f23 > org.telegram.messenger.g0.L(20.0f) + rf0Var4.getMeasuredHeight()) {
                        f23 = org.telegram.messenger.g0.L(20.0f) + rf0Var4.getMeasuredHeight();
                    }
                    float f25 = f23;
                    vf0 vf0Var4 = vf0Var3;
                    vf0Var4.i(canvas, f20, f24, f22, f25);
                    vf0Var3 = vf0Var4;
                    tiVar4.m = null;
                }
            } else {
                arrayList2 = arrayList7;
            }
            i27++;
            arrayList7 = arrayList2;
        }
        canvas.save();
        float d = this.g3.d(canScrollVertically(-1));
        float d10 = this.h3.d(canScrollVertically(1));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f19, getScrollY(), getWidth(), org.telegram.messenger.g0.L(14.0f) + getScrollY());
        k4.j jVar = this.i3;
        jVar.w(canvas, rectF2, 1, d);
        rectF2.set(f19, (getHeight() + getScrollY()) - org.telegram.messenger.g0.L(14.0f), getWidth(), getHeight() + getScrollY());
        jVar.w(canvas, rectF2, i26, d10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        vf0 vf0Var = this.j3;
        if (vf0Var.w && ((view == (q1Var = vf0Var.Q) && q1Var != null && q1Var.getCurrentPosition() == null) || view == vf0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            return true;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.setInvalidatesParent(true);
        q1Var2.S0(canvas);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.L0() && q1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, q1Var2.getPaddingTop());
            q1Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.B()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) {
            q1Var2.Q0(q1Var2.getAlpha(), canvas, false);
        }
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & 8) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) {
            q1Var2.o1(canvas, q1Var2.getAlpha(), null);
            q1Var2.V0(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() != null) {
            q1Var2.h1(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() == null || q1Var2.getCurrentPosition().h) {
            q1Var2.x1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.i1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof uf0)) {
                uf0 uf0Var = (uf0) childAt;
                uf0Var.kd = childAt.getTop();
                uf0Var.ld = childAt.getBottom();
                uf0Var.md = uf0Var.getMessageObject().f1();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        vf0 vf0Var = this.j3;
        int L = org.telegram.messenger.g0.L(vf0Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = vf0Var.Z;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - org.telegram.messenger.g0.L(8.0f)) - vf0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + (vf0Var.m0 ? vf0Var.Y : vf0Var.W.l()), -((org.telegram.messenger.g0.L(7.0f) + vf0Var.o0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L(8.0f)) + Math.max(0, vf0Var.O - ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L((vf0Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
