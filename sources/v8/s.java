package v8;

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
import w7.e0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                int z10 = e0.z(parcel);
                String str = null;
                int i10 = 0;
                int i11 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = e0.h(parcel, readInt);
                    } else if (c10 == 3) {
                        str2 = e0.h(parcel, readInt);
                    } else if (c10 == 4) {
                        i10 = e0.u(parcel, readInt);
                    } else if (c10 != 5) {
                        e0.y(parcel, readInt);
                    } else {
                        i11 = e0.u(parcel, readInt);
                    }
                }
                e0.m(parcel, z10);
                return new r(i10, i11, str, str2);
            case 1:
                int z11 = e0.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        e0.y(parcel, readInt2);
                    } else {
                        arrayList = e0.j(parcel, readInt2);
                    }
                }
                e0.m(parcel, z11);
                m mVar = new m();
                mVar.a = arrayList;
                return mVar;
            case 2:
                int z12 = e0.z(parcel);
                int i12 = 0;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i12 = e0.u(parcel, readInt3);
                    } else if (c11 == 2) {
                        str3 = e0.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        e0.y(parcel, readInt3);
                    } else {
                        str4 = e0.h(parcel, readInt3);
                    }
                }
                e0.m(parcel, z12);
                n nVar = new n();
                nVar.a = i12;
                nVar.b = str3;
                nVar.c = str4;
                return nVar;
            case 3:
                int z13 = e0.z(parcel);
                String str5 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        str5 = e0.h(parcel, readInt4);
                    } else if (c12 != 3) {
                        e0.y(parcel, readInt4);
                    } else {
                        bundle = e0.a(parcel, readInt4);
                    }
                }
                e0.m(parcel, z13);
                t tVar = new t();
                tVar.a = str5;
                tVar.b = bundle;
                return tVar;
            case 4:
                int z14 = e0.z(parcel);
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
                            str6 = e0.h(parcel, readInt5);
                            break;
                        case 3:
                            str15 = e0.h(parcel, readInt5);
                            break;
                        case 4:
                            str7 = e0.h(parcel, readInt5);
                            break;
                        case 5:
                            str8 = e0.h(parcel, readInt5);
                            break;
                        case 6:
                            str9 = e0.h(parcel, readInt5);
                            break;
                        case 7:
                            str10 = e0.h(parcel, readInt5);
                            break;
                        case '\b':
                            str11 = e0.h(parcel, readInt5);
                            break;
                        case '\t':
                            str12 = e0.h(parcel, readInt5);
                            break;
                        case '\n':
                            str13 = e0.h(parcel, readInt5);
                            break;
                        case 11:
                            z15 = e0.n(parcel, readInt5);
                            break;
                        case '\f':
                            str14 = e0.h(parcel, readInt5);
                            break;
                        default:
                            e0.y(parcel, readInt5);
                            break;
                    }
                }
                e0.m(parcel, z14);
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
                int z16 = e0.z(parcel);
                String str16 = null;
                String str17 = null;
                UserAddress userAddress = null;
                int i13 = 0;
                String str18 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        str16 = e0.h(parcel, readInt6);
                    } else if (c13 == 2) {
                        str18 = e0.h(parcel, readInt6);
                    } else if (c13 == 3) {
                        str17 = e0.h(parcel, readInt6);
                    } else if (c13 == 4) {
                        i13 = e0.u(parcel, readInt6);
                    } else if (c13 != 5) {
                        e0.y(parcel, readInt6);
                    } else {
                        userAddress = (UserAddress) e0.g(parcel, readInt6, UserAddress.CREATOR);
                    }
                }
                e0.m(parcel, z16);
                b bVar = new b();
                bVar.a = str16;
                bVar.b = str18;
                bVar.c = str17;
                bVar.d = i13;
                bVar.e = userAddress;
                return bVar;
            case 6:
                int z17 = e0.z(parcel);
                ArrayList arrayList2 = null;
                boolean z18 = false;
                boolean z19 = true;
                int i14 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        arrayList2 = e0.e(parcel, readInt7);
                    } else if (c14 == 2) {
                        z19 = e0.n(parcel, readInt7);
                    } else if (c14 == 3) {
                        z18 = e0.n(parcel, readInt7);
                    } else if (c14 != 4) {
                        e0.y(parcel, readInt7);
                    } else {
                        i14 = e0.u(parcel, readInt7);
                    }
                }
                e0.m(parcel, z17);
                c cVar = new c();
                cVar.a = arrayList2;
                cVar.b = z19;
                cVar.c = z18;
                cVar.d = i14;
                return cVar;
            case 7:
                int z20 = e0.z(parcel);
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
                            str19 = e0.h(parcel, readInt8);
                            break;
                        case 3:
                            str20 = e0.h(parcel, readInt8);
                            break;
                        case 4:
                            rVar = (r) e0.g(parcel, readInt8, r.CREATOR);
                            break;
                        case 5:
                            str21 = e0.h(parcel, readInt8);
                            break;
                        case 6:
                            qVar2 = (q) e0.g(parcel, readInt8, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) e0.g(parcel, readInt8, q.CREATOR);
                            break;
                        case '\b':
                            strArr = e0.i(parcel, readInt8);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) e0.g(parcel, readInt8, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) e0.g(parcel, readInt8, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) e0.k(parcel, readInt8, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) e0.g(parcel, readInt8, k.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt8);
                            break;
                    }
                }
                e0.m(parcel, z20);
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
                int z21 = e0.z(parcel);
                String str22 = null;
                int i15 = 0;
                String str23 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        str22 = e0.h(parcel, readInt9);
                    } else if (c15 == 3) {
                        str23 = e0.h(parcel, readInt9);
                    } else if (c15 != 4) {
                        e0.y(parcel, readInt9);
                    } else {
                        i15 = e0.u(parcel, readInt9);
                    }
                }
                e0.m(parcel, z21);
                d dVar = new d();
                dVar.a = str22;
                dVar.b = str23;
                dVar.c = i15;
                return dVar;
            case 9:
                int z22 = e0.z(parcel);
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
                            arrayList3 = e0.e(parcel, readInt10);
                            break;
                        case 3:
                        default:
                            e0.y(parcel, readInt10);
                            break;
                        case 4:
                            str26 = e0.h(parcel, readInt10);
                            break;
                        case 5:
                            str24 = e0.h(parcel, readInt10);
                            break;
                        case 6:
                            arrayList4 = e0.e(parcel, readInt10);
                            break;
                        case 7:
                            z23 = e0.n(parcel, readInt10);
                            break;
                        case '\b':
                            str25 = e0.h(parcel, readInt10);
                            break;
                    }
                }
                e0.m(parcel, z22);
                e eVar = new e();
                eVar.a = arrayList3;
                eVar.b = str26;
                eVar.c = str24;
                eVar.d = arrayList4;
                eVar.e = z23;
                eVar.f = str25;
                return eVar;
            case 10:
                int z24 = e0.z(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str27 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                w8.f fVar = null;
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
                w8.c cVar2 = null;
                int i16 = 0;
                boolean z25 = false;
                String str38 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    w8.f fVar2 = fVar;
                    switch ((char) readInt11) {
                        case 2:
                            str27 = e0.h(parcel, readInt11);
                            break;
                        case 3:
                            str38 = e0.h(parcel, readInt11);
                            break;
                        case 4:
                            str30 = e0.h(parcel, readInt11);
                            break;
                        case 5:
                            str31 = e0.h(parcel, readInt11);
                            break;
                        case 6:
                            str32 = e0.h(parcel, readInt11);
                            break;
                        case 7:
                            str33 = e0.h(parcel, readInt11);
                            break;
                        case '\b':
                            str34 = e0.h(parcel, readInt11);
                            break;
                        case '\t':
                            str35 = e0.h(parcel, readInt11);
                            break;
                        case '\n':
                            str29 = e0.h(parcel, readInt11);
                            break;
                        case 11:
                            str28 = e0.h(parcel, readInt11);
                            break;
                        case '\f':
                            i16 = e0.u(parcel, readInt11);
                            break;
                        case '\r':
                            arrayList5 = e0.l(parcel, readInt11, w8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (w8.f) e0.g(parcel, readInt11, w8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = e0.l(parcel, readInt11, LatLng.CREATOR);
                            break;
                        case 16:
                            str36 = e0.h(parcel, readInt11);
                            break;
                        case 17:
                            str37 = e0.h(parcel, readInt11);
                            break;
                        case 18:
                            arrayList9 = e0.l(parcel, readInt11, w8.b.CREATOR);
                            break;
                        case 19:
                            z25 = e0.n(parcel, readInt11);
                            break;
                        case 20:
                            arrayList10 = e0.l(parcel, readInt11, w8.g.CREATOR);
                            break;
                        case 21:
                            arrayList11 = e0.l(parcel, readInt11, w8.e.CREATOR);
                            break;
                        case 22:
                            arrayList12 = e0.l(parcel, readInt11, w8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (w8.c) e0.g(parcel, readInt11, w8.c.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt11);
                            break;
                    }
                    fVar = fVar2;
                }
                e0.m(parcel, z24);
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
                int z26 = e0.z(parcel);
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
                            str39 = e0.h(parcel, readInt12);
                            break;
                        case 3:
                            str40 = e0.h(parcel, readInt12);
                            break;
                        case 4:
                            strArr2 = e0.i(parcel, readInt12);
                            break;
                        case 5:
                            str41 = e0.h(parcel, readInt12);
                            break;
                        case 6:
                            qVar4 = (q) e0.g(parcel, readInt12, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) e0.g(parcel, readInt12, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) e0.k(parcel, readInt12, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) e0.k(parcel, readInt12, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) e0.g(parcel, readInt12, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) e0.g(parcel, readInt12, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) e0.k(parcel, readInt12, d.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt12);
                            break;
                    }
                }
                e0.m(parcel, z26);
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
                int z27 = e0.z(parcel);
                int i17 = 0;
                String str42 = null;
                String str43 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        i17 = e0.u(parcel, readInt13);
                    } else if (c16 == 2) {
                        str42 = e0.h(parcel, readInt13);
                    } else if (c16 == 3) {
                        str43 = e0.h(parcel, readInt13);
                    } else if (c16 != 4) {
                        e0.y(parcel, readInt13);
                    } else {
                        commonWalletObject = (CommonWalletObject) e0.g(parcel, readInt13, CommonWalletObject.CREATOR);
                    }
                }
                e0.m(parcel, z27);
                return new g(i17, str42, str43, commonWalletObject);
            case 13:
                int z28 = e0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        e0.y(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) e0.g(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z28);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 14:
                int z29 = e0.z(parcel);
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
                w8.f fVar4 = null;
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
                            str44 = e0.h(parcel, readInt15);
                            break;
                        case 3:
                            str53 = e0.h(parcel, readInt15);
                            break;
                        case 4:
                            str47 = e0.h(parcel, readInt15);
                            break;
                        case 5:
                            str48 = e0.h(parcel, readInt15);
                            break;
                        case 6:
                            str49 = e0.h(parcel, readInt15);
                            break;
                        case 7:
                            str50 = e0.h(parcel, readInt15);
                            break;
                        case '\b':
                            str51 = e0.h(parcel, readInt15);
                            break;
                        case '\t':
                            str45 = e0.h(parcel, readInt15);
                            break;
                        case '\n':
                            i18 = e0.u(parcel, readInt15);
                            break;
                        case 11:
                            arrayList13 = e0.l(parcel, readInt15, w8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (w8.f) e0.g(parcel, readInt15, w8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = e0.l(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 14:
                            str46 = e0.h(parcel, readInt15);
                            continue;
                        case 15:
                            str52 = e0.h(parcel, readInt15);
                            break;
                        case 16:
                            arrayList16 = e0.l(parcel, readInt15, w8.b.CREATOR);
                            break;
                        case 17:
                            z30 = e0.n(parcel, readInt15);
                            break;
                        case 18:
                            arrayList17 = e0.l(parcel, readInt15, w8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = e0.l(parcel, readInt15, w8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = e0.l(parcel, readInt15, w8.g.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt15);
                            break;
                    }
                    str46 = str54;
                }
                e0.m(parcel, z29);
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
                int z31 = e0.z(parcel);
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        str55 = e0.h(parcel, readInt16);
                    } else if (c17 != 3) {
                        e0.y(parcel, readInt16);
                    } else {
                        str56 = e0.h(parcel, readInt16);
                    }
                }
                e0.m(parcel, z31);
                w8.a aVar = new w8.a();
                aVar.a = str55;
                aVar.b = str56;
                return aVar;
            case 16:
                int z32 = e0.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str57 = null;
                String str58 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str57 = e0.h(parcel, readInt17);
                    } else if (c18 == 3) {
                        str58 = e0.h(parcel, readInt17);
                    } else if (c18 != 4) {
                        e0.y(parcel, readInt17);
                    } else {
                        arrayList20 = e0.l(parcel, readInt17, w8.a.CREATOR);
                    }
                }
                e0.m(parcel, z32);
                w8.b bVar2 = new w8.b();
                bVar2.a = str57;
                bVar2.b = str58;
                bVar2.c = arrayList20;
                return bVar2;
            case 17:
                int z33 = e0.z(parcel);
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
                            i19 = e0.u(parcel, readInt18);
                            break;
                        case 3:
                            str59 = e0.h(parcel, readInt18);
                            break;
                        case 4:
                            d = e0.q(parcel, readInt18);
                            break;
                        case 5:
                            str60 = e0.h(parcel, readInt18);
                            break;
                        case 6:
                            j10 = e0.w(parcel, readInt18);
                            break;
                        case 7:
                            i20 = e0.u(parcel, readInt18);
                            break;
                        default:
                            e0.y(parcel, readInt18);
                            break;
                    }
                }
                e0.m(parcel, z33);
                w8.d dVar2 = new w8.d();
                dVar2.a = i19;
                dVar2.b = str59;
                dVar2.c = d;
                dVar2.d = str60;
                dVar2.e = j10;
                dVar2.f = i20;
                return dVar2;
            case 18:
                int z34 = e0.z(parcel);
                String str61 = null;
                w8.d dVar3 = null;
                w8.f fVar5 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        str61 = e0.h(parcel, readInt19);
                    } else if (c19 == 3) {
                        dVar3 = (w8.d) e0.g(parcel, readInt19, w8.d.CREATOR);
                    } else if (c19 != 5) {
                        e0.y(parcel, readInt19);
                    } else {
                        fVar5 = (w8.f) e0.g(parcel, readInt19, w8.f.CREATOR);
                    }
                }
                e0.m(parcel, z34);
                w8.c cVar3 = new w8.c();
                cVar3.a = str61;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 19:
                int z35 = e0.z(parcel);
                String str62 = null;
                String str63 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        str62 = e0.h(parcel, readInt20);
                    } else if (c20 != 3) {
                        e0.y(parcel, readInt20);
                    } else {
                        str63 = e0.h(parcel, readInt20);
                    }
                }
                e0.m(parcel, z35);
                w8.e eVar2 = new w8.e();
                eVar2.a = str62;
                eVar2.b = str63;
                return eVar2;
            case 20:
                int z36 = e0.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        j11 = e0.w(parcel, readInt21);
                    } else if (c21 != 3) {
                        e0.y(parcel, readInt21);
                    } else {
                        j12 = e0.w(parcel, readInt21);
                    }
                }
                e0.m(parcel, z36);
                w8.f fVar6 = new w8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            case 21:
                int z37 = e0.z(parcel);
                String str64 = null;
                String str65 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        str64 = e0.h(parcel, readInt22);
                    } else if (c22 != 3) {
                        e0.y(parcel, readInt22);
                    } else {
                        str65 = e0.h(parcel, readInt22);
                    }
                }
                e0.m(parcel, z37);
                w8.g gVar = new w8.g();
                gVar.a = str64;
                gVar.b = str65;
                return gVar;
            case 22:
                int z38 = e0.z(parcel);
                String str66 = null;
                String str67 = null;
                w8.f fVar7 = null;
                w8.g gVar2 = null;
                w8.g gVar3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 2) {
                        str66 = e0.h(parcel, readInt23);
                    } else if (c23 == 3) {
                        str67 = e0.h(parcel, readInt23);
                    } else if (c23 == 4) {
                        fVar7 = (w8.f) e0.g(parcel, readInt23, w8.f.CREATOR);
                    } else if (c23 == 5) {
                        gVar2 = (w8.g) e0.g(parcel, readInt23, w8.g.CREATOR);
                    } else if (c23 != 6) {
                        e0.y(parcel, readInt23);
                    } else {
                        gVar3 = (w8.g) e0.g(parcel, readInt23, w8.g.CREATOR);
                    }
                }
                e0.m(parcel, z38);
                w8.h hVar2 = new w8.h();
                hVar2.a = str66;
                hVar2.b = str67;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            case 23:
                int z39 = e0.z(parcel);
                boolean z40 = false;
                int i21 = 0;
                boolean z41 = false;
                x5.d dVar4 = null;
                x5.a aVar2 = null;
                String str68 = null;
                x5.c cVar4 = null;
                x5.b bVar3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            dVar4 = (x5.d) e0.g(parcel, readInt24, x5.d.CREATOR);
                            break;
                        case 2:
                            aVar2 = (x5.a) e0.g(parcel, readInt24, x5.a.CREATOR);
                            break;
                        case 3:
                            str68 = e0.h(parcel, readInt24);
                            break;
                        case 4:
                            z40 = e0.n(parcel, readInt24);
                            break;
                        case 5:
                            i21 = e0.u(parcel, readInt24);
                            break;
                        case 6:
                            cVar4 = (x5.c) e0.g(parcel, readInt24, x5.c.CREATOR);
                            break;
                        case 7:
                            bVar3 = (x5.b) e0.g(parcel, readInt24, x5.b.CREATOR);
                            break;
                        case '\b':
                            z41 = e0.n(parcel, readInt24);
                            break;
                        default:
                            e0.y(parcel, readInt24);
                            break;
                    }
                }
                e0.m(parcel, z39);
                return new x5.e(dVar4, aVar2, str68, z40, i21, cVar4, bVar3, z41);
            case 24:
                int z42 = e0.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        e0.y(parcel, readInt25);
                    } else {
                        pendingIntent2 = (PendingIntent) e0.g(parcel, readInt25, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z42);
                return new x5.f(pendingIntent2);
            case 25:
                int z43 = e0.z(parcel);
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
                            z44 = e0.n(parcel, readInt26);
                            break;
                        case 2:
                            str69 = e0.h(parcel, readInt26);
                            break;
                        case 3:
                            str70 = e0.h(parcel, readInt26);
                            break;
                        case 4:
                            z45 = e0.n(parcel, readInt26);
                            break;
                        case 5:
                            str71 = e0.h(parcel, readInt26);
                            break;
                        case 6:
                            arrayList21 = e0.j(parcel, readInt26);
                            break;
                        case 7:
                            z46 = e0.n(parcel, readInt26);
                            break;
                        default:
                            e0.y(parcel, readInt26);
                            break;
                    }
                }
                e0.m(parcel, z43);
                return new x5.a(z44, str69, str70, z45, str71, arrayList21, z46);
            case 26:
                int z47 = e0.z(parcel);
                String str72 = null;
                boolean z48 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c24 = (char) readInt27;
                    if (c24 == 1) {
                        z48 = e0.n(parcel, readInt27);
                    } else if (c24 != 2) {
                        e0.y(parcel, readInt27);
                    } else {
                        str72 = e0.h(parcel, readInt27);
                    }
                }
                e0.m(parcel, z47);
                return new x5.b(str72, z48);
            case 27:
                int z49 = e0.z(parcel);
                byte[] bArr = null;
                boolean z50 = false;
                String str73 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt28 = parcel.readInt();
                    char c25 = (char) readInt28;
                    if (c25 == 1) {
                        z50 = e0.n(parcel, readInt28);
                    } else if (c25 == 2) {
                        bArr = e0.b(parcel, readInt28);
                    } else if (c25 != 3) {
                        e0.y(parcel, readInt28);
                    } else {
                        str73 = e0.h(parcel, readInt28);
                    }
                }
                e0.m(parcel, z49);
                return new x5.c(z50, bArr, str73);
            case 28:
                int z51 = e0.z(parcel);
                boolean z52 = false;
                while (parcel.dataPosition() < z51) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 1) {
                        e0.y(parcel, readInt29);
                    } else {
                        z52 = e0.n(parcel, readInt29);
                    }
                }
                e0.m(parcel, z51);
                return new x5.d(z52);
            default:
                int z53 = e0.z(parcel);
                String str74 = null;
                String str75 = null;
                String str76 = null;
                String str77 = null;
                Uri uri = null;
                String str78 = null;
                String str79 = null;
                String str80 = null;
                c7.u uVar = null;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    switch ((char) readInt30) {
                        case 1:
                            str74 = e0.h(parcel, readInt30);
                            break;
                        case 2:
                            str75 = e0.h(parcel, readInt30);
                            break;
                        case 3:
                            str76 = e0.h(parcel, readInt30);
                            break;
                        case 4:
                            str77 = e0.h(parcel, readInt30);
                            break;
                        case 5:
                            uri = (Uri) e0.g(parcel, readInt30, Uri.CREATOR);
                            break;
                        case 6:
                            str78 = e0.h(parcel, readInt30);
                            break;
                        case 7:
                            str79 = e0.h(parcel, readInt30);
                            break;
                        case '\b':
                            str80 = e0.h(parcel, readInt30);
                            break;
                        case '\t':
                            uVar = (c7.u) e0.g(parcel, readInt30, c7.u.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt30);
                            break;
                    }
                }
                e0.m(parcel, z53);
                return new x5.g(str74, str75, str76, str77, uri, str78, str79, str80, uVar);
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
                return new w8.a[i10];
            case 16:
                return new w8.b[i10];
            case 17:
                return new w8.d[i10];
            case 18:
                return new w8.c[i10];
            case 19:
                return new w8.e[i10];
            case 20:
                return new w8.f[i10];
            case 21:
                return new w8.g[i10];
            case 22:
                return new w8.h[i10];
            case 23:
                return new x5.e[i10];
            case 24:
                return new x5.f[i10];
            case 25:
                return new x5.a[i10];
            case 26:
                return new x5.b[i10];
            case 27:
                return new x5.c[i10];
            case 28:
                return new x5.d[i10];
            default:
                return new x5.g[i10];
        }
    }
}
