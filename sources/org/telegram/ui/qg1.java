package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qg1 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.w20 d;
    public org.telegram.ui.Components.w20 e;
    public final /* synthetic */ UsersSelectActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f = usersSelectActivity;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.w20 w20Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.K.add(w20Var);
        long uid = w20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.w++;
        }
        usersSelectActivity.J.k(w20Var, uid);
        fg.g gVar = usersSelectActivity.c;
        gVar.setHintVisible(false, TextUtils.isEmpty(gVar.getText()));
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a = animatorSet2;
            animatorSet2.addListener(new te1(this, 2));
            this.a.setDuration(150L);
            this.d = w20Var;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.w20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(w20Var);
    }

    public final void b(org.telegram.ui.Components.w20 w20Var) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.v = true;
        long uid = w20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.w--;
        }
        usersSelectActivity.J.l(uid);
        usersSelectActivity.K.remove(w20Var);
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.su0(14, this, w20Var));
        this.a.setDuration(150L);
        this.e = w20Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int y10;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.e && childAt.getMeasuredWidth() + i13 > dp) {
                    dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i13;
                if (!this.b) {
                    org.telegram.ui.Components.w20 w20Var = this.e;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.e) {
                    i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (AndroidUtilities.isTablet()) {
            y10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y10 = org.telegram.messenger.ll.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i13 < y10) {
            dp2 += AndroidUtilities.dp(40.0f);
            i13 = 0;
        }
        if (dp - i14 < y10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.c.measure(View.MeasureSpec.makeMeasureSpec(dp - i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        if (!this.b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i13;
            usersSelectActivity.M = dp2;
            if (this.a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f12 = dp6;
                if (usersSelectActivity.c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<fg.g, Float>) property2, f12));
                }
                float translationY = usersSelectActivity.c.getTranslationY();
                float f13 = usersSelectActivity.M;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<fg.g, Float>) property, f13));
                }
                usersSelectActivity.c.setAllowDrawCursor(false);
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                usersSelectActivity.y = dp5;
                usersSelectActivity.c.setTranslationX(dp6);
                usersSelectActivity.c.setTranslationY(usersSelectActivity.M);
            }
        } else if (this.a != null && !usersSelectActivity.v && this.e == null) {
            fg.g gVar = usersSelectActivity.c;
            gVar.bringPointIntoView(gVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.y);
    }
}
