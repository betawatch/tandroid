// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qp4 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public qp4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        e eVar = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(eVar instanceof zu1)) {
            fragmentContextView.l0 = false;
            return;
        }
        vc2 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.k()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - eVar.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? ob6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : hl.j0(currentTime);
        hn hnVar = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = ob6.M0(2131743092, null);
        }
        hnVar.t(G, true, true);
        hl.d3(fragmentContextView.m0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
