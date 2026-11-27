// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uq4 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public zc5 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ vq4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq4(vq4 vq4Var, Context context) {
        super(context);
        this.r = vq4Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        int D;
        byte b;
        byte b2;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(26.0f);
        int L2 = hl.L(10.0f);
        int L3 = hl.L(10.0f);
        byte b3 = 0;
        if (!this.b) {
            this.n = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            arrayList = this.c;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt instanceof zc5) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    b2 = b3;
                } else {
                    b2 = b3;
                    if (childAt.getMeasuredWidth() + i4 > L) {
                        L2 = uh9.w(8.0f, childAt.getMeasuredHeight(), L2);
                        i4 = b2;
                    }
                }
                if (childAt.getMeasuredWidth() + i5 > L) {
                    L3 = uh9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i5 = b2;
                }
                int L4 = hl.L(13.0f) + i4;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(hl.L(13.0f) + i5);
                        childAt.setTranslationY(L3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.n = Math.max(this.n, L2);
                    } else {
                        float f = L4;
                        if (childAt.getTranslationX() != f) {
                            float[] fArr = new float[1];
                            fArr[b2] = f;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f2 = L2;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr2 = new float[1];
                            fArr2[b2] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, L2);
                    }
                }
                if (!contains) {
                    i4 = uh9.w(9.0f, childAt.getMeasuredWidth(), i4);
                }
                i5 = uh9.w(9.0f, childAt.getMeasuredWidth(), i5);
            } else {
                b2 = b3;
            }
            i3++;
            b3 = b2;
        }
        byte b4 = b3;
        if (hl.O1()) {
            D = hl.L(372.0f) / 3;
        } else {
            Point point = hl.q;
            D = ik8.D(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i4 < D) {
            L2 += hl.L(40.0f);
        }
        if (L - i5 < D) {
            L3 += hl.L(40.0f);
        }
        boolean z = this.b;
        vq4 vq4Var = this.r;
        if (z) {
            b = b4;
        } else {
            int L5 = hl.L(42.0f) + L3;
            vq4Var.n = L2;
            if (this.a != null) {
                this.h = hl.L(42.0f) + L2;
                this.a.playTogether(arrayList);
                b = b4;
                this.a.addListener(new tq4(this, b));
                this.f = jn7.f(vq4Var.a).p(null, this.f, true);
                this.a.start();
                this.b = true;
            } else {
                b = b4;
                this.h = L5;
            }
        }
        int i6 = this.n;
        vq4Var.e = i6 > 0 ? hl.L(40.0f) + i6 : b;
        setMeasuredDimension(size, this.h);
        sq4 sq4Var = vq4Var.f;
        if (sq4Var != null) {
            sq4Var.a(vq4Var.e);
        }
    }
}
