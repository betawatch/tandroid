package r7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        f5.a(status, this.b, this.c);
    }
}
