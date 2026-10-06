package yh;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class g extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final e71 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final rg.s1 n;
    public final /* synthetic */ h r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        li.p pVar;
        this.r = hVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new rg.s1(this, 22);
        this.a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
        int classGuid = hVar.getClassGuid();
        hi.a aVar = new hi.a(this, 22);
        r2.s sVar = new r2.s(this, 21);
        d6Var = ((org.telegram.ui.ActionBar.n2) hVar).resourceProvider;
        e71 e71Var = new e71(context, i11, classGuid, true, aVar, sVar, null, d6Var);
        this.c = e71Var;
        e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        e71Var.f3.r = false;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        e71Var.setClipToPadding(false);
        e71Var.setOverScrollMode(0);
        addView(e71Var, w7.z5.c(-1.0f, -1));
        pVar = ((org.telegram.ui.ActionBar.n2) hVar).glassEngine;
        pVar.b(e71Var);
        e71Var.j(new xb0(this, 19));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        h hVar = this.r;
        if (hVar.O || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i13 = this.a;
        tL_payments_getStarsTransactions.inbound = i13 == 1;
        tL_payments_getStarsTransactions.outbound = i13 == 2;
        i10 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(hVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.f3.N(false);
        i11 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new si1(7, this, str));
        i12 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
        ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, hVar.getClassGuid());
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
