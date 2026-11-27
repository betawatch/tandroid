// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class q5d extends u3d implements IInterface {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5d(byte b) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", (byte) 1);
        this.b = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 1);
                break;
            default:
                break;
        }
    }

    public void T(Status status, wg7 wg7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(t7d t7dVar);

    public void V(Status status, yg7 yg7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // u3d
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) v6d.a(parcel, Status.CREATOR);
                    wg7 wg7Var = (wg7) v6d.a(parcel, wg7.CREATOR);
                    v6d.d(parcel);
                    T(status, wg7Var);
                    break;
                } else if (i == 2) {
                    Status status2 = (Status) v6d.a(parcel, Status.CREATOR);
                    yg7 yg7Var = (yg7) v6d.a(parcel, yg7.CREATOR);
                    v6d.d(parcel);
                    V(status2, yg7Var);
                    break;
                } else {
                    if (i == 3) {
                        v6d.d(parcel);
                        p3d.a();
                    } else if (i == 4) {
                        v6d.d(parcel);
                        p3d.a();
                    }
                    break;
                }
            default:
                switch (i) {
                    case 3:
                        v6d.d(parcel);
                        break;
                    case 4:
                        v6d.d(parcel);
                        break;
                    case 6:
                        v6d.d(parcel);
                        break;
                    case 7:
                        v6d.d(parcel);
                        break;
                    case 8:
                        t7d t7dVar = (t7d) v6d.a(parcel, t7d.CREATOR);
                        v6d.d(parcel);
                        U(t7dVar);
                        break;
                    case 9:
                        v6d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
