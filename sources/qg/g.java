package qg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.Components.s20;
import vh.c4;
import vh.d0;
import vh.i6;
import vh.s6;
import vh.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context) {
        super(context);
        this.n = hVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        t6 t6Var = (t6) this.n;
        int i10 = 1;
        t6Var.H = true;
        ArrayList arrayList = t6Var.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((s20) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new s6(this, arrayList2, i10));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            s20 s20Var = (s20) arrayList2.get(i12);
            arrayList5.add(s20Var);
            arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        h hVar = (h) this.n;
        int i10 = 1;
        hVar.H = true;
        ArrayList arrayList = hVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((s20) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new f(this, arrayList2, i10));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                s20 s20Var = (s20) arrayList2.get(i12);
                arrayList5.add(s20Var);
                arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                removeView((View) arrayList2.get(i13));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            hVar.b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.a) {
            case 0:
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i11 >= arrayList.size()) {
                        while (true) {
                            ArrayList arrayList2 = this.e;
                            if (i10 >= arrayList2.size()) {
                                arrayList.clear();
                                arrayList2.clear();
                                break;
                            } else {
                                ((View) arrayList2.get(i10)).setScaleX(0.0f);
                                ((View) arrayList2.get(i10)).setScaleY(0.0f);
                                ((View) arrayList2.get(i10)).setAlpha(0.0f);
                                i10++;
                            }
                        }
                    } else {
                        ((View) arrayList.get(i11)).setScaleX(1.0f);
                        ((View) arrayList.get(i11)).setScaleY(1.0f);
                        ((View) arrayList.get(i11)).setAlpha(1.0f);
                        i11++;
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i13 >= arrayList3.size()) {
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i12 >= arrayList4.size()) {
                                arrayList3.clear();
                                arrayList4.clear();
                                break;
                            } else {
                                ((View) arrayList4.get(i12)).setScaleX(0.0f);
                                ((View) arrayList4.get(i12)).setScaleY(0.0f);
                                ((View) arrayList4.get(i12)).setAlpha(0.0f);
                                i12++;
                            }
                        }
                    } else {
                        ((View) arrayList3.get(i13)).setScaleX(1.0f);
                        ((View) arrayList3.get(i13)).setScaleY(1.0f);
                        ((View) arrayList3.get(i13)).setAlpha(1.0f);
                        i13++;
                    }
                }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                break;
            default:
                int childCount2 = getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = getChildAt(i15);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034a  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int y3;
        int i12;
        int i13;
        ?? r72;
        int i14;
        int i15;
        int i16;
        int i17;
        char c10;
        int y10;
        i6 i6Var;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        float f7;
        int i22 = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i22) {
            case 0:
                h hVar = (h) scrollView;
                n0 n0Var = hVar.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i10);
                int L = size - i0.L(28.0f);
                int L2 = i0.L(10.0f);
                int L3 = i0.L(10.0f);
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < childCount) {
                    View childAt = getChildAt(i23);
                    int i26 = childCount;
                    if (childAt instanceof s20) {
                        i14 = i23;
                        int i27 = i24;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i0.L(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i27 <= L) {
                            i15 = i27;
                        } else {
                            L2 = m5.C(4.0f, childAt.getMeasuredHeight(), L2);
                            i15 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i25 > L) {
                            L3 = m5.C(4.0f, childAt.getMeasuredHeight(), L3);
                            i25 = 0;
                        }
                        int L4 = i0.L(14.0f) + i15;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(i0.L(14.0f) + i25);
                                childAt.setTranslationY(L3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i16 = L;
                                    childAt.setTranslationX(L4);
                                    childAt.setTranslationY(L2);
                                } else {
                                    float f10 = L4;
                                    i16 = L;
                                    if (childAt.getTranslationX() != f10) {
                                        i17 = 1;
                                        c10 = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f10));
                                    } else {
                                        i17 = 1;
                                        c10 = 0;
                                    }
                                    float f11 = L2;
                                    if (childAt.getTranslationY() != f11) {
                                        float[] fArr = new float[i17];
                                        fArr[c10] = f11;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (!contains) {
                                    i15 = m5.C(6.0f, childAt.getMeasuredWidth(), i15);
                                }
                                i25 = m5.C(6.0f, childAt.getMeasuredWidth(), i25);
                                i24 = i15;
                            }
                        }
                        i16 = L;
                        if (!contains) {
                        }
                        i25 = m5.C(6.0f, childAt.getMeasuredWidth(), i25);
                        i24 = i15;
                    } else {
                        i16 = L;
                        i14 = i23;
                    }
                    i23 = i14 + 1;
                    childCount = i26;
                    L = i16;
                }
                int i28 = L;
                int i29 = i24;
                if (i0.Q1()) {
                    y3 = i0.L(376.0f) / 3;
                } else {
                    Point point = i0.q;
                    y3 = z20.y(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i28 - i29 < y3) {
                    L2 += i0.L(36.0f);
                    i12 = 0;
                } else {
                    i12 = i29;
                }
                if (i28 - i25 < y3) {
                    L3 += i0.L(36.0f);
                }
                n0Var.measure(View.MeasureSpec.makeMeasureSpec(i28 - i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(28.0f), TLObject.FLAG_30));
                n0Var.t(n0Var.getMeasuredWidth() > hVar.c, true);
                if (!this.c) {
                    int L5 = i0.L(38.0f) + L3;
                    int L6 = i0.L(16.0f) + i12;
                    hVar.I = L2;
                    if (this.b != null) {
                        int L7 = i0.L(38.0f) + L2;
                        float f12 = hVar.J;
                        float f13 = L7;
                        if (f12 != f13) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f13);
                            ofFloat.addUpdateListener(new bg.k(hVar, 28));
                            arrayList.add(ofFloat);
                        }
                        float f14 = L6;
                        if (n0Var.getTranslationX() != f14) {
                            i13 = 1;
                            r72 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, f14));
                        } else {
                            i13 = 1;
                            r72 = 0;
                        }
                        float translationY = n0Var.getTranslationY();
                        float f15 = hVar.I;
                        if (translationY != f15) {
                            float[] fArr2 = new float[i13];
                            fArr2[r72] = f15;
                            arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property2, fArr2));
                        }
                        n0Var.setAllowDrawCursor(r72);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        hVar.J = L5;
                        n0Var.setTranslationX(L6);
                        n0Var.setTranslationY(hVar.I);
                    }
                } else if (this.b != null && !hVar.H && arrayList2.isEmpty()) {
                    n0Var.bringPointIntoView(n0Var.getSelectionStart());
                }
                setMeasuredDimension(size, (int) hVar.J);
                break;
            default:
                t6 t6Var = (t6) scrollView;
                i6 i6Var2 = t6Var.h;
                n0 n0Var2 = t6Var.b;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i10);
                int L8 = size2 - i0.L(14.0f);
                int L9 = i0.L(10.0f);
                int L10 = i0.L(10.0f);
                int i30 = L9;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    if (childAt2 instanceof s20) {
                        i6Var = i6Var2;
                        i18 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i0.L(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i32 <= L8) {
                            i19 = i32;
                        } else {
                            i30 = m5.C(4.0f, childAt2.getMeasuredHeight(), i30);
                            i19 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i33 > L8) {
                            z10 = contains2;
                            L10 = m5.C(4.0f, childAt2.getMeasuredHeight(), L10);
                            i20 = 0;
                        } else {
                            z10 = contains2;
                            i20 = i33;
                        }
                        int L11 = i0.L(7.0f) + i19;
                        i21 = L8;
                        if (!this.c) {
                            if (z10) {
                                childAt2.setTranslationX(i0.L(7.0f) + i20);
                                childAt2.setTranslationY(L10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(L11);
                                childAt2.setTranslationY(i30);
                            } else {
                                float f16 = L11;
                                if (childAt2.getTranslationX() != f16) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f16));
                                }
                                float f17 = i30;
                                if (childAt2.getTranslationY() != f17) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f17));
                                }
                            }
                        }
                        if (z10) {
                            f7 = 4.0f;
                        } else {
                            f7 = 4.0f;
                            i19 = m5.C(4.0f, childAt2.getMeasuredWidth(), i19);
                        }
                        i33 = m5.C(f7, childAt2.getMeasuredWidth(), i20);
                        i32 = i19;
                    } else {
                        i6Var = i6Var2;
                        i18 = childCount2;
                        i21 = L8;
                    }
                    i31++;
                    i6Var2 = i6Var;
                    childCount2 = i18;
                    L8 = i21;
                }
                i6 i6Var3 = i6Var2;
                int i34 = L8;
                if (i0.Q1()) {
                    y10 = i0.L(394.0f) / 3;
                } else {
                    Point point2 = i0.q;
                    y10 = z20.y(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i34 - i32 < y10) {
                    i30 += i0.L(36.0f);
                    i32 = 0;
                }
                if (i34 - i33 < y10) {
                    L10 += i0.L(36.0f);
                }
                n0Var2.measure(View.MeasureSpec.makeMeasureSpec(i34 - i32, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(28.0f), TLObject.FLAG_30));
                n0Var2.t(n0Var2.getMeasuredWidth() > t6Var.c, true);
                if (!this.c) {
                    int L12 = i0.L(38.0f) + L10;
                    int L13 = i0.L(16.0f) + i32;
                    t6Var.I = i30;
                    if (this.b != null) {
                        int L14 = i0.L(38.0f) + i30;
                        t6Var.K = L14;
                        float f18 = t6Var.J;
                        float f19 = L14;
                        if (f18 != f19) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, f19);
                            ofFloat2.addUpdateListener(new c4(5, t6Var));
                            arrayList.add(ofFloat2);
                        }
                        float f20 = L13;
                        if (n0Var2.getTranslationX() != f20) {
                            arrayList.add(ObjectAnimator.ofFloat(n0Var2, (Property<n0, Float>) property, f20));
                        }
                        float translationY2 = n0Var2.getTranslationY();
                        float f21 = t6Var.I;
                        if (translationY2 != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(n0Var2, (Property<n0, Float>) property2, f21));
                        }
                        n0Var2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (i6Var3 != null) {
                            i6Var3.run();
                        }
                    } else {
                        t6Var.K = L12;
                        t6Var.J = L12;
                        n0Var2.setTranslationX(L13);
                        n0Var2.setTranslationY(t6Var.I);
                        if (i6Var3 != null) {
                            i6Var3.run();
                        }
                        if (t6Var.L) {
                            post(new d0(this, 14));
                            t6Var.L = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!t6Var.H && arrayList2.isEmpty()) {
                        n0Var2.bringPointIntoView(n0Var2.getSelectionStart());
                    }
                    if (t6Var.L) {
                        t6Var.fullScroll(zs.O1);
                        t6Var.L = false;
                    }
                }
                setMeasuredDimension(size2, (int) t6Var.J);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t6 t6Var, Context context) {
        super(context);
        this.n = t6Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
