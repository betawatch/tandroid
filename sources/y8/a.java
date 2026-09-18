package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw t8.b.k(parcel);
            case 3:
                throw t8.b.k(parcel);
            case 4:
                throw t8.b.k(parcel);
            case 5:
                throw t8.b.k(parcel);
            case 6:
                throw t8.b.k(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw t8.b.k(parcel);
            case 9:
                throw t8.b.k(parcel);
            case 10:
                throw t8.b.k(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw t8.b.k(parcel);
            case 13:
                throw t8.b.k(parcel);
            case 14:
                throw t8.b.k(parcel);
            case 15:
                throw t8.b.k(parcel);
            case 16:
                throw t8.b.k(parcel);
            case 17:
                throw t8.b.k(parcel);
            case 18:
                throw t8.b.k(parcel);
            case 19:
                throw t8.b.k(parcel);
            case 20:
                throw t8.b.k(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw t8.b.k(parcel);
            case 23:
                throw t8.b.k(parcel);
            case 26:
                throw t8.b.k(parcel);
            case 27:
                throw t8.b.k(parcel);
            case 28:
                throw t8.b.k(parcel);
            case 29:
                throw t8.b.k(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw t8.b.k(parcel);
            case 34:
                throw t8.b.k(parcel);
            case 35:
                throw t8.b.k(parcel);
            case 36:
                throw t8.b.k(parcel);
            case 37:
                throw t8.b.k(parcel);
            case 38:
                throw t8.b.k(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw t8.b.k(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw t8.b.k(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
