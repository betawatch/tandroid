package va;

import a8.p0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final TaskCompletionSource b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.a = jVar;
        this.b = taskCompletionSource;
    }

    @Override // va.i
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // va.i
    public final boolean b(wa.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j3 = bVar.e;
        long j10 = bVar.f;
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            this.b.setResult(new a(j3, str, j10));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }
}
