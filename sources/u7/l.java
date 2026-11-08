package u7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import c8.xb;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final LocationRequest a;

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(LocationRequest locationRequest, ArrayList arrayList, boolean z9, boolean z10, String str, boolean z11, boolean z12, String str2, long j3) {
        j jVar;
        long j10;
        int i7 = locationRequest.a;
        long j11 = locationRequest.b;
        long j12 = locationRequest.c;
        long j13 = locationRequest.d;
        long j14 = locationRequest.e;
        int i10 = locationRequest.f;
        float f10 = locationRequest.h;
        boolean z13 = locationRequest.n;
        long j15 = locationRequest.r;
        boolean z14 = z13;
        int i11 = locationRequest.s;
        int i12 = locationRequest.w;
        String str3 = locationRequest.x;
        boolean z15 = locationRequest.y;
        WorkSource workSource = locationRequest.D;
        j jVar2 = locationRequest.E;
        if (arrayList == null) {
            jVar = jVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                jVar = jVar2;
                j10 = j14;
                int i13 = 0;
                for (int size = arrayList.size(); i13 < size; size = size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    q6.e eVar = (q6.e) obj;
                    x6.f.a(workSource, eVar.a, eVar.b);
                }
                boolean z16 = true;
                i11 = z9 ? 1 : i11;
                i12 = z10 ? 2 : i12;
                if (str == null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        str3 = str;
                    }
                } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                    str3 = str2;
                }
                z15 = z11 ? true : z15;
                z14 = z12 ? true : z14;
                if (j3 != Long.MAX_VALUE) {
                    if (j3 != -1 && j3 < 0) {
                        z16 = false;
                    }
                    q6.m.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z16);
                    j15 = j3;
                }
                if (j12 != -1) {
                    j12 = j11;
                } else if (i7 != 105) {
                    j12 = Math.min(j12, j11);
                }
                this.a = new LocationRequest(i7, j11, j12, Math.max(j13, j11), Long.MAX_VALUE, j10, i10, f10, z14, j15 == -1 ? j11 : j15, i11, i12, str3, z15, new WorkSource(workSource), jVar);
            }
            jVar = jVar2;
            workSource = null;
        }
        j10 = j14;
        boolean z162 = true;
        if (z9) {
        }
        if (z10) {
        }
        if (str == null) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (j3 != Long.MAX_VALUE) {
        }
        if (j12 != -1) {
        }
        this.a = new LocationRequest(i7, j11, j12, Math.max(j13, j11), Long.MAX_VALUE, j10, i10, f10, z14, j15 == -1 ? j11 : j15, i11, i12, str3, z15, new WorkSource(workSource), jVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return q6.m.k(this.a, ((l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.a, i7);
        xb.s(parcel, r10);
    }
}
