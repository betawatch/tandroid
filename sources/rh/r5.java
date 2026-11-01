package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements r20 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ k20 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ r5(e6 e6Var, long j10, int i10, boolean[] zArr, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = e6Var;
        this.b = j10;
        this.c = i10;
        this.d = zArr;
        this.e = k20Var;
        this.f = context;
        this.g = p6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        r20 r20Var = (r20) obj;
        e6 e6Var = this.a;
        long j10 = e6Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        k20 k20Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            e6Var.Y(str, chatInvite, new j4(r20Var, zArr, k20Var));
            return;
        }
        boolean z10 = wp.r1(this.c).k7;
        Context context = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, 1, chatInvite.title, new mg.c0(e6Var, zArr2, str, chatInvite, zArr, k20Var, r20Var, 14), 0L);
            x7Var.setOnDismissListener(new yi0(e6Var, r20Var, zArr2, zArr, k20Var, 2));
            x7Var.show();
            return;
        }
        if (r20Var != null) {
            r20Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            k20Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        e6.c0(context, p6Var);
    }
}
