package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ rz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.o0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.n0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
