package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f a;
    public final long b;
    public final int c;
    public final String d;
    public final e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.a = fVar;
        this.b = j10;
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
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.a, i10);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        df.l(parcel, 9, this.r);
        df.r(parcel, q5);
    }
}
