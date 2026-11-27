// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class w6f {
    public static String a(gfe gfeVar) {
        StringBuilder sb = new StringBuilder(gfeVar.k());
        for (int i = 0; i < gfeVar.k(); i++) {
            byte h = gfeVar.h(i);
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
