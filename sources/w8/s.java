package w8;

import a8.bf;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = bf.z(parcel);
                String str = null;
                int i10 = 0;
                int i11 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = bf.h(parcel, readInt);
                    } else if (c10 == 3) {
                        str2 = bf.h(parcel, readInt);
                    } else if (c10 == 4) {
                        i10 = bf.u(parcel, readInt);
                    } else if (c10 != 5) {
                        bf.y(parcel, readInt);
                    } else {
                        i11 = bf.u(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new r(i10, i11, str, str2);
            case 1:
                int z11 = bf.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        bf.y(parcel, readInt2);
                    } else {
                        arrayList = bf.j(parcel, readInt2);
                    }
                }
                bf.m(parcel, z11);
                m mVar = new m();
                mVar.a = arrayList;
                return mVar;
            case 2:
                int z12 = bf.z(parcel);
                int i12 = 0;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i12 = bf.u(parcel, readInt3);
                    } else if (c11 == 2) {
                        str3 = bf.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        bf.y(parcel, readInt3);
                    } else {
                        str4 = bf.h(parcel, readInt3);
                    }
                }
                bf.m(parcel, z12);
                n nVar = new n();
                nVar.a = i12;
                nVar.b = str3;
                nVar.c = str4;
                return nVar;
            case 3:
                int z13 = bf.z(parcel);
                String str5 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        str5 = bf.h(parcel, readInt4);
                    } else if (c12 != 3) {
                        bf.y(parcel, readInt4);
                    } else {
                        bundle = bf.a(parcel, readInt4);
                    }
                }
                bf.m(parcel, z13);
                t tVar = new t();
                tVar.a = str5;
                tVar.b = bundle;
                return tVar;
            case 4:
                int z14 = bf.z(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                boolean z15 = false;
                String str15 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str6 = bf.h(parcel, readInt5);
                            break;
                        case 3:
                            str15 = bf.h(parcel, readInt5);
                            break;
                        case 4:
                            str7 = bf.h(parcel, readInt5);
                            break;
                        case 5:
                            str8 = bf.h(parcel, readInt5);
                            break;
                        case 6:
                            str9 = bf.h(parcel, readInt5);
                            break;
                        case 7:
                            str10 = bf.h(parcel, readInt5);
                            break;
                        case '\b':
                            str11 = bf.h(parcel, readInt5);
                            break;
                        case '\t':
                            str12 = bf.h(parcel, readInt5);
                            break;
                        case '\n':
                            str13 = bf.h(parcel, readInt5);
                            break;
                        case 11:
                            z15 = bf.n(parcel, readInt5);
                            break;
                        case '\f':
                            str14 = bf.h(parcel, readInt5);
                            break;
                        default:
                            bf.y(parcel, readInt5);
                            break;
                    }
                }
                bf.m(parcel, z14);
                q qVar = new q();
                qVar.a = str6;
                qVar.b = str15;
                qVar.c = str7;
                qVar.d = str8;
                qVar.e = str9;
                qVar.f = str10;
                qVar.h = str11;
                qVar.n = str12;
                qVar.r = str13;
                qVar.s = z15;
                qVar.v = str14;
                return qVar;
            case 5:
                int z16 = bf.z(parcel);
                String str16 = null;
                String str17 = null;
                UserAddress userAddress = null;
                int i13 = 0;
                String str18 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        str16 = bf.h(parcel, readInt6);
                    } else if (c13 == 2) {
                        str18 = bf.h(parcel, readInt6);
                    } else if (c13 == 3) {
                        str17 = bf.h(parcel, readInt6);
                    } else if (c13 == 4) {
                        i13 = bf.u(parcel, readInt6);
                    } else if (c13 != 5) {
                        bf.y(parcel, readInt6);
                    } else {
                        userAddress = (UserAddress) bf.g(parcel, readInt6, UserAddress.CREATOR);
                    }
                }
                bf.m(parcel, z16);
                b bVar = new b();
                bVar.a = str16;
                bVar.b = str18;
                bVar.c = str17;
                bVar.d = i13;
                bVar.e = userAddress;
                return bVar;
            case 6:
                int z17 = bf.z(parcel);
                ArrayList arrayList2 = null;
                boolean z18 = false;
                boolean z19 = true;
                int i14 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        arrayList2 = bf.e(parcel, readInt7);
                    } else if (c14 == 2) {
                        z19 = bf.n(parcel, readInt7);
                    } else if (c14 == 3) {
                        z18 = bf.n(parcel, readInt7);
                    } else if (c14 != 4) {
                        bf.y(parcel, readInt7);
                    } else {
                        i14 = bf.u(parcel, readInt7);
                    }
                }
                bf.m(parcel, z17);
                c cVar = new c();
                cVar.a = arrayList2;
                cVar.b = z19;
                cVar.c = z18;
                cVar.d = i14;
                return cVar;
            case 7:
                int z20 = bf.z(parcel);
                String str19 = null;
                String str20 = null;
                r rVar = null;
                String str21 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str19 = bf.h(parcel, readInt8);
                            break;
                        case 3:
                            str20 = bf.h(parcel, readInt8);
                            break;
                        case 4:
                            rVar = (r) bf.g(parcel, readInt8, r.CREATOR);
                            break;
                        case 5:
                            str21 = bf.h(parcel, readInt8);
                            break;
                        case 6:
                            qVar2 = (q) bf.g(parcel, readInt8, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) bf.g(parcel, readInt8, q.CREATOR);
                            break;
                        case '\b':
                            strArr = bf.i(parcel, readInt8);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) bf.g(parcel, readInt8, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) bf.g(parcel, readInt8, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) bf.k(parcel, readInt8, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) bf.g(parcel, readInt8, k.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt8);
                            break;
                    }
                }
                bf.m(parcel, z20);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str19;
                fullWallet.b = str20;
                fullWallet.c = rVar;
                fullWallet.d = str21;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress2;
                fullWallet.r = userAddress3;
                fullWallet.s = dVarArr;
                fullWallet.v = kVar;
                return fullWallet;
            case 8:
                int z21 = bf.z(parcel);
                String str22 = null;
                int i15 = 0;
                String str23 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        str22 = bf.h(parcel, readInt9);
                    } else if (c15 == 3) {
                        str23 = bf.h(parcel, readInt9);
                    } else if (c15 != 4) {
                        bf.y(parcel, readInt9);
                    } else {
                        i15 = bf.u(parcel, readInt9);
                    }
                }
                bf.m(parcel, z21);
                d dVar = new d();
                dVar.a = str22;
                dVar.b = str23;
                dVar.c = i15;
                return dVar;
            case 9:
                int z22 = bf.z(parcel);
                ArrayList arrayList3 = null;
                String str24 = null;
                ArrayList arrayList4 = null;
                String str25 = null;
                boolean z23 = false;
                String str26 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            arrayList3 = bf.e(parcel, readInt10);
                            break;
                        case 3:
                        default:
                            bf.y(parcel, readInt10);
                            break;
                        case 4:
                            str26 = bf.h(parcel, readInt10);
                            break;
                        case 5:
                            str24 = bf.h(parcel, readInt10);
                            break;
                        case 6:
                            arrayList4 = bf.e(parcel, readInt10);
                            break;
                        case 7:
                            z23 = bf.n(parcel, readInt10);
                            break;
                        case '\b':
                            str25 = bf.h(parcel, readInt10);
                            break;
                    }
                }
                bf.m(parcel, z22);
                e eVar = new e();
                eVar.a = arrayList3;
                eVar.b = str26;
                eVar.c = str24;
                eVar.d = arrayList4;
                eVar.e = z23;
                eVar.f = str25;
                return eVar;
            case 10:
                int z24 = bf.z(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str27 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                x8.f fVar = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                x8.c cVar2 = null;
                int i16 = 0;
                boolean z25 = false;
                String str38 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    x8.f fVar2 = fVar;
                    switch ((char) readInt11) {
                        case 2:
                            str27 = bf.h(parcel, readInt11);
                            break;
                        case 3:
                            str38 = bf.h(parcel, readInt11);
                            break;
                        case 4:
                            str30 = bf.h(parcel, readInt11);
                            break;
                        case 5:
                            str31 = bf.h(parcel, readInt11);
                            break;
                        case 6:
                            str32 = bf.h(parcel, readInt11);
                            break;
                        case 7:
                            str33 = bf.h(parcel, readInt11);
                            break;
                        case '\b':
                            str34 = bf.h(parcel, readInt11);
                            break;
                        case '\t':
                            str35 = bf.h(parcel, readInt11);
                            break;
                        case '\n':
                            str29 = bf.h(parcel, readInt11);
                            break;
                        case 11:
                            str28 = bf.h(parcel, readInt11);
                            break;
                        case '\f':
                            i16 = bf.u(parcel, readInt11);
                            break;
                        case '\r':
                            arrayList5 = bf.l(parcel, readInt11, x8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (x8.f) bf.g(parcel, readInt11, x8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = bf.l(parcel, readInt11, LatLng.CREATOR);
                            break;
                        case 16:
                            str36 = bf.h(parcel, readInt11);
                            break;
                        case 17:
                            str37 = bf.h(parcel, readInt11);
                            break;
                        case 18:
                            arrayList9 = bf.l(parcel, readInt11, x8.b.CREATOR);
                            break;
                        case 19:
                            z25 = bf.n(parcel, readInt11);
                            break;
                        case 20:
                            arrayList10 = bf.l(parcel, readInt11, x8.g.CREATOR);
                            break;
                        case 21:
                            arrayList11 = bf.l(parcel, readInt11, x8.e.CREATOR);
                            break;
                        case 22:
                            arrayList12 = bf.l(parcel, readInt11, x8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (x8.c) bf.g(parcel, readInt11, x8.c.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt11);
                            break;
                    }
                    fVar = fVar2;
                }
                bf.m(parcel, z24);
                f fVar3 = new f();
                fVar3.a = str27;
                fVar3.b = str38;
                fVar3.c = str30;
                fVar3.d = str31;
                fVar3.e = str32;
                fVar3.f = str33;
                fVar3.h = str34;
                fVar3.n = str35;
                fVar3.r = str29;
                fVar3.s = str28;
                fVar3.v = i16;
                fVar3.w = arrayList5;
                fVar3.x = fVar;
                fVar3.y = arrayList8;
                fVar3.E = str36;
                fVar3.F = str37;
                fVar3.G = arrayList9;
                fVar3.H = z25;
                fVar3.I = arrayList10;
                fVar3.J = arrayList11;
                fVar3.K = arrayList12;
                fVar3.L = cVar2;
                return fVar3;
            case 11:
                int z26 = bf.z(parcel);
                String str39 = null;
                String str40 = null;
                String[] strArr2 = null;
                String str41 = null;
                q qVar4 = null;
                q qVar5 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            str39 = bf.h(parcel, readInt12);
                            break;
                        case 3:
                            str40 = bf.h(parcel, readInt12);
                            break;
                        case 4:
                            strArr2 = bf.i(parcel, readInt12);
                            break;
                        case 5:
                            str41 = bf.h(parcel, readInt12);
                            break;
                        case 6:
                            qVar4 = (q) bf.g(parcel, readInt12, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) bf.g(parcel, readInt12, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) bf.k(parcel, readInt12, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) bf.k(parcel, readInt12, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) bf.g(parcel, readInt12, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) bf.g(parcel, readInt12, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) bf.k(parcel, readInt12, d.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt12);
                            break;
                    }
                }
                bf.m(parcel, z26);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str39;
                maskedWallet.b = str40;
                maskedWallet.c = strArr2;
                maskedWallet.d = str41;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress4;
                maskedWallet.s = userAddress5;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 12:
                int z27 = bf.z(parcel);
                int i17 = 0;
                String str42 = null;
                String str43 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        i17 = bf.u(parcel, readInt13);
                    } else if (c16 == 2) {
                        str42 = bf.h(parcel, readInt13);
                    } else if (c16 == 3) {
                        str43 = bf.h(parcel, readInt13);
                    } else if (c16 != 4) {
                        bf.y(parcel, readInt13);
                    } else {
                        commonWalletObject = (CommonWalletObject) bf.g(parcel, readInt13, CommonWalletObject.CREATOR);
                    }
                }
                bf.m(parcel, z27);
                return new g(i17, str42, str43, commonWalletObject);
            case 13:
                int z28 = bf.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        bf.y(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) bf.g(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                bf.m(parcel, z28);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 14:
                int z29 = bf.z(parcel);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                String str44 = null;
                ArrayList arrayList16 = arrayList15;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                String str45 = null;
                String str46 = null;
                x8.f fVar4 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                int i18 = 0;
                boolean z30 = false;
                String str53 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt15 = parcel.readInt();
                    String str54 = str46;
                    switch ((char) readInt15) {
                        case 2:
                            str44 = bf.h(parcel, readInt15);
                            break;
                        case 3:
                            str53 = bf.h(parcel, readInt15);
                            break;
                        case 4:
                            str47 = bf.h(parcel, readInt15);
                            break;
                        case 5:
                            str48 = bf.h(parcel, readInt15);
                            break;
                        case 6:
                            str49 = bf.h(parcel, readInt15);
                            break;
                        case 7:
                            str50 = bf.h(parcel, readInt15);
                            break;
                        case '\b':
                            str51 = bf.h(parcel, readInt15);
                            break;
                        case '\t':
                            str45 = bf.h(parcel, readInt15);
                            break;
                        case '\n':
                            i18 = bf.u(parcel, readInt15);
                            break;
                        case 11:
                            arrayList13 = bf.l(parcel, readInt15, x8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (x8.f) bf.g(parcel, readInt15, x8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = bf.l(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 14:
                            str46 = bf.h(parcel, readInt15);
                            continue;
                        case 15:
                            str52 = bf.h(parcel, readInt15);
                            break;
                        case 16:
                            arrayList16 = bf.l(parcel, readInt15, x8.b.CREATOR);
                            break;
                        case 17:
                            z30 = bf.n(parcel, readInt15);
                            break;
                        case 18:
                            arrayList17 = bf.l(parcel, readInt15, x8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = bf.l(parcel, readInt15, x8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = bf.l(parcel, readInt15, x8.g.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt15);
                            break;
                    }
                    str46 = str54;
                }
                bf.m(parcel, z29);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str44;
                commonWalletObject2.b = str53;
                commonWalletObject2.c = str47;
                commonWalletObject2.d = str48;
                commonWalletObject2.e = str49;
                commonWalletObject2.f = str50;
                commonWalletObject2.h = str51;
                commonWalletObject2.n = str45;
                commonWalletObject2.r = i18;
                commonWalletObject2.s = arrayList13;
                commonWalletObject2.v = fVar4;
                commonWalletObject2.w = arrayList14;
                commonWalletObject2.x = str46;
                commonWalletObject2.y = str52;
                commonWalletObject2.E = arrayList16;
                commonWalletObject2.F = z30;
                commonWalletObject2.G = arrayList17;
                commonWalletObject2.H = arrayList18;
                commonWalletObject2.I = arrayList19;
                return commonWalletObject2;
            case 15:
                int z31 = bf.z(parcel);
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        str55 = bf.h(parcel, readInt16);
                    } else if (c17 != 3) {
                        bf.y(parcel, readInt16);
                    } else {
                        str56 = bf.h(parcel, readInt16);
                    }
                }
                bf.m(parcel, z31);
                x8.a aVar = new x8.a();
                aVar.a = str55;
                aVar.b = str56;
                return aVar;
            case 16:
                int z32 = bf.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str57 = null;
                String str58 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str57 = bf.h(parcel, readInt17);
                    } else if (c18 == 3) {
                        str58 = bf.h(parcel, readInt17);
                    } else if (c18 != 4) {
                        bf.y(parcel, readInt17);
                    } else {
                        arrayList20 = bf.l(parcel, readInt17, x8.a.CREATOR);
                    }
                }
                bf.m(parcel, z32);
                x8.b bVar2 = new x8.b();
                bVar2.a = str57;
                bVar2.b = str58;
                bVar2.c = arrayList20;
                return bVar2;
            case 17:
                int z33 = bf.z(parcel);
                int i19 = 0;
                String str59 = null;
                int i20 = -1;
                long j10 = 0;
                double d = 0.0d;
                String str60 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            i19 = bf.u(parcel, readInt18);
                            break;
                        case 3:
                            str59 = bf.h(parcel, readInt18);
                            break;
                        case 4:
                            d = bf.q(parcel, readInt18);
                            break;
                        case 5:
                            str60 = bf.h(parcel, readInt18);
                            break;
                        case 6:
                            j10 = bf.w(parcel, readInt18);
                            break;
                        case 7:
                            i20 = bf.u(parcel, readInt18);
                            break;
                        default:
                            bf.y(parcel, readInt18);
                            break;
                    }
                }
                bf.m(parcel, z33);
                x8.d dVar2 = new x8.d();
                dVar2.a = i19;
                dVar2.b = str59;
                dVar2.c = d;
                dVar2.d = str60;
                dVar2.e = j10;
                dVar2.f = i20;
                return dVar2;
            case 18:
                int z34 = bf.z(parcel);
                String str61 = null;
                x8.d dVar3 = null;
                x8.f fVar5 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        str61 = bf.h(parcel, readInt19);
                    } else if (c19 == 3) {
                        dVar3 = (x8.d) bf.g(parcel, readInt19, x8.d.CREATOR);
                    } else if (c19 != 5) {
                        bf.y(parcel, readInt19);
                    } else {
                        fVar5 = (x8.f) bf.g(parcel, readInt19, x8.f.CREATOR);
                    }
                }
                bf.m(parcel, z34);
                x8.c cVar3 = new x8.c();
                cVar3.a = str61;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 19:
                int z35 = bf.z(parcel);
                String str62 = null;
                String str63 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        str62 = bf.h(parcel, readInt20);
                    } else if (c20 != 3) {
                        bf.y(parcel, readInt20);
                    } else {
                        str63 = bf.h(parcel, readInt20);
                    }
                }
                bf.m(parcel, z35);
                x8.e eVar2 = new x8.e();
                eVar2.a = str62;
                eVar2.b = str63;
                return eVar2;
            case 20:
                int z36 = bf.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        j11 = bf.w(parcel, readInt21);
                    } else if (c21 != 3) {
                        bf.y(parcel, readInt21);
                    } else {
                        j12 = bf.w(parcel, readInt21);
                    }
                }
                bf.m(parcel, z36);
                x8.f fVar6 = new x8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            case 21:
                int z37 = bf.z(parcel);
                String str64 = null;
                String str65 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        str64 = bf.h(parcel, readInt22);
                    } else if (c22 != 3) {
                        bf.y(parcel, readInt22);
                    } else {
                        str65 = bf.h(parcel, readInt22);
                    }
                }
                bf.m(parcel, z37);
                x8.g gVar = new x8.g();
                gVar.a = str64;
                gVar.b = str65;
                return gVar;
            case 22:
                int z38 = bf.z(parcel);
                String str66 = null;
                String str67 = null;
                x8.f fVar7 = null;
                x8.g gVar2 = null;
                x8.g gVar3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 2) {
                        str66 = bf.h(parcel, readInt23);
                    } else if (c23 == 3) {
                        str67 = bf.h(parcel, readInt23);
                    } else if (c23 == 4) {
                        fVar7 = (x8.f) bf.g(parcel, readInt23, x8.f.CREATOR);
                    } else if (c23 == 5) {
                        gVar2 = (x8.g) bf.g(parcel, readInt23, x8.g.CREATOR);
                    } else if (c23 != 6) {
                        bf.y(parcel, readInt23);
                    } else {
                        gVar3 = (x8.g) bf.g(parcel, readInt23, x8.g.CREATOR);
                    }
                }
                bf.m(parcel, z38);
                x8.h hVar2 = new x8.h();
                hVar2.a = str66;
                hVar2.b = str67;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            case 23:
                int z39 = bf.z(parcel);
                boolean z40 = false;
                int i21 = 0;
                boolean z41 = false;
                y5.d dVar4 = null;
                y5.a aVar2 = null;
                String str68 = null;
                y5.c cVar4 = null;
                y5.b bVar3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            dVar4 = (y5.d) bf.g(parcel, readInt24, y5.d.CREATOR);
                            break;
                        case 2:
                            aVar2 = (y5.a) bf.g(parcel, readInt24, y5.a.CREATOR);
                            break;
                        case 3:
                            str68 = bf.h(parcel, readInt24);
                            break;
                        case 4:
                            z40 = bf.n(parcel, readInt24);
                            break;
                        case 5:
                            i21 = bf.u(parcel, readInt24);
                            break;
                        case 6:
                            cVar4 = (y5.c) bf.g(parcel, readInt24, y5.c.CREATOR);
                            break;
                        case 7:
                            bVar3 = (y5.b) bf.g(parcel, readInt24, y5.b.CREATOR);
                            break;
                        case '\b':
                            z41 = bf.n(parcel, readInt24);
                            break;
                        default:
                            bf.y(parcel, readInt24);
                            break;
                    }
                }
                bf.m(parcel, z39);
                return new y5.e(dVar4, aVar2, str68, z40, i21, cVar4, bVar3, z41);
            case 24:
                int z42 = bf.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        bf.y(parcel, readInt25);
                    } else {
                        pendingIntent2 = (PendingIntent) bf.g(parcel, readInt25, PendingIntent.CREATOR);
                    }
                }
                bf.m(parcel, z42);
                return new y5.f(pendingIntent2);
            case 25:
                int z43 = bf.z(parcel);
                boolean z44 = false;
                boolean z45 = false;
                boolean z46 = false;
                String str69 = null;
                String str70 = null;
                String str71 = null;
                ArrayList arrayList21 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            z44 = bf.n(parcel, readInt26);
                            break;
                        case 2:
                            str69 = bf.h(parcel, readInt26);
                            break;
                        case 3:
                            str70 = bf.h(parcel, readInt26);
                            break;
                        case 4:
                            z45 = bf.n(parcel, readInt26);
                            break;
                        case 5:
                            str71 = bf.h(parcel, readInt26);
                            break;
                        case 6:
                            arrayList21 = bf.j(parcel, readInt26);
                            break;
                        case 7:
                            z46 = bf.n(parcel, readInt26);
                            break;
                        default:
                            bf.y(parcel, readInt26);
                            break;
                    }
                }
                bf.m(parcel, z43);
                return new y5.a(z44, str69, str70, z45, str71, arrayList21, z46);
            case 26:
                int z47 = bf.z(parcel);
                String str72 = null;
                boolean z48 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c24 = (char) readInt27;
                    if (c24 == 1) {
                        z48 = bf.n(parcel, readInt27);
                    } else if (c24 != 2) {
                        bf.y(parcel, readInt27);
                    } else {
                        str72 = bf.h(parcel, readInt27);
                    }
                }
                bf.m(parcel, z47);
                return new y5.b(str72, z48);
            case 27:
                int z49 = bf.z(parcel);
                byte[] bArr = null;
                boolean z50 = false;
                String str73 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt28 = parcel.readInt();
                    char c25 = (char) readInt28;
                    if (c25 == 1) {
                        z50 = bf.n(parcel, readInt28);
                    } else if (c25 == 2) {
                        bArr = bf.b(parcel, readInt28);
                    } else if (c25 != 3) {
                        bf.y(parcel, readInt28);
                    } else {
                        str73 = bf.h(parcel, readInt28);
                    }
                }
                bf.m(parcel, z49);
                return new y5.c(z50, bArr, str73);
            case 28:
                int z51 = bf.z(parcel);
                boolean z52 = false;
                while (parcel.dataPosition() < z51) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 1) {
                        bf.y(parcel, readInt29);
                    } else {
                        z52 = bf.n(parcel, readInt29);
                    }
                }
                bf.m(parcel, z51);
                return new y5.d(z52);
            default:
                int z53 = bf.z(parcel);
                String str74 = null;
                String str75 = null;
                String str76 = null;
                String str77 = null;
                Uri uri = null;
                String str78 = null;
                String str79 = null;
                String str80 = null;
                d7.u uVar = null;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    switch ((char) readInt30) {
                        case 1:
                            str74 = bf.h(parcel, readInt30);
                            break;
                        case 2:
                            str75 = bf.h(parcel, readInt30);
                            break;
                        case 3:
                            str76 = bf.h(parcel, readInt30);
                            break;
                        case 4:
                            str77 = bf.h(parcel, readInt30);
                            break;
                        case 5:
                            uri = (Uri) bf.g(parcel, readInt30, Uri.CREATOR);
                            break;
                        case 6:
                            str78 = bf.h(parcel, readInt30);
                            break;
                        case 7:
                            str79 = bf.h(parcel, readInt30);
                            break;
                        case '\b':
                            str80 = bf.h(parcel, readInt30);
                            break;
                        case '\t':
                            uVar = (d7.u) bf.g(parcel, readInt30, d7.u.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt30);
                            break;
                    }
                }
                bf.m(parcel, z53);
                return new y5.g(str74, str75, str76, str77, uri, str78, str79, str80, uVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new r[i10];
            case 1:
                return new m[i10];
            case 2:
                return new n[i10];
            case 3:
                return new t[i10];
            case 4:
                return new q[i10];
            case 5:
                return new b[i10];
            case 6:
                return new c[i10];
            case 7:
                return new FullWallet[i10];
            case 8:
                return new d[i10];
            case 9:
                return new e[i10];
            case 10:
                return new f[i10];
            case 11:
                return new MaskedWallet[i10];
            case 12:
                return new g[i10];
            case 13:
                return new h[i10];
            case 14:
                return new CommonWalletObject[i10];
            case 15:
                return new x8.a[i10];
            case 16:
                return new x8.b[i10];
            case 17:
                return new x8.d[i10];
            case 18:
                return new x8.c[i10];
            case 19:
                return new x8.e[i10];
            case 20:
                return new x8.f[i10];
            case 21:
                return new x8.g[i10];
            case 22:
                return new x8.h[i10];
            case 23:
                return new y5.e[i10];
            case 24:
                return new y5.f[i10];
            case 25:
                return new y5.a[i10];
            case 26:
                return new y5.b[i10];
            case 27:
                return new y5.c[i10];
            case 28:
                return new y5.d[i10];
            default:
                return new y5.g[i10];
        }
    }
}
