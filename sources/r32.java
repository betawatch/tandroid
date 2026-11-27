// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r32 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r32(Object obj, tk4 tk4Var, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = tk4Var;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        byte b = this.a;
        int i2 = this.c;
        tk4 tk4Var = this.b;
        Object obj = this.d;
        int i3 = 2;
        switch (b) {
            case 0:
                t32 t32Var = (t32) obj;
                u32 u32Var = t32Var.Y;
                u32Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = u32Var.r.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (0; i < childCount; i + 1) {
                    View childAt = u32Var.r.getChildAt(i);
                    if (tk4Var != null) {
                        u32Var.r.getClass();
                        i = RecyclerView.S(childAt) < i2 ? i + 1 : 0;
                    }
                    childAt.setAlpha(0.0f);
                    int min = (int) ((Math.min(u32Var.r.getMeasuredHeight(), Math.max(0, childAt.getTop())) / u32Var.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay(min);
                    ofFloat.setDuration(200L);
                    animatorSet.playTogether(ofFloat);
                }
                animatorSet.addListener(new q32(this));
                t32Var.V.d();
                animatorSet.start();
                if (tk4Var != null && tk4Var.getParent() == null) {
                    u32Var.r.addView(tk4Var);
                    q79 layoutManager = u32Var.r.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(tk4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tk4Var, (Property<tk4, Float>) View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new q32(this, layoutManager));
                        ofFloat2.start();
                    }
                }
                return true;
            case 1:
                bg2 bg2Var = (bg2) obj;
                bg2Var.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = bg2Var.c.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = bg2Var.c.getChildAt(i4);
                    if (childAt2 != tk4Var) {
                        bg2Var.c.getClass();
                        if (RecyclerView.S(childAt2) >= i2) {
                            childAt2.setAlpha(0.0f);
                            int min2 = (int) ((Math.min(bg2Var.c.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / bg2Var.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat3.setStartDelay(min2);
                            ofFloat3.setDuration(200L);
                            animatorSet2.playTogether(ofFloat3);
                        }
                    }
                }
                if (tk4Var != null && tk4Var.getParent() == null) {
                    bg2Var.c.addView(tk4Var);
                    q79 layoutManager2 = bg2Var.c.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.L(tk4Var);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tk4Var, (Property<tk4, Float>) View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat4.addListener(new jb1(this, layoutManager2));
                        ofFloat4.start();
                    }
                }
                animatorSet2.start();
                return true;
            case 2:
                float f = 0.0f;
                yg4 yg4Var = (yg4) obj;
                yg4Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gu guVar = yg4Var.b;
                int childCount3 = guVar.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i5 = 0;
                while (i5 < childCount3) {
                    View childAt3 = guVar.getChildAt(i5);
                    if (tk4Var != null) {
                        guVar.getClass();
                        if (RecyclerView.S(childAt3) < i2) {
                            i5++;
                            f = 0.0f;
                        }
                    }
                    childAt3.setAlpha(f);
                    int min3 = (int) ((Math.min(guVar.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / guVar.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(childAt3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat5.setStartDelay(min3);
                    ofFloat5.setDuration(200L);
                    animatorSet3.playTogether(ofFloat5);
                    i5++;
                    f = 0.0f;
                }
                animatorSet3.addListener(new ng4(this));
                yg4Var.m0.d();
                animatorSet3.start();
                if (tk4Var != null && tk4Var.getParent() == null) {
                    guVar.addView(tk4Var);
                    q79 layoutManager3 = guVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.L(tk4Var);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tk4Var, (Property<tk4, Float>) View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat6.addListener(new ng4(this, layoutManager3));
                        ofFloat6.start();
                    }
                }
                return true;
            default:
                i69 i69Var = (i69) obj;
                SparseArray sparseArray = i69Var.b;
                d79 d79Var = i69Var.a;
                d79Var.getViewTreeObserver().removeOnPreDrawListener(this);
                i69Var.h.remove(this);
                int childCount4 = d79Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i6 = 0;
                while (i6 < childCount4) {
                    View childAt4 = d79Var.getChildAt(i6);
                    d79Var.getClass();
                    int S = RecyclerView.S(childAt4);
                    if (childAt4 != tk4Var && S >= i2 - 1 && sparseArray.get(S, null) == null) {
                        sparseArray.put(S, Float.valueOf(0.0f));
                        i69Var.d = true;
                        d79Var.invalidate();
                        float[] fArr = new float[i3];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr);
                        ofFloat7.addUpdateListener(new dx0(this, S, (byte) 3));
                        ofFloat7.addListener(new dn(this, S, (byte) 9));
                        ofFloat7.setStartDelay((int) ((Math.min(d79Var.getMeasuredHeight(), Math.max(0, childAt4.getTop())) / d79Var.getMeasuredHeight()) * 100.0f));
                        ofFloat7.setDuration(200L);
                        animatorSet4.playTogether(ofFloat7);
                    }
                    i6++;
                    i3 = 2;
                }
                i69Var.g.add(animatorSet4);
                animatorSet4.start();
                animatorSet4.addListener(new wd8(this, animatorSet4, (byte) 8));
                return false;
        }
    }
}
