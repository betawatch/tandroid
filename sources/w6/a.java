package w6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ TaskCompletionSource b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void z(Status status) {
        p5.a(status, null, this.b);
    }
}
