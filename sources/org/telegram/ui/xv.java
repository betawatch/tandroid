package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ xv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                Object obj = pyVar.z0.s0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof oh.f6) {
                        oh.f6 f6Var = (oh.f6) obj;
                        Bundle h = android.support.v4.media.a.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", f6Var.C);
                        h.putInt("storiesCount", f6Var.J);
                        pyVar.presentFragment(new org.telegram.ui.Components.fa0(h, null));
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
                    xn xnVar = new xn(bundle);
                    py.d4(xnVar, messageObject);
                    pyVar.presentFragment(xnVar);
                    break;
                }
                break;
            default:
                py pyVar2 = this.b;
                pyVar2.Y.I0(true);
                ArrayList arrayList = pyVar2.Y.U2;
                pyVar2.j3(arrayList.isEmpty() ? uf.g0.Z2[i10] : (uf.e0) arrayList.get(i10));
                break;
        }
    }
}
