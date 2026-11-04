package vb;

import b8.ke;
import mb.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements t9.d {
    public static final /* synthetic */ f b = new f(0);
    public static final /* synthetic */ f c = new f(1);
    public static final /* synthetic */ f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i3) {
        this.a = i3;
    }

    @Override // t9.d
    public final Object q1(ke keVar) {
        switch (this.a) {
            case 0:
                return new d((g) keVar.a(g.class));
            case 1:
                return new c((d) keVar.a(d.class), (mb.d) keVar.a(mb.d.class));
            default:
                return new sb.b(keVar.f(c.class));
        }
    }
}
