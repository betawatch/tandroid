package s5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(21);
    public double a;
    public boolean b;
    public int c;
    public o5.d d;
    public int e;
    public o5.x f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            o5.x xVar = this.f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        double d = this.a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f, i10);
        double d10 = this.h;
        com.google.android.gms.internal.cast.o.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
