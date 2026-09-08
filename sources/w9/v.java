package w9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ v(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.b;
                if (!isSuccessful) {
                    if (task.getException() != null) {
                        taskCompletionSource.trySetException(task.getException());
                        break;
                    }
                } else {
                    taskCompletionSource.trySetResult(task.getResult());
                    break;
                }
                break;
            case 1:
                boolean isSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.b;
                if (!isSuccessful2) {
                    if (task.getException() != null) {
                        taskCompletionSource2.trySetException(task.getException());
                        break;
                    }
                } else {
                    taskCompletionSource2.trySetResult(task.getResult());
                    break;
                }
                break;
            default:
                boolean isSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.b;
                if (!isSuccessful3) {
                    if (task.getException() != null) {
                        taskCompletionSource3.setException(task.getException());
                        break;
                    }
                } else {
                    taskCompletionSource3.setResult(task.getResult());
                    break;
                }
                break;
        }
        return null;
    }
}
