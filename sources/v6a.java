// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v6a implements p6a {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p6a
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                q6a q6aVar = new q6a();
                q6aVar.c = ((kv5) obj).create(q6aVar, q6aVar);
                return q6aVar;
            default:
                return (Iterator) obj;
        }
    }
}
