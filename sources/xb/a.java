package xb;

import b8.ke;
import mb.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements t9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i3) {
        this.a = i3;
    }

    @Override // t9.d
    public final Object q1(ke keVar) {
        switch (this.a) {
            case 0:
                return new c((g) keVar.a(g.class));
            default:
                return new b((c) keVar.a(c.class), (mb.d) keVar.a(mb.d.class));
        }
    }
}
