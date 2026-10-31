package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zl extends yr0 {
    public final /* synthetic */ org.telegram.messenger.jj a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ am c;

    public zl(am amVar, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar) {
        this.c = amVar;
        this.a = jjVar;
        this.b = efVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Za.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.c.a;
        org.telegram.messenger.jj jjVar = this.a;
        jjVar.q = true;
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.h != null || efVar.b) {
            un unVar = fmVar.Q;
            rh rhVar = new rh(jjVar, 6);
            org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
            int currentAccount = unVar.getCurrentAccount();
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            b40Var.a = unVar;
            b40Var.s(efVar);
            b40Var.b = new mg.i0(currentAccount, rhVar, parentLayout, b40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = jjVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ag.k0(19, this, jjVar));
    }
}
