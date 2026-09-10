package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bi.nb;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ nb c;

    public /* synthetic */ g(nb nbVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = nbVar;
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
                    nb nbVar = this.c;
                    if (i10 >= size) {
                        nbVar.getClass();
                        nbVar.h.clear();
                        nbVar.b = null;
                        nbVar.c = false;
                        ((h) nbVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        nbVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    nb nbVar2 = this.c;
                    if (i11 >= size2) {
                        nbVar2.h.clear();
                        nbVar2.b = null;
                        nbVar2.c = false;
                        ((h) nbVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        nbVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
