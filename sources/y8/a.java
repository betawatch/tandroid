package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                throw sc.v.k(parcel);
            case 3:
                throw sc.v.k(parcel);
            case 4:
                throw sc.v.k(parcel);
            case 5:
                throw sc.v.k(parcel);
            case 6:
                throw sc.v.k(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw sc.v.k(parcel);
            case 9:
                throw sc.v.k(parcel);
            case 10:
                throw sc.v.k(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw sc.v.k(parcel);
            case 13:
                throw sc.v.k(parcel);
            case 14:
                throw sc.v.k(parcel);
            case 15:
                throw sc.v.k(parcel);
            case 16:
                throw sc.v.k(parcel);
            case 17:
                throw sc.v.k(parcel);
            case 18:
                throw sc.v.k(parcel);
            case 19:
                throw sc.v.k(parcel);
            case 20:
                throw sc.v.k(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw sc.v.k(parcel);
            case 23:
                throw sc.v.k(parcel);
            case 26:
                throw sc.v.k(parcel);
            case 27:
                throw sc.v.k(parcel);
            case 28:
                throw sc.v.k(parcel);
            case 29:
                throw sc.v.k(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw sc.v.k(parcel);
            case 34:
                throw sc.v.k(parcel);
            case 35:
                throw sc.v.k(parcel);
            case 36:
                throw sc.v.k(parcel);
            case 37:
                throw sc.v.k(parcel);
            case 38:
                throw sc.v.k(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw sc.v.k(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw sc.v.k(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
