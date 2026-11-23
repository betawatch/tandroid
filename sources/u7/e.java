package u7;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.internal.h {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void N(Status status) {
        l8.a(status, this.b, this.c);
    }
}
