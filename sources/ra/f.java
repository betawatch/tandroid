package ra;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // ra.i
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // ra.i
    public final boolean b(sa.a aVar) {
        if (aVar.b != 4 || this.a.a(aVar)) {
            return false;
        }
        String str = aVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new a(aVar.e, aVar.f, str));
        return true;
    }
}
