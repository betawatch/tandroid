package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void H(Status status) {
        g5.a(status, this.b, this.c);
    }
}
