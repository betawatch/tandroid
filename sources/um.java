// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
