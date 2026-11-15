package u8;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import java.util.ArrayList;
import v4.a0;
import y8.q;
import y8.r;
import y8.s;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = xb.z(parcel);
                int i7 = 0;
                String[] strArr = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i7 = xb.u(parcel, readInt);
                    } else if (c10 != 3) {
                        xb.y(parcel, readInt);
                    } else {
                        strArr = xb.i(parcel, readInt);
                    }
                }
                xb.m(parcel, z10);
                a aVar = new a();
                aVar.a = i7;
                aVar.b = strArr;
                return aVar;
            case 1:
                int z11 = xb.z(parcel);
                int i10 = 0;
                boolean z12 = false;
                String str = null;
                String str2 = null;
                Point[] pointArr = null;
                f fVar = null;
                i iVar = null;
                j jVar = null;
                l lVar = null;
                k kVar = null;
                g gVar = null;
                byte[] bArr = null;
                d dVar = null;
                c cVar = null;
                e eVar = null;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    g gVar2 = gVar;
                    switch ((char) readInt2) {
                        case 2:
                            i10 = xb.u(parcel, readInt2);
                            break;
                        case 3:
                            str = xb.h(parcel, readInt2);
                            break;
                        case 4:
                            str2 = xb.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = xb.u(parcel, readInt2);
                            break;
                        case 6:
                            pointArr = (Point[]) xb.k(parcel, readInt2, Point.CREATOR);
                            break;
                        case 7:
                            fVar = (f) xb.g(parcel, readInt2, f.CREATOR);
                            break;
                        case '\b':
                            iVar = (i) xb.g(parcel, readInt2, i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) xb.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\n':
                            lVar = (l) xb.g(parcel, readInt2, l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) xb.g(parcel, readInt2, k.CREATOR);
                            break;
                        case '\f':
                            gVar = (g) xb.g(parcel, readInt2, g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (c) xb.g(parcel, readInt2, c.CREATOR);
                            break;
                        case 14:
                            dVar = (d) xb.g(parcel, readInt2, d.CREATOR);
                            break;
                        case 15:
                            eVar = (e) xb.g(parcel, readInt2, e.CREATOR);
                            break;
                        case 16:
                            bArr = xb.b(parcel, readInt2);
                            break;
                        case 17:
                            z12 = xb.n(parcel, readInt2);
                            break;
                        default:
                            xb.y(parcel, readInt2);
                            break;
                    }
                    gVar = gVar2;
                }
                xb.m(parcel, z11);
                m mVar = new m();
                mVar.a = i10;
                mVar.b = str;
                mVar.F = bArr;
                mVar.c = str2;
                mVar.d = i11;
                mVar.e = pointArr;
                mVar.G = z12;
                mVar.f = fVar;
                mVar.h = iVar;
                mVar.n = jVar;
                mVar.r = lVar;
                mVar.s = kVar;
                mVar.w = gVar;
                mVar.x = cVar;
                mVar.y = dVar;
                mVar.E = eVar;
                return mVar;
            case 2:
                int z13 = xb.z(parcel);
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z14 = false;
                String str3 = null;
                int i17 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i12 = xb.u(parcel, readInt3);
                            break;
                        case 3:
                            i17 = xb.u(parcel, readInt3);
                            break;
                        case 4:
                            i13 = xb.u(parcel, readInt3);
                            break;
                        case 5:
                            i14 = xb.u(parcel, readInt3);
                            break;
                        case 6:
                            i15 = xb.u(parcel, readInt3);
                            break;
                        case 7:
                            i16 = xb.u(parcel, readInt3);
                            break;
                        case '\b':
                            z14 = xb.n(parcel, readInt3);
                            break;
                        case '\t':
                            str3 = xb.h(parcel, readInt3);
                            break;
                        default:
                            xb.y(parcel, readInt3);
                            break;
                    }
                }
                xb.m(parcel, z13);
                b bVar = new b();
                bVar.a = i12;
                bVar.b = i17;
                bVar.c = i13;
                bVar.d = i14;
                bVar.e = i15;
                bVar.f = i16;
                bVar.h = z14;
                bVar.n = str3;
                return bVar;
            case 3:
                int z15 = xb.z(parcel);
                h hVar = null;
                String str4 = null;
                String str5 = null;
                i[] iVarArr = null;
                f[] fVarArr = null;
                String[] strArr2 = null;
                a[] aVarArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            hVar = (h) xb.g(parcel, readInt4, h.CREATOR);
                            break;
                        case 3:
                            str4 = xb.h(parcel, readInt4);
                            break;
                        case 4:
                            str5 = xb.h(parcel, readInt4);
                            break;
                        case 5:
                            iVarArr = (i[]) xb.k(parcel, readInt4, i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f[]) xb.k(parcel, readInt4, f.CREATOR);
                            break;
                        case 7:
                            strArr2 = xb.i(parcel, readInt4);
                            break;
                        case '\b':
                            aVarArr = (a[]) xb.k(parcel, readInt4, a.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt4);
                            break;
                    }
                }
                xb.m(parcel, z15);
                d dVar2 = new d();
                dVar2.a = hVar;
                dVar2.b = str4;
                dVar2.c = str5;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr2;
                dVar2.h = aVarArr;
                return dVar2;
            case 4:
                int z16 = xb.z(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                b bVar2 = null;
                b bVar3 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str6 = xb.h(parcel, readInt5);
                            break;
                        case 3:
                            str7 = xb.h(parcel, readInt5);
                            break;
                        case 4:
                            str8 = xb.h(parcel, readInt5);
                            break;
                        case 5:
                            str9 = xb.h(parcel, readInt5);
                            break;
                        case 6:
                            str10 = xb.h(parcel, readInt5);
                            break;
                        case 7:
                            bVar2 = (b) xb.g(parcel, readInt5, b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (b) xb.g(parcel, readInt5, b.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt5);
                            break;
                    }
                }
                xb.m(parcel, z16);
                c cVar2 = new c();
                cVar2.a = str6;
                cVar2.b = str7;
                cVar2.c = str8;
                cVar2.d = str9;
                cVar2.e = str10;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 5:
                int z17 = xb.z(parcel);
                int i18 = 0;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 2) {
                        i18 = xb.u(parcel, readInt6);
                    } else if (c11 == 3) {
                        str11 = xb.h(parcel, readInt6);
                    } else if (c11 == 4) {
                        str12 = xb.h(parcel, readInt6);
                    } else if (c11 != 5) {
                        xb.y(parcel, readInt6);
                    } else {
                        str13 = xb.h(parcel, readInt6);
                    }
                }
                xb.m(parcel, z17);
                f fVar2 = new f();
                fVar2.a = i18;
                fVar2.b = str11;
                fVar2.c = str12;
                fVar2.d = str13;
                return fVar2;
            case 6:
                int z18 = xb.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    String str28 = str26;
                    switch ((char) readInt7) {
                        case 2:
                            str14 = xb.h(parcel, readInt7);
                            break;
                        case 3:
                            str15 = xb.h(parcel, readInt7);
                            break;
                        case 4:
                            str16 = xb.h(parcel, readInt7);
                            break;
                        case 5:
                            str17 = xb.h(parcel, readInt7);
                            break;
                        case 6:
                            str18 = xb.h(parcel, readInt7);
                            break;
                        case 7:
                            str19 = xb.h(parcel, readInt7);
                            break;
                        case '\b':
                            str20 = xb.h(parcel, readInt7);
                            break;
                        case '\t':
                            str21 = xb.h(parcel, readInt7);
                            break;
                        case '\n':
                            str22 = xb.h(parcel, readInt7);
                            break;
                        case 11:
                            str23 = xb.h(parcel, readInt7);
                            break;
                        case '\f':
                            str24 = xb.h(parcel, readInt7);
                            break;
                        case '\r':
                            str25 = xb.h(parcel, readInt7);
                            break;
                        case 14:
                            str26 = xb.h(parcel, readInt7);
                            continue;
                        case 15:
                            str27 = xb.h(parcel, readInt7);
                            break;
                        default:
                            xb.y(parcel, readInt7);
                            break;
                    }
                    str26 = str28;
                }
                xb.m(parcel, z18);
                e eVar2 = new e();
                eVar2.a = str14;
                eVar2.b = str15;
                eVar2.c = str16;
                eVar2.d = str17;
                eVar2.e = str18;
                eVar2.f = str19;
                eVar2.h = str20;
                eVar2.n = str21;
                eVar2.r = str22;
                eVar2.s = str23;
                eVar2.w = str24;
                eVar2.x = str25;
                eVar2.y = str26;
                eVar2.E = str27;
                return eVar2;
            case 7:
                int z19 = xb.z(parcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str29 = xb.h(parcel, readInt8);
                            break;
                        case 3:
                            str30 = xb.h(parcel, readInt8);
                            break;
                        case 4:
                            str31 = xb.h(parcel, readInt8);
                            break;
                        case 5:
                            str32 = xb.h(parcel, readInt8);
                            break;
                        case 6:
                            str33 = xb.h(parcel, readInt8);
                            break;
                        case 7:
                            str34 = xb.h(parcel, readInt8);
                            break;
                        case '\b':
                            str35 = xb.h(parcel, readInt8);
                            break;
                        default:
                            xb.y(parcel, readInt8);
                            break;
                    }
                }
                xb.m(parcel, z19);
                h hVar2 = new h();
                hVar2.a = str29;
                hVar2.b = str30;
                hVar2.c = str31;
                hVar2.d = str32;
                hVar2.e = str33;
                hVar2.f = str34;
                hVar2.h = str35;
                return hVar2;
            case 8:
                int z20 = xb.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < z20) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 2) {
                        d = xb.q(parcel, readInt9);
                    } else if (c12 != 3) {
                        xb.y(parcel, readInt9);
                    } else {
                        d2 = xb.q(parcel, readInt9);
                    }
                }
                xb.m(parcel, z20);
                g gVar3 = new g();
                gVar3.a = d;
                gVar3.b = d2;
                return gVar3;
            case 9:
                int z21 = xb.z(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        str36 = xb.h(parcel, readInt10);
                    } else if (c13 != 3) {
                        xb.y(parcel, readInt10);
                    } else {
                        str37 = xb.h(parcel, readInt10);
                    }
                }
                xb.m(parcel, z21);
                j jVar2 = new j();
                jVar2.a = str36;
                jVar2.b = str37;
                return jVar2;
            case 10:
                int z22 = xb.z(parcel);
                int i19 = 0;
                String str38 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 2) {
                        i19 = xb.u(parcel, readInt11);
                    } else if (c14 != 3) {
                        xb.y(parcel, readInt11);
                    } else {
                        str38 = xb.h(parcel, readInt11);
                    }
                }
                xb.m(parcel, z22);
                i iVar2 = new i();
                iVar2.a = i19;
                iVar2.b = str38;
                return iVar2;
            case 11:
                int z23 = xb.z(parcel);
                String str39 = null;
                int i20 = 0;
                String str40 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        str39 = xb.h(parcel, readInt12);
                    } else if (c15 == 3) {
                        str40 = xb.h(parcel, readInt12);
                    } else if (c15 != 4) {
                        xb.y(parcel, readInt12);
                    } else {
                        i20 = xb.u(parcel, readInt12);
                    }
                }
                xb.m(parcel, z23);
                l lVar2 = new l();
                lVar2.a = str39;
                lVar2.b = str40;
                lVar2.c = i20;
                return lVar2;
            case 12:
                int z24 = xb.z(parcel);
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        str41 = xb.h(parcel, readInt13);
                    } else if (c16 != 3) {
                        xb.y(parcel, readInt13);
                    } else {
                        str42 = xb.h(parcel, readInt13);
                    }
                }
                xb.m(parcel, z24);
                k kVar2 = new k();
                kVar2.a = str41;
                kVar2.b = str42;
                return kVar2;
            case 13:
                a0 a0Var = new a0();
                a0Var.a = parcel.readInt();
                a0Var.b = parcel.readInt();
                a0Var.c = parcel.readInt() == 1;
                return a0Var;
            case 14:
                int z25 = xb.z(parcel);
                ArrayList arrayList = null;
                String str43 = null;
                boolean z26 = false;
                String str44 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        arrayList = xb.l(parcel, readInt14, n6.c.CREATOR);
                    } else if (c17 == 2) {
                        z26 = xb.n(parcel, readInt14);
                    } else if (c17 == 3) {
                        str44 = xb.h(parcel, readInt14);
                    } else if (c17 != 4) {
                        xb.y(parcel, readInt14);
                    } else {
                        str43 = xb.h(parcel, readInt14);
                    }
                }
                xb.m(parcel, z25);
                return new v6.a(arrayList, z26, str44, str43);
            case 15:
                int z27 = xb.z(parcel);
                PointF[] pointFArr = null;
                int i21 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 2) {
                        pointFArr = (PointF[]) xb.k(parcel, readInt15, PointF.CREATOR);
                    } else if (c18 != 3) {
                        xb.y(parcel, readInt15);
                    } else {
                        i21 = xb.u(parcel, readInt15);
                    }
                }
                xb.m(parcel, z27);
                return new x8.a(pointFArr, i21);
            case 16:
                int z28 = xb.z(parcel);
                int i22 = 0;
                int i23 = 0;
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
                x8.a[] aVarArr2 = null;
                float f20 = -1.0f;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i22 = xb.u(parcel, readInt16);
                            break;
                        case 2:
                            i23 = xb.u(parcel, readInt16);
                            break;
                        case 3:
                            f10 = xb.r(parcel, readInt16);
                            break;
                        case 4:
                            f11 = xb.r(parcel, readInt16);
                            break;
                        case 5:
                            f12 = xb.r(parcel, readInt16);
                            break;
                        case 6:
                            f13 = xb.r(parcel, readInt16);
                            break;
                        case 7:
                            f17 = xb.r(parcel, readInt16);
                            break;
                        case '\b':
                            f18 = xb.r(parcel, readInt16);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) xb.k(parcel, readInt16, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f14 = xb.r(parcel, readInt16);
                            break;
                        case 11:
                            f15 = xb.r(parcel, readInt16);
                            break;
                        case '\f':
                            f16 = xb.r(parcel, readInt16);
                            break;
                        case '\r':
                            aVarArr2 = (x8.a[]) xb.k(parcel, readInt16, x8.a.CREATOR);
                            break;
                        case 14:
                            f19 = xb.r(parcel, readInt16);
                            break;
                        case 15:
                            f20 = xb.r(parcel, readInt16);
                            break;
                        default:
                            xb.y(parcel, readInt16);
                            break;
                    }
                }
                xb.m(parcel, z28);
                return new FaceParcel(i22, i23, f10, f11, f12, f13, f17, f18, f19, landmarkParcelArr, f14, f15, f16, aVarArr2, f20);
            case 17:
                int z29 = xb.z(parcel);
                int i24 = 0;
                int i25 = 0;
                boolean z30 = false;
                boolean z31 = false;
                float f21 = -1.0f;
                int i26 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            i24 = xb.u(parcel, readInt17);
                            break;
                        case 3:
                            i26 = xb.u(parcel, readInt17);
                            break;
                        case 4:
                            i25 = xb.u(parcel, readInt17);
                            break;
                        case 5:
                            z30 = xb.n(parcel, readInt17);
                            break;
                        case 6:
                            z31 = xb.n(parcel, readInt17);
                            break;
                        case 7:
                            f21 = xb.r(parcel, readInt17);
                            break;
                        default:
                            xb.y(parcel, readInt17);
                            break;
                    }
                }
                xb.m(parcel, z29);
                x8.b bVar4 = new x8.b();
                bVar4.a = i24;
                bVar4.b = i26;
                bVar4.c = i25;
                bVar4.d = z30;
                bVar4.e = z31;
                bVar4.f = f21;
                return bVar4;
            case 18:
                int z32 = xb.z(parcel);
                int i27 = 0;
                float f22 = 0.0f;
                float f23 = 0.0f;
                int i28 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        i27 = xb.u(parcel, readInt18);
                    } else if (c19 == 2) {
                        f22 = xb.r(parcel, readInt18);
                    } else if (c19 == 3) {
                        f23 = xb.r(parcel, readInt18);
                    } else if (c19 != 4) {
                        xb.y(parcel, readInt18);
                    } else {
                        i28 = xb.u(parcel, readInt18);
                    }
                }
                xb.m(parcel, z32);
                return new LandmarkParcel(i27, f22, f23, i28);
            case 19:
                int z33 = xb.z(parcel);
                String str45 = null;
                y8.b bVar5 = null;
                UserAddress userAddress = null;
                y8.k kVar3 = null;
                String str46 = null;
                Bundle bundle = null;
                String str47 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str45 = xb.h(parcel, readInt19);
                            break;
                        case 2:
                            bVar5 = (y8.b) xb.g(parcel, readInt19, y8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) xb.g(parcel, readInt19, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar3 = (y8.k) xb.g(parcel, readInt19, y8.k.CREATOR);
                            break;
                        case 5:
                            str46 = xb.h(parcel, readInt19);
                            break;
                        case 6:
                            bundle = xb.a(parcel, readInt19);
                            break;
                        case 7:
                            str47 = xb.h(parcel, readInt19);
                            break;
                        case '\b':
                            bundle2 = xb.a(parcel, readInt19);
                            break;
                        default:
                            xb.y(parcel, readInt19);
                            break;
                    }
                }
                xb.m(parcel, z33);
                y8.i iVar3 = new y8.i();
                iVar3.a = str45;
                iVar3.b = bVar5;
                iVar3.c = userAddress;
                iVar3.d = kVar3;
                iVar3.e = str46;
                iVar3.f = bundle;
                iVar3.h = str47;
                iVar3.n = bundle2;
                return iVar3;
            case 20:
                int z34 = xb.z(parcel);
                boolean z35 = false;
                y8.c cVar3 = null;
                y8.m mVar2 = null;
                ArrayList arrayList2 = null;
                y8.l lVar3 = null;
                y8.n nVar = null;
                String str48 = null;
                Bundle bundle3 = null;
                boolean z36 = true;
                boolean z37 = false;
                boolean z38 = false;
                while (parcel.dataPosition() < z34) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            z35 = xb.n(parcel, readInt20);
                            break;
                        case 2:
                            z37 = xb.n(parcel, readInt20);
                            break;
                        case 3:
                            cVar3 = (y8.c) xb.g(parcel, readInt20, y8.c.CREATOR);
                            break;
                        case 4:
                            z38 = xb.n(parcel, readInt20);
                            break;
                        case 5:
                            mVar2 = (y8.m) xb.g(parcel, readInt20, y8.m.CREATOR);
                            break;
                        case 6:
                            arrayList2 = xb.e(parcel, readInt20);
                            break;
                        case 7:
                            lVar3 = (y8.l) xb.g(parcel, readInt20, y8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (y8.n) xb.g(parcel, readInt20, y8.n.CREATOR);
                            break;
                        case '\t':
                            z36 = xb.n(parcel, readInt20);
                            break;
                        case '\n':
                            str48 = xb.h(parcel, readInt20);
                            break;
                        case 11:
                            bundle3 = xb.a(parcel, readInt20);
                            break;
                        default:
                            xb.y(parcel, readInt20);
                            break;
                    }
                }
                xb.m(parcel, z34);
                y8.j jVar3 = new y8.j();
                jVar3.a = z35;
                jVar3.b = z37;
                jVar3.c = cVar3;
                jVar3.d = z38;
                jVar3.e = mVar2;
                jVar3.f = arrayList2;
                jVar3.h = lVar3;
                jVar3.n = nVar;
                jVar3.r = z36;
                jVar3.s = str48;
                jVar3.w = bundle3;
                return jVar3;
            case 21:
                int z39 = xb.z(parcel);
                int i29 = 0;
                String str49 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 2) {
                        i29 = xb.u(parcel, readInt21);
                    } else if (c20 != 3) {
                        xb.y(parcel, readInt21);
                    } else {
                        str49 = xb.h(parcel, readInt21);
                    }
                }
                xb.m(parcel, z39);
                y8.k kVar4 = new y8.k();
                kVar4.a = i29;
                kVar4.b = str49;
                return kVar4;
            case 22:
                int z40 = xb.z(parcel);
                int i30 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 2) {
                        i30 = xb.u(parcel, readInt22);
                    } else if (c21 != 3) {
                        xb.y(parcel, readInt22);
                    } else {
                        bundle4 = xb.a(parcel, readInt22);
                    }
                }
                xb.m(parcel, z40);
                y8.l lVar4 = new y8.l();
                new Bundle();
                lVar4.a = i30;
                lVar4.b = bundle4;
                return lVar4;
            case 23:
                int z41 = xb.z(parcel);
                String str50 = null;
                int i31 = 0;
                int i32 = 0;
                String str51 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 2) {
                        str50 = xb.h(parcel, readInt23);
                    } else if (c22 == 3) {
                        str51 = xb.h(parcel, readInt23);
                    } else if (c22 == 4) {
                        i31 = xb.u(parcel, readInt23);
                    } else if (c22 != 5) {
                        xb.y(parcel, readInt23);
                    } else {
                        i32 = xb.u(parcel, readInt23);
                    }
                }
                xb.m(parcel, z41);
                return new r(i31, i32, str50, str51);
            case 24:
                int z42 = xb.z(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        xb.y(parcel, readInt24);
                    } else {
                        arrayList3 = xb.j(parcel, readInt24);
                    }
                }
                xb.m(parcel, z42);
                y8.m mVar3 = new y8.m();
                mVar3.a = arrayList3;
                return mVar3;
            case 25:
                int z43 = xb.z(parcel);
                int i33 = 0;
                String str52 = null;
                String str53 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt25 = parcel.readInt();
                    char c23 = (char) readInt25;
                    if (c23 == 1) {
                        i33 = xb.u(parcel, readInt25);
                    } else if (c23 == 2) {
                        str52 = xb.h(parcel, readInt25);
                    } else if (c23 != 3) {
                        xb.y(parcel, readInt25);
                    } else {
                        str53 = xb.h(parcel, readInt25);
                    }
                }
                xb.m(parcel, z43);
                y8.n nVar2 = new y8.n();
                nVar2.a = i33;
                nVar2.b = str52;
                nVar2.c = str53;
                return nVar2;
            case 26:
                int z44 = xb.z(parcel);
                String str54 = null;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt26 = parcel.readInt();
                    char c24 = (char) readInt26;
                    if (c24 == 2) {
                        str54 = xb.h(parcel, readInt26);
                    } else if (c24 != 3) {
                        xb.y(parcel, readInt26);
                    } else {
                        bundle5 = xb.a(parcel, readInt26);
                    }
                }
                xb.m(parcel, z44);
                s sVar = new s();
                sVar.a = str54;
                sVar.b = bundle5;
                return sVar;
            case 27:
                int z45 = xb.z(parcel);
                String str55 = null;
                String str56 = null;
                String str57 = null;
                String str58 = null;
                String str59 = null;
                String str60 = null;
                String str61 = null;
                String str62 = null;
                String str63 = null;
                boolean z46 = false;
                String str64 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            str55 = xb.h(parcel, readInt27);
                            break;
                        case 3:
                            str64 = xb.h(parcel, readInt27);
                            break;
                        case 4:
                            str56 = xb.h(parcel, readInt27);
                            break;
                        case 5:
                            str57 = xb.h(parcel, readInt27);
                            break;
                        case 6:
                            str58 = xb.h(parcel, readInt27);
                            break;
                        case 7:
                            str59 = xb.h(parcel, readInt27);
                            break;
                        case '\b':
                            str60 = xb.h(parcel, readInt27);
                            break;
                        case '\t':
                            str61 = xb.h(parcel, readInt27);
                            break;
                        case '\n':
                            str62 = xb.h(parcel, readInt27);
                            break;
                        case 11:
                            z46 = xb.n(parcel, readInt27);
                            break;
                        case '\f':
                            str63 = xb.h(parcel, readInt27);
                            break;
                        default:
                            xb.y(parcel, readInt27);
                            break;
                    }
                }
                xb.m(parcel, z45);
                q qVar = new q();
                qVar.a = str55;
                qVar.b = str64;
                qVar.c = str56;
                qVar.d = str57;
                qVar.e = str58;
                qVar.f = str59;
                qVar.h = str60;
                qVar.n = str61;
                qVar.r = str62;
                qVar.s = z46;
                qVar.w = str63;
                return qVar;
            case 28:
                int z47 = xb.z(parcel);
                String str65 = null;
                String str66 = null;
                UserAddress userAddress2 = null;
                int i34 = 0;
                String str67 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt28 = parcel.readInt();
                    char c25 = (char) readInt28;
                    if (c25 == 1) {
                        str65 = xb.h(parcel, readInt28);
                    } else if (c25 == 2) {
                        str67 = xb.h(parcel, readInt28);
                    } else if (c25 == 3) {
                        str66 = xb.h(parcel, readInt28);
                    } else if (c25 == 4) {
                        i34 = xb.u(parcel, readInt28);
                    } else if (c25 != 5) {
                        xb.y(parcel, readInt28);
                    } else {
                        userAddress2 = (UserAddress) xb.g(parcel, readInt28, UserAddress.CREATOR);
                    }
                }
                xb.m(parcel, z47);
                y8.b bVar6 = new y8.b();
                bVar6.a = str65;
                bVar6.b = str67;
                bVar6.c = str66;
                bVar6.d = i34;
                bVar6.e = userAddress2;
                return bVar6;
            default:
                int z48 = xb.z(parcel);
                ArrayList arrayList4 = null;
                boolean z49 = false;
                boolean z50 = true;
                int i35 = 0;
                while (parcel.dataPosition() < z48) {
                    int readInt29 = parcel.readInt();
                    char c26 = (char) readInt29;
                    if (c26 == 1) {
                        arrayList4 = xb.e(parcel, readInt29);
                    } else if (c26 == 2) {
                        z50 = xb.n(parcel, readInt29);
                    } else if (c26 == 3) {
                        z49 = xb.n(parcel, readInt29);
                    } else if (c26 != 4) {
                        xb.y(parcel, readInt29);
                    } else {
                        i35 = xb.u(parcel, readInt29);
                    }
                }
                xb.m(parcel, z48);
                y8.c cVar4 = new y8.c();
                cVar4.a = arrayList4;
                cVar4.b = z50;
                cVar4.c = z49;
                cVar4.d = i35;
                return cVar4;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new a[i7];
            case 1:
                return new m[i7];
            case 2:
                return new b[i7];
            case 3:
                return new d[i7];
            case 4:
                return new c[i7];
            case 5:
                return new f[i7];
            case 6:
                return new e[i7];
            case 7:
                return new h[i7];
            case 8:
                return new g[i7];
            case 9:
                return new j[i7];
            case 10:
                return new i[i7];
            case 11:
                return new l[i7];
            case 12:
                return new k[i7];
            case 13:
                return new a0[i7];
            case 14:
                return new v6.a[i7];
            case 15:
                return new x8.a[i7];
            case 16:
                return new FaceParcel[i7];
            case 17:
                return new x8.b[i7];
            case 18:
                return new LandmarkParcel[i7];
            case 19:
                return new y8.i[i7];
            case 20:
                return new y8.j[i7];
            case 21:
                return new y8.k[i7];
            case 22:
                return new y8.l[i7];
            case 23:
                return new r[i7];
            case 24:
                return new y8.m[i7];
            case 25:
                return new y8.n[i7];
            case 26:
                return new s[i7];
            case 27:
                return new q[i7];
            case 28:
                return new y8.b[i7];
            default:
                return new y8.c[i7];
        }
    }
}
