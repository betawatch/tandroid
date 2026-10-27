package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import fi.j9;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j9 c;

    public /* synthetic */ h(j9 j9Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = j9Var;
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
                    j9 j9Var = this.c;
                    if (i10 >= size) {
                        j9Var.getClass();
                        j9Var.h.clear();
                        j9Var.b = null;
                        j9Var.c = false;
                        ((i) j9Var.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        j9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    j9 j9Var2 = this.c;
                    if (i11 >= size2) {
                        j9Var2.h.clear();
                        j9Var2.b = null;
                        j9Var2.c = false;
                        ((i) j9Var2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        j9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
