package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(19);
    public final int a;
    public final Float b;

    public h(int i10, Float f10) {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && m.l(this.b, hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        g5.e(parcel, 3, this.b);
        g5.r(parcel, q10);
    }
}
