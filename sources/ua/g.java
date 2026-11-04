package ua;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements j {
    public final k a;
    public final TaskCompletionSource b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.a = kVar;
        this.b = taskCompletionSource;
    }

    @Override // ua.j
    public final boolean a(va.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j10 = bVar.e;
        long j11 = bVar.f;
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            this.b.setResult(new a(j10, str, j11));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    @Override // ua.j
    public final boolean b(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }
}
