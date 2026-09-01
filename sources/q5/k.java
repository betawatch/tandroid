package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.g5;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k extends c6.a {
    public final MediaInfo a;
    public final n b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    public String h;
    public final JSONObject n;
    public final String r;
    public final String s;
    public final String v;
    public final String w;
    public final long x;
    public static final u5.b y = new u5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.a = mediaInfo;
        this.b = nVar;
        this.c = bool;
        this.d = j10;
        this.e = d;
        this.f = jArr;
        this.n = jSONObject;
        this.r = str;
        this.s = str2;
        this.v = str3;
        this.w = str4;
        this.x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i6.c.a(this.n, kVar.n) && b6.m.l(this.a, kVar.a) && b6.m.l(this.b, kVar.b) && b6.m.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && b6.m.l(this.r, kVar.r) && b6.m.l(this.s, kVar.s) && b6.m.l(this.v, kVar.v) && b6.m.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.k(parcel, 3, this.b, i10);
        g5.a(parcel, 4, this.c);
        g5.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g5.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        g5.j(parcel, 7, this.f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.r);
        g5.l(parcel, 10, this.s);
        g5.l(parcel, 11, this.v);
        g5.l(parcel, 12, this.w);
        g5.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        g5.r(parcel, q10);
    }
}
