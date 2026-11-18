package y8;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class t implements OnCompleteListener, Runnable {
    public static final y d = new y(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public u b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        e.delete(this.a);
        d.removeCallbacks(this);
        u uVar = this.b;
        if (uVar != null) {
            Task task = this.c;
            int i7 = u.d;
            uVar.a(task);
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
