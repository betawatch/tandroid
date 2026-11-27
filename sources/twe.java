// default package

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class twe extends ebd {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ twe(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // ebd
    public final void U(Bundle bundle) {
        byte b = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        switch (b) {
            case 0:
                taskCompletionSource.setResult(bundle);
                break;
            case 1:
                taskCompletionSource.setResult(bundle);
                break;
            default:
                taskCompletionSource.setResult(bundle);
                break;
        }
    }
}
