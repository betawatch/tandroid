package t7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends q6.a {
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
    public l(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        j jVar;
        long j11;
        int i3 = locationRequest.a;
        long j12 = locationRequest.b;
        long j13 = locationRequest.c;
        long j14 = locationRequest.d;
        long j15 = locationRequest.e;
        int i10 = locationRequest.f;
        float f10 = locationRequest.h;
        boolean z14 = locationRequest.n;
        long j16 = locationRequest.r;
        boolean z15 = z14;
        int i11 = locationRequest.s;
        int i12 = locationRequest.w;
        String str3 = locationRequest.x;
        boolean z16 = locationRequest.y;
        WorkSource workSource = locationRequest.E;
        j jVar2 = locationRequest.F;
        if (arrayList == null) {
            jVar = jVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                jVar = jVar2;
                j11 = j15;
                int i13 = 0;
                for (int size = arrayList.size(); i13 < size; size = size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    p6.e eVar = (p6.e) obj;
                    w6.f.a(workSource, eVar.a, eVar.b);
                }
                boolean z17 = true;
                i11 = z10 ? 1 : i11;
                i12 = z11 ? 2 : i12;
                if (str == null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        str3 = str;
                    }
                } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                    str3 = str2;
                }
                z16 = z12 ? true : z16;
                z15 = z13 ? true : z15;
                if (j10 != Long.MAX_VALUE) {
                    if (j10 != -1 && j10 < 0) {
                        z17 = false;
                    }
                    p6.m.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z17);
                    j16 = j10;
                }
                if (j13 != -1) {
                    j13 = j12;
                } else if (i3 != 105) {
                    j13 = Math.min(j13, j12);
                }
                this.a = new LocationRequest(i3, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i10, f10, z15, j16 == -1 ? j12 : j16, i11, i12, str3, z16, new WorkSource(workSource), jVar);
            }
            jVar = jVar2;
            workSource = null;
        }
        j11 = j15;
        boolean z172 = true;
        if (z10) {
        }
        if (z11) {
        }
        if (str == null) {
        }
        if (z12) {
        }
        if (z13) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        if (j13 != -1) {
        }
        this.a = new LocationRequest(i3, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i10, f10, z15, j16 == -1 ? j12 : j16, i11, i12, str3, z16, new WorkSource(workSource), jVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return p6.m.k(this.a, ((l) obj).a);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.a, i3);
        j8.a.t(parcel, s6);
    }
}
