// default package

import android.media.VolumeProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ujc extends VolumeProvider {
    public final /* synthetic */ tx3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujc(tx3 tx3Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = tx3Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        tx3 tx3Var = this.a;
        ((ux4) ((xl3) tx3Var.f).d).a.post(new sx4(tx3Var, i, (byte) 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        tx3 tx3Var = this.a;
        ((ux4) ((xl3) tx3Var.f).d).a.post(new sx4(tx3Var, i, (byte) 0));
    }
}
