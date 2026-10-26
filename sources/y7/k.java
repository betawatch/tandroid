package y7;

import a8.dh;
import a8.eh;
import java.io.Serializable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
