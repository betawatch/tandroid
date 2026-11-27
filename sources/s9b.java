// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class s9b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ a3a c;

    public /* synthetic */ s9b(a3a a3aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = a3aVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a3a a3aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    a3aVar.removeView((View) arrayList.get(i));
                }
                a3aVar.getClass();
                t9b t9bVar = (t9b) a3aVar.n;
                a3aVar.h.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                t9bVar.b.setAllowDrawCursor(true);
                i9b i9bVar = t9bVar.h;
                if (i9bVar != null) {
                    i9bVar.run();
                }
                if (t9bVar.M) {
                    t9bVar.fullScroll(jn7.N1);
                    t9bVar.M = false;
                    break;
                }
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    a3aVar.removeView((View) arrayList.get(i2));
                }
                ArrayList arrayList2 = a3aVar.h;
                t9b t9bVar2 = (t9b) a3aVar.n;
                arrayList2.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                t9bVar2.b.setAllowDrawCursor(true);
                i9b i9bVar2 = t9bVar2.h;
                if (i9bVar2 != null) {
                    i9bVar2.run();
                }
                if (t9bVar2.M) {
                    t9bVar2.fullScroll(jn7.N1);
                    t9bVar2.M = false;
                    break;
                }
                break;
        }
    }
}
