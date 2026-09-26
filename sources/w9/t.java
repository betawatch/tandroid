package w9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class t extends d {
    public final /* synthetic */ String a;
    public final /* synthetic */ ExecutorService b;

    public t(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = str;
        this.b = executorService;
    }

    @Override // w9.d
    public final void a() {
        String str = this.a;
        ExecutorService executorService = this.b;
        try {
            String concat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            String concat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat2, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String q6 = a4.a.q("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", q6, null);
            }
            executorService.shutdownNow();
        }
    }
}
