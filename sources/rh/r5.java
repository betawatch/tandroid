package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements q20 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ j20 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ r5(e6 e6Var, long j10, int i10, boolean[] zArr, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = e6Var;
        this.b = j10;
        this.c = i10;
        this.d = zArr;
        this.e = j20Var;
        this.f = context;
        this.g = p6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        q20 q20Var = (q20) obj;
        e6 e6Var = this.a;
        long j10 = e6Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        j20 j20Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            e6Var.Y(str, chatInvite, new j4(q20Var, zArr, j20Var));
            return;
        }
        boolean z10 = vp.r1(this.c).k7;
        Context context = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, 1, chatInvite.title, new mg.c0(e6Var, zArr2, str, chatInvite, zArr, j20Var, q20Var, 14), 0L);
            x7Var.setOnDismissListener(new aj0(e6Var, q20Var, zArr2, zArr, j20Var, 2));
            x7Var.show();
            return;
        }
        if (q20Var != null) {
            q20Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            j20Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        e6.c0(context, p6Var);
    }
}
