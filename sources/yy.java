// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ yy(Context context, vnb vnbVar, TL_stars.StarGift starGift, byte b) {
        this.a = b;
        this.b = context;
        this.c = vnbVar;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fz.c1(this.c, this.b, this.d);
                break;
            default:
                fz.c1(this.c, this.b, this.d);
                break;
        }
    }
}
