package u3;

import a8.ja;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b implements p0 {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i7)).a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).b;
                    i7++;
                }
            }
        }
        ja.f(!z10);
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
