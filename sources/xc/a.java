package xc;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends c {
    public final a e;
    public ArrayList f;

    public a(String str, int i3, Map map, a aVar) {
        super(i3, str, map);
        this.e = aVar;
    }

    @Override // xc.c
    public final Map a() {
        return this.c;
    }

    public final void b(int i3) {
        if (this.d > -1) {
            return;
        }
        this.d = i3;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b(i3);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.a);
        sb2.append("', start=");
        sb2.append(this.b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.c);
        sb2.append(", parent=");
        a aVar = this.e;
        sb2.append(aVar != null ? aVar.a : null);
        sb2.append(", children=");
        sb2.append(this.f);
        sb2.append('}');
        return sb2.toString();
    }
}
