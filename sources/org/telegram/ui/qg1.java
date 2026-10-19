package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ qg1(hh1 hh1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = hh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hh1 hh1Var = this.b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var, 8));
                int i10 = hh1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                hh1 hh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var2, 10));
                int i11 = hh1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
