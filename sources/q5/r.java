package q5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends a7.a implements e {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
        this.b = i9;
        this.c = taskCompletionSource;
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.u.b(parcel);
        h0(bundle);
        return true;
    }

    @Override // q5.e
    public final void h0(Bundle bundle) {
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
