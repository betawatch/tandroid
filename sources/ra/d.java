package ra;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import t9.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements f, g {
    public final n a;
    public final Context b;
    public final ta.b c;
    public final Set d;
    public final Executor e;

    public d(Context context, String str, Set set, ta.b bVar, Executor executor) {
        this.a = new n(new n9.d(context, str));
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = (i) this.a.get();
        if (!iVar.g(currentTimeMillis)) {
            return 1;
        }
        iVar.e();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? x.g(this.b) : true) {
            return Tasks.call(this.e, new c(this, 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? x.g(this.b) : true) {
            Tasks.call(this.e, new c(this, 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
