package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ vg1(mh1 mh1Var, VoIPService voIPService, int i9) {
        this.a = i9;
        this.b = mh1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mh1 mh1Var = this.b;
                AndroidUtilities.runOnUIThread(new wg1(mh1Var, 8));
                int i9 = mh1Var.H;
                if (i9 > 0) {
                    this.c.sendCallRating(i9);
                    break;
                }
                break;
            default:
                mh1 mh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new wg1(mh1Var2, 10));
                int i10 = mh1Var2.H;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
