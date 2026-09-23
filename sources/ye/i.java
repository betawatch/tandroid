package ye;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class i {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String a2 = af.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a10 = sb2 != null ? af.a.a(sb2.toString()) : null;
            String str = this.e;
            bf.m mVar = new bf.m();
            mVar.g = str;
            mVar.h = a2;
            mVar.i = a10;
            this.c.add(mVar);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
