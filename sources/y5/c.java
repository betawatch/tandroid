package y5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(21);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
    }

    public final long e() {
        long j10 = this.c;
        return j10 == -1 ? this.b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && e() == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(e())});
    }

    public final String toString() {
        af.c cVar = new af.c(this);
        cVar.s(this.a, "name");
        cVar.s(Long.valueOf(e()), "version");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long e = e();
        f5.s(parcel, 3, 8);
        parcel.writeLong(e);
        f5.r(parcel, q10);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
