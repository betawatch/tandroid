package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ rb1(hc1 hc1Var, VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = hc1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hc1 hc1Var = this.b;
                org.telegram.messenger.g0.g3(new tb1(hc1Var, 8));
                int i7 = hc1Var.M;
                if (i7 > 0) {
                    this.c.sendCallRating(i7);
                    break;
                }
                break;
            default:
                hc1 hc1Var2 = this.b;
                org.telegram.messenger.g0.g3(new tb1(hc1Var2, 10));
                int i10 = hc1Var2.M;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
