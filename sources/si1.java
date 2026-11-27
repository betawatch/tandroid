// default package

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class si1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ si1(fw3 fw3Var, boolean z, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = (byte) 4;
        this.c = fw3Var;
        this.b = z;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hl.c3(new y6a((KeyEvent.Callback) obj3, tL_error, obj, obj2, this.b, tLObject, (byte) 2));
                break;
            case 1:
                hl.c3(new va7(obj3, obj, (Object) tLObject, obj2, this.b, (byte) 7));
                break;
            case 2:
                hl.c3(new y6a((s92) obj3, (TLRPC.TL_channels_toggleUsername) obj, tLObject, (TLRPC.TL_username) obj2, this.b, tL_error));
                break;
            case 3:
                hl.c3(new y6a((j13) obj3, tLObject, (c51) obj, this.b, (HashSet) obj2, tL_error));
                break;
            case 4:
                hl.c3(new va7(obj3, (Object) tLObject, this.b, obj, obj2, (byte) 11));
                break;
            case 5:
                hl.c3(new va7(obj3, obj, this.b, obj2, (Object) tLObject, (byte) 12));
                break;
            case 6:
                hl.c3(new va7(obj3, (Object) tLObject, obj, this.b, obj2, (byte) 13));
                break;
            default:
                hl.c3(new y6a((KeyEvent.Callback) obj3, tL_error, obj2, obj, this.b, tLObject, (byte) 12));
                break;
        }
    }

    public /* synthetic */ si1(wua wuaVar, s45 s45Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.a = (byte) 7;
        this.c = wuaVar;
        this.e = s45Var;
        this.d = twoStepVerificationActivity;
        this.b = z;
    }

    public /* synthetic */ si1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ si1(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
