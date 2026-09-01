package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ lg.j c;

    public /* synthetic */ z7(lg.j jVar, ArrayList arrayList, int i10) {
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
                    lg.j jVar = this.c;
                    if (i10 >= size) {
                        jVar.getClass();
                        a8 a8Var = (a8) jVar.n;
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        a8Var.a.setAllowDrawCursor(true);
                        p7 p7Var = a8Var.f;
                        if (p7Var != null) {
                            p7Var.run();
                        }
                        if (a8Var.H) {
                            a8Var.fullScroll(130);
                            a8Var.H = false;
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
                    lg.j jVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = jVar2.h;
                        a8 a8Var2 = (a8) jVar2.n;
                        arrayList3.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        a8Var2.a.setAllowDrawCursor(true);
                        p7 p7Var2 = a8Var2.f;
                        if (p7Var2 != null) {
                            p7Var2.run();
                        }
                        if (a8Var2.H) {
                            a8Var2.fullScroll(130);
                            a8Var2.H = false;
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
