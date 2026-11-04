package q8;

import android.os.Parcel;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c extends o implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean I0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 3:
                m7.a.d(parcel);
                break;
            case 4:
                m7.a.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                m7.a.d(parcel);
                break;
            case 7:
                m7.a.d(parcel);
                break;
            case 8:
                h hVar = (h) m7.a.a(parcel, h.CREATOR);
                m7.a.d(parcel);
                Y(hVar);
                break;
            case 9:
                m7.a.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
