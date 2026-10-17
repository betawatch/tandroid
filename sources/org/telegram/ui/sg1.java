package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ sg1(jh1 jh1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = jh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jh1 jh1Var = this.b;
                AndroidUtilities.runOnUIThread(new tg1(jh1Var, 8));
                int i10 = jh1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                jh1 jh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new tg1(jh1Var2, 10));
                int i11 = jh1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
