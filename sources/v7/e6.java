package v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class e6 {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb2 = new StringBuilder(l1Var.o());
        for (int i10 = 0; i10 < l1Var.o(); i10++) {
            byte i11 = l1Var.i(i10);
            if (i11 == 34) {
                sb2.append("\\\"");
            } else if (i11 == 39) {
                sb2.append("\\'");
            } else if (i11 != 92) {
                switch (i11) {
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
                        if (i11 < 32 || i11 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((i11 >>> 6) & 3) + 48));
                            sb2.append((char) (((i11 >>> 3) & 7) + 48));
                            sb2.append((char) ((i11 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) i11);
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
