package u5;

import android.os.Parcel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class g extends a7.c implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 1);
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                I(readInt);
                return true;
            case 2:
                q5.d dVar = (q5.d) com.google.android.gms.internal.cast.s.a(parcel, q5.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.s.b(parcel);
                t0(dVar, readString, readString2, z4);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                U(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i11 = com.google.android.gms.internal.cast.s.a;
                parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                zzn();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.s.b(parcel);
                M(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.s.b(parcel);
                z0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                c(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                zzd(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                zzm(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.s.b(parcel);
                W(readLong2);
                return true;
            case 12:
                c cVar = (c) com.google.android.gms.internal.cast.s.a(parcel, c.CREATOR);
                com.google.android.gms.internal.cast.s.b(parcel);
                n0(cVar);
                return true;
            case 13:
                d dVar2 = (d) com.google.android.gms.internal.cast.s.a(parcel, d.CREATOR);
                com.google.android.gms.internal.cast.s.b(parcel);
                L(dVar2);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                d(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                u0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
