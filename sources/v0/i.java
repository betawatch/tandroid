package v0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface i {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, h hVar);

    void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, h hVar);
}
