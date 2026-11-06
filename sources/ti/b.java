package ti;

import android.widget.ImageView;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ b(i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                ImageView imageView = iVar.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    iVar.l.setImageDrawable(null);
                    break;
                }
                break;
            case 1:
                i iVar2 = this.b;
                if (iVar2.b() && iVar2.c()) {
                    float f10 = iVar2.M[0];
                    if (iVar2.b.R(f10 >= ((float) iVar2.x) * 0.5f, f10, iVar2.G) && !iVar2.u) {
                        iVar2.u = true;
                        iVar2.o(true);
                        if (!iVar2.w) {
                            iVar2.w = true;
                            g0.i3(iVar2.P, 1500L);
                            break;
                        }
                    }
                }
                break;
            case 2:
                g0.h3(new b(this.b, 0));
                break;
            default:
                i iVar3 = this.b;
                iVar3.getClass();
                g0.h3(new b(iVar3, 0));
                break;
        }
    }
}
