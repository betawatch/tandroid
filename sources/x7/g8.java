package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g8 implements SuccessContinuation, yh.d0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    @Override // yh.d0
    public void a(long j10) {
        ((org.telegram.ui.ActionBar.k2) this.b).presentFragment(un.ha(j10));
        ((yh.a0) this.c).dismiss();
    }

    @Override // yh.d0
    public void b() {
        yh.a0 a0Var = (yh.a0) this.c;
        a0Var.s1.d.f3.O(true);
        a0Var.r1.d.f3.O(true);
    }

    @Override // yh.d0
    public void close() {
        ((yh.a0) this.c).k1.E(0);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 2;
        switch (this.a) {
            case 1:
                ea.c cVar = (ea.c) obj;
                x9.n nVar = ((x9.k) this.c).e;
                if (cVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{x9.n.b(nVar), nVar.m.w((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((x9.n) this.c).e.Z(new pb.d(i10, this, (Boolean) obj));
        }
    }

    public /* synthetic */ g8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public g8() {
        this.a = 3;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public g8(x9.k kVar, Executor executor, String str) {
        this.a = 1;
        this.c = kVar;
        this.b = executor;
    }
}
