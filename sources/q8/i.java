package q8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p6.x;
import r7.k;
import r7.l;
import r7.m;
import t8.j;
import u4.a0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                m6.a aVar = null;
                int i3 = 0;
                x xVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i3 = g6.e.u(parcel, readInt);
                    } else if (c2 == 2) {
                        aVar = (m6.a) g6.e.g(parcel, readInt, m6.a.CREATOR);
                    } else if (c2 != 3) {
                        g6.e.y(parcel, readInt);
                    } else {
                        xVar = (x) g6.e.g(parcel, readInt, x.CREATOR);
                    }
                }
                g6.e.m(parcel, z10);
                return new h(i3, aVar, xVar);
            case 1:
                int z11 = g6.e.z(parcel);
                r7.g[] gVarArr = null;
                Account account = null;
                boolean z12 = false;
                String str = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        gVarArr = (r7.g[]) g6.e.k(parcel, readInt2, r7.g.CREATOR);
                    } else if (c10 == 2) {
                        str = g6.e.h(parcel, readInt2);
                    } else if (c10 == 3) {
                        z12 = g6.e.n(parcel, readInt2);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        account = (Account) g6.e.g(parcel, readInt2, Account.CREATOR);
                    }
                }
                g6.e.m(parcel, z11);
                return new r7.e(gVarArr, str, z12, account);
            case 2:
                int z13 = g6.e.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        str2 = g6.e.h(parcel, readInt3);
                    } else if (c11 == 2) {
                        str3 = g6.e.h(parcel, readInt3);
                    } else if (c11 != 3) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        str4 = g6.e.h(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z13);
                return new r7.f(str2, str3, str4);
            case 3:
                int z14 = g6.e.z(parcel);
                String str5 = null;
                byte[] bArr = null;
                int i10 = -1;
                k kVar = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        str5 = g6.e.h(parcel, readInt4);
                    } else if (c12 == 3) {
                        kVar = (k) g6.e.g(parcel, readInt4, k.CREATOR);
                    } else if (c12 == 4) {
                        i10 = g6.e.u(parcel, readInt4);
                    } else if (c12 != 5) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        bArr = g6.e.b(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z14);
                return new r7.g(str5, kVar, i10, bArr);
            case 4:
                int z15 = g6.e.z(parcel);
                int i11 = 0;
                Bundle bundle = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i11 = g6.e.u(parcel, readInt5);
                    } else if (c13 != 2) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        bundle = g6.e.a(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z15);
                return new r7.h(i11, bundle);
            case 5:
                int z16 = g6.e.z(parcel);
                Status status = null;
                ArrayList arrayList = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        status = (Status) g6.e.g(parcel, readInt6, Status.CREATOR);
                    } else if (c14 == 2) {
                        arrayList = g6.e.l(parcel, readInt6, m.CREATOR);
                    } else if (c14 != 3) {
                        g6.e.y(parcel, readInt6);
                    } else {
                        strArr = g6.e.i(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z16);
                r7.i iVar = new r7.i();
                iVar.a = status;
                iVar.b = arrayList;
                iVar.c = strArr;
                return iVar;
            case 6:
                int z17 = g6.e.z(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                r7.h[] hVarArr = null;
                String str9 = null;
                l lVar = null;
                boolean z18 = false;
                boolean z19 = false;
                int i12 = 1;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 == 11) {
                        str9 = g6.e.h(parcel, readInt7);
                    } else if (c15 != '\f') {
                        switch (c15) {
                            case 1:
                                str6 = g6.e.h(parcel, readInt7);
                                break;
                            case 2:
                                str7 = g6.e.h(parcel, readInt7);
                                break;
                            case 3:
                                z18 = g6.e.n(parcel, readInt7);
                                break;
                            case 4:
                                i12 = g6.e.u(parcel, readInt7);
                                break;
                            case 5:
                                z19 = g6.e.n(parcel, readInt7);
                                break;
                            case 6:
                                str8 = g6.e.h(parcel, readInt7);
                                break;
                            case 7:
                                hVarArr = (r7.h[]) g6.e.k(parcel, readInt7, r7.h.CREATOR);
                                break;
                            default:
                                g6.e.y(parcel, readInt7);
                                break;
                        }
                    } else {
                        lVar = (l) g6.e.g(parcel, readInt7, l.CREATOR);
                    }
                }
                g6.e.m(parcel, z17);
                return new k(str6, str7, z18, i12, z19, str8, hVarArr, str9, lVar);
            case 7:
                int z20 = g6.e.z(parcel);
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        z21 = g6.e.n(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z20);
                return new l(z21);
            case 8:
                int z22 = g6.e.z(parcel);
                r7.f fVar = null;
                String str10 = null;
                r7.e eVar = null;
                String str11 = null;
                long j10 = 0;
                int i13 = 0;
                boolean z23 = false;
                int i14 = 0;
                int i15 = -1;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            fVar = (r7.f) g6.e.g(parcel, readInt9, r7.f.CREATOR);
                            break;
                        case 2:
                            j10 = g6.e.w(parcel, readInt9);
                            break;
                        case 3:
                            i13 = g6.e.u(parcel, readInt9);
                            break;
                        case 4:
                            str10 = g6.e.h(parcel, readInt9);
                            break;
                        case 5:
                            eVar = (r7.e) g6.e.g(parcel, readInt9, r7.e.CREATOR);
                            break;
                        case 6:
                            z23 = g6.e.n(parcel, readInt9);
                            break;
                        case 7:
                            i15 = g6.e.u(parcel, readInt9);
                            break;
                        case '\b':
                            i14 = g6.e.u(parcel, readInt9);
                            break;
                        case '\t':
                            str11 = g6.e.h(parcel, readInt9);
                            break;
                        default:
                            g6.e.y(parcel, readInt9);
                            break;
                    }
                }
                g6.e.m(parcel, z22);
                return new m(fVar, j10, i13, str10, eVar, z23, i15, i14, str11);
            case 9:
                int z24 = g6.e.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                s9.a aVar2 = null;
                String str16 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str12 = g6.e.h(parcel, readInt10);
                            break;
                        case 2:
                            str13 = g6.e.h(parcel, readInt10);
                            break;
                        case 3:
                            str14 = g6.e.h(parcel, readInt10);
                            break;
                        case 4:
                            str15 = g6.e.h(parcel, readInt10);
                            break;
                        case 5:
                            aVar2 = (s9.a) g6.e.g(parcel, readInt10, s9.a.CREATOR);
                            break;
                        case 6:
                            str16 = g6.e.h(parcel, readInt10);
                            break;
                        case 7:
                            bundle2 = g6.e.a(parcel, readInt10);
                            break;
                        default:
                            g6.e.y(parcel, readInt10);
                            break;
                    }
                }
                g6.e.m(parcel, z24);
                return new s9.b(str12, str13, str14, str15, aVar2, str16, bundle2);
            case 10:
                int z25 = g6.e.z(parcel);
                int i16 = 0;
                boolean z26 = false;
                boolean z27 = false;
                String str17 = null;
                String str18 = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i16 = g6.e.u(parcel, readInt11);
                            break;
                        case 2:
                            z26 = g6.e.n(parcel, readInt11);
                            break;
                        case 3:
                            str17 = g6.e.h(parcel, readInt11);
                            break;
                        case 4:
                            str18 = g6.e.h(parcel, readInt11);
                            break;
                        case 5:
                            bArr2 = g6.e.b(parcel, readInt11);
                            break;
                        case 6:
                            z27 = g6.e.n(parcel, readInt11);
                            break;
                        default:
                            g6.e.y(parcel, readInt11);
                            break;
                    }
                }
                g6.e.m(parcel, z25);
                return new s9.a(i16, z26, str17, str18, bArr2, z27);
            case 11:
                int z28 = g6.e.z(parcel);
                boolean z29 = false;
                int i17 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 1) {
                        z29 = g6.e.n(parcel, readInt12);
                    } else if (c16 != 2) {
                        g6.e.y(parcel, readInt12);
                    } else {
                        i17 = g6.e.u(parcel, readInt12);
                    }
                }
                g6.e.m(parcel, z28);
                return new t6.a(i17, z29);
            case 12:
                int z30 = g6.e.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z30) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt13, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z30);
                return new t6.b(pendingIntent);
            case 13:
                int z31 = g6.e.z(parcel);
                int i18 = 0;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        i18 = g6.e.u(parcel, readInt14);
                    } else if (c17 != 2) {
                        g6.e.y(parcel, readInt14);
                    } else {
                        z32 = g6.e.n(parcel, readInt14);
                    }
                }
                g6.e.m(parcel, z31);
                return new t6.c(i18, z32);
            case 14:
                int z33 = g6.e.z(parcel);
                int i19 = 0;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 2) {
                        i19 = g6.e.u(parcel, readInt15);
                    } else if (c18 != 3) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        strArr2 = g6.e.i(parcel, readInt15);
                    }
                }
                g6.e.m(parcel, z33);
                t8.a aVar3 = new t8.a();
                aVar3.a = i19;
                aVar3.b = strArr2;
                return aVar3;
            case 15:
                int z34 = g6.e.z(parcel);
                int i20 = 0;
                boolean z35 = false;
                String str19 = null;
                String str20 = null;
                Point[] pointArr = null;
                t8.f fVar2 = null;
                t8.i iVar2 = null;
                j jVar = null;
                t8.l lVar2 = null;
                t8.k kVar2 = null;
                t8.g gVar = null;
                byte[] bArr3 = null;
                t8.d dVar = null;
                t8.c cVar = null;
                t8.e eVar2 = null;
                int i21 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    t8.g gVar2 = gVar;
                    switch ((char) readInt16) {
                        case 2:
                            i20 = g6.e.u(parcel, readInt16);
                            break;
                        case 3:
                            str19 = g6.e.h(parcel, readInt16);
                            break;
                        case 4:
                            str20 = g6.e.h(parcel, readInt16);
                            break;
                        case 5:
                            i21 = g6.e.u(parcel, readInt16);
                            break;
                        case 6:
                            pointArr = (Point[]) g6.e.k(parcel, readInt16, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (t8.f) g6.e.g(parcel, readInt16, t8.f.CREATOR);
                            break;
                        case '\b':
                            iVar2 = (t8.i) g6.e.g(parcel, readInt16, t8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) g6.e.g(parcel, readInt16, j.CREATOR);
                            break;
                        case '\n':
                            lVar2 = (t8.l) g6.e.g(parcel, readInt16, t8.l.CREATOR);
                            break;
                        case 11:
                            kVar2 = (t8.k) g6.e.g(parcel, readInt16, t8.k.CREATOR);
                            break;
                        case '\f':
                            gVar = (t8.g) g6.e.g(parcel, readInt16, t8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (t8.c) g6.e.g(parcel, readInt16, t8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (t8.d) g6.e.g(parcel, readInt16, t8.d.CREATOR);
                            break;
                        case 15:
                            eVar2 = (t8.e) g6.e.g(parcel, readInt16, t8.e.CREATOR);
                            break;
                        case 16:
                            bArr3 = g6.e.b(parcel, readInt16);
                            break;
                        case 17:
                            z35 = g6.e.n(parcel, readInt16);
                            break;
                        default:
                            g6.e.y(parcel, readInt16);
                            break;
                    }
                    gVar = gVar2;
                }
                g6.e.m(parcel, z34);
                t8.m mVar = new t8.m();
                mVar.a = i20;
                mVar.b = str19;
                mVar.F = bArr3;
                mVar.c = str20;
                mVar.d = i21;
                mVar.e = pointArr;
                mVar.G = z35;
                mVar.f = fVar2;
                mVar.h = iVar2;
                mVar.n = jVar;
                mVar.r = lVar2;
                mVar.s = kVar2;
                mVar.w = gVar;
                mVar.x = cVar;
                mVar.y = dVar;
                mVar.E = eVar2;
                return mVar;
            case 16:
                int z36 = g6.e.z(parcel);
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                boolean z37 = false;
                String str21 = null;
                int i27 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            i22 = g6.e.u(parcel, readInt17);
                            break;
                        case 3:
                            i27 = g6.e.u(parcel, readInt17);
                            break;
                        case 4:
                            i23 = g6.e.u(parcel, readInt17);
                            break;
                        case 5:
                            i24 = g6.e.u(parcel, readInt17);
                            break;
                        case 6:
                            i25 = g6.e.u(parcel, readInt17);
                            break;
                        case 7:
                            i26 = g6.e.u(parcel, readInt17);
                            break;
                        case '\b':
                            z37 = g6.e.n(parcel, readInt17);
                            break;
                        case '\t':
                            str21 = g6.e.h(parcel, readInt17);
                            break;
                        default:
                            g6.e.y(parcel, readInt17);
                            break;
                    }
                }
                g6.e.m(parcel, z36);
                t8.b bVar = new t8.b();
                bVar.a = i22;
                bVar.b = i27;
                bVar.c = i23;
                bVar.d = i24;
                bVar.e = i25;
                bVar.f = i26;
                bVar.h = z37;
                bVar.n = str21;
                return bVar;
            case 17:
                int z38 = g6.e.z(parcel);
                t8.h hVar = null;
                String str22 = null;
                String str23 = null;
                t8.i[] iVarArr = null;
                t8.f[] fVarArr = null;
                String[] strArr3 = null;
                t8.a[] aVarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            hVar = (t8.h) g6.e.g(parcel, readInt18, t8.h.CREATOR);
                            break;
                        case 3:
                            str22 = g6.e.h(parcel, readInt18);
                            break;
                        case 4:
                            str23 = g6.e.h(parcel, readInt18);
                            break;
                        case 5:
                            iVarArr = (t8.i[]) g6.e.k(parcel, readInt18, t8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (t8.f[]) g6.e.k(parcel, readInt18, t8.f.CREATOR);
                            break;
                        case 7:
                            strArr3 = g6.e.i(parcel, readInt18);
                            break;
                        case '\b':
                            aVarArr = (t8.a[]) g6.e.k(parcel, readInt18, t8.a.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt18);
                            break;
                    }
                }
                g6.e.m(parcel, z38);
                t8.d dVar2 = new t8.d();
                dVar2.a = hVar;
                dVar2.b = str22;
                dVar2.c = str23;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr3;
                dVar2.h = aVarArr;
                return dVar2;
            case 18:
                int z39 = g6.e.z(parcel);
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                t8.b bVar2 = null;
                t8.b bVar3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str24 = g6.e.h(parcel, readInt19);
                            break;
                        case 3:
                            str25 = g6.e.h(parcel, readInt19);
                            break;
                        case 4:
                            str26 = g6.e.h(parcel, readInt19);
                            break;
                        case 5:
                            str27 = g6.e.h(parcel, readInt19);
                            break;
                        case 6:
                            str28 = g6.e.h(parcel, readInt19);
                            break;
                        case 7:
                            bVar2 = (t8.b) g6.e.g(parcel, readInt19, t8.b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (t8.b) g6.e.g(parcel, readInt19, t8.b.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt19);
                            break;
                    }
                }
                g6.e.m(parcel, z39);
                t8.c cVar2 = new t8.c();
                cVar2.a = str24;
                cVar2.b = str25;
                cVar2.c = str26;
                cVar2.d = str27;
                cVar2.e = str28;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 19:
                int z40 = g6.e.z(parcel);
                int i28 = 0;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    char c19 = (char) readInt20;
                    if (c19 == 2) {
                        i28 = g6.e.u(parcel, readInt20);
                    } else if (c19 == 3) {
                        str29 = g6.e.h(parcel, readInt20);
                    } else if (c19 == 4) {
                        str30 = g6.e.h(parcel, readInt20);
                    } else if (c19 != 5) {
                        g6.e.y(parcel, readInt20);
                    } else {
                        str31 = g6.e.h(parcel, readInt20);
                    }
                }
                g6.e.m(parcel, z40);
                t8.f fVar3 = new t8.f();
                fVar3.a = i28;
                fVar3.b = str29;
                fVar3.c = str30;
                fVar3.d = str31;
                return fVar3;
            case 20:
                int z41 = g6.e.z(parcel);
                String str32 = null;
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
                String str43 = null;
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    String str46 = str44;
                    switch ((char) readInt21) {
                        case 2:
                            str32 = g6.e.h(parcel, readInt21);
                            break;
                        case 3:
                            str33 = g6.e.h(parcel, readInt21);
                            break;
                        case 4:
                            str34 = g6.e.h(parcel, readInt21);
                            break;
                        case 5:
                            str35 = g6.e.h(parcel, readInt21);
                            break;
                        case 6:
                            str36 = g6.e.h(parcel, readInt21);
                            break;
                        case 7:
                            str37 = g6.e.h(parcel, readInt21);
                            break;
                        case '\b':
                            str38 = g6.e.h(parcel, readInt21);
                            break;
                        case '\t':
                            str39 = g6.e.h(parcel, readInt21);
                            break;
                        case '\n':
                            str40 = g6.e.h(parcel, readInt21);
                            break;
                        case 11:
                            str41 = g6.e.h(parcel, readInt21);
                            break;
                        case '\f':
                            str42 = g6.e.h(parcel, readInt21);
                            break;
                        case '\r':
                            str43 = g6.e.h(parcel, readInt21);
                            break;
                        case 14:
                            str44 = g6.e.h(parcel, readInt21);
                            continue;
                        case 15:
                            str45 = g6.e.h(parcel, readInt21);
                            break;
                        default:
                            g6.e.y(parcel, readInt21);
                            break;
                    }
                    str44 = str46;
                }
                g6.e.m(parcel, z41);
                t8.e eVar3 = new t8.e();
                eVar3.a = str32;
                eVar3.b = str33;
                eVar3.c = str34;
                eVar3.d = str35;
                eVar3.e = str36;
                eVar3.f = str37;
                eVar3.h = str38;
                eVar3.n = str39;
                eVar3.r = str40;
                eVar3.s = str41;
                eVar3.w = str42;
                eVar3.x = str43;
                eVar3.y = str44;
                eVar3.E = str45;
                return eVar3;
            case 21:
                int z42 = g6.e.z(parcel);
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str47 = g6.e.h(parcel, readInt22);
                            break;
                        case 3:
                            str48 = g6.e.h(parcel, readInt22);
                            break;
                        case 4:
                            str49 = g6.e.h(parcel, readInt22);
                            break;
                        case 5:
                            str50 = g6.e.h(parcel, readInt22);
                            break;
                        case 6:
                            str51 = g6.e.h(parcel, readInt22);
                            break;
                        case 7:
                            str52 = g6.e.h(parcel, readInt22);
                            break;
                        case '\b':
                            str53 = g6.e.h(parcel, readInt22);
                            break;
                        default:
                            g6.e.y(parcel, readInt22);
                            break;
                    }
                }
                g6.e.m(parcel, z42);
                t8.h hVar2 = new t8.h();
                hVar2.a = str47;
                hVar2.b = str48;
                hVar2.c = str49;
                hVar2.d = str50;
                hVar2.e = str51;
                hVar2.f = str52;
                hVar2.h = str53;
                return hVar2;
            case 22:
                int z43 = g6.e.z(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    char c20 = (char) readInt23;
                    if (c20 == 2) {
                        d = g6.e.q(parcel, readInt23);
                    } else if (c20 != 3) {
                        g6.e.y(parcel, readInt23);
                    } else {
                        d10 = g6.e.q(parcel, readInt23);
                    }
                }
                g6.e.m(parcel, z43);
                t8.g gVar3 = new t8.g();
                gVar3.a = d;
                gVar3.b = d10;
                return gVar3;
            case 23:
                int z44 = g6.e.z(parcel);
                String str54 = null;
                String str55 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt24 = parcel.readInt();
                    char c21 = (char) readInt24;
                    if (c21 == 2) {
                        str54 = g6.e.h(parcel, readInt24);
                    } else if (c21 != 3) {
                        g6.e.y(parcel, readInt24);
                    } else {
                        str55 = g6.e.h(parcel, readInt24);
                    }
                }
                g6.e.m(parcel, z44);
                j jVar2 = new j();
                jVar2.a = str54;
                jVar2.b = str55;
                return jVar2;
            case 24:
                int z45 = g6.e.z(parcel);
                int i29 = 0;
                String str56 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt25 = parcel.readInt();
                    char c22 = (char) readInt25;
                    if (c22 == 2) {
                        i29 = g6.e.u(parcel, readInt25);
                    } else if (c22 != 3) {
                        g6.e.y(parcel, readInt25);
                    } else {
                        str56 = g6.e.h(parcel, readInt25);
                    }
                }
                g6.e.m(parcel, z45);
                t8.i iVar3 = new t8.i();
                iVar3.a = i29;
                iVar3.b = str56;
                return iVar3;
            case 25:
                int z46 = g6.e.z(parcel);
                String str57 = null;
                int i30 = 0;
                String str58 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c23 = (char) readInt26;
                    if (c23 == 2) {
                        str57 = g6.e.h(parcel, readInt26);
                    } else if (c23 == 3) {
                        str58 = g6.e.h(parcel, readInt26);
                    } else if (c23 != 4) {
                        g6.e.y(parcel, readInt26);
                    } else {
                        i30 = g6.e.u(parcel, readInt26);
                    }
                }
                g6.e.m(parcel, z46);
                t8.l lVar3 = new t8.l();
                lVar3.a = str57;
                lVar3.b = str58;
                lVar3.c = i30;
                return lVar3;
            case 26:
                int z47 = g6.e.z(parcel);
                String str59 = null;
                String str60 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c24 = (char) readInt27;
                    if (c24 == 2) {
                        str59 = g6.e.h(parcel, readInt27);
                    } else if (c24 != 3) {
                        g6.e.y(parcel, readInt27);
                    } else {
                        str60 = g6.e.h(parcel, readInt27);
                    }
                }
                g6.e.m(parcel, z47);
                t8.k kVar3 = new t8.k();
                kVar3.a = str59;
                kVar3.b = str60;
                return kVar3;
            case 27:
                u0.h hVar3 = new u0.h(parcel);
                hVar3.a = parcel.readInt();
                return hVar3;
            case 28:
                a0 a0Var = new a0();
                a0Var.a = parcel.readInt();
                a0Var.b = parcel.readInt();
                a0Var.c = parcel.readInt() == 1;
                return a0Var;
            default:
                int z48 = g6.e.z(parcel);
                ArrayList arrayList2 = null;
                String str61 = null;
                boolean z49 = false;
                String str62 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt28 = parcel.readInt();
                    char c25 = (char) readInt28;
                    if (c25 == 1) {
                        arrayList2 = g6.e.l(parcel, readInt28, m6.c.CREATOR);
                    } else if (c25 == 2) {
                        z49 = g6.e.n(parcel, readInt28);
                    } else if (c25 == 3) {
                        str62 = g6.e.h(parcel, readInt28);
                    } else if (c25 != 4) {
                        g6.e.y(parcel, readInt28);
                    } else {
                        str61 = g6.e.h(parcel, readInt28);
                    }
                }
                g6.e.m(parcel, z48);
                return new u6.a(arrayList2, z49, str62, str61);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new h[i3];
            case 1:
                return new r7.e[i3];
            case 2:
                return new r7.f[i3];
            case 3:
                return new r7.g[i3];
            case 4:
                return new r7.h[i3];
            case 5:
                return new r7.i[i3];
            case 6:
                return new k[i3];
            case 7:
                return new l[i3];
            case 8:
                return new m[i3];
            case 9:
                return new s9.b[i3];
            case 10:
                return new s9.a[i3];
            case 11:
                return new t6.a[i3];
            case 12:
                return new t6.b[i3];
            case 13:
                return new t6.c[i3];
            case 14:
                return new t8.a[i3];
            case 15:
                return new t8.m[i3];
            case 16:
                return new t8.b[i3];
            case 17:
                return new t8.d[i3];
            case 18:
                return new t8.c[i3];
            case 19:
                return new t8.f[i3];
            case 20:
                return new t8.e[i3];
            case 21:
                return new t8.h[i3];
            case 22:
                return new t8.g[i3];
            case 23:
                return new j[i3];
            case 24:
                return new t8.i[i3];
            case 25:
                return new t8.l[i3];
            case 26:
                return new t8.k[i3];
            case 27:
                return new u0.h[i3];
            case 28:
                return new a0[i3];
            default:
                return new u6.a[i3];
        }
    }
}
