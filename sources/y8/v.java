package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = xb.z(parcel);
                String str = null;
                String str2 = null;
                r rVar = null;
                String str3 = null;
                q qVar = null;
                q qVar2 = null;
                String[] strArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = xb.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = xb.h(parcel, readInt);
                            break;
                        case 4:
                            rVar = (r) xb.g(parcel, readInt, r.CREATOR);
                            break;
                        case 5:
                            str3 = xb.h(parcel, readInt);
                            break;
                        case 6:
                            qVar = (q) xb.g(parcel, readInt, q.CREATOR);
                            break;
                        case 7:
                            qVar2 = (q) xb.g(parcel, readInt, q.CREATOR);
                            break;
                        case '\b':
                            strArr = xb.i(parcel, readInt);
                            break;
                        case '\t':
                            userAddress = (UserAddress) xb.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) xb.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) xb.k(parcel, readInt, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) xb.g(parcel, readInt, k.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt);
                            break;
                    }
                }
                xb.m(parcel, z10);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str;
                fullWallet.b = str2;
                fullWallet.c = rVar;
                fullWallet.d = str3;
                fullWallet.e = qVar;
                fullWallet.f = qVar2;
                fullWallet.h = strArr;
                fullWallet.n = userAddress;
                fullWallet.r = userAddress2;
                fullWallet.s = dVarArr;
                fullWallet.w = kVar;
                return fullWallet;
            case 1:
                int z11 = xb.z(parcel);
                String str4 = null;
                int i7 = 0;
                String str5 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        str4 = xb.h(parcel, readInt2);
                    } else if (c10 == 3) {
                        str5 = xb.h(parcel, readInt2);
                    } else if (c10 != 4) {
                        xb.y(parcel, readInt2);
                    } else {
                        i7 = xb.u(parcel, readInt2);
                    }
                }
                xb.m(parcel, z11);
                d dVar = new d();
                dVar.a = str4;
                dVar.b = str5;
                dVar.c = i7;
                return dVar;
            case 2:
                int z12 = xb.z(parcel);
                ArrayList arrayList = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                boolean z13 = false;
                String str8 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            arrayList = xb.e(parcel, readInt3);
                            break;
                        case 3:
                        default:
                            xb.y(parcel, readInt3);
                            break;
                        case 4:
                            str8 = xb.h(parcel, readInt3);
                            break;
                        case 5:
                            str6 = xb.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = xb.e(parcel, readInt3);
                            break;
                        case 7:
                            z13 = xb.n(parcel, readInt3);
                            break;
                        case '\b':
                            str7 = xb.h(parcel, readInt3);
                            break;
                    }
                }
                xb.m(parcel, z12);
                e eVar = new e();
                eVar.a = arrayList;
                eVar.b = str8;
                eVar.c = str6;
                eVar.d = arrayList2;
                eVar.e = z13;
                eVar.f = str7;
                return eVar;
            case 3:
                int z14 = xb.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = null;
                ArrayList arrayList6 = arrayList4;
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                z8.f fVar = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                z8.c cVar = null;
                int i10 = 0;
                boolean z15 = false;
                String str20 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    z8.f fVar2 = fVar;
                    switch ((char) readInt4) {
                        case 2:
                            str9 = xb.h(parcel, readInt4);
                            break;
                        case 3:
                            str20 = xb.h(parcel, readInt4);
                            break;
                        case 4:
                            str12 = xb.h(parcel, readInt4);
                            break;
                        case 5:
                            str13 = xb.h(parcel, readInt4);
                            break;
                        case 6:
                            str14 = xb.h(parcel, readInt4);
                            break;
                        case 7:
                            str15 = xb.h(parcel, readInt4);
                            break;
                        case '\b':
                            str16 = xb.h(parcel, readInt4);
                            break;
                        case '\t':
                            str17 = xb.h(parcel, readInt4);
                            break;
                        case '\n':
                            str11 = xb.h(parcel, readInt4);
                            break;
                        case 11:
                            str10 = xb.h(parcel, readInt4);
                            break;
                        case '\f':
                            i10 = xb.u(parcel, readInt4);
                            break;
                        case '\r':
                            arrayList3 = xb.l(parcel, readInt4, z8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (z8.f) xb.g(parcel, readInt4, z8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList6 = xb.l(parcel, readInt4, LatLng.CREATOR);
                            break;
                        case 16:
                            str18 = xb.h(parcel, readInt4);
                            break;
                        case 17:
                            str19 = xb.h(parcel, readInt4);
                            break;
                        case 18:
                            arrayList7 = xb.l(parcel, readInt4, z8.b.CREATOR);
                            break;
                        case 19:
                            z15 = xb.n(parcel, readInt4);
                            break;
                        case 20:
                            arrayList8 = xb.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 21:
                            arrayList9 = xb.l(parcel, readInt4, z8.e.CREATOR);
                            break;
                        case 22:
                            arrayList10 = xb.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 23:
                            cVar = (z8.c) xb.g(parcel, readInt4, z8.c.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt4);
                            break;
                    }
                    fVar = fVar2;
                }
                xb.m(parcel, z14);
                f fVar3 = new f();
                fVar3.a = str9;
                fVar3.b = str20;
                fVar3.c = str12;
                fVar3.d = str13;
                fVar3.e = str14;
                fVar3.f = str15;
                fVar3.h = str16;
                fVar3.n = str17;
                fVar3.r = str11;
                fVar3.s = str10;
                fVar3.w = i10;
                fVar3.x = arrayList3;
                fVar3.y = fVar;
                fVar3.E = arrayList6;
                fVar3.F = str18;
                fVar3.G = str19;
                fVar3.H = arrayList7;
                fVar3.I = z15;
                fVar3.J = arrayList8;
                fVar3.K = arrayList9;
                fVar3.L = arrayList10;
                fVar3.M = cVar;
                return fVar3;
            case 4:
                int z16 = xb.z(parcel);
                String str21 = null;
                String str22 = null;
                String[] strArr2 = null;
                String str23 = null;
                q qVar3 = null;
                q qVar4 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str21 = xb.h(parcel, readInt5);
                            break;
                        case 3:
                            str22 = xb.h(parcel, readInt5);
                            break;
                        case 4:
                            strArr2 = xb.i(parcel, readInt5);
                            break;
                        case 5:
                            str23 = xb.h(parcel, readInt5);
                            break;
                        case 6:
                            qVar3 = (q) xb.g(parcel, readInt5, q.CREATOR);
                            break;
                        case 7:
                            qVar4 = (q) xb.g(parcel, readInt5, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) xb.k(parcel, readInt5, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) xb.k(parcel, readInt5, g.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) xb.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress4 = (UserAddress) xb.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) xb.k(parcel, readInt5, d.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt5);
                            break;
                    }
                }
                xb.m(parcel, z16);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str21;
                maskedWallet.b = str22;
                maskedWallet.c = strArr2;
                maskedWallet.d = str23;
                maskedWallet.e = qVar3;
                maskedWallet.f = qVar4;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress3;
                maskedWallet.s = userAddress4;
                maskedWallet.w = dVarArr2;
                return maskedWallet;
            case 5:
                int z17 = xb.z(parcel);
                int i11 = 0;
                String str24 = null;
                String str25 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        i11 = xb.u(parcel, readInt6);
                    } else if (c11 == 2) {
                        str24 = xb.h(parcel, readInt6);
                    } else if (c11 == 3) {
                        str25 = xb.h(parcel, readInt6);
                    } else if (c11 != 4) {
                        xb.y(parcel, readInt6);
                    } else {
                        commonWalletObject = (CommonWalletObject) xb.g(parcel, readInt6, CommonWalletObject.CREATOR);
                    }
                }
                xb.m(parcel, z17);
                return new g(i11, str24, str25, commonWalletObject);
            case 6:
                int z18 = xb.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        xb.y(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) xb.g(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                xb.m(parcel, z18);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 7:
                int z19 = xb.z(parcel);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                String str26 = null;
                ArrayList arrayList14 = arrayList13;
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                String str27 = null;
                String str28 = null;
                z8.f fVar4 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                int i12 = 0;
                boolean z20 = false;
                String str35 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    String str36 = str28;
                    switch ((char) readInt8) {
                        case 2:
                            str26 = xb.h(parcel, readInt8);
                            break;
                        case 3:
                            str35 = xb.h(parcel, readInt8);
                            break;
                        case 4:
                            str29 = xb.h(parcel, readInt8);
                            break;
                        case 5:
                            str30 = xb.h(parcel, readInt8);
                            break;
                        case 6:
                            str31 = xb.h(parcel, readInt8);
                            break;
                        case 7:
                            str32 = xb.h(parcel, readInt8);
                            break;
                        case '\b':
                            str33 = xb.h(parcel, readInt8);
                            break;
                        case '\t':
                            str27 = xb.h(parcel, readInt8);
                            break;
                        case '\n':
                            i12 = xb.u(parcel, readInt8);
                            break;
                        case 11:
                            arrayList11 = xb.l(parcel, readInt8, z8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (z8.f) xb.g(parcel, readInt8, z8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList12 = xb.l(parcel, readInt8, LatLng.CREATOR);
                            break;
                        case 14:
                            str28 = xb.h(parcel, readInt8);
                            continue;
                        case 15:
                            str34 = xb.h(parcel, readInt8);
                            break;
                        case 16:
                            arrayList14 = xb.l(parcel, readInt8, z8.b.CREATOR);
                            break;
                        case 17:
                            z20 = xb.n(parcel, readInt8);
                            break;
                        case 18:
                            arrayList15 = xb.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        case 19:
                            arrayList16 = xb.l(parcel, readInt8, z8.e.CREATOR);
                            break;
                        case 20:
                            arrayList17 = xb.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt8);
                            break;
                    }
                    str28 = str36;
                }
                xb.m(parcel, z19);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str26;
                commonWalletObject2.b = str35;
                commonWalletObject2.c = str29;
                commonWalletObject2.d = str30;
                commonWalletObject2.e = str31;
                commonWalletObject2.f = str32;
                commonWalletObject2.h = str33;
                commonWalletObject2.n = str27;
                commonWalletObject2.r = i12;
                commonWalletObject2.s = arrayList11;
                commonWalletObject2.w = fVar4;
                commonWalletObject2.x = arrayList12;
                commonWalletObject2.y = str28;
                commonWalletObject2.E = str34;
                commonWalletObject2.F = arrayList14;
                commonWalletObject2.G = z20;
                commonWalletObject2.H = arrayList15;
                commonWalletObject2.I = arrayList16;
                commonWalletObject2.J = arrayList17;
                return commonWalletObject2;
            case 8:
                int z21 = xb.z(parcel);
                String str37 = null;
                String str38 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 2) {
                        str37 = xb.h(parcel, readInt9);
                    } else if (c12 != 3) {
                        xb.y(parcel, readInt9);
                    } else {
                        str38 = xb.h(parcel, readInt9);
                    }
                }
                xb.m(parcel, z21);
                z8.a aVar = new z8.a();
                aVar.a = str37;
                aVar.b = str38;
                return aVar;
            case 9:
                int z22 = xb.z(parcel);
                ArrayList arrayList18 = new ArrayList();
                String str39 = null;
                String str40 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        str39 = xb.h(parcel, readInt10);
                    } else if (c13 == 3) {
                        str40 = xb.h(parcel, readInt10);
                    } else if (c13 != 4) {
                        xb.y(parcel, readInt10);
                    } else {
                        arrayList18 = xb.l(parcel, readInt10, z8.a.CREATOR);
                    }
                }
                xb.m(parcel, z22);
                z8.b bVar = new z8.b();
                bVar.a = str39;
                bVar.b = str40;
                bVar.c = arrayList18;
                return bVar;
            case 10:
                int z23 = xb.z(parcel);
                int i13 = 0;
                String str41 = null;
                int i14 = -1;
                long j3 = 0;
                double d = 0.0d;
                String str42 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            i13 = xb.u(parcel, readInt11);
                            break;
                        case 3:
                            str41 = xb.h(parcel, readInt11);
                            break;
                        case 4:
                            d = xb.q(parcel, readInt11);
                            break;
                        case 5:
                            str42 = xb.h(parcel, readInt11);
                            break;
                        case 6:
                            j3 = xb.w(parcel, readInt11);
                            break;
                        case 7:
                            i14 = xb.u(parcel, readInt11);
                            break;
                        default:
                            xb.y(parcel, readInt11);
                            break;
                    }
                }
                xb.m(parcel, z23);
                z8.d dVar2 = new z8.d();
                dVar2.a = i13;
                dVar2.b = str41;
                dVar2.c = d;
                dVar2.d = str42;
                dVar2.e = j3;
                dVar2.f = i14;
                return dVar2;
            case 11:
                int z24 = xb.z(parcel);
                String str43 = null;
                z8.d dVar3 = null;
                z8.f fVar5 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 2) {
                        str43 = xb.h(parcel, readInt12);
                    } else if (c14 == 3) {
                        dVar3 = (z8.d) xb.g(parcel, readInt12, z8.d.CREATOR);
                    } else if (c14 != 5) {
                        xb.y(parcel, readInt12);
                    } else {
                        fVar5 = (z8.f) xb.g(parcel, readInt12, z8.f.CREATOR);
                    }
                }
                xb.m(parcel, z24);
                z8.c cVar2 = new z8.c();
                cVar2.a = str43;
                cVar2.b = dVar3;
                cVar2.c = fVar5;
                return cVar2;
            case 12:
                int z25 = xb.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        str44 = xb.h(parcel, readInt13);
                    } else if (c15 != 3) {
                        xb.y(parcel, readInt13);
                    } else {
                        str45 = xb.h(parcel, readInt13);
                    }
                }
                xb.m(parcel, z25);
                z8.e eVar2 = new z8.e();
                eVar2.a = str44;
                eVar2.b = str45;
                return eVar2;
            case 13:
                int z26 = xb.z(parcel);
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 2) {
                        j10 = xb.w(parcel, readInt14);
                    } else if (c16 != 3) {
                        xb.y(parcel, readInt14);
                    } else {
                        j11 = xb.w(parcel, readInt14);
                    }
                }
                xb.m(parcel, z26);
                z8.f fVar6 = new z8.f();
                fVar6.a = j10;
                fVar6.b = j11;
                return fVar6;
            case 14:
                int z27 = xb.z(parcel);
                String str46 = null;
                String str47 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 2) {
                        str46 = xb.h(parcel, readInt15);
                    } else if (c17 != 3) {
                        xb.y(parcel, readInt15);
                    } else {
                        str47 = xb.h(parcel, readInt15);
                    }
                }
                xb.m(parcel, z27);
                z8.g gVar = new z8.g();
                gVar.a = str46;
                gVar.b = str47;
                return gVar;
            default:
                int z28 = xb.z(parcel);
                String str48 = null;
                String str49 = null;
                z8.f fVar7 = null;
                z8.g gVar2 = null;
                z8.g gVar3 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 2) {
                        str48 = xb.h(parcel, readInt16);
                    } else if (c18 == 3) {
                        str49 = xb.h(parcel, readInt16);
                    } else if (c18 == 4) {
                        fVar7 = (z8.f) xb.g(parcel, readInt16, z8.f.CREATOR);
                    } else if (c18 == 5) {
                        gVar2 = (z8.g) xb.g(parcel, readInt16, z8.g.CREATOR);
                    } else if (c18 != 6) {
                        xb.y(parcel, readInt16);
                    } else {
                        gVar3 = (z8.g) xb.g(parcel, readInt16, z8.g.CREATOR);
                    }
                }
                xb.m(parcel, z28);
                z8.h hVar2 = new z8.h();
                hVar2.a = str48;
                hVar2.b = str49;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new FullWallet[i7];
            case 1:
                return new d[i7];
            case 2:
                return new e[i7];
            case 3:
                return new f[i7];
            case 4:
                return new MaskedWallet[i7];
            case 5:
                return new g[i7];
            case 6:
                return new h[i7];
            case 7:
                return new CommonWalletObject[i7];
            case 8:
                return new z8.a[i7];
            case 9:
                return new z8.b[i7];
            case 10:
                return new z8.d[i7];
            case 11:
                return new z8.c[i7];
            case 12:
                return new z8.e[i7];
            case 13:
                return new z8.f[i7];
            case 14:
                return new z8.g[i7];
            default:
                return new z8.h[i7];
        }
    }
}
