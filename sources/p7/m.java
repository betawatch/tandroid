package p7;

import android.app.PendingIntent;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import java.util.ArrayList;
import s4.a0;
import w7.e0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = e0.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        e0.y(parcel, readInt);
                    } else {
                        z11 = e0.n(parcel, readInt);
                    }
                }
                e0.m(parcel, z10);
                return new l(z11);
            case 1:
                int z12 = e0.z(parcel);
                f fVar = null;
                String str = null;
                e eVar = null;
                String str2 = null;
                long j10 = 0;
                int i10 = 0;
                boolean z13 = false;
                int i11 = 0;
                int i12 = -1;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            fVar = (f) e0.g(parcel, readInt2, f.CREATOR);
                            break;
                        case 2:
                            j10 = e0.w(parcel, readInt2);
                            break;
                        case 3:
                            i10 = e0.u(parcel, readInt2);
                            break;
                        case 4:
                            str = e0.h(parcel, readInt2);
                            break;
                        case 5:
                            eVar = (e) e0.g(parcel, readInt2, e.CREATOR);
                            break;
                        case 6:
                            z13 = e0.n(parcel, readInt2);
                            break;
                        case 7:
                            i12 = e0.u(parcel, readInt2);
                            break;
                        case '\b':
                            i11 = e0.u(parcel, readInt2);
                            break;
                        case '\t':
                            str2 = e0.h(parcel, readInt2);
                            break;
                        default:
                            e0.y(parcel, readInt2);
                            break;
                    }
                }
                e0.m(parcel, z12);
                return new n(fVar, j10, i10, str, eVar, z13, i12, i11, str2);
            case 2:
                int z14 = e0.z(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                q9.a aVar = null;
                String str7 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            str3 = e0.h(parcel, readInt3);
                            break;
                        case 2:
                            str4 = e0.h(parcel, readInt3);
                            break;
                        case 3:
                            str5 = e0.h(parcel, readInt3);
                            break;
                        case 4:
                            str6 = e0.h(parcel, readInt3);
                            break;
                        case 5:
                            aVar = (q9.a) e0.g(parcel, readInt3, q9.a.CREATOR);
                            break;
                        case 6:
                            str7 = e0.h(parcel, readInt3);
                            break;
                        case 7:
                            bundle = e0.a(parcel, readInt3);
                            break;
                        default:
                            e0.y(parcel, readInt3);
                            break;
                    }
                }
                e0.m(parcel, z14);
                return new q9.b(str3, str4, str5, str6, aVar, str7, bundle);
            case 3:
                int z15 = e0.z(parcel);
                int i13 = 0;
                boolean z16 = false;
                boolean z17 = false;
                String str8 = null;
                String str9 = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i13 = e0.u(parcel, readInt4);
                            break;
                        case 2:
                            z16 = e0.n(parcel, readInt4);
                            break;
                        case 3:
                            str8 = e0.h(parcel, readInt4);
                            break;
                        case 4:
                            str9 = e0.h(parcel, readInt4);
                            break;
                        case 5:
                            bArr = e0.b(parcel, readInt4);
                            break;
                        case 6:
                            z17 = e0.n(parcel, readInt4);
                            break;
                        default:
                            e0.y(parcel, readInt4);
                            break;
                    }
                }
                e0.m(parcel, z15);
                return new q9.a(i13, z16, str8, str9, bArr, z17);
            case 4:
                int z18 = e0.z(parcel);
                boolean z19 = false;
                int i14 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 1) {
                        z19 = e0.n(parcel, readInt5);
                    } else if (c10 != 2) {
                        e0.y(parcel, readInt5);
                    } else {
                        i14 = e0.u(parcel, readInt5);
                    }
                }
                e0.m(parcel, z18);
                return new r6.a(i14, z19);
            case 5:
                int z20 = e0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z20) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        e0.y(parcel, readInt6);
                    } else {
                        pendingIntent = (PendingIntent) e0.g(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                e0.m(parcel, z20);
                return new r6.b(pendingIntent);
            case 6:
                int z21 = e0.z(parcel);
                int i15 = 0;
                boolean z22 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 1) {
                        i15 = e0.u(parcel, readInt7);
                    } else if (c11 != 2) {
                        e0.y(parcel, readInt7);
                    } else {
                        z22 = e0.n(parcel, readInt7);
                    }
                }
                e0.m(parcel, z21);
                return new r6.c(i15, z22);
            case 7:
                int z23 = e0.z(parcel);
                int i16 = 0;
                String[] strArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        i16 = e0.u(parcel, readInt8);
                    } else if (c12 != 3) {
                        e0.y(parcel, readInt8);
                    } else {
                        strArr = e0.i(parcel, readInt8);
                    }
                }
                e0.m(parcel, z23);
                r8.a aVar2 = new r8.a();
                aVar2.a = i16;
                aVar2.b = strArr;
                return aVar2;
            case 8:
                int z24 = e0.z(parcel);
                int i17 = 0;
                boolean z25 = false;
                String str10 = null;
                String str11 = null;
                Point[] pointArr = null;
                r8.f fVar2 = null;
                r8.i iVar = null;
                r8.j jVar = null;
                r8.l lVar = null;
                r8.k kVar = null;
                r8.g gVar = null;
                byte[] bArr2 = null;
                r8.d dVar = null;
                r8.c cVar = null;
                r8.e eVar2 = null;
                int i18 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt9 = parcel.readInt();
                    r8.g gVar2 = gVar;
                    switch ((char) readInt9) {
                        case 2:
                            i17 = e0.u(parcel, readInt9);
                            break;
                        case 3:
                            str10 = e0.h(parcel, readInt9);
                            break;
                        case 4:
                            str11 = e0.h(parcel, readInt9);
                            break;
                        case 5:
                            i18 = e0.u(parcel, readInt9);
                            break;
                        case 6:
                            pointArr = (Point[]) e0.k(parcel, readInt9, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (r8.f) e0.g(parcel, readInt9, r8.f.CREATOR);
                            break;
                        case '\b':
                            iVar = (r8.i) e0.g(parcel, readInt9, r8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (r8.j) e0.g(parcel, readInt9, r8.j.CREATOR);
                            break;
                        case '\n':
                            lVar = (r8.l) e0.g(parcel, readInt9, r8.l.CREATOR);
                            break;
                        case 11:
                            kVar = (r8.k) e0.g(parcel, readInt9, r8.k.CREATOR);
                            break;
                        case '\f':
                            gVar = (r8.g) e0.g(parcel, readInt9, r8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (r8.c) e0.g(parcel, readInt9, r8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (r8.d) e0.g(parcel, readInt9, r8.d.CREATOR);
                            break;
                        case 15:
                            eVar2 = (r8.e) e0.g(parcel, readInt9, r8.e.CREATOR);
                            break;
                        case 16:
                            bArr2 = e0.b(parcel, readInt9);
                            break;
                        case 17:
                            z25 = e0.n(parcel, readInt9);
                            break;
                        default:
                            e0.y(parcel, readInt9);
                            break;
                    }
                    gVar = gVar2;
                }
                e0.m(parcel, z24);
                r8.m mVar = new r8.m();
                mVar.a = i17;
                mVar.b = str10;
                mVar.E = bArr2;
                mVar.c = str11;
                mVar.d = i18;
                mVar.e = pointArr;
                mVar.F = z25;
                mVar.f = fVar2;
                mVar.h = iVar;
                mVar.n = jVar;
                mVar.r = lVar;
                mVar.s = kVar;
                mVar.v = gVar;
                mVar.w = cVar;
                mVar.x = dVar;
                mVar.y = eVar2;
                return mVar;
            case 9:
                int z26 = e0.z(parcel);
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z27 = false;
                String str12 = null;
                int i24 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i19 = e0.u(parcel, readInt10);
                            break;
                        case 3:
                            i24 = e0.u(parcel, readInt10);
                            break;
                        case 4:
                            i20 = e0.u(parcel, readInt10);
                            break;
                        case 5:
                            i21 = e0.u(parcel, readInt10);
                            break;
                        case 6:
                            i22 = e0.u(parcel, readInt10);
                            break;
                        case 7:
                            i23 = e0.u(parcel, readInt10);
                            break;
                        case '\b':
                            z27 = e0.n(parcel, readInt10);
                            break;
                        case '\t':
                            str12 = e0.h(parcel, readInt10);
                            break;
                        default:
                            e0.y(parcel, readInt10);
                            break;
                    }
                }
                e0.m(parcel, z26);
                r8.b bVar = new r8.b();
                bVar.a = i19;
                bVar.b = i24;
                bVar.c = i20;
                bVar.d = i21;
                bVar.e = i22;
                bVar.f = i23;
                bVar.h = z27;
                bVar.n = str12;
                return bVar;
            case 10:
                int z28 = e0.z(parcel);
                r8.h hVar = null;
                String str13 = null;
                String str14 = null;
                r8.i[] iVarArr = null;
                r8.f[] fVarArr = null;
                String[] strArr2 = null;
                r8.a[] aVarArr = null;
                while (parcel.dataPosition() < z28) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            hVar = (r8.h) e0.g(parcel, readInt11, r8.h.CREATOR);
                            break;
                        case 3:
                            str13 = e0.h(parcel, readInt11);
                            break;
                        case 4:
                            str14 = e0.h(parcel, readInt11);
                            break;
                        case 5:
                            iVarArr = (r8.i[]) e0.k(parcel, readInt11, r8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (r8.f[]) e0.k(parcel, readInt11, r8.f.CREATOR);
                            break;
                        case 7:
                            strArr2 = e0.i(parcel, readInt11);
                            break;
                        case '\b':
                            aVarArr = (r8.a[]) e0.k(parcel, readInt11, r8.a.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt11);
                            break;
                    }
                }
                e0.m(parcel, z28);
                r8.d dVar2 = new r8.d();
                dVar2.a = hVar;
                dVar2.b = str13;
                dVar2.c = str14;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr2;
                dVar2.h = aVarArr;
                return dVar2;
            case 11:
                int z29 = e0.z(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                r8.b bVar2 = null;
                r8.b bVar3 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            str15 = e0.h(parcel, readInt12);
                            break;
                        case 3:
                            str16 = e0.h(parcel, readInt12);
                            break;
                        case 4:
                            str17 = e0.h(parcel, readInt12);
                            break;
                        case 5:
                            str18 = e0.h(parcel, readInt12);
                            break;
                        case 6:
                            str19 = e0.h(parcel, readInt12);
                            break;
                        case 7:
                            bVar2 = (r8.b) e0.g(parcel, readInt12, r8.b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (r8.b) e0.g(parcel, readInt12, r8.b.CREATOR);
                            break;
                        default:
                            e0.y(parcel, readInt12);
                            break;
                    }
                }
                e0.m(parcel, z29);
                r8.c cVar2 = new r8.c();
                cVar2.a = str15;
                cVar2.b = str16;
                cVar2.c = str17;
                cVar2.d = str18;
                cVar2.e = str19;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 12:
                int z30 = e0.z(parcel);
                int i25 = 0;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt13 = parcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 == 2) {
                        i25 = e0.u(parcel, readInt13);
                    } else if (c13 == 3) {
                        str20 = e0.h(parcel, readInt13);
                    } else if (c13 == 4) {
                        str21 = e0.h(parcel, readInt13);
                    } else if (c13 != 5) {
                        e0.y(parcel, readInt13);
                    } else {
                        str22 = e0.h(parcel, readInt13);
                    }
                }
                e0.m(parcel, z30);
                r8.f fVar3 = new r8.f();
                fVar3.a = i25;
                fVar3.b = str20;
                fVar3.c = str21;
                fVar3.d = str22;
                return fVar3;
            case 13:
                int z31 = e0.z(parcel);
                String str23 = null;
                String str24 = null;
                String str25 = null;
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
                String str36 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt14 = parcel.readInt();
                    String str37 = str35;
                    switch ((char) readInt14) {
                        case 2:
                            str23 = e0.h(parcel, readInt14);
                            break;
                        case 3:
                            str24 = e0.h(parcel, readInt14);
                            break;
                        case 4:
                            str25 = e0.h(parcel, readInt14);
                            break;
                        case 5:
                            str26 = e0.h(parcel, readInt14);
                            break;
                        case 6:
                            str27 = e0.h(parcel, readInt14);
                            break;
                        case 7:
                            str28 = e0.h(parcel, readInt14);
                            break;
                        case '\b':
                            str29 = e0.h(parcel, readInt14);
                            break;
                        case '\t':
                            str30 = e0.h(parcel, readInt14);
                            break;
                        case '\n':
                            str31 = e0.h(parcel, readInt14);
                            break;
                        case 11:
                            str32 = e0.h(parcel, readInt14);
                            break;
                        case '\f':
                            str33 = e0.h(parcel, readInt14);
                            break;
                        case '\r':
                            str34 = e0.h(parcel, readInt14);
                            break;
                        case 14:
                            str35 = e0.h(parcel, readInt14);
                            continue;
                        case 15:
                            str36 = e0.h(parcel, readInt14);
                            break;
                        default:
                            e0.y(parcel, readInt14);
                            break;
                    }
                    str35 = str37;
                }
                e0.m(parcel, z31);
                r8.e eVar3 = new r8.e();
                eVar3.a = str23;
                eVar3.b = str24;
                eVar3.c = str25;
                eVar3.d = str26;
                eVar3.e = str27;
                eVar3.f = str28;
                eVar3.h = str29;
                eVar3.n = str30;
                eVar3.r = str31;
                eVar3.s = str32;
                eVar3.v = str33;
                eVar3.w = str34;
                eVar3.x = str35;
                eVar3.y = str36;
                return eVar3;
            case 14:
                int z32 = e0.z(parcel);
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str38 = e0.h(parcel, readInt15);
                            break;
                        case 3:
                            str39 = e0.h(parcel, readInt15);
                            break;
                        case 4:
                            str40 = e0.h(parcel, readInt15);
                            break;
                        case 5:
                            str41 = e0.h(parcel, readInt15);
                            break;
                        case 6:
                            str42 = e0.h(parcel, readInt15);
                            break;
                        case 7:
                            str43 = e0.h(parcel, readInt15);
                            break;
                        case '\b':
                            str44 = e0.h(parcel, readInt15);
                            break;
                        default:
                            e0.y(parcel, readInt15);
                            break;
                    }
                }
                e0.m(parcel, z32);
                r8.h hVar2 = new r8.h();
                hVar2.a = str38;
                hVar2.b = str39;
                hVar2.c = str40;
                hVar2.d = str41;
                hVar2.e = str42;
                hVar2.f = str43;
                hVar2.h = str44;
                return hVar2;
            case 15:
                int z33 = e0.z(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z33) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 2) {
                        d = e0.q(parcel, readInt16);
                    } else if (c14 != 3) {
                        e0.y(parcel, readInt16);
                    } else {
                        d10 = e0.q(parcel, readInt16);
                    }
                }
                e0.m(parcel, z33);
                r8.g gVar3 = new r8.g();
                gVar3.a = d;
                gVar3.b = d10;
                return gVar3;
            case 16:
                int z34 = e0.z(parcel);
                String str45 = null;
                String str46 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 2) {
                        str45 = e0.h(parcel, readInt17);
                    } else if (c15 != 3) {
                        e0.y(parcel, readInt17);
                    } else {
                        str46 = e0.h(parcel, readInt17);
                    }
                }
                e0.m(parcel, z34);
                r8.j jVar2 = new r8.j();
                jVar2.a = str45;
                jVar2.b = str46;
                return jVar2;
            case 17:
                int z35 = e0.z(parcel);
                int i26 = 0;
                String str47 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c16 = (char) readInt18;
                    if (c16 == 2) {
                        i26 = e0.u(parcel, readInt18);
                    } else if (c16 != 3) {
                        e0.y(parcel, readInt18);
                    } else {
                        str47 = e0.h(parcel, readInt18);
                    }
                }
                e0.m(parcel, z35);
                r8.i iVar2 = new r8.i();
                iVar2.a = i26;
                iVar2.b = str47;
                return iVar2;
            case 18:
                int z36 = e0.z(parcel);
                String str48 = null;
                int i27 = 0;
                String str49 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    char c17 = (char) readInt19;
                    if (c17 == 2) {
                        str48 = e0.h(parcel, readInt19);
                    } else if (c17 == 3) {
                        str49 = e0.h(parcel, readInt19);
                    } else if (c17 != 4) {
                        e0.y(parcel, readInt19);
                    } else {
                        i27 = e0.u(parcel, readInt19);
                    }
                }
                e0.m(parcel, z36);
                r8.l lVar2 = new r8.l();
                lVar2.a = str48;
                lVar2.b = str49;
                lVar2.c = i27;
                return lVar2;
            case 19:
                int z37 = e0.z(parcel);
                String str50 = null;
                String str51 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 2) {
                        str50 = e0.h(parcel, readInt20);
                    } else if (c18 != 3) {
                        e0.y(parcel, readInt20);
                    } else {
                        str51 = e0.h(parcel, readInt20);
                    }
                }
                e0.m(parcel, z37);
                r8.k kVar2 = new r8.k();
                kVar2.a = str50;
                kVar2.b = str51;
                return kVar2;
            case 20:
                a0 a0Var = new a0();
                a0Var.a = parcel.readInt();
                a0Var.b = parcel.readInt();
                a0Var.c = parcel.readInt() == 1;
                return a0Var;
            case 21:
                u0.h hVar3 = new u0.h(parcel);
                hVar3.a = parcel.readInt();
                return hVar3;
            case 22:
                int z38 = e0.z(parcel);
                PointF[] pointFArr = null;
                int i28 = 0;
                while (parcel.dataPosition() < z38) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 2) {
                        pointFArr = (PointF[]) e0.k(parcel, readInt21, PointF.CREATOR);
                    } else if (c19 != 3) {
                        e0.y(parcel, readInt21);
                    } else {
                        i28 = e0.u(parcel, readInt21);
                    }
                }
                e0.m(parcel, z38);
                return new u8.a(pointFArr, i28);
            case 23:
                int z39 = e0.z(parcel);
                int i29 = 0;
                int i30 = 0;
                float f7 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                float f16 = Float.MAX_VALUE;
                float f17 = Float.MAX_VALUE;
                float f18 = Float.MAX_VALUE;
                LandmarkParcel[] landmarkParcelArr = null;
                u8.a[] aVarArr2 = null;
                float f19 = -1.0f;
                while (parcel.dataPosition() < z39) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i29 = e0.u(parcel, readInt22);
                            break;
                        case 2:
                            i30 = e0.u(parcel, readInt22);
                            break;
                        case 3:
                            f7 = e0.r(parcel, readInt22);
                            break;
                        case 4:
                            f10 = e0.r(parcel, readInt22);
                            break;
                        case 5:
                            f11 = e0.r(parcel, readInt22);
                            break;
                        case 6:
                            f12 = e0.r(parcel, readInt22);
                            break;
                        case 7:
                            f16 = e0.r(parcel, readInt22);
                            break;
                        case '\b':
                            f17 = e0.r(parcel, readInt22);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) e0.k(parcel, readInt22, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f13 = e0.r(parcel, readInt22);
                            break;
                        case 11:
                            f14 = e0.r(parcel, readInt22);
                            break;
                        case '\f':
                            f15 = e0.r(parcel, readInt22);
                            break;
                        case '\r':
                            aVarArr2 = (u8.a[]) e0.k(parcel, readInt22, u8.a.CREATOR);
                            break;
                        case 14:
                            f18 = e0.r(parcel, readInt22);
                            break;
                        case 15:
                            f19 = e0.r(parcel, readInt22);
                            break;
                        default:
                            e0.y(parcel, readInt22);
                            break;
                    }
                }
                e0.m(parcel, z39);
                return new FaceParcel(i29, i30, f7, f10, f11, f12, f16, f17, f18, landmarkParcelArr, f13, f14, f15, aVarArr2, f19);
            case 24:
                int z40 = e0.z(parcel);
                int i31 = 0;
                int i32 = 0;
                boolean z41 = false;
                boolean z42 = false;
                float f20 = -1.0f;
                int i33 = 0;
                while (parcel.dataPosition() < z40) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            i31 = e0.u(parcel, readInt23);
                            break;
                        case 3:
                            i33 = e0.u(parcel, readInt23);
                            break;
                        case 4:
                            i32 = e0.u(parcel, readInt23);
                            break;
                        case 5:
                            z41 = e0.n(parcel, readInt23);
                            break;
                        case 6:
                            z42 = e0.n(parcel, readInt23);
                            break;
                        case 7:
                            f20 = e0.r(parcel, readInt23);
                            break;
                        default:
                            e0.y(parcel, readInt23);
                            break;
                    }
                }
                e0.m(parcel, z40);
                u8.b bVar4 = new u8.b();
                bVar4.a = i31;
                bVar4.b = i33;
                bVar4.c = i32;
                bVar4.d = z41;
                bVar4.e = z42;
                bVar4.f = f20;
                return bVar4;
            case 25:
                int z43 = e0.z(parcel);
                int i34 = 0;
                float f21 = 0.0f;
                float f22 = 0.0f;
                int i35 = 0;
                while (parcel.dataPosition() < z43) {
                    int readInt24 = parcel.readInt();
                    char c20 = (char) readInt24;
                    if (c20 == 1) {
                        i34 = e0.u(parcel, readInt24);
                    } else if (c20 == 2) {
                        f21 = e0.r(parcel, readInt24);
                    } else if (c20 == 3) {
                        f22 = e0.r(parcel, readInt24);
                    } else if (c20 != 4) {
                        e0.y(parcel, readInt24);
                    } else {
                        i35 = e0.u(parcel, readInt24);
                    }
                }
                e0.m(parcel, z43);
                return new LandmarkParcel(i34, f21, f22, i35);
            case 26:
                int z44 = e0.z(parcel);
                String str52 = null;
                v8.b bVar5 = null;
                UserAddress userAddress = null;
                v8.k kVar3 = null;
                String str53 = null;
                Bundle bundle2 = null;
                String str54 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str52 = e0.h(parcel, readInt25);
                            break;
                        case 2:
                            bVar5 = (v8.b) e0.g(parcel, readInt25, v8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) e0.g(parcel, readInt25, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar3 = (v8.k) e0.g(parcel, readInt25, v8.k.CREATOR);
                            break;
                        case 5:
                            str53 = e0.h(parcel, readInt25);
                            break;
                        case 6:
                            bundle2 = e0.a(parcel, readInt25);
                            break;
                        case 7:
                            str54 = e0.h(parcel, readInt25);
                            break;
                        case '\b':
                            bundle3 = e0.a(parcel, readInt25);
                            break;
                        default:
                            e0.y(parcel, readInt25);
                            break;
                    }
                }
                e0.m(parcel, z44);
                v8.i iVar3 = new v8.i();
                iVar3.a = str52;
                iVar3.b = bVar5;
                iVar3.c = userAddress;
                iVar3.d = kVar3;
                iVar3.e = str53;
                iVar3.f = bundle2;
                iVar3.h = str54;
                iVar3.n = bundle3;
                return iVar3;
            case 27:
                int z45 = e0.z(parcel);
                boolean z46 = false;
                v8.c cVar3 = null;
                v8.m mVar2 = null;
                ArrayList arrayList = null;
                v8.l lVar3 = null;
                v8.n nVar = null;
                String str55 = null;
                Bundle bundle4 = null;
                boolean z47 = true;
                boolean z48 = false;
                boolean z49 = false;
                while (parcel.dataPosition() < z45) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            z46 = e0.n(parcel, readInt26);
                            break;
                        case 2:
                            z48 = e0.n(parcel, readInt26);
                            break;
                        case 3:
                            cVar3 = (v8.c) e0.g(parcel, readInt26, v8.c.CREATOR);
                            break;
                        case 4:
                            z49 = e0.n(parcel, readInt26);
                            break;
                        case 5:
                            mVar2 = (v8.m) e0.g(parcel, readInt26, v8.m.CREATOR);
                            break;
                        case 6:
                            arrayList = e0.e(parcel, readInt26);
                            break;
                        case 7:
                            lVar3 = (v8.l) e0.g(parcel, readInt26, v8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (v8.n) e0.g(parcel, readInt26, v8.n.CREATOR);
                            break;
                        case '\t':
                            z47 = e0.n(parcel, readInt26);
                            break;
                        case '\n':
                            str55 = e0.h(parcel, readInt26);
                            break;
                        case 11:
                            bundle4 = e0.a(parcel, readInt26);
                            break;
                        default:
                            e0.y(parcel, readInt26);
                            break;
                    }
                }
                e0.m(parcel, z45);
                v8.j jVar3 = new v8.j();
                jVar3.a = z46;
                jVar3.b = z48;
                jVar3.c = cVar3;
                jVar3.d = z49;
                jVar3.e = mVar2;
                jVar3.f = arrayList;
                jVar3.h = lVar3;
                jVar3.n = nVar;
                jVar3.r = z47;
                jVar3.s = str55;
                jVar3.v = bundle4;
                return jVar3;
            case 28:
                int z50 = e0.z(parcel);
                int i36 = 0;
                String str56 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt27 = parcel.readInt();
                    char c21 = (char) readInt27;
                    if (c21 == 2) {
                        i36 = e0.u(parcel, readInt27);
                    } else if (c21 != 3) {
                        e0.y(parcel, readInt27);
                    } else {
                        str56 = e0.h(parcel, readInt27);
                    }
                }
                e0.m(parcel, z50);
                v8.k kVar4 = new v8.k();
                kVar4.a = i36;
                kVar4.b = str56;
                return kVar4;
            default:
                int z51 = e0.z(parcel);
                int i37 = 0;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt28 = parcel.readInt();
                    char c22 = (char) readInt28;
                    if (c22 == 2) {
                        i37 = e0.u(parcel, readInt28);
                    } else if (c22 != 3) {
                        e0.y(parcel, readInt28);
                    } else {
                        bundle5 = e0.a(parcel, readInt28);
                    }
                }
                e0.m(parcel, z51);
                v8.l lVar4 = new v8.l();
                new Bundle();
                lVar4.a = i37;
                lVar4.b = bundle5;
                return lVar4;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new l[i10];
            case 1:
                return new n[i10];
            case 2:
                return new q9.b[i10];
            case 3:
                return new q9.a[i10];
            case 4:
                return new r6.a[i10];
            case 5:
                return new r6.b[i10];
            case 6:
                return new r6.c[i10];
            case 7:
                return new r8.a[i10];
            case 8:
                return new r8.m[i10];
            case 9:
                return new r8.b[i10];
            case 10:
                return new r8.d[i10];
            case 11:
                return new r8.c[i10];
            case 12:
                return new r8.f[i10];
            case 13:
                return new r8.e[i10];
            case 14:
                return new r8.h[i10];
            case 15:
                return new r8.g[i10];
            case 16:
                return new r8.j[i10];
            case 17:
                return new r8.i[i10];
            case 18:
                return new r8.l[i10];
            case 19:
                return new r8.k[i10];
            case 20:
                return new a0[i10];
            case 21:
                return new u0.h[i10];
            case 22:
                return new u8.a[i10];
            case 23:
                return new FaceParcel[i10];
            case 24:
                return new u8.b[i10];
            case 25:
                return new LandmarkParcel[i10];
            case 26:
                return new v8.i[i10];
            case 27:
                return new v8.j[i10];
            case 28:
                return new v8.k[i10];
            default:
                return new v8.l[i10];
        }
    }
}
