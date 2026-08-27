package r6;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h7.q8;
import java.util.ArrayList;
import java.util.List;
import n2.b0;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        q8.y(parcel, readInt);
                    } else {
                        bundle = q8.a(parcel, readInt);
                    }
                }
                q8.m(parcel, z10);
                return new k(bundle);
            case 1:
                int z11 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        q8.y(parcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, z11);
                return new m(pendingIntent);
            case 2:
                int z12 = q8.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        q8.y(parcel, readInt3);
                    } else {
                        pendingIntent2 = (PendingIntent) q8.g(parcel, readInt3, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, z12);
                return new n(pendingIntent2);
            case 3:
                int z13 = q8.z(parcel);
                while (parcel.dataPosition() < z13) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z13);
                return new o();
            case 4:
                int z14 = q8.z(parcel);
                while (parcel.dataPosition() < z14) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z14);
                return new p();
            case 5:
                int z15 = q8.z(parcel);
                while (parcel.dataPosition() < z15) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z15);
                return new q();
            case 6:
                int z16 = q8.z(parcel);
                while (parcel.dataPosition() < z16) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z16);
                return new r();
            case 7:
                int z17 = q8.z(parcel);
                Status status = null;
                r7.h hVar = null;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        status = (Status) q8.g(parcel, readInt4, Status.CREATOR);
                    } else if (c10 != 2) {
                        q8.y(parcel, readInt4);
                    } else {
                        hVar = (r7.h) q8.g(parcel, readInt4, r7.h.CREATOR);
                    }
                }
                q8.m(parcel, z17);
                return new r7.g(status, hVar);
            case 8:
                int z18 = q8.z(parcel);
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z19 = q8.n(parcel, readInt5);
                            break;
                        case 2:
                            z20 = q8.n(parcel, readInt5);
                            break;
                        case 3:
                            z21 = q8.n(parcel, readInt5);
                            break;
                        case 4:
                            z22 = q8.n(parcel, readInt5);
                            break;
                        case 5:
                            z23 = q8.n(parcel, readInt5);
                            break;
                        case 6:
                            z24 = q8.n(parcel, readInt5);
                            break;
                        default:
                            q8.y(parcel, readInt5);
                            break;
                    }
                }
                q8.m(parcel, z18);
                return new r7.h(z19, z20, z21, z22, z23, z24);
            case 9:
                int z25 = q8.z(parcel);
                long j10 = -1;
                long j11 = -1;
                int i10 = 1;
                int i11 = 1;
                while (parcel.dataPosition() < z25) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        i10 = q8.u(parcel, readInt6);
                    } else if (c11 == 2) {
                        i11 = q8.u(parcel, readInt6);
                    } else if (c11 == 3) {
                        j10 = q8.w(parcel, readInt6);
                    } else if (c11 != 4) {
                        q8.y(parcel, readInt6);
                    } else {
                        j11 = q8.w(parcel, readInt6);
                    }
                }
                q8.m(parcel, z25);
                return new r7.j(j10, i10, i11, j11);
            case 10:
                int z26 = q8.z(parcel);
                long j12 = Long.MAX_VALUE;
                String str = null;
                c7.k kVar = null;
                int i12 = 0;
                boolean z27 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        j12 = q8.w(parcel, readInt7);
                    } else if (c12 == 2) {
                        i12 = q8.u(parcel, readInt7);
                    } else if (c12 == 3) {
                        z27 = q8.n(parcel, readInt7);
                    } else if (c12 == 4) {
                        str = q8.h(parcel, readInt7);
                    } else if (c12 != 5) {
                        q8.y(parcel, readInt7);
                    } else {
                        kVar = (c7.k) q8.g(parcel, readInt7, c7.k.CREATOR);
                    }
                }
                q8.m(parcel, z26);
                return new r7.b(j12, i12, z27, str, kVar);
            case 11:
                int z28 = q8.z(parcel);
                long j13 = 0;
                r7.j[] jVarArr = null;
                int i13 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                int i14 = 1;
                int i15 = 1;
                while (parcel.dataPosition() < z28) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i14 = q8.u(parcel, readInt8);
                            break;
                        case 2:
                            i15 = q8.u(parcel, readInt8);
                            break;
                        case 3:
                            j13 = q8.w(parcel, readInt8);
                            break;
                        case 4:
                            i13 = q8.u(parcel, readInt8);
                            break;
                        case 5:
                            jVarArr = (r7.j[]) q8.k(parcel, readInt8, r7.j.CREATOR);
                            break;
                        case 6:
                            q8.n(parcel, readInt8);
                            break;
                        default:
                            q8.y(parcel, readInt8);
                            break;
                    }
                }
                q8.m(parcel, z28);
                return new LocationAvailability(i13, i14, i15, j13, jVarArr);
            case 12:
                int z29 = q8.z(parcel);
                WorkSource workSource = new WorkSource();
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                long j19 = -1;
                String str2 = null;
                c7.k kVar2 = null;
                int i16 = 102;
                int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                float f10 = 0.0f;
                boolean z30 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z31 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i16 = q8.u(parcel, readInt9);
                            break;
                        case 2:
                            j14 = q8.w(parcel, readInt9);
                            break;
                        case 3:
                            j15 = q8.w(parcel, readInt9);
                            break;
                        case 4:
                        default:
                            q8.y(parcel, readInt9);
                            break;
                        case 5:
                            j17 = q8.w(parcel, readInt9);
                            break;
                        case 6:
                            i17 = q8.u(parcel, readInt9);
                            break;
                        case 7:
                            f10 = q8.r(parcel, readInt9);
                            break;
                        case '\b':
                            j16 = q8.w(parcel, readInt9);
                            break;
                        case '\t':
                            z30 = q8.n(parcel, readInt9);
                            break;
                        case '\n':
                            j18 = q8.w(parcel, readInt9);
                            break;
                        case 11:
                            j19 = q8.w(parcel, readInt9);
                            break;
                        case '\f':
                            i18 = q8.u(parcel, readInt9);
                            break;
                        case '\r':
                            i19 = q8.u(parcel, readInt9);
                            break;
                        case 14:
                            str2 = q8.h(parcel, readInt9);
                            break;
                        case 15:
                            z31 = q8.n(parcel, readInt9);
                            break;
                        case 16:
                            workSource = (WorkSource) q8.g(parcel, readInt9, WorkSource.CREATOR);
                            break;
                        case 17:
                            kVar2 = (c7.k) q8.g(parcel, readInt9, c7.k.CREATOR);
                            break;
                    }
                }
                q8.m(parcel, z29);
                return new LocationRequest(i16, j14, j15, j16, j17, j18, i17, f10, z30, j19, i18, i19, str2, z31, workSource, kVar2);
            case 13:
                int z32 = q8.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z32) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        q8.y(parcel, readInt10);
                    } else {
                        list = q8.l(parcel, readInt10, Location.CREATOR);
                    }
                }
                q8.m(parcel, z32);
                return new LocationResult(list);
            case 14:
                int z33 = q8.z(parcel);
                ArrayList arrayList = null;
                boolean z34 = false;
                boolean z35 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 == 1) {
                        arrayList = q8.l(parcel, readInt11, LocationRequest.CREATOR);
                    } else if (c13 == 2) {
                        z34 = q8.n(parcel, readInt11);
                    } else if (c13 != 3) {
                        q8.y(parcel, readInt11);
                    } else {
                        z35 = q8.n(parcel, readInt11);
                    }
                }
                q8.m(parcel, z33);
                return new r7.e(arrayList, z34, z35);
            case 15:
                int z36 = q8.z(parcel);
                long j20 = 0;
                long j21 = 0;
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 1) {
                        z37 = q8.n(parcel, readInt12);
                    } else if (c14 == 2) {
                        j21 = q8.w(parcel, readInt12);
                    } else if (c14 != 3) {
                        q8.y(parcel, readInt12);
                    } else {
                        j20 = q8.w(parcel, readInt12);
                    }
                }
                q8.m(parcel, z36);
                return new t5.b(j20, j21, z37);
            case 16:
                int z38 = q8.z(parcel);
                e2 e2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                v7.a[] aVarArr = null;
                boolean z39 = true;
                while (parcel.dataPosition() < z38) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            e2Var = (e2) q8.g(parcel, readInt13, e2.CREATOR);
                            break;
                        case 3:
                            bArr = q8.b(parcel, readInt13);
                            break;
                        case 4:
                            iArr = q8.d(parcel, readInt13);
                            break;
                        case 5:
                            strArr = q8.i(parcel, readInt13);
                            break;
                        case 6:
                            iArr2 = q8.d(parcel, readInt13);
                            break;
                        case 7:
                            bArr2 = q8.c(parcel, readInt13);
                            break;
                        case '\b':
                            z39 = q8.n(parcel, readInt13);
                            break;
                        case '\t':
                            aVarArr = (v7.a[]) q8.k(parcel, readInt13, v7.a.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt13);
                            break;
                    }
                }
                q8.m(parcel, z38);
                return new t5.c(e2Var, bArr, iArr, strArr, iArr2, bArr2, z39, aVarArr);
            case 17:
                u0.h hVar2 = new u0.h(parcel);
                hVar2.a = parcel.readInt();
                return hVar2;
            case 18:
                int z40 = q8.z(parcel);
                LatLng latLng = null;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (parcel.dataPosition() < z40) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 2) {
                        latLng = (LatLng) q8.g(parcel, readInt14, LatLng.CREATOR);
                    } else if (c15 == 3) {
                        f11 = q8.r(parcel, readInt14);
                    } else if (c15 == 4) {
                        f12 = q8.r(parcel, readInt14);
                    } else if (c15 != 5) {
                        q8.y(parcel, readInt14);
                    } else {
                        f13 = q8.r(parcel, readInt14);
                    }
                }
                q8.m(parcel, z40);
                return new CameraPosition(latLng, f11, f12, f13);
            case 19:
                int z41 = q8.z(parcel);
                LatLng latLng2 = null;
                double d = 0.0d;
                float f14 = 0.0f;
                float f15 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z42 = false;
                boolean z43 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            latLng2 = (LatLng) q8.g(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 3:
                            d = q8.q(parcel, readInt15);
                            break;
                        case 4:
                            f14 = q8.r(parcel, readInt15);
                            break;
                        case 5:
                            i20 = q8.u(parcel, readInt15);
                            break;
                        case 6:
                            i21 = q8.u(parcel, readInt15);
                            break;
                        case 7:
                            f15 = q8.r(parcel, readInt15);
                            break;
                        case '\b':
                            z42 = q8.n(parcel, readInt15);
                            break;
                        case '\t':
                            z43 = q8.n(parcel, readInt15);
                            break;
                        case '\n':
                            arrayList2 = q8.l(parcel, readInt15, u7.h.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt15);
                            break;
                    }
                }
                q8.m(parcel, z41);
                u7.b bVar = new u7.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f15;
                bVar.h = z42;
                bVar.n = z43;
                bVar.r = arrayList2;
                return bVar;
            case 20:
                int z44 = q8.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 2) {
                        latLng3 = (LatLng) q8.g(parcel, readInt16, LatLng.CREATOR);
                    } else if (c16 != 3) {
                        q8.y(parcel, readInt16);
                    } else {
                        latLng4 = (LatLng) q8.g(parcel, readInt16, LatLng.CREATOR);
                    }
                }
                q8.m(parcel, z44);
                return new LatLngBounds(latLng3, latLng4);
            case 21:
                int z45 = q8.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z45) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        d10 = q8.q(parcel, readInt17);
                    } else if (c17 != 3) {
                        q8.y(parcel, readInt17);
                    } else {
                        d11 = q8.q(parcel, readInt17);
                    }
                }
                q8.m(parcel, z45);
                return new LatLng(d10, d11);
            case 22:
                int z46 = q8.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 2) {
                        q8.y(parcel, readInt18);
                    } else {
                        str3 = q8.h(parcel, readInt18);
                    }
                }
                q8.m(parcel, z46);
                return new u7.e(str3);
            case 23:
                int z47 = q8.z(parcel);
                LatLng latLng5 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder = null;
                float f16 = 0.0f;
                float f17 = 0.0f;
                boolean z48 = false;
                boolean z49 = false;
                boolean z50 = false;
                float f18 = 0.0f;
                float f19 = 0.5f;
                float f20 = 0.0f;
                float f21 = 1.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < z47) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            latLng5 = (LatLng) q8.g(parcel, readInt19, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = q8.h(parcel, readInt19);
                            break;
                        case 4:
                            str5 = q8.h(parcel, readInt19);
                            break;
                        case 5:
                            iBinder = q8.t(parcel, readInt19);
                            break;
                        case 6:
                            f16 = q8.r(parcel, readInt19);
                            break;
                        case 7:
                            f17 = q8.r(parcel, readInt19);
                            break;
                        case '\b':
                            z48 = q8.n(parcel, readInt19);
                            break;
                        case '\t':
                            z49 = q8.n(parcel, readInt19);
                            break;
                        case '\n':
                            z50 = q8.n(parcel, readInt19);
                            break;
                        case 11:
                            f18 = q8.r(parcel, readInt19);
                            break;
                        case '\f':
                            f19 = q8.r(parcel, readInt19);
                            break;
                        case '\r':
                            f20 = q8.r(parcel, readInt19);
                            break;
                        case 14:
                            f21 = q8.r(parcel, readInt19);
                            break;
                        case 15:
                            f22 = q8.r(parcel, readInt19);
                            break;
                        default:
                            q8.y(parcel, readInt19);
                            break;
                    }
                }
                q8.m(parcel, z47);
                u7.g gVar = new u7.g();
                gVar.e = 0.5f;
                gVar.f = 1.0f;
                gVar.n = true;
                gVar.r = false;
                gVar.s = 0.0f;
                gVar.v = 0.5f;
                gVar.w = 0.0f;
                gVar.x = 1.0f;
                gVar.a = latLng5;
                gVar.b = str4;
                gVar.c = str5;
                if (iBinder == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new b0(i6.b.J0(iBinder));
                }
                gVar.e = f16;
                gVar.f = f17;
                gVar.h = z48;
                gVar.n = z49;
                gVar.r = z50;
                gVar.s = f18;
                gVar.v = f19;
                gVar.w = f20;
                gVar.x = f21;
                gVar.y = f22;
                return gVar;
            case 24:
                int z51 = q8.z(parcel);
                int i22 = 0;
                Float f23 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 2) {
                        i22 = q8.u(parcel, readInt20);
                    } else if (c18 != 3) {
                        q8.y(parcel, readInt20);
                    } else {
                        f23 = q8.s(parcel, readInt20);
                    }
                }
                q8.m(parcel, z51);
                return new u7.h(i22, f23);
            case 25:
                int z52 = q8.z(parcel);
                PendingIntent pendingIntent3 = null;
                String str6 = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z52) {
                    int readInt21 = parcel.readInt();
                    char c19 = (char) readInt21;
                    if (c19 == 1) {
                        i23 = q8.u(parcel, readInt21);
                    } else if (c19 == 2) {
                        i24 = q8.u(parcel, readInt21);
                    } else if (c19 == 3) {
                        pendingIntent3 = (PendingIntent) q8.g(parcel, readInt21, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        q8.y(parcel, readInt21);
                    } else {
                        str6 = q8.h(parcel, readInt21);
                    }
                }
                q8.m(parcel, z52);
                return new v5.a(i23, i24, pendingIntent3, str6);
            case 26:
                int z53 = q8.z(parcel);
                long j22 = -1;
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt22 = parcel.readInt();
                    char c20 = (char) readInt22;
                    if (c20 == 1) {
                        str7 = q8.h(parcel, readInt22);
                    } else if (c20 == 2) {
                        i25 = q8.u(parcel, readInt22);
                    } else if (c20 != 3) {
                        q8.y(parcel, readInt22);
                    } else {
                        j22 = q8.w(parcel, readInt22);
                    }
                }
                q8.m(parcel, z53);
                return new v5.c(i25, str7, j22);
            case 27:
                int z54 = q8.z(parcel);
                String str8 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z54) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str8 = q8.h(parcel, readInt23);
                            break;
                        case 3:
                            bArr3 = q8.b(parcel, readInt23);
                            break;
                        case 4:
                            bArr4 = q8.c(parcel, readInt23);
                            break;
                        case 5:
                            bArr5 = q8.c(parcel, readInt23);
                            break;
                        case 6:
                            bArr6 = q8.c(parcel, readInt23);
                            break;
                        case 7:
                            bArr7 = q8.c(parcel, readInt23);
                            break;
                        case '\b':
                            iArr3 = q8.d(parcel, readInt23);
                            break;
                        case '\t':
                            bArr8 = q8.c(parcel, readInt23);
                            break;
                        default:
                            q8.y(parcel, readInt23);
                            break;
                    }
                }
                q8.m(parcel, z54);
                return new v7.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 28:
                int z55 = q8.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle2 = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z55) {
                    int readInt24 = parcel.readInt();
                    char c21 = (char) readInt24;
                    if (c21 == 1) {
                        strArr2 = q8.i(parcel, readInt24);
                    } else if (c21 == 2) {
                        cursorWindowArr = (CursorWindow[]) q8.k(parcel, readInt24, CursorWindow.CREATOR);
                    } else if (c21 == 3) {
                        i27 = q8.u(parcel, readInt24);
                    } else if (c21 == 4) {
                        bundle2 = q8.a(parcel, readInt24);
                    } else if (c21 != 1000) {
                        q8.y(parcel, readInt24);
                    } else {
                        i26 = q8.u(parcel, readInt24);
                    }
                }
                q8.m(parcel, z55);
                DataHolder dataHolder = new DataHolder(i26, strArr2, cursorWindowArr, i27, bundle2);
                dataHolder.c = new Bundle();
                int i28 = 0;
                while (true) {
                    String[] strArr3 = dataHolder.b;
                    if (i28 >= strArr3.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i29 = 0;
                        for (int i30 = 0; i30 < cursorWindowArr2.length; i30++) {
                            dataHolder.h[i30] = i29;
                            i29 += cursorWindowArr2[i30].getNumRows() - (i29 - cursorWindowArr2[i30].getStartPosition());
                        }
                        dataHolder.n = i29;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr3[i28], i28);
                    i28++;
                }
            default:
                int z56 = q8.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z56) {
                    int readInt25 = parcel.readInt();
                    char c22 = (char) readInt25;
                    if (c22 == 1) {
                        str9 = q8.h(parcel, readInt25);
                    } else if (c22 != 2) {
                        q8.y(parcel, readInt25);
                    } else {
                        str10 = q8.h(parcel, readInt25);
                    }
                }
                q8.m(parcel, z56);
                w7.a aVar = new w7.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new k[i10];
            case 1:
                return new m[i10];
            case 2:
                return new n[i10];
            case 3:
                return new o[i10];
            case 4:
                return new p[i10];
            case 5:
                return new q[i10];
            case 6:
                return new r[i10];
            case 7:
                return new r7.g[i10];
            case 8:
                return new r7.h[i10];
            case 9:
                return new r7.j[i10];
            case 10:
                return new r7.b[i10];
            case 11:
                return new LocationAvailability[i10];
            case 12:
                return new LocationRequest[i10];
            case 13:
                return new LocationResult[i10];
            case 14:
                return new r7.e[i10];
            case 15:
                return new t5.b[i10];
            case 16:
                return new t5.c[i10];
            case 17:
                return new u0.h[i10];
            case 18:
                return new CameraPosition[i10];
            case 19:
                return new u7.b[i10];
            case 20:
                return new LatLngBounds[i10];
            case 21:
                return new LatLng[i10];
            case 22:
                return new u7.e[i10];
            case 23:
                return new u7.g[i10];
            case 24:
                return new u7.h[i10];
            case 25:
                return new v5.a[i10];
            case 26:
                return new v5.c[i10];
            case 27:
                return new v7.a[i10];
            case 28:
                return new DataHolder[i10];
            default:
                return new w7.a[i10];
        }
    }
}
