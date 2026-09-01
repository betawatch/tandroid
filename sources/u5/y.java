package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import r5.c0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new c0(12);
    public final int a;
    public final boolean b;
    public final boolean c;

    public y(int i10, boolean z4, boolean z10) {
        this.a = i10;
        this.b = z4;
        this.c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b && this.c == yVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.r(parcel, q10);
    }
}
