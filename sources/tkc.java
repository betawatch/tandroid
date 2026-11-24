// default package

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tkc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hmc b;

    public /* synthetic */ tkc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                hmcVar.E0.setClickable(!bool.booleanValue());
                hmcVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    hmcVar.f0 = 1;
                    hmcVar.s0.setPosition(1);
                    hmcVar.s0.post(new qkc(hmcVar, b2));
                    break;
                }
                break;
            case 1:
                hmcVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q5c[] q5cVarArr = hmcVar.u0;
                q5c q5cVar = q5cVarArr[1];
                if (q5cVar != null) {
                    hmc.c1(q5cVar, true);
                    q5cVarArr[1].w0(0);
                    q5cVarArr[1].post(new qkc(hmcVar, b2));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (hmcVar.D0 != floatValue) {
                    hmcVar.D0 = floatValue;
                    float x = oo1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i = 0;
                    while (true) {
                        int childCount = hmcVar.C0.getChildCount();
                        pkb pkbVar = hmcVar.C0;
                        if (i >= childCount) {
                            pkbVar.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                            hmcVar.C0.requestLayout();
                            break;
                        } else {
                            View childAt = pkbVar.getChildAt(i);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i++;
                        }
                    }
                }
                break;
            case 3:
                hmcVar.E0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!hmcVar.isFinished) {
                    if (user != null) {
                        hmcVar.presentFragment(new qpc(user));
                        break;
                    } else {
                        gl.d3(new qkc(hmcVar, (byte) 9));
                        break;
                    }
                }
                break;
        }
    }
}
