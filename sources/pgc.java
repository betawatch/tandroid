// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pgc extends zt5 {
    public final /* synthetic */ TLRPC.User m1;
    public final /* synthetic */ TLRPC.Chat n1;
    public final /* synthetic */ String o1;
    public final /* synthetic */ TLRPC.InputPeer p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ Activity s1;
    public final /* synthetic */ d t1;
    public final /* synthetic */ j5 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, Activity activity, d dVar, j5 j5Var) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = activity;
        this.t1 = dVar;
        this.u1 = j5Var;
    }

    @Override // zt5
    public final void D0() {
        rgc.b(this.m1, this.n1, this.o1, this.p1, true, this.q1, this.r1, false, this.s1, this.t1, this.u1, false, false, false);
    }
}
