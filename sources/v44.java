// default package

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v44 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v44(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                        }
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    }
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }
}
