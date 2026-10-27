package p8;

import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c extends c8.b implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override // c8.b
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                l7.a.b(parcel);
                break;
            case 4:
                l7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                l7.a.b(parcel);
                break;
            case 7:
                l7.a.b(parcel);
                break;
            case 8:
                h hVar = (h) l7.a.a(parcel, h.CREATOR);
                l7.a.b(parcel);
                m(hVar);
                break;
            case 9:
                l7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
