package t7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new j(15);
    public final int a;
    public final Float b;

    public h(int i9, Float f10) {
        boolean z10 = true;
        if (i9 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i9 + " length=" + f10, z10);
        this.a = i9;
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
        return this.a == hVar.a && l.l(this.b, hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.e(parcel, 3, this.b);
        p8.r(parcel, q10);
    }
}
