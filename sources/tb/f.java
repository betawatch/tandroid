package tb;

import ab.m;
import l3.g0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
    public final rb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ g0 e;

    public f(g0 g0Var, rb.d dVar, int i10, int i11, int i12) {
        this.e = g0Var;
        this.a = dVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        rb.d dVar = this.a;
        rb.d dVar2 = rb.d.h;
        int i10 = this.d;
        if (dVar != dVar2) {
            return i10;
        }
        m mVar = (m) this.e.d;
        nb.e eVar = (nb.e) mVar.c;
        String str = (String) mVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(eVar.a[this.c].charset()).length;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        rb.d dVar = this.a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == rb.d.n) {
            nb.e eVar = (nb.e) mVar.c;
            sb2.append(eVar.a[this.c].charset().displayName());
        } else {
            String str = (String) mVar.b;
            int i10 = this.d;
            int i11 = this.b;
            String substring = str.substring(i11, i10 + i11);
            StringBuilder sb3 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) < ' ' || substring.charAt(i12) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(substring.charAt(i12));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
