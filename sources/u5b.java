// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u5b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ gz9 c;

    public /* synthetic */ u5b(gz9 gz9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = gz9Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gz9 gz9Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    gz9Var.removeView((View) arrayList.get(i));
                }
                gz9Var.getClass();
                v5b v5bVar = (v5b) gz9Var.n;
                gz9Var.h.clear();
                gz9Var.b = null;
                gz9Var.c = false;
                v5bVar.b.setAllowDrawCursor(true);
                l5b l5bVar = v5bVar.h;
                if (l5bVar != null) {
                    l5bVar.run();
                }
                if (v5bVar.M) {
                    v5bVar.fullScroll(kk7.N1);
                    v5bVar.M = false;
                    break;
                }
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    gz9Var.removeView((View) arrayList.get(i2));
                }
                ArrayList arrayList2 = gz9Var.h;
                v5b v5bVar2 = (v5b) gz9Var.n;
                arrayList2.clear();
                gz9Var.b = null;
                gz9Var.c = false;
                v5bVar2.b.setAllowDrawCursor(true);
                l5b l5bVar2 = v5bVar2.h;
                if (l5bVar2 != null) {
                    l5bVar2.run();
                }
                if (v5bVar2.M) {
                    v5bVar2.fullScroll(kk7.N1);
                    v5bVar2.M = false;
                    break;
                }
                break;
        }
    }
}
