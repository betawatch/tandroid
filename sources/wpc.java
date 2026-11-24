// default package

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wpc implements zk3, ed {
    public final /* synthetic */ ypc a;

    public /* synthetic */ wpc(ypc ypcVar) {
        this.a = ypcVar;
    }

    @Override // zk3
    public final void a(vf6 vf6Var, ArrayList arrayList) {
        ypc ypcVar = this.a;
        ArrayList arrayList2 = ypcVar.s;
        if (ypcVar.r) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            al3 al3Var = (al3) obj;
            TLObject tLObject = al3Var.a;
            if ((tLObject instanceof TLRPC.User) && ypc.d0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) al3Var.a);
            }
        }
        va vaVar = ypcVar.a;
        if (vaVar != null) {
            vaVar.g3.O(true);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        ypc ypcVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            ypcVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
