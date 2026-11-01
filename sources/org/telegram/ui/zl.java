package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zl extends xr0 {
    public final /* synthetic */ org.telegram.messenger.kj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ am c;

    public zl(am amVar, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar) {
        this.c = amVar;
        this.a = kjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Za.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.c.a;
        org.telegram.messenger.kj kjVar = this.a;
        kjVar.q = true;
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.h != null || ffVar.b) {
            un unVar = fmVar.Q;
            rh rhVar = new rh(kjVar, 6);
            org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
            int currentAccount = unVar.getCurrentAccount();
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            b40Var.a = unVar;
            b40Var.s(ffVar);
            b40Var.b = new mg.i0(currentAccount, rhVar, parentLayout, b40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = kjVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ag.k0(19, this, kjVar));
    }
}
