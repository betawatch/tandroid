package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new vh.r0(23, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                i iVar = this.b;
                iVar.a0.commission_permille = ((Integer) obj).intValue();
                iVar.L0();
                break;
            default:
                i iVar2 = this.b;
                iVar2.a0.duration_months = ((Integer) iVar2.c0.get(((Integer) obj).intValue())).intValue();
                iVar2.L0();
                break;
        }
    }
}
