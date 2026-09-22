package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j3 extends g3 {
    public final boolean c;
    public final ImageReceiver d;

    public j3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        x7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override // yh.g3
    public final void a() {
        if (this.c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override // yh.g3
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public j3(u9 u9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = u9Var.getImageReceiver();
    }
}
