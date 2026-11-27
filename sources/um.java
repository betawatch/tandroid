// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
