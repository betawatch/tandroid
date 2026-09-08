package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.ea;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ea c;

    public /* synthetic */ h(ea eaVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = eaVar;
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
                    ea eaVar = this.c;
                    if (i10 >= size) {
                        eaVar.getClass();
                        eaVar.h.clear();
                        eaVar.b = null;
                        eaVar.c = false;
                        ((i) eaVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.c;
                    if (i11 >= size2) {
                        eaVar2.h.clear();
                        eaVar2.b = null;
                        eaVar2.c = false;
                        ((i) eaVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
