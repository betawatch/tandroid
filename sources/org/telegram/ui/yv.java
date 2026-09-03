package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ yv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                Object obj = qyVar.z0.s0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof nh.f6) {
                        nh.f6 f6Var = (nh.f6) obj;
                        Bundle h = android.support.v4.media.a.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", f6Var.C);
                        h.putInt("storiesCount", f6Var.J);
                        qyVar.presentFragment(new org.telegram.ui.Components.ea0(h, null));
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
                    zn znVar = new zn(bundle);
                    qy.d4(znVar, messageObject);
                    qyVar.presentFragment(znVar);
                    break;
                }
                break;
            default:
                qy qyVar2 = this.b;
                qyVar2.Y.I0(true);
                ArrayList arrayList = qyVar2.Y.U2;
                qyVar2.j3(arrayList.isEmpty() ? tf.g0.Z2[i10] : (tf.e0) arrayList.get(i10));
                break;
        }
    }
}
