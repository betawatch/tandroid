// default package

import android.media.VolumeProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ulc extends VolumeProvider {
    public final /* synthetic */ dz3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulc(dz3 dz3Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = dz3Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        dz3 dz3Var = this.a;
        ((wz4) ((in3) dz3Var.f).d).a.post(new uz4(dz3Var, i, (byte) 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        dz3 dz3Var = this.a;
        ((wz4) ((in3) dz3Var.f).d).a.post(new uz4(dz3Var, i, (byte) 0));
    }
}
