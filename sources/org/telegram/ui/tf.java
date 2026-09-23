package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ tf(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                MessageObject messageObject3 = xnVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.ea).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.b);
            default:
                xn xnVar2 = this.b;
                int i10 = xnVar2.nb;
                if (i10 == 1 && (messageObject2 = xnVar2.p5) != null) {
                    xnVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (xnVar2.f5 == null || i10 != 2 || (messageObject = xnVar2.n5) == null) {
                    return false;
                }
                xnVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
