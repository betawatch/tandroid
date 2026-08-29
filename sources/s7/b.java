package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new s6.i(14);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final d7.j e;

    public b(long j10, int i10, boolean z10, String str, d7.j jVar) {
        this.a = j10;
        this.b = i10;
        this.c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && z5.l.l(this.d, bVar.d) && z5.l.l(this.e, bVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            n10.append("maxAge=");
            d7.p.a(n10, j10);
        }
        int i10 = this.b;
        if (i10 != 0) {
            n10.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            n10.append(str);
        }
        if (this.c) {
            n10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            n10.append(", moduleId=");
            n10.append(str2);
        }
        d7.j jVar = this.e;
        if (jVar != null) {
            n10.append(", impersonation=");
            n10.append(jVar);
        }
        n10.append(']');
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.e, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
