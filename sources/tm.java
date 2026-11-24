// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
