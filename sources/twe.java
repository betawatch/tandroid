// default package

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
