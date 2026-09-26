package x1;

import android.util.Log;
import c5.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.b(null);
        } catch (ExecutionException e7) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
