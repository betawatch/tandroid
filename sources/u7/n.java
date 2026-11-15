package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.a) {
            case 0:
                int z10 = xb.z(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                long j3 = Long.MAX_VALUE;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        locationRequest = (LocationRequest) xb.g(parcel, readInt, LocationRequest.CREATOR);
                    } else if (c10 != 5) {
                        switch (c10) {
                            case '\b':
                                z11 = xb.n(parcel, readInt);
                                break;
                            case '\t':
                                z12 = xb.n(parcel, readInt);
                                break;
                            case '\n':
                                str = xb.h(parcel, readInt);
                                break;
                            case 11:
                                z13 = xb.n(parcel, readInt);
                                break;
                            case '\f':
                                z14 = xb.n(parcel, readInt);
                                break;
                            case '\r':
                                str2 = xb.h(parcel, readInt);
                                break;
                            case 14:
                                j3 = xb.w(parcel, readInt);
                                break;
                            default:
                                xb.y(parcel, readInt);
                                break;
                        }
                    } else {
                        arrayList = xb.l(parcel, readInt, q6.e.CREATOR);
                    }
                }
                xb.m(parcel, z10);
                return new m(locationRequest, arrayList, z11, z12, str, z13, z14, str2, j3);
            case 1:
                int z15 = xb.z(parcel);
                q qVar = s.b;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                List list = t.e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                k kVar = null;
                while (parcel.dataPosition() < z15) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i7 = xb.u(parcel, readInt2);
                            break;
                        case 2:
                            i10 = xb.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = xb.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = xb.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = xb.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = xb.h(parcel, readInt2);
                            break;
                        case 7:
                            kVar = (k) xb.g(parcel, readInt2, k.CREATOR);
                            break;
                        case '\b':
                            list = xb.l(parcel, readInt2, n6.c.CREATOR);
                            break;
                        default:
                            xb.y(parcel, readInt2);
                            break;
                    }
                }
                xb.m(parcel, z15);
                return new k(i7, i10, str3, str4, str5, i11, list, kVar);
            default:
                int z16 = xb.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        xb.y(parcel, readInt3);
                    } else {
                        status = (Status) xb.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                xb.m(parcel, z16);
                return new u(status);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new m[i7];
            case 1:
                return new k[i7];
            default:
                return new u[i7];
        }
    }
}
