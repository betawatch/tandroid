// default package

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class w4d extends dzc implements IInterface {
    public w4d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(ede edeVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override // dzc
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw yjb.m(parcel);
            case 3:
                throw yjb.m(parcel);
            case 4:
                throw yjb.m(parcel);
            case 5:
                throw yjb.m(parcel);
            case 6:
                throw yjb.m(parcel);
            case 7:
                ede edeVar = (ede) bhd.a(parcel, ede.CREATOR);
                bhd.b(parcel);
                T(edeVar);
                break;
            case 8:
                throw yjb.m(parcel);
            case 9:
                throw yjb.m(parcel);
            case 10:
                throw yjb.m(parcel);
            case 11:
                bhd.b(parcel);
                U();
                break;
            case 12:
                throw yjb.m(parcel);
            case 13:
                throw yjb.m(parcel);
            case 14:
                throw yjb.m(parcel);
            case 15:
                throw yjb.m(parcel);
            case 16:
                throw yjb.m(parcel);
            case 17:
                throw yjb.m(parcel);
            case 18:
                throw yjb.m(parcel);
            case 19:
                throw yjb.m(parcel);
            case 20:
                throw yjb.m(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw yjb.m(parcel);
            case 23:
                throw yjb.m(parcel);
            case 26:
                throw yjb.m(parcel);
            case 27:
                throw yjb.m(parcel);
            case 28:
                throw yjb.m(parcel);
            case 29:
                throw yjb.m(parcel);
            case kk7.S /* 30 */:
                throw yjb.m(parcel);
            case 34:
                throw yjb.m(parcel);
            case 35:
                throw yjb.m(parcel);
            case 36:
                throw yjb.m(parcel);
            case 37:
                throw yjb.m(parcel);
            case 38:
                throw yjb.m(parcel);
            case 39:
                throw yjb.m(parcel);
            case 40:
                throw yjb.m(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
