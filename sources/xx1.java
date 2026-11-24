// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xx1 implements gj, ed {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ xx1(ay1 ay1Var, View view, Object obj, String str, Object obj2, jm6 jm6Var, boolean z) {
        this.c = ay1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = jm6Var;
        this.b = z;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ((ay1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (jm6) this.h, this.b);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        kf2 kf2Var = (kf2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        kf2Var.getClass();
        kf2Var.w0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, kf2Var.e1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ xx1(kf2 kf2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = kf2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
