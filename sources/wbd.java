// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wbd {
    public static Task a(BasePendingResult basePendingResult, c38 c38Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new g3d(basePendingResult, taskCompletionSource, c38Var));
        return taskCompletionSource.getTask();
    }
}
