package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.i(28);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final l r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = i10;
        this.e = z11;
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
        return this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && n6.l.k(this.a, kVar.a) && n6.l.k(this.b, kVar.b) && n6.l.k(this.f, kVar.f) && n6.l.k(this.n, kVar.n) && n6.l.k(this.r, kVar.r) && Arrays.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.l(parcel, 2, this.b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.l(parcel, 6, this.f);
        h0.o(parcel, 7, this.h, i10);
        h0.l(parcel, 11, this.n);
        h0.k(parcel, 12, this.r, i10);
        h0.r(parcel, q6);
    }
}
