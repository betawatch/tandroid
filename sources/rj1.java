// default package

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rj1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rj1(ww3 ww3Var, boolean z, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = (byte) 4;
        this.c = ww3Var;
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
                gm.c3(new b5a((KeyEvent.Callback) obj3, tL_error, obj, obj2, this.b, tLObject, (byte) 2));
                break;
            case 1:
                gm.c3(new aa7(obj3, obj, (Object) tLObject, obj2, this.b, (byte) 7));
                break;
            case 2:
                gm.c3(new b5a((na2) obj3, (TLRPC.TL_channels_toggleUsername) obj, tLObject, (TLRPC.TL_username) obj2, this.b, tL_error));
                break;
            case 3:
                gm.c3(new b5a((c23) obj3, tLObject, (b61) obj, this.b, (HashSet) obj2, tL_error));
                break;
            case 4:
                gm.c3(new aa7(obj3, (Object) tLObject, this.b, obj, obj2, (byte) 11));
                break;
            case 5:
                gm.c3(new aa7(obj3, obj, this.b, obj2, (Object) tLObject, (byte) 12));
                break;
            case 6:
                gm.c3(new aa7(obj3, (Object) tLObject, obj, this.b, obj2, (byte) 13));
                break;
            default:
                gm.c3(new b5a((KeyEvent.Callback) obj3, tL_error, obj2, obj, this.b, tLObject, (byte) 12));
                break;
        }
    }

    public /* synthetic */ rj1(wsa wsaVar, m45 m45Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.a = (byte) 7;
        this.c = wsaVar;
        this.e = m45Var;
        this.d = twoStepVerificationActivity;
        this.b = z;
    }

    public /* synthetic */ rj1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ rj1(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
