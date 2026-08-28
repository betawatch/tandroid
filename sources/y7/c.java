package y7;

import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c extends a7.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 10);
    }

    @Override // a7.a
    public final boolean F0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 3:
                u6.a.b(parcel);
                break;
            case 4:
                u6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                u6.a.b(parcel);
                break;
            case 7:
                u6.a.b(parcel);
                break;
            case 8:
                h hVar = (h) u6.a.a(parcel, h.CREATOR);
                u6.a.b(parcel);
                s0(hVar);
                break;
            case 9:
                u6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
