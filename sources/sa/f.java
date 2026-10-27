package sa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // sa.i
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // sa.i
    public final boolean b(ta.a aVar) {
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
