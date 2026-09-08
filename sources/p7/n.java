package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        e0.l(parcel, 9, this.r);
        e0.r(parcel, q6);
    }
}
