package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l0 extends c6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(12);
    public final int a;
    public final short b;
    public final short c;

    public l0(int i10, short s6, short s9) {
        this.a = i10;
        this.b = s6;
        this.c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a == l0Var.a && this.b == l0Var.b && this.c == l0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        f5.r(parcel, q10);
    }
}
