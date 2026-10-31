package v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l6 {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb2 = new StringBuilder(l1Var.n());
        for (int i10 = 0; i10 < l1Var.n(); i10++) {
            byte l4 = l1Var.l(i10);
            if (l4 == 34) {
                sb2.append("\\\"");
            } else if (l4 == 39) {
                sb2.append("\\'");
            } else if (l4 != 92) {
                switch (l4) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (l4 < 32 || l4 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((l4 >>> 6) & 3) + 48));
                            sb2.append((char) (((l4 >>> 3) & 7) + 48));
                            sb2.append((char) ((l4 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) l4);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
