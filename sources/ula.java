// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ula implements lf7 {
    public final ArrayList a;

    public ula(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((tla) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((tla) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((tla) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        jte.f(!z);
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ula.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ula) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
