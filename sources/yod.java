// default package

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yod extends u3d {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yod(TaskCompletionSource taskCompletionSource, byte b) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", (byte) 8);
        this.b = b;
        switch (b) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", (byte) 8);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // u3d
    public final boolean e(Parcel parcel, int i) {
        byte b = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) ild.a(parcel, Status.CREATOR);
                    Location location = (Location) ild.a(parcel, Location.CREATOR);
                    ild.b(parcel);
                    vze.a(status, location, taskCompletionSource);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    pd6 pd6Var = (pd6) ild.a(parcel, pd6.CREATOR);
                    ild.b(parcel);
                    Status status2 = pd6Var.a;
                    od6 od6Var = new od6();
                    od6Var.a = pd6Var;
                    vze.a(status2, od6Var, taskCompletionSource);
                    break;
                }
                break;
        }
        return true;
    }
}
