package yh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class h3 extends e3 {
    public final boolean c;
    public final ImageReceiver d;

    public h3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        w7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override // yh.e3
    public final void a() {
        if (this.c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override // yh.e3
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public h3(w9 w9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = w9Var.getImageReceiver();
    }
}
