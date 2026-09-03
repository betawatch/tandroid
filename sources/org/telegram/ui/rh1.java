package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ rh1(ii1 ii1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ii1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ii1 ii1Var = this.b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var, 8));
                int i10 = ii1Var.I;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ii1 ii1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var2, 10));
                int i11 = ii1Var2.I;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
