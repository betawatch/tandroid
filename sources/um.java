// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class um extends mqd {
    public final /* synthetic */ byte a;
    public final Animatable b;

    public /* synthetic */ um(Animatable animatable, byte b) {
        this.a = b;
        this.b = animatable;
    }

    @Override // mqd
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((mn) this.b).start();
                break;
        }
    }

    @Override // mqd
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((mn) this.b).stop();
                break;
        }
    }
}
