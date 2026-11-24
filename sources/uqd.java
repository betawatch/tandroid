// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uqd {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ uqd(String str) {
        this.a = (byte) 4;
        wm9 wm9Var = new wm9((byte) 28, false);
        this.c = wm9Var;
        this.d = wm9Var;
        this.b = str;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                wm9 wm9Var = (wm9) ((wm9) this.c).d;
                String str = "";
                while (wm9Var != null) {
                    Object obj = wm9Var.c;
                    sb.append(str);
                    String str2 = (String) wm9Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    wm9Var = (wm9) wm9Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
