// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua3 implements bg8 {
    public final /* synthetic */ byte a;

    @Override // bg8
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            case 1:
                if (((String) obj) != null) {
                    break;
                }
                break;
            default:
                np5 np5Var = (np5) obj;
                if (np5Var.b.equals("com.apple.iTunes") && np5Var.c.equals("iTunSMPB")) {
                    break;
                }
                break;
        }
        return true;
    }
}
