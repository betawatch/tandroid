// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xs0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xs0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(((ct0) obj).a).cancelRequest(i, true);
                break;
            case 1:
                ((me1) obj).g0(i);
                break;
            case 2:
                ((wt1) obj).a.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                int i2 = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj).F3.getConnectionsManager().cancelRequest(i, true);
                break;
            case 4:
                p82 p82Var = (p82) obj;
                p82Var.O0 = false;
                p82Var.b = null;
                p82Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((t04) ((q04) obj).c.b).G.d1).cancelRequest(i, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((h75) obj).n1.a).cancelRequest(i, true);
                break;
            case 7:
                ((qa6) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                ((bu9) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                ((ymb) obj).c0(i);
                break;
        }
    }
}
