// default package

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ru6 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bv6 b;

    public /* synthetic */ ru6(bv6 bv6Var, byte b) {
        this.a = b;
        this.b = bv6Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.j(true);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                bv6 bv6Var = this.b;
                OverlayListView overlayListView = bv6Var.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nu7 nu7Var = (nu7) obj;
                    if (!nu7Var.j) {
                        nu7Var.i = overlayListView.getDrawingTime();
                        nu7Var.j = true;
                    }
                }
                bv6Var.V.postDelayed(bv6Var.F0, bv6Var.y0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
