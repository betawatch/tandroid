package v8;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class v implements OnCompleteListener, Runnable {
    public static final c0 d = new c0(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public w b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        e.delete(this.a);
        d.removeCallbacks(this);
        w wVar = this.b;
        if (wVar != null) {
            Task task = this.c;
            int i10 = w.d;
            wVar.a(task);
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
