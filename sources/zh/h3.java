package zh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        v7.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override // zh.e3
    public final void a() {
        if (this.c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override // zh.e3
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public h3(x9 x9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = x9Var.getImageReceiver();
    }
}
