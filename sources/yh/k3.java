package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class k3 extends h3 {
    public final boolean c;
    public final ImageReceiver d;

    public k3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        y7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override // yh.h3
    public final void a() {
        if (this.c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override // yh.h3
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public k3(u9 u9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = u9Var.getImageReceiver();
    }
}
