// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t8d extends u3d implements IInterface {
    public final /* synthetic */ byte b;
    public final /* synthetic */ w8d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8d(w8d w8dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = w8dVar;
    }

    @Override // u3d
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        w8d w8dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                n8d.b(parcel);
                p3d.a();
                return false;
            case jn7.m1 /* 102 */:
                Status status = (Status) n8d.a(parcel, Status.CREATOR);
                n8d.b(parcel);
                switch (b) {
                    case 0:
                        w8dVar.a(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case jn7.n1 /* 103 */:
                Status status2 = (Status) n8d.a(parcel, Status.CREATOR);
                n8d.b(parcel);
                switch (b) {
                    case 1:
                        w8dVar.a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
