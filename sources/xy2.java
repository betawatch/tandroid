// default package

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
