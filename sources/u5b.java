// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5b implements qcc {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ u5b(v5b v5bVar, boolean z, int i, List list) {
        this.a = v5bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override // qcc
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
