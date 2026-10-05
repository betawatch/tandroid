package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ th1(ki1 ki1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ki1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ki1 ki1Var = this.b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var, 8));
                int i10 = ki1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ki1 ki1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var2, 10));
                int i11 = ki1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
