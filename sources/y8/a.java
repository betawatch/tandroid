package y8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                throw v7.j0.i(parcel);
            case 3:
                throw v7.j0.i(parcel);
            case 4:
                throw v7.j0.i(parcel);
            case 5:
                throw v7.j0.i(parcel);
            case 6:
                throw v7.j0.i(parcel);
            case 7:
                t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                f8.a.b(parcel);
                q0(t0Var);
                break;
            case 8:
                throw v7.j0.i(parcel);
            case 9:
                throw v7.j0.i(parcel);
            case 10:
                throw v7.j0.i(parcel);
            case 11:
                f8.a.b(parcel);
                D();
                break;
            case 12:
                throw v7.j0.i(parcel);
            case 13:
                throw v7.j0.i(parcel);
            case 14:
                throw v7.j0.i(parcel);
            case 15:
                throw v7.j0.i(parcel);
            case 16:
                throw v7.j0.i(parcel);
            case 17:
                throw v7.j0.i(parcel);
            case 18:
                throw v7.j0.i(parcel);
            case 19:
                throw v7.j0.i(parcel);
            case 20:
                throw v7.j0.i(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw v7.j0.i(parcel);
            case 23:
                throw v7.j0.i(parcel);
            case 26:
                throw v7.j0.i(parcel);
            case 27:
                throw v7.j0.i(parcel);
            case 28:
                throw v7.j0.i(parcel);
            case 29:
                throw v7.j0.i(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw v7.j0.i(parcel);
            case 34:
                throw v7.j0.i(parcel);
            case 35:
                throw v7.j0.i(parcel);
            case 36:
                throw v7.j0.i(parcel);
            case 37:
                throw v7.j0.i(parcel);
            case 38:
                throw v7.j0.i(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw v7.j0.i(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw v7.j0.i(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.f0
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
