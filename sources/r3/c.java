package r3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c implements o0 {
    public final ArrayList a;

    public c(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((b) arrayList.get(0)).b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i10)).a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((b) arrayList.get(i10)).b;
                    i10++;
                }
            }
        }
        e2.d.b(!z10);
    }

    @Override // b2.o0
    public final /* synthetic */ s a() {
        return null;
    }

    @Override // b2.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // b2.o0
    public final /* synthetic */ void b(m0 m0Var) {
    }
}
