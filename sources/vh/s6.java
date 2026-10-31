package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ qg.g c;

    public /* synthetic */ s6(qg.g gVar, ArrayList arrayList, int i10) {
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
                    qg.g gVar = this.c;
                    if (i10 >= size) {
                        gVar.getClass();
                        t6 t6Var = (t6) gVar.n;
                        gVar.h.clear();
                        gVar.b = null;
                        gVar.c = false;
                        t6Var.b.setAllowDrawCursor(true);
                        i6 i6Var = t6Var.h;
                        if (i6Var != null) {
                            i6Var.run();
                        }
                        if (t6Var.L) {
                            t6Var.fullScroll(zs.O1);
                            t6Var.L = false;
                            break;
                        }
                    } else {
                        gVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    qg.g gVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = gVar2.h;
                        t6 t6Var2 = (t6) gVar2.n;
                        arrayList3.clear();
                        gVar2.b = null;
                        gVar2.c = false;
                        t6Var2.b.setAllowDrawCursor(true);
                        i6 i6Var2 = t6Var2.h;
                        if (i6Var2 != null) {
                            i6Var2.run();
                        }
                        if (t6Var2.L) {
                            t6Var2.fullScroll(zs.O1);
                            t6Var2.L = false;
                            break;
                        }
                    } else {
                        gVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
