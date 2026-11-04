package t7;

import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.internal.h {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void G(Status status) {
        y9.a(status, this.b, this.c);
    }
}
