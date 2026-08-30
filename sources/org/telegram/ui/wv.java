package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ wv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                Object obj = oyVar.z0.s0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof nh.f6) {
                        nh.f6 f6Var = (nh.f6) obj;
                        Bundle h = android.support.v4.media.a.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", f6Var.C);
                        h.putInt("storiesCount", f6Var.J);
                        oyVar.presentFragment(new org.telegram.ui.Components.da0(h, null));
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
                    oy.d4(xnVar, messageObject);
                    oyVar.presentFragment(xnVar);
                    break;
                }
                break;
            default:
                oy oyVar2 = this.b;
                oyVar2.Y.I0(true);
                ArrayList arrayList = oyVar2.Y.U2;
                oyVar2.j3(arrayList.isEmpty() ? tf.g0.Z2[i10] : (tf.e0) arrayList.get(i10));
                break;
        }
    }
}
