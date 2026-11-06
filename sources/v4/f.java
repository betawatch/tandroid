package v4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k c;

    public /* synthetic */ f(k kVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = kVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    k kVar = this.c;
                    if (i7 >= size) {
                        arrayList.clear();
                        kVar.u.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i7);
                        i7++;
                        j jVar = (j) obj;
                        kVar.C(jVar.a, jVar);
                        kVar.w.add(jVar);
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    k kVar2 = this.c;
                    if (i10 >= size2) {
                        arrayList2.clear();
                        kVar2.v.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        i iVar = (i) obj2;
                        kVar2.B(iVar);
                        kVar2.x.add(iVar);
                    }
                }
            default:
                ArrayList arrayList3 = this.b;
                int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i11 = Math.min(i11, ((d1) arrayList3.get(size3)).b());
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
                        d1 d1Var = (d1) arrayList3.get(size4);
                        long b10 = (d1Var.b() - i11) * kVar3.D;
                        View view = d1Var.a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar3.y.add(d1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(kVar3.h()).setStartDelay(b10).setInterpolator(kVar3.h);
                        animate.setUpdateListener(new c(kVar3, d1Var, 1));
                        animate.setListener(new g(kVar3, d1Var, view, animate)).start();
                    }
                }
        }
    }
}
