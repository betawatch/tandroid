package u7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import r6.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new l(24);
    public final int a;
    public final Float b;

    public h(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        y5.l.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z10);
        this.a = i10;
        this.b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && y5.l.l(this.b, hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        r8.e(parcel, 3, this.b);
        r8.r(parcel, q6);
    }
}
