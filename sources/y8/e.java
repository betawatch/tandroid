package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.h(parcel, 2, this.a);
        cc.l(parcel, 4, this.b);
        cc.l(parcel, 5, this.c);
        cc.h(parcel, 6, this.d);
        boolean z10 = this.e;
        cc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 8, this.f);
        cc.s(parcel, r10);
    }
}
