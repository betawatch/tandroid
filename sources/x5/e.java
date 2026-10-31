package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(22);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.g(dVar);
        this.a = dVar;
        l.g(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z10;
        this.e = i10;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.k(this.a, eVar.a) && l.k(this.b, eVar.b) && l.k(this.f, eVar.f) && l.k(this.h, eVar.h) && l.k(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.a, i10);
        h0.k(parcel, 2, this.b, i10);
        h0.l(parcel, 3, this.c);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        h0.k(parcel, 6, this.f, i10);
        h0.k(parcel, 7, this.h, i10);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        h0.r(parcel, q6);
    }
}
