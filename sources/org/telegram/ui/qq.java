package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ qq(qr qrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.c = qrVar;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z4;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        ((org.telegram.ui.Components.xf) this.c).B((View) this.d, this.e, this.a, this.f, z4, i10, i11, (MediaController.PhotoEntry) this.h, this.b);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        qr qrVar = (qr) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qrVar.getClass();
        qrVar.t0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, qrVar.b1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ qq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z4) {
        this.c = xfVar;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = photoEntry;
        this.b = z4;
    }
}
