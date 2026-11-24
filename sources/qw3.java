// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qw3 extends nue {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ qw3(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // nue
    public final void a() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((uw3) viewGroup).j3 = false;
                break;
            case 1:
                ((gy8) viewGroup).w = false;
                break;
            default:
                ((vz9) viewGroup).y1 = false;
                break;
        }
    }

    @Override // nue
    public final void b() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((uw3) viewGroup).j3 = true;
                break;
            case 2:
                ((vz9) viewGroup).y1 = true;
                break;
        }
    }
}
