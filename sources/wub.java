// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wub implements View.OnClickListener {
    public final /* synthetic */ qvb a;

    public wub(qvb qvbVar) {
        this.a = qvbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qvb qvbVar = this.a;
        if (qvbVar.N) {
            ij.g0(qvbVar, -qvbVar.a, null, qvbVar.f(), null, false, qvbVar.K, new re1(this, (byte) 7), qvbVar.getResourceProvider());
            return;
        }
        qvbVar.getMessagesController().j(qvbVar.a, qvbVar.getUserConfig().f(), 0, null, qvbVar, false, new km4(qvbVar, (byte) 3), new rub(qvbVar), null);
        kk7.e().k(kk7.K4, new Object[0]);
        qvbVar.R0(false);
    }
}
