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
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import w7.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                int z10 = g0.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        g0.y(parcel, readInt);
                    } else {
                        arrayList = g0.j(parcel, readInt);
                    }
                }
                g0.m(parcel, z10);
                m mVar = new m();
                mVar.a = arrayList;
                return mVar;
            case 1:
                int z11 = g0.z(parcel);
                int i10 = 0;
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = g0.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        str = g0.h(parcel, readInt2);
                    } else if (c10 != 3) {
                        g0.y(parcel, readInt2);
                    } else {
                        str2 = g0.h(parcel, readInt2);
                    }
                }
                g0.m(parcel, z11);
                n nVar = new n();
                nVar.a = i10;
                nVar.b = str;
                nVar.c = str2;
                return nVar;
            case 2:
                int z12 = g0.z(parcel);
                String str3 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str3 = g0.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        g0.y(parcel, readInt3);
                    } else {
                        bundle = g0.a(parcel, readInt3);
                    }
                }
                g0.m(parcel, z12);
                t tVar = new t();
                tVar.a = str3;
                tVar.b = bundle;
                return tVar;
            case 3:
                int z13 = g0.z(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                boolean z14 = false;
                String str13 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str4 = g0.h(parcel, readInt4);
                            break;
                        case 3:
                            str13 = g0.h(parcel, readInt4);
                            break;
                        case 4:
                            str5 = g0.h(parcel, readInt4);
                            break;
                        case 5:
                            str6 = g0.h(parcel, readInt4);
                            break;
                        case 6:
                            str7 = g0.h(parcel, readInt4);
                            break;
                        case 7:
                            str8 = g0.h(parcel, readInt4);
                            break;
                        case '\b':
                            str9 = g0.h(parcel, readInt4);
                            break;
                        case '\t':
                            str10 = g0.h(parcel, readInt4);
                            break;
                        case '\n':
                            str11 = g0.h(parcel, readInt4);
                            break;
                        case 11:
                            z14 = g0.n(parcel, readInt4);
                            break;
                        case '\f':
                            str12 = g0.h(parcel, readInt4);
                            break;
                        default:
                            g0.y(parcel, readInt4);
                            break;
                    }
                }
                g0.m(parcel, z13);
                q qVar = new q();
                qVar.a = str4;
                qVar.b = str13;
                qVar.c = str5;
                qVar.d = str6;
                qVar.e = str7;
                qVar.f = str8;
                qVar.h = str9;
                qVar.n = str10;
                qVar.r = str11;
                qVar.s = z14;
                qVar.w = str12;
                return qVar;
            case 4:
                int z15 = g0.z(parcel);
                String str14 = null;
                String str15 = null;
                UserAddress userAddress = null;
                int i11 = 0;
                String str16 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        str14 = g0.h(parcel, readInt5);
                    } else if (c12 == 2) {
                        str16 = g0.h(parcel, readInt5);
                    } else if (c12 == 3) {
                        str15 = g0.h(parcel, readInt5);
                    } else if (c12 == 4) {
                        i11 = g0.u(parcel, readInt5);
                    } else if (c12 != 5) {
                        g0.y(parcel, readInt5);
                    } else {
                        userAddress = (UserAddress) g0.g(parcel, readInt5, UserAddress.CREATOR);
                    }
                }
                g0.m(parcel, z15);
                b bVar = new b();
                bVar.a = str14;
                bVar.b = str16;
                bVar.c = str15;
                bVar.d = i11;
                bVar.e = userAddress;
                return bVar;
            case 5:
                int z16 = g0.z(parcel);
                ArrayList arrayList2 = null;
                boolean z17 = false;
                boolean z18 = true;
                int i12 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        arrayList2 = g0.e(parcel, readInt6);
                    } else if (c13 == 2) {
                        z18 = g0.n(parcel, readInt6);
                    } else if (c13 == 3) {
                        z17 = g0.n(parcel, readInt6);
                    } else if (c13 != 4) {
                        g0.y(parcel, readInt6);
                    } else {
                        i12 = g0.u(parcel, readInt6);
                    }
                }
                g0.m(parcel, z16);
                c cVar = new c();
                cVar.a = arrayList2;
                cVar.b = z18;
                cVar.c = z17;
                cVar.d = i12;
                return cVar;
            case 6:
                int z19 = g0.z(parcel);
                String str17 = null;
                String str18 = null;
                r rVar = null;
                String str19 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress2 = null;
                UserAddress userAddress3 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z19) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            str17 = g0.h(parcel, readInt7);
                            break;
                        case 3:
                            str18 = g0.h(parcel, readInt7);
                            break;
                        case 4:
                            rVar = (r) g0.g(parcel, readInt7, r.CREATOR);
                            break;
                        case 5:
                            str19 = g0.h(parcel, readInt7);
                            break;
                        case 6:
                            qVar2 = (q) g0.g(parcel, readInt7, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) g0.g(parcel, readInt7, q.CREATOR);
                            break;
                        case '\b':
                            strArr = g0.i(parcel, readInt7);
                            break;
                        case '\t':
                            userAddress2 = (UserAddress) g0.g(parcel, readInt7, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) g0.g(parcel, readInt7, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) g0.k(parcel, readInt7, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) g0.g(parcel, readInt7, k.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt7);
                            break;
                    }
                }
                g0.m(parcel, z19);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str17;
                fullWallet.b = str18;
                fullWallet.c = rVar;
                fullWallet.d = str19;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress2;
                fullWallet.r = userAddress3;
                fullWallet.s = dVarArr;
                fullWallet.w = kVar;
                return fullWallet;
            case 7:
                int z20 = g0.z(parcel);
                String str20 = null;
                int i13 = 0;
                String str21 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str20 = g0.h(parcel, readInt8);
                    } else if (c14 == 3) {
                        str21 = g0.h(parcel, readInt8);
                    } else if (c14 != 4) {
                        g0.y(parcel, readInt8);
                    } else {
                        i13 = g0.u(parcel, readInt8);
                    }
                }
                g0.m(parcel, z20);
                d dVar = new d();
                dVar.a = str20;
                dVar.b = str21;
                dVar.c = i13;
                return dVar;
            case 8:
                int z21 = g0.z(parcel);
                ArrayList arrayList3 = null;
                String str22 = null;
                ArrayList arrayList4 = null;
                String str23 = null;
                boolean z22 = false;
                String str24 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            arrayList3 = g0.e(parcel, readInt9);
                            break;
                        case 3:
                        default:
                            g0.y(parcel, readInt9);
                            break;
                        case 4:
                            str24 = g0.h(parcel, readInt9);
                            break;
                        case 5:
                            str22 = g0.h(parcel, readInt9);
                            break;
                        case 6:
                            arrayList4 = g0.e(parcel, readInt9);
                            break;
                        case 7:
                            z22 = g0.n(parcel, readInt9);
                            break;
                        case '\b':
                            str23 = g0.h(parcel, readInt9);
                            break;
                    }
                }
                g0.m(parcel, z21);
                e eVar = new e();
                eVar.a = arrayList3;
                eVar.b = str24;
                eVar.c = str22;
                eVar.d = arrayList4;
                eVar.e = z22;
                eVar.f = str23;
                return eVar;
            case 9:
                int z23 = g0.z(parcel);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str25 = null;
                ArrayList arrayList8 = arrayList6;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                w8.f fVar = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                w8.c cVar2 = null;
                int i14 = 0;
                boolean z24 = false;
                String str36 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    w8.f fVar2 = fVar;
                    switch ((char) readInt10) {
                        case 2:
                            str25 = g0.h(parcel, readInt10);
                            break;
                        case 3:
                            str36 = g0.h(parcel, readInt10);
                            break;
                        case 4:
                            str28 = g0.h(parcel, readInt10);
                            break;
                        case 5:
                            str29 = g0.h(parcel, readInt10);
                            break;
                        case 6:
                            str30 = g0.h(parcel, readInt10);
                            break;
                        case 7:
                            str31 = g0.h(parcel, readInt10);
                            break;
                        case '\b':
                            str32 = g0.h(parcel, readInt10);
                            break;
                        case '\t':
                            str33 = g0.h(parcel, readInt10);
                            break;
                        case '\n':
                            str27 = g0.h(parcel, readInt10);
                            break;
                        case 11:
                            str26 = g0.h(parcel, readInt10);
                            break;
                        case '\f':
                            i14 = g0.u(parcel, readInt10);
                            break;
                        case '\r':
                            arrayList5 = g0.l(parcel, readInt10, w8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (w8.f) g0.g(parcel, readInt10, w8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList8 = g0.l(parcel, readInt10, LatLng.CREATOR);
                            break;
                        case 16:
                            str34 = g0.h(parcel, readInt10);
                            break;
                        case 17:
                            str35 = g0.h(parcel, readInt10);
                            break;
                        case 18:
                            arrayList9 = g0.l(parcel, readInt10, w8.b.CREATOR);
                            break;
                        case 19:
                            z24 = g0.n(parcel, readInt10);
                            break;
                        case 20:
                            arrayList10 = g0.l(parcel, readInt10, w8.g.CREATOR);
                            break;
                        case 21:
                            arrayList11 = g0.l(parcel, readInt10, w8.e.CREATOR);
                            break;
                        case 22:
                            arrayList12 = g0.l(parcel, readInt10, w8.g.CREATOR);
                            break;
                        case 23:
                            cVar2 = (w8.c) g0.g(parcel, readInt10, w8.c.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt10);
                            break;
                    }
                    fVar = fVar2;
                }
                g0.m(parcel, z23);
                f fVar3 = new f();
                fVar3.a = str25;
                fVar3.b = str36;
                fVar3.c = str28;
                fVar3.d = str29;
                fVar3.e = str30;
                fVar3.f = str31;
                fVar3.h = str32;
                fVar3.n = str33;
                fVar3.r = str27;
                fVar3.s = str26;
                fVar3.w = i14;
                fVar3.x = arrayList5;
                fVar3.y = fVar;
                fVar3.D = arrayList8;
                fVar3.E = str34;
                fVar3.F = str35;
                fVar3.G = arrayList9;
                fVar3.H = z24;
                fVar3.I = arrayList10;
                fVar3.J = arrayList11;
                fVar3.K = arrayList12;
                fVar3.L = cVar2;
                return fVar3;
            case 10:
                int z25 = g0.z(parcel);
                String str37 = null;
                String str38 = null;
                String[] strArr2 = null;
                String str39 = null;
                q qVar4 = null;
                q qVar5 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str37 = g0.h(parcel, readInt11);
                            break;
                        case 3:
                            str38 = g0.h(parcel, readInt11);
                            break;
                        case 4:
                            strArr2 = g0.i(parcel, readInt11);
                            break;
                        case 5:
                            str39 = g0.h(parcel, readInt11);
                            break;
                        case 6:
                            qVar4 = (q) g0.g(parcel, readInt11, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) g0.g(parcel, readInt11, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) g0.k(parcel, readInt11, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) g0.k(parcel, readInt11, g.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) g0.g(parcel, readInt11, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) g0.g(parcel, readInt11, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) g0.k(parcel, readInt11, d.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt11);
                            break;
                    }
                }
                g0.m(parcel, z25);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str37;
                maskedWallet.b = str38;
                maskedWallet.c = strArr2;
                maskedWallet.d = str39;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress4;
                maskedWallet.s = userAddress5;
                maskedWallet.w = dVarArr2;
                return maskedWallet;
            case 11:
                int z26 = g0.z(parcel);
                int i15 = 0;
                String str40 = null;
                String str41 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z26) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 1) {
                        i15 = g0.u(parcel, readInt12);
                    } else if (c15 == 2) {
                        str40 = g0.h(parcel, readInt12);
                    } else if (c15 == 3) {
                        str41 = g0.h(parcel, readInt12);
                    } else if (c15 != 4) {
                        g0.y(parcel, readInt12);
                    } else {
                        commonWalletObject = (CommonWalletObject) g0.g(parcel, readInt12, CommonWalletObject.CREATOR);
                    }
                }
                g0.m(parcel, z26);
                return new g(i15, str40, str41, commonWalletObject);
            case 12:
                int z27 = g0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        g0.y(parcel, readInt13);
                    } else {
                        pendingIntent = (PendingIntent) g0.g(parcel, readInt13, PendingIntent.CREATOR);
                    }
                }
                g0.m(parcel, z27);
                h hVar = new h();
                hVar.a = pendingIntent;
                return hVar;
            case 13:
                int z28 = g0.z(parcel);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                String str42 = null;
                ArrayList arrayList16 = arrayList15;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                String str43 = null;
                String str44 = null;
                w8.f fVar4 = null;
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                int i16 = 0;
                boolean z29 = false;
                String str51 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    String str52 = str44;
                    switch ((char) readInt14) {
                        case 2:
                            str42 = g0.h(parcel, readInt14);
                            break;
                        case 3:
                            str51 = g0.h(parcel, readInt14);
                            break;
                        case 4:
                            str45 = g0.h(parcel, readInt14);
                            break;
                        case 5:
                            str46 = g0.h(parcel, readInt14);
                            break;
                        case 6:
                            str47 = g0.h(parcel, readInt14);
                            break;
                        case 7:
                            str48 = g0.h(parcel, readInt14);
                            break;
                        case '\b':
                            str49 = g0.h(parcel, readInt14);
                            break;
                        case '\t':
                            str43 = g0.h(parcel, readInt14);
                            break;
                        case '\n':
                            i16 = g0.u(parcel, readInt14);
                            break;
                        case 11:
                            arrayList13 = g0.l(parcel, readInt14, w8.h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (w8.f) g0.g(parcel, readInt14, w8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList14 = g0.l(parcel, readInt14, LatLng.CREATOR);
                            break;
                        case 14:
                            str44 = g0.h(parcel, readInt14);
                            continue;
                        case 15:
                            str50 = g0.h(parcel, readInt14);
                            break;
                        case 16:
                            arrayList16 = g0.l(parcel, readInt14, w8.b.CREATOR);
                            break;
                        case 17:
                            z29 = g0.n(parcel, readInt14);
                            break;
                        case 18:
                            arrayList17 = g0.l(parcel, readInt14, w8.g.CREATOR);
                            break;
                        case 19:
                            arrayList18 = g0.l(parcel, readInt14, w8.e.CREATOR);
                            break;
                        case 20:
                            arrayList19 = g0.l(parcel, readInt14, w8.g.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt14);
                            break;
                    }
                    str44 = str52;
                }
                g0.m(parcel, z28);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str42;
                commonWalletObject2.b = str51;
                commonWalletObject2.c = str45;
                commonWalletObject2.d = str46;
                commonWalletObject2.e = str47;
                commonWalletObject2.f = str48;
                commonWalletObject2.h = str49;
                commonWalletObject2.n = str43;
                commonWalletObject2.r = i16;
                commonWalletObject2.s = arrayList13;
                commonWalletObject2.w = fVar4;
                commonWalletObject2.x = arrayList14;
                commonWalletObject2.y = str44;
                commonWalletObject2.D = str50;
                commonWalletObject2.E = arrayList16;
                commonWalletObject2.F = z29;
                commonWalletObject2.G = arrayList17;
                commonWalletObject2.H = arrayList18;
                commonWalletObject2.I = arrayList19;
                return commonWalletObject2;
            case 14:
                int z30 = g0.z(parcel);
                String str53 = null;
                String str54 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 == 2) {
                        str53 = g0.h(parcel, readInt15);
                    } else if (c16 != 3) {
                        g0.y(parcel, readInt15);
                    } else {
                        str54 = g0.h(parcel, readInt15);
                    }
                }
                g0.m(parcel, z30);
                w8.a aVar = new w8.a();
                aVar.a = str53;
                aVar.b = str54;
                return aVar;
            case 15:
                int z31 = g0.z(parcel);
                ArrayList arrayList20 = new ArrayList();
                String str55 = null;
                String str56 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        str55 = g0.h(parcel, readInt16);
                    } else if (c17 == 3) {
                        str56 = g0.h(parcel, readInt16);
                    } else if (c17 != 4) {
                        g0.y(parcel, readInt16);
                    } else {
                        arrayList20 = g0.l(parcel, readInt16, w8.a.CREATOR);
                    }
                }
                g0.m(parcel, z31);
                w8.b bVar2 = new w8.b();
                bVar2.a = str55;
                bVar2.b = str56;
                bVar2.c = arrayList20;
                return bVar2;
            case 16:
                int z32 = g0.z(parcel);
                int i17 = 0;
                String str57 = null;
                int i18 = -1;
                long j10 = 0;
                double d = 0.0d;
                String str58 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            i17 = g0.u(parcel, readInt17);
                            break;
                        case 3:
                            str57 = g0.h(parcel, readInt17);
                            break;
                        case 4:
                            d = g0.q(parcel, readInt17);
                            break;
                        case 5:
                            str58 = g0.h(parcel, readInt17);
                            break;
                        case 6:
                            j10 = g0.w(parcel, readInt17);
                            break;
                        case 7:
                            i18 = g0.u(parcel, readInt17);
                            break;
                        default:
                            g0.y(parcel, readInt17);
                            break;
                    }
                }
                g0.m(parcel, z32);
                w8.d dVar2 = new w8.d();
                dVar2.a = i17;
                dVar2.b = str57;
                dVar2.c = d;
                dVar2.d = str58;
                dVar2.e = j10;
                dVar2.f = i18;
                return dVar2;
            case 17:
                int z33 = g0.z(parcel);
                String str59 = null;
                w8.d dVar3 = null;
                w8.f fVar5 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 2) {
                        str59 = g0.h(parcel, readInt18);
                    } else if (c18 == 3) {
                        dVar3 = (w8.d) g0.g(parcel, readInt18, w8.d.CREATOR);
                    } else if (c18 != 5) {
                        g0.y(parcel, readInt18);
                    } else {
                        fVar5 = (w8.f) g0.g(parcel, readInt18, w8.f.CREATOR);
                    }
                }
                g0.m(parcel, z33);
                w8.c cVar3 = new w8.c();
                cVar3.a = str59;
                cVar3.b = dVar3;
                cVar3.c = fVar5;
                return cVar3;
            case 18:
                int z34 = g0.z(parcel);
                String str60 = null;
                String str61 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        str60 = g0.h(parcel, readInt19);
                    } else if (c19 != 3) {
                        g0.y(parcel, readInt19);
                    } else {
                        str61 = g0.h(parcel, readInt19);
                    }
                }
                g0.m(parcel, z34);
                w8.e eVar2 = new w8.e();
                eVar2.a = str60;
                eVar2.b = str61;
                return eVar2;
            case 19:
                int z35 = g0.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        j11 = g0.w(parcel, readInt20);
                    } else if (c20 != 3) {
                        g0.y(parcel, readInt20);
                    } else {
                        j12 = g0.w(parcel, readInt20);
                    }
                }
                g0.m(parcel, z35);
                w8.f fVar6 = new w8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            case 20:
                int z36 = g0.z(parcel);
                String str62 = null;
                String str63 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        str62 = g0.h(parcel, readInt21);
                    } else if (c21 != 3) {
                        g0.y(parcel, readInt21);
                    } else {
                        str63 = g0.h(parcel, readInt21);
                    }
                }
                g0.m(parcel, z36);
                w8.g gVar = new w8.g();
                gVar.a = str62;
                gVar.b = str63;
                return gVar;
            case 21:
                int z37 = g0.z(parcel);
                String str64 = null;
                String str65 = null;
                w8.f fVar7 = null;
                w8.g gVar2 = null;
                w8.g gVar3 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        str64 = g0.h(parcel, readInt22);
                    } else if (c22 == 3) {
                        str65 = g0.h(parcel, readInt22);
                    } else if (c22 == 4) {
                        fVar7 = (w8.f) g0.g(parcel, readInt22, w8.f.CREATOR);
                    } else if (c22 == 5) {
                        gVar2 = (w8.g) g0.g(parcel, readInt22, w8.g.CREATOR);
                    } else if (c22 != 6) {
                        g0.y(parcel, readInt22);
                    } else {
                        gVar3 = (w8.g) g0.g(parcel, readInt22, w8.g.CREATOR);
                    }
                }
                g0.m(parcel, z37);
                w8.h hVar2 = new w8.h();
                hVar2.a = str64;
                hVar2.b = str65;
                hVar2.c = fVar7;
                hVar2.d = gVar2;
                hVar2.e = gVar3;
                return hVar2;
            case 22:
                int z38 = g0.z(parcel);
                boolean z39 = false;
                int i19 = 0;
                boolean z40 = false;
                x5.d dVar4 = null;
                x5.a aVar2 = null;
                String str66 = null;
                x5.c cVar4 = null;
                x5.b bVar3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            dVar4 = (x5.d) g0.g(parcel, readInt23, x5.d.CREATOR);
                            break;
                        case 2:
                            aVar2 = (x5.a) g0.g(parcel, readInt23, x5.a.CREATOR);
                            break;
                        case 3:
                            str66 = g0.h(parcel, readInt23);
                            break;
                        case 4:
                            z39 = g0.n(parcel, readInt23);
                            break;
                        case 5:
                            i19 = g0.u(parcel, readInt23);
                            break;
                        case 6:
                            cVar4 = (x5.c) g0.g(parcel, readInt23, x5.c.CREATOR);
                            break;
                        case 7:
                            bVar3 = (x5.b) g0.g(parcel, readInt23, x5.b.CREATOR);
                            break;
                        case '\b':
                            z40 = g0.n(parcel, readInt23);
                            break;
                        default:
                            g0.y(parcel, readInt23);
                            break;
                    }
                }
                g0.m(parcel, z38);
                return new x5.e(dVar4, aVar2, str66, z39, i19, cVar4, bVar3, z40);
            case 23:
                int z41 = g0.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        g0.y(parcel, readInt24);
                    } else {
                        pendingIntent2 = (PendingIntent) g0.g(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                g0.m(parcel, z41);
                return new x5.f(pendingIntent2);
            case 24:
                int z42 = g0.z(parcel);
                boolean z43 = false;
                boolean z44 = false;
                boolean z45 = false;
                String str67 = null;
                String str68 = null;
                String str69 = null;
                ArrayList arrayList21 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            z43 = g0.n(parcel, readInt25);
                            break;
                        case 2:
                            str67 = g0.h(parcel, readInt25);
                            break;
                        case 3:
                            str68 = g0.h(parcel, readInt25);
                            break;
                        case 4:
                            z44 = g0.n(parcel, readInt25);
                            break;
                        case 5:
                            str69 = g0.h(parcel, readInt25);
                            break;
                        case 6:
                            arrayList21 = g0.j(parcel, readInt25);
                            break;
                        case 7:
                            z45 = g0.n(parcel, readInt25);
                            break;
                        default:
                            g0.y(parcel, readInt25);
                            break;
                    }
                }
                g0.m(parcel, z42);
                return new x5.a(z43, str67, str68, z44, str69, arrayList21, z45);
            case 25:
                int z46 = g0.z(parcel);
                String str70 = null;
                boolean z47 = false;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c23 = (char) readInt26;
                    if (c23 == 1) {
                        z47 = g0.n(parcel, readInt26);
                    } else if (c23 != 2) {
                        g0.y(parcel, readInt26);
                    } else {
                        str70 = g0.h(parcel, readInt26);
                    }
                }
                g0.m(parcel, z46);
                return new x5.b(str70, z47);
            case 26:
                int z48 = g0.z(parcel);
                byte[] bArr = null;
                boolean z49 = false;
                String str71 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt27 = parcel.readInt();
                    char c24 = (char) readInt27;
                    if (c24 == 1) {
                        z49 = g0.n(parcel, readInt27);
                    } else if (c24 == 2) {
                        bArr = g0.b(parcel, readInt27);
                    } else if (c24 != 3) {
                        g0.y(parcel, readInt27);
                    } else {
                        str71 = g0.h(parcel, readInt27);
                    }
                }
                g0.m(parcel, z48);
                return new x5.c(z49, bArr, str71);
            case 27:
                int z50 = g0.z(parcel);
                boolean z51 = false;
                while (parcel.dataPosition() < z50) {
                    int readInt28 = parcel.readInt();
                    if (((char) readInt28) != 1) {
                        g0.y(parcel, readInt28);
                    } else {
                        z51 = g0.n(parcel, readInt28);
                    }
                }
                g0.m(parcel, z50);
                return new x5.d(z51);
            case 28:
                int z52 = g0.z(parcel);
                String str72 = null;
                String str73 = null;
                String str74 = null;
                String str75 = null;
                Uri uri = null;
                String str76 = null;
                String str77 = null;
                String str78 = null;
                c7.u uVar = null;
                while (parcel.dataPosition() < z52) {
                    int readInt29 = parcel.readInt();
                    switch ((char) readInt29) {
                        case 1:
                            str72 = g0.h(parcel, readInt29);
                            break;
                        case 2:
                            str73 = g0.h(parcel, readInt29);
                            break;
                        case 3:
                            str74 = g0.h(parcel, readInt29);
                            break;
                        case 4:
                            str75 = g0.h(parcel, readInt29);
                            break;
                        case 5:
                            uri = (Uri) g0.g(parcel, readInt29, Uri.CREATOR);
                            break;
                        case 6:
                            str76 = g0.h(parcel, readInt29);
                            break;
                        case 7:
                            str77 = g0.h(parcel, readInt29);
                            break;
                        case '\b':
                            str78 = g0.h(parcel, readInt29);
                            break;
                        case '\t':
                            uVar = (c7.u) g0.g(parcel, readInt29, c7.u.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt29);
                            break;
                    }
                }
                g0.m(parcel, z52);
                return new x5.g(str72, str73, str74, str75, uri, str76, str77, str78, uVar);
            default:
                int z53 = g0.z(parcel);
                String str79 = null;
                String str80 = null;
                String str81 = null;
                String str82 = null;
                String str83 = null;
                ArrayList arrayList22 = null;
                int i20 = 0;
                int i21 = 0;
                boolean z54 = false;
                boolean z55 = false;
                boolean z56 = false;
                int i22 = 0;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    switch ((char) readInt30) {
                        case 2:
                            str79 = g0.h(parcel, readInt30);
                            break;
                        case 3:
                            str80 = g0.h(parcel, readInt30);
                            break;
                        case 4:
                            i20 = g0.u(parcel, readInt30);
                            break;
                        case 5:
                            i21 = g0.u(parcel, readInt30);
                            break;
                        case 6:
                            z54 = g0.n(parcel, readInt30);
                            break;
                        case 7:
                            z55 = g0.n(parcel, readInt30);
                            break;
                        case '\b':
                            str81 = g0.h(parcel, readInt30);
                            break;
                        case '\t':
                            z56 = g0.n(parcel, readInt30);
                            break;
                        case '\n':
                            str82 = g0.h(parcel, readInt30);
                            break;
                        case 11:
                            str83 = g0.h(parcel, readInt30);
                            break;
                        case '\f':
                            i22 = g0.u(parcel, readInt30);
                            break;
                        case '\r':
                            arrayList22 = g0.j(parcel, readInt30);
                            break;
                        default:
                            g0.y(parcel, readInt30);
                            break;
                    }
                }
                g0.m(parcel, z53);
                return new ConnectionConfiguration(str79, str80, i20, i21, z54, z55, str81, z56, str82, str83, i22, arrayList22);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new m[i10];
            case 1:
                return new n[i10];
            case 2:
                return new t[i10];
            case 3:
                return new q[i10];
            case 4:
                return new b[i10];
            case 5:
                return new c[i10];
            case 6:
                return new FullWallet[i10];
            case 7:
                return new d[i10];
            case 8:
                return new e[i10];
            case 9:
                return new f[i10];
            case 10:
                return new MaskedWallet[i10];
            case 11:
                return new g[i10];
            case 12:
                return new h[i10];
            case 13:
                return new CommonWalletObject[i10];
            case 14:
                return new w8.a[i10];
            case 15:
                return new w8.b[i10];
            case 16:
                return new w8.d[i10];
            case 17:
                return new w8.c[i10];
            case 18:
                return new w8.e[i10];
            case 19:
                return new w8.f[i10];
            case 20:
                return new w8.g[i10];
            case 21:
                return new w8.h[i10];
            case 22:
                return new x5.e[i10];
            case 23:
                return new x5.f[i10];
            case 24:
                return new x5.a[i10];
            case 25:
                return new x5.b[i10];
            case 26:
                return new x5.c[i10];
            case 27:
                return new x5.d[i10];
            case 28:
                return new x5.g[i10];
            default:
                return new ConnectionConfiguration[i10];
        }
    }
}
