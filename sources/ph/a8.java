package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kg.j c;

    public /* synthetic */ a8(kg.j jVar, ArrayList arrayList, int i10) {
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
                        b8 b8Var = (b8) jVar.n;
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        b8Var.a.setAllowDrawCursor(true);
                        q7 q7Var = b8Var.f;
                        if (q7Var != null) {
                            q7Var.run();
                        }
                        if (b8Var.H) {
                            b8Var.fullScroll(130);
                            b8Var.H = false;
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
                        b8 b8Var2 = (b8) jVar2.n;
                        arrayList3.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        b8Var2.a.setAllowDrawCursor(true);
                        q7 q7Var2 = b8Var2.f;
                        if (q7Var2 != null) {
                            q7Var2.run();
                        }
                        if (b8Var2.H) {
                            b8Var2.fullScroll(130);
                            b8Var2.H = false;
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
