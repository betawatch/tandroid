package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new w7.i(25);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public m(f fVar, long j10, int i9, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.a = fVar;
        this.b = j10;
        this.c = i9;
        this.d = str;
        this.e = eVar;
        this.f = z10;
        this.h = i10;
        this.n = i11;
        this.r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.a + ", timestamp=" + this.b + ", usageType=" + this.c + ", status=" + this.n + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.e, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        p8.l(parcel, 9, this.r);
        p8.r(parcel, q10);
    }
}
