package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ qv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                gy gyVar = this.b;
                Object obj = gyVar.y0.r0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof jh.d6) {
                        jh.d6 d6Var = (jh.d6) obj;
                        Bundle g10 = a9.p.g(3, TeXSymbolParser.TYPE_ATTR);
                        g10.putString("hashtag", d6Var.C);
                        g10.putInt("storiesCount", d6Var.J);
                        gyVar.presentFragment(new org.telegram.ui.Components.o90(g10, null));
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
                    rn rnVar = new rn(bundle);
                    gy.d4(rnVar, messageObject);
                    gyVar.presentFragment(rnVar);
                    break;
                }
                break;
            default:
                gy gyVar2 = this.b;
                gyVar2.X.I0(true);
                ArrayList arrayList = gyVar2.X.T2;
                gyVar2.j3(arrayList.isEmpty() ? pf.g0.Y2[i10] : (pf.e0) arrayList.get(i10));
                break;
        }
    }
}
