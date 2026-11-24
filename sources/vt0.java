// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vt0(u41 u41Var, fx0[] fx0VarArr, int i, TLObject tLObject, String str) {
        this.a = (byte) 12;
        this.c = u41Var;
        this.e = fx0VarArr;
        this.b = i;
        this.f = tLObject;
        this.d = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                gl.d3(new qt((hv0) obj4, (String) obj, tLObject, tL_error, this.b, (cv0) obj2, (ev0) obj3));
                break;
            case 1:
                gl.d3(new kf(tLObject, this.b, (hd) obj4, (Context) obj, (wjb) obj2, (fa5) obj3));
                break;
            case 2:
                gl.d3(new kf(obj4, this.b, tLObject, obj, obj2, obj3, (byte) 5));
                break;
            case 3:
                gl.d3(new qt(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj, (ArrayList) obj2, (jn1) obj3));
                break;
            case 4:
                gl.d3(new qt((hd) obj4, (c01) obj, tLObject, this.b, (Activity) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                break;
            case 5:
                String str = LaunchActivity.C1;
                gl.d3(new qt((gk7) obj4, tLObject, obj2, (TLObject) tL_error, obj3, this.b, (String) obj, (byte) 10));
                break;
            case 6:
                String str2 = LaunchActivity.C1;
                gl.d3(new qt((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (kz5) obj3, this.b, (String) obj));
                break;
            case 7:
                String str3 = LaunchActivity.C1;
                gl.d3(new qt((LaunchActivity) obj4, tL_error, tLObject, this.b, (hd) obj2, (kz5) obj3, (String) obj));
                break;
            case 8:
                gl.d3(new qt((gz6) obj4, this.b, (ArrayList) obj, (vf6) obj2, tL_error, tLObject, (na7) obj3));
                break;
            case 9:
                gl.d3(new kf((Object) tLObject, this.b, (TLObject) obj4, obj, obj2, obj3, (byte) 8));
                break;
            case 10:
                gl.d3(new kf((KeyEvent.Callback) obj4, obj, this.b, (Object) tLObject, obj2, (TLObject) obj3, (byte) 9));
                break;
            case 11:
                gl.d3(new kf((u41) obj4, tLObject, (fx0[]) obj, (wjb) obj2, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 12:
                gl.d3(new i57(obj4, obj2, this.b, obj3, obj, (byte) 25));
                break;
            case 13:
                gl.d3(new qt((hd) obj4, tLObject, this.b, (TLRPC.Document) obj, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            default:
                gl.d3(new kf((x3b) obj4, tLObject, this.d, (ArrayList) obj2, (boolean[]) obj3, this.b));
                break;
        }
    }

    public /* synthetic */ vt0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ vt0(u41 u41Var, fx0[] fx0VarArr, wjb wjbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = u41Var;
        this.d = fx0VarArr;
        this.e = wjbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    public /* synthetic */ vt0(x3b x3bVar, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 14;
        this.c = x3bVar;
        this.d = obj;
        this.e = arrayList;
        this.f = zArr;
        this.b = i;
    }

    public /* synthetic */ vt0(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ vt0(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ vt0(LaunchActivity launchActivity, int i, hd hdVar, kz5 kz5Var, String str) {
        this.a = (byte) 7;
        this.c = launchActivity;
        this.b = i;
        this.e = hdVar;
        this.f = kz5Var;
        this.d = str;
    }

    public /* synthetic */ vt0(LaunchActivity launchActivity, Object obj, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.c = launchActivity;
        this.e = obj;
        this.f = obj2;
        this.b = i;
        this.d = str;
    }
}
