// default package

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p67 extends wb2 {
    public int Ld;
    public int Md;
    public int Nd;
    public final /* synthetic */ q67 Od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p67(q67 q67Var, Context context, int i, vnb vnbVar) {
        super(context, i, true, null, vnbVar);
        this.Od = q67Var;
        this.Ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Md = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Nd = -1;
    }

    @Override // wb2
    public final mpa Y2() {
        return mpa.d(1, this, this.Od.F);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // wb2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.ub.x0 || i2 == 0 || this.Ld == Integer.MAX_VALUE || i4 == 0 || this.Md == Integer.MAX_VALUE) {
            return;
        }
        if (this.Nd == (getMessageObject() == null ? 0 : getMessageObject().e1())) {
            if (!this.Od.A0) {
                setTranslationY(-(i2 - this.Ld));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(k43.h).start();
            }
            this.Ld = getTop();
            this.Md = getBottom();
            this.Nd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}
