package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ zg1(rh1 rh1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = rh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rh1 rh1Var = this.b;
                AndroidUtilities.runOnUIThread(new ah1(rh1Var, 8));
                int i10 = rh1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                rh1 rh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ah1(rh1Var2, 10));
                int i11 = rh1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
