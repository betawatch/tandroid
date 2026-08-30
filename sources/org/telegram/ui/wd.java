package org.telegram.ui;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wd(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j3.n1((ke) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 7));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.j(this.c, this.d, (Object) tLObject, this.e, this.b, 11));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new j3.n1((ap) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 9));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gg.j((org.telegram.ui.Components.ry) this.c, (String) this.d, this.b, (String) this.e, tLObject, 14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new j3.n1((au) this.c, tLObject, (ph.d) this.d, this.b, (HashSet) this.e, tL_error, 11));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gg.j(this.c, tLObject, this.b, (TLObject) this.d, (String) this.e, 20));
                break;
        }
    }

    public /* synthetic */ wd(Object obj, Object obj2, boolean z4, Serializable serializable, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
        this.e = serializable;
    }

    public /* synthetic */ wd(ph.g1 g1Var, boolean z4, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 5;
        this.c = g1Var;
        this.b = z4;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }
}
