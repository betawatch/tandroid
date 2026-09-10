package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ to(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = j3;
        this.b = obj3;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        int i11 = 0;
        long j3 = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                yo.X((yo) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.c, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                xh.x3.d0((xh.x3) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.c, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 2:
                zh.l lVar = (zh.l) obj4;
                zh.k kVar = (zh.k) obj2;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    bi.ce E = bi.ce.E(lVar.e0.getParentActivity(), lVar.f);
                    E.N = j3;
                    bi.qd qdVar = E.c1;
                    if (qdVar != null) {
                        qdVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(bi.xd.c(kVar));
                    break;
                }
                break;
            case 3:
                zh.i5 i5Var = (zh.i5) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.c;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new to(i5Var, hVar, j10, tL_premium_boostsStatus, 4));
                    hVar.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar.accept(Boolean.FALSE);
                    break;
                }
            default:
                zh.i5 i5Var2 = (zh.i5) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    zh.o4 o4Var = i5Var2.j(j3) ? new zh.o4(i5Var2, j3, i11) : null;
                    int i12 = qg.k0.V0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        qg.k0 k0Var = new qg.k0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        k0Var.G1(canApplyBoost);
                        k0Var.F1(tL_premium_boostsStatus2, true);
                        k0Var.H1(j3);
                        k0Var.Q0 = o4Var;
                        k0Var.show();
                    }
                    hVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar2.accept(Boolean.FALSE);
                    break;
                }
        }
    }

    public /* synthetic */ to(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = j3;
    }

    public /* synthetic */ to(xh.x3 x3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, MessagesController messagesController) {
        this.a = 1;
        this.d = x3Var;
        this.b = tL_premium_boostsStatus;
        this.c = j3;
        this.e = messagesController;
    }
}
