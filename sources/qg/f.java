package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ g c;

    public /* synthetic */ f(g gVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = gVar;
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
                    g gVar = this.c;
                    if (i10 >= size) {
                        gVar.getClass();
                        gVar.h.clear();
                        gVar.b = null;
                        gVar.c = false;
                        ((h) gVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        gVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    g gVar2 = this.c;
                    if (i11 >= size2) {
                        gVar2.h.clear();
                        gVar2.b = null;
                        gVar2.c = false;
                        ((h) gVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        gVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
