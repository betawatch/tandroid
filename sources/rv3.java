// default package

import android.os.Bundle;
import android.util.Pair;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rv3 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 6;
        byte b4 = 2;
        byte b5 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gl.d3(new mg3((sv3) obj2, (String) obj, tLObject, (byte) 16));
                break;
            case 1:
                gl.d3(new eu3((kc4) obj2, (hd) obj, b2));
                break;
            case 2:
                gl.d3(new vc4((pd4) obj2, (hd) obj, b4));
                break;
            case 3:
                gl.d3(new mg3((jd4) obj2, tL_error, (hd4) obj, b2));
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                gl.d3(new vc4(filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj, b3));
                break;
            case 5:
                gl.d3(new vc4((ll4) obj2, (Pair) obj, (byte) 12));
                break;
            case 6:
                gl.d3(new hn1((ll4) obj2, tL_error, tLObject, (p8c) obj, (byte) 20));
                break;
            case 7:
                gl.d3(new jf4(obj2, (Object) tLObject, obj, (byte) 5));
                break;
            case 8:
                gl.d3(new jf4((xu4) obj2, (String) obj, tLObject, b3));
                break;
            case 9:
                gl.d3(new e45((t65) obj2, tL_error, tLObject, (String) obj, (byte) 3));
                break;
            case 10:
                ib5 ib5Var = (ib5) obj2;
                if (Objects.equals(ib5Var.a.e, (String) obj)) {
                    gl.d3(new hb5(ib5Var, tLObject, b5));
                    break;
                }
                break;
            case 11:
                gl.d3(new e45((rb5) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, (byte) 6));
                break;
            case 12:
                wp5 wp5Var = (wp5) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            gl.d3(new jf4((Object) wp5Var, langPackString, (Object) str, (byte) 23));
                            break;
                        }
                    }
                }
                break;
            case 13:
                String str2 = LaunchActivity.C1;
                gl.d3(new sx5((byte) 4, obj2, obj, tLObject));
                break;
            case 14:
                String str3 = LaunchActivity.C1;
                gl.d3(new e45((hd) obj2, tLObject, (u8) obj, tL_error, (byte) 10));
                break;
            case 15:
                gl.d3(new e45((f36) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, (byte) 11));
                break;
            case 16:
                gl.d3(new sx5((byte) 7, obj2, obj, tLObject));
                break;
            case 17:
                gl.d3(new sx5((byte) 8, obj2, obj, tLObject));
                break;
            case 18:
                gl.d3(new e45((x36) obj2, tLObject, (HashSet) obj, tL_error, (byte) 13));
                break;
            case 19:
                mf6 mf6Var = (mf6) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    gl.d3(new sx5((Object) mf6Var, (Object) bundle, (Object) tLObject, (byte) 17));
                    break;
                } else {
                    gl.d3(new ec6(mf6Var, b4));
                    break;
                }
            case 20:
                gl.d3(new e45((td6) obj2, tLObject, (String) obj, tL_error, (byte) 17));
                break;
            case 21:
                gl.d3(new sx5(obj2, (Object) tL_error, obj, (byte) 21));
                break;
            case 22:
                gl.d3(new sx5((byte) 26, obj2, obj, tLObject));
                break;
            case 23:
                gl.d3(new e45((lf6) obj2, tL_error, tLObject, (String) obj, (byte) 21));
                break;
            case 24:
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ab4.r(tL_error.text)) {
                    hq6Var.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 25:
                gl.d3(new lo6((hq6) obj2, tLObject, (TLRPC.Document) obj, b5));
                break;
            case 26:
                hq6 hq6Var2 = (hq6) obj2;
                vz4 vz4Var = (vz4) obj;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    hq6Var2.w1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    hq6Var2.w1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (vz4Var != null) {
                    gl.d3(vz4Var);
                    break;
                }
                break;
            case 27:
                gl.d3(new lo6((byte) 10, obj2, obj, tLObject));
                break;
            case 28:
                gl.d3(new lo6(obj2, (Object) tLObject, obj, (byte) 15));
                break;
            default:
                na7 na7Var = (na7) obj2;
                zm2 zm2Var = (zm2) obj;
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    if (zm2Var != null) {
                        gl.d3(zm2Var);
                        break;
                    }
                }
                break;
        }
    }
}
