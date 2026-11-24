// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1b implements q8c {
    public final /* synthetic */ y1b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ x1b(y1b y1bVar, boolean z, int i, List list) {
        this.a = y1bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override // q8c
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
