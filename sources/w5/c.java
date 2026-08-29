package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(0);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
    }

    public final long b() {
        long j10 = this.c;
        return j10 == -1 ? this.b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        v5.n nVar = new v5.n(this);
        nVar.g(this.a, "name");
        nVar.g(Long.valueOf(b()), "version");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(b10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
