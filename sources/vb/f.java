package vb;

import s5.m;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f {
    public final tb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ m e;

    public f(m mVar, tb.d dVar, int i10, int i11, int i12) {
        this.e = mVar;
        this.a = dVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final int a() {
        tb.d dVar = this.a;
        tb.d dVar2 = tb.d.h;
        int i10 = this.d;
        if (dVar != dVar2) {
            return i10;
        }
        cb.m mVar = (cb.m) this.e.d;
        pb.e eVar = (pb.e) mVar.c;
        String str = (String) mVar.b;
        int i11 = this.b;
        return str.substring(i11, i10 + i11).getBytes(eVar.a[this.c].charset()).length;
    }

    public final String toString() {
        cb.m mVar = (cb.m) this.e.d;
        StringBuilder sb = new StringBuilder();
        tb.d dVar = this.a;
        sb.append(dVar);
        sb.append('(');
        if (dVar == tb.d.n) {
            pb.e eVar = (pb.e) mVar.c;
            sb.append(eVar.a[this.c].charset().displayName());
        } else {
            String str = (String) mVar.b;
            int i10 = this.d;
            int i11 = this.b;
            String substring = str.substring(i11, i10 + i11);
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) < ' ' || substring.charAt(i12) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i12));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
