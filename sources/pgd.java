// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class pgd {
    public static Task a(BasePendingResult basePendingResult, s68 s68Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new x7d(basePendingResult, taskCompletionSource, s68Var));
        return taskCompletionSource.getTask();
    }
}
