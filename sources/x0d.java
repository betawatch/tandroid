// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x0d extends dzc {
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0d(TaskCompletionSource taskCompletionSource) {
        super((byte) 0, false);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
