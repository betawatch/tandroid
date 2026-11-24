// default package

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zt0 extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final q7c c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final yt0 n;
    public final /* synthetic */ au0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(au0 au0Var, Context context, int i) {
        super(context);
        int i2;
        ylb ylbVar;
        sy4 sy4Var;
        this.r = au0Var;
        this.b = new ArrayList();
        this.d = "";
        this.n = new yt0(this, (byte) 0);
        this.a = i;
        setClipChildren(false);
        setClipToPadding(false);
        i2 = ((d) au0Var).currentAccount;
        int classGuid = au0Var.getClassGuid();
        f fVar = new f(this, (byte) 18);
        xg0 xg0Var = new xg0(this, (byte) 14);
        ylbVar = ((d) au0Var).resourceProvider;
        q7c q7cVar = new q7c(context, i2, classGuid, true, fVar, xg0Var, null, ylbVar);
        this.c = q7cVar;
        q7cVar.s1(gm.L(12.0f), gm.L(16.0f), false);
        q7cVar.g3.r = false;
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        q7cVar.setClipToPadding(false);
        q7cVar.setOverScrollMode(0);
        addView(q7cVar, qoe.c(-1.0f, -1));
        sy4Var = ((d) au0Var).glassEngine;
        sy4Var.b(q7cVar);
        q7cVar.j(new y(this, (byte) 9));
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        au0 au0Var = this.r;
        if (au0Var.P || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i4 = this.a;
        tL_payments_getStarsTransactions.inbound = i4 == 1;
        tL_payments_getStarsTransactions.outbound = i4 == 2;
        i = ((d) au0Var).currentAccount;
        tL_payments_getStarsTransactions.peer = oc7.r1(i).i1(au0Var.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.g3.O(false);
        i2 = ((d) au0Var).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new pm(this, str, (byte) 6));
        i3 = ((d) au0Var).currentAccount;
        ConnectionsManager.getInstance(i3).bindRequestToGuid(sendRequest, au0Var.getClassGuid());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.n);
        super.onDetachedFromWindow();
    }
}
