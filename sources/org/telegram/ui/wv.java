package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ wv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                Object obj = qyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle g10 = org.telegram.ui.Cells.c1.g(3, TeXSymbolParser.TYPE_ATTR);
                        g10.putString("hashtag", v8Var.C);
                        g10.putInt("storiesCount", v8Var.J);
                        qyVar.presentFragment(new org.telegram.ui.Components.na0(g10, null));
                        break;
                    }
                } else {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    wn wnVar = new wn(bundle);
                    qy.d4(wnVar, messageObject);
                    qyVar.presentFragment(wnVar);
                    break;
                }
                break;
            default:
                qy qyVar2 = this.b;
                qyVar2.b0.I0(true);
                ArrayList arrayList = qyVar2.b0.X2;
                qyVar2.j3(arrayList.isEmpty() ? gg.s0.c3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
