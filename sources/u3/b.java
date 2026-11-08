package u3;

import a8.ia;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements p0 {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i7)).a < j3) {
                    z9 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).b;
                    i7++;
                }
            }
        }
        ia.f(!z9);
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
        return null;
    }

    @Override // e2.p0
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

    @Override // e2.p0
    public final /* synthetic */ void b(n0 n0Var) {
    }
}
