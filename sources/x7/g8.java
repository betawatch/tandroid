package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g8 implements SuccessContinuation, yh.c0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    @Override // yh.c0
    public void a(long j10) {
        ((org.telegram.ui.ActionBar.k2) this.b).presentFragment(un.ma(j10));
        ((yh.z) this.c).dismiss();
    }

    @Override // yh.c0
    public void b() {
        yh.z zVar = (yh.z) this.c;
        zVar.s1.d.f3.O(true);
        zVar.r1.d.f3.O(true);
    }

    @Override // yh.c0
    public void close() {
        ((yh.z) this.c).k1.E(0);
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
