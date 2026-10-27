package y5;

import a8.df;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d7.u;
import java.util.Arrays;
import o6.l;
import w8.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(29);
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
        l.h(str);
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
        return l.l(this.a, gVar.a) && l.l(this.b, gVar.b) && l.l(this.c, gVar.c) && l.l(this.d, gVar.d) && l.l(this.e, gVar.e) && l.l(this.f, gVar.f) && l.l(this.h, gVar.h) && l.l(this.n, gVar.n) && l.l(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.l(parcel, 2, this.b);
        df.l(parcel, 3, this.c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.l(parcel, 6, this.f);
        df.l(parcel, 7, this.h);
        df.l(parcel, 8, this.n);
        df.k(parcel, 9, this.r, i10);
        df.r(parcel, q5);
    }
}
