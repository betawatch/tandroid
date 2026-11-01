package uh;

import android.view.View;
import org.telegram.ui.Components.vq0;
import th.q4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                vq0 vq0Var = iVar.W;
                q4 q4Var = iVar.a;
                vq0Var.a(q4Var == null ? "" : q4Var.E);
                break;
            default:
                i iVar2 = this.b;
                iVar2.W.b(iVar2.a.E);
                break;
        }
    }
}
