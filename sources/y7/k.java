package y7;

import a8.dh;
import a8.eh;
import java.io.Serializable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends eh implements Serializable {
    public final Object b;
    public final dh c;

    public k(Object obj, dh dhVar) {
        super(1, false);
        this.b = obj;
        this.c = dhVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
