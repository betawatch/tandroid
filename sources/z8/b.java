package z8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class b extends c8.b implements g0 {
    public b() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override // z8.g0
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw a.b(parcel);
            case 3:
                throw a.b(parcel);
            case 4:
                throw a.b(parcel);
            case 5:
                throw a.b(parcel);
            case 6:
                throw a.b(parcel);
            case 7:
                u0 u0Var = (u0) g8.a.a(parcel, u0.CREATOR);
                g8.a.b(parcel);
                N(u0Var);
                break;
            case 8:
                throw a.b(parcel);
            case 9:
                throw a.b(parcel);
            case 10:
                throw a.b(parcel);
            case 11:
                g8.a.b(parcel);
                A();
                break;
            case 12:
                throw a.b(parcel);
            case 13:
                throw a.b(parcel);
            case 14:
                throw a.b(parcel);
            case 15:
                throw a.b(parcel);
            case 16:
                throw a.b(parcel);
            case 17:
                throw a.b(parcel);
            case 18:
                throw a.b(parcel);
            case 19:
                throw a.b(parcel);
            case 20:
                throw a.b(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw a.b(parcel);
            case 23:
                throw a.b(parcel);
            case 26:
                throw a.b(parcel);
            case 27:
                throw a.b(parcel);
            case 28:
                throw a.b(parcel);
            case 29:
                throw a.b(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw a.b(parcel);
            case 34:
                throw a.b(parcel);
            case 35:
                throw a.b(parcel);
            case 36:
                throw a.b(parcel);
            case 37:
                throw a.b(parcel);
            case 38:
                throw a.b(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw a.b(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw a.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // z8.g0
    public void N(u0 u0Var) {
        throw new UnsupportedOperationException();
    }
}
