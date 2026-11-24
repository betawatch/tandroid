// default package

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class rp5 {
    public static final hc a = new hc(1);

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static Task c(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        lt2 lt2Var = new lt2((Object) taskCompletionSource, (Object) new AtomicBoolean(false), (Object) cancellationTokenSource, (byte) 1);
        hc hcVar = a;
        task.continueWithTask(hcVar, lt2Var);
        task2.continueWithTask(hcVar, lt2Var);
        return taskCompletionSource.getTask();
    }

    public static void d(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void e(String str) {
        gp2 gp2Var = new gp2(tb4.y("lateinit property ", str, " has not been initialized"));
        d(gp2Var, rp5.class.getName());
        throw gp2Var;
    }
}
