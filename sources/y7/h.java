package y7;

import a8.eh;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends eh {
    public final Object b;
    public int c;
    public final /* synthetic */ i d;

    public h(i iVar, int i10) {
        super(1, false);
        this.d = iVar;
        Object[] objArr = iVar.c;
        objArr.getClass();
        this.b = objArr[i10];
        this.c = i10;
    }

    public final void a() {
        int i10 = this.c;
        Object obj = this.b;
        i iVar = this.d;
        if (i10 != -1 && i10 < iVar.size()) {
            int i11 = this.c;
            Object[] objArr = iVar.c;
            objArr.getClass();
            if (w7.h5.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = i.s;
        this.c = iVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        i iVar = this.d;
        Map a2 = iVar.a();
        if (a2 != null) {
            return a2.get(this.b);
        }
        a();
        int i10 = this.c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        i iVar = this.d;
        Map a2 = iVar.a();
        Object obj2 = this.b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.c;
        if (i10 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = iVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.c;
        Object[] objArr2 = iVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
