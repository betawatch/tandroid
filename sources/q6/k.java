package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = j10;
        this.f = str;
        this.h = str2;
        this.n = i12;
        this.r = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        wb.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        wb.l(parcel, 6, this.f);
        wb.l(parcel, 7, this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        wb.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        wb.s(parcel, r10);
    }
}
