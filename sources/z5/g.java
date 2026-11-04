package z5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import e7.u;
import java.util.Arrays;
import p6.m;
import y8.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final String n;
    public final u r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.g(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.k(this.a, gVar.a) && m.k(this.b, gVar.b) && m.k(this.c, gVar.c) && m.k(this.d, gVar.d) && m.k(this.e, gVar.e) && m.k(this.f, gVar.f) && m.k(this.h, gVar.h) && m.k(this.n, gVar.n) && m.k(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.a);
        j8.a.m(parcel, 2, this.b);
        j8.a.m(parcel, 3, this.c);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.e, i3);
        j8.a.m(parcel, 6, this.f);
        j8.a.m(parcel, 7, this.h);
        j8.a.m(parcel, 8, this.n);
        j8.a.l(parcel, 9, this.r, i3);
        j8.a.t(parcel, s6);
    }
}
