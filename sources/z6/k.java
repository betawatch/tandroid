package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new w7.i(23);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final l r;

    public k(String str, String str2, boolean z10, int i9, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = i9;
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
        return this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && x5.l.l(this.a, kVar.a) && x5.l.l(this.b, kVar.b) && x5.l.l(this.f, kVar.f) && x5.l.l(this.n, kVar.n) && x5.l.l(this.r, kVar.r) && Arrays.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.l(parcel, 2, this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        p8.l(parcel, 6, this.f);
        p8.o(parcel, 7, this.h, i9);
        p8.l(parcel, 11, this.n);
        p8.k(parcel, 12, this.r, i9);
        p8.r(parcel, q10);
    }
}
