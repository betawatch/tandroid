package rh;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.sl0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final v51 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final ph.x1 n;
    public final /* synthetic */ i r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        ei.r rVar;
        this.r = iVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new ph.x1(this, 8);
        this.a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        int classGuid = iVar.getClassGuid();
        qh.d dVar = new qh.d(this, 2);
        mg.l lVar = new mg.l(this, 29);
        p6Var = ((org.telegram.ui.ActionBar.k2) iVar).resourceProvider;
        v51 v51Var = new v51(context, i11, classGuid, true, dVar, lVar, null, p6Var);
        this.c = v51Var;
        v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        v51Var.f3.r = false;
        v51Var.setCaptureSectionsDecoratorAllowed(true);
        v51Var.setClipToPadding(false);
        v51Var.setOverScrollMode(0);
        addView(v51Var, w7.b6.c(-1.0f, -1));
        rVar = ((org.telegram.ui.ActionBar.k2) iVar).glassEngine;
        rVar.b(v51Var);
        v51Var.j(new cu0(this, 16));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        i iVar = this.r;
        if (iVar.O || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i13 = this.a;
        tL_payments_getStarsTransactions.inbound = i13 == 1;
        tL_payments_getStarsTransactions.outbound = i13 == 2;
        i10 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        tL_payments_getStarsTransactions.peer = wp.r1(i10).i1(iVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.f3.O(false);
        i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new sl0(24, this, str));
        i12 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, iVar.getClassGuid());
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
