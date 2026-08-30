package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements h5.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ af.f c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w80(LaunchActivity launchActivity, af.f fVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = fVar;
        this.e = l10;
        this.g = tL_premium_boostsStatus;
        this.f = t1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.xn) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // h5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.g;
        switch (i10) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.y1;
                af.f fVar = this.c;
                if (fVar != null) {
                    fVar.b();
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R instanceof vg0) {
                    R = ((vg0) R).X();
                }
                org.telegram.ui.ActionBar.p2 p2Var = R;
                if (p2Var != null) {
                    org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
                    if (p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().H0) {
                        resourceProvider = p2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    eg.v0 v0Var = new eg.v0(19, launchActivity.L, launchActivity, p2Var, resourceProvider);
                    v0Var.G1(canApplyBoost);
                    boolean z4 = p2Var instanceof xn;
                    Long l10 = this.e;
                    boolean z10 = true;
                    boolean z11 = false;
                    if (z4) {
                        break;
                    } else if (p2Var instanceof oy) {
                        jx jxVar = ((oy) p2Var).C3;
                        if (jxVar != null) {
                            break;
                        }
                        z10 = false;
                        z11 = z10;
                    }
                    v0Var.F1(tL_premium_boostsStatus, z11);
                    v0Var.H1(l10.longValue());
                    v0Var.d0 = this.f;
                    p2Var.showDialog(v0Var);
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                break;
            default:
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.y1;
                af.f fVar2 = this.c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l11 = this.e;
                    channelBoostsController.userCanBoostChannel(l11.longValue(), tL_premium_boostsStatus2, new w80(this.b, fVar2, l11, tL_premium_boostsStatus2, this.f, runnable2));
                    break;
                } else {
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w80(LaunchActivity launchActivity, af.f fVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.b = launchActivity;
        this.c = fVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l10;
        this.f = t1Var;
    }
}
