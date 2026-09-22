package v0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public interface j {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, i iVar);

    void onGetCredential(Context context, o oVar, CancellationSignal cancellationSignal, Executor executor, i iVar);
}
