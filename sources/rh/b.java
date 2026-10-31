package rh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ b(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i iVar = this.b;
        switch (i10) {
            case 0:
                b bVar = iVar.s0;
                int currentTime = iVar.getConnectionsManager().getCurrentTime();
                iVar.a0.setEnabled(iVar.Y > 0 || iVar.P > currentTime);
                if (currentTime >= iVar.P) {
                    iVar.a0.g(null, true);
                    iVar.a0.i(h8.X0(false, iVar.X ? cd.L0(2131752969, null) : cd.H(' ', "BotStarsButtonWithdrawShort", (int) iVar.Y), iVar.c0), true, true);
                    break;
                } else {
                    iVar.a0.i(cd.L0(2131752968, null), true, true);
                    if (iVar.r0 == null) {
                        iVar.r0 = new SpannableStringBuilder("l");
                        dq dqVar = new dq(R.drawable.mini_switch_lock, 0);
                        dqVar.n = 1;
                        iVar.r0.setSpan(dqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) iVar.r0).append((CharSequence) i.v0(iVar.P - currentTime));
                    iVar.a0.g(spannableStringBuilder, true);
                    wb wbVar = iVar.j0;
                    if (wbVar != null) {
                        bb bbVar = wbVar.e;
                        if ((bbVar instanceof eb) && bbVar.isAttachedToWindow()) {
                            org.telegram.messenger.m5.q(null, null, 2131752952, new Object[]{i.v0(iVar.P - currentTime)}, ((eb) iVar.j0.e).b);
                        }
                    }
                    org.telegram.messenger.i0.r(bVar);
                    org.telegram.messenger.i0.h3(bVar, 1000L);
                    break;
                }
                break;
            case 1:
                i.a0(iVar);
                break;
            case 2:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131752956, null));
                break;
            case 3:
                i.Y(iVar);
                break;
            case 4:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131753029, null));
                break;
            case 5:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131753049, null));
                break;
            default:
                iVar.b0.setLoading(false);
                break;
        }
    }
}
