// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xyb implements View.OnClickListener {
    public final /* synthetic */ tzb a;

    public xyb(tzb tzbVar) {
        this.a = tzbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tzb tzbVar = this.a;
        if (tzbVar.N) {
            jj.g0(tzbVar, -tzbVar.a, null, tzbVar.e(), null, false, tzbVar.K, new ze1(this, (byte) 7), tzbVar.getResourceProvider());
            return;
        }
        tzbVar.getMessagesController().k(tzbVar.a, tzbVar.getUserConfig().f(), null, tzbVar, false, new po4(tzbVar, (byte) 3), new syb(tzbVar));
        jn7.e().k(jn7.L4, new Object[0]);
        tzbVar.S0(false);
    }
}
