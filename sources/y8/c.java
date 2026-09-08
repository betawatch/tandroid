package y8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = w7.d0.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = w7.d0.h(parcel, readInt);
                    } else if (c10 != 3) {
                        w7.d0.y(parcel, readInt);
                    } else {
                        arrayList = w7.d0.l(parcel, readInt, l0.CREATOR);
                    }
                }
                w7.d0.m(parcel, z10);
                return new b(str, arrayList);
            case 1:
                int z11 = w7.d0.z(parcel);
                f fVar = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        fVar = (f) w7.d0.g(parcel, readInt2, f.CREATOR);
                    } else if (c11 == 3) {
                        i10 = w7.d0.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i11 = w7.d0.u(parcel, readInt2);
                    } else if (c11 != 5) {
                        w7.d0.y(parcel, readInt2);
                    } else {
                        i12 = w7.d0.u(parcel, readInt2);
                    }
                }
                w7.d0.m(parcel, z11);
                return new e(fVar, i10, i11, i12);
            case 2:
                int z12 = w7.d0.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        str2 = w7.d0.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        str3 = w7.d0.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        w7.d0.y(parcel, readInt3);
                    } else {
                        str4 = w7.d0.h(parcel, readInt3);
                    }
                }
                w7.d0.m(parcel, z12);
                return new f(str2, str3, str4);
            case 3:
                int z13 = w7.d0.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        w7.d0.y(parcel, readInt4);
                    } else {
                        i13 = w7.d0.u(parcel, readInt4);
                    }
                }
                w7.d0.m(parcel, z13);
                return new g(i13);
            case 4:
                int z14 = w7.d0.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        w7.d0.y(parcel, readInt5);
                    } else {
                        i14 = w7.d0.u(parcel, readInt5);
                    }
                }
                w7.d0.m(parcel, z14);
                return new h(i14);
            case 5:
                int z15 = w7.d0.z(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        w7.d0.y(parcel, readInt6);
                    } else {
                        i15 = w7.d0.u(parcel, readInt6);
                    }
                }
                w7.d0.m(parcel, z15);
                return new i(i15);
            case 6:
                int z16 = w7.d0.z(parcel);
                int i16 = 0;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i16 = w7.d0.u(parcel, readInt7);
                    } else if (c13 == 2) {
                        z17 = w7.d0.n(parcel, readInt7);
                    } else if (c13 == 3) {
                        z18 = w7.d0.n(parcel, readInt7);
                    } else if (c13 == 4) {
                        z19 = w7.d0.n(parcel, readInt7);
                    } else if (c13 != 5) {
                        w7.d0.y(parcel, readInt7);
                    } else {
                        z20 = w7.d0.n(parcel, readInt7);
                    }
                }
                w7.d0.m(parcel, z16);
                return new j(i16, z17, z18, z19, z20);
            case 7:
                int z21 = w7.d0.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str5 = w7.d0.h(parcel, readInt8);
                    } else if (c14 != 3) {
                        w7.d0.y(parcel, readInt8);
                    } else {
                        str6 = w7.d0.h(parcel, readInt8);
                    }
                }
                w7.d0.m(parcel, z21);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z22 = w7.d0.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        uri = (Uri) w7.d0.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c15 == 4) {
                        bundle = w7.d0.a(parcel, readInt9);
                    } else if (c15 != 5) {
                        w7.d0.y(parcel, readInt9);
                    } else {
                        bArr = w7.d0.b(parcel, readInt9);
                    }
                }
                w7.d0.m(parcel, z22);
                return new m(uri, bundle, bArr);
            case 9:
                int z23 = w7.d0.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        i17 = w7.d0.u(parcel, readInt10);
                    } else if (c16 != 3) {
                        w7.d0.y(parcel, readInt10);
                    } else {
                        i18 = w7.d0.u(parcel, readInt10);
                    }
                }
                w7.d0.m(parcel, z23);
                return new n(i17, i18);
            case 10:
                int z24 = w7.d0.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 2) {
                        i19 = w7.d0.u(parcel, readInt11);
                    } else if (c17 != 3) {
                        w7.d0.y(parcel, readInt11);
                    } else {
                        arrayList2 = w7.d0.l(parcel, readInt11, b.CREATOR);
                    }
                }
                w7.d0.m(parcel, z24);
                return new o(i19, arrayList2);
            case 11:
                int z25 = w7.d0.z(parcel);
                int i20 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 2) {
                        i20 = w7.d0.u(parcel, readInt12);
                    } else if (c18 != 3) {
                        w7.d0.y(parcel, readInt12);
                    } else {
                        bVar = (b) w7.d0.g(parcel, readInt12, b.CREATOR);
                    }
                }
                w7.d0.m(parcel, z25);
                return new p(i20, bVar);
            case 12:
                int z26 = w7.d0.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 2) {
                        i21 = w7.d0.u(parcel, readInt13);
                    } else if (c19 != 3) {
                        w7.d0.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) w7.d0.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                w7.d0.m(parcel, z26);
                return new q(i21, parcelFileDescriptor);
            case 13:
                int z27 = w7.d0.z(parcel);
                int i22 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 2) {
                        i22 = w7.d0.u(parcel, readInt14);
                    } else if (c20 != 3) {
                        w7.d0.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) w7.d0.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                w7.d0.m(parcel, z27);
                return new r(i22, parcelFileDescriptor2);
            case 14:
                int z28 = w7.d0.z(parcel);
                int i23 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 2) {
                        i23 = w7.d0.u(parcel, readInt15);
                    } else if (c21 != 3) {
                        w7.d0.y(parcel, readInt15);
                    } else {
                        z29 = w7.d0.n(parcel, readInt15);
                    }
                }
                w7.d0.m(parcel, z28);
                return new s(i23, z29);
            case 15:
                int z30 = w7.d0.z(parcel);
                int i24 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 2) {
                        i24 = w7.d0.u(parcel, readInt16);
                    } else if (c22 == 3) {
                        z31 = w7.d0.n(parcel, readInt16);
                    } else if (c22 != 4) {
                        w7.d0.y(parcel, readInt16);
                    } else {
                        z32 = w7.d0.n(parcel, readInt16);
                    }
                }
                w7.d0.m(parcel, z30);
                return new t(i24, z31, z32);
            case 16:
                int z33 = w7.d0.z(parcel);
                int i25 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 2) {
                        i25 = w7.d0.u(parcel, readInt17);
                    } else if (c23 != 3) {
                        w7.d0.y(parcel, readInt17);
                    } else {
                        z34 = w7.d0.n(parcel, readInt17);
                    }
                }
                w7.d0.m(parcel, z33);
                return new u(i25, z34);
            case 17:
                int z35 = w7.d0.z(parcel);
                int i26 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 2) {
                        i26 = w7.d0.u(parcel, readInt18);
                    } else if (c24 != 3) {
                        w7.d0.y(parcel, readInt18);
                    } else {
                        str7 = w7.d0.h(parcel, readInt18);
                    }
                }
                w7.d0.m(parcel, z35);
                return new v(i26, str7);
            case 18:
                int z36 = w7.d0.z(parcel);
                int i27 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 2) {
                        i27 = w7.d0.u(parcel, readInt19);
                    } else if (c25 != 3) {
                        w7.d0.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) w7.d0.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                w7.d0.m(parcel, z36);
                return new w(i27, connectionConfiguration);
            case 19:
                int z37 = w7.d0.z(parcel);
                int i28 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 2) {
                        i28 = w7.d0.u(parcel, readInt20);
                    } else if (c26 != 3) {
                        w7.d0.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) w7.d0.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                w7.d0.m(parcel, z37);
                return new x(i28, connectionConfigurationArr);
            case 20:
                int z38 = w7.d0.z(parcel);
                int i29 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt21 = parcel.readInt();
                    char c27 = (char) readInt21;
                    if (c27 == 2) {
                        i29 = w7.d0.u(parcel, readInt21);
                    } else if (c27 != 3) {
                        w7.d0.y(parcel, readInt21);
                    } else {
                        arrayList3 = w7.d0.l(parcel, readInt21, l0.CREATOR);
                    }
                }
                w7.d0.m(parcel, z38);
                return new y(i29, arrayList3);
            case 21:
                int z39 = w7.d0.z(parcel);
                int i30 = 0;
                m mVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt22 = parcel.readInt();
                    char c28 = (char) readInt22;
                    if (c28 == 2) {
                        i30 = w7.d0.u(parcel, readInt22);
                    } else if (c28 != 3) {
                        w7.d0.y(parcel, readInt22);
                    } else {
                        mVar = (m) w7.d0.g(parcel, readInt22, m.CREATOR);
                    }
                }
                w7.d0.m(parcel, z39);
                return new z(i30, mVar);
            case 22:
                int z40 = w7.d0.z(parcel);
                int i31 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt23 = parcel.readInt();
                    char c29 = (char) readInt23;
                    if (c29 == 2) {
                        i31 = w7.d0.u(parcel, readInt23);
                    } else if (c29 != 3) {
                        w7.d0.y(parcel, readInt23);
                    } else {
                        str8 = w7.d0.h(parcel, readInt23);
                    }
                }
                w7.d0.m(parcel, z40);
                return new a0(i31, str8);
            case 23:
                int z41 = w7.d0.z(parcel);
                int i32 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt24 = parcel.readInt();
                    char c30 = (char) readInt24;
                    if (c30 == 2) {
                        i32 = w7.d0.u(parcel, readInt24);
                    } else if (c30 != 3) {
                        w7.d0.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) w7.d0.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                w7.d0.m(parcel, z41);
                return new b0(i32, parcelFileDescriptor3);
            case 24:
                int z42 = w7.d0.z(parcel);
                int i33 = 0;
                l0 l0Var = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    char c31 = (char) readInt25;
                    if (c31 == 2) {
                        i33 = w7.d0.u(parcel, readInt25);
                    } else if (c31 != 3) {
                        w7.d0.y(parcel, readInt25);
                    } else {
                        l0Var = (l0) w7.d0.g(parcel, readInt25, l0.CREATOR);
                    }
                }
                w7.d0.m(parcel, z42);
                return new c0(i33, l0Var);
            case 25:
                int z43 = w7.d0.z(parcel);
                int i34 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt26 = parcel.readInt();
                    char c32 = (char) readInt26;
                    if (c32 == 2) {
                        i34 = w7.d0.u(parcel, readInt26);
                    } else if (c32 != 3) {
                        w7.d0.y(parcel, readInt26);
                    } else {
                        str9 = w7.d0.h(parcel, readInt26);
                    }
                }
                w7.d0.m(parcel, z43);
                return new d0(i34, str9);
            case 26:
                int z44 = w7.d0.z(parcel);
                String str10 = null;
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < z44) {
                    int readInt27 = parcel.readInt();
                    char c33 = (char) readInt27;
                    if (c33 == 1) {
                        str10 = w7.d0.h(parcel, readInt27);
                    } else if (c33 == 2) {
                        i35 = w7.d0.u(parcel, readInt27);
                    } else if (c33 != 3) {
                        w7.d0.y(parcel, readInt27);
                    } else {
                        i36 = w7.d0.u(parcel, readInt27);
                    }
                }
                w7.d0.m(parcel, z44);
                return new a1(str10, i35, i36);
            case 27:
                int z45 = w7.d0.z(parcel);
                int i37 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt28 = parcel.readInt();
                    char c34 = (char) readInt28;
                    if (c34 == 2) {
                        i37 = w7.d0.u(parcel, readInt28);
                    } else if (c34 == 3) {
                        str11 = w7.d0.h(parcel, readInt28);
                    } else if (c34 == 4) {
                        bArr2 = w7.d0.b(parcel, readInt28);
                    } else if (c34 != 5) {
                        w7.d0.y(parcel, readInt28);
                    } else {
                        str12 = w7.d0.h(parcel, readInt28);
                    }
                }
                w7.d0.m(parcel, z45);
                return new k0(i37, str11, str12, bArr2);
            case 28:
                int z46 = w7.d0.z(parcel);
                int i38 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        w7.d0.y(parcel, readInt29);
                    } else {
                        i38 = w7.d0.u(parcel, readInt29);
                    }
                }
                w7.d0.m(parcel, z46);
                return new g0(i38);
            default:
                int z47 = w7.d0.z(parcel);
                String str13 = null;
                String str14 = null;
                int i39 = 0;
                boolean z48 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt30 = parcel.readInt();
                    char c35 = (char) readInt30;
                    if (c35 == 2) {
                        str13 = w7.d0.h(parcel, readInt30);
                    } else if (c35 == 3) {
                        str14 = w7.d0.h(parcel, readInt30);
                    } else if (c35 == 4) {
                        i39 = w7.d0.u(parcel, readInt30);
                    } else if (c35 != 5) {
                        w7.d0.y(parcel, readInt30);
                    } else {
                        z48 = w7.d0.n(parcel, readInt30);
                    }
                }
                w7.d0.m(parcel, z47);
                return new l0(i39, str13, str14, z48);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new e[i10];
            case 2:
                return new f[i10];
            case 3:
                return new g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new i[i10];
            case 6:
                return new j[i10];
            case 7:
                return new DataItemAssetParcelable[i10];
            case 8:
                return new m[i10];
            case 9:
                return new n[i10];
            case 10:
                return new o[i10];
            case 11:
                return new p[i10];
            case 12:
                return new q[i10];
            case 13:
                return new r[i10];
            case 14:
                return new s[i10];
            case 15:
                return new t[i10];
            case 16:
                return new u[i10];
            case 17:
                return new v[i10];
            case 18:
                return new w[i10];
            case 19:
                return new x[i10];
            case 20:
                return new y[i10];
            case 21:
                return new z[i10];
            case 22:
                return new a0[i10];
            case 23:
                return new b0[i10];
            case 24:
                return new c0[i10];
            case 25:
                return new d0[i10];
            case 26:
                return new a1[i10];
            case 27:
                return new k0[i10];
            case 28:
                return new g0[i10];
            default:
                return new l0[i10];
        }
    }
}
