// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class z0d extends dzc implements IInterface {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0d(byte b) {
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

    public void T(Status status, me7 me7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(c3d c3dVar);

    public void V(Status status, oe7 oe7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // dzc
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) e2d.a(parcel, Status.CREATOR);
                    me7 me7Var = (me7) e2d.a(parcel, me7.CREATOR);
                    e2d.d(parcel);
                    T(status, me7Var);
                    break;
                } else if (i == 2) {
                    Status status2 = (Status) e2d.a(parcel, Status.CREATOR);
                    oe7 oe7Var = (oe7) e2d.a(parcel, oe7.CREATOR);
                    e2d.d(parcel);
                    V(status2, oe7Var);
                    break;
                } else {
                    if (i == 3) {
                        e2d.d(parcel);
                        fvc.b();
                    } else if (i == 4) {
                        e2d.d(parcel);
                        fvc.b();
                    }
                    break;
                }
            default:
                switch (i) {
                    case 3:
                        e2d.d(parcel);
                        break;
                    case 4:
                        e2d.d(parcel);
                        break;
                    case 6:
                        e2d.d(parcel);
                        break;
                    case 7:
                        e2d.d(parcel);
                        break;
                    case 8:
                        c3d c3dVar = (c3d) e2d.a(parcel, c3d.CREATOR);
                        e2d.d(parcel);
                        U(c3dVar);
                        break;
                    case 9:
                        e2d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
