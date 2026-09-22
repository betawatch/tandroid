package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.vc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ai.a1 e;

    public /* synthetic */ r31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = vcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 2), this.e)).j();
                break;
            case 1:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 5), this.e)).j();
                break;
            default:
                this.b.run();
                this.c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 6), this.e)).j();
                break;
        }
    }
}
