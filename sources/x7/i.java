package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new p(19);
    public final int a;
    public final Float b;

    public i(int i10, Float f10) {
        boolean z4 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z4 = false;
        }
        m.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z4);
        this.a = i10;
        this.b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && m.l(this.b, iVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.e(parcel, 3, this.b);
        f5.r(parcel, q10);
    }
}
