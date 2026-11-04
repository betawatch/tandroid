package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new q8.i(8);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public m(f fVar, long j10, int i3, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.a = fVar;
        this.b = j10;
        this.c = i3;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.a, i3);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.e, i3);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.n);
        j8.a.m(parcel, 9, this.r);
        j8.a.t(parcel, s6);
    }
}
