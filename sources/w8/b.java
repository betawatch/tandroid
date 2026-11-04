package w8;

import android.app.PendingIntent;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
import x8.i;
import x8.j;
import x8.k;
import x8.l;
import x8.m;
import x8.n;
import x8.q;
import x8.r;
import x8.s;
import y8.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                PointF[] pointFArr = null;
                int i3 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 2) {
                        pointFArr = (PointF[]) g6.e.k(parcel, readInt, PointF.CREATOR);
                    } else if (c2 != 3) {
                        g6.e.y(parcel, readInt);
                    } else {
                        i3 = g6.e.u(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new a(pointFArr, i3);
            case 1:
                int z11 = g6.e.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                float f17 = Float.MAX_VALUE;
                float f18 = Float.MAX_VALUE;
                float f19 = Float.MAX_VALUE;
                LandmarkParcel[] landmarkParcelArr = null;
                a[] aVarArr = null;
                float f20 = -1.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = g6.e.u(parcel, readInt2);
                            break;
                        case 2:
                            i11 = g6.e.u(parcel, readInt2);
                            break;
                        case 3:
                            f10 = g6.e.r(parcel, readInt2);
                            break;
                        case 4:
                            f11 = g6.e.r(parcel, readInt2);
                            break;
                        case 5:
                            f12 = g6.e.r(parcel, readInt2);
                            break;
                        case 6:
                            f13 = g6.e.r(parcel, readInt2);
                            break;
                        case 7:
                            f17 = g6.e.r(parcel, readInt2);
                            break;
                        case '\b':
                            f18 = g6.e.r(parcel, readInt2);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) g6.e.k(parcel, readInt2, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f14 = g6.e.r(parcel, readInt2);
                            break;
                        case 11:
                            f15 = g6.e.r(parcel, readInt2);
                            break;
                        case '\f':
                            f16 = g6.e.r(parcel, readInt2);
                            break;
                        case '\r':
                            aVarArr = (a[]) g6.e.k(parcel, readInt2, a.CREATOR);
                            break;
                        case 14:
                            f19 = g6.e.r(parcel, readInt2);
                            break;
                        case 15:
                            f20 = g6.e.r(parcel, readInt2);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z11);
                return new FaceParcel(i10, i11, f10, f11, f12, f13, f17, f18, f19, landmarkParcelArr, f14, f15, f16, aVarArr, f20);
            case 2:
                int z12 = g6.e.z(parcel);
                int i12 = 0;
                int i13 = 0;
                boolean z13 = false;
                boolean z14 = false;
                float f21 = -1.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i12 = g6.e.u(parcel, readInt3);
                            break;
                        case 3:
                            i14 = g6.e.u(parcel, readInt3);
                            break;
                        case 4:
                            i13 = g6.e.u(parcel, readInt3);
                            break;
                        case 5:
                            z13 = g6.e.n(parcel, readInt3);
                            break;
                        case 6:
                            z14 = g6.e.n(parcel, readInt3);
                            break;
                        case 7:
                            f21 = g6.e.r(parcel, readInt3);
                            break;
                        default:
                            g6.e.y(parcel, readInt3);
                            break;
                    }
                }
                g6.e.m(parcel, z12);
                c cVar = new c();
                cVar.a = i12;
                cVar.b = i14;
                cVar.c = i13;
                cVar.d = z13;
                cVar.e = z14;
                cVar.f = f21;
                return cVar;
            case 3:
                int z15 = g6.e.z(parcel);
                int i15 = 0;
                float f22 = 0.0f;
                float f23 = 0.0f;
                int i16 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i15 = g6.e.u(parcel, readInt4);
                    } else if (c10 == 2) {
                        f22 = g6.e.r(parcel, readInt4);
                    } else if (c10 == 3) {
                        f23 = g6.e.r(parcel, readInt4);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        i16 = g6.e.u(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z15);
                return new LandmarkParcel(i15, f22, f23, i16);
            case 4:
                int z16 = g6.e.z(parcel);
                String str = null;
                x8.b bVar = null;
                UserAddress userAddress = null;
                k kVar = null;
                String str2 = null;
                Bundle bundle = null;
                String str3 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str = g6.e.h(parcel, readInt5);
                            break;
                        case 2:
                            bVar = (x8.b) g6.e.g(parcel, readInt5, x8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) g6.e.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (k) g6.e.g(parcel, readInt5, k.CREATOR);
                            break;
                        case 5:
                            str2 = g6.e.h(parcel, readInt5);
                            break;
                        case 6:
                            bundle = g6.e.a(parcel, readInt5);
                            break;
                        case 7:
                            str3 = g6.e.h(parcel, readInt5);
                            break;
                        case '\b':
                            bundle2 = g6.e.a(parcel, readInt5);
                            break;
                        default:
                            g6.e.y(parcel, readInt5);
                            break;
                    }
                }
                g6.e.m(parcel, z16);
                i iVar = new i();
                iVar.a = str;
                iVar.b = bVar;
                iVar.c = userAddress;
                iVar.d = kVar;
                iVar.e = str2;
                iVar.f = bundle;
                iVar.h = str3;
                iVar.n = bundle2;
                return iVar;
            case 5:
                int z17 = g6.e.z(parcel);
                boolean z18 = false;
                x8.c cVar2 = null;
                m mVar = null;
                ArrayList arrayList = null;
                l lVar = null;
                n nVar = null;
                String str4 = null;
                Bundle bundle3 = null;
                boolean z19 = true;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            z18 = g6.e.n(parcel, readInt6);
                            break;
                        case 2:
                            z20 = g6.e.n(parcel, readInt6);
                            break;
                        case 3:
                            cVar2 = (x8.c) g6.e.g(parcel, readInt6, x8.c.CREATOR);
                            break;
                        case 4:
                            z21 = g6.e.n(parcel, readInt6);
                            break;
                        case 5:
                            mVar = (m) g6.e.g(parcel, readInt6, m.CREATOR);
                            break;
                        case 6:
                            arrayList = g6.e.e(parcel, readInt6);
                            break;
                        case 7:
                            lVar = (l) g6.e.g(parcel, readInt6, l.CREATOR);
                            break;
                        case '\b':
                            nVar = (n) g6.e.g(parcel, readInt6, n.CREATOR);
                            break;
                        case '\t':
                            z19 = g6.e.n(parcel, readInt6);
                            break;
                        case '\n':
                            str4 = g6.e.h(parcel, readInt6);
                            break;
                        case 11:
                            bundle3 = g6.e.a(parcel, readInt6);
                            break;
                        default:
                            g6.e.y(parcel, readInt6);
                            break;
                    }
                }
                g6.e.m(parcel, z17);
                j jVar = new j();
                jVar.a = z18;
                jVar.b = z20;
                jVar.c = cVar2;
                jVar.d = z21;
                jVar.e = mVar;
                jVar.f = arrayList;
                jVar.h = lVar;
                jVar.n = nVar;
                jVar.r = z19;
                jVar.s = str4;
                jVar.w = bundle3;
                return jVar;
            case 6:
                int z22 = g6.e.z(parcel);
                int i17 = 0;
                String str5 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 2) {
                        i17 = g6.e.u(parcel, readInt7);
                    } else if (c11 != 3) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        str5 = g6.e.h(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z22);
                k kVar2 = new k();
                kVar2.a = i17;
                kVar2.b = str5;
                return kVar2;
            case 7:
                int z23 = g6.e.z(parcel);
                int i18 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        i18 = g6.e.u(parcel, readInt8);
                    } else if (c12 != 3) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        bundle4 = g6.e.a(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z23);
                l lVar2 = new l();
                new Bundle();
                lVar2.a = i18;
                lVar2.b = bundle4;
                return lVar2;
            case 8:
                int z24 = g6.e.z(parcel);
                String str6 = null;
                int i19 = 0;
                int i20 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        str6 = g6.e.h(parcel, readInt9);
                    } else if (c13 == 3) {
                        str7 = g6.e.h(parcel, readInt9);
                    } else if (c13 == 4) {
                        i19 = g6.e.u(parcel, readInt9);
                    } else if (c13 != 5) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        i20 = g6.e.u(parcel, readInt9);
                    }
                }
                g6.e.m(parcel, z24);
                return new r(i19, i20, str6, str7);
            case 9:
                int z25 = g6.e.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        arrayList2 = g6.e.j(parcel, readInt10);
                    }
                }
                g6.e.m(parcel, z25);
                m mVar2 = new m();
                mVar2.a = arrayList2;
                return mVar2;
            case 10:
                int z26 = g6.e.z(parcel);
                int i21 = 0;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 1) {
                        i21 = g6.e.u(parcel, readInt11);
                    } else if (c14 == 2) {
                        str8 = g6.e.h(parcel, readInt11);
                    } else if (c14 != 3) {
                        g6.e.y(parcel, readInt11);
                    } else {
                        str9 = g6.e.h(parcel, readInt11);
                    }
                }
                g6.e.m(parcel, z26);
                n nVar2 = new n();
                nVar2.a = i21;
                nVar2.b = str8;
                nVar2.c = str9;
                return nVar2;
            case 11:
                int z27 = g6.e.z(parcel);
                String str10 = null;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        str10 = g6.e.h(parcel, readInt12);
                    } else if (c15 != 3) {
                        g6.e.y(parcel, readInt12);
                    } else {
                        bundle5 = g6.e.a(parcel, readInt12);
                    }
                }
                g6.e.m(parcel, z27);
                s sVar = new s();
                sVar.a = str10;
                sVar.b = bundle5;
                return sVar;
            case 12:
                int z28 = g6.e.z(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                boolean z29 = false;
                String str20 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str11 = g6.e.h(parcel, readInt13);
                            break;
                        case 3:
                            str20 = g6.e.h(parcel, readInt13);
                            break;
                        case 4:
                            str12 = g6.e.h(parcel, readInt13);
                            break;
                        case 5:
                            str13 = g6.e.h(parcel, readInt13);
                            break;
                        case 6:
                            str14 = g6.e.h(parcel, readInt13);
                            break;
                        case 7:
                            str15 = g6.e.h(parcel, readInt13);
                            break;
                        case '\b':
                            str16 = g6.e.h(parcel, readInt13);
                            break;
                        case '\t':
                            str17 = g6.e.h(parcel, readInt13);
                            break;
                        case '\n':
                            str18 = g6.e.h(parcel, readInt13);
                            break;
                        case 11:
                            z29 = g6.e.n(parcel, readInt13);
                            break;
                        case '\f':
                            str19 = g6.e.h(parcel, readInt13);
                            break;
                        default:
                            g6.e.y(parcel, readInt13);
                            break;
                    }
                }
                g6.e.m(parcel, z28);
                q qVar = new q();
                qVar.a = str11;
                qVar.b = str20;
                qVar.c = str12;
                qVar.d = str13;
                qVar.e = str14;
                qVar.f = str15;
                qVar.h = str16;
                qVar.n = str17;
                qVar.r = str18;
                qVar.s = z29;
                qVar.w = str19;
                return qVar;
            case 13:
                int z30 = g6.e.z(parcel);
                String str21 = null;
                String str22 = null;
                UserAddress userAddress2 = null;
                int i22 = 0;
                String str23 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 1) {
                        str21 = g6.e.h(parcel, readInt14);
                    } else if (c16 == 2) {
                        str23 = g6.e.h(parcel, readInt14);
                    } else if (c16 == 3) {
                        str22 = g6.e.h(parcel, readInt14);
                    } else if (c16 == 4) {
                        i22 = g6.e.u(parcel, readInt14);
                    } else if (c16 != 5) {
                        g6.e.y(parcel, readInt14);
                    } else {
                        userAddress2 = (UserAddress) g6.e.g(parcel, readInt14, UserAddress.CREATOR);
                    }
                }
                g6.e.m(parcel, z30);
                x8.b bVar2 = new x8.b();
                bVar2.a = str21;
                bVar2.b = str23;
                bVar2.c = str22;
                bVar2.d = i22;
                bVar2.e = userAddress2;
                return bVar2;
            case 14:
                int z31 = g6.e.z(parcel);
                ArrayList arrayList3 = null;
                boolean z32 = false;
                boolean z33 = true;
                int i23 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 1) {
                        arrayList3 = g6.e.e(parcel, readInt15);
                    } else if (c17 == 2) {
                        z33 = g6.e.n(parcel, readInt15);
                    } else if (c17 == 3) {
                        z32 = g6.e.n(parcel, readInt15);
                    } else if (c17 != 4) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        i23 = g6.e.u(parcel, readInt15);
                    }
                }
                g6.e.m(parcel, z31);
                x8.c cVar3 = new x8.c();
                cVar3.a = arrayList3;
                cVar3.b = z33;
                cVar3.c = z32;
                cVar3.d = i23;
                return cVar3;
            case 15:
                int z34 = g6.e.z(parcel);
                String str24 = null;
                String str25 = null;
                r rVar = null;
                String str26 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                x8.d[] dVarArr = null;
                k kVar3 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str24 = g6.e.h(parcel, readInt16);
                            break;
                        case 3:
                            str25 = g6.e.h(parcel, readInt16);
                            break;
                        case 4:
                            rVar = (r) g6.e.g(parcel, readInt16, r.CREATOR);
                            break;
                        case 5:
                            str26 = g6.e.h(parcel, readInt16);
                            break;
                        case 6:
                            qVar2 = (q) g6.e.g(parcel, readInt16, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) g6.e.g(parcel, readInt16, q.CREATOR);
                            break;
                        case '\b':
                            strArr = g6.e.i(parcel, readInt16);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) g6.e.g(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) g6.e.g(parcel, readInt16, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (x8.d[]) g6.e.k(parcel, readInt16, x8.d.CREATOR);
                            break;
                        case '\f':
                            kVar3 = (k) g6.e.g(parcel, readInt16, k.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt16);
                            break;
                    }
                }
                g6.e.m(parcel, z34);
                FullWallet fullWallet = new FullWallet();
                fullWallet.a = str24;
                fullWallet.b = str25;
                fullWallet.c = rVar;
                fullWallet.d = str26;
                fullWallet.e = qVar2;
                fullWallet.f = qVar3;
                fullWallet.h = strArr;
                fullWallet.n = userAddress3;
                fullWallet.r = userAddress4;
                fullWallet.s = dVarArr;
                fullWallet.w = kVar3;
                return fullWallet;
            case 16:
                int z35 = g6.e.z(parcel);
                String str27 = null;
                int i24 = 0;
                String str28 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str27 = g6.e.h(parcel, readInt17);
                    } else if (c18 == 3) {
                        str28 = g6.e.h(parcel, readInt17);
                    } else if (c18 != 4) {
                        g6.e.y(parcel, readInt17);
                    } else {
                        i24 = g6.e.u(parcel, readInt17);
                    }
                }
                g6.e.m(parcel, z35);
                x8.d dVar = new x8.d();
                dVar.a = str27;
                dVar.b = str28;
                dVar.c = i24;
                return dVar;
            case 17:
                int z36 = g6.e.z(parcel);
                ArrayList arrayList4 = null;
                String str29 = null;
                ArrayList arrayList5 = null;
                String str30 = null;
                boolean z37 = false;
                String str31 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            arrayList4 = g6.e.e(parcel, readInt18);
                            break;
                        case 3:
                        default:
                            g6.e.y(parcel, readInt18);
                            break;
                        case 4:
                            str31 = g6.e.h(parcel, readInt18);
                            break;
                        case 5:
                            str29 = g6.e.h(parcel, readInt18);
                            break;
                        case 6:
                            arrayList5 = g6.e.e(parcel, readInt18);
                            break;
                        case 7:
                            z37 = g6.e.n(parcel, readInt18);
                            break;
                        case '\b':
                            str30 = g6.e.h(parcel, readInt18);
                            break;
                    }
                }
                g6.e.m(parcel, z36);
                x8.e eVar = new x8.e();
                eVar.a = arrayList4;
                eVar.b = str31;
                eVar.c = str29;
                eVar.d = arrayList5;
                eVar.e = z37;
                eVar.f = str30;
                return eVar;
            case 18:
                int z38 = g6.e.z(parcel);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                String str32 = null;
                ArrayList arrayList9 = arrayList7;
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                y8.f fVar = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                y8.c cVar4 = null;
                int i25 = 0;
                boolean z39 = false;
                String str43 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    y8.f fVar2 = fVar;
                    switch ((char) readInt19) {
                        case 2:
                            str32 = g6.e.h(parcel, readInt19);
                            break;
                        case 3:
                            str43 = g6.e.h(parcel, readInt19);
                            break;
                        case 4:
                            str35 = g6.e.h(parcel, readInt19);
                            break;
                        case 5:
                            str36 = g6.e.h(parcel, readInt19);
                            break;
                        case 6:
                            str37 = g6.e.h(parcel, readInt19);
                            break;
                        case 7:
                            str38 = g6.e.h(parcel, readInt19);
                            break;
                        case '\b':
                            str39 = g6.e.h(parcel, readInt19);
                            break;
                        case '\t':
                            str40 = g6.e.h(parcel, readInt19);
                            break;
                        case '\n':
                            str34 = g6.e.h(parcel, readInt19);
                            break;
                        case 11:
                            str33 = g6.e.h(parcel, readInt19);
                            break;
                        case '\f':
                            i25 = g6.e.u(parcel, readInt19);
                            break;
                        case '\r':
                            arrayList6 = g6.e.l(parcel, readInt19, h.CREATOR);
                            break;
                        case 14:
                            fVar = (y8.f) g6.e.g(parcel, readInt19, y8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList9 = g6.e.l(parcel, readInt19, LatLng.CREATOR);
                            break;
                        case 16:
                            str41 = g6.e.h(parcel, readInt19);
                            break;
                        case 17:
                            str42 = g6.e.h(parcel, readInt19);
                            break;
                        case 18:
                            arrayList10 = g6.e.l(parcel, readInt19, y8.b.CREATOR);
                            break;
                        case 19:
                            z39 = g6.e.n(parcel, readInt19);
                            break;
                        case 20:
                            arrayList11 = g6.e.l(parcel, readInt19, y8.g.CREATOR);
                            break;
                        case 21:
                            arrayList12 = g6.e.l(parcel, readInt19, y8.e.CREATOR);
                            break;
                        case 22:
                            arrayList13 = g6.e.l(parcel, readInt19, y8.g.CREATOR);
                            break;
                        case 23:
                            cVar4 = (y8.c) g6.e.g(parcel, readInt19, y8.c.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt19);
                            break;
                    }
                    fVar = fVar2;
                }
                g6.e.m(parcel, z38);
                x8.f fVar3 = new x8.f();
                fVar3.a = str32;
                fVar3.b = str43;
                fVar3.c = str35;
                fVar3.d = str36;
                fVar3.e = str37;
                fVar3.f = str38;
                fVar3.h = str39;
                fVar3.n = str40;
                fVar3.r = str34;
                fVar3.s = str33;
                fVar3.w = i25;
                fVar3.x = arrayList6;
                fVar3.y = fVar;
                fVar3.E = arrayList9;
                fVar3.F = str41;
                fVar3.G = str42;
                fVar3.H = arrayList10;
                fVar3.I = z39;
                fVar3.J = arrayList11;
                fVar3.K = arrayList12;
                fVar3.L = arrayList13;
                fVar3.M = cVar4;
                return fVar3;
            case 19:
                int z40 = g6.e.z(parcel);
                String str44 = null;
                String str45 = null;
                String[] strArr2 = null;
                String str46 = null;
                q qVar4 = null;
                q qVar5 = null;
                x8.f[] fVarArr = null;
                x8.g[] gVarArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                x8.d[] dVarArr2 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            str44 = g6.e.h(parcel, readInt20);
                            break;
                        case 3:
                            str45 = g6.e.h(parcel, readInt20);
                            break;
                        case 4:
                            strArr2 = g6.e.i(parcel, readInt20);
                            break;
                        case 5:
                            str46 = g6.e.h(parcel, readInt20);
                            break;
                        case 6:
                            qVar4 = (q) g6.e.g(parcel, readInt20, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) g6.e.g(parcel, readInt20, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (x8.f[]) g6.e.k(parcel, readInt20, x8.f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (x8.g[]) g6.e.k(parcel, readInt20, x8.g.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) g6.e.g(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) g6.e.g(parcel, readInt20, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (x8.d[]) g6.e.k(parcel, readInt20, x8.d.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt20);
                            break;
                    }
                }
                g6.e.m(parcel, z40);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str44;
                maskedWallet.b = str45;
                maskedWallet.c = strArr2;
                maskedWallet.d = str46;
                maskedWallet.e = qVar4;
                maskedWallet.f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.n = gVarArr;
                maskedWallet.r = userAddress5;
                maskedWallet.s = userAddress6;
                maskedWallet.w = dVarArr2;
                return maskedWallet;
            case 20:
                int z41 = g6.e.z(parcel);
                int i26 = 0;
                String str47 = null;
                String str48 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 1) {
                        i26 = g6.e.u(parcel, readInt21);
                    } else if (c19 == 2) {
                        str47 = g6.e.h(parcel, readInt21);
                    } else if (c19 == 3) {
                        str48 = g6.e.h(parcel, readInt21);
                    } else if (c19 != 4) {
                        g6.e.y(parcel, readInt21);
                    } else {
                        commonWalletObject = (CommonWalletObject) g6.e.g(parcel, readInt21, CommonWalletObject.CREATOR);
                    }
                }
                g6.e.m(parcel, z41);
                return new x8.g(i26, str47, str48, commonWalletObject);
            case 21:
                int z42 = g6.e.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        g6.e.y(parcel, readInt22);
                    } else {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z42);
                x8.h hVar = new x8.h();
                hVar.a = pendingIntent;
                return hVar;
            case 22:
                int z43 = g6.e.z(parcel);
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                String str49 = null;
                ArrayList arrayList17 = arrayList16;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                String str50 = null;
                String str51 = null;
                y8.f fVar4 = null;
                String str52 = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                String str57 = null;
                int i27 = 0;
                boolean z44 = false;
                String str58 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    String str59 = str51;
                    switch ((char) readInt23) {
                        case 2:
                            str49 = g6.e.h(parcel, readInt23);
                            break;
                        case 3:
                            str58 = g6.e.h(parcel, readInt23);
                            break;
                        case 4:
                            str52 = g6.e.h(parcel, readInt23);
                            break;
                        case 5:
                            str53 = g6.e.h(parcel, readInt23);
                            break;
                        case 6:
                            str54 = g6.e.h(parcel, readInt23);
                            break;
                        case 7:
                            str55 = g6.e.h(parcel, readInt23);
                            break;
                        case '\b':
                            str56 = g6.e.h(parcel, readInt23);
                            break;
                        case '\t':
                            str50 = g6.e.h(parcel, readInt23);
                            break;
                        case '\n':
                            i27 = g6.e.u(parcel, readInt23);
                            break;
                        case 11:
                            arrayList14 = g6.e.l(parcel, readInt23, h.CREATOR);
                            break;
                        case '\f':
                            fVar4 = (y8.f) g6.e.g(parcel, readInt23, y8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList15 = g6.e.l(parcel, readInt23, LatLng.CREATOR);
                            break;
                        case 14:
                            str51 = g6.e.h(parcel, readInt23);
                            continue;
                        case 15:
                            str57 = g6.e.h(parcel, readInt23);
                            break;
                        case 16:
                            arrayList17 = g6.e.l(parcel, readInt23, y8.b.CREATOR);
                            break;
                        case 17:
                            z44 = g6.e.n(parcel, readInt23);
                            break;
                        case 18:
                            arrayList18 = g6.e.l(parcel, readInt23, y8.g.CREATOR);
                            break;
                        case 19:
                            arrayList19 = g6.e.l(parcel, readInt23, y8.e.CREATOR);
                            break;
                        case 20:
                            arrayList20 = g6.e.l(parcel, readInt23, y8.g.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt23);
                            break;
                    }
                    str51 = str59;
                }
                g6.e.m(parcel, z43);
                CommonWalletObject commonWalletObject2 = new CommonWalletObject();
                commonWalletObject2.a = str49;
                commonWalletObject2.b = str58;
                commonWalletObject2.c = str52;
                commonWalletObject2.d = str53;
                commonWalletObject2.e = str54;
                commonWalletObject2.f = str55;
                commonWalletObject2.h = str56;
                commonWalletObject2.n = str50;
                commonWalletObject2.r = i27;
                commonWalletObject2.s = arrayList14;
                commonWalletObject2.w = fVar4;
                commonWalletObject2.x = arrayList15;
                commonWalletObject2.y = str51;
                commonWalletObject2.E = str57;
                commonWalletObject2.F = arrayList17;
                commonWalletObject2.G = z44;
                commonWalletObject2.H = arrayList18;
                commonWalletObject2.I = arrayList19;
                commonWalletObject2.J = arrayList20;
                return commonWalletObject2;
            case 23:
                int z45 = g6.e.z(parcel);
                String str60 = null;
                String str61 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt24 = parcel.readInt();
                    char c20 = (char) readInt24;
                    if (c20 == 2) {
                        str60 = g6.e.h(parcel, readInt24);
                    } else if (c20 != 3) {
                        g6.e.y(parcel, readInt24);
                    } else {
                        str61 = g6.e.h(parcel, readInt24);
                    }
                }
                g6.e.m(parcel, z45);
                y8.a aVar = new y8.a();
                aVar.a = str60;
                aVar.b = str61;
                return aVar;
            case 24:
                int z46 = g6.e.z(parcel);
                ArrayList arrayList21 = new ArrayList();
                String str62 = null;
                String str63 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt25 = parcel.readInt();
                    char c21 = (char) readInt25;
                    if (c21 == 2) {
                        str62 = g6.e.h(parcel, readInt25);
                    } else if (c21 == 3) {
                        str63 = g6.e.h(parcel, readInt25);
                    } else if (c21 != 4) {
                        g6.e.y(parcel, readInt25);
                    } else {
                        arrayList21 = g6.e.l(parcel, readInt25, y8.a.CREATOR);
                    }
                }
                g6.e.m(parcel, z46);
                y8.b bVar3 = new y8.b();
                bVar3.a = str62;
                bVar3.b = str63;
                bVar3.c = arrayList21;
                return bVar3;
            case 25:
                int z47 = g6.e.z(parcel);
                int i28 = 0;
                String str64 = null;
                int i29 = -1;
                long j10 = 0;
                double d = 0.0d;
                String str65 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            i28 = g6.e.u(parcel, readInt26);
                            break;
                        case 3:
                            str64 = g6.e.h(parcel, readInt26);
                            break;
                        case 4:
                            d = g6.e.q(parcel, readInt26);
                            break;
                        case 5:
                            str65 = g6.e.h(parcel, readInt26);
                            break;
                        case 6:
                            j10 = g6.e.w(parcel, readInt26);
                            break;
                        case 7:
                            i29 = g6.e.u(parcel, readInt26);
                            break;
                        default:
                            g6.e.y(parcel, readInt26);
                            break;
                    }
                }
                g6.e.m(parcel, z47);
                y8.d dVar2 = new y8.d();
                dVar2.a = i28;
                dVar2.b = str64;
                dVar2.c = d;
                dVar2.d = str65;
                dVar2.e = j10;
                dVar2.f = i29;
                return dVar2;
            case 26:
                int z48 = g6.e.z(parcel);
                String str66 = null;
                y8.d dVar3 = null;
                y8.f fVar5 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt27 = parcel.readInt();
                    char c22 = (char) readInt27;
                    if (c22 == 2) {
                        str66 = g6.e.h(parcel, readInt27);
                    } else if (c22 == 3) {
                        dVar3 = (y8.d) g6.e.g(parcel, readInt27, y8.d.CREATOR);
                    } else if (c22 != 5) {
                        g6.e.y(parcel, readInt27);
                    } else {
                        fVar5 = (y8.f) g6.e.g(parcel, readInt27, y8.f.CREATOR);
                    }
                }
                g6.e.m(parcel, z48);
                y8.c cVar5 = new y8.c();
                cVar5.a = str66;
                cVar5.b = dVar3;
                cVar5.c = fVar5;
                return cVar5;
            case 27:
                int z49 = g6.e.z(parcel);
                String str67 = null;
                String str68 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt28 = parcel.readInt();
                    char c23 = (char) readInt28;
                    if (c23 == 2) {
                        str67 = g6.e.h(parcel, readInt28);
                    } else if (c23 != 3) {
                        g6.e.y(parcel, readInt28);
                    } else {
                        str68 = g6.e.h(parcel, readInt28);
                    }
                }
                g6.e.m(parcel, z49);
                y8.e eVar2 = new y8.e();
                eVar2.a = str67;
                eVar2.b = str68;
                return eVar2;
            case 28:
                int z50 = g6.e.z(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z50) {
                    int readInt29 = parcel.readInt();
                    char c24 = (char) readInt29;
                    if (c24 == 2) {
                        j11 = g6.e.w(parcel, readInt29);
                    } else if (c24 != 3) {
                        g6.e.y(parcel, readInt29);
                    } else {
                        j12 = g6.e.w(parcel, readInt29);
                    }
                }
                g6.e.m(parcel, z50);
                y8.f fVar6 = new y8.f();
                fVar6.a = j11;
                fVar6.b = j12;
                return fVar6;
            default:
                int z51 = g6.e.z(parcel);
                String str69 = null;
                String str70 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt30 = parcel.readInt();
                    char c25 = (char) readInt30;
                    if (c25 == 2) {
                        str69 = g6.e.h(parcel, readInt30);
                    } else if (c25 != 3) {
                        g6.e.y(parcel, readInt30);
                    } else {
                        str70 = g6.e.h(parcel, readInt30);
                    }
                }
                g6.e.m(parcel, z51);
                y8.g gVar = new y8.g();
                gVar.a = str69;
                gVar.b = str70;
                return gVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new a[i3];
            case 1:
                return new FaceParcel[i3];
            case 2:
                return new c[i3];
            case 3:
                return new LandmarkParcel[i3];
            case 4:
                return new i[i3];
            case 5:
                return new j[i3];
            case 6:
                return new k[i3];
            case 7:
                return new l[i3];
            case 8:
                return new r[i3];
            case 9:
                return new m[i3];
            case 10:
                return new n[i3];
            case 11:
                return new s[i3];
            case 12:
                return new q[i3];
            case 13:
                return new x8.b[i3];
            case 14:
                return new x8.c[i3];
            case 15:
                return new FullWallet[i3];
            case 16:
                return new x8.d[i3];
            case 17:
                return new x8.e[i3];
            case 18:
                return new x8.f[i3];
            case 19:
                return new MaskedWallet[i3];
            case 20:
                return new x8.g[i3];
            case 21:
                return new x8.h[i3];
            case 22:
                return new CommonWalletObject[i3];
            case 23:
                return new y8.a[i3];
            case 24:
                return new y8.b[i3];
            case 25:
                return new y8.d[i3];
            case 26:
                return new y8.c[i3];
            case 27:
                return new y8.e[i3];
            case 28:
                return new y8.f[i3];
            default:
                return new y8.g[i3];
        }
    }
}
