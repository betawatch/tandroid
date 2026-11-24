// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx9 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 24;
        byte b3 = 21;
        byte b4 = 25;
        byte b5 = 2;
        byte b6 = 5;
        byte b7 = 6;
        Object obj = this.b;
        switch (b) {
            case 0:
                gl.c3(new tj9((yx9) obj, tLObject, (byte) 20));
                break;
            case 1:
                gl.c3(new q3a(obj, tL_error, tLObject, b7));
                break;
            case 2:
                gl.c3(new t7a(tLObject, (ae9) obj, b4));
                break;
            case 3:
                gl.c3(new t7a(obj, (Object) tLObject, (byte) 27));
                break;
            case 4:
                bwa bwaVar = (bwa) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    ad7.Y(bwaVar.m1).g1(new ArrayList(Arrays.asList(bwaVar.F1.k)), true, true, true, 0, false, 0, 0L);
                    break;
                }
                break;
            case 5:
                gl.c3(new a0b((StickersActivity) obj, (byte) 1));
                break;
            case 6:
                gl.c3(new q3a(obj, tL_error, tLObject, b4));
                break;
            case 7:
                gl.c3(new iya((gv1) obj, tL_error, b6));
                break;
            case 8:
                gl.c3(new kya((l5b) obj, b6));
                break;
            case 9:
                gl.c3(new iya((t1b) obj, tLObject, b7));
                break;
            case 10:
                gl.c3(new iya((u1b) obj, tLObject, (byte) 8));
                break;
            case 11:
                gl.c3(new iya((f4b) obj, tLObject, b2));
                break;
            case 12:
                gl.c3(new iya((t4b) obj, tLObject, b4));
                break;
            case 13:
                zsb zsbVar = (zsb) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_messages_inactiveChats.chats.size(); i++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                        int currentTime = (zsbVar.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                        String G = currentTime < 30 ? k96.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? k96.G(currentTime / 30, "Months", new Object[0]) : k96.G(currentTime / 365, "Years", new Object[0]);
                        if (hc2.n0(chat)) {
                            arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (hc2.T(chat)) {
                            arrayList.add(k96.a0("InactiveChannelSignature", null, 2131749020, G));
                        } else {
                            arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    gl.c3(new r1b(zsbVar, arrayList, tL_messages_inactiveChats, (byte) 17));
                    break;
                }
                break;
            case 14:
                pub pubVar = (pub) obj;
                if (tLObject != null) {
                    pubVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    pubVar.getClass();
                    break;
                }
            case 15:
                kxb kxbVar = (kxb) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(kxbVar.e).R3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        gl.d3(new a5b(kxbVar, updates, b3), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                gl.c3(new a5b((rzb) obj, tLObject, b2));
                break;
            case 17:
                c2c c2cVar = (c2c) obj;
                c2cVar.getClass();
                gl.c3(new r1b(c2cVar, tL_error, tLObject, b3));
                break;
            case 18:
                int i2 = UndoView.j0;
                gl.c3(new l3c((UndoView) obj, tLObject, b5));
                break;
            case 19:
                y6c y6cVar = (y6c) obj;
                y6cVar.getClass();
                gl.c3(new l3c(y6cVar, tLObject, (byte) 4));
                break;
            case 20:
                c7c c7cVar = (c7c) obj;
                c7cVar.getClass();
                gl.c3(new l3c(c7cVar, tLObject, b6));
                break;
            case 21:
                gl.c3(new l3c((s7c) obj, tLObject, b7));
                break;
            case 22:
                ((VideoAds) obj).lambda$load$1(tLObject, tL_error);
                break;
            case 23:
                VoIPService.lambda$updateServerConfig$103((SharedPreferences) obj, tLObject, tL_error);
                break;
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.getClass();
                gl.c3(new frc(wallpapersListActivity, (byte) 0));
                break;
            case 25:
                orc orcVar = (orc) obj;
                if (tLObject != null) {
                    gl.c3(new mhc(orcVar, tLObject, (byte) 28));
                    break;
                }
                break;
            default:
                gl.c3(new isc((atc) obj, (Object) tLObject, (byte) 3));
                break;
        }
    }
}
