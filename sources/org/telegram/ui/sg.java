package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ sg(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(qnVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, qnVar.ea).j();
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b;
                if (i10 != 0) {
                    qnVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar2.m6 = false;
                    qnVar2.M9();
                    break;
                }
            default:
                qn qnVar3 = this.b;
                if (i10 != 0) {
                    qnVar3.finishFragment();
                    break;
                } else {
                    qnVar3.Vc(true);
                    break;
                }
        }
    }
}
