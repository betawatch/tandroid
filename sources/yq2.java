// default package

import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yq2 implements pr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // pr4
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((hr2) obj).reportFullyDrawn();
                return null;
            case 1:
                ((nj4) obj).a.await();
                return g7c.a;
            default:
                ((wac) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
        }
    }
}
