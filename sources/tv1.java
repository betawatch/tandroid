// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tv1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tv1(int i, int i2, long j, String str, boolean z) {
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
                int i = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj).F1(this.c, this.b, this.e, this.d, false);
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
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: bt7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hl.c3(new uv1(tLObject, i2, z, j, i3, str));
                    }
                });
                break;
        }
    }

    public /* synthetic */ tv1(ChatActivityEnterView chatActivityEnterView, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.c = z;
        this.b = i;
        this.e = i2;
        this.d = j;
    }
}
