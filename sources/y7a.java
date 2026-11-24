// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y7a {
    public static final x7a Companion = new x7a();
    public static final d26[] d = {null, null, fpe.a(new hf8())};
    public final c8a a;
    public final ppb b;
    public final Map c;

    public /* synthetic */ y7a(int i, c8a c8aVar, ppb ppbVar, Map map) {
        if (1 != (i & 1)) {
            dte.a(i, 1, w7a.a.d());
            throw null;
        }
        this.a = c8aVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ppbVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static y7a a(y7a y7aVar, c8a c8aVar, ppb ppbVar, Map map, int i) {
        if ((i & 1) != 0) {
            c8aVar = y7aVar.a;
        }
        if ((i & 2) != 0) {
            ppbVar = y7aVar.b;
        }
        if ((i & 4) != 0) {
            map = y7aVar.c;
        }
        y7aVar.getClass();
        c8aVar.getClass();
        return new y7a(c8aVar, ppbVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7a)) {
            return false;
        }
        y7a y7aVar = (y7a) obj;
        return rr5.a(this.a, y7aVar.a) && rr5.a(this.b, y7aVar.b) && rr5.a(this.c, y7aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ppb ppbVar = this.b;
        int hashCode2 = (hashCode + (ppbVar == null ? 0 : ppbVar.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public y7a(c8a c8aVar, ppb ppbVar, Map map) {
        c8aVar.getClass();
        this.a = c8aVar;
        this.b = ppbVar;
        this.c = map;
    }
}
