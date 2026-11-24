// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w5a {
    public static final v5a Companion = new v5a();
    public static final d06[] d = {null, null, cne.a(new fd8())};
    public final a6a a;
    public final onb b;
    public final Map c;

    public /* synthetic */ w5a(int i, a6a a6aVar, onb onbVar, Map map) {
        if (1 != (i & 1)) {
            are.a(i, 1, u5a.a.d());
            throw null;
        }
        this.a = a6aVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = onbVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static w5a a(w5a w5aVar, a6a a6aVar, onb onbVar, Map map, int i) {
        if ((i & 1) != 0) {
            a6aVar = w5aVar.a;
        }
        if ((i & 2) != 0) {
            onbVar = w5aVar.b;
        }
        if ((i & 4) != 0) {
            map = w5aVar.c;
        }
        w5aVar.getClass();
        a6aVar.getClass();
        return new w5a(a6aVar, onbVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5a)) {
            return false;
        }
        w5a w5aVar = (w5a) obj;
        return rp5.a(this.a, w5aVar.a) && rp5.a(this.b, w5aVar.b) && rp5.a(this.c, w5aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        onb onbVar = this.b;
        int hashCode2 = (hashCode + (onbVar == null ? 0 : onbVar.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public w5a(a6a a6aVar, onb onbVar, Map map) {
        a6aVar.getClass();
        this.a = a6aVar;
        this.b = onbVar;
        this.c = map;
    }
}
