// default package

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rr2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rr2(zu1 zu1Var, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 2;
        this.c = zu1Var;
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
                uc7 uc7Var = (uc7) obj4;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) obj3;
                l82 l82Var = (l82) obj2;
                m82 m82Var = (m82) obj;
                uc7Var.getClass();
                if (tLObject == null) {
                    hl.c3(new t87(m82Var, tL_error, (byte) 8));
                    break;
                } else {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    long j = this.b;
                    TLRPC.ChatFull N0 = uc7Var.N0(j);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= TLObject.FLAG_30;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        uc7Var.getMessagesStorage().P1(N0, false);
                    }
                    hl.c3(new cq6((Object) uc7Var, (Object) l82Var, j, (byte) 5));
                    break;
                }
            case 2:
                hl.c3(new sp6(tL_error, (zu1) obj4, tLObject, (TLRPC.FileLocation[]) obj3, (String) obj2, (TLRPC.FileLocation[]) obj, this.b));
                break;
            default:
                hl.c3(new nm1(obj4, (Object) tLObject, this.b, obj3, obj2, obj, (byte) 5));
                break;
        }
    }

    public /* synthetic */ rr2(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ rr2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.a = (byte) 0;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }
}
