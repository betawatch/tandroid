// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yje extends jke {
    public final String a;

    public yje(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jke jkeVar = (jke) obj;
        int zza = jkeVar.zza();
        int c = jke.c((byte) 96);
        if (c != zza) {
            return c - jkeVar.zza();
        }
        String str = ((yje) jkeVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yje.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((yje) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(jke.c((byte) 96)), this.a});
    }

    public final String toString() {
        return c00.k(new StringBuilder("\""), this.a, "\"");
    }

    @Override // jke
    public final int zza() {
        return jke.c((byte) 96);
    }
}
