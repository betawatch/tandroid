package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p6.m;
import y8.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new i(1);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z10, int i3, c cVar, b bVar, boolean z11) {
        m.g(dVar);
        this.a = dVar;
        m.g(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z10;
        this.e = i3;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.k(this.a, eVar.a) && m.k(this.b, eVar.b) && m.k(this.f, eVar.f) && m.k(this.h, eVar.h) && m.k(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.a, i3);
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.m(parcel, 3, this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        j8.a.l(parcel, 6, this.f, i3);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
