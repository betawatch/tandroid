// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rhe implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ rhe(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int i = -1;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        byte b = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        switch (this.a) {
            case 0:
                int z3 = gte.z(parcel);
                float f = 0.5f;
                float f2 = 1.0f;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                LatLng latLng = null;
                String str = null;
                String str2 = null;
                IBinder iBinder = null;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                while (parcel.dataPosition() < z3) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            latLng = (LatLng) gte.g(parcel, readInt, LatLng.CREATOR);
                            break;
                        case 3:
                            str = gte.h(parcel, readInt);
                            break;
                        case 4:
                            str2 = gte.h(parcel, readInt);
                            break;
                        case 5:
                            iBinder = gte.t(parcel, readInt);
                            break;
                        case 6:
                            f3 = gte.r(parcel, readInt);
                            break;
                        case 7:
                            f4 = gte.r(parcel, readInt);
                            break;
                        case '\b':
                            z4 = gte.n(parcel, readInt);
                            break;
                        case '\t':
                            z5 = gte.n(parcel, readInt);
                            break;
                        case '\n':
                            z6 = gte.n(parcel, readInt);
                            break;
                        case 11:
                            f5 = gte.r(parcel, readInt);
                            break;
                        case '\f':
                            f = gte.r(parcel, readInt);
                            break;
                        case '\r':
                            f6 = gte.r(parcel, readInt);
                            break;
                        case 14:
                            f2 = gte.r(parcel, readInt);
                            break;
                        case 15:
                            f7 = gte.r(parcel, readInt);
                            break;
                        default:
                            gte.y(parcel, readInt);
                            break;
                    }
                }
                gte.m(parcel, z3);
                zi6 zi6Var = new zi6();
                zi6Var.e = 0.5f;
                zi6Var.f = 1.0f;
                zi6Var.n = true;
                zi6Var.r = false;
                zi6Var.s = 0.0f;
                zi6Var.w = 0.5f;
                zi6Var.x = 0.0f;
                zi6Var.y = 1.0f;
                zi6Var.a = latLng;
                zi6Var.b = str;
                zi6Var.c = str2;
                if (iBinder == null) {
                    zi6Var.d = null;
                } else {
                    zi6Var.d = new lj9(bo7.T(iBinder));
                }
                zi6Var.e = f3;
                zi6Var.f = f4;
                zi6Var.h = z4;
                zi6Var.n = z5;
                zi6Var.r = z6;
                zi6Var.s = f5;
                zi6Var.w = f;
                zi6Var.x = f6;
                zi6Var.y = f2;
                zi6Var.E = f7;
                return zi6Var;
            case 1:
                int z7 = gte.z(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < z7) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        i2 = gte.u(parcel, readInt2);
                    } else if (c != 3) {
                        gte.y(parcel, readInt2);
                    } else {
                        z8 = gte.n(parcel, readInt2);
                    }
                }
                gte.m(parcel, z7);
                return new ice(i2, z8);
            case 2:
                int z9 = gte.z(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str9 = gte.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = gte.h(parcel, readInt3);
                            break;
                        case 4:
                            str4 = gte.h(parcel, readInt3);
                            break;
                        case 5:
                            str5 = gte.h(parcel, readInt3);
                            break;
                        case 6:
                            str6 = gte.h(parcel, readInt3);
                            break;
                        case 7:
                            str7 = gte.h(parcel, readInt3);
                            break;
                        case '\b':
                            str8 = gte.h(parcel, readInt3);
                            break;
                        default:
                            gte.y(parcel, readInt3);
                            break;
                    }
                }
                gte.m(parcel, z9);
                se0 se0Var = new se0();
                se0Var.a = str9;
                se0Var.b = str3;
                se0Var.c = str4;
                se0Var.d = str5;
                se0Var.e = str6;
                se0Var.f = str7;
                se0Var.h = str8;
                return se0Var;
            case 3:
                int z10 = gte.z(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i11 = gte.u(parcel, readInt4);
                            break;
                        case 3:
                            str11 = gte.h(parcel, readInt4);
                            break;
                        case 4:
                            d = gte.q(parcel, readInt4);
                            break;
                        case 5:
                            str10 = gte.h(parcel, readInt4);
                            break;
                        case 6:
                            j = gte.w(parcel, readInt4);
                            break;
                        case 7:
                            i = gte.u(parcel, readInt4);
                            break;
                        default:
                            gte.y(parcel, readInt4);
                            break;
                    }
                }
                gte.m(parcel, z10);
                dg6 dg6Var = new dg6();
                dg6Var.a = i11;
                dg6Var.b = str11;
                dg6Var.c = d;
                dg6Var.d = str10;
                dg6Var.e = j;
                dg6Var.f = i;
                return dg6Var;
            case 4:
                int z11 = gte.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        z2 = gte.n(parcel, readInt5);
                    } else if (c2 != 2) {
                        gte.y(parcel, readInt5);
                    } else {
                        bArr = gte.b(parcel, readInt5);
                    }
                }
                gte.m(parcel, z11);
                return new lce(z2, bArr == null ? null : qae.o(bArr.length, bArr));
            case 5:
                int z12 = gte.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 2) {
                        i10 = gte.u(parcel, readInt6);
                    } else if (c3 != 3) {
                        gte.y(parcel, readInt6);
                    } else {
                        z13 = gte.n(parcel, readInt6);
                    }
                }
                gte.m(parcel, z12);
                zre zreVar = new zre();
                zreVar.a = i10;
                zreVar.b = z13;
                return zreVar;
            case 6:
                int z14 = gte.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        gte.y(parcel, readInt7);
                    } else {
                        bArr2 = gte.b(parcel, readInt7);
                    }
                }
                gte.m(parcel, z14);
                return new qhe(bArr2);
            case 7:
                int z15 = gte.z(parcel);
                Float f8 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 2) {
                        i9 = gte.u(parcel, readInt8);
                    } else if (c4 != 3) {
                        gte.y(parcel, readInt8);
                    } else {
                        f8 = gte.s(parcel, readInt8);
                    }
                }
                gte.m(parcel, z15);
                return new my7(i9, f8);
            case 8:
                int z16 = gte.z(parcel);
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                byte[] bArr3 = null;
                String str12 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 2) {
                        str12 = gte.h(parcel, readInt9);
                    } else if (c5 == 3) {
                        dataHolder = (DataHolder) gte.g(parcel, readInt9, DataHolder.CREATOR);
                    } else if (c5 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) gte.g(parcel, readInt9, ParcelFileDescriptor.CREATOR);
                    } else if (c5 == 5) {
                        j = gte.w(parcel, readInt9);
                    } else if (c5 != 6) {
                        gte.y(parcel, readInt9);
                    } else {
                        bArr3 = gte.b(parcel, readInt9);
                    }
                }
                gte.m(parcel, z16);
                no9 no9Var = new no9();
                no9Var.a = str12;
                no9Var.b = dataHolder;
                no9Var.c = parcelFileDescriptor;
                no9Var.d = j;
                no9Var.e = bArr3;
                return no9Var;
            case 9:
                int z17 = gte.z(parcel);
                double d2 = 0.0d;
                while (parcel.dataPosition() < z17) {
                    int readInt10 = parcel.readInt();
                    char c6 = (char) readInt10;
                    if (c6 == 2) {
                        d = gte.q(parcel, readInt10);
                    } else if (c6 != 3) {
                        gte.y(parcel, readInt10);
                    } else {
                        d2 = gte.q(parcel, readInt10);
                    }
                }
                gte.m(parcel, z17);
                re0 re0Var = new re0();
                re0Var.a = d;
                re0Var.b = d2;
                return re0Var;
            case 10:
                int z18 = gte.z(parcel);
                dg6 dg6Var2 = null;
                pnb pnbVar = null;
                String str13 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 2) {
                        str13 = gte.h(parcel, readInt11);
                    } else if (c7 == 3) {
                        dg6Var2 = (dg6) gte.g(parcel, readInt11, dg6.CREATOR);
                    } else if (c7 != 5) {
                        gte.y(parcel, readInt11);
                    } else {
                        pnbVar = (pnb) gte.g(parcel, readInt11, pnb.CREATOR);
                    }
                }
                gte.m(parcel, z18);
                cg6 cg6Var = new cg6();
                cg6Var.a = str13;
                cg6Var.b = dg6Var2;
                cg6Var.c = pnbVar;
                return cg6Var;
            case 11:
                int z19 = gte.z(parcel);
                byte b2 = 0;
                String str14 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        b = gte.p(parcel, readInt12);
                    } else if (c8 == 3) {
                        b2 = gte.p(parcel, readInt12);
                    } else if (c8 != 4) {
                        gte.y(parcel, readInt12);
                    } else {
                        str14 = gte.h(parcel, readInt12);
                    }
                }
                gte.m(parcel, z19);
                return new the(b, b2, str14);
            case 12:
                int z20 = gte.z(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        bArr4 = gte.b(parcel, readInt13);
                    } else if (c9 == 3) {
                        bArr5 = gte.b(parcel, readInt13);
                    } else if (c9 == 4) {
                        bArr6 = gte.b(parcel, readInt13);
                    } else if (c9 == 5) {
                        bArr7 = gte.b(parcel, readInt13);
                    } else if (c9 != 6) {
                        gte.y(parcel, readInt13);
                    } else {
                        bArr8 = gte.b(parcel, readInt13);
                    }
                }
                gte.m(parcel, z20);
                return new z40(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 13:
                int z21 = gte.z(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        str17 = gte.h(parcel, readInt14);
                    } else if (c10 == 2) {
                        str15 = gte.h(parcel, readInt14);
                    } else if (c10 != 3) {
                        gte.y(parcel, readInt14);
                    } else {
                        str16 = gte.h(parcel, readInt14);
                    }
                }
                gte.m(parcel, z21);
                return new vhe(str17, str15, str16);
            case 14:
                int z22 = gte.z(parcel);
                int i12 = 0;
                int i13 = 0;
                float f9 = 0.0f;
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i8 = gte.u(parcel, readInt15);
                    } else if (c11 == 3) {
                        i12 = gte.u(parcel, readInt15);
                    } else if (c11 == 4) {
                        f9 = gte.r(parcel, readInt15);
                    } else if (c11 != 5) {
                        gte.y(parcel, readInt15);
                    } else {
                        i13 = gte.u(parcel, readInt15);
                    }
                }
                gte.m(parcel, z22);
                return new qme(i8, i12, f9, i13);
            case 15:
                int z23 = gte.z(parcel);
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        str19 = gte.h(parcel, readInt16);
                    } else if (c12 != 3) {
                        gte.y(parcel, readInt16);
                    } else {
                        str18 = gte.h(parcel, readInt16);
                    }
                }
                gte.m(parcel, z23);
                ue0 ue0Var = new ue0();
                ue0Var.a = str19;
                ue0Var.b = str18;
                return ue0Var;
            case 16:
                int z24 = gte.z(parcel);
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 2) {
                        str21 = gte.h(parcel, readInt17);
                    } else if (c13 != 3) {
                        gte.y(parcel, readInt17);
                    } else {
                        str20 = gte.h(parcel, readInt17);
                    }
                }
                gte.m(parcel, z24);
                phb phbVar = new phb();
                phbVar.a = str21;
                phbVar.b = str20;
                return phbVar;
            case 17:
                int z25 = gte.z(parcel);
                f84[] f84VarArr = null;
                fs2 fs2Var = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        bundle = gte.a(parcel, readInt18);
                    } else if (c14 == 2) {
                        f84VarArr = (f84[]) gte.k(parcel, readInt18, f84.CREATOR);
                    } else if (c14 == 3) {
                        i7 = gte.u(parcel, readInt18);
                    } else if (c14 != 4) {
                        gte.y(parcel, readInt18);
                    } else {
                        fs2Var = (fs2) gte.g(parcel, readInt18, fs2.CREATOR);
                    }
                }
                gte.m(parcel, z25);
                xme xmeVar = new xme();
                xmeVar.a = bundle;
                xmeVar.b = f84VarArr;
                xmeVar.c = i7;
                xmeVar.d = fs2Var;
                return xmeVar;
            case 18:
                int z26 = gte.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                String[] strArr = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    char c15 = (char) readInt19;
                    if (c15 == 2) {
                        bArr11 = gte.b(parcel, readInt19);
                    } else if (c15 == 3) {
                        bArr9 = gte.b(parcel, readInt19);
                    } else if (c15 == 4) {
                        bArr10 = gte.b(parcel, readInt19);
                    } else if (c15 != 5) {
                        gte.y(parcel, readInt19);
                    } else {
                        strArr = gte.i(parcel, readInt19);
                    }
                }
                gte.m(parcel, z26);
                return new a50(bArr11, bArr9, bArr10, strArr);
            case 19:
                int z27 = gte.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        gte.y(parcel, readInt20);
                    } else {
                        z = gte.n(parcel, readInt20);
                    }
                }
                gte.m(parcel, z27);
                return new bne(z);
            case 20:
                int z28 = gte.z(parcel);
                byte[] bArr12 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        gte.y(parcel, readInt21);
                    } else {
                        bArr12 = gte.b(parcel, readInt21);
                    }
                }
                gte.m(parcel, z28);
                return new ase(bArr12);
            case 21:
                int z29 = gte.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 2) {
                        i6 = gte.u(parcel, readInt22);
                    } else if (c16 != 3) {
                        gte.y(parcel, readInt22);
                    } else {
                        str22 = gte.h(parcel, readInt22);
                    }
                }
                gte.m(parcel, z29);
                te0 te0Var = new te0();
                te0Var.a = i6;
                te0Var.b = str22;
                return te0Var;
            case 22:
                int z30 = gte.z(parcel);
                String str23 = null;
                l7d l7dVar = null;
                String str24 = null;
                v4d v4dVar = null;
                v4d v4dVar2 = null;
                String[] strArr2 = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                ap5[] ap5VarArr = null;
                vz7 vz7Var = null;
                String str25 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str25 = gte.h(parcel, readInt23);
                            break;
                        case 3:
                            str23 = gte.h(parcel, readInt23);
                            break;
                        case 4:
                            l7dVar = (l7d) gte.g(parcel, readInt23, l7d.CREATOR);
                            break;
                        case 5:
                            str24 = gte.h(parcel, readInt23);
                            break;
                        case 6:
                            v4dVar = (v4d) gte.g(parcel, readInt23, v4d.CREATOR);
                            break;
                        case 7:
                            v4dVar2 = (v4d) gte.g(parcel, readInt23, v4d.CREATOR);
                            break;
                        case '\b':
                            strArr2 = gte.i(parcel, readInt23);
                            break;
                        case '\t':
                            userAddress = (UserAddress) gte.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) gte.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            ap5VarArr = (ap5[]) gte.k(parcel, readInt23, ap5.CREATOR);
                            break;
                        case '\f':
                            vz7Var = (vz7) gte.g(parcel, readInt23, vz7.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt23);
                            break;
                    }
                }
                gte.m(parcel, z30);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str25;
                fullWallet.b = str23;
                fullWallet.c = l7dVar;
                fullWallet.d = str24;
                fullWallet.e = v4dVar;
                fullWallet.f = v4dVar2;
                fullWallet.h = strArr2;
                fullWallet.n = userAddress;
                fullWallet.r = userAddress2;
                fullWallet.s = ap5VarArr;
                fullWallet.w = vz7Var;
                return fullWallet;
            case 23:
                int z31 = gte.z(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c17 = (char) readInt24;
                    if (c17 == 2) {
                        j = gte.w(parcel, readInt24);
                    } else if (c17 != 3) {
                        gte.y(parcel, readInt24);
                    } else {
                        j2 = gte.w(parcel, readInt24);
                    }
                }
                gte.m(parcel, z31);
                pnb pnbVar2 = new pnb();
                pnbVar2.a = j;
                pnbVar2.b = j2;
                return pnbVar2;
            case 24:
                int z32 = gte.z(parcel);
                boolean z33 = false;
                boolean z34 = false;
                int i14 = 0;
                mj9 mj9Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            mj9Var = (mj9) gte.g(parcel, readInt25, mj9.CREATOR);
                            break;
                        case 2:
                            z33 = gte.n(parcel, readInt25);
                            break;
                        case 3:
                            z34 = gte.n(parcel, readInt25);
                            break;
                        case 4:
                            iArr = gte.d(parcel, readInt25);
                            break;
                        case 5:
                            i14 = gte.u(parcel, readInt25);
                            break;
                        case 6:
                            iArr2 = gte.d(parcel, readInt25);
                            break;
                        default:
                            gte.y(parcel, readInt25);
                            break;
                    }
                }
                gte.m(parcel, z32);
                return new fs2(mj9Var, z33, z34, iArr, i14, iArr2);
            case 25:
                int z35 = gte.z(parcel);
                int i15 = 0;
                String str26 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt26 = parcel.readInt();
                    char c18 = (char) readInt26;
                    if (c18 == 2) {
                        i5 = gte.u(parcel, readInt26);
                    } else if (c18 == 3) {
                        str26 = gte.h(parcel, readInt26);
                    } else if (c18 != 4) {
                        gte.y(parcel, readInt26);
                    } else {
                        i15 = gte.u(parcel, readInt26);
                    }
                }
                gte.m(parcel, z35);
                return new b50(i5, i15, str26);
            case 26:
                int z36 = gte.z(parcel);
                rcf rcfVar = null;
                byte[] bArr13 = null;
                String str27 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt27 = parcel.readInt();
                    char c19 = (char) readInt27;
                    if (c19 == 1) {
                        str27 = gte.h(parcel, readInt27);
                    } else if (c19 == 3) {
                        rcfVar = (rcf) gte.g(parcel, readInt27, rcf.CREATOR);
                    } else if (c19 == 4) {
                        i = gte.u(parcel, readInt27);
                    } else if (c19 != 5) {
                        gte.y(parcel, readInt27);
                    } else {
                        bArr13 = gte.b(parcel, readInt27);
                    }
                }
                gte.m(parcel, z36);
                return new fse(str27, rcfVar, i, bArr13);
            case 27:
                int z37 = gte.z(parcel);
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt28 = parcel.readInt();
                    char c20 = (char) readInt28;
                    if (c20 == 2) {
                        str29 = gte.h(parcel, readInt28);
                    } else if (c20 == 3) {
                        str28 = gte.h(parcel, readInt28);
                    } else if (c20 != 4) {
                        gte.y(parcel, readInt28);
                    } else {
                        i4 = gte.u(parcel, readInt28);
                    }
                }
                gte.m(parcel, z37);
                we0 we0Var = new we0();
                we0Var.a = str29;
                we0Var.b = str28;
                we0Var.c = i4;
                return we0Var;
            case 28:
                int z38 = gte.z(parcel);
                int i16 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z38) {
                    int readInt29 = parcel.readInt();
                    char c21 = (char) readInt29;
                    if (c21 == 1) {
                        i3 = gte.u(parcel, readInt29);
                    } else if (c21 == 2) {
                        f11 = gte.r(parcel, readInt29);
                    } else if (c21 == 3) {
                        f10 = gte.r(parcel, readInt29);
                    } else if (c21 != 4) {
                        gte.y(parcel, readInt29);
                    } else {
                        i16 = gte.u(parcel, readInt29);
                    }
                }
                gte.m(parcel, z38);
                return new LandmarkParcel(i3, f11, f10, i16);
            default:
                int z39 = gte.z(parcel);
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt30 = parcel.readInt();
                    char c22 = (char) readInt30;
                    if (c22 == 2) {
                        str31 = gte.h(parcel, readInt30);
                    } else if (c22 != 3) {
                        gte.y(parcel, readInt30);
                    } else {
                        str30 = gte.h(parcel, readInt30);
                    }
                }
                gte.m(parcel, z39);
                r6c r6cVar = new r6c();
                r6cVar.a = str31;
                r6cVar.b = str30;
                return r6cVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zi6[i];
            case 1:
                return new ice[i];
            case 2:
                return new se0[i];
            case 3:
                return new dg6[i];
            case 4:
                return new lce[i];
            case 5:
                return new zre[i];
            case 6:
                return new qhe[i];
            case 7:
                return new my7[i];
            case 8:
                return new no9[i];
            case 9:
                return new re0[i];
            case 10:
                return new cg6[i];
            case 11:
                return new the[i];
            case 12:
                return new z40[i];
            case 13:
                return new vhe[i];
            case 14:
                return new qme[i];
            case 15:
                return new ue0[i];
            case 16:
                return new phb[i];
            case 17:
                return new xme[i];
            case 18:
                return new a50[i];
            case 19:
                return new bne[i];
            case 20:
                return new ase[i];
            case 21:
                return new te0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new pnb[i];
            case 24:
                return new fs2[i];
            case 25:
                return new b50[i];
            case 26:
                return new fse[i];
            case 27:
                return new we0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new r6c[i];
        }
    }
}
