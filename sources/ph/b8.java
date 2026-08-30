package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kg.j c;

    public /* synthetic */ b8(kg.j jVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = jVar;
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
                    kg.j jVar = this.c;
                    if (i10 >= size) {
                        jVar.getClass();
                        c8 c8Var = (c8) jVar.n;
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        c8Var.a.setAllowDrawCursor(true);
                        r7 r7Var = c8Var.f;
                        if (r7Var != null) {
                            r7Var.run();
                        }
                        if (c8Var.H) {
                            c8Var.fullScroll(130);
                            c8Var.H = false;
                            break;
                        }
                    } else {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    kg.j jVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = jVar2.h;
                        c8 c8Var2 = (c8) jVar2.n;
                        arrayList3.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        c8Var2.a.setAllowDrawCursor(true);
                        r7 r7Var2 = c8Var2.f;
                        if (r7Var2 != null) {
                            r7Var2.run();
                        }
                        if (c8Var2.H) {
                            c8Var2.fullScroll(130);
                            c8Var2.H = false;
                            break;
                        }
                    } else {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
