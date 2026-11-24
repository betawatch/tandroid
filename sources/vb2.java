// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vb2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vb2(Object obj, Context context, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = context;
        this.e = obj2;
        this.b = i;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Context context = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((yb2) obj3).a();
                ij.D(context, (wjb) obj2, new jh(this.b, (xb2) obj, (byte) 4));
                break;
            default:
                wf2 wf2Var = (wf2) obj2;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) obj;
                ((fx0) obj3).dismiss();
                Activity W = gl.W((Activity) context);
                if (W != null) {
                    na7.c1().edit().putBoolean("callmiconstart", wf2Var.a.q).apply();
                    rgc.g(W, this.b, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
