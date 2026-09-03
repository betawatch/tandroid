package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final b7.w0 b;
    public final List c;

    static {
        b7.q.r(2, b7.b.c, b7.b.d);
        CREATOR = new l4.j(29);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        b7.w0 w0Var = b7.w0.c;
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        try {
            this.a = a0.a(str);
            this.b = t6;
            this.c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.c;
        if (!this.a.equals(wVar.a) || !b6.m.l(this.b, wVar.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String c3 = i6.b.c(this.b.u());
        return android.support.v4.media.a.r(ai.l("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        this.a.getClass();
        f5.l(parcel, 2, "public-key");
        f5.c(parcel, 3, this.b.u());
        f5.p(parcel, 4, this.c);
        f5.r(parcel, q10);
    }
}
