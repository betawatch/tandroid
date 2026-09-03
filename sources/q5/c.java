package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final u5.b f = new u5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = str;
        this.d = str2;
        this.e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && u5.a.d(this.c, cVar.c) && u5.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        f5.r(parcel, q10);
    }
}
