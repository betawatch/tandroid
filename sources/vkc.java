// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vkc extends dw5 {
    public final /* synthetic */ TLRPC.User m1;
    public final /* synthetic */ TLRPC.Chat n1;
    public final /* synthetic */ String o1;
    public final /* synthetic */ TLRPC.InputPeer p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ Activity s1;
    public final /* synthetic */ e t1;
    public final /* synthetic */ k5 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, Activity activity, e eVar, k5 k5Var) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = activity;
        this.t1 = eVar;
        this.u1 = k5Var;
    }

    @Override // dw5
    public final void E0() {
        xkc.b(this.m1, this.n1, this.o1, this.p1, true, this.q1, this.r1, false, this.s1, this.t1, this.u1, false, false, false);
    }
}
