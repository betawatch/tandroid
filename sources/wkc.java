// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wkc extends dw5 {
    public final /* synthetic */ TLRPC.User m1;
    public final /* synthetic */ TLRPC.Chat n1;
    public final /* synthetic */ String o1;
    public final /* synthetic */ TLRPC.InputPeer p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ Activity t1;
    public final /* synthetic */ e u1;
    public final /* synthetic */ k5 v1;
    public final /* synthetic */ boolean w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3, Activity activity, e eVar, k5 k5Var, boolean z4) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = z3;
        this.t1 = activity;
        this.u1 = eVar;
        this.v1 = k5Var;
        this.w1 = z4;
    }

    @Override // dw5
    public final void E0() {
        xkc.b(this.m1, this.n1, this.o1, this.p1, false, this.q1, this.r1, this.s1, this.t1, this.u1, this.v1, false, true, this.w1);
    }
}
