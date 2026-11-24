// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
