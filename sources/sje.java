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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sje implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ sje(byte b) {
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
                int z3 = jve.z(parcel);
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
                            latLng = (LatLng) jve.g(parcel, readInt, LatLng.CREATOR);
                            break;
                        case 3:
                            str = jve.h(parcel, readInt);
                            break;
                        case 4:
                            str2 = jve.h(parcel, readInt);
                            break;
                        case 5:
                            iBinder = jve.t(parcel, readInt);
                            break;
                        case 6:
                            f3 = jve.r(parcel, readInt);
                            break;
                        case 7:
                            f4 = jve.r(parcel, readInt);
                            break;
                        case '\b':
                            z4 = jve.n(parcel, readInt);
                            break;
                        case '\t':
                            z5 = jve.n(parcel, readInt);
                            break;
                        case '\n':
                            z6 = jve.n(parcel, readInt);
                            break;
                        case 11:
                            f5 = jve.r(parcel, readInt);
                            break;
                        case '\f':
                            f = jve.r(parcel, readInt);
                            break;
                        case '\r':
                            f6 = jve.r(parcel, readInt);
                            break;
                        case 14:
                            f2 = jve.r(parcel, readInt);
                            break;
                        case 15:
                            f7 = jve.r(parcel, readInt);
                            break;
                        default:
                            jve.y(parcel, readInt);
                            break;
                    }
                }
                jve.m(parcel, z3);
                cl6 cl6Var = new cl6();
                cl6Var.e = 0.5f;
                cl6Var.f = 1.0f;
                cl6Var.n = true;
                cl6Var.r = false;
                cl6Var.s = 0.0f;
                cl6Var.w = 0.5f;
                cl6Var.x = 0.0f;
                cl6Var.y = 1.0f;
                cl6Var.a = latLng;
                cl6Var.b = str;
                cl6Var.c = str2;
                if (iBinder == null) {
                    cl6Var.d = null;
                } else {
                    cl6Var.d = new nl9(eq7.T(iBinder));
                }
                cl6Var.e = f3;
                cl6Var.f = f4;
                cl6Var.h = z4;
                cl6Var.n = z5;
                cl6Var.r = z6;
                cl6Var.s = f5;
                cl6Var.w = f;
                cl6Var.x = f6;
                cl6Var.y = f2;
                cl6Var.E = f7;
                return cl6Var;
            case 1:
                int z7 = jve.z(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < z7) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        i2 = jve.u(parcel, readInt2);
                    } else if (c != 3) {
                        jve.y(parcel, readInt2);
                    } else {
                        z8 = jve.n(parcel, readInt2);
                    }
                }
                jve.m(parcel, z7);
                return new jee(i2, z8);
            case 2:
                int z9 = jve.z(parcel);
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
                            str9 = jve.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = jve.h(parcel, readInt3);
                            break;
                        case 4:
                            str4 = jve.h(parcel, readInt3);
                            break;
                        case 5:
                            str5 = jve.h(parcel, readInt3);
                            break;
                        case 6:
                            str6 = jve.h(parcel, readInt3);
                            break;
                        case 7:
                            str7 = jve.h(parcel, readInt3);
                            break;
                        case '\b':
                            str8 = jve.h(parcel, readInt3);
                            break;
                        default:
                            jve.y(parcel, readInt3);
                            break;
                    }
                }
                jve.m(parcel, z9);
                sf0 sf0Var = new sf0();
                sf0Var.a = str9;
                sf0Var.b = str3;
                sf0Var.c = str4;
                sf0Var.d = str5;
                sf0Var.e = str6;
                sf0Var.f = str7;
                sf0Var.h = str8;
                return sf0Var;
            case 3:
                int z10 = jve.z(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i11 = jve.u(parcel, readInt4);
                            break;
                        case 3:
                            str11 = jve.h(parcel, readInt4);
                            break;
                        case 4:
                            d = jve.q(parcel, readInt4);
                            break;
                        case 5:
                            str10 = jve.h(parcel, readInt4);
                            break;
                        case 6:
                            j = jve.w(parcel, readInt4);
                            break;
                        case 7:
                            i = jve.u(parcel, readInt4);
                            break;
                        default:
                            jve.y(parcel, readInt4);
                            break;
                    }
                }
                jve.m(parcel, z10);
                di6 di6Var = new di6();
                di6Var.a = i11;
                di6Var.b = str11;
                di6Var.c = d;
                di6Var.d = str10;
                di6Var.e = j;
                di6Var.f = i;
                return di6Var;
            case 4:
                int z11 = jve.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        z2 = jve.n(parcel, readInt5);
                    } else if (c2 != 2) {
                        jve.y(parcel, readInt5);
                    } else {
                        bArr = jve.b(parcel, readInt5);
                    }
                }
                jve.m(parcel, z11);
                return new mee(z2, bArr == null ? null : rce.o(bArr.length, bArr));
            case 5:
                int z12 = jve.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 2) {
                        i10 = jve.u(parcel, readInt6);
                    } else if (c3 != 3) {
                        jve.y(parcel, readInt6);
                    } else {
                        z13 = jve.n(parcel, readInt6);
                    }
                }
                jve.m(parcel, z12);
                cue cueVar = new cue();
                cueVar.a = i10;
                cueVar.b = z13;
                return cueVar;
            case 6:
                int z14 = jve.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        jve.y(parcel, readInt7);
                    } else {
                        bArr2 = jve.b(parcel, readInt7);
                    }
                }
                jve.m(parcel, z14);
                return new rje(bArr2);
            case 7:
                int z15 = jve.z(parcel);
                Float f8 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 2) {
                        i9 = jve.u(parcel, readInt8);
                    } else if (c4 != 3) {
                        jve.y(parcel, readInt8);
                    } else {
                        f8 = jve.s(parcel, readInt8);
                    }
                }
                jve.m(parcel, z15);
                return new o08(i9, f8);
            case 8:
                int z16 = jve.z(parcel);
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                byte[] bArr3 = null;
                String str12 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 2) {
                        str12 = jve.h(parcel, readInt9);
                    } else if (c5 == 3) {
                        dataHolder = (DataHolder) jve.g(parcel, readInt9, DataHolder.CREATOR);
                    } else if (c5 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) jve.g(parcel, readInt9, ParcelFileDescriptor.CREATOR);
                    } else if (c5 == 5) {
                        j = jve.w(parcel, readInt9);
                    } else if (c5 != 6) {
                        jve.y(parcel, readInt9);
                    } else {
                        bArr3 = jve.b(parcel, readInt9);
                    }
                }
                jve.m(parcel, z16);
                oq9 oq9Var = new oq9();
                oq9Var.a = str12;
                oq9Var.b = dataHolder;
                oq9Var.c = parcelFileDescriptor;
                oq9Var.d = j;
                oq9Var.e = bArr3;
                return oq9Var;
            case 9:
                int z17 = jve.z(parcel);
                double d2 = 0.0d;
                while (parcel.dataPosition() < z17) {
                    int readInt10 = parcel.readInt();
                    char c6 = (char) readInt10;
                    if (c6 == 2) {
                        d = jve.q(parcel, readInt10);
                    } else if (c6 != 3) {
                        jve.y(parcel, readInt10);
                    } else {
                        d2 = jve.q(parcel, readInt10);
                    }
                }
                jve.m(parcel, z17);
                rf0 rf0Var = new rf0();
                rf0Var.a = d;
                rf0Var.b = d2;
                return rf0Var;
            case 10:
                int z18 = jve.z(parcel);
                di6 di6Var2 = null;
                qpb qpbVar = null;
                String str13 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 2) {
                        str13 = jve.h(parcel, readInt11);
                    } else if (c7 == 3) {
                        di6Var2 = (di6) jve.g(parcel, readInt11, di6.CREATOR);
                    } else if (c7 != 5) {
                        jve.y(parcel, readInt11);
                    } else {
                        qpbVar = (qpb) jve.g(parcel, readInt11, qpb.CREATOR);
                    }
                }
                jve.m(parcel, z18);
                ci6 ci6Var = new ci6();
                ci6Var.a = str13;
                ci6Var.b = di6Var2;
                ci6Var.c = qpbVar;
                return ci6Var;
            case 11:
                int z19 = jve.z(parcel);
                byte b2 = 0;
                String str14 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        b = jve.p(parcel, readInt12);
                    } else if (c8 == 3) {
                        b2 = jve.p(parcel, readInt12);
                    } else if (c8 != 4) {
                        jve.y(parcel, readInt12);
                    } else {
                        str14 = jve.h(parcel, readInt12);
                    }
                }
                jve.m(parcel, z19);
                return new uje(b, b2, str14);
            case 12:
                int z20 = jve.z(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        bArr4 = jve.b(parcel, readInt13);
                    } else if (c9 == 3) {
                        bArr5 = jve.b(parcel, readInt13);
                    } else if (c9 == 4) {
                        bArr6 = jve.b(parcel, readInt13);
                    } else if (c9 == 5) {
                        bArr7 = jve.b(parcel, readInt13);
                    } else if (c9 != 6) {
                        jve.y(parcel, readInt13);
                    } else {
                        bArr8 = jve.b(parcel, readInt13);
                    }
                }
                jve.m(parcel, z20);
                return new z50(bArr4, bArr5, bArr6, bArr7, bArr8);
            case 13:
                int z21 = jve.z(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        str17 = jve.h(parcel, readInt14);
                    } else if (c10 == 2) {
                        str15 = jve.h(parcel, readInt14);
                    } else if (c10 != 3) {
                        jve.y(parcel, readInt14);
                    } else {
                        str16 = jve.h(parcel, readInt14);
                    }
                }
                jve.m(parcel, z21);
                return new wje(str17, str15, str16);
            case 14:
                int z22 = jve.z(parcel);
                int i12 = 0;
                int i13 = 0;
                float f9 = 0.0f;
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i8 = jve.u(parcel, readInt15);
                    } else if (c11 == 3) {
                        i12 = jve.u(parcel, readInt15);
                    } else if (c11 == 4) {
                        f9 = jve.r(parcel, readInt15);
                    } else if (c11 != 5) {
                        jve.y(parcel, readInt15);
                    } else {
                        i13 = jve.u(parcel, readInt15);
                    }
                }
                jve.m(parcel, z22);
                return new toe(i8, i12, f9, i13);
            case 15:
                int z23 = jve.z(parcel);
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        str19 = jve.h(parcel, readInt16);
                    } else if (c12 != 3) {
                        jve.y(parcel, readInt16);
                    } else {
                        str18 = jve.h(parcel, readInt16);
                    }
                }
                jve.m(parcel, z23);
                uf0 uf0Var = new uf0();
                uf0Var.a = str19;
                uf0Var.b = str18;
                return uf0Var;
            case 16:
                int z24 = jve.z(parcel);
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 2) {
                        str21 = jve.h(parcel, readInt17);
                    } else if (c13 != 3) {
                        jve.y(parcel, readInt17);
                    } else {
                        str20 = jve.h(parcel, readInt17);
                    }
                }
                jve.m(parcel, z24);
                qjb qjbVar = new qjb();
                qjbVar.a = str21;
                qjbVar.b = str20;
                return qjbVar;
            case 17:
                int z25 = jve.z(parcel);
                o94[] o94VarArr = null;
                qt2 qt2Var = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        bundle = jve.a(parcel, readInt18);
                    } else if (c14 == 2) {
                        o94VarArr = (o94[]) jve.k(parcel, readInt18, o94.CREATOR);
                    } else if (c14 == 3) {
                        i7 = jve.u(parcel, readInt18);
                    } else if (c14 != 4) {
                        jve.y(parcel, readInt18);
                    } else {
                        qt2Var = (qt2) jve.g(parcel, readInt18, qt2.CREATOR);
                    }
                }
                jve.m(parcel, z25);
                ape apeVar = new ape();
                apeVar.a = bundle;
                apeVar.b = o94VarArr;
                apeVar.c = i7;
                apeVar.d = qt2Var;
                return apeVar;
            case 18:
                int z26 = jve.z(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                String[] strArr = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    char c15 = (char) readInt19;
                    if (c15 == 2) {
                        bArr11 = jve.b(parcel, readInt19);
                    } else if (c15 == 3) {
                        bArr9 = jve.b(parcel, readInt19);
                    } else if (c15 == 4) {
                        bArr10 = jve.b(parcel, readInt19);
                    } else if (c15 != 5) {
                        jve.y(parcel, readInt19);
                    } else {
                        strArr = jve.i(parcel, readInt19);
                    }
                }
                jve.m(parcel, z26);
                return new a60(bArr11, bArr9, bArr10, strArr);
            case 19:
                int z27 = jve.z(parcel);
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        jve.y(parcel, readInt20);
                    } else {
                        z = jve.n(parcel, readInt20);
                    }
                }
                jve.m(parcel, z27);
                return new epe(z);
            case 20:
                int z28 = jve.z(parcel);
                byte[] bArr12 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        jve.y(parcel, readInt21);
                    } else {
                        bArr12 = jve.b(parcel, readInt21);
                    }
                }
                jve.m(parcel, z28);
                return new due(bArr12);
            case 21:
                int z29 = jve.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 2) {
                        i6 = jve.u(parcel, readInt22);
                    } else if (c16 != 3) {
                        jve.y(parcel, readInt22);
                    } else {
                        str22 = jve.h(parcel, readInt22);
                    }
                }
                jve.m(parcel, z29);
                tf0 tf0Var = new tf0();
                tf0Var.a = i6;
                tf0Var.b = str22;
                return tf0Var;
            case 22:
                int z30 = jve.z(parcel);
                String str23 = null;
                n9d n9dVar = null;
                String str24 = null;
                x6d x6dVar = null;
                x6d x6dVar2 = null;
                String[] strArr2 = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                ar5[] ar5VarArr = null;
                y18 y18Var = null;
                String str25 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str25 = jve.h(parcel, readInt23);
                            break;
                        case 3:
                            str23 = jve.h(parcel, readInt23);
                            break;
                        case 4:
                            n9dVar = (n9d) jve.g(parcel, readInt23, n9d.CREATOR);
                            break;
                        case 5:
                            str24 = jve.h(parcel, readInt23);
                            break;
                        case 6:
                            x6dVar = (x6d) jve.g(parcel, readInt23, x6d.CREATOR);
                            break;
                        case 7:
                            x6dVar2 = (x6d) jve.g(parcel, readInt23, x6d.CREATOR);
                            break;
                        case '\b':
                            strArr2 = jve.i(parcel, readInt23);
                            break;
                        case '\t':
                            userAddress = (UserAddress) jve.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) jve.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            ar5VarArr = (ar5[]) jve.k(parcel, readInt23, ar5.CREATOR);
                            break;
                        case '\f':
                            y18Var = (y18) jve.g(parcel, readInt23, y18.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt23);
                            break;
                    }
                }
                jve.m(parcel, z30);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str25;
                fullWallet.b = str23;
                fullWallet.c = n9dVar;
                fullWallet.d = str24;
                fullWallet.e = x6dVar;
                fullWallet.f = x6dVar2;
                fullWallet.h = strArr2;
                fullWallet.n = userAddress;
                fullWallet.r = userAddress2;
                fullWallet.s = ar5VarArr;
                fullWallet.w = y18Var;
                return fullWallet;
            case 23:
                int z31 = jve.z(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c17 = (char) readInt24;
                    if (c17 == 2) {
                        j = jve.w(parcel, readInt24);
                    } else if (c17 != 3) {
                        jve.y(parcel, readInt24);
                    } else {
                        j2 = jve.w(parcel, readInt24);
                    }
                }
                jve.m(parcel, z31);
                qpb qpbVar2 = new qpb();
                qpbVar2.a = j;
                qpbVar2.b = j2;
                return qpbVar2;
            case 24:
                int z32 = jve.z(parcel);
                boolean z33 = false;
                boolean z34 = false;
                int i14 = 0;
                ol9 ol9Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            ol9Var = (ol9) jve.g(parcel, readInt25, ol9.CREATOR);
                            break;
                        case 2:
                            z33 = jve.n(parcel, readInt25);
                            break;
                        case 3:
                            z34 = jve.n(parcel, readInt25);
                            break;
                        case 4:
                            iArr = jve.d(parcel, readInt25);
                            break;
                        case 5:
                            i14 = jve.u(parcel, readInt25);
                            break;
                        case 6:
                            iArr2 = jve.d(parcel, readInt25);
                            break;
                        default:
                            jve.y(parcel, readInt25);
                            break;
                    }
                }
                jve.m(parcel, z32);
                return new qt2(ol9Var, z33, z34, iArr, i14, iArr2);
            case 25:
                int z35 = jve.z(parcel);
                int i15 = 0;
                String str26 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt26 = parcel.readInt();
                    char c18 = (char) readInt26;
                    if (c18 == 2) {
                        i5 = jve.u(parcel, readInt26);
                    } else if (c18 == 3) {
                        str26 = jve.h(parcel, readInt26);
                    } else if (c18 != 4) {
                        jve.y(parcel, readInt26);
                    } else {
                        i15 = jve.u(parcel, readInt26);
                    }
                }
                jve.m(parcel, z35);
                return new b60(i5, i15, str26);
            case 26:
                int z36 = jve.z(parcel);
                sef sefVar = null;
                byte[] bArr13 = null;
                String str27 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt27 = parcel.readInt();
                    char c19 = (char) readInt27;
                    if (c19 == 1) {
                        str27 = jve.h(parcel, readInt27);
                    } else if (c19 == 3) {
                        sefVar = (sef) jve.g(parcel, readInt27, sef.CREATOR);
                    } else if (c19 == 4) {
                        i = jve.u(parcel, readInt27);
                    } else if (c19 != 5) {
                        jve.y(parcel, readInt27);
                    } else {
                        bArr13 = jve.b(parcel, readInt27);
                    }
                }
                jve.m(parcel, z36);
                return new iue(str27, sefVar, i, bArr13);
            case 27:
                int z37 = jve.z(parcel);
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt28 = parcel.readInt();
                    char c20 = (char) readInt28;
                    if (c20 == 2) {
                        str29 = jve.h(parcel, readInt28);
                    } else if (c20 == 3) {
                        str28 = jve.h(parcel, readInt28);
                    } else if (c20 != 4) {
                        jve.y(parcel, readInt28);
                    } else {
                        i4 = jve.u(parcel, readInt28);
                    }
                }
                jve.m(parcel, z37);
                wf0 wf0Var = new wf0();
                wf0Var.a = str29;
                wf0Var.b = str28;
                wf0Var.c = i4;
                return wf0Var;
            case 28:
                int z38 = jve.z(parcel);
                int i16 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z38) {
                    int readInt29 = parcel.readInt();
                    char c21 = (char) readInt29;
                    if (c21 == 1) {
                        i3 = jve.u(parcel, readInt29);
                    } else if (c21 == 2) {
                        f11 = jve.r(parcel, readInt29);
                    } else if (c21 == 3) {
                        f10 = jve.r(parcel, readInt29);
                    } else if (c21 != 4) {
                        jve.y(parcel, readInt29);
                    } else {
                        i16 = jve.u(parcel, readInt29);
                    }
                }
                jve.m(parcel, z38);
                return new LandmarkParcel(i3, f11, f10, i16);
            default:
                int z39 = jve.z(parcel);
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt30 = parcel.readInt();
                    char c22 = (char) readInt30;
                    if (c22 == 2) {
                        str31 = jve.h(parcel, readInt30);
                    } else if (c22 != 3) {
                        jve.y(parcel, readInt30);
                    } else {
                        str30 = jve.h(parcel, readInt30);
                    }
                }
                jve.m(parcel, z39);
                s8c s8cVar = new s8c();
                s8cVar.a = str31;
                s8cVar.b = str30;
                return s8cVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cl6[i];
            case 1:
                return new jee[i];
            case 2:
                return new sf0[i];
            case 3:
                return new di6[i];
            case 4:
                return new mee[i];
            case 5:
                return new cue[i];
            case 6:
                return new rje[i];
            case 7:
                return new o08[i];
            case 8:
                return new oq9[i];
            case 9:
                return new rf0[i];
            case 10:
                return new ci6[i];
            case 11:
                return new uje[i];
            case 12:
                return new z50[i];
            case 13:
                return new wje[i];
            case 14:
                return new toe[i];
            case 15:
                return new uf0[i];
            case 16:
                return new qjb[i];
            case 17:
                return new ape[i];
            case 18:
                return new a60[i];
            case 19:
                return new epe[i];
            case 20:
                return new due[i];
            case 21:
                return new tf0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new qpb[i];
            case 24:
                return new qt2[i];
            case 25:
                return new b60[i];
            case 26:
                return new iue[i];
            case 27:
                return new wf0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new s8c[i];
        }
    }
}
