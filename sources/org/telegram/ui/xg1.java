package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ xg1(ph1 ph1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ph1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ph1 ph1Var = this.b;
                AndroidUtilities.runOnUIThread(new yg1(ph1Var, 8));
                int i10 = ph1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ph1 ph1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new yg1(ph1Var2, 10));
                int i11 = ph1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
