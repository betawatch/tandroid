package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zk extends eq0 {
    public final /* synthetic */ org.telegram.messenger.zi a;
    public final /* synthetic */ org.telegram.messenger.ye b;
    public final /* synthetic */ al c;

    public zk(al alVar, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar) {
        this.c = alVar;
        this.a = ziVar;
        this.b = yeVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        return this.c.a.R.ab.E(this.a, fileLocation, i3, z10, false);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        fl flVar = this.c.a;
        org.telegram.messenger.zi ziVar = this.a;
        ziVar.q = true;
        org.telegram.messenger.ye yeVar = this.b;
        if (yeVar.h != null || yeVar.b) {
            wm wmVar = flVar.R;
            xg xgVar = new xg(ziVar, 5);
            org.telegram.ui.ActionBar.q4 parentLayout = wmVar.getParentLayout();
            int currentAccount = wmVar.getCurrentAccount();
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
            f30Var.a = wmVar;
            f30Var.s(yeVar);
            f30Var.b = new cg.e0(currentAccount, xgVar, parentLayout, f30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = ziVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        flVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new org.telegram.ui.ActionBar.h6(8, this, ziVar));
    }
}
