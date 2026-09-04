package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final m r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = i10;
        this.e = z11;
        this.f = str3;
        this.h = hVarArr;
        this.n = str4;
        this.r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.c == lVar.c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.a, lVar.a) && n6.l.l(this.b, lVar.b) && n6.l.l(this.f, lVar.f) && n6.l.l(this.n, lVar.n) && n6.l.l(this.r, lVar.r) && Arrays.equals(this.h, lVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.a);
        e0.l(parcel, 2, this.b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.n);
        e0.k(parcel, 12, this.r, i10);
        e0.r(parcel, q6);
    }
}
