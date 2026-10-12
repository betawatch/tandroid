package u9;

import androidx.biometric.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h8.j;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import t7.u;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d implements w2.d, Continuation {
    public Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    public void a(e eVar) {
        j jVar = (j) this.a;
        jVar.a = eVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }

    public d(int i10) {
        switch (i10) {
            case 5:
                this.a = new CopyOnWriteArrayList();
                break;
            default:
                this.a = new u(28);
                break;
        }
    }
}
