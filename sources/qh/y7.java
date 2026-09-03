package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ lg.j c;

    public /* synthetic */ y7(lg.j jVar, ArrayList arrayList, int i10) {
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
                        z7 z7Var = (z7) jVar.n;
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        z7Var.a.setAllowDrawCursor(true);
                        o7 o7Var = z7Var.f;
                        if (o7Var != null) {
                            o7Var.run();
                        }
                        if (z7Var.H) {
                            z7Var.fullScroll(130);
                            z7Var.H = false;
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
                        z7 z7Var2 = (z7) jVar2.n;
                        arrayList3.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        z7Var2.a.setAllowDrawCursor(true);
                        o7 o7Var2 = z7Var2.f;
                        if (o7Var2 != null) {
                            o7Var2.run();
                        }
                        if (z7Var2.H) {
                            z7Var2.fullScroll(130);
                            z7Var2.H = false;
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
