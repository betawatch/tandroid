// default package

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ur5 {
    public static final ic a = new ic(1);

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
        fu2 fu2Var = new fu2((Object) taskCompletionSource, (Object) new AtomicBoolean(false), (Object) cancellationTokenSource, (byte) 1);
        ic icVar = a;
        task.continueWithTask(icVar, fu2Var);
        task2.continueWithTask(icVar, fu2Var);
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
        zp2 zp2Var = new zp2(qd4.y("lateinit property ", str, " has not been initialized"));
        d(zp2Var, ur5.class.getName());
        throw zp2Var;
    }
}
