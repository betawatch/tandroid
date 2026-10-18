package s4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k c;

    public /* synthetic */ f(k kVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = kVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    k kVar = this.c;
                    if (i10 >= size) {
                        arrayList.clear();
                        kVar.u.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        j jVar = (j) obj;
                        kVar.C(jVar.a, jVar);
                        kVar.w.add(jVar);
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    k kVar2 = this.c;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        kVar2.v.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        i iVar = (i) obj2;
                        kVar2.B(iVar);
                        kVar2.x.add(iVar);
                    }
                }
            default:
                ArrayList arrayList3 = this.b;
                int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((b1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    k kVar3 = this.c;
                    if (size4 < 0) {
                        arrayList3.clear();
                        kVar3.t.remove(arrayList3);
                        break;
                    } else {
                        b1 b1Var = (b1) arrayList3.get(size4);
                        long b10 = (b1Var.b() - i12) * kVar3.D;
                        View view = b1Var.a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar3.y.add(b1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(kVar3.h()).setStartDelay(b10).setInterpolator(kVar3.h);
                        animate.setUpdateListener(new d(kVar3, b1Var, 1));
                        animate.setListener(new g(kVar3, b1Var, view, animate)).start();
                    }
                }
        }
    }
}
