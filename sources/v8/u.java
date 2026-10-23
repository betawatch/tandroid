package v8;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class u implements OnCompleteListener, Runnable {
    public static final a0 d = new a0(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public v b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        e.delete(this.a);
        d.removeCallbacks(this);
        v vVar = this.b;
        if (vVar != null) {
            Task task = this.c;
            int i10 = v.d;
            vVar.a(task);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.c = task;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.delete(this.a);
    }
}
