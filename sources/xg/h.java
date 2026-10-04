package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ci.aa;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ aa c;

    public /* synthetic */ h(aa aaVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = aaVar;
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
                    aa aaVar = this.c;
                    if (i10 >= size) {
                        aaVar.getClass();
                        aaVar.h.clear();
                        aaVar.b = null;
                        aaVar.c = false;
                        ((i) aaVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.c;
                    if (i11 >= size2) {
                        aaVar2.h.clear();
                        aaVar2.b = null;
                        aaVar2.c = false;
                        ((i) aaVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
