package rb;

import com.google.firebase.messaging.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final pb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ j4.c e;

    public f(j4.c cVar, pb.d dVar, int i9, int i10, int i11) {
        this.e = cVar;
        this.a = dVar;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    public final int a() {
        pb.d dVar = this.a;
        pb.d dVar2 = pb.d.h;
        int i9 = this.d;
        if (dVar != dVar2) {
            return i9;
        }
        l lVar = (l) this.e.d;
        lb.e eVar = (lb.e) lVar.c;
        String str = (String) lVar.b;
        int i10 = this.b;
        return str.substring(i10, i9 + i10).getBytes(eVar.a[this.c].charset()).length;
    }

    public final String toString() {
        l lVar = (l) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        pb.d dVar = this.a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == pb.d.n) {
            lb.e eVar = (lb.e) lVar.c;
            sb2.append(eVar.a[this.c].charset().displayName());
        } else {
            String str = (String) lVar.b;
            int i9 = this.d;
            int i10 = this.b;
            String substring = str.substring(i10, i9 + i10);
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < substring.length(); i11++) {
                if (substring.charAt(i11) < ' ' || substring.charAt(i11) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(substring.charAt(i11));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
