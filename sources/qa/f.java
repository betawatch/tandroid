package qa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // qa.i
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // qa.i
    public final boolean b(ra.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new a(bVar.e, bVar.f, str));
        return true;
    }
}
