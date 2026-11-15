package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.r4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ rp(qq qqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.c = qqVar;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        ((org.telegram.ui.Components.wf) this.c).B((View) this.d, this.e, this.a, this.f, z10, i7, i10, (org.telegram.messenger.ff) this.h, this.b);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        qq qqVar = (qq) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qqVar.getClass();
        qqVar.y0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, qqVar.e1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ rp(org.telegram.ui.Components.wf wfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ff ffVar, boolean z10) {
        this.c = wfVar;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = ffVar;
        this.b = z10;
    }
}
