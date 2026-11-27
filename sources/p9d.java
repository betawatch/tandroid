// default package

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class p9d extends u3d implements IInterface {
    public p9d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(vhe vheVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw xnb.m(parcel);
            case 3:
                throw xnb.m(parcel);
            case 4:
                throw xnb.m(parcel);
            case 5:
                throw xnb.m(parcel);
            case 6:
                throw xnb.m(parcel);
            case 7:
                vhe vheVar = (vhe) sld.a(parcel, vhe.CREATOR);
                sld.b(parcel);
                T(vheVar);
                break;
            case 8:
                throw xnb.m(parcel);
            case 9:
                throw xnb.m(parcel);
            case 10:
                throw xnb.m(parcel);
            case 11:
                sld.b(parcel);
                U();
                break;
            case 12:
                throw xnb.m(parcel);
            case 13:
                throw xnb.m(parcel);
            case 14:
                throw xnb.m(parcel);
            case 15:
                throw xnb.m(parcel);
            case 16:
                throw xnb.m(parcel);
            case 17:
                throw xnb.m(parcel);
            case 18:
                throw xnb.m(parcel);
            case 19:
                throw xnb.m(parcel);
            case 20:
                throw xnb.m(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw xnb.m(parcel);
            case 23:
                throw xnb.m(parcel);
            case 26:
                throw xnb.m(parcel);
            case 27:
                throw xnb.m(parcel);
            case 28:
                throw xnb.m(parcel);
            case 29:
                throw xnb.m(parcel);
            case jn7.S /* 30 */:
                throw xnb.m(parcel);
            case 34:
                throw xnb.m(parcel);
            case 35:
                throw xnb.m(parcel);
            case 36:
                throw xnb.m(parcel);
            case 37:
                throw xnb.m(parcel);
            case 38:
                throw xnb.m(parcel);
            case 39:
                throw xnb.m(parcel);
            case 40:
                throw xnb.m(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
