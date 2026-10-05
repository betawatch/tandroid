package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.a = fVar;
        this.b = j3;
        this.c = i10;
        this.d = str;
        this.e = eVar;
        this.f = z10;
        this.h = i11;
        this.n = i12;
        this.r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.a + ", timestamp=" + this.b + ", usageType=" + this.c + ", status=" + this.n + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        g0.l(parcel, 9, this.r);
        g0.r(parcel, q6);
    }
}
