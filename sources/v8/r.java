package v8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
import w7.c0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = c0.z(parcel);
                int i10 = 0;
                String str = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i10 = c0.u(parcel, readInt);
                    } else if (c10 != 3) {
                        c0.y(parcel, readInt);
                    } else {
                        str = c0.h(parcel, readInt);
                    }
                }
                c0.m(parcel, z10);
                k kVar = new k();
                kVar.a = i10;
                kVar.b = str;
                return kVar;
            case 1:
                int z11 = c0.z(parcel);
                int i11 = 0;
                Bundle bundle = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        i11 = c0.u(parcel, readInt2);
                    } else if (c11 != 3) {
                        c0.y(parcel, readInt2);
                    } else {
                        bundle = c0.a(parcel, readInt2);
                    }
                }
                c0.m(parcel, z11);
                l lVar = new l();
                new Bundle();
                lVar.a = i11;
                lVar.b = bundle;
                return lVar;
            case 2:
                int z12 = c0.z(parcel);
                String str2 = null;
                int i12 = 0;
                int i13 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        str2 = c0.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        str3 = c0.h(parcel, readInt3);
                    } else if (c12 == 4) {
                        i12 = c0.u(parcel, readInt3);
                    } else if (c12 != 5) {
                        c0.y(parcel, readInt3);
                    } else {
                        i13 = c0.u(parcel, readInt3);
                    }
                }
                c0.m(parcel, z12);
                return new s(i12, i13, str2, str3);
            case 3:
                int z13 = c0.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        c0.y(parcel, readInt4);
                    } else {
                        arrayList = c0.j(parcel, readInt4);
                    }
                }
                c0.m(parcel, z13);
                m mVar = new m();
                mVar.a = arrayList;
                return mVar;
            case 4:
                int z14 = c0.z(parcel);
                int i14 = 0;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i14 = c0.u(parcel, readInt5);
                    } else if (c13 == 2) {
                        str4 = c0.h(parcel, readInt5);
                    } else if (c13 != 3) {
                        c0.y(parcel, readInt5);
                    } else {
                        str5 = c0.h(parcel, readInt5);
                    }
                }
                c0.m(parcel, z14);
                n nVar = new n();
                nVar.a = i14;
                nVar.b = str4;
                nVar.c = str5;
                return nVar;
            case 5:
                int z15 = c0.z(parcel);
                String str6 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 2) {
                        str6 = c0.h(parcel, readInt6);
                    } else if (c14 != 3) {
                        c0.y(parcel, readInt6);
                    } else {
                        bundle2 = c0.a(parcel, readInt6);
                    }
                }
                c0.m(parcel, z15);
                t tVar = new t();
                tVar.a = str6;
                tVar.b = bundle2;
                return tVar;
            case 6:
                int z16 = c0.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                boolean z17 = false;
                String str16 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            str7 = c0.h(parcel, readInt7);
                            break;
                        case 3:
                            str16 = c0.h(parcel, readInt7);
                            break;
                        case 4:
                            str8 = c0.h(parcel, readInt7);
                            break;
                        case 5:
                            str9 = c0.h(parcel, readInt7);
                            break;
                        case 6:
                            str10 = c0.h(parcel, readInt7);
                            break;
                        case 7:
                            str11 = c0.h(parcel, readInt7);
                            break;
                        case '\b':
                            str12 = c0.h(parcel, readInt7);
                            break;
                        case '\t':
                            str13 = c0.h(parcel, readInt7);
                            break;
                        case '\n':
                            str14 = c0.h(parcel, readInt7);
                            break;
                        case 11:
                            z17 = c0.n(parcel, readInt7);
                            break;
                        case '\f':
                            str15 = c0.h(parcel, readInt7);
                            break;
                        default:
                            c0.y(parcel, readInt7);
                            break;
                    }
                }
                c0.m(parcel, z16);
                q qVar = new q();
                qVar.a = str7;
                qVar.b = str16;
                qVar.c = str8;
                qVar.d = str9;
                qVar.e = str10;
                qVar.f = str11;
                qVar.h = str12;
                qVar.n = str13;
                qVar.r = str14;
                qVar.s = z17;
                qVar.v = str15;
                return qVar;
            case 7:
                int z18 = c0.z(parcel);
                String str17 = null;
                String str18 = null;
                UserAddress userAddress = null;
                int i15 = 0;
                String str19 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        str17 = c0.h(parcel, readInt8);
                    } else if (c15 == 2) {
                        str19 = c0.h(parcel, readInt8);
                    } else if (c15 == 3) {
                        str18 = c0.h(parcel, readInt8);
                    } else if (c15 == 4) {
                        i15 = c0.u(parcel, readInt8);
                    } else if (c15 != 5) {
                        c0.y(parcel, readInt8);
                    } else {
                        userAddress = (UserAddress) c0.g(parcel, readInt8, UserAddress.CREATOR);
                    }
                }
                c0.m(parcel, z18);
                b bVar = new b();
                bVar.a = str17;
                bVar.b = str19;
                bVar.c = str18;
                bVar.d = i15;
                bVar.e = userAddress;
                return bVar;
            case 8:
                int z19 = c0.z(parcel);
                ArrayList arrayList2 = null;
                boolean z20 = false;
                boolean z21 = true;
                int i16 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        arrayList2 = c0.e(parcel, readInt9);
                    } else if (c16 == 2) {
                        z21 = c0.n(parcel, readInt9);
                    } else if (c16 == 3) {
                        z20 = c0.n(parcel, readInt9);
                    } else if (c16 != 4) {
                        c0.y(parcel, readInt9);
                    } else {
                        i16 = c0.u(parcel, readInt9);
                    }
                }
                c0.m(parcel, z19);
                c cVar = new c();
                cVar.a = arrayList2;
                cVar.b = z21;
                cVar.c = z20;
                cVar.d = i16;
                return cVar;
            case 9:
                int z22 = c0.z(parcel);
                String str20 = null;
                String str21 = null;
                s sVar = null;
                String str22 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                d[] dVarArr = null;
                k kVar2 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str20 = c0.h(parcel, readInt10);
                            break;
                        case 3:
                            str21 = c0.h(parcel, readInt10);
                            break;
                        case 4:
                            sVar = (s) c0.g(parcel, readInt10, s.CREATOR);
                            break;
                        case 5:
                            str22 = c0.h(parcel, readInt10);
                            break;
                        case 6:
                            qVar2 = (q) c0.g(parcel, readInt10, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) c0.g(parcel, readInt10, q.CREATOR);
                            break;
                        case '\b':
                            strArr = c0.i(parcel, readInt10);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) c0.g(parcel, readInt10, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) c0.g(parcel, readInt10, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) c0.k(parcel, readInt10, d.CREATOR);
                            break;
                        case '\f':
                            kVar2 = (k) c0.g(parcel, readInt10, k.CREATOR);
                            break;
                        default:
                            c0.y(parcel, readInt10);
                            break;
                    }
                }
                c0.m(parcel, z22);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str20;
                fullWallet.b = str21;
                fullWallet.c = sVar;
                fullWallet.d = str22;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress2;
                fullWallet.r = userAddress3;
                fullWallet.s = dVarArr;
                fullWallet.v = kVar2;
                return fullWallet;
            case 10:
                int z23 = c0.z(parcel);
                String str23 = null;
                int i17 = 0;
                String str24 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 2) {
                        str23 = c0.h(parcel, readInt11);
                    } else if (c17 == 3) {
                        str24 = c0.h(parcel, readInt11);
                    } else if (c17 != 4) {
                        c0.y(parcel, readInt11);
                    } else {
                        i17 = c0.u(parcel, readInt11);
                    }
                }
                c0.m(parcel, z23);
                d dVar = new d();
                dVar.a = str23;
                dVar.b = str24;
                dVar.c = i17;
                return dVar;
            case 11:
                int z24 = c0.z(parcel);
                ArrayList arrayList3 = null;
                String str25 = null;
                ArrayList arrayList4 = null;
                String str26 = null;
                boolean z25 = false;
                String str27 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            arrayList3 = c0.e(parcel, readInt12);
                            break;
                        case 3:
                        default:
                            c0.y(parcel, readInt12);
                            break;
                        case 4:
                            str27 = c0.h(parcel, readInt12);
                            break;
                        case 5:
                            str25 = c0.h(parcel, readInt12);
                            break;
                        case 6:
                            arrayList4 = c0.e(parcel, readInt12);
                            break;
                        case 7:
                            z25 = c0.n(parcel, readInt12);
                            break;
                        case '\b':
                            str26 = c0.h(parcel, readInt12);
                            break;
                    }
                }
                c0.m(parcel, z24);
                e eVar = new e();
                eVar.a = arrayList3;
                eVar.b = str27;
                eVar.c = str25;
                eVar.d = arrayList4;
                eVar.e = z25;
                eVar.f = str26;
                return eVar;
            case 12:
                int z26 = c0.z(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str28 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                w8.f fVar = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                w8.c cVar2 = null;
                int i18 = 0;
                boolean z27 = false;
                String str39 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    w8.f fVar2 = fVar;
                    switch ((char) readInt13) {
                        case 2:
                            str28 = c0.h(parcel, readInt13);
                            break;
                        case 3:
                            str39 = c0.h(parcel, readInt13);
                            break;
                        case 4:
                            str31 = c0.h(parcel, readInt13);
                            break;
                        case 5:
                            str32 = c0.h(parcel, readInt13);
                            break;
                        case 6:
                            str33 = c0.h(parcel, readInt13);
                            break;
                        case 7:
                            str34 = c0.h(parcel, readInt13);
                            break;
                        case '\b':
                            str35 = c0.h(parcel, readInt13);
                            break;
                        case '\t':
                            str36 = c0.h(parcel, readInt13);
                            break;
                        case '\n':
                            str30 = c0.h(parcel, readInt13);
                            break;
                        case 11:
                            str29 = c0.h(parcel, readInt13);
                            break;
                        case '\f':
                            i18 = c0.u(parcel, readInt13);
                            break;
                        case '\r':
                            arrayList5 = c0.l(parcel, readInt13, w8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (w8.f) c0.g(parcel, readInt13, w8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = c0.l(parcel, readInt13, LatLng.CREATOR);
                            break;
                        case 16:
                            str37 = c0.h(parcel, readInt13);
                            break;
                        case 17:
                            str38 = c0.h(parcel, readInt13);
                            break;
                        case 18:
                            arrayList9 = c0.l(parcel, readInt13, w8.b.CREATOR);
                            break;
                        case 19:
                            z27 = c0.n(parcel, readInt13);
                            break;
                        case 20:
                            arrayList10 = c0.l(parcel, readInt13, w8.g.CREATOR);
                            break;
                        case 21:
                            arrayList11 = c0.l(parcel, readInt13, w8.e.CREATOR);
                            break;
                        case 22:
                            arrayList12 = c0.l(parcel, readInt13, w8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (w8.c) c0.g(parcel, readInt13, w8.c.CREATOR);
                            break;
                        default:
                            c0.y(parcel, readInt13);
                            break;
                    }
                    fVar = fVar2;
                }
                c0.m(parcel, z26);
                f fVar3 = new f();
                fVar3.a = str28;
                fVar3.b = str39;
                fVar3.c = str31;
                fVar3.d = str32;
                fVar3.e = str33;
                fVar3.f = str34;
                fVar3.h = str35;
                fVar3.n = str36;
                fVar3.r = str30;
                fVar3.s = str29;
                fVar3.v = i18;
                fVar3.w = arrayList5;
                fVar3.x = fVar;
                fVar3.y = arrayList8;
                fVar3.E = str37;
                fVar3.F = str38;
                fVar3.G = arrayList9;
                fVar3.H = z27;
                fVar3.I = arrayList10;
                fVar3.J = arrayList11;
                fVar3.K = arrayList12;
                fVar3.L = cVar2;
                return fVar3;
            case 13:
                int z28 = c0.z(parcel);
                String str40 = null;
                String str41 = null;
                String[] strArr2 = null;
                String str42 = null;
                q qVar4 = null;
                q qVar5 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str40 = c0.h(parcel, readInt14);
                            break;
                        case 3:
                            str41 = c0.h(parcel, readInt14);
                            break;
                        case 4:
                            strArr2 = c0.i(parcel, readInt14);
                            break;
                        case 5:
                            str42 = c0.h(parcel, readInt14);
                            break;
                        case 6:
                            qVar4 = (q) c0.g(parcel, readInt14, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) c0.g(parcel, readInt14, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) c0.k(parcel, readInt14, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) c0.k(parcel, readInt14, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) c0.g(parcel, readInt14, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) c0.g(parcel, readInt14, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) c0.k(parcel, readInt14, d.CREATOR);
                            break;
                        default:
                            c0.y(parcel, readInt14);
                            break;
                    }
                }
                c0.m(parcel, z28);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str40;
                maskedWallet.b = str41;
                maskedWallet.c = strArr2;
                maskedWallet.d = str42;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress4;
                maskedWallet.s = userAddress5;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 14:
                int z29 = c0.z(parcel);
                int i19 = 0;
                String str43 = null;
                String str44 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z29) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 1) {
                        i19 = c0.u(parcel, readInt15);
                    } else if (c18 == 2) {
                        str43 = c0.h(parcel, readInt15);
                    } else if (c18 == 3) {
                        str44 = c0.h(parcel, readInt15);
                    } else if (c18 != 4) {
                        c0.y(parcel, readInt15);
                    } else {
                        commonWalletObject = (CommonWalletObject) c0.g(parcel, readInt15, CommonWalletObject.CREATOR);
                    }
                }
                c0.m(parcel, z29);
                return new g(i19, str43, str44, commonWalletObject);
            case 15:
                int z30 = c0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        c0.y(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) c0.g(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                c0.m(parcel, z30);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 16:
                int z31 = c0.z(parcel);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                String str45 = null;
                ArrayList arrayList16 = arrayList15;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                String str46 = null;
                String str47 = null;
                w8.f fVar4 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                int i20 = 0;
                boolean z32 = false;
                String str54 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt17 = parcel.readInt();
                    String str55 = str47;
                    switch ((char) readInt17) {
                        case 2:
                            str45 = c0.h(parcel, readInt17);
                            break;
                        case 3:
                            str54 = c0.h(parcel, readInt17);
                            break;
                        case 4:
                            str48 = c0.h(parcel, readInt17);
                            break;
                        case 5:
                            str49 = c0.h(parcel, readInt17);
                            break;
                        case 6:
                            str50 = c0.h(parcel, readInt17);
                            break;
                        case 7:
                            str51 = c0.h(parcel, readInt17);
                            break;
                        case '\b':
                            str52 = c0.h(parcel, readInt17);
                            break;
                        case '\t':
                            str46 = c0.h(parcel, readInt17);
                            break;
                        case '\n':
                            i20 = c0.u(parcel, readInt17);
                            break;
                        case 11:
                            arrayList13 = c0.l(parcel, readInt17, w8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (w8.f) c0.g(parcel, readInt17, w8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = c0.l(parcel, readInt17, LatLng.CREATOR);
                            break;
                        case 14:
                            str47 = c0.h(parcel, readInt17);
                            continue;
                        case 15:
                            str53 = c0.h(parcel, readInt17);
                            break;
                        case 16:
                            arrayList16 = c0.l(parcel, readInt17, w8.b.CREATOR);
                            break;
                        case 17:
                            z32 = c0.n(parcel, readInt17);
                            break;
                        case 18:
                            arrayList17 = c0.l(parcel, readInt17, w8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = c0.l(parcel, readInt17, w8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = c0.l(parcel, readInt17, w8.g.CREATOR);
                            break;
                        default:
                            c0.y(parcel, readInt17);
                            break;
                    }
                    str47 = str55;
                }
                c0.m(parcel, z31);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str45;
                commonWalletObject2.b = str54;
                commonWalletObject2.c = str48;
                commonWalletObject2.d = str49;
                commonWalletObject2.e = str50;
                commonWalletObject2.f = str51;
                commonWalletObject2.h = str52;
                commonWalletObject2.n = str46;
                commonWalletObject2.r = i20;
                commonWalletObject2.s = arrayList13;
                commonWalletObject2.v = fVar4;
                commonWalletObject2.w = arrayList14;
                commonWalletObject2.x = str47;
                commonWalletObject2.y = str53;
                commonWalletObject2.E = arrayList16;
                commonWalletObject2.F = z32;
                commonWalletObject2.G = arrayList17;
                commonWalletObject2.H = arrayList18;
                commonWalletObject2.I = arrayList19;
                return commonWalletObject2;
            case 17:
                int z33 = c0.z(parcel);
                String str56 = null;
                String str57 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 2) {
                        str56 = c0.h(parcel, readInt18);
                    } else if (c19 != 3) {
                        c0.y(parcel, readInt18);
                    } else {
                        str57 = c0.h(parcel, readInt18);
                    }
                }
                c0.m(parcel, z33);
                w8.a aVar = new w8.a();
                aVar.a = str56;
                aVar.b = str57;
                return aVar;
            case 18:
                int z34 = c0.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str58 = null;
                String str59 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 2) {
                        str58 = c0.h(parcel, readInt19);
                    } else if (c20 == 3) {
                        str59 = c0.h(parcel, readInt19);
                    } else if (c20 != 4) {
                        c0.y(parcel, readInt19);
                    } else {
                        arrayList20 = c0.l(parcel, readInt19, w8.a.CREATOR);
                    }
                }
                c0.m(parcel, z34);
                w8.b bVar2 = new w8.b();
                bVar2.a = str58;
                bVar2.b = str59;
                bVar2.c = arrayList20;
                return bVar2;
            case 19:
                int z35 = c0.z(parcel);
                int i21 = 0;
                String str60 = null;
                int i22 = -1;
                long j3 = 0;
                double d = 0.0d;
                String str61 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            i21 = c0.u(parcel, readInt20);
                            break;
                        case 3:
                            str60 = c0.h(parcel, readInt20);
                            break;
                        case 4:
                            d = c0.q(parcel, readInt20);
                            break;
                        case 5:
                            str61 = c0.h(parcel, readInt20);
                            break;
                        case 6:
                            j3 = c0.w(parcel, readInt20);
                            break;
                        case 7:
                            i22 = c0.u(parcel, readInt20);
                            break;
                        default:
                            c0.y(parcel, readInt20);
                            break;
                    }
                }
                c0.m(parcel, z35);
                w8.d dVar2 = new w8.d();
                dVar2.a = i21;
                dVar2.b = str60;
                dVar2.c = d;
                dVar2.d = str61;
                dVar2.e = j3;
                dVar2.f = i22;
                return dVar2;
            case 20:
                int z36 = c0.z(parcel);
                String str62 = null;
                w8.d dVar3 = null;
                w8.f fVar5 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        str62 = c0.h(parcel, readInt21);
                    } else if (c21 == 3) {
                        dVar3 = (w8.d) c0.g(parcel, readInt21, w8.d.CREATOR);
                    } else if (c21 != 5) {
                        c0.y(parcel, readInt21);
                    } else {
                        fVar5 = (w8.f) c0.g(parcel, readInt21, w8.f.CREATOR);
                    }
                }
                c0.m(parcel, z36);
                w8.c cVar3 = new w8.c();
                cVar3.a = str62;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 21:
                int z37 = c0.z(parcel);
                String str63 = null;
                String str64 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        str63 = c0.h(parcel, readInt22);
                    } else if (c22 != 3) {
                        c0.y(parcel, readInt22);
                    } else {
                        str64 = c0.h(parcel, readInt22);
                    }
                }
                c0.m(parcel, z37);
                w8.e eVar2 = new w8.e();
                eVar2.a = str63;
                eVar2.b = str64;
                return eVar2;
            case 22:
                int z38 = c0.z(parcel);
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 2) {
                        j10 = c0.w(parcel, readInt23);
                    } else if (c23 != 3) {
                        c0.y(parcel, readInt23);
                    } else {
                        j11 = c0.w(parcel, readInt23);
                    }
                }
                c0.m(parcel, z38);
                w8.f fVar6 = new w8.f();
                fVar6.a = j10;
                fVar6.b = j11;
                return fVar6;
            case 23:
                int z39 = c0.z(parcel);
                String str65 = null;
                String str66 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 2) {
                        str65 = c0.h(parcel, readInt24);
                    } else if (c24 != 3) {
                        c0.y(parcel, readInt24);
                    } else {
                        str66 = c0.h(parcel, readInt24);
                    }
                }
                c0.m(parcel, z39);
                w8.g gVar = new w8.g();
                gVar.a = str65;
                gVar.b = str66;
                return gVar;
            case 24:
                int z40 = c0.z(parcel);
                String str67 = null;
                String str68 = null;
                w8.f fVar7 = null;
                w8.g gVar2 = null;
                w8.g gVar3 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt25 = parcel.readInt();
                    char c25 = (char) readInt25;
                    if (c25 == 2) {
                        str67 = c0.h(parcel, readInt25);
                    } else if (c25 == 3) {
                        str68 = c0.h(parcel, readInt25);
                    } else if (c25 == 4) {
                        fVar7 = (w8.f) c0.g(parcel, readInt25, w8.f.CREATOR);
                    } else if (c25 == 5) {
                        gVar2 = (w8.g) c0.g(parcel, readInt25, w8.g.CREATOR);
                    } else if (c25 != 6) {
                        c0.y(parcel, readInt25);
                    } else {
                        gVar3 = (w8.g) c0.g(parcel, readInt25, w8.g.CREATOR);
                    }
                }
                c0.m(parcel, z40);
                w8.h hVar2 = new w8.h();
                hVar2.a = str67;
                hVar2.b = str68;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            case 25:
                int z41 = c0.z(parcel);
                boolean z42 = false;
                int i23 = 0;
                boolean z43 = false;
                x5.d dVar4 = null;
                x5.a aVar2 = null;
                String str69 = null;
                x5.c cVar4 = null;
                x5.b bVar3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            dVar4 = (x5.d) c0.g(parcel, readInt26, x5.d.CREATOR);
                            break;
                        case 2:
                            aVar2 = (x5.a) c0.g(parcel, readInt26, x5.a.CREATOR);
                            break;
                        case 3:
                            str69 = c0.h(parcel, readInt26);
                            break;
                        case 4:
                            z42 = c0.n(parcel, readInt26);
                            break;
                        case 5:
                            i23 = c0.u(parcel, readInt26);
                            break;
                        case 6:
                            cVar4 = (x5.c) c0.g(parcel, readInt26, x5.c.CREATOR);
                            break;
                        case 7:
                            bVar3 = (x5.b) c0.g(parcel, readInt26, x5.b.CREATOR);
                            break;
                        case '\b':
                            z43 = c0.n(parcel, readInt26);
                            break;
                        default:
                            c0.y(parcel, readInt26);
                            break;
                    }
                }
                c0.m(parcel, z41);
                return new x5.e(dVar4, aVar2, str69, z42, i23, cVar4, bVar3, z43);
            case 26:
                int z44 = c0.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        c0.y(parcel, readInt27);
                    } else {
                        pendingIntent2 = (PendingIntent) c0.g(parcel, readInt27, PendingIntent.CREATOR);
                    }
                }
                c0.m(parcel, z44);
                return new x5.f(pendingIntent2);
            case 27:
                int z45 = c0.z(parcel);
                boolean z46 = false;
                boolean z47 = false;
                boolean z48 = false;
                String str70 = null;
                String str71 = null;
                String str72 = null;
                ArrayList arrayList21 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            z46 = c0.n(parcel, readInt28);
                            break;
                        case 2:
                            str70 = c0.h(parcel, readInt28);
                            break;
                        case 3:
                            str71 = c0.h(parcel, readInt28);
                            break;
                        case 4:
                            z47 = c0.n(parcel, readInt28);
                            break;
                        case 5:
                            str72 = c0.h(parcel, readInt28);
                            break;
                        case 6:
                            arrayList21 = c0.j(parcel, readInt28);
                            break;
                        case 7:
                            z48 = c0.n(parcel, readInt28);
                            break;
                        default:
                            c0.y(parcel, readInt28);
                            break;
                    }
                }
                c0.m(parcel, z45);
                return new x5.a(z46, str70, str71, z47, str72, arrayList21, z48);
            case 28:
                int z49 = c0.z(parcel);
                String str73 = null;
                boolean z50 = false;
                while (parcel.dataPosition() < z49) {
                    int readInt29 = parcel.readInt();
                    char c26 = (char) readInt29;
                    if (c26 == 1) {
                        z50 = c0.n(parcel, readInt29);
                    } else if (c26 != 2) {
                        c0.y(parcel, readInt29);
                    } else {
                        str73 = c0.h(parcel, readInt29);
                    }
                }
                c0.m(parcel, z49);
                return new x5.b(str73, z50);
            default:
                int z51 = c0.z(parcel);
                byte[] bArr = null;
                boolean z52 = false;
                String str74 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt30 = parcel.readInt();
                    char c27 = (char) readInt30;
                    if (c27 == 1) {
                        z52 = c0.n(parcel, readInt30);
                    } else if (c27 == 2) {
                        bArr = c0.b(parcel, readInt30);
                    } else if (c27 != 3) {
                        c0.y(parcel, readInt30);
                    } else {
                        str74 = c0.h(parcel, readInt30);
                    }
                }
                c0.m(parcel, z51);
                return new x5.c(z52, bArr, str74);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new k[i10];
            case 1:
                return new l[i10];
            case 2:
                return new s[i10];
            case 3:
                return new m[i10];
            case 4:
                return new n[i10];
            case 5:
                return new t[i10];
            case 6:
                return new q[i10];
            case 7:
                return new b[i10];
            case 8:
                return new c[i10];
            case 9:
                return new FullWallet[i10];
            case 10:
                return new d[i10];
            case 11:
                return new e[i10];
            case 12:
                return new f[i10];
            case 13:
                return new MaskedWallet[i10];
            case 14:
                return new g[i10];
            case 15:
                return new h[i10];
            case 16:
                return new CommonWalletObject[i10];
            case 17:
                return new w8.a[i10];
            case 18:
                return new w8.b[i10];
            case 19:
                return new w8.d[i10];
            case 20:
                return new w8.c[i10];
            case 21:
                return new w8.e[i10];
            case 22:
                return new w8.f[i10];
            case 23:
                return new w8.g[i10];
            case 24:
                return new w8.h[i10];
            case 25:
                return new x5.e[i10];
            case 26:
                return new x5.f[i10];
            case 27:
                return new x5.a[i10];
            case 28:
                return new x5.b[i10];
            default:
                return new x5.c[i10];
        }
    }
}
