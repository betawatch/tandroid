package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ei.n9;
import java.util.ArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n9 c;

    public /* synthetic */ g(n9 n9Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = n9Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    n9 n9Var = this.c;
                    if (i10 >= size) {
                        n9Var.getClass();
                        n9Var.h.clear();
                        n9Var.b = null;
                        n9Var.c = false;
                        ((h) n9Var.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        n9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    n9 n9Var2 = this.c;
                    if (i11 >= size2) {
                        n9Var2.h.clear();
                        n9Var2.b = null;
                        n9Var2.c = false;
                        ((h) n9Var2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        n9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
