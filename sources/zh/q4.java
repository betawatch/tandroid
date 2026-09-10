package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ya0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q4 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ e2.h b;
    public final /* synthetic */ i5 c;

    public q4(i5 i5Var, long j3, e2.h hVar) {
        this.c = i5Var;
        this.a = j3;
        this.b = hVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ya0(this, tLObject, this.a, this.b, 12));
    }
}
