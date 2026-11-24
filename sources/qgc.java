// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qgc extends zt5 {
    public final /* synthetic */ TLRPC.User m1;
    public final /* synthetic */ TLRPC.Chat n1;
    public final /* synthetic */ String o1;
    public final /* synthetic */ TLRPC.InputPeer p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ Activity t1;
    public final /* synthetic */ d u1;
    public final /* synthetic */ j5 v1;
    public final /* synthetic */ boolean w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3, Activity activity, d dVar, j5 j5Var, boolean z4) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = z3;
        this.t1 = activity;
        this.u1 = dVar;
        this.v1 = j5Var;
        this.w1 = z4;
    }

    @Override // zt5
    public final void D0() {
        rgc.b(this.m1, this.n1, this.o1, this.p1, false, this.q1, this.r1, this.s1, this.t1, this.u1, this.v1, false, true, this.w1);
    }
}
