package za;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends Binder {
    public final z6.c a;

    public y(z6.c cVar) {
        this.a = cVar;
    }

    public final void a(z zVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = zVar.a;
        f fVar = (f) this.a.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.a.execute(new z9.o(fVar, intent, taskCompletionSource, 1));
        taskCompletionSource.getTask().addOnCompleteListener(new c3.b(3), new xg.c(zVar, 10));
    }
}
