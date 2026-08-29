package s6;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                String str = "";
                String str2 = str;
                String str3 = str2;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str4 = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = ce.b.i(parcel, readInt);
                            break;
                        case 2:
                            bundle = ce.b.b(parcel, readInt);
                            break;
                        case 3:
                            bundle2 = ce.b.b(parcel, readInt);
                            break;
                        case 4:
                            str4 = ce.b.i(parcel, readInt);
                            break;
                        case 5:
                            str2 = ce.b.i(parcel, readInt);
                            break;
                        case 6:
                            str3 = ce.b.i(parcel, readInt);
                            break;
                        default:
                            ce.b.z(parcel, readInt);
                            break;
                    }
                }
                ce.b.n(parcel, A);
                return new h(str, bundle, bundle2, str4, str2, str3);
            case 1:
                int A2 = ce.b.A(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        bundle3 = ce.b.b(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new j(bundle3);
            case 2:
                int A3 = ce.b.A(parcel);
                Bundle bundle4 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        bundle4 = ce.b.b(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new k(bundle4);
            case 3:
                int A4 = ce.b.A(parcel);
                ArrayList arrayList = null;
                Bundle bundle5 = null;
                String str5 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        arrayList = ce.b.m(parcel, readInt4, h.CREATOR);
                    } else if (c3 == 2) {
                        bundle5 = ce.b.b(parcel, readInt4);
                    } else if (c3 == 3) {
                        str5 = ce.b.i(parcel, readInt4);
                    } else if (c3 != 4) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        resultReceiver = (ResultReceiver) ce.b.h(parcel, readInt4, ResultReceiver.CREATOR);
                    }
                }
                ce.b.n(parcel, A4);
                return new GetCredentialRequest(arrayList, bundle5, str5, resultReceiver);
            case 4:
                int A5 = ce.b.A(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        bundle6 = ce.b.b(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                return new l(bundle6);
            case 5:
                int A6 = ce.b.A(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        pendingIntent = (PendingIntent) ce.b.h(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(parcel, A6);
                return new m(pendingIntent);
            case 6:
                int A7 = ce.b.A(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        pendingIntent2 = (PendingIntent) ce.b.h(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(parcel, A7);
                return new n(pendingIntent2);
            case 7:
                int A8 = ce.b.A(parcel);
                while (parcel.dataPosition() < A8) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A8);
                return new o();
            case 8:
                int A9 = ce.b.A(parcel);
                while (parcel.dataPosition() < A9) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A9);
                return new p();
            case 9:
                int A10 = ce.b.A(parcel);
                while (parcel.dataPosition() < A10) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A10);
                return new q();
            case 10:
                int A11 = ce.b.A(parcel);
                while (parcel.dataPosition() < A11) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A11);
                return new r();
            case 11:
                int A12 = ce.b.A(parcel);
                Status status = null;
                s7.h hVar = null;
                while (parcel.dataPosition() < A12) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        status = (Status) ce.b.h(parcel, readInt8, Status.CREATOR);
                    } else if (c6 != 2) {
                        ce.b.z(parcel, readInt8);
                    } else {
                        hVar = (s7.h) ce.b.h(parcel, readInt8, s7.h.CREATOR);
                    }
                }
                ce.b.n(parcel, A12);
                return new s7.g(status, hVar);
            case 12:
                int A13 = ce.b.A(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < A13) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            z10 = ce.b.o(parcel, readInt9);
                            break;
                        case 2:
                            z11 = ce.b.o(parcel, readInt9);
                            break;
                        case 3:
                            z12 = ce.b.o(parcel, readInt9);
                            break;
                        case 4:
                            z13 = ce.b.o(parcel, readInt9);
                            break;
                        case 5:
                            z14 = ce.b.o(parcel, readInt9);
                            break;
                        case 6:
                            z15 = ce.b.o(parcel, readInt9);
                            break;
                        default:
                            ce.b.z(parcel, readInt9);
                            break;
                    }
                }
                ce.b.n(parcel, A13);
                return new s7.h(z10, z11, z12, z13, z14, z15);
            case 13:
                int A14 = ce.b.A(parcel);
                long j10 = -1;
                long j11 = -1;
                int i10 = 1;
                int i11 = 1;
                while (parcel.dataPosition() < A14) {
                    int readInt10 = parcel.readInt();
                    char c10 = (char) readInt10;
                    if (c10 == 1) {
                        i10 = ce.b.v(parcel, readInt10);
                    } else if (c10 == 2) {
                        i11 = ce.b.v(parcel, readInt10);
                    } else if (c10 == 3) {
                        j10 = ce.b.x(parcel, readInt10);
                    } else if (c10 != 4) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        j11 = ce.b.x(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A14);
                return new s7.j(j10, i10, i11, j11);
            case 14:
                int A15 = ce.b.A(parcel);
                long j12 = Long.MAX_VALUE;
                String str6 = null;
                d7.j jVar = null;
                int i12 = 0;
                boolean z16 = false;
                while (parcel.dataPosition() < A15) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        j12 = ce.b.x(parcel, readInt11);
                    } else if (c11 == 2) {
                        i12 = ce.b.v(parcel, readInt11);
                    } else if (c11 == 3) {
                        z16 = ce.b.o(parcel, readInt11);
                    } else if (c11 == 4) {
                        str6 = ce.b.i(parcel, readInt11);
                    } else if (c11 != 5) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        jVar = (d7.j) ce.b.h(parcel, readInt11, d7.j.CREATOR);
                    }
                }
                ce.b.n(parcel, A15);
                return new s7.b(j12, i12, z16, str6, jVar);
            case 15:
                int A16 = ce.b.A(parcel);
                long j13 = 0;
                s7.j[] jVarArr = null;
                int i13 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                int i14 = 1;
                int i15 = 1;
                while (parcel.dataPosition() < A16) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i14 = ce.b.v(parcel, readInt12);
                            break;
                        case 2:
                            i15 = ce.b.v(parcel, readInt12);
                            break;
                        case 3:
                            j13 = ce.b.x(parcel, readInt12);
                            break;
                        case 4:
                            i13 = ce.b.v(parcel, readInt12);
                            break;
                        case 5:
                            jVarArr = (s7.j[]) ce.b.l(parcel, readInt12, s7.j.CREATOR);
                            break;
                        case 6:
                            ce.b.o(parcel, readInt12);
                            break;
                        default:
                            ce.b.z(parcel, readInt12);
                            break;
                    }
                }
                ce.b.n(parcel, A16);
                return new LocationAvailability(i13, i14, i15, j13, jVarArr);
            case 16:
                int A17 = ce.b.A(parcel);
                WorkSource workSource = new WorkSource();
                long j14 = 3600000;
                long j15 = 600000;
                long j16 = 0;
                long j17 = Long.MAX_VALUE;
                long j18 = Long.MAX_VALUE;
                long j19 = -1;
                String str7 = null;
                d7.j jVar2 = null;
                int i16 = 102;
                int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                float f9 = 0.0f;
                boolean z17 = false;
                int i18 = 0;
                int i19 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < A17) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i16 = ce.b.v(parcel, readInt13);
                            break;
                        case 2:
                            j14 = ce.b.x(parcel, readInt13);
                            break;
                        case 3:
                            j15 = ce.b.x(parcel, readInt13);
                            break;
                        case 4:
                        default:
                            ce.b.z(parcel, readInt13);
                            break;
                        case 5:
                            j17 = ce.b.x(parcel, readInt13);
                            break;
                        case 6:
                            i17 = ce.b.v(parcel, readInt13);
                            break;
                        case 7:
                            f9 = ce.b.s(parcel, readInt13);
                            break;
                        case '\b':
                            j16 = ce.b.x(parcel, readInt13);
                            break;
                        case '\t':
                            z17 = ce.b.o(parcel, readInt13);
                            break;
                        case '\n':
                            j18 = ce.b.x(parcel, readInt13);
                            break;
                        case 11:
                            j19 = ce.b.x(parcel, readInt13);
                            break;
                        case '\f':
                            i18 = ce.b.v(parcel, readInt13);
                            break;
                        case '\r':
                            i19 = ce.b.v(parcel, readInt13);
                            break;
                        case 14:
                            str7 = ce.b.i(parcel, readInt13);
                            break;
                        case 15:
                            z18 = ce.b.o(parcel, readInt13);
                            break;
                        case 16:
                            workSource = (WorkSource) ce.b.h(parcel, readInt13, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar2 = (d7.j) ce.b.h(parcel, readInt13, d7.j.CREATOR);
                            break;
                    }
                }
                ce.b.n(parcel, A17);
                return new LocationRequest(i16, j14, j15, j16, j17, j18, i17, f9, z17, j19, i18, i19, str7, z18, workSource, jVar2);
            case 17:
                int A18 = ce.b.A(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < A18) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        list = ce.b.m(parcel, readInt14, Location.CREATOR);
                    }
                }
                ce.b.n(parcel, A18);
                return new LocationResult(list);
            case 18:
                int A19 = ce.b.A(parcel);
                ArrayList arrayList2 = null;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < A19) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        arrayList2 = ce.b.m(parcel, readInt15, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z19 = ce.b.o(parcel, readInt15);
                    } else if (c12 != 3) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        z20 = ce.b.o(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A19);
                return new s7.e(arrayList2, z19, z20);
            case 19:
                u0.h hVar2 = new u0.h(parcel);
                hVar2.a = parcel.readInt();
                return hVar2;
            case 20:
                int A20 = ce.b.A(parcel);
                long j20 = 0;
                long j21 = 0;
                boolean z21 = false;
                while (parcel.dataPosition() < A20) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        z21 = ce.b.o(parcel, readInt16);
                    } else if (c13 == 2) {
                        j21 = ce.b.x(parcel, readInt16);
                    } else if (c13 != 3) {
                        ce.b.z(parcel, readInt16);
                    } else {
                        j20 = ce.b.x(parcel, readInt16);
                    }
                }
                ce.b.n(parcel, A20);
                return new u5.b(j20, j21, z21);
            case 21:
                int A21 = ce.b.A(parcel);
                e2 e2Var = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                w7.a[] aVarArr = null;
                boolean z22 = true;
                while (parcel.dataPosition() < A21) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            e2Var = (e2) ce.b.h(parcel, readInt17, e2.CREATOR);
                            break;
                        case 3:
                            bArr = ce.b.c(parcel, readInt17);
                            break;
                        case 4:
                            iArr = ce.b.e(parcel, readInt17);
                            break;
                        case 5:
                            strArr = ce.b.j(parcel, readInt17);
                            break;
                        case 6:
                            iArr2 = ce.b.e(parcel, readInt17);
                            break;
                        case 7:
                            bArr2 = ce.b.d(parcel, readInt17);
                            break;
                        case '\b':
                            z22 = ce.b.o(parcel, readInt17);
                            break;
                        case '\t':
                            aVarArr = (w7.a[]) ce.b.l(parcel, readInt17, w7.a.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt17);
                            break;
                    }
                }
                ce.b.n(parcel, A21);
                return new u5.c(e2Var, bArr, iArr, strArr, iArr2, bArr2, z22, aVarArr);
            case 22:
                int A22 = ce.b.A(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < A22) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 2) {
                        latLng = (LatLng) ce.b.h(parcel, readInt18, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        f10 = ce.b.s(parcel, readInt18);
                    } else if (c14 == 4) {
                        f11 = ce.b.s(parcel, readInt18);
                    } else if (c14 != 5) {
                        ce.b.z(parcel, readInt18);
                    } else {
                        f12 = ce.b.s(parcel, readInt18);
                    }
                }
                ce.b.n(parcel, A22);
                return new CameraPosition(latLng, f10, f11, f12);
            case 23:
                int A23 = ce.b.A(parcel);
                LatLng latLng2 = null;
                double d = 0.0d;
                float f13 = 0.0f;
                float f14 = 0.0f;
                int i20 = 0;
                int i21 = 0;
                boolean z23 = false;
                boolean z24 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < A23) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            latLng2 = (LatLng) ce.b.h(parcel, readInt19, LatLng.CREATOR);
                            break;
                        case 3:
                            d = ce.b.r(parcel, readInt19);
                            break;
                        case 4:
                            f13 = ce.b.s(parcel, readInt19);
                            break;
                        case 5:
                            i20 = ce.b.v(parcel, readInt19);
                            break;
                        case 6:
                            i21 = ce.b.v(parcel, readInt19);
                            break;
                        case 7:
                            f14 = ce.b.s(parcel, readInt19);
                            break;
                        case '\b':
                            z23 = ce.b.o(parcel, readInt19);
                            break;
                        case '\t':
                            z24 = ce.b.o(parcel, readInt19);
                            break;
                        case '\n':
                            arrayList3 = ce.b.m(parcel, readInt19, v7.h.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt19);
                            break;
                    }
                }
                ce.b.n(parcel, A23);
                v7.b bVar = new v7.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f13;
                bVar.d = i20;
                bVar.e = i21;
                bVar.f = f14;
                bVar.h = z23;
                bVar.n = z24;
                bVar.r = arrayList3;
                return bVar;
            case 24:
                int A24 = ce.b.A(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < A24) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 2) {
                        latLng3 = (LatLng) ce.b.h(parcel, readInt20, LatLng.CREATOR);
                    } else if (c15 != 3) {
                        ce.b.z(parcel, readInt20);
                    } else {
                        latLng4 = (LatLng) ce.b.h(parcel, readInt20, LatLng.CREATOR);
                    }
                }
                ce.b.n(parcel, A24);
                return new LatLngBounds(latLng3, latLng4);
            case 25:
                int A25 = ce.b.A(parcel);
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (parcel.dataPosition() < A25) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        d10 = ce.b.r(parcel, readInt21);
                    } else if (c16 != 3) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        d11 = ce.b.r(parcel, readInt21);
                    }
                }
                ce.b.n(parcel, A25);
                return new LatLng(d10, d11);
            case 26:
                int A26 = ce.b.A(parcel);
                String str8 = null;
                while (parcel.dataPosition() < A26) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        str8 = ce.b.i(parcel, readInt22);
                    }
                }
                ce.b.n(parcel, A26);
                return new v7.e(str8);
            case 27:
                int A27 = ce.b.A(parcel);
                LatLng latLng5 = null;
                String str9 = null;
                String str10 = null;
                IBinder iBinder = null;
                float f15 = 0.0f;
                float f16 = 0.0f;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                float f17 = 0.0f;
                float f18 = 0.5f;
                float f19 = 0.0f;
                float f20 = 1.0f;
                float f21 = 0.0f;
                while (parcel.dataPosition() < A27) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            latLng5 = (LatLng) ce.b.h(parcel, readInt23, LatLng.CREATOR);
                            break;
                        case 3:
                            str9 = ce.b.i(parcel, readInt23);
                            break;
                        case 4:
                            str10 = ce.b.i(parcel, readInt23);
                            break;
                        case 5:
                            iBinder = ce.b.u(parcel, readInt23);
                            break;
                        case 6:
                            f15 = ce.b.s(parcel, readInt23);
                            break;
                        case 7:
                            f16 = ce.b.s(parcel, readInt23);
                            break;
                        case '\b':
                            z25 = ce.b.o(parcel, readInt23);
                            break;
                        case '\t':
                            z26 = ce.b.o(parcel, readInt23);
                            break;
                        case '\n':
                            z27 = ce.b.o(parcel, readInt23);
                            break;
                        case 11:
                            f17 = ce.b.s(parcel, readInt23);
                            break;
                        case '\f':
                            f18 = ce.b.s(parcel, readInt23);
                            break;
                        case '\r':
                            f19 = ce.b.s(parcel, readInt23);
                            break;
                        case 14:
                            f20 = ce.b.s(parcel, readInt23);
                            break;
                        case 15:
                            f21 = ce.b.s(parcel, readInt23);
                            break;
                        default:
                            ce.b.z(parcel, readInt23);
                            break;
                    }
                }
                ce.b.n(parcel, A27);
                v7.g gVar = new v7.g();
                gVar.e = 0.5f;
                gVar.f = 1.0f;
                gVar.n = true;
                gVar.r = false;
                gVar.s = 0.0f;
                gVar.v = 0.5f;
                gVar.w = 0.0f;
                gVar.x = 1.0f;
                gVar.a = latLng5;
                gVar.b = str9;
                gVar.c = str10;
                if (iBinder == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new org.telegram.ui.Components.n(j6.b.J0(iBinder));
                }
                gVar.e = f15;
                gVar.f = f16;
                gVar.h = z25;
                gVar.n = z26;
                gVar.r = z27;
                gVar.s = f17;
                gVar.v = f18;
                gVar.w = f19;
                gVar.x = f20;
                gVar.y = f21;
                return gVar;
            case 28:
                int A28 = ce.b.A(parcel);
                int i22 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < A28) {
                    int readInt24 = parcel.readInt();
                    char c17 = (char) readInt24;
                    if (c17 == 2) {
                        i22 = ce.b.v(parcel, readInt24);
                    } else if (c17 != 3) {
                        ce.b.z(parcel, readInt24);
                    } else {
                        f22 = ce.b.t(parcel, readInt24);
                    }
                }
                ce.b.n(parcel, A28);
                return new v7.h(i22, f22);
            default:
                int A29 = ce.b.A(parcel);
                PendingIntent pendingIntent3 = null;
                String str11 = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < A29) {
                    int readInt25 = parcel.readInt();
                    char c18 = (char) readInt25;
                    if (c18 == 1) {
                        i23 = ce.b.v(parcel, readInt25);
                    } else if (c18 == 2) {
                        i24 = ce.b.v(parcel, readInt25);
                    } else if (c18 == 3) {
                        pendingIntent3 = (PendingIntent) ce.b.h(parcel, readInt25, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        ce.b.z(parcel, readInt25);
                    } else {
                        str11 = ce.b.i(parcel, readInt25);
                    }
                }
                ce.b.n(parcel, A29);
                return new w5.a(i23, i24, pendingIntent3, str11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new h[i10];
            case 1:
                return new j[i10];
            case 2:
                return new k[i10];
            case 3:
                return new GetCredentialRequest[i10];
            case 4:
                return new l[i10];
            case 5:
                return new m[i10];
            case 6:
                return new n[i10];
            case 7:
                return new o[i10];
            case 8:
                return new p[i10];
            case 9:
                return new q[i10];
            case 10:
                return new r[i10];
            case 11:
                return new s7.g[i10];
            case 12:
                return new s7.h[i10];
            case 13:
                return new s7.j[i10];
            case 14:
                return new s7.b[i10];
            case 15:
                return new LocationAvailability[i10];
            case 16:
                return new LocationRequest[i10];
            case 17:
                return new LocationResult[i10];
            case 18:
                return new s7.e[i10];
            case 19:
                return new u0.h[i10];
            case 20:
                return new u5.b[i10];
            case 21:
                return new u5.c[i10];
            case 22:
                return new CameraPosition[i10];
            case 23:
                return new v7.b[i10];
            case 24:
                return new LatLngBounds[i10];
            case 25:
                return new LatLng[i10];
            case 26:
                return new v7.e[i10];
            case 27:
                return new v7.g[i10];
            case 28:
                return new v7.h[i10];
            default:
                return new w5.a[i10];
        }
    }
}
