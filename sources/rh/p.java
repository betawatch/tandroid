package rh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public long f;
    public boolean h;
    public boolean i;
    public String j;
    public final ArrayList e = new ArrayList();
    public int g = 1;

    public p(int i10, long j10) {
        this.h = false;
        this.i = false;
        this.j = null;
        this.a = i10;
        this.b = j10;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.d = false;
            this.i = false;
            this.f = 0L;
            this.j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        if (this.h || this.i || this.d) {
            return;
        }
        this.f = System.currentTimeMillis();
        this.h = true;
        TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
        int i10 = this.a;
        getsuggestedstarrefbots.peer = vp.r1(i10).i1(this.b);
        getsuggestedstarrefbots.limit = 20;
        int i11 = this.g;
        getsuggestedstarrefbots.order_by_date = i11 == 3;
        getsuggestedstarrefbots.order_by_revenue = i11 == 2;
        if (TextUtils.isEmpty(this.j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.j;
        }
        ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ag.c(this, 15));
    }
}
