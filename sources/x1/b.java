package x1;

import android.util.Log;
import c5.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends FutureTask {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, x xVar) {
        super(xVar);
        this.a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.a;
        AtomicBoolean atomicBoolean = aVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            aVar.b(obj);
        } catch (InterruptedException e7) {
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.b(null);
        } catch (ExecutionException e10) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
