package v0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public interface i {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, g gVar);

    void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, g gVar);
}
