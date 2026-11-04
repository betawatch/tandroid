package t3;

import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements r0 {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).b;
            int i3 = 1;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i3)).a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i3)).b;
                    i3++;
                }
            }
        }
        zb.f(!z10);
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // d2.r0
    public final /* synthetic */ void a(p0 p0Var) {
    }
}
