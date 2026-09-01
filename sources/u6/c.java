package u6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(17);
    public final boolean a;

    public c(boolean z4) {
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
