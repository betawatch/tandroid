package r3;

import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b implements t0 {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i10)).a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i10)).b;
                    i10++;
                }
            }
        }
        yb.g(!z10);
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
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

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
