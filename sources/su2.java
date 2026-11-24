// default package

import org.telegram.messenger.voip.VoIPPendingCall;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class su2 implements gk7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ su2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        va vaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c30 c30Var = (c30) obj;
                if (i == 25) {
                    c30Var.o(false);
                    break;
                }
                break;
            case 1:
                uib uibVar = (uib) obj;
                if (i == 262) {
                    uibVar.getTextView().invalidate();
                    break;
                }
                break;
            case 2:
                ((xw0) obj).invalidate();
                break;
            case 3:
                vw8 vw8Var = (vw8) obj;
                if (objArr.length > 1 && objArr[1] == vw8Var.j2) {
                    vw8Var.y0();
                    break;
                }
                break;
            case 4:
                hgb hgbVar = (hgb) obj;
                if (i == 256) {
                    gl.d3(new kya((Object) hgbVar, (byte) 26));
                    break;
                }
                break;
            case 5:
                ((VoIPPendingCall) obj).lambda$new$0(i, i2, objArr);
                break;
            default:
                ypc ypcVar = (ypc) obj;
                if (!ypcVar.r && (vaVar = ypcVar.a) != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
        }
    }
}
