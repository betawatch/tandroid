// default package

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class y6d extends e1d implements IInterface {
    public y6d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(ffe ffeVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw mlb.n(parcel);
            case 3:
                throw mlb.n(parcel);
            case 4:
                throw mlb.n(parcel);
            case 5:
                throw mlb.n(parcel);
            case 6:
                throw mlb.n(parcel);
            case 7:
                ffe ffeVar = (ffe) cjd.a(parcel, ffe.CREATOR);
                cjd.b(parcel);
                T(ffeVar);
                break;
            case 8:
                throw mlb.n(parcel);
            case 9:
                throw mlb.n(parcel);
            case 10:
                throw mlb.n(parcel);
            case 11:
                cjd.b(parcel);
                U();
                break;
            case 12:
                throw mlb.n(parcel);
            case 13:
                throw mlb.n(parcel);
            case 14:
                throw mlb.n(parcel);
            case 15:
                throw mlb.n(parcel);
            case 16:
                throw mlb.n(parcel);
            case 17:
                throw mlb.n(parcel);
            case 18:
                throw mlb.n(parcel);
            case 19:
                throw mlb.n(parcel);
            case 20:
                throw mlb.n(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw mlb.n(parcel);
            case 23:
                throw mlb.n(parcel);
            case 26:
                throw mlb.n(parcel);
            case 27:
                throw mlb.n(parcel);
            case 28:
                throw mlb.n(parcel);
            case 29:
                throw mlb.n(parcel);
            case nm7.S /* 30 */:
                throw mlb.n(parcel);
            case 34:
                throw mlb.n(parcel);
            case 35:
                throw mlb.n(parcel);
            case 36:
                throw mlb.n(parcel);
            case 37:
                throw mlb.n(parcel);
            case 38:
                throw mlb.n(parcel);
            case 39:
                throw mlb.n(parcel);
            case 40:
                throw mlb.n(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
