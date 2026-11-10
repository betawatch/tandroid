package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final l r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = z9;
        this.d = i7;
        this.e = z10;
        this.f = str3;
        this.h = hVarArr;
        this.n = str4;
        this.r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && q6.m.k(this.a, kVar.a) && q6.m.k(this.b, kVar.b) && q6.m.k(this.f, kVar.f) && q6.m.k(this.n, kVar.n) && q6.m.k(this.r, kVar.r) && Arrays.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.l(parcel, 2, this.b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        xb.l(parcel, 6, this.f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.n);
        xb.k(parcel, 12, this.r, i7);
        xb.s(parcel, r10);
    }
}
