// default package

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tn extends ynd {
    public final /* synthetic */ byte a;
    public final Animatable b;

    public /* synthetic */ tn(Animatable animatable, byte b) {
        this.a = b;
        this.b = animatable;
    }

    @Override // ynd
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((mo) this.b).start();
                break;
        }
    }

    @Override // ynd
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((mo) this.b).stop();
                break;
        }
    }
}
