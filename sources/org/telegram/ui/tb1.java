package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ tb1(jc1 jc1Var, VoIPService voIPService, int i7) {
        this.a = i7;
        this.b = jc1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jc1 jc1Var = this.b;
                org.telegram.messenger.g0.h3(new vb1(jc1Var, 8));
                int i7 = jc1Var.L;
                if (i7 > 0) {
                    this.c.sendCallRating(i7);
                    break;
                }
                break;
            default:
                jc1 jc1Var2 = this.b;
                org.telegram.messenger.g0.h3(new vb1(jc1Var2, 10));
                int i10 = jc1Var2.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
        }
    }
}
