package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float a;
    public final float b;
    public final float c;

    public w(float f10, float f11, float f12) {
        this.a = f10;
        this.b = f11;
        this.c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeFloat(this.a);
        f5.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        f5.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        f5.r(parcel, q10);
    }
}
