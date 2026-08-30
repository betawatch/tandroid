package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
import r5.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(13);
    public double a;
    public boolean b;
    public int c;
    public q5.d d;
    public int e;
    public q5.x f;
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
            q5.x xVar = this.f;
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
        int q10 = f5.q(parcel, 20293);
        double d = this.a;
        f5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z4 = this.b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i11 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        f5.k(parcel, 7, this.f, i10);
        double d10 = this.h;
        f5.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        f5.r(parcel, q10);
    }
}
