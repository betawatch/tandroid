package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
import q6.w;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int a;
    public final w b;

    public g(int i7, w wVar) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.s(parcel, r10);
    }
}
