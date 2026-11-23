package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.a) {
            case 0:
                int z10 = ac.z(parcel);
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
                        locationRequest = (LocationRequest) ac.g(parcel, readInt, LocationRequest.CREATOR);
                    } else if (c10 != 5) {
                        switch (c10) {
                            case '\b':
                                z11 = ac.n(parcel, readInt);
                                break;
                            case '\t':
                                z12 = ac.n(parcel, readInt);
                                break;
                            case '\n':
                                str = ac.h(parcel, readInt);
                                break;
                            case 11:
                                z13 = ac.n(parcel, readInt);
                                break;
                            case '\f':
                                z14 = ac.n(parcel, readInt);
                                break;
                            case '\r':
                                str2 = ac.h(parcel, readInt);
                                break;
                            case 14:
                                j3 = ac.w(parcel, readInt);
                                break;
                            default:
                                ac.y(parcel, readInt);
                                break;
                        }
                    } else {
                        arrayList = ac.l(parcel, readInt, q6.e.CREATOR);
                    }
                }
                ac.m(parcel, z10);
                return new l(locationRequest, arrayList, z11, z12, str, z13, z14, str2, j3);
            case 1:
                int z15 = ac.z(parcel);
                p pVar = r.b;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                List list = s.e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                j jVar = null;
                while (parcel.dataPosition() < z15) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i7 = ac.u(parcel, readInt2);
                            break;
                        case 2:
                            i10 = ac.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = ac.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = ac.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = ac.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = ac.h(parcel, readInt2);
                            break;
                        case 7:
                            jVar = (j) ac.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\b':
                            list = ac.l(parcel, readInt2, n6.c.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt2);
                            break;
                    }
                }
                ac.m(parcel, z15);
                return new j(i7, i10, str3, str4, str5, i11, list, jVar);
            default:
                int z16 = ac.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ac.y(parcel, readInt3);
                    } else {
                        status = (Status) ac.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                ac.m(parcel, z16);
                return new t(status);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new l[i7];
            case 1:
                return new j[i7];
            default:
                return new t[i7];
        }
    }
}
