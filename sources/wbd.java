// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wbd {
    public static Task a(BasePendingResult basePendingResult, c38 c38Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new g3d(basePendingResult, taskCompletionSource, c38Var));
        return taskCompletionSource.getTask();
    }
}
