// default package

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yq2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yq2(mu1 mu1Var, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 2;
        this.c = mu1Var;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((ConferenceCall) obj4).lambda$poll$8((TL_phone.getGroupCallChainBlocks) obj3, this.b, (AtomicBoolean) obj2, (AtomicInteger) obj, tLObject, tL_error);
                break;
            case 1:
                na7 na7Var = (na7) obj4;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) obj3;
                u72 u72Var = (u72) obj2;
                v72 v72Var = (v72) obj;
                na7Var.getClass();
                if (tLObject == null) {
                    gl.d3(new t67(v72Var, tL_error, (byte) 12));
                    break;
                } else {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    long j = this.b;
                    TLRPC.ChatFull L0 = na7Var.L0(j);
                    if (L0 != null) {
                        if (L0 instanceof TLRPC.TL_chatFull) {
                            L0.flags |= 262144;
                        }
                        if (L0 instanceof TLRPC.TL_channelFull) {
                            L0.flags |= TLObject.FLAG_30;
                        }
                        L0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        na7Var.getMessagesStorage().K1(L0, false);
                    }
                    gl.d3(new go6((Object) na7Var, (Object) u72Var, j, (byte) 6));
                    break;
                }
            case 2:
                gl.d3(new rp6(tL_error, (mu1) obj4, tLObject, (TLRPC.FileLocation[]) obj3, (String) obj2, (TLRPC.FileLocation[]) obj, this.b));
                break;
            default:
                gl.d3(new fl1(obj4, (Object) tLObject, this.b, obj3, obj2, obj, (byte) 5));
                break;
        }
    }

    public /* synthetic */ yq2(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ yq2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.a = (byte) 0;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }
}
