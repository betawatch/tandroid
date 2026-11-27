// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class yze {
    public static String a(n51 n51Var) {
        StringBuilder sb = new StringBuilder(n51Var.size());
        for (int i = 0; i < n51Var.size(); i++) {
            byte h = n51Var.h(i);
            if (h == 34) {
                sb.append("\\\"");
            } else if (h == 39) {
                sb.append("\\'");
            } else if (h != 92) {
                switch (h) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (h < 32 || h > 126) {
                            sb.append('\\');
                            sb.append((char) (((h >>> 6) & 3) + 48));
                            sb.append((char) (((h >>> 3) & 7) + 48));
                            sb.append((char) ((h & 7) + 48));
                            break;
                        } else {
                            sb.append((char) h);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
