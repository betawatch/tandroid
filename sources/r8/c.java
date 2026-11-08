package r8;

import a8.q;
import android.os.Parcel;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class c extends q implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 8);
    }

    @Override // a8.q
    public final boolean i1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 3:
                n7.a.d(parcel);
                break;
            case 4:
                n7.a.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                n7.a.d(parcel);
                break;
            case 7:
                n7.a.d(parcel);
                break;
            case 8:
                h hVar = (h) n7.a.a(parcel, h.CREATOR);
                n7.a.d(parcel);
                V0(hVar);
                break;
            case 9:
                n7.a.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
