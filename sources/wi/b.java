package wi;

import android.widget.ImageView;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(h hVar, int i7) {
        this.a = i7;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                ImageView imageView = hVar.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    hVar.l.setImageDrawable(null);
                    break;
                }
                break;
            case 1:
                h hVar2 = this.b;
                if (hVar2.b() && hVar2.c()) {
                    float f10 = hVar2.M[0];
                    if (hVar2.b.X(f10 >= ((float) hVar2.x) * 0.5f, f10, hVar2.G) && !hVar2.u) {
                        hVar2.u = true;
                        hVar2.o(true);
                        if (!hVar2.w) {
                            hVar2.w = true;
                            g0.i3(hVar2.P, 1500L);
                            break;
                        }
                    }
                }
                break;
            case 2:
                g0.h3(new b(this.b, 0));
                break;
            default:
                h hVar3 = this.b;
                hVar3.getClass();
                g0.h3(new b(hVar3, 0));
                break;
        }
    }
}
