package z7;

import b8.bh;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends bh {
    public final Object b;
    public int c;
    public final /* synthetic */ i d;

    public h(i iVar, int i3) {
        super(1, false);
        this.d = iVar;
        Object[] objArr = iVar.c;
        objArr.getClass();
        this.b = objArr[i3];
        this.c = i3;
    }

    public final void a() {
        int i3 = this.c;
        Object obj = this.b;
        i iVar = this.d;
        if (i3 != -1 && i3 < iVar.size()) {
            int i10 = this.c;
            Object[] objArr = iVar.c;
            objArr.getClass();
            if (x7.w6.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = i.s;
        this.c = iVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        i iVar = this.d;
        Map b10 = iVar.b();
        if (b10 != null) {
            return b10.get(this.b);
        }
        a();
        int i3 = this.c;
        if (i3 == -1) {
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        return objArr[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        i iVar = this.d;
        Map b10 = iVar.b();
        Object obj2 = this.b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i3 = this.c;
        if (i3 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        Object obj3 = objArr[i3];
        int i10 = this.c;
        Object[] objArr2 = iVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
