package sa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
