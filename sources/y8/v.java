package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = wb.z(parcel);
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
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = wb.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = wb.h(parcel, readInt);
                            break;
                        case 4:
                            rVar = (r) wb.g(parcel, readInt, r.CREATOR);
                            break;
                        case 5:
                            str3 = wb.h(parcel, readInt);
                            break;
                        case 6:
                            qVar = (q) wb.g(parcel, readInt, q.CREATOR);
                            break;
                        case 7:
                            qVar2 = (q) wb.g(parcel, readInt, q.CREATOR);
                            break;
                        case '\b':
                            strArr = wb.i(parcel, readInt);
                            break;
                        case '\t':
                            userAddress = (UserAddress) wb.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) wb.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) wb.k(parcel, readInt, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) wb.g(parcel, readInt, k.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt);
                            break;
                    }
                }
                wb.m(parcel, z9);
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
                int z10 = wb.z(parcel);
                String str4 = null;
                int i7 = 0;
                String str5 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        str4 = wb.h(parcel, readInt2);
                    } else if (c10 == 3) {
                        str5 = wb.h(parcel, readInt2);
                    } else if (c10 != 4) {
                        wb.y(parcel, readInt2);
                    } else {
                        i7 = wb.u(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                d dVar = new d();
                dVar.a = str4;
                dVar.b = str5;
                dVar.c = i7;
                return dVar;
            case 2:
                int z11 = wb.z(parcel);
                ArrayList arrayList = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                boolean z12 = false;
                String str8 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            arrayList = wb.e(parcel, readInt3);
                            break;
                        case 3:
                        default:
                            wb.y(parcel, readInt3);
                            break;
                        case 4:
                            str8 = wb.h(parcel, readInt3);
                            break;
                        case 5:
                            str6 = wb.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = wb.e(parcel, readInt3);
                            break;
                        case 7:
                            z12 = wb.n(parcel, readInt3);
                            break;
                        case '\b':
                            str7 = wb.h(parcel, readInt3);
                            break;
                    }
                }
                wb.m(parcel, z11);
                e eVar = new e();
                eVar.a = arrayList;
                eVar.b = str8;
                eVar.c = str6;
                eVar.d = arrayList2;
                eVar.e = z12;
                eVar.f = str7;
                return eVar;
            case 3:
                int z13 = wb.z(parcel);
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
                boolean z14 = false;
                String str20 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    z8.f fVar2 = fVar;
                    switch ((char) readInt4) {
                        case 2:
                            str9 = wb.h(parcel, readInt4);
                            break;
                        case 3:
                            str20 = wb.h(parcel, readInt4);
                            break;
                        case 4:
                            str12 = wb.h(parcel, readInt4);
                            break;
                        case 5:
                            str13 = wb.h(parcel, readInt4);
                            break;
                        case 6:
                            str14 = wb.h(parcel, readInt4);
                            break;
                        case 7:
                            str15 = wb.h(parcel, readInt4);
                            break;
                        case '\b':
                            str16 = wb.h(parcel, readInt4);
                            break;
                        case '\t':
                            str17 = wb.h(parcel, readInt4);
                            break;
                        case '\n':
                            str11 = wb.h(parcel, readInt4);
                            break;
                        case 11:
                            str10 = wb.h(parcel, readInt4);
                            break;
                        case '\f':
                            i10 = wb.u(parcel, readInt4);
                            break;
                        case '\r':
                            arrayList3 = wb.l(parcel, readInt4, z8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (z8.f) wb.g(parcel, readInt4, z8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList6 = wb.l(parcel, readInt4, LatLng.CREATOR);
                            break;
                        case 16:
                            str18 = wb.h(parcel, readInt4);
                            break;
                        case 17:
                            str19 = wb.h(parcel, readInt4);
                            break;
                        case 18:
                            arrayList7 = wb.l(parcel, readInt4, z8.b.CREATOR);
                            break;
                        case 19:
                            z14 = wb.n(parcel, readInt4);
                            break;
                        case 20:
                            arrayList8 = wb.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 21:
                            arrayList9 = wb.l(parcel, readInt4, z8.e.CREATOR);
                            break;
                        case 22:
                            arrayList10 = wb.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 23:
                            cVar = (z8.c) wb.g(parcel, readInt4, z8.c.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt4);
                            break;
                    }
                    fVar = fVar2;
                }
                wb.m(parcel, z13);
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
                fVar3.D = arrayList6;
                fVar3.E = str18;
                fVar3.F = str19;
                fVar3.G = arrayList7;
                fVar3.H = z14;
                fVar3.I = arrayList8;
                fVar3.J = arrayList9;
                fVar3.K = arrayList10;
                fVar3.L = cVar;
                return fVar3;
            case 4:
                int z15 = wb.z(parcel);
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
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str21 = wb.h(parcel, readInt5);
                            break;
                        case 3:
                            str22 = wb.h(parcel, readInt5);
                            break;
                        case 4:
                            strArr2 = wb.i(parcel, readInt5);
                            break;
                        case 5:
                            str23 = wb.h(parcel, readInt5);
                            break;
                        case 6:
                            qVar3 = (q) wb.g(parcel, readInt5, q.CREATOR);
                            break;
                        case 7:
                            qVar4 = (q) wb.g(parcel, readInt5, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) wb.k(parcel, readInt5, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) wb.k(parcel, readInt5, g.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) wb.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress4 = (UserAddress) wb.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) wb.k(parcel, readInt5, d.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt5);
                            break;
                    }
                }
                wb.m(parcel, z15);
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
                int z16 = wb.z(parcel);
                int i11 = 0;
                String str24 = null;
                String str25 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        i11 = wb.u(parcel, readInt6);
                    } else if (c11 == 2) {
                        str24 = wb.h(parcel, readInt6);
                    } else if (c11 == 3) {
                        str25 = wb.h(parcel, readInt6);
                    } else if (c11 != 4) {
                        wb.y(parcel, readInt6);
                    } else {
                        commonWalletObject = (CommonWalletObject) wb.g(parcel, readInt6, CommonWalletObject.CREATOR);
                    }
                }
                wb.m(parcel, z16);
                return new g(i11, str24, str25, commonWalletObject);
            case 6:
                int z17 = wb.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        wb.y(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) wb.g(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                wb.m(parcel, z17);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 7:
                int z18 = wb.z(parcel);
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
                boolean z19 = false;
                String str35 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    String str36 = str28;
                    switch ((char) readInt8) {
                        case 2:
                            str26 = wb.h(parcel, readInt8);
                            break;
                        case 3:
                            str35 = wb.h(parcel, readInt8);
                            break;
                        case 4:
                            str29 = wb.h(parcel, readInt8);
                            break;
                        case 5:
                            str30 = wb.h(parcel, readInt8);
                            break;
                        case 6:
                            str31 = wb.h(parcel, readInt8);
                            break;
                        case 7:
                            str32 = wb.h(parcel, readInt8);
                            break;
                        case '\b':
                            str33 = wb.h(parcel, readInt8);
                            break;
                        case '\t':
                            str27 = wb.h(parcel, readInt8);
                            break;
                        case '\n':
                            i12 = wb.u(parcel, readInt8);
                            break;
                        case 11:
                            arrayList11 = wb.l(parcel, readInt8, z8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (z8.f) wb.g(parcel, readInt8, z8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList12 = wb.l(parcel, readInt8, LatLng.CREATOR);
                            break;
                        case 14:
                            str28 = wb.h(parcel, readInt8);
                            continue;
                        case 15:
                            str34 = wb.h(parcel, readInt8);
                            break;
                        case 16:
                            arrayList14 = wb.l(parcel, readInt8, z8.b.CREATOR);
                            break;
                        case 17:
                            z19 = wb.n(parcel, readInt8);
                            break;
                        case 18:
                            arrayList15 = wb.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        case 19:
                            arrayList16 = wb.l(parcel, readInt8, z8.e.CREATOR);
                            break;
                        case 20:
                            arrayList17 = wb.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt8);
                            break;
                    }
                    str28 = str36;
                }
                wb.m(parcel, z18);
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
                commonWalletObject2.D = str34;
                commonWalletObject2.E = arrayList14;
                commonWalletObject2.F = z19;
                commonWalletObject2.G = arrayList15;
                commonWalletObject2.H = arrayList16;
                commonWalletObject2.I = arrayList17;
                return commonWalletObject2;
            case 8:
                int z20 = wb.z(parcel);
                String str37 = null;
                String str38 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 2) {
                        str37 = wb.h(parcel, readInt9);
                    } else if (c12 != 3) {
                        wb.y(parcel, readInt9);
                    } else {
                        str38 = wb.h(parcel, readInt9);
                    }
                }
                wb.m(parcel, z20);
                z8.a aVar = new z8.a();
                aVar.a = str37;
                aVar.b = str38;
                return aVar;
            case 9:
                int z21 = wb.z(parcel);
                ArrayList arrayList18 = new ArrayList();
                String str39 = null;
                String str40 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        str39 = wb.h(parcel, readInt10);
                    } else if (c13 == 3) {
                        str40 = wb.h(parcel, readInt10);
                    } else if (c13 != 4) {
                        wb.y(parcel, readInt10);
                    } else {
                        arrayList18 = wb.l(parcel, readInt10, z8.a.CREATOR);
                    }
                }
                wb.m(parcel, z21);
                z8.b bVar = new z8.b();
                bVar.a = str39;
                bVar.b = str40;
                bVar.c = arrayList18;
                return bVar;
            case 10:
                int z22 = wb.z(parcel);
                int i13 = 0;
                String str41 = null;
                int i14 = -1;
                long j3 = 0;
                double d = 0.0d;
                String str42 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            i13 = wb.u(parcel, readInt11);
                            break;
                        case 3:
                            str41 = wb.h(parcel, readInt11);
                            break;
                        case 4:
                            d = wb.q(parcel, readInt11);
                            break;
                        case 5:
                            str42 = wb.h(parcel, readInt11);
                            break;
                        case 6:
                            j3 = wb.w(parcel, readInt11);
                            break;
                        case 7:
                            i14 = wb.u(parcel, readInt11);
                            break;
                        default:
                            wb.y(parcel, readInt11);
                            break;
                    }
                }
                wb.m(parcel, z22);
                z8.d dVar2 = new z8.d();
                dVar2.a = i13;
                dVar2.b = str41;
                dVar2.c = d;
                dVar2.d = str42;
                dVar2.e = j3;
                dVar2.f = i14;
                return dVar2;
            case 11:
                int z23 = wb.z(parcel);
                String str43 = null;
                z8.d dVar3 = null;
                z8.f fVar5 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 2) {
                        str43 = wb.h(parcel, readInt12);
                    } else if (c14 == 3) {
                        dVar3 = (z8.d) wb.g(parcel, readInt12, z8.d.CREATOR);
                    } else if (c14 != 5) {
                        wb.y(parcel, readInt12);
                    } else {
                        fVar5 = (z8.f) wb.g(parcel, readInt12, z8.f.CREATOR);
                    }
                }
                wb.m(parcel, z23);
                z8.c cVar2 = new z8.c();
                cVar2.a = str43;
                cVar2.b = dVar3;
                cVar2.c = fVar5;
                return cVar2;
            case 12:
                int z24 = wb.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        str44 = wb.h(parcel, readInt13);
                    } else if (c15 != 3) {
                        wb.y(parcel, readInt13);
                    } else {
                        str45 = wb.h(parcel, readInt13);
                    }
                }
                wb.m(parcel, z24);
                z8.e eVar2 = new z8.e();
                eVar2.a = str44;
                eVar2.b = str45;
                return eVar2;
            case 13:
                int z25 = wb.z(parcel);
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 2) {
                        j10 = wb.w(parcel, readInt14);
                    } else if (c16 != 3) {
                        wb.y(parcel, readInt14);
                    } else {
                        j11 = wb.w(parcel, readInt14);
                    }
                }
                wb.m(parcel, z25);
                z8.f fVar6 = new z8.f();
                fVar6.a = j10;
                fVar6.b = j11;
                return fVar6;
            case 14:
                int z26 = wb.z(parcel);
                String str46 = null;
                String str47 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 2) {
                        str46 = wb.h(parcel, readInt15);
                    } else if (c17 != 3) {
                        wb.y(parcel, readInt15);
                    } else {
                        str47 = wb.h(parcel, readInt15);
                    }
                }
                wb.m(parcel, z26);
                z8.g gVar = new z8.g();
                gVar.a = str46;
                gVar.b = str47;
                return gVar;
            default:
                int z27 = wb.z(parcel);
                String str48 = null;
                String str49 = null;
                z8.f fVar7 = null;
                z8.g gVar2 = null;
                z8.g gVar3 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 2) {
                        str48 = wb.h(parcel, readInt16);
                    } else if (c18 == 3) {
                        str49 = wb.h(parcel, readInt16);
                    } else if (c18 == 4) {
                        fVar7 = (z8.f) wb.g(parcel, readInt16, z8.f.CREATOR);
                    } else if (c18 == 5) {
                        gVar2 = (z8.g) wb.g(parcel, readInt16, z8.g.CREATOR);
                    } else if (c18 != 6) {
                        wb.y(parcel, readInt16);
                    } else {
                        gVar3 = (z8.g) wb.g(parcel, readInt16, z8.g.CREATOR);
                    }
                }
                wb.m(parcel, z27);
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
