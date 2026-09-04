package s4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j c;

    public /* synthetic */ e(j jVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = jVar;
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
                    j jVar = this.c;
                    if (i10 >= size) {
                        arrayList.clear();
                        jVar.u.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        i iVar = (i) obj;
                        jVar.C(iVar.a, iVar);
                        jVar.w.add(iVar);
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    j jVar2 = this.c;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        jVar2.v.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        h hVar = (h) obj2;
                        jVar2.B(hVar);
                        jVar2.x.add(hVar);
                    }
                }
            default:
                ArrayList arrayList3 = this.b;
                int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((c1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    j jVar3 = this.c;
                    if (size4 < 0) {
                        arrayList3.clear();
                        jVar3.t.remove(arrayList3);
                        break;
                    } else {
                        c1 c1Var = (c1) arrayList3.get(size4);
                        long b10 = (c1Var.b() - i12) * jVar3.D;
                        View view = c1Var.a;
                        ViewPropertyAnimator animate = view.animate();
                        jVar3.y.add(c1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(jVar3.h()).setStartDelay(b10).setInterpolator(jVar3.h);
                        animate.setUpdateListener(new c(jVar3, c1Var, 1));
                        animate.setListener(new f(jVar3, c1Var, view, animate)).start();
                    }
                }
        }
    }
}
