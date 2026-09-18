package x7;

import java.io.Serializable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l extends d implements Serializable {
    public final Object b;
    public final e9.l c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
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
