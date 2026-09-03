package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(18);
    public final boolean a;

    public d(boolean z4) {
        this.a = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.s(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        g5.r(dest, q10);
    }
}
