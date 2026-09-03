package z5;

import b6.m;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a {
    public final DataHolder a;
    public final int b;
    public final int c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.a = dataHolder;
        boolean z4 = false;
        if (i10 >= 0 && i10 < dataHolder.n) {
            z4 = true;
        }
        m.k(z4);
        this.b = i10;
        this.c = dataHolder.e(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.b), Integer.valueOf(this.b)) && m.l(Integer.valueOf(aVar.c), Integer.valueOf(this.c)) && aVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
