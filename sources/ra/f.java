package ra;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
