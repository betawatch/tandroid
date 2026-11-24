// default package

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wv2 extends LinearLayout {
    public final be0 a;
    public final jia b;
    public final wjb c;
    public TLRPC.StickerSetCovered d;

    public wv2(Context context, wjb wjbVar) {
        super(context);
        this.c = wjbVar;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setTextColor(-1);
        setOrientation(0);
        addView(be0Var, nme.t(24, 24, 17, 17, 0, 17, 0));
        addView(jiaVar, nme.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
