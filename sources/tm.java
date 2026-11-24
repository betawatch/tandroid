// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tm extends wld {
    public final /* synthetic */ byte a;
    public final Animatable b;

    public /* synthetic */ tm(Animatable animatable, byte b) {
        this.a = b;
        this.b = animatable;
    }

    @Override // wld
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((ln) this.b).start();
                break;
        }
    }

    @Override // wld
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((ln) this.b).stop();
                break;
        }
    }
}
