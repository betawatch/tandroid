package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.h(parcel, 2, this.a);
        df.l(parcel, 4, this.b);
        df.l(parcel, 5, this.c);
        df.h(parcel, 6, this.d);
        boolean z10 = this.e;
        df.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 8, this.f);
        df.r(parcel, q5);
    }
}
