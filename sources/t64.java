// default package

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class t64 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t64(Object obj, int i, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String G;
        int i;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        byte b = this.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                c74 c74Var = (c74) obj;
                ea3 ea3Var = c74Var.N;
                byte b2 = c74Var.a[i2].a.b;
                uj U = ea3Var.U();
                ea3Var.V(U, 1033, new uy2(U, i2, b2, z));
                break;
            case 1:
                d31 b0 = d31.b0((nf4) obj);
                if (z) {
                    G = ob6.G(i2, "FolderLinkAddedChats", new Object[0]);
                    i = R.raw.folder_in;
                } else {
                    G = ob6.G(i2, "FolderLinkRemovedChats", new Object[0]);
                    i = R.raw.folder_out;
                }
                v21 I = b0.I(i, G, ob6.M0(2131750628, null));
                I.j = 5000;
                I.j();
                break;
            case 2:
                uc7 uc7Var = (uc7) obj;
                int i3 = 0;
                while (i3 < uc7Var.G0.size()) {
                    if (((ac7) uc7Var.G0.get(i3)).a == i2) {
                        uc7Var.G0.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                uc7Var.H0 = null;
                uc7Var.I0.clear();
                uc7Var.getNotificationCenter().k(jn7.O2, new Object[0]);
                if (z) {
                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((r7a) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i2));
                if (bool != null && bool.booleanValue() == z) {
                    hashMap.remove(Integer.valueOf(i2));
                    break;
                }
                break;
            case 4:
                eja ejaVar = ((dha) obj).a;
                e eVar = ejaVar.y1;
                if (eVar != null) {
                    if (z) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = eja.Y(i2, true);
                        tL_channels_setMainProfileTab.channel = eVar.getMessagesController().h1(ejaVar.g1.id);
                        TLRPC.ChatFull chatFull = ejaVar.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab Y = eja.Y(i2, true);
                        tL_account_setMainProfileTab2.tab = Y;
                        TLRPC.UserFull userFull = ejaVar.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = Y;
                            eVar.getMessagesStorage().l2(ejaVar.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    eVar.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    ejaVar.N1(true);
                    break;
                }
                break;
            default:
                jxa jxaVar = (jxa) obj;
                if (z) {
                    jxaVar.Q.remove(Integer.valueOf(i2));
                    Runnable runnable = (Runnable) jxaVar.R.remove(Integer.valueOf(i2));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t64(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
