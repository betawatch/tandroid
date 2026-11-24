// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ xy(Context context, wjb wjbVar, TL_stars.StarGift starGift, byte b) {
        this.a = b;
        this.b = context;
        this.c = wjbVar;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez.b1(this.c, this.b, this.d);
                break;
            default:
                ez.b1(this.c, this.b, this.d);
                break;
        }
    }
}
