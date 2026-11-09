package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ rb1(ic1 ic1Var, VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = ic1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ic1 ic1Var = this.b;
                org.telegram.messenger.g0.h3(new tb1(ic1Var, 8));
                int i7 = ic1Var.L;
                if (i7 > 0) {
                    this.c.sendCallRating(i7);
                    break;
                }
                break;
            default:
                ic1 ic1Var2 = this.b;
                org.telegram.messenger.g0.h3(new tb1(ic1Var2, 10));
                int i10 = ic1Var2.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
