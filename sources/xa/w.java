package xa;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import rh.l5;
import vh.e0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class w extends Binder {
    public final e0 a;

    public w(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(x xVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = xVar.a;
        f fVar = (f) this.a.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.a.execute(new l5(fVar, intent, taskCompletionSource, 21));
        taskCompletionSource.getTask().addOnCompleteListener(new a3.b(3), new wh.b(xVar, 6));
    }
}
