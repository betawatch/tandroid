// default package

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xy2 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ yy2 b;

    public xy2(yy2 yy2Var, long j) {
        this.b = yy2Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        qu6.j(1, "fatal").putLong("timestamp", this.a);
        ((qf5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
