package y8;

import android.os.Parcel;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a extends b8.b implements d0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override // y8.d0
    public void E() {
        throw new UnsupportedOperationException();
    }

    @Override // b8.b
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw sc.e.j(parcel);
            case 3:
                throw sc.e.j(parcel);
            case 4:
                throw sc.e.j(parcel);
            case 5:
                throw sc.e.j(parcel);
            case 6:
                throw sc.e.j(parcel);
            case 7:
                r0 r0Var = (r0) f8.a.a(parcel, r0.CREATOR);
                f8.a.b(parcel);
                s0(r0Var);
                break;
            case 8:
                throw sc.e.j(parcel);
            case 9:
                throw sc.e.j(parcel);
            case 10:
                throw sc.e.j(parcel);
            case 11:
                f8.a.b(parcel);
                E();
                break;
            case 12:
                throw sc.e.j(parcel);
            case 13:
                throw sc.e.j(parcel);
            case 14:
                throw sc.e.j(parcel);
            case 15:
                throw sc.e.j(parcel);
            case 16:
                throw sc.e.j(parcel);
            case 17:
                throw sc.e.j(parcel);
            case 18:
                throw sc.e.j(parcel);
            case 19:
                throw sc.e.j(parcel);
            case 20:
                throw sc.e.j(parcel);
            case 21:
            case 24:
            case 25:
            case zs.U /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw sc.e.j(parcel);
            case 23:
                throw sc.e.j(parcel);
            case 26:
                throw sc.e.j(parcel);
            case 27:
                throw sc.e.j(parcel);
            case 28:
                throw sc.e.j(parcel);
            case 29:
                throw sc.e.j(parcel);
            case zs.T /* 30 */:
                throw sc.e.j(parcel);
            case 34:
                throw sc.e.j(parcel);
            case 35:
                throw sc.e.j(parcel);
            case 36:
                throw sc.e.j(parcel);
            case 37:
                throw sc.e.j(parcel);
            case 38:
                throw sc.e.j(parcel);
            case 39:
                throw sc.e.j(parcel);
            case 40:
                throw sc.e.j(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // y8.d0
    public void s0(r0 r0Var) {
        throw new UnsupportedOperationException();
    }
}
