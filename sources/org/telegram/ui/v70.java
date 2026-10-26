package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v70 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.x30 d;
    public int e;
    public final /* synthetic */ w70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(w70 w70Var, Context context) {
        super(context);
        this.f = w70Var;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.x30 x30Var) {
        w70 w70Var = this.f;
        w70Var.y.remove(x30Var.getKey());
        w70Var.E.remove(x30Var);
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ll0(8, this, x30Var));
        this.a.setInterpolator(org.telegram.ui.Components.ds.h);
        this.a.setDuration(320L);
        this.d = x30Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.x30, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.x30, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.x30, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(8.0f);
        int i13 = size - (dp * 2);
        int i14 = dp;
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.x30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                if (childAt != this.d && childAt.getMeasuredWidth() + i18 > i13) {
                    i15 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > i13) {
                    i14 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int i20 = dp + i18;
                if (!this.b) {
                    org.telegram.ui.Components.x30 x30Var = this.d;
                    if (childAt == x30Var) {
                        childAt.setTranslationX(dp + i19);
                        childAt.setTranslationY(i14);
                    } else if (x30Var != null) {
                        float f7 = i20;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = i15;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i20);
                        childAt.setTranslationY(i15);
                    }
                }
                if (childAt != this.d) {
                    int D = org.telegram.messenger.t.D(6.0f, childAt.getMeasuredWidth(), i18);
                    i17 = Math.max(i17, i15);
                    i18 = D;
                }
                i19 = org.telegram.messenger.t.D(6.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        int D2 = org.telegram.messenger.t.D(28.0f, i17, dp);
        if (!this.b) {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                this.e = D2;
                animatorSet.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.e = Math.max(D2, AndroidUtilities.dp(28.0f) + i14 + dp);
            }
        }
        w70 w70Var = this.f;
        w70Var.a.a(w70Var.E.isEmpty() ? 0.0f : Math.min(D2, w70Var.w));
        setMeasuredDimension(size, this.e);
    }
}
