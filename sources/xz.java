// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ xz(Context context, ylb ylbVar, TL_stars.StarGift starGift, byte b) {
        this.a = b;
        this.b = context;
        this.c = ylbVar;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e00.b1(this.c, this.b, this.d);
                break;
            default:
                e00.b1(this.c, this.b, this.d);
                break;
        }
    }
}
