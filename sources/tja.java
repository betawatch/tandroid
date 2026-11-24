// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tja implements jd7 {
    public final ArrayList a;

    public tja(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((sja) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((sja) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((sja) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        gre.f(!z);
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tja.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tja) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
