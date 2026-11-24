// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class si3 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ nk3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si3(nk3 nk3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = nk3Var;
                super("viewPagerTranslation", (byte) 0);
                break;
            default:
                this.c = nk3Var;
                break;
        }
    }

    @Override // ro
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((nk3) obj).W4(f);
                break;
            default:
                nk3 nk3Var = this.c;
                nk3Var.J0 = f;
                ((View) obj).setTranslationY(nk3Var.K0 + f);
                nk3Var.b3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        nk3 nk3Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(nk3Var.O);
            default:
                return Float.valueOf(nk3Var.J0);
        }
    }
}
