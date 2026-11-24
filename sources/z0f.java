// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z0f extends x23 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0f(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override // x23
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                jye jyeVar = (jye) obj;
                cg7 c = cg7.c();
                return new uze(c.b(), (uha) c.a(uha.class), new bze(cg7.c().b(), jyeVar), jyeVar.a);
            case 1:
                cg7 c2 = cg7.c();
                return new h3f(c2.b(), (uha) c2.a(uha.class), new y2f(cg7.c().b(), (l2f) obj));
            case 2:
                cg7 c3 = cg7.c();
                return new b6f(c3.b(), (uha) c3.a(uha.class), new p5f(cg7.c().b(), (i5f) obj));
            case 3:
                cg7 c4 = cg7.c();
                Context b = cg7.c().b();
                ArrayList arrayList = new ArrayList();
                ((lef) obj).getClass();
                tad tadVar = new tad();
                p61 p61Var = p61.e;
                i3c.b(b);
                i3c.a().c(p61Var);
                p61.d.contains(new d44("json"));
                arrayList.add(tadVar);
                return new iff(c4.b(), (uha) c4.a(uha.class));
            default:
                cg7 c5 = cg7.c();
                return new tgf(c5.b(), (uha) c5.a(uha.class), new ogf(cg7.c().b(), (hgf) obj));
        }
    }
}
