package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements org.telegram.ui.Components.em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ zv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                Object obj = tyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.w8) {
                        ai.w8 w8Var = (ai.w8) obj;
                        Bundle f7 = org.telegram.ui.Cells.c1.f(3, TeXSymbolParser.TYPE_ATTR);
                        f7.putString("hashtag", w8Var.C);
                        f7.putInt("storiesCount", w8Var.J);
                        tyVar.presentFragment(new org.telegram.ui.Components.db0(f7, null));
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
                    ty.a4(znVar, messageObject);
                    tyVar.presentFragment(znVar);
                    break;
                }
                break;
            default:
                ty tyVar2 = this.b;
                tyVar2.b0.I0(true);
                ArrayList arrayList = tyVar2.b0.V2;
                tyVar2.g3(arrayList.isEmpty() ? gg.r0.a3[i10] : (gg.p0) arrayList.get(i10));
                break;
        }
    }
}
