package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Locale;
import q4.x;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.a = fVar;
        this.b = j3;
        this.c = i7;
        this.d = str;
        this.e = eVar;
        this.f = z9;
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.a, i7);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        wb.l(parcel, 4, this.d);
        wb.k(parcel, 5, this.e, i7);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        wb.l(parcel, 9, this.r);
        wb.s(parcel, r10);
    }
}
