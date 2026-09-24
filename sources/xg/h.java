package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.ba;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ba c;

    public /* synthetic */ h(ba baVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = baVar;
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
                    ba baVar = this.c;
                    if (i10 >= size) {
                        baVar.getClass();
                        baVar.h.clear();
                        baVar.b = null;
                        baVar.c = false;
                        ((i) baVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        baVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ba baVar2 = this.c;
                    if (i11 >= size2) {
                        baVar2.h.clear();
                        baVar2.b = null;
                        baVar2.c = false;
                        ((i) baVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        baVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
