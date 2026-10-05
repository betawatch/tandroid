package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.cd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((Utilities.Callback2) this.b).run((zf.a) obj, new o2((j0[]) this.c, 7));
                break;
            default:
                cd cdVar = (cd) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                cdVar.X0(true);
                ci.d dVar = cdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
        }
    }
}
