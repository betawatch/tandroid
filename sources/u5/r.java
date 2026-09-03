package u5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r extends a7.c implements e {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.s.b(parcel);
        i0(bundle);
        return true;
    }

    @Override // u5.e
    public final void i0(Bundle bundle) {
        switch (this.b) {
            case 0:
                this.c.setResult(bundle);
                break;
            case 1:
                this.c.setResult(bundle);
                break;
            default:
                this.c.setResult(bundle);
                break;
        }
    }
}
