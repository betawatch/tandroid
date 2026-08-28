package v9;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements e, f {
    public final s8.d a;
    public final Context b;
    public final x9.b c;
    public final Set d;
    public final Executor e;

    public c(Context context, String str, Set set, x9.b bVar, Executor executor) {
        this.a = new s8.d(context, str);
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.a.get();
        if (!gVar.i(currentTimeMillis)) {
            return 1;
        }
        gVar.g();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? v.g(this.b) : true) {
            return Tasks.call(this.e, new b(this, 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? v.g(this.b) : true) {
            Tasks.call(this.e, new b(this, 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
