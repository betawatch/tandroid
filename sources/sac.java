// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sac extends wl5 {
    public final String b;
    public final String c;

    public sac(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sac.class != obj.getClass()) {
            return false;
        }
        sac sacVar = (sac) obj;
        return this.a.equals(sacVar.a) && Objects.equals(this.b, sacVar.b) && this.c.equals(sacVar.c);
    }

    public final int hashCode() {
        int j = bs2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
