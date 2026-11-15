package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xf0 extends org.telegram.ui.Components.uj0 {
    public final ArrayList f3;
    public final org.telegram.ui.Components.u5 g3;
    public final org.telegram.ui.Components.u5 h3;
    public final h6.m i3;
    public final /* synthetic */ bg0 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(bg0 bg0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.j3 = bg0Var;
        this.f3 = new ArrayList(10);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.g3 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.h3 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.i3 = new h6.m(29);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ab, code lost:
    
        if (r2.d.size() != 1) goto L169;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.bj currentMessagesGroup;
        int i10;
        float f10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.bj currentMessagesGroup2;
        ArrayList arrayList4;
        org.telegram.messenger.bj bjVar;
        xf0 xf0Var;
        xf0 xf0Var2;
        ArrayList arrayList5;
        bg0 bg0Var;
        int i11;
        org.telegram.messenger.bj currentMessagesGroup3;
        org.telegram.messenger.bj currentMessagesGroup4;
        bg0 bg0Var2 = this.j3;
        wf0 wf0Var = bg0Var2.G;
        int measuredHeight = wf0Var.getMeasuredHeight();
        xf0 xf0Var3 = bg0Var2.K;
        int childCount = xf0Var3.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = xf0Var3.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                RectF rectF = jh.k.h;
                jh.k.c(q1Var2, wf0Var, rectF);
                float f11 = rectF.top;
                int i13 = (int) f11;
                childAt.getMeasuredHeight();
                int i14 = i13 >= 0 ? 0 : -i13;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i14 + measuredHeight;
                }
                q1Var2.B3(i14, measuredHeight2 - i14, measuredHeight, f11, f11, wf0Var.getMeasuredWidth(), wf0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, org.telegram.messenger.ns.e4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        org.telegram.messenger.bj bjVar2 = null;
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != bjVar2)) {
                bjVar2 = currentMessagesGroup4;
            }
        }
        int i16 = 0;
        while (true) {
            arrayList = this.f3;
            int i17 = 2;
            i7 = 3;
            if (i16 >= 3) {
                break;
            }
            arrayList.clear();
            if (i16 != 2 || xf0Var3.W1) {
                int i18 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i18 < childCount2) {
                    View childAt3 = xf0Var3.getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= xf0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.aj ajVar = currentMessagesGroup3.m;
                            if ((i16 != 0 || currentMessagesGroup3.d.size() != z11) && ((i16 != z11 || ajVar.i) && ((i16 != 0 || !q1Var3.getMessageObject().Z) && ((i16 != z11 || q1Var3.getMessageObject().Z) && ((i16 != i17 || q1Var3.za) && (i16 == i17 || !q1Var3.za)))))) {
                                if (!arrayList.contains(currentMessagesGroup3)) {
                                    ajVar.a = r92;
                                    ajVar.b = r92;
                                    ajVar.c = r92;
                                    ajVar.d = r92;
                                    ajVar.l = r92;
                                    ajVar.k = r92;
                                    ajVar.m = q1Var3;
                                    arrayList.add(currentMessagesGroup3);
                                }
                                ajVar.k = q1Var3.J2();
                                ajVar.l = q1Var3.I2();
                                int x10 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableLeft());
                                int x11 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableRight());
                                int y10 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableTop());
                                int y11 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableBottom());
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    y10 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    y11 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (q1Var3.za) {
                                    ajVar.m = q1Var3;
                                }
                                int i19 = ajVar.b;
                                if (i19 == 0 || y10 < i19) {
                                    ajVar.b = y10;
                                }
                                int i20 = ajVar.d;
                                if (i20 == 0 || y11 > i20) {
                                    ajVar.d = y11;
                                }
                                int i21 = ajVar.a;
                                if (i21 == 0 || x10 < i21) {
                                    ajVar.a = x10;
                                }
                                int i22 = ajVar.c;
                                if (i22 == 0 || x11 > i22) {
                                    ajVar.c = x11;
                                }
                            }
                        }
                    }
                    i18++;
                    i17 = 2;
                    r92 = 0;
                }
                int i23 = 0;
                ArrayList arrayList6 = arrayList;
                while (i23 < arrayList6.size()) {
                    org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) arrayList6.get(i23);
                    if (bjVar3 == null) {
                        arrayList5 = arrayList6;
                        xf0Var2 = xf0Var3;
                        bg0Var = bg0Var2;
                        i11 = i23;
                    } else {
                        org.telegram.messenger.aj ajVar2 = bjVar3.m;
                        float S1 = ajVar2.m.S1(z11);
                        float f12 = ajVar2.a + S1 + ajVar2.e;
                        float f13 = ajVar2.b + ajVar2.f;
                        float f14 = ajVar2.g + ajVar2.c + S1;
                        float f15 = ajVar2.d + ajVar2.h;
                        if (f13 < (-org.telegram.messenger.g0.L(20.0f))) {
                            f13 = -org.telegram.messenger.g0.L(20.0f);
                        }
                        if (f15 > org.telegram.messenger.g0.L(20.0f) + xf0Var3.getMeasuredHeight()) {
                            f15 = org.telegram.messenger.g0.L(20.0f) + xf0Var3.getMeasuredHeight();
                        }
                        boolean z12 = (ajVar2.m.getScaleX() == 1.0f && ajVar2.m.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            bjVar = bjVar3;
                            xf0Var = xf0Var3;
                            canvas2.scale(ajVar2.m.getScaleX(), ajVar2.m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f14, f12, 2.0f, f12), com.google.android.gms.internal.vision.e2.A(f15, f13, 2.0f, f13));
                        } else {
                            arrayList4 = arrayList6;
                            bjVar = bjVar3;
                            xf0Var = xf0Var3;
                        }
                        float f16 = f13;
                        float f17 = f15;
                        xf0Var2 = xf0Var;
                        arrayList5 = arrayList4;
                        bg0Var = bg0Var2;
                        org.telegram.messenger.bj bjVar4 = bjVar;
                        i11 = i23;
                        ajVar2.m.K0(canvas, (int) f12, (int) f13, (int) f14, (int) f15, ajVar2.k, ajVar2.l, false, 0);
                        ajVar2.m = null;
                        ajVar2.o = bjVar4.c;
                        if (z12) {
                            canvas.restore();
                            for (int i24 = 0; i24 < childCount2; i24++) {
                                View childAt4 = xf0Var2.getChildAt(i24);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (q1Var4.getCurrentMessagesGroup() == bjVar4) {
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
                    xf0Var3 = xf0Var2;
                    bg0Var2 = bg0Var;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i16++;
            canvas2 = canvas;
            xf0Var3 = xf0Var3;
            bg0Var2 = bg0Var2;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList7 = arrayList;
        xf0 xf0Var4 = xf0Var3;
        bg0 bg0Var3 = bg0Var2;
        float f18 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        org.telegram.messenger.bj bjVar5 = null;
        int i25 = 0;
        while (i25 < childCount3) {
            View childAt5 = getChildAt(i25);
            if (!(childAt5 instanceof org.telegram.ui.Cells.q1) || ((currentMessagesGroup2 = (q1Var = (org.telegram.ui.Cells.q1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == bjVar5)) {
                i10 = i7;
                f10 = f18;
            } else {
                if (currentMessagesGroup2 == null) {
                    i10 = i7;
                    f10 = f18;
                    bg0Var3.j(q1Var.getBoundsLeft(), q1Var.getY(), q1Var.getBoundsRight(), q1Var.getY() + q1Var.getHeight(), canvas);
                } else {
                    i10 = i7;
                    f10 = f18;
                }
                bjVar5 = currentMessagesGroup2;
            }
            i25++;
            i7 = i10;
            f18 = f10;
        }
        int i26 = i7;
        float f19 = f18;
        int i27 = 0;
        while (i27 < i26) {
            arrayList7.clear();
            if (i27 != 2 || xf0Var4.W1) {
                int i28 = 0;
                while (i28 < childCount3) {
                    View childAt6 = xf0Var4.getChildAt(i28);
                    if (childAt6 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt6;
                        if (childAt6.getY() <= xf0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f19 && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.aj ajVar3 = currentMessagesGroup.m;
                            int i29 = i27 == 0 ? 1 : 1;
                            if ((i27 != i29 || ajVar3.i) && ((i27 != 0 || !q1Var5.getMessageObject().Z) && ((i27 != 1 || q1Var5.getMessageObject().Z) && ((i27 != 2 || q1Var5.za) && (i27 == 2 || !q1Var5.za))))) {
                                arrayList3 = arrayList7;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    ajVar3.a = 0;
                                    ajVar3.b = 0;
                                    ajVar3.c = 0;
                                    ajVar3.d = 0;
                                    ajVar3.l = false;
                                    ajVar3.k = false;
                                    ajVar3.m = q1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                ajVar3.k = q1Var5.J2();
                                ajVar3.l = q1Var5.I2();
                                int x12 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableRight());
                                int y12 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableTop());
                                int y13 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableBottom());
                                if ((q1Var5.getCurrentPosition().l & 4) == 0) {
                                    y12 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((q1Var5.getCurrentPosition().l & 8) == 0) {
                                    y13 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (q1Var5.za) {
                                    ajVar3.m = q1Var5;
                                }
                                int i30 = ajVar3.b;
                                if (i30 == 0 || y12 < i30) {
                                    ajVar3.b = y12;
                                }
                                int i31 = ajVar3.d;
                                if (i31 == 0 || y13 > i31) {
                                    ajVar3.d = y13;
                                }
                                int i32 = ajVar3.a;
                                if (i32 == 0 || x12 < i32) {
                                    ajVar3.a = x12;
                                }
                                int i33 = ajVar3.c;
                                if (i33 == 0 || x13 > i33) {
                                    ajVar3.c = x13;
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
                    org.telegram.messenger.aj ajVar4 = ((org.telegram.messenger.bj) arrayList2.get(i34)).m;
                    float S12 = ajVar4.m.S1(true);
                    float f20 = ajVar4.a + S12 + ajVar4.e;
                    float f21 = ajVar4.b + ajVar4.f;
                    float f22 = ajVar4.c + S12 + ajVar4.g;
                    float f23 = ajVar4.d + ajVar4.h;
                    if (f21 < (-org.telegram.messenger.g0.L(20.0f))) {
                        f21 = -org.telegram.messenger.g0.L(20.0f);
                    }
                    if (f23 > org.telegram.messenger.g0.L(20.0f) + xf0Var4.getMeasuredHeight()) {
                        f23 = org.telegram.messenger.g0.L(20.0f) + xf0Var4.getMeasuredHeight();
                    }
                    float f24 = f23;
                    bg0 bg0Var4 = bg0Var3;
                    bg0Var4.j(f20, f21, f22, f24, canvas);
                    bg0Var3 = bg0Var4;
                    ajVar4.m = null;
                }
            } else {
                arrayList2 = arrayList7;
            }
            i27++;
            arrayList7 = arrayList2;
        }
        canvas.save();
        float d = this.g3.d(canScrollVertically(-1));
        float d2 = this.h3.d(canScrollVertically(1));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f19, getScrollY(), getWidth(), org.telegram.messenger.g0.L(14.0f) + getScrollY());
        h6.m mVar = this.i3;
        mVar.m(canvas, rectF2, 1, d);
        rectF2.set(f19, (getHeight() + getScrollY()) - org.telegram.messenger.g0.L(14.0f), getWidth(), getHeight() + getScrollY());
        mVar.m(canvas, rectF2, i26, d2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        bg0 bg0Var = this.j3;
        if (bg0Var.w && ((view == (q1Var = bg0Var.Q) && q1Var != null && q1Var.getCurrentPosition() == null) || view == bg0Var.X)) {
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
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.D()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) {
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
            q1Var2.y1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.i1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof ag0)) {
                ag0 ag0Var = (ag0) childAt;
                ag0Var.zd = childAt.getTop();
                ag0Var.Ad = childAt.getBottom();
                ag0Var.Bd = ag0Var.getMessageObject().e1();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        bg0 bg0Var = this.j3;
        int L = org.telegram.messenger.g0.L(bg0Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = bg0Var.Z;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - org.telegram.messenger.g0.L(8.0f)) - bg0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + (bg0Var.p0 ? bg0Var.Y : bg0Var.W.l()), -((org.telegram.messenger.g0.L(7.0f) + bg0Var.r0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L(8.0f)) + Math.max(0, bg0Var.O - ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L((bg0Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
