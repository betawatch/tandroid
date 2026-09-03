package u6;

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
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = f5.z(parcel);
                while (parcel.dataPosition() < z4) {
                    f5.y(parcel, parcel.readInt());
                }
                f5.m(parcel, z4);
                return new o();
            case 1:
                int z10 = f5.z(parcel);
                while (parcel.dataPosition() < z10) {
                    f5.y(parcel, parcel.readInt());
                }
                f5.m(parcel, z10);
                return new q();
            case 2:
                int z11 = f5.z(parcel);
                while (parcel.dataPosition() < z11) {
                    f5.y(parcel, parcel.readInt());
                }
                f5.m(parcel, z11);
                return new r();
            case 3:
                int z12 = f5.z(parcel);
                Status status = null;
                u7.h hVar = null;
                while (parcel.dataPosition() < z12) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        status = (Status) f5.g(parcel, readInt, Status.CREATOR);
                    } else if (c3 != 2) {
                        f5.y(parcel, readInt);
                    } else {
                        hVar = (u7.h) f5.g(parcel, readInt, u7.h.CREATOR);
                    }
                }
                f5.m(parcel, z12);
                return new u7.g(status, hVar);
            case 4:
                int z13 = f5.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            z14 = f5.n(parcel, readInt2);
                            break;
                        case 2:
                            z15 = f5.n(parcel, readInt2);
                            break;
                        case 3:
                            z16 = f5.n(parcel, readInt2);
                            break;
                        case 4:
                            z17 = f5.n(parcel, readInt2);
                            break;
                        case 5:
                            z18 = f5.n(parcel, readInt2);
                            break;
                        case 6:
                            z19 = f5.n(parcel, readInt2);
                            break;
                        default:
                            f5.y(parcel, readInt2);
                            break;
                    }
                }
                f5.m(parcel, z13);
                return new u7.h(z14, z15, z16, z17, z18, z19);
            case 5:
                int z20 = f5.z(parcel);
                long j10 = -1;
                long j11 = -1;
                int i10 = 1;
                int i11 = 1;
                while (parcel.dataPosition() < z20) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i10 = f5.u(parcel, readInt3);
                    } else if (c10 == 2) {
                        i11 = f5.u(parcel, readInt3);
                    } else if (c10 == 3) {
                        j10 = f5.w(parcel, readInt3);
                    } else if (c10 != 4) {
                        f5.y(parcel, readInt3);
                    } else {
                        j11 = f5.w(parcel, readInt3);
                    }
                }
                f5.m(parcel, z20);
                return new u7.j(j10, i10, i11, j11);
            case 6:
                int z21 = f5.z(parcel);
                long j12 = Long.MAX_VALUE;
                String str = null;
                f7.k kVar = null;
                int i12 = 0;
                boolean z22 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        j12 = f5.w(parcel, readInt4);
                    } else if (c11 == 2) {
                        i12 = f5.u(parcel, readInt4);
                    } else if (c11 == 3) {
                        z22 = f5.n(parcel, readInt4);
                    } else if (c11 == 4) {
                        str = f5.h(parcel, readInt4);
                    } else if (c11 != 5) {
                        f5.y(parcel, readInt4);
                    } else {
                        kVar = (f7.k) f5.g(parcel, readInt4, f7.k.CREATOR);
                    }
                }
                f5.m(parcel, z21);
                return new u7.b(j12, i12, z22, str, kVar);
            case 7:
                int z23 = f5.z(parcel);
                long j13 = 0;
                u7.j[] jVarArr = null;
                int i13 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                int i14 = 1;
                int i15 = 1;
                while (parcel.dataPosition() < z23) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i14 = f5.u(parcel, readInt5);
                            break;
                        case 2:
                            i15 = f5.u(parcel, readInt5);
                            break;
                        case 3:
                            j13 = f5.w(parcel, readInt5);
                            break;
                        case 4:
                            i13 = f5.u(parcel, readInt5);
                            break;
                        case 5:
                            jVarArr = (u7.j[]) f5.k(parcel, readInt5, u7.j.CREATOR);
                            break;
                        case 6:
                            f5.n(parcel, readInt5);
                            break;
                        default:
                            f5.y(parcel, readInt5);
                            break;
                    }
                }
                f5.m(parcel, z23);
                return new LocationAvailability(i13, i14, i15, j13, jVarArr);
            case 8:
                int z24 = f5.z(parcel);
                WorkSource workSource = new WorkSource();
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                long j19 = -1;
                String str2 = null;
                f7.k kVar2 = null;
                int i16 = 102;
                int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                float f10 = 0.0f;
                boolean z25 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z26 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i16 = f5.u(parcel, readInt6);
                            break;
                        case 2:
                            j14 = f5.w(parcel, readInt6);
                            break;
                        case 3:
                            j15 = f5.w(parcel, readInt6);
                            break;
                        case 4:
                        default:
                            f5.y(parcel, readInt6);
                            break;
                        case 5:
                            j17 = f5.w(parcel, readInt6);
                            break;
                        case 6:
                            i17 = f5.u(parcel, readInt6);
                            break;
                        case 7:
                            f10 = f5.r(parcel, readInt6);
                            break;
                        case '\b':
                            j16 = f5.w(parcel, readInt6);
                            break;
                        case '\t':
                            z25 = f5.n(parcel, readInt6);
                            break;
                        case '\n':
                            j18 = f5.w(parcel, readInt6);
                            break;
                        case 11:
                            j19 = f5.w(parcel, readInt6);
                            break;
                        case '\f':
                            i18 = f5.u(parcel, readInt6);
                            break;
                        case '\r':
                            i19 = f5.u(parcel, readInt6);
                            break;
                        case 14:
                            str2 = f5.h(parcel, readInt6);
                            break;
                        case 15:
                            z26 = f5.n(parcel, readInt6);
                            break;
                        case 16:
                            workSource = (WorkSource) f5.g(parcel, readInt6, WorkSource.CREATOR);
                            break;
                        case 17:
                            kVar2 = (f7.k) f5.g(parcel, readInt6, f7.k.CREATOR);
                            break;
                    }
                }
                f5.m(parcel, z24);
                return new LocationRequest(i16, j14, j15, j16, j17, j18, i17, f10, z25, j19, i18, i19, str2, z26, workSource, kVar2);
            case 9:
                int z27 = f5.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z27) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        f5.y(parcel, readInt7);
                    } else {
                        list = f5.l(parcel, readInt7, Location.CREATOR);
                    }
                }
                f5.m(parcel, z27);
                return new LocationResult(list);
            case 10:
                int z28 = f5.z(parcel);
                ArrayList arrayList = null;
                boolean z29 = false;
                boolean z30 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        arrayList = f5.l(parcel, readInt8, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z29 = f5.n(parcel, readInt8);
                    } else if (c12 != 3) {
                        f5.y(parcel, readInt8);
                    } else {
                        z30 = f5.n(parcel, readInt8);
                    }
                }
                f5.m(parcel, z28);
                return new u7.e(arrayList, z29, z30);
            case 11:
                int z31 = f5.z(parcel);
                long j20 = 0;
                long j21 = 0;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 1) {
                        z32 = f5.n(parcel, readInt9);
                    } else if (c13 == 2) {
                        j21 = f5.w(parcel, readInt9);
                    } else if (c13 != 3) {
                        f5.y(parcel, readInt9);
                    } else {
                        j20 = f5.w(parcel, readInt9);
                    }
                }
                f5.m(parcel, z31);
                return new w5.b(j20, j21, z32);
            case 12:
                int z33 = f5.z(parcel);
                d2 d2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                y7.a[] aVarArr = null;
                boolean z34 = true;
                while (parcel.dataPosition() < z33) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            d2Var = (d2) f5.g(parcel, readInt10, d2.CREATOR);
                            break;
                        case 3:
                            bArr = f5.b(parcel, readInt10);
                            break;
                        case 4:
                            iArr = f5.d(parcel, readInt10);
                            break;
                        case 5:
                            strArr = f5.i(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = f5.d(parcel, readInt10);
                            break;
                        case 7:
                            bArr2 = f5.c(parcel, readInt10);
                            break;
                        case '\b':
                            z34 = f5.n(parcel, readInt10);
                            break;
                        case '\t':
                            aVarArr = (y7.a[]) f5.k(parcel, readInt10, y7.a.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt10);
                            break;
                    }
                }
                f5.m(parcel, z33);
                return new w5.c(d2Var, bArr, iArr, strArr, iArr2, bArr2, z34, aVarArr);
            case 13:
                int z35 = f5.z(parcel);
                LatLng latLng = null;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (parcel.dataPosition() < z35) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 2) {
                        latLng = (LatLng) f5.g(parcel, readInt11, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        f11 = f5.r(parcel, readInt11);
                    } else if (c14 == 4) {
                        f12 = f5.r(parcel, readInt11);
                    } else if (c14 != 5) {
                        f5.y(parcel, readInt11);
                    } else {
                        f13 = f5.r(parcel, readInt11);
                    }
                }
                f5.m(parcel, z35);
                return new CameraPosition(latLng, f11, f12, f13);
            case 14:
                int z36 = f5.z(parcel);
                LatLng latLng2 = null;
                double d = 0.0d;
                float f14 = 0.0f;
                float f15 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z37 = false;
                boolean z38 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            latLng2 = (LatLng) f5.g(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 3:
                            d = f5.q(parcel, readInt12);
                            break;
                        case 4:
                            f14 = f5.r(parcel, readInt12);
                            break;
                        case 5:
                            i20 = f5.u(parcel, readInt12);
                            break;
                        case 6:
                            i21 = f5.u(parcel, readInt12);
                            break;
                        case 7:
                            f15 = f5.r(parcel, readInt12);
                            break;
                        case '\b':
                            z37 = f5.n(parcel, readInt12);
                            break;
                        case '\t':
                            z38 = f5.n(parcel, readInt12);
                            break;
                        case '\n':
                            arrayList2 = f5.l(parcel, readInt12, x7.h.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt12);
                            break;
                    }
                }
                f5.m(parcel, z36);
                x7.b bVar = new x7.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f15;
                bVar.h = z37;
                bVar.n = z38;
                bVar.r = arrayList2;
                return bVar;
            case 15:
                int z39 = f5.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        latLng3 = (LatLng) f5.g(parcel, readInt13, LatLng.CREATOR);
                    } else if (c15 != 3) {
                        f5.y(parcel, readInt13);
                    } else {
                        latLng4 = (LatLng) f5.g(parcel, readInt13, LatLng.CREATOR);
                    }
                }
                f5.m(parcel, z39);
                return new LatLngBounds(latLng3, latLng4);
            case 16:
                int z40 = f5.z(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z40) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 2) {
                        d10 = f5.q(parcel, readInt14);
                    } else if (c16 != 3) {
                        f5.y(parcel, readInt14);
                    } else {
                        d11 = f5.q(parcel, readInt14);
                    }
                }
                f5.m(parcel, z40);
                return new LatLng(d10, d11);
            case 17:
                int z41 = f5.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        f5.y(parcel, readInt15);
                    } else {
                        str3 = f5.h(parcel, readInt15);
                    }
                }
                f5.m(parcel, z41);
                return new x7.e(str3);
            case 18:
                int z42 = f5.z(parcel);
                LatLng latLng5 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder = null;
                float f16 = 0.0f;
                float f17 = 0.0f;
                boolean z43 = false;
                boolean z44 = false;
                boolean z45 = false;
                float f18 = 0.0f;
                float f19 = 0.5f;
                float f20 = 0.0f;
                float f21 = 1.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < z42) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            latLng5 = (LatLng) f5.g(parcel, readInt16, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = f5.h(parcel, readInt16);
                            break;
                        case 4:
                            str5 = f5.h(parcel, readInt16);
                            break;
                        case 5:
                            iBinder = f5.t(parcel, readInt16);
                            break;
                        case 6:
                            f16 = f5.r(parcel, readInt16);
                            break;
                        case 7:
                            f17 = f5.r(parcel, readInt16);
                            break;
                        case '\b':
                            z43 = f5.n(parcel, readInt16);
                            break;
                        case '\t':
                            z44 = f5.n(parcel, readInt16);
                            break;
                        case '\n':
                            z45 = f5.n(parcel, readInt16);
                            break;
                        case 11:
                            f18 = f5.r(parcel, readInt16);
                            break;
                        case '\f':
                            f19 = f5.r(parcel, readInt16);
                            break;
                        case '\r':
                            f20 = f5.r(parcel, readInt16);
                            break;
                        case 14:
                            f21 = f5.r(parcel, readInt16);
                            break;
                        case 15:
                            f22 = f5.r(parcel, readInt16);
                            break;
                        default:
                            f5.y(parcel, readInt16);
                            break;
                    }
                }
                f5.m(parcel, z42);
                x7.g gVar = new x7.g();
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
                    gVar.d = new ai(l6.b.J0(iBinder));
                }
                gVar.e = f16;
                gVar.f = f17;
                gVar.h = z43;
                gVar.n = z44;
                gVar.r = z45;
                gVar.s = f18;
                gVar.v = f19;
                gVar.w = f20;
                gVar.x = f21;
                gVar.y = f22;
                return gVar;
            case 19:
                int z46 = f5.z(parcel);
                int i22 = 0;
                Float f23 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        i22 = f5.u(parcel, readInt17);
                    } else if (c17 != 3) {
                        f5.y(parcel, readInt17);
                    } else {
                        f23 = f5.s(parcel, readInt17);
                    }
                }
                f5.m(parcel, z46);
                return new x7.h(i22, f23);
            case 20:
                int z47 = f5.z(parcel);
                PendingIntent pendingIntent = null;
                String str6 = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z47) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 1) {
                        i23 = f5.u(parcel, readInt18);
                    } else if (c18 == 2) {
                        i24 = f5.u(parcel, readInt18);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) f5.g(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        f5.y(parcel, readInt18);
                    } else {
                        str6 = f5.h(parcel, readInt18);
                    }
                }
                f5.m(parcel, z47);
                return new y5.a(i23, i24, pendingIntent, str6);
            case 21:
                int z48 = f5.z(parcel);
                long j22 = -1;
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 1) {
                        str7 = f5.h(parcel, readInt19);
                    } else if (c19 == 2) {
                        i25 = f5.u(parcel, readInt19);
                    } else if (c19 != 3) {
                        f5.y(parcel, readInt19);
                    } else {
                        j22 = f5.w(parcel, readInt19);
                    }
                }
                f5.m(parcel, z48);
                return new y5.c(i25, str7, j22);
            case 22:
                int z49 = f5.z(parcel);
                String str8 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            str8 = f5.h(parcel, readInt20);
                            break;
                        case 3:
                            bArr3 = f5.b(parcel, readInt20);
                            break;
                        case 4:
                            bArr4 = f5.c(parcel, readInt20);
                            break;
                        case 5:
                            bArr5 = f5.c(parcel, readInt20);
                            break;
                        case 6:
                            bArr6 = f5.c(parcel, readInt20);
                            break;
                        case 7:
                            bArr7 = f5.c(parcel, readInt20);
                            break;
                        case '\b':
                            iArr3 = f5.d(parcel, readInt20);
                            break;
                        case '\t':
                            bArr8 = f5.c(parcel, readInt20);
                            break;
                        default:
                            f5.y(parcel, readInt20);
                            break;
                    }
                }
                f5.m(parcel, z49);
                return new y7.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 23:
                int z50 = f5.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < z50) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 1) {
                        strArr2 = f5.i(parcel, readInt21);
                    } else if (c20 == 2) {
                        cursorWindowArr = (CursorWindow[]) f5.k(parcel, readInt21, CursorWindow.CREATOR);
                    } else if (c20 == 3) {
                        i27 = f5.u(parcel, readInt21);
                    } else if (c20 == 4) {
                        bundle = f5.a(parcel, readInt21);
                    } else if (c20 != 1000) {
                        f5.y(parcel, readInt21);
                    } else {
                        i26 = f5.u(parcel, readInt21);
                    }
                }
                f5.m(parcel, z50);
                DataHolder dataHolder = new DataHolder(i26, strArr2, cursorWindowArr, i27, bundle);
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
            case 24:
                int z51 = f5.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt22 = parcel.readInt();
                    char c21 = (char) readInt22;
                    if (c21 == 1) {
                        str9 = f5.h(parcel, readInt22);
                    } else if (c21 != 2) {
                        f5.y(parcel, readInt22);
                    } else {
                        str10 = f5.h(parcel, readInt22);
                    }
                }
                f5.m(parcel, z51);
                z7.a aVar = new z7.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
            case 25:
                int z52 = f5.z(parcel);
                String str11 = null;
                while (parcel.dataPosition() < z52) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        f5.y(parcel, readInt23);
                    } else {
                        str11 = f5.h(parcel, readInt23);
                    }
                }
                f5.m(parcel, z52);
                z7.b bVar2 = new z7.b();
                bVar2.a = str11;
                return bVar2;
            case 26:
                int z53 = f5.z(parcel);
                while (parcel.dataPosition() < z53) {
                    f5.y(parcel, parcel.readInt());
                }
                f5.m(parcel, z53);
                return new z7.c();
            default:
                int z54 = f5.z(parcel);
                while (parcel.dataPosition() < z54) {
                    f5.y(parcel, parcel.readInt());
                }
                f5.m(parcel, z54);
                return new z7.d();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new o[i10];
            case 1:
                return new q[i10];
            case 2:
                return new r[i10];
            case 3:
                return new u7.g[i10];
            case 4:
                return new u7.h[i10];
            case 5:
                return new u7.j[i10];
            case 6:
                return new u7.b[i10];
            case 7:
                return new LocationAvailability[i10];
            case 8:
                return new LocationRequest[i10];
            case 9:
                return new LocationResult[i10];
            case 10:
                return new u7.e[i10];
            case 11:
                return new w5.b[i10];
            case 12:
                return new w5.c[i10];
            case 13:
                return new CameraPosition[i10];
            case 14:
                return new x7.b[i10];
            case 15:
                return new LatLngBounds[i10];
            case 16:
                return new LatLng[i10];
            case 17:
                return new x7.e[i10];
            case 18:
                return new x7.g[i10];
            case 19:
                return new x7.h[i10];
            case 20:
                return new y5.a[i10];
            case 21:
                return new y5.c[i10];
            case 22:
                return new y7.a[i10];
            case 23:
                return new DataHolder[i10];
            case 24:
                return new z7.a[i10];
            case 25:
                return new z7.b[i10];
            case 26:
                return new z7.c[i10];
            default:
                return new z7.d[i10];
        }
    }
}
