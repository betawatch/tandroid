package p7;

import android.app.PendingIntent;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import java.util.ArrayList;
import s4.b0;
import w7.d0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = d0.z(parcel);
                Status status = null;
                ArrayList arrayList = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        status = (Status) d0.g(parcel, readInt, Status.CREATOR);
                    } else if (c10 == 2) {
                        arrayList = d0.l(parcel, readInt, n.CREATOR);
                    } else if (c10 != 3) {
                        d0.y(parcel, readInt);
                    } else {
                        strArr = d0.i(parcel, readInt);
                    }
                }
                d0.m(parcel, z10);
                i iVar = new i();
                iVar.a = status;
                iVar.b = arrayList;
                iVar.c = strArr;
                return iVar;
            case 1:
                int z11 = d0.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                h[] hVarArr = null;
                String str4 = null;
                m mVar = null;
                boolean z12 = false;
                int i10 = 1;
                boolean z13 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 11) {
                        str4 = d0.h(parcel, readInt2);
                    } else if (c11 != '\f') {
                        switch (c11) {
                            case 1:
                                str = d0.h(parcel, readInt2);
                                break;
                            case 2:
                                str2 = d0.h(parcel, readInt2);
                                break;
                            case 3:
                                z12 = d0.n(parcel, readInt2);
                                break;
                            case 4:
                                i10 = d0.u(parcel, readInt2);
                                break;
                            case 5:
                                z13 = d0.n(parcel, readInt2);
                                break;
                            case 6:
                                str3 = d0.h(parcel, readInt2);
                                break;
                            case 7:
                                hVarArr = (h[]) d0.k(parcel, readInt2, h.CREATOR);
                                break;
                            default:
                                d0.y(parcel, readInt2);
                                break;
                        }
                    } else {
                        mVar = (m) d0.g(parcel, readInt2, m.CREATOR);
                    }
                }
                d0.m(parcel, z11);
                return new l(str, str2, z12, i10, z13, str3, hVarArr, str4, mVar);
            case 2:
                int z14 = d0.z(parcel);
                boolean z15 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        d0.y(parcel, readInt3);
                    } else {
                        z15 = d0.n(parcel, readInt3);
                    }
                }
                d0.m(parcel, z14);
                return new m(z15);
            case 3:
                int z16 = d0.z(parcel);
                f fVar = null;
                String str5 = null;
                e eVar = null;
                String str6 = null;
                long j3 = 0;
                int i11 = 0;
                boolean z17 = false;
                int i12 = -1;
                int i13 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            fVar = (f) d0.g(parcel, readInt4, f.CREATOR);
                            break;
                        case 2:
                            j3 = d0.w(parcel, readInt4);
                            break;
                        case 3:
                            i11 = d0.u(parcel, readInt4);
                            break;
                        case 4:
                            str5 = d0.h(parcel, readInt4);
                            break;
                        case 5:
                            eVar = (e) d0.g(parcel, readInt4, e.CREATOR);
                            break;
                        case 6:
                            z17 = d0.n(parcel, readInt4);
                            break;
                        case 7:
                            i12 = d0.u(parcel, readInt4);
                            break;
                        case '\b':
                            i13 = d0.u(parcel, readInt4);
                            break;
                        case '\t':
                            str6 = d0.h(parcel, readInt4);
                            break;
                        default:
                            d0.y(parcel, readInt4);
                            break;
                    }
                }
                d0.m(parcel, z16);
                return new n(fVar, j3, i11, str5, eVar, z17, i12, i13, str6);
            case 4:
                int z18 = d0.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                p9.a aVar = null;
                String str11 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str7 = d0.h(parcel, readInt5);
                            break;
                        case 2:
                            str8 = d0.h(parcel, readInt5);
                            break;
                        case 3:
                            str9 = d0.h(parcel, readInt5);
                            break;
                        case 4:
                            str10 = d0.h(parcel, readInt5);
                            break;
                        case 5:
                            aVar = (p9.a) d0.g(parcel, readInt5, p9.a.CREATOR);
                            break;
                        case 6:
                            str11 = d0.h(parcel, readInt5);
                            break;
                        case 7:
                            bundle = d0.a(parcel, readInt5);
                            break;
                        default:
                            d0.y(parcel, readInt5);
                            break;
                    }
                }
                d0.m(parcel, z18);
                return new p9.b(str7, str8, str9, str10, aVar, str11, bundle);
            case 5:
                int z19 = d0.z(parcel);
                String str12 = null;
                String str13 = null;
                byte[] bArr = null;
                int i14 = 0;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i14 = d0.u(parcel, readInt6);
                            break;
                        case 2:
                            z20 = d0.n(parcel, readInt6);
                            break;
                        case 3:
                            str12 = d0.h(parcel, readInt6);
                            break;
                        case 4:
                            str13 = d0.h(parcel, readInt6);
                            break;
                        case 5:
                            bArr = d0.b(parcel, readInt6);
                            break;
                        case 6:
                            z21 = d0.n(parcel, readInt6);
                            break;
                        default:
                            d0.y(parcel, readInt6);
                            break;
                    }
                }
                d0.m(parcel, z19);
                return new p9.a(i14, z20, str12, str13, bArr, z21);
            case 6:
                int z22 = d0.z(parcel);
                boolean z23 = false;
                int i15 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        z23 = d0.n(parcel, readInt7);
                    } else if (c12 != 2) {
                        d0.y(parcel, readInt7);
                    } else {
                        i15 = d0.u(parcel, readInt7);
                    }
                }
                d0.m(parcel, z22);
                return new r6.a(i15, z23);
            case 7:
                int z24 = d0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z24) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        d0.y(parcel, readInt8);
                    } else {
                        pendingIntent = (PendingIntent) d0.g(parcel, readInt8, PendingIntent.CREATOR);
                    }
                }
                d0.m(parcel, z24);
                return new r6.b(pendingIntent);
            case 8:
                int z25 = d0.z(parcel);
                int i16 = 0;
                boolean z26 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 1) {
                        i16 = d0.u(parcel, readInt9);
                    } else if (c13 != 2) {
                        d0.y(parcel, readInt9);
                    } else {
                        z26 = d0.n(parcel, readInt9);
                    }
                }
                d0.m(parcel, z25);
                return new r6.c(i16, z26);
            case 9:
                int z27 = d0.z(parcel);
                int i17 = 0;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        i17 = d0.u(parcel, readInt10);
                    } else if (c14 != 3) {
                        d0.y(parcel, readInt10);
                    } else {
                        strArr2 = d0.i(parcel, readInt10);
                    }
                }
                d0.m(parcel, z27);
                r8.a aVar2 = new r8.a();
                aVar2.a = i17;
                aVar2.b = strArr2;
                return aVar2;
            case 10:
                int z28 = d0.z(parcel);
                int i18 = 0;
                String str14 = null;
                String str15 = null;
                Point[] pointArr = null;
                r8.f fVar2 = null;
                r8.i iVar2 = null;
                r8.j jVar = null;
                r8.l lVar = null;
                r8.k kVar = null;
                r8.g gVar = null;
                byte[] bArr2 = null;
                r8.d dVar = null;
                r8.c cVar = null;
                r8.e eVar2 = null;
                int i19 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt11 = parcel.readInt();
                    r8.g gVar2 = gVar;
                    switch ((char) readInt11) {
                        case 2:
                            i18 = d0.u(parcel, readInt11);
                            break;
                        case 3:
                            str14 = d0.h(parcel, readInt11);
                            break;
                        case 4:
                            str15 = d0.h(parcel, readInt11);
                            break;
                        case 5:
                            i19 = d0.u(parcel, readInt11);
                            break;
                        case 6:
                            pointArr = (Point[]) d0.k(parcel, readInt11, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (r8.f) d0.g(parcel, readInt11, r8.f.CREATOR);
                            break;
                        case '\b':
                            iVar2 = (r8.i) d0.g(parcel, readInt11, r8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (r8.j) d0.g(parcel, readInt11, r8.j.CREATOR);
                            break;
                        case '\n':
                            lVar = (r8.l) d0.g(parcel, readInt11, r8.l.CREATOR);
                            break;
                        case 11:
                            kVar = (r8.k) d0.g(parcel, readInt11, r8.k.CREATOR);
                            break;
                        case '\f':
                            gVar = (r8.g) d0.g(parcel, readInt11, r8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (r8.c) d0.g(parcel, readInt11, r8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (r8.d) d0.g(parcel, readInt11, r8.d.CREATOR);
                            break;
                        case 15:
                            eVar2 = (r8.e) d0.g(parcel, readInt11, r8.e.CREATOR);
                            break;
                        case 16:
                            bArr2 = d0.b(parcel, readInt11);
                            break;
                        case 17:
                            z29 = d0.n(parcel, readInt11);
                            break;
                        default:
                            d0.y(parcel, readInt11);
                            break;
                    }
                    gVar = gVar2;
                }
                d0.m(parcel, z28);
                r8.m mVar2 = new r8.m();
                mVar2.a = i18;
                mVar2.b = str14;
                mVar2.E = bArr2;
                mVar2.c = str15;
                mVar2.d = i19;
                mVar2.e = pointArr;
                mVar2.F = z29;
                mVar2.f = fVar2;
                mVar2.h = iVar2;
                mVar2.n = jVar;
                mVar2.r = lVar;
                mVar2.s = kVar;
                mVar2.v = gVar;
                mVar2.w = cVar;
                mVar2.x = dVar;
                mVar2.y = eVar2;
                return mVar2;
            case 11:
                int z30 = d0.z(parcel);
                int i20 = 0;
                String str16 = null;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            i20 = d0.u(parcel, readInt12);
                            break;
                        case 3:
                            i21 = d0.u(parcel, readInt12);
                            break;
                        case 4:
                            i22 = d0.u(parcel, readInt12);
                            break;
                        case 5:
                            i23 = d0.u(parcel, readInt12);
                            break;
                        case 6:
                            i24 = d0.u(parcel, readInt12);
                            break;
                        case 7:
                            i25 = d0.u(parcel, readInt12);
                            break;
                        case '\b':
                            z31 = d0.n(parcel, readInt12);
                            break;
                        case '\t':
                            str16 = d0.h(parcel, readInt12);
                            break;
                        default:
                            d0.y(parcel, readInt12);
                            break;
                    }
                }
                d0.m(parcel, z30);
                r8.b bVar = new r8.b();
                bVar.a = i20;
                bVar.b = i21;
                bVar.c = i22;
                bVar.d = i23;
                bVar.e = i24;
                bVar.f = i25;
                bVar.h = z31;
                bVar.n = str16;
                return bVar;
            case 12:
                int z32 = d0.z(parcel);
                r8.h hVar = null;
                String str17 = null;
                String str18 = null;
                r8.i[] iVarArr = null;
                r8.f[] fVarArr = null;
                String[] strArr3 = null;
                r8.a[] aVarArr = null;
                while (parcel.dataPosition() < z32) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            hVar = (r8.h) d0.g(parcel, readInt13, r8.h.CREATOR);
                            break;
                        case 3:
                            str17 = d0.h(parcel, readInt13);
                            break;
                        case 4:
                            str18 = d0.h(parcel, readInt13);
                            break;
                        case 5:
                            iVarArr = (r8.i[]) d0.k(parcel, readInt13, r8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (r8.f[]) d0.k(parcel, readInt13, r8.f.CREATOR);
                            break;
                        case 7:
                            strArr3 = d0.i(parcel, readInt13);
                            break;
                        case '\b':
                            aVarArr = (r8.a[]) d0.k(parcel, readInt13, r8.a.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt13);
                            break;
                    }
                }
                d0.m(parcel, z32);
                r8.d dVar2 = new r8.d();
                dVar2.a = hVar;
                dVar2.b = str17;
                dVar2.c = str18;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr3;
                dVar2.h = aVarArr;
                return dVar2;
            case 13:
                int z33 = d0.z(parcel);
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                r8.b bVar2 = null;
                r8.b bVar3 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str19 = d0.h(parcel, readInt14);
                            break;
                        case 3:
                            str20 = d0.h(parcel, readInt14);
                            break;
                        case 4:
                            str21 = d0.h(parcel, readInt14);
                            break;
                        case 5:
                            str22 = d0.h(parcel, readInt14);
                            break;
                        case 6:
                            str23 = d0.h(parcel, readInt14);
                            break;
                        case 7:
                            bVar2 = (r8.b) d0.g(parcel, readInt14, r8.b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (r8.b) d0.g(parcel, readInt14, r8.b.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt14);
                            break;
                    }
                }
                d0.m(parcel, z33);
                r8.c cVar2 = new r8.c();
                cVar2.a = str19;
                cVar2.b = str20;
                cVar2.c = str21;
                cVar2.d = str22;
                cVar2.e = str23;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 14:
                int z34 = d0.z(parcel);
                int i26 = 0;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt15 = parcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 == 2) {
                        i26 = d0.u(parcel, readInt15);
                    } else if (c15 == 3) {
                        str24 = d0.h(parcel, readInt15);
                    } else if (c15 == 4) {
                        str25 = d0.h(parcel, readInt15);
                    } else if (c15 != 5) {
                        d0.y(parcel, readInt15);
                    } else {
                        str26 = d0.h(parcel, readInt15);
                    }
                }
                d0.m(parcel, z34);
                r8.f fVar3 = new r8.f();
                fVar3.a = i26;
                fVar3.b = str24;
                fVar3.c = str25;
                fVar3.d = str26;
                return fVar3;
            case 15:
                int z35 = d0.z(parcel);
                String str27 = null;
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
                String str38 = null;
                String str39 = null;
                String str40 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt16 = parcel.readInt();
                    String str41 = str39;
                    switch ((char) readInt16) {
                        case 2:
                            str27 = d0.h(parcel, readInt16);
                            break;
                        case 3:
                            str28 = d0.h(parcel, readInt16);
                            break;
                        case 4:
                            str29 = d0.h(parcel, readInt16);
                            break;
                        case 5:
                            str30 = d0.h(parcel, readInt16);
                            break;
                        case 6:
                            str31 = d0.h(parcel, readInt16);
                            break;
                        case 7:
                            str32 = d0.h(parcel, readInt16);
                            break;
                        case '\b':
                            str33 = d0.h(parcel, readInt16);
                            break;
                        case '\t':
                            str34 = d0.h(parcel, readInt16);
                            break;
                        case '\n':
                            str35 = d0.h(parcel, readInt16);
                            break;
                        case 11:
                            str36 = d0.h(parcel, readInt16);
                            break;
                        case '\f':
                            str37 = d0.h(parcel, readInt16);
                            break;
                        case '\r':
                            str38 = d0.h(parcel, readInt16);
                            break;
                        case 14:
                            str39 = d0.h(parcel, readInt16);
                            continue;
                        case 15:
                            str40 = d0.h(parcel, readInt16);
                            break;
                        default:
                            d0.y(parcel, readInt16);
                            break;
                    }
                    str39 = str41;
                }
                d0.m(parcel, z35);
                r8.e eVar3 = new r8.e();
                eVar3.a = str27;
                eVar3.b = str28;
                eVar3.c = str29;
                eVar3.d = str30;
                eVar3.e = str31;
                eVar3.f = str32;
                eVar3.h = str33;
                eVar3.n = str34;
                eVar3.r = str35;
                eVar3.s = str36;
                eVar3.v = str37;
                eVar3.w = str38;
                eVar3.x = str39;
                eVar3.y = str40;
                return eVar3;
            case 16:
                int z36 = d0.z(parcel);
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str42 = d0.h(parcel, readInt17);
                            break;
                        case 3:
                            str43 = d0.h(parcel, readInt17);
                            break;
                        case 4:
                            str44 = d0.h(parcel, readInt17);
                            break;
                        case 5:
                            str45 = d0.h(parcel, readInt17);
                            break;
                        case 6:
                            str46 = d0.h(parcel, readInt17);
                            break;
                        case 7:
                            str47 = d0.h(parcel, readInt17);
                            break;
                        case '\b':
                            str48 = d0.h(parcel, readInt17);
                            break;
                        default:
                            d0.y(parcel, readInt17);
                            break;
                    }
                }
                d0.m(parcel, z36);
                r8.h hVar2 = new r8.h();
                hVar2.a = str42;
                hVar2.b = str43;
                hVar2.c = str44;
                hVar2.d = str45;
                hVar2.e = str46;
                hVar2.f = str47;
                hVar2.h = str48;
                return hVar2;
            case 17:
                int z37 = d0.z(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c16 = (char) readInt18;
                    if (c16 == 2) {
                        d = d0.q(parcel, readInt18);
                    } else if (c16 != 3) {
                        d0.y(parcel, readInt18);
                    } else {
                        d10 = d0.q(parcel, readInt18);
                    }
                }
                d0.m(parcel, z37);
                r8.g gVar3 = new r8.g();
                gVar3.a = d;
                gVar3.b = d10;
                return gVar3;
            case 18:
                int z38 = d0.z(parcel);
                String str49 = null;
                String str50 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c17 = (char) readInt19;
                    if (c17 == 2) {
                        str49 = d0.h(parcel, readInt19);
                    } else if (c17 != 3) {
                        d0.y(parcel, readInt19);
                    } else {
                        str50 = d0.h(parcel, readInt19);
                    }
                }
                d0.m(parcel, z38);
                r8.j jVar2 = new r8.j();
                jVar2.a = str49;
                jVar2.b = str50;
                return jVar2;
            case 19:
                int z39 = d0.z(parcel);
                int i27 = 0;
                String str51 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 2) {
                        i27 = d0.u(parcel, readInt20);
                    } else if (c18 != 3) {
                        d0.y(parcel, readInt20);
                    } else {
                        str51 = d0.h(parcel, readInt20);
                    }
                }
                d0.m(parcel, z39);
                r8.i iVar3 = new r8.i();
                iVar3.a = i27;
                iVar3.b = str51;
                return iVar3;
            case 20:
                int z40 = d0.z(parcel);
                String str52 = null;
                String str53 = null;
                int i28 = 0;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 2) {
                        str52 = d0.h(parcel, readInt21);
                    } else if (c19 == 3) {
                        str53 = d0.h(parcel, readInt21);
                    } else if (c19 != 4) {
                        d0.y(parcel, readInt21);
                    } else {
                        i28 = d0.u(parcel, readInt21);
                    }
                }
                d0.m(parcel, z40);
                r8.l lVar2 = new r8.l();
                lVar2.a = str52;
                lVar2.b = str53;
                lVar2.c = i28;
                return lVar2;
            case 21:
                int z41 = d0.z(parcel);
                String str54 = null;
                String str55 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt22 = parcel.readInt();
                    char c20 = (char) readInt22;
                    if (c20 == 2) {
                        str54 = d0.h(parcel, readInt22);
                    } else if (c20 != 3) {
                        d0.y(parcel, readInt22);
                    } else {
                        str55 = d0.h(parcel, readInt22);
                    }
                }
                d0.m(parcel, z41);
                r8.k kVar2 = new r8.k();
                kVar2.a = str54;
                kVar2.b = str55;
                return kVar2;
            case 22:
                b0 b0Var = new b0();
                b0Var.a = parcel.readInt();
                b0Var.b = parcel.readInt();
                b0Var.c = parcel.readInt() == 1;
                return b0Var;
            case 23:
                u0.h hVar3 = new u0.h(parcel);
                hVar3.a = parcel.readInt();
                return hVar3;
            case 24:
                int z42 = d0.z(parcel);
                PointF[] pointFArr = null;
                int i29 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt23 = parcel.readInt();
                    char c21 = (char) readInt23;
                    if (c21 == 2) {
                        pointFArr = (PointF[]) d0.k(parcel, readInt23, PointF.CREATOR);
                    } else if (c21 != 3) {
                        d0.y(parcel, readInt23);
                    } else {
                        i29 = d0.u(parcel, readInt23);
                    }
                }
                d0.m(parcel, z42);
                return new u8.a(pointFArr, i29);
            case 25:
                int z43 = d0.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                u8.a[] aVarArr2 = null;
                int i30 = 0;
                int i31 = 0;
                float f7 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = Float.MAX_VALUE;
                float f14 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
                float f16 = 0.0f;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = -1.0f;
                while (parcel.dataPosition() < z43) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            i30 = d0.u(parcel, readInt24);
                            break;
                        case 2:
                            i31 = d0.u(parcel, readInt24);
                            break;
                        case 3:
                            f7 = d0.r(parcel, readInt24);
                            break;
                        case 4:
                            f10 = d0.r(parcel, readInt24);
                            break;
                        case 5:
                            f11 = d0.r(parcel, readInt24);
                            break;
                        case 6:
                            f12 = d0.r(parcel, readInt24);
                            break;
                        case 7:
                            f13 = d0.r(parcel, readInt24);
                            break;
                        case '\b':
                            f14 = d0.r(parcel, readInt24);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) d0.k(parcel, readInt24, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f16 = d0.r(parcel, readInt24);
                            break;
                        case 11:
                            f17 = d0.r(parcel, readInt24);
                            break;
                        case '\f':
                            f18 = d0.r(parcel, readInt24);
                            break;
                        case '\r':
                            aVarArr2 = (u8.a[]) d0.k(parcel, readInt24, u8.a.CREATOR);
                            break;
                        case 14:
                            f15 = d0.r(parcel, readInt24);
                            break;
                        case 15:
                            f19 = d0.r(parcel, readInt24);
                            break;
                        default:
                            d0.y(parcel, readInt24);
                            break;
                    }
                }
                d0.m(parcel, z43);
                return new FaceParcel(i30, i31, f7, f10, f11, f12, f13, f14, f15, landmarkParcelArr, f16, f17, f18, aVarArr2, f19);
            case 26:
                int z44 = d0.z(parcel);
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                boolean z45 = false;
                boolean z46 = false;
                float f20 = -1.0f;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            i32 = d0.u(parcel, readInt25);
                            break;
                        case 3:
                            i33 = d0.u(parcel, readInt25);
                            break;
                        case 4:
                            i34 = d0.u(parcel, readInt25);
                            break;
                        case 5:
                            z45 = d0.n(parcel, readInt25);
                            break;
                        case 6:
                            z46 = d0.n(parcel, readInt25);
                            break;
                        case 7:
                            f20 = d0.r(parcel, readInt25);
                            break;
                        default:
                            d0.y(parcel, readInt25);
                            break;
                    }
                }
                d0.m(parcel, z44);
                u8.b bVar4 = new u8.b();
                bVar4.a = i32;
                bVar4.b = i33;
                bVar4.c = i34;
                bVar4.d = z45;
                bVar4.e = z46;
                bVar4.f = f20;
                return bVar4;
            case 27:
                int z47 = d0.z(parcel);
                int i35 = 0;
                int i36 = 0;
                float f21 = 0.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < z47) {
                    int readInt26 = parcel.readInt();
                    char c22 = (char) readInt26;
                    if (c22 == 1) {
                        i35 = d0.u(parcel, readInt26);
                    } else if (c22 == 2) {
                        f21 = d0.r(parcel, readInt26);
                    } else if (c22 == 3) {
                        f22 = d0.r(parcel, readInt26);
                    } else if (c22 != 4) {
                        d0.y(parcel, readInt26);
                    } else {
                        i36 = d0.u(parcel, readInt26);
                    }
                }
                d0.m(parcel, z47);
                return new LandmarkParcel(i35, f21, f22, i36);
            case 28:
                int z48 = d0.z(parcel);
                String str56 = null;
                v8.b bVar5 = null;
                UserAddress userAddress = null;
                v8.k kVar3 = null;
                String str57 = null;
                Bundle bundle2 = null;
                String str58 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 1:
                            str56 = d0.h(parcel, readInt27);
                            break;
                        case 2:
                            bVar5 = (v8.b) d0.g(parcel, readInt27, v8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) d0.g(parcel, readInt27, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar3 = (v8.k) d0.g(parcel, readInt27, v8.k.CREATOR);
                            break;
                        case 5:
                            str57 = d0.h(parcel, readInt27);
                            break;
                        case 6:
                            bundle2 = d0.a(parcel, readInt27);
                            break;
                        case 7:
                            str58 = d0.h(parcel, readInt27);
                            break;
                        case '\b':
                            bundle3 = d0.a(parcel, readInt27);
                            break;
                        default:
                            d0.y(parcel, readInt27);
                            break;
                    }
                }
                d0.m(parcel, z48);
                v8.i iVar4 = new v8.i();
                iVar4.a = str56;
                iVar4.b = bVar5;
                iVar4.c = userAddress;
                iVar4.d = kVar3;
                iVar4.e = str57;
                iVar4.f = bundle2;
                iVar4.h = str58;
                iVar4.n = bundle3;
                return iVar4;
            default:
                int z49 = d0.z(parcel);
                boolean z50 = false;
                v8.c cVar3 = null;
                v8.m mVar3 = null;
                ArrayList arrayList2 = null;
                v8.l lVar3 = null;
                v8.n nVar = null;
                String str59 = null;
                Bundle bundle4 = null;
                boolean z51 = false;
                boolean z52 = false;
                boolean z53 = true;
                while (parcel.dataPosition() < z49) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            z50 = d0.n(parcel, readInt28);
                            break;
                        case 2:
                            z51 = d0.n(parcel, readInt28);
                            break;
                        case 3:
                            cVar3 = (v8.c) d0.g(parcel, readInt28, v8.c.CREATOR);
                            break;
                        case 4:
                            z52 = d0.n(parcel, readInt28);
                            break;
                        case 5:
                            mVar3 = (v8.m) d0.g(parcel, readInt28, v8.m.CREATOR);
                            break;
                        case 6:
                            arrayList2 = d0.e(parcel, readInt28);
                            break;
                        case 7:
                            lVar3 = (v8.l) d0.g(parcel, readInt28, v8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (v8.n) d0.g(parcel, readInt28, v8.n.CREATOR);
                            break;
                        case '\t':
                            z53 = d0.n(parcel, readInt28);
                            break;
                        case '\n':
                            str59 = d0.h(parcel, readInt28);
                            break;
                        case 11:
                            bundle4 = d0.a(parcel, readInt28);
                            break;
                        default:
                            d0.y(parcel, readInt28);
                            break;
                    }
                }
                d0.m(parcel, z49);
                v8.j jVar3 = new v8.j();
                jVar3.a = z50;
                jVar3.b = z51;
                jVar3.c = cVar3;
                jVar3.d = z52;
                jVar3.e = mVar3;
                jVar3.f = arrayList2;
                jVar3.h = lVar3;
                jVar3.n = nVar;
                jVar3.r = z53;
                jVar3.s = str59;
                jVar3.v = bundle4;
                return jVar3;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new i[i10];
            case 1:
                return new l[i10];
            case 2:
                return new m[i10];
            case 3:
                return new n[i10];
            case 4:
                return new p9.b[i10];
            case 5:
                return new p9.a[i10];
            case 6:
                return new r6.a[i10];
            case 7:
                return new r6.b[i10];
            case 8:
                return new r6.c[i10];
            case 9:
                return new r8.a[i10];
            case 10:
                return new r8.m[i10];
            case 11:
                return new r8.b[i10];
            case 12:
                return new r8.d[i10];
            case 13:
                return new r8.c[i10];
            case 14:
                return new r8.f[i10];
            case 15:
                return new r8.e[i10];
            case 16:
                return new r8.h[i10];
            case 17:
                return new r8.g[i10];
            case 18:
                return new r8.j[i10];
            case 19:
                return new r8.i[i10];
            case 20:
                return new r8.l[i10];
            case 21:
                return new r8.k[i10];
            case 22:
                return new b0[i10];
            case 23:
                return new u0.h[i10];
            case 24:
                return new u8.a[i10];
            case 25:
                return new FaceParcel[i10];
            case 26:
                return new u8.b[i10];
            case 27:
                return new LandmarkParcel[i10];
            case 28:
                return new v8.i[i10];
            default:
                return new v8.j[i10];
        }
    }
}
