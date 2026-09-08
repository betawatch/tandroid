package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                throw w.f.h(parcel);
            case 3:
                throw w.f.h(parcel);
            case 4:
                throw w.f.h(parcel);
            case 5:
                throw w.f.h(parcel);
            case 6:
                throw w.f.h(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw w.f.h(parcel);
            case 9:
                throw w.f.h(parcel);
            case 10:
                throw w.f.h(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw w.f.h(parcel);
            case 13:
                throw w.f.h(parcel);
            case 14:
                throw w.f.h(parcel);
            case 15:
                throw w.f.h(parcel);
            case 16:
                throw w.f.h(parcel);
            case 17:
                throw w.f.h(parcel);
            case 18:
                throw w.f.h(parcel);
            case 19:
                throw w.f.h(parcel);
            case 20:
                throw w.f.h(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw w.f.h(parcel);
            case 23:
                throw w.f.h(parcel);
            case 26:
                throw w.f.h(parcel);
            case 27:
                throw w.f.h(parcel);
            case 28:
                throw w.f.h(parcel);
            case 29:
                throw w.f.h(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw w.f.h(parcel);
            case 34:
                throw w.f.h(parcel);
            case 35:
                throw w.f.h(parcel);
            case 36:
                throw w.f.h(parcel);
            case 37:
                throw w.f.h(parcel);
            case 38:
                throw w.f.h(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw w.f.h(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw w.f.h(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
