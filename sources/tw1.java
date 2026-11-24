// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tw1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tw1(int i, int i2, long j, String str, boolean z) {
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj).x1(this.c, this.b, this.e, this.d, false);
                break;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i2 = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                final int i3 = this.e;
                final long j = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: cs7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gm.c3(new uw1(tLObject, i2, z, j, i3, str));
                    }
                });
                break;
        }
    }

    public /* synthetic */ tw1(ChatActivityEnterView chatActivityEnterView, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.c = z;
        this.b = i;
        this.e = i2;
        this.d = j;
    }
}
