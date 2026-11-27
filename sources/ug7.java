// default package

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ug7 extends FutureTask {
    public final /* synthetic */ ox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug7(ox oxVar, tg7 tg7Var) {
        super(tg7Var);
        this.a = oxVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ox oxVar = this.a;
        AtomicBoolean atomicBoolean = oxVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            oxVar.b(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            oxVar.b(null);
        } catch (ExecutionException e2) {
            grb.j("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            grb.j("An error occurred while executing doInBackground()", th);
        }
    }
}
