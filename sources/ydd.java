// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ydd {
    public static Task a(BasePendingResult basePendingResult, e58 e58Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new i5d(basePendingResult, taskCompletionSource, e58Var));
        return taskCompletionSource.getTask();
    }
}
