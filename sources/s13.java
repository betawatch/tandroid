// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public interface s13 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, i03 i03Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, si8 si8Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onGetCredential(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);

    void onPrepareCredential(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var);
}
