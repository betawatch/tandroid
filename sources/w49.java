// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w49 {
    public final r59 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public w49(r59 r59Var, boolean z) {
        this.a = r59Var;
        this.e = z;
        r59Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ((AnimatorSet) arrayList2.get(i2)).end();
                ((AnimatorSet) arrayList2.get(i2)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            r59 r59Var = this.a;
            if (i >= size) {
                arrayList3.clear();
                this.b.clear();
                r59Var.invalidate();
                this.d = true;
                return;
            }
            r59Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i));
            i++;
        }
    }

    public final void b(int i) {
        r59 r59Var = this.a;
        int childCount = r59Var.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = r59Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof tk4)) {
                view = childAt;
            }
        }
        f69 layoutManager = r59Var.getLayoutManager();
        if (view != null && layoutManager != null) {
            r59Var.removeView(view);
            this.c.add(view);
            r59Var.addView(view);
            layoutManager.L(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ic8(this, (tk4) view, layoutManager));
            ofFloat.start();
            i--;
        }
        m42 m42Var = new m42(this, (tk4) view, i, (byte) 3);
        this.h.add(m42Var);
        r59Var.getViewTreeObserver().addOnPreDrawListener(m42Var);
    }
}
