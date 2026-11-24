// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q02 extends s02 {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ x02 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(x02 x02Var, Context context) {
        super(context);
        this.d = x02Var;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = x02.G4;
        wjb wjbVar = x02Var.J0;
        ox4 ox4Var = new ox4(context);
        ox4Var.d = wjbVar;
        ox4Var.R = true;
        TextView textView = ox4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        ox4Var.b.setVisibility(8);
        ox4Var.b(false);
        be0 be0Var = new be0(context);
        ox4Var.c = be0Var;
        ox4Var.addView(be0Var, nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        this.a = ox4Var;
        ox4Var.getBackupImageView().a.h1 = new qm0((byte) 24);
        addView(this.a, nme.c(-1.0f, -1));
    }

    public final void a(boolean z) {
        boolean z2 = this.c != null && (-this.b.id) == this.d.T2;
        this.a.f(z2, z);
        oy8 y = this.a.getBackupImageView().getImageReceiver().y();
        if (!z) {
            if (y != null) {
                y.stop();
                y.O(false, 0.0f);
                return;
            }
            return;
        }
        if (!z2 || y == null) {
            return;
        }
        y.F(0);
        y.K(-1);
        y.O(false, 0.0f);
        y.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
