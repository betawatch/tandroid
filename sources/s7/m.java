package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Locale;
import q4.x;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.a = fVar;
        this.b = j3;
        this.c = i7;
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.a, i7);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.e, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        bc.l(parcel, 9, this.r);
        bc.s(parcel, r10);
    }
}
