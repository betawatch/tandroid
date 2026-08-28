package q5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new o5.p(9);
    public double a;
    public boolean b;
    public int c;
    public m5.d d;
    public int e;
    public m5.x f;
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
            m5.x xVar = this.f;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        double d = this.a;
        p8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 5, this.d, i9);
        int i11 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        p8.k(parcel, 7, this.f, i9);
        double d9 = this.h;
        p8.s(parcel, 8, 8);
        parcel.writeDouble(d9);
        p8.r(parcel, q10);
    }
}
