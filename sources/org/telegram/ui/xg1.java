package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ xg1(oh1 oh1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = oh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                oh1 oh1Var = this.b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var, 8));
                int i10 = oh1Var.H;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                oh1 oh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var2, 10));
                int i11 = oh1Var2.H;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
