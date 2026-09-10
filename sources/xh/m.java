package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f;
    public boolean g;
    public boolean h;
    public int i;

    public m(int i10, long j3) {
        this.g = false;
        this.h = false;
        this.a = i10;
        this.b = j3;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.h = false;
            this.d = false;
            if (this.i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.i, true);
                this.i = 0;
            }
            this.g = false;
            a();
        }
    }

    public final void a() {
        if (this.g || this.h || this.d) {
            return;
        }
        this.f = System.currentTimeMillis();
        this.g = true;
        TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
        int i10 = this.a;
        getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.b);
        getconnectedstarrefbots.limit = 20;
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hc.b.i(1, arrayList);
            getconnectedstarrefbots.flags |= 4;
            getconnectedstarrefbots.offset_date = connectedbotstarref.date;
            getconnectedstarrefbots.offset_link = connectedbotstarref.url;
        }
        this.i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.c2(this, 22));
    }
}
