package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean a;
    public boolean b;
    public c c;
    public boolean d;
    public m e;
    public ArrayList f;
    public l h;
    public n n;
    public boolean r;
    public String s;
    public Bundle w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        boolean z9 = this.a;
        wb.q(parcel, 1, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.b;
        wb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        wb.k(parcel, 3, this.c, i7);
        boolean z11 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        wb.k(parcel, 5, this.e, i7);
        wb.h(parcel, 6, this.f);
        wb.k(parcel, 7, this.h, i7);
        wb.k(parcel, 8, this.n, i7);
        boolean z12 = this.r;
        wb.q(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        wb.l(parcel, 10, this.s);
        wb.b(parcel, 11, this.w);
        wb.s(parcel, r10);
    }
}
