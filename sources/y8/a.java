package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class a extends b8.b implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override // y8.f0
    public void D() {
        throw new UnsupportedOperationException();
    }

    @Override // b8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw r.c.j(parcel);
            case 3:
                throw r.c.j(parcel);
            case 4:
                throw r.c.j(parcel);
            case 5:
                throw r.c.j(parcel);
            case 6:
                throw r.c.j(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw r.c.j(parcel);
            case 9:
                throw r.c.j(parcel);
            case 10:
                throw r.c.j(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw r.c.j(parcel);
            case 13:
                throw r.c.j(parcel);
            case 14:
                throw r.c.j(parcel);
            case 15:
                throw r.c.j(parcel);
            case 16:
                throw r.c.j(parcel);
            case 17:
                throw r.c.j(parcel);
            case 18:
                throw r.c.j(parcel);
            case 19:
                throw r.c.j(parcel);
            case 20:
                throw r.c.j(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw r.c.j(parcel);
            case 23:
                throw r.c.j(parcel);
            case 26:
                throw r.c.j(parcel);
            case 27:
                throw r.c.j(parcel);
            case 28:
                throw r.c.j(parcel);
            case 29:
                throw r.c.j(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw r.c.j(parcel);
            case 34:
                throw r.c.j(parcel);
            case 35:
                throw r.c.j(parcel);
            case 36:
                throw r.c.j(parcel);
            case 37:
                throw r.c.j(parcel);
            case 38:
                throw r.c.j(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw r.c.j(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw r.c.j(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
