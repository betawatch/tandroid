package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                throw si.o0.j(parcel);
            case 3:
                throw si.o0.j(parcel);
            case 4:
                throw si.o0.j(parcel);
            case 5:
                throw si.o0.j(parcel);
            case 6:
                throw si.o0.j(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw si.o0.j(parcel);
            case 9:
                throw si.o0.j(parcel);
            case 10:
                throw si.o0.j(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw si.o0.j(parcel);
            case 13:
                throw si.o0.j(parcel);
            case 14:
                throw si.o0.j(parcel);
            case 15:
                throw si.o0.j(parcel);
            case 16:
                throw si.o0.j(parcel);
            case 17:
                throw si.o0.j(parcel);
            case 18:
                throw si.o0.j(parcel);
            case 19:
                throw si.o0.j(parcel);
            case 20:
                throw si.o0.j(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw si.o0.j(parcel);
            case 23:
                throw si.o0.j(parcel);
            case 26:
                throw si.o0.j(parcel);
            case 27:
                throw si.o0.j(parcel);
            case 28:
                throw si.o0.j(parcel);
            case 29:
                throw si.o0.j(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw si.o0.j(parcel);
            case 34:
                throw si.o0.j(parcel);
            case 35:
                throw si.o0.j(parcel);
            case 36:
                throw si.o0.j(parcel);
            case 37:
                throw si.o0.j(parcel);
            case 38:
                throw si.o0.j(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw si.o0.j(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw si.o0.j(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
