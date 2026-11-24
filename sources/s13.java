// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface s13 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, i03 i03Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, si8 si8Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onPrepareCredential(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);
}
