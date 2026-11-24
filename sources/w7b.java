// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w7b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ i1a c;

    public /* synthetic */ w7b(i1a i1aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = i1aVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i1a i1aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    i1aVar.removeView((View) arrayList.get(i));
                }
                i1aVar.getClass();
                x7b x7bVar = (x7b) i1aVar.n;
                i1aVar.h.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                x7bVar.b.setAllowDrawCursor(true);
                m7b m7bVar = x7bVar.h;
                if (m7bVar != null) {
                    m7bVar.run();
                }
                if (x7bVar.M) {
                    x7bVar.fullScroll(nm7.N1);
                    x7bVar.M = false;
                    break;
                }
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i1aVar.removeView((View) arrayList.get(i2));
                }
                ArrayList arrayList2 = i1aVar.h;
                x7b x7bVar2 = (x7b) i1aVar.n;
                arrayList2.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                x7bVar2.b.setAllowDrawCursor(true);
                m7b m7bVar2 = x7bVar2.h;
                if (m7bVar2 != null) {
                    m7bVar2.run();
                }
                if (x7bVar2.M) {
                    x7bVar2.fullScroll(nm7.N1);
                    x7bVar2.M = false;
                    break;
                }
                break;
        }
    }
}
