package sb;

import com.google.firebase.messaging.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public final qb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ j9.a e;

    public f(j9.a aVar, qb.d dVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.a = dVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        qb.d dVar = this.a;
        qb.d dVar2 = qb.d.h;
        int i10 = this.d;
        if (dVar != dVar2) {
            return i10;
        }
        l lVar = (l) this.e.d;
        mb.e eVar = (mb.e) lVar.c;
        String str = (String) lVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(eVar.a[this.c].charset()).length;
    }

    public final String toString() {
        l lVar = (l) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        qb.d dVar = this.a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == qb.d.n) {
            mb.e eVar = (mb.e) lVar.c;
            sb2.append(eVar.a[this.c].charset().displayName());
        } else {
            String str = (String) lVar.b;
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
