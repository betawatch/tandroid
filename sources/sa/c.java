package sa;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import u9.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c implements e, f {
    public final m a;
    public final Context b;
    public final ua.b c;
    public final Set d;
    public final Executor e;

    public c(Context context, String str, Set set, ua.b bVar, Executor executor) {
        this.a = new m(new o9.c(context, str));
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.a.get();
        if (!hVar.g(currentTimeMillis)) {
            return 1;
        }
        hVar.e();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? w.g(this.b) : true) {
            return Tasks.call(this.e, new b(this, 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? w.g(this.b) : true) {
            Tasks.call(this.e, new b(this, 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
