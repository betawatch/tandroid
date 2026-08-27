package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ug1(lh1 lh1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = lh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lh1 lh1Var = this.b;
                AndroidUtilities.runOnUIThread(new vg1(lh1Var, 8));
                int i10 = lh1Var.H;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                lh1 lh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new vg1(lh1Var2, 10));
                int i11 = lh1Var2.H;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
