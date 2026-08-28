package q5;

import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g extends a7.a implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 3);
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                M(readInt);
                return true;
            case 2:
                m5.d dVar = (m5.d) com.google.android.gms.internal.cast.u.a(parcel, m5.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.u.b(parcel);
                L(dVar, readString, readString2, z10);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                T(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i10 = com.google.android.gms.internal.cast.u.a;
                parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzn();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                P(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.u.b(parcel);
                A0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                c(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzd(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzm(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                V(readLong2);
                return true;
            case 12:
                c cVar = (c) com.google.android.gms.internal.cast.u.a(parcel, c.CREATOR);
                com.google.android.gms.internal.cast.u.b(parcel);
                v0(cVar);
                return true;
            case 13:
                d dVar2 = (d) com.google.android.gms.internal.cast.u.a(parcel, d.CREATOR);
                com.google.android.gms.internal.cast.u.b(parcel);
                v(dVar2);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                d(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                u0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
