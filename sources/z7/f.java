package z7;

import java.io.Serializable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f extends x7.d implements Serializable {
    public final Object b;
    public final e9.l c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.b = obj;
        this.c = lVar;
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
