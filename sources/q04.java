// default package

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q04 implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ i4d b;
    public final /* synthetic */ g6 c;

    public q04(g6 g6Var, boolean[] zArr, i4d i4dVar) {
        this.c = g6Var;
        this.a = zArr;
        this.b = i4dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t04 t04Var = (t04) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        hd[] hdVarArr = {new hd(3, null, t04Var.G.getContext())};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        t14 t14Var = t04Var.G;
        String str = t04Var.x;
        if (str == null) {
            str = t14Var.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        gl.d3(new va7((Object) this, (Object) hdVarArr, ConnectionsManager.getInstance(t14Var.d1).sendRequest(tL_messages_getEmojiURL, new en0((Object) this, (Object) hdVarArr, (Object) this.b, (byte) 23)), (byte) 24), 1000L);
    }
}
