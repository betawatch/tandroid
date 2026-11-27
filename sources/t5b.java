// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5b implements qcc {
    public final /* synthetic */ u5b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ t5b(u5b u5bVar, boolean z, int i, List list) {
        this.a = u5bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override // qcc
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
