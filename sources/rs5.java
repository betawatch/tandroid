// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rs5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c79 h;

    public /* synthetic */ rs5(c79 c79Var, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.h = c79Var;
        this.b = user;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        vnb vnbVar;
        byte b = this.a;
        c79 c79Var = this.h;
        switch (b) {
            case 0:
                bt5 bt5Var = ((ws5) c79Var).c;
                sjb.b(bt5Var.getContext(), bt5Var.a, -bt5Var.a2, this.b, this.c, this.d, this.e, this.f, bt5Var.J0);
                break;
            case 1:
                ProfileActivity profileActivity = ((wr8) c79Var).e;
                Activity parentActivity = profileActivity.getParentActivity();
                i = ((e) profileActivity).currentAccount;
                long a = profileActivity.a();
                vnbVar = ((e) profileActivity).resourceProvider;
                sjb.b(parentActivity, i, a, this.b, this.c, this.d, this.e, this.f, vnbVar);
                break;
            default:
                eja ejaVar = ((rha) c79Var).f;
                sjb.b(ejaVar.getContext(), ejaVar.y1.getCurrentAccount(), ejaVar.m1, this.b, this.c, this.d, this.e, this.f, ejaVar.I1);
                break;
        }
    }
}
