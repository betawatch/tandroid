package v0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface i {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, g gVar);

    void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, g gVar);
}
