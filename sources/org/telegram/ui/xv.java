package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ xv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                Object obj = ryVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle e = org.telegram.ui.Cells.q3.e(3, TeXSymbolParser.TYPE_ATTR);
                        e.putString("hashtag", v8Var.C);
                        e.putInt("storiesCount", v8Var.J);
                        ryVar.presentFragment(new org.telegram.ui.Components.ca0(e, null));
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
                    ry.d4(xnVar, messageObject);
                    ryVar.presentFragment(xnVar);
                    break;
                }
                break;
            default:
                ry ryVar2 = this.b;
                ryVar2.b0.I0(true);
                ArrayList arrayList = ryVar2.b0.X2;
                ryVar2.j3(arrayList.isEmpty() ? gg.s0.c3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
