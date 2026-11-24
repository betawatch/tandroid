// default package

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class z54 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z54(Object obj, int i, boolean z, byte b) {
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
                i64 i64Var = (i64) obj;
                l93 l93Var = i64Var.N;
                byte b2 = i64Var.a[i2].a.b;
                tj U = l93Var.U();
                l93Var.V(U, 1033, new jz2(U, i2, b2, z));
                break;
            case 1:
                u21 b0 = u21.b0((pd4) obj);
                if (z) {
                    G = k96.G(i2, "FolderLinkAddedChats", new Object[0]);
                    i = R.raw.folder_in;
                } else {
                    G = k96.G(i2, "FolderLinkRemovedChats", new Object[0]);
                    i = R.raw.folder_out;
                }
                m21 I = b0.I(i, G, k96.M0(2131750651, null));
                I.j = 5000;
                I.j();
                break;
            case 2:
                na7 na7Var = (na7) obj;
                int i3 = 0;
                while (i3 < na7Var.G0.size()) {
                    if (((t97) na7Var.G0.get(i3)).a == i2) {
                        na7Var.G0.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                na7Var.H0 = null;
                na7Var.I0.clear();
                na7Var.getNotificationCenter().k(kk7.N2, new Object[0]);
                if (z) {
                    na7Var.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 3:
                HashMap hashMap = ((z3a) obj).I;
                Boolean bool = (Boolean) hashMap.get(Integer.valueOf(i2));
                if (bool != null && bool.booleanValue() == z) {
                    hashMap.remove(Integer.valueOf(i2));
                    break;
                }
                break;
            case 4:
                nfa nfaVar = ((mda) obj).a;
                d dVar = nfaVar.y1;
                if (dVar != null) {
                    if (z) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = nfa.Y(i2, true);
                        tL_channels_setMainProfileTab.channel = dVar.getMessagesController().f1(nfaVar.g1.id);
                        TLRPC.ChatFull chatFull = nfaVar.g1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab Y = nfa.Y(i2, true);
                        tL_account_setMainProfileTab2.tab = Y;
                        TLRPC.UserFull userFull = nfaVar.h1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= TLObject.FLAG_20;
                            userFull.main_tab = Y;
                            dVar.getMessagesStorage().g2(nfaVar.h1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    dVar.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    nfaVar.N1(true);
                    break;
                }
                break;
            default:
                gta gtaVar = (gta) obj;
                if (z) {
                    gtaVar.Q.remove(Integer.valueOf(i2));
                    Runnable runnable = (Runnable) gtaVar.R.remove(Integer.valueOf(i2));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z54(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
