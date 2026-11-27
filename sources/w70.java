// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w70 extends ck {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public w70(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        if (!this.a.equals(((w70) ckVar).a)) {
            return false;
        }
        if (!this.b.equals(((w70) ckVar).b)) {
            return false;
        }
        if (!this.c.equals(((w70) ckVar).c)) {
            return false;
        }
        if (!this.d.equals(((w70) ckVar).d)) {
            return false;
        }
        if (!this.e.equals(((w70) ckVar).e)) {
            return false;
        }
        if (!this.f.equals(((w70) ckVar).f)) {
            return false;
        }
        if (!this.g.equals(((w70) ckVar).g)) {
            return false;
        }
        if (!this.h.equals(((w70) ckVar).h)) {
            return false;
        }
        if (!this.i.equals(((w70) ckVar).i)) {
            return false;
        }
        if (!this.j.equals(((w70) ckVar).j)) {
            return false;
        }
        if (this.k.equals(((w70) ckVar).k)) {
            return this.l.equals(((w70) ckVar).l);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return c00.k(sb, this.l, "}");
    }
}
