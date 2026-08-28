package q7;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import g7.o8;
import java.util.ArrayList;
import java.util.List;
import m5.c0;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            z11 = o8.n(parcel, readInt);
                            break;
                        case 2:
                            z12 = o8.n(parcel, readInt);
                            break;
                        case 3:
                            z13 = o8.n(parcel, readInt);
                            break;
                        case 4:
                            z14 = o8.n(parcel, readInt);
                            break;
                        case 5:
                            z15 = o8.n(parcel, readInt);
                            break;
                        case 6:
                            z16 = o8.n(parcel, readInt);
                            break;
                        default:
                            o8.y(parcel, readInt);
                            break;
                    }
                }
                o8.m(parcel, z10);
                return new h(z11, z12, z13, z14, z15, z16);
            case 1:
                int z17 = o8.z(parcel);
                long j10 = -1;
                long j11 = -1;
                int i9 = 1;
                int i10 = 1;
                while (parcel.dataPosition() < z17) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i9 = o8.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        i10 = o8.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        j10 = o8.w(parcel, readInt2);
                    } else if (c10 != 4) {
                        o8.y(parcel, readInt2);
                    } else {
                        j11 = o8.w(parcel, readInt2);
                    }
                }
                o8.m(parcel, z17);
                return new k(j10, i9, i10, j11);
            case 2:
                int z18 = o8.z(parcel);
                long j12 = Long.MAX_VALUE;
                String str = null;
                b7.l lVar = null;
                int i11 = 0;
                boolean z19 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        j12 = o8.w(parcel, readInt3);
                    } else if (c11 == 2) {
                        i11 = o8.u(parcel, readInt3);
                    } else if (c11 == 3) {
                        z19 = o8.n(parcel, readInt3);
                    } else if (c11 == 4) {
                        str = o8.h(parcel, readInt3);
                    } else if (c11 != 5) {
                        o8.y(parcel, readInt3);
                    } else {
                        lVar = (b7.l) o8.g(parcel, readInt3, b7.l.CREATOR);
                    }
                }
                o8.m(parcel, z18);
                return new b(j12, i11, z19, str, lVar);
            case 3:
                int z20 = o8.z(parcel);
                long j13 = 0;
                k[] kVarArr = null;
                int i12 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                int i13 = 1;
                int i14 = 1;
                while (parcel.dataPosition() < z20) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i13 = o8.u(parcel, readInt4);
                            break;
                        case 2:
                            i14 = o8.u(parcel, readInt4);
                            break;
                        case 3:
                            j13 = o8.w(parcel, readInt4);
                            break;
                        case 4:
                            i12 = o8.u(parcel, readInt4);
                            break;
                        case 5:
                            kVarArr = (k[]) o8.k(parcel, readInt4, k.CREATOR);
                            break;
                        case 6:
                            o8.n(parcel, readInt4);
                            break;
                        default:
                            o8.y(parcel, readInt4);
                            break;
                    }
                }
                o8.m(parcel, z20);
                return new LocationAvailability(i12, i13, i14, j13, kVarArr);
            case 4:
                int z21 = o8.z(parcel);
                WorkSource workSource = new WorkSource();
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                long j19 = -1;
                String str2 = null;
                b7.l lVar2 = null;
                int i15 = 102;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                float f10 = 0.0f;
                boolean z22 = false;
                int i17 = 0;
                int i18 = 0;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i15 = o8.u(parcel, readInt5);
                            break;
                        case 2:
                            j14 = o8.w(parcel, readInt5);
                            break;
                        case 3:
                            j15 = o8.w(parcel, readInt5);
                            break;
                        case 4:
                        default:
                            o8.y(parcel, readInt5);
                            break;
                        case 5:
                            j17 = o8.w(parcel, readInt5);
                            break;
                        case 6:
                            i16 = o8.u(parcel, readInt5);
                            break;
                        case 7:
                            f10 = o8.r(parcel, readInt5);
                            break;
                        case '\b':
                            j16 = o8.w(parcel, readInt5);
                            break;
                        case '\t':
                            z22 = o8.n(parcel, readInt5);
                            break;
                        case '\n':
                            j18 = o8.w(parcel, readInt5);
                            break;
                        case 11:
                            j19 = o8.w(parcel, readInt5);
                            break;
                        case '\f':
                            i17 = o8.u(parcel, readInt5);
                            break;
                        case '\r':
                            i18 = o8.u(parcel, readInt5);
                            break;
                        case 14:
                            str2 = o8.h(parcel, readInt5);
                            break;
                        case 15:
                            z23 = o8.n(parcel, readInt5);
                            break;
                        case 16:
                            workSource = (WorkSource) o8.g(parcel, readInt5, WorkSource.CREATOR);
                            break;
                        case 17:
                            lVar2 = (b7.l) o8.g(parcel, readInt5, b7.l.CREATOR);
                            break;
                    }
                }
                o8.m(parcel, z21);
                return new LocationRequest(i15, j14, j15, j16, j17, j18, i16, f10, z22, j19, i17, i18, str2, z23, workSource, lVar2);
            case 5:
                int z24 = o8.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z24) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        o8.y(parcel, readInt6);
                    } else {
                        list = o8.l(parcel, readInt6, Location.CREATOR);
                    }
                }
                o8.m(parcel, z24);
                return new LocationResult(list);
            case 6:
                int z25 = o8.z(parcel);
                ArrayList arrayList = null;
                boolean z26 = false;
                boolean z27 = false;
                while (parcel.dataPosition() < z25) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        arrayList = o8.l(parcel, readInt7, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z26 = o8.n(parcel, readInt7);
                    } else if (c12 != 3) {
                        o8.y(parcel, readInt7);
                    } else {
                        z27 = o8.n(parcel, readInt7);
                    }
                }
                o8.m(parcel, z25);
                return new e(arrayList, z26, z27);
            case 7:
                int z28 = o8.z(parcel);
                long j20 = 0;
                long j21 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        z29 = o8.n(parcel, readInt8);
                    } else if (c13 == 2) {
                        j21 = o8.w(parcel, readInt8);
                    } else if (c13 != 3) {
                        o8.y(parcel, readInt8);
                    } else {
                        j20 = o8.w(parcel, readInt8);
                    }
                }
                o8.m(parcel, z28);
                return new s5.b(j20, j21, z29);
            case 8:
                int z30 = o8.z(parcel);
                e2 e2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                u7.a[] aVarArr = null;
                boolean z31 = true;
                while (parcel.dataPosition() < z30) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            e2Var = (e2) o8.g(parcel, readInt9, e2.CREATOR);
                            break;
                        case 3:
                            bArr = o8.b(parcel, readInt9);
                            break;
                        case 4:
                            iArr = o8.d(parcel, readInt9);
                            break;
                        case 5:
                            strArr = o8.i(parcel, readInt9);
                            break;
                        case 6:
                            iArr2 = o8.d(parcel, readInt9);
                            break;
                        case 7:
                            bArr2 = o8.c(parcel, readInt9);
                            break;
                        case '\b':
                            z31 = o8.n(parcel, readInt9);
                            break;
                        case '\t':
                            aVarArr = (u7.a[]) o8.k(parcel, readInt9, u7.a.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt9);
                            break;
                    }
                }
                o8.m(parcel, z30);
                return new s5.c(e2Var, bArr, iArr, strArr, iArr2, bArr2, z31, aVarArr);
            case 9:
                int z32 = o8.z(parcel);
                LatLng latLng = null;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (parcel.dataPosition() < z32) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        latLng = (LatLng) o8.g(parcel, readInt10, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        f11 = o8.r(parcel, readInt10);
                    } else if (c14 == 4) {
                        f12 = o8.r(parcel, readInt10);
                    } else if (c14 != 5) {
                        o8.y(parcel, readInt10);
                    } else {
                        f13 = o8.r(parcel, readInt10);
                    }
                }
                o8.m(parcel, z32);
                return new CameraPosition(latLng, f11, f12, f13);
            case 10:
                int z33 = o8.z(parcel);
                LatLng latLng2 = null;
                double d = 0.0d;
                float f14 = 0.0f;
                float f15 = 0.0f;
                int i19 = 0;
                int i20 = 0;
                boolean z34 = false;
                boolean z35 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            latLng2 = (LatLng) o8.g(parcel, readInt11, LatLng.CREATOR);
                            break;
                        case 3:
                            d = o8.q(parcel, readInt11);
                            break;
                        case 4:
                            f14 = o8.r(parcel, readInt11);
                            break;
                        case 5:
                            i19 = o8.u(parcel, readInt11);
                            break;
                        case 6:
                            i20 = o8.u(parcel, readInt11);
                            break;
                        case 7:
                            f15 = o8.r(parcel, readInt11);
                            break;
                        case '\b':
                            z34 = o8.n(parcel, readInt11);
                            break;
                        case '\t':
                            z35 = o8.n(parcel, readInt11);
                            break;
                        case '\n':
                            arrayList2 = o8.l(parcel, readInt11, t7.h.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt11);
                            break;
                    }
                }
                o8.m(parcel, z33);
                t7.b bVar = new t7.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i19;
                bVar.e = i20;
                bVar.f = f15;
                bVar.h = z34;
                bVar.n = z35;
                bVar.r = arrayList2;
                return bVar;
            case 11:
                int z36 = o8.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        latLng3 = (LatLng) o8.g(parcel, readInt12, LatLng.CREATOR);
                    } else if (c15 != 3) {
                        o8.y(parcel, readInt12);
                    } else {
                        latLng4 = (LatLng) o8.g(parcel, readInt12, LatLng.CREATOR);
                    }
                }
                o8.m(parcel, z36);
                return new LatLngBounds(latLng3, latLng4);
            case 12:
                int z37 = o8.z(parcel);
                double d9 = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z37) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 2) {
                        d9 = o8.q(parcel, readInt13);
                    } else if (c16 != 3) {
                        o8.y(parcel, readInt13);
                    } else {
                        d10 = o8.q(parcel, readInt13);
                    }
                }
                o8.m(parcel, z37);
                return new LatLng(d9, d10);
            case 13:
                int z38 = o8.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        o8.y(parcel, readInt14);
                    } else {
                        str3 = o8.h(parcel, readInt14);
                    }
                }
                o8.m(parcel, z38);
                return new t7.e(str3);
            case 14:
                int z39 = o8.z(parcel);
                LatLng latLng5 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder = null;
                float f16 = 0.0f;
                float f17 = 0.0f;
                boolean z40 = false;
                boolean z41 = false;
                boolean z42 = false;
                float f18 = 0.0f;
                float f19 = 0.5f;
                float f20 = 0.0f;
                float f21 = 1.0f;
                float f22 = 0.0f;
                while (parcel.dataPosition() < z39) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            latLng5 = (LatLng) o8.g(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = o8.h(parcel, readInt15);
                            break;
                        case 4:
                            str5 = o8.h(parcel, readInt15);
                            break;
                        case 5:
                            iBinder = o8.t(parcel, readInt15);
                            break;
                        case 6:
                            f16 = o8.r(parcel, readInt15);
                            break;
                        case 7:
                            f17 = o8.r(parcel, readInt15);
                            break;
                        case '\b':
                            z40 = o8.n(parcel, readInt15);
                            break;
                        case '\t':
                            z41 = o8.n(parcel, readInt15);
                            break;
                        case '\n':
                            z42 = o8.n(parcel, readInt15);
                            break;
                        case 11:
                            f18 = o8.r(parcel, readInt15);
                            break;
                        case '\f':
                            f19 = o8.r(parcel, readInt15);
                            break;
                        case '\r':
                            f20 = o8.r(parcel, readInt15);
                            break;
                        case 14:
                            f21 = o8.r(parcel, readInt15);
                            break;
                        case 15:
                            f22 = o8.r(parcel, readInt15);
                            break;
                        default:
                            o8.y(parcel, readInt15);
                            break;
                    }
                }
                o8.m(parcel, z39);
                t7.g gVar = new t7.g();
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
                    gVar.d = new c0(h6.b.J0(iBinder));
                }
                gVar.e = f16;
                gVar.f = f17;
                gVar.h = z40;
                gVar.n = z41;
                gVar.r = z42;
                gVar.s = f18;
                gVar.v = f19;
                gVar.w = f20;
                gVar.x = f21;
                gVar.y = f22;
                return gVar;
            case 15:
                int z43 = o8.z(parcel);
                int i21 = 0;
                Float f23 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 2) {
                        i21 = o8.u(parcel, readInt16);
                    } else if (c17 != 3) {
                        o8.y(parcel, readInt16);
                    } else {
                        f23 = o8.s(parcel, readInt16);
                    }
                }
                o8.m(parcel, z43);
                return new t7.h(i21, f23);
            case 16:
                u0.h hVar = new u0.h(parcel);
                hVar.a = parcel.readInt();
                return hVar;
            case 17:
                int z44 = o8.z(parcel);
                PendingIntent pendingIntent = null;
                String str6 = null;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < z44) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 1) {
                        i22 = o8.u(parcel, readInt17);
                    } else if (c18 == 2) {
                        i23 = o8.u(parcel, readInt17);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) o8.g(parcel, readInt17, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        o8.y(parcel, readInt17);
                    } else {
                        str6 = o8.h(parcel, readInt17);
                    }
                }
                o8.m(parcel, z44);
                return new u5.a(i22, i23, pendingIntent, str6);
            case 18:
                int z45 = o8.z(parcel);
                long j22 = -1;
                int i24 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        str7 = o8.h(parcel, readInt18);
                    } else if (c19 == 2) {
                        i24 = o8.u(parcel, readInt18);
                    } else if (c19 != 3) {
                        o8.y(parcel, readInt18);
                    } else {
                        j22 = o8.w(parcel, readInt18);
                    }
                }
                o8.m(parcel, z45);
                return new u5.c(i24, str7, j22);
            case 19:
                int z46 = o8.z(parcel);
                String str8 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr3 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str8 = o8.h(parcel, readInt19);
                            break;
                        case 3:
                            bArr3 = o8.b(parcel, readInt19);
                            break;
                        case 4:
                            bArr4 = o8.c(parcel, readInt19);
                            break;
                        case 5:
                            bArr5 = o8.c(parcel, readInt19);
                            break;
                        case 6:
                            bArr6 = o8.c(parcel, readInt19);
                            break;
                        case 7:
                            bArr7 = o8.c(parcel, readInt19);
                            break;
                        case '\b':
                            iArr3 = o8.d(parcel, readInt19);
                            break;
                        case '\t':
                            bArr8 = o8.c(parcel, readInt19);
                            break;
                        default:
                            o8.y(parcel, readInt19);
                            break;
                    }
                }
                o8.m(parcel, z46);
                return new u7.a(str8, bArr3, bArr4, bArr5, bArr6, bArr7, iArr3, bArr8);
            case 20:
                int z47 = o8.z(parcel);
                String[] strArr2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < z47) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 1) {
                        strArr2 = o8.i(parcel, readInt20);
                    } else if (c20 == 2) {
                        cursorWindowArr = (CursorWindow[]) o8.k(parcel, readInt20, CursorWindow.CREATOR);
                    } else if (c20 == 3) {
                        i26 = o8.u(parcel, readInt20);
                    } else if (c20 == 4) {
                        bundle = o8.a(parcel, readInt20);
                    } else if (c20 != 1000) {
                        o8.y(parcel, readInt20);
                    } else {
                        i25 = o8.u(parcel, readInt20);
                    }
                }
                o8.m(parcel, z47);
                DataHolder dataHolder = new DataHolder(i25, strArr2, cursorWindowArr, i26, bundle);
                dataHolder.c = new Bundle();
                int i27 = 0;
                while (true) {
                    String[] strArr3 = dataHolder.b;
                    if (i27 >= strArr3.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i28 = 0;
                        for (int i29 = 0; i29 < cursorWindowArr2.length; i29++) {
                            dataHolder.h[i29] = i28;
                            i28 += cursorWindowArr2[i29].getNumRows() - (i28 - cursorWindowArr2[i29].getStartPosition());
                        }
                        dataHolder.n = i28;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr3[i27], i27);
                    i27++;
                }
            case 21:
                int z48 = o8.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        str9 = o8.h(parcel, readInt21);
                    } else if (c21 != 2) {
                        o8.y(parcel, readInt21);
                    } else {
                        str10 = o8.h(parcel, readInt21);
                    }
                }
                o8.m(parcel, z48);
                v7.a aVar = new v7.a();
                aVar.a = str9;
                aVar.b = str10;
                return aVar;
            case 22:
                int z49 = o8.z(parcel);
                String str11 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        o8.y(parcel, readInt22);
                    } else {
                        str11 = o8.h(parcel, readInt22);
                    }
                }
                o8.m(parcel, z49);
                v7.b bVar2 = new v7.b();
                bVar2.a = str11;
                return bVar2;
            case 23:
                int z50 = o8.z(parcel);
                while (parcel.dataPosition() < z50) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z50);
                return new v7.c();
            case 24:
                int z51 = o8.z(parcel);
                while (parcel.dataPosition() < z51) {
                    o8.y(parcel, parcel.readInt());
                }
                o8.m(parcel, z51);
                return new v7.d();
            case 25:
                int z52 = o8.z(parcel);
                int i30 = 0;
                Uri uri = null;
                int i31 = 0;
                int i32 = 0;
                while (parcel.dataPosition() < z52) {
                    int readInt23 = parcel.readInt();
                    char c22 = (char) readInt23;
                    if (c22 == 1) {
                        i30 = o8.u(parcel, readInt23);
                    } else if (c22 == 2) {
                        uri = (Uri) o8.g(parcel, readInt23, Uri.CREATOR);
                    } else if (c22 == 3) {
                        i31 = o8.u(parcel, readInt23);
                    } else if (c22 != 4) {
                        o8.y(parcel, readInt23);
                    } else {
                        i32 = o8.u(parcel, readInt23);
                    }
                }
                o8.m(parcel, z52);
                return new w5.a(i30, uri, i31, i32);
            case 26:
                int z53 = o8.z(parcel);
                String str12 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 2) {
                        o8.y(parcel, readInt24);
                    } else {
                        str12 = o8.h(parcel, readInt24);
                    }
                }
                o8.m(parcel, z53);
                return new w7.e(str12);
            case 27:
                int z54 = o8.z(parcel);
                String str13 = null;
                byte[] bArr9 = null;
                int i33 = 0;
                while (parcel.dataPosition() < z54) {
                    int readInt25 = parcel.readInt();
                    char c23 = (char) readInt25;
                    if (c23 == 2) {
                        str13 = o8.h(parcel, readInt25);
                    } else if (c23 == 3) {
                        bArr9 = o8.b(parcel, readInt25);
                    } else if (c23 != 4) {
                        o8.y(parcel, readInt25);
                    } else {
                        i33 = o8.u(parcel, readInt25);
                    }
                }
                o8.m(parcel, z54);
                return new w7.a(str13, bArr9, i33);
            case 28:
                int z55 = o8.z(parcel);
                long j23 = 0;
                w7.a[] aVarArr2 = null;
                int i34 = 0;
                boolean z56 = false;
                while (parcel.dataPosition() < z55) {
                    int readInt26 = parcel.readInt();
                    char c24 = (char) readInt26;
                    if (c24 == 2) {
                        j23 = o8.w(parcel, readInt26);
                    } else if (c24 == 3) {
                        aVarArr2 = (w7.a[]) o8.k(parcel, readInt26, w7.a.CREATOR);
                    } else if (c24 == 4) {
                        i34 = o8.u(parcel, readInt26);
                    } else if (c24 != 5) {
                        o8.y(parcel, readInt26);
                    } else {
                        z56 = o8.n(parcel, readInt26);
                    }
                }
                o8.m(parcel, z55);
                return new w7.f(j23, aVarArr2, i34, z56);
            default:
                int z57 = o8.z(parcel);
                String str14 = null;
                while (parcel.dataPosition() < z57) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 2) {
                        o8.y(parcel, readInt27);
                    } else {
                        str14 = o8.h(parcel, readInt27);
                    }
                }
                o8.m(parcel, z57);
                return new w7.g(str14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new h[i9];
            case 1:
                return new k[i9];
            case 2:
                return new b[i9];
            case 3:
                return new LocationAvailability[i9];
            case 4:
                return new LocationRequest[i9];
            case 5:
                return new LocationResult[i9];
            case 6:
                return new e[i9];
            case 7:
                return new s5.b[i9];
            case 8:
                return new s5.c[i9];
            case 9:
                return new CameraPosition[i9];
            case 10:
                return new t7.b[i9];
            case 11:
                return new LatLngBounds[i9];
            case 12:
                return new LatLng[i9];
            case 13:
                return new t7.e[i9];
            case 14:
                return new t7.g[i9];
            case 15:
                return new t7.h[i9];
            case 16:
                return new u0.h[i9];
            case 17:
                return new u5.a[i9];
            case 18:
                return new u5.c[i9];
            case 19:
                return new u7.a[i9];
            case 20:
                return new DataHolder[i9];
            case 21:
                return new v7.a[i9];
            case 22:
                return new v7.b[i9];
            case 23:
                return new v7.c[i9];
            case 24:
                return new v7.d[i9];
            case 25:
                return new w5.a[i9];
            case 26:
                return new w7.e[i9];
            case 27:
                return new w7.a[i9];
            case 28:
                return new w7.f[i9];
            default:
                return new w7.g[i9];
        }
    }
}
