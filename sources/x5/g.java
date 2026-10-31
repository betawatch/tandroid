package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(28);
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
        l.g(str);
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
        return l.k(this.a, gVar.a) && l.k(this.b, gVar.b) && l.k(this.c, gVar.c) && l.k(this.d, gVar.d) && l.k(this.e, gVar.e) && l.k(this.f, gVar.f) && l.k(this.h, gVar.h) && l.k(this.n, gVar.n) && l.k(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.l(parcel, 2, this.b);
        h0.l(parcel, 3, this.c);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.l(parcel, 6, this.f);
        h0.l(parcel, 7, this.h);
        h0.l(parcel, 8, this.n);
        h0.k(parcel, 9, this.r, i10);
        h0.r(parcel, q6);
    }
}
