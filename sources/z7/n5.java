package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                String str = null;
                int i3 = 0;
                float f10 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 2) {
                        str2 = g6.e.h(parcel, readInt);
                    } else if (c2 == 3) {
                        f10 = g6.e.r(parcel, readInt);
                    } else if (c2 == 4) {
                        str = g6.e.h(parcel, readInt);
                    } else if (c2 != 5) {
                        g6.e.y(parcel, readInt);
                    } else {
                        i3 = g6.e.u(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new m4(f10, i3, str, str2);
            case 1:
                int z11 = g6.e.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f11 = 0.0f;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i10 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i12 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        f11 = g6.e.r(parcel, readInt2);
                    } else if (c10 != 5) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        i11 = g6.e.u(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z11);
                return new n6(i10, i12, f11, i11);
            case 2:
                int z12 = g6.e.z(parcel);
                String str3 = null;
                int i13 = 0;
                float f12 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        str3 = g6.e.h(parcel, readInt3);
                    } else if (c11 == 2) {
                        f12 = g6.e.r(parcel, readInt3);
                    } else if (c11 == 3) {
                        str4 = g6.e.h(parcel, readInt3);
                    } else if (c11 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        i13 = g6.e.u(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z12);
                return new la(f12, i13, str3, str4);
            default:
                int z13 = g6.e.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        f13 = g6.e.r(parcel, readInt4);
                    } else if (c12 != 2) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        i14 = g6.e.u(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z13);
                return new ma(f13, i14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new m4[i3];
            case 1:
                return new n6[i3];
            case 2:
                return new la[i3];
            default:
                return new ma[i3];
        }
    }
}
