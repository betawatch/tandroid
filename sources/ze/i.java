package ze;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            String a2 = bf.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a10 = sb2 != null ? bf.a.a(sb2.toString()) : null;
            String str = this.e;
            cf.m mVar = new cf.m();
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
