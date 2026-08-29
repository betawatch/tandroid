package q8;

import i7.o6;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends j {
    public final Object a;
    public int b;
    public final /* synthetic */ p c;

    public o(p pVar, int i10) {
        this.c = pVar;
        Object obj = p.s;
        this.a = pVar.i()[i10];
        this.b = i10;
    }

    public final void a() {
        int i10 = this.b;
        Object obj = this.a;
        p pVar = this.c;
        if (i10 != -1 && i10 < pVar.size()) {
            if (o6.a(obj, pVar.i()[this.b])) {
                return;
            }
        }
        Object obj2 = p.s;
        this.b = pVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        p pVar = this.c;
        Map b10 = pVar.b();
        if (b10 != null) {
            return b10.get(this.a);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            return null;
        }
        return pVar.j()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        p pVar = this.c;
        Map b10 = pVar.b();
        Object obj2 = this.a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.b;
        if (i10 == -1) {
            pVar.put(obj2, obj);
            return null;
        }
        Object obj3 = pVar.j()[i10];
        pVar.j()[this.b] = obj;
        return obj3;
    }
}
