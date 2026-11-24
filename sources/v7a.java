// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v7a {
    public static final u7a Companion = new u7a();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public /* synthetic */ v7a(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            dte.a(i, 31, t7a.a.d());
            throw null;
        }
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7a)) {
            return false;
        }
        v7a v7aVar = (v7a) obj;
        return rr5.a(this.a, v7aVar.a) && rr5.a(this.b, v7aVar.b) && rr5.a(this.c, v7aVar.c) && rr5.a(this.d, v7aVar.d) && rr5.a(this.e, v7aVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public v7a(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
