package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList D;
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public z8.c L;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public int w;
    public ArrayList x;
    public z8.f y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.l(parcel, 3, this.b);
        wb.l(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.e);
        wb.l(parcel, 7, this.f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.n);
        wb.l(parcel, 10, this.r);
        wb.l(parcel, 11, this.s);
        int i10 = this.w;
        wb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        wb.p(parcel, 13, this.x);
        wb.k(parcel, 14, this.y, i7);
        wb.p(parcel, 15, this.D);
        wb.l(parcel, 16, this.E);
        wb.l(parcel, 17, this.F);
        wb.p(parcel, 18, this.G);
        boolean z9 = this.H;
        wb.q(parcel, 19, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.p(parcel, 20, this.I);
        wb.p(parcel, 21, this.J);
        wb.p(parcel, 22, this.K);
        wb.k(parcel, 23, this.L, i7);
        wb.s(parcel, r10);
    }
}
