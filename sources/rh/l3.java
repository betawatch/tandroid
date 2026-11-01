package rh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.at;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l3 extends i3 {
    public final boolean c;
    public final ImageReceiver d;

    public l3(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        h8.c1(imageReceiver, stargiftattributemodel.document, at.q2);
    }

    @Override // rh.i3
    public final void a() {
        if (this.c) {
            this.d.R();
        }
    }

    @Override // rh.i3
    public final boolean b() {
        return this.d.B() != null;
    }

    public l3(g9 g9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = g9Var.getImageReceiver();
    }
}
