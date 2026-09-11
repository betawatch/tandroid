package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import di.ea;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
