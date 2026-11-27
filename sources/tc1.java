// default package

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tc1 implements ys3 {
    public static final tc1 c = new tc1(new int[]{1, 2});
    public final /* synthetic */ byte a = 1;
    public final int[] b;

    public tc1(String str, Charset charset) {
        int i;
        xs3 xs3Var = new xs3(str, charset);
        CharsetEncoder[] charsetEncoderArr = xs3Var.a;
        int i2 = 0;
        int i3 = -1;
        if (charsetEncoderArr.length == 1) {
            this.b = new int[str.length()];
            while (i2 < this.b.length) {
                char charAt = str.charAt(i2);
                int[] iArr = this.b;
                if (charAt == 65535) {
                    charAt = 1000;
                }
                iArr[i2] = charAt;
                i2++;
            }
            return;
        }
        int length = str.length();
        eg7[][] eg7VarArr = (eg7[][]) Array.newInstance((Class<?>) eg7.class, length + 1, charsetEncoderArr.length);
        c(str, xs3Var, eg7VarArr, 0, null);
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 0; i5 < charsetEncoderArr.length; i5++) {
                eg7 eg7Var = eg7VarArr[i4][i5];
                if (eg7Var != null && i4 < length) {
                    c(str, xs3Var, eg7VarArr, i4, eg7Var);
                }
            }
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                eg7VarArr[i4 - 1][i6] = null;
            }
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            eg7 eg7Var2 = eg7VarArr[length][i8];
            if (eg7Var2 != null && (i = eg7Var2.d) < i7) {
                i3 = i8;
                i7 = i;
            }
        }
        if (i3 < 0) {
            grb.i(qd4.y("Failed to encode \"", str, "\""));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        eg7 eg7Var3 = eg7VarArr[length][i3];
        while (eg7Var3 != null) {
            eg7 eg7Var4 = eg7Var3.c;
            int i9 = eg7Var3.b;
            char c2 = eg7Var3.a;
            if (c2 == 1000) {
                arrayList.add(0, 1000);
            } else {
                byte[] bytes = String.valueOf(c2).getBytes(charsetEncoderArr[i9].charset());
                for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                }
            }
            if ((eg7Var4 == null ? 0 : eg7Var4.b) != i9) {
                arrayList.add(0, Integer.valueOf(jk1.a(charsetEncoderArr[i9].charset()).a[0] + 256));
            }
            eg7Var3 = eg7Var4;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        while (i2 < size) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            i2++;
        }
        this.b = iArr2;
    }

    public static void c(String str, xs3 xs3Var, eg7[][] eg7VarArr, int i, eg7 eg7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = xs3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = xs3Var.b;
        if (i2 < 0 || !(charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            i2 = 0;
        } else {
            length = i2 + 1;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                eg7 eg7Var2 = new eg7(charAt, xs3Var, i2, eg7Var);
                eg7[] eg7VarArr2 = eg7VarArr[i + 1];
                eg7 eg7Var3 = eg7VarArr2[i2];
                if (eg7Var3 == null || eg7Var3.d > eg7Var2.d) {
                    eg7VarArr2[i2] = eg7Var2;
                }
            }
            i2++;
        }
    }

    @Override // ys3
    public final int a(int i) {
        if (i >= 0) {
            if (i < this.b.length) {
                if (b(i)) {
                    return r0[i] - 256;
                }
                lq5.j(qd4.n(i, "value at ", " is not an ECI but a character"));
                return 0;
            }
        }
        su3.g(String.valueOf(i));
        return 0;
    }

    @Override // ys3
    public final boolean b(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                return i2 > 255 && i2 <= 999;
            }
        }
        su3.g(String.valueOf(i));
        return false;
    }

    @Override // ys3
    public final char charAt(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                if (b(i)) {
                    lq5.j(qd4.n(i, "value at ", " is not a character but an ECI"));
                    return (char) 0;
                }
                if (i < 0 || i >= iArr.length) {
                    su3.g(String.valueOf(i));
                    return (char) 0;
                }
                int i2 = iArr[i];
                if (i2 == 1000) {
                    return (char) 65535;
                }
                return (char) i2;
            }
        }
        su3.g(String.valueOf(i));
        return (char) 0;
    }

    public final void d(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            grb.i("Custom icon does not have a backing IconCompat");
            return;
        }
        int i = icon.i();
        for (int i2 : this.b) {
            if (i == i2) {
                if (i != 4 || "content".equalsIgnoreCase(icon.j().getScheme())) {
                    return;
                }
                lq5.q(icon, "Unsupported URI scheme for: ");
                return;
            }
        }
        lq5.j(uh9.k(i, "Custom icon type is not allowed: "));
    }

    @Override // ys3
    public final int length() {
        return this.b.length;
    }

    @Override // ys3
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.b.length) {
            su3.g(String.valueOf(i));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            if (b(i)) {
                lq5.j(qd4.n(i, "value at ", " is not a character but an ECI"));
                return null;
            }
            sb.append(charAt(i));
            i++;
        }
        return sb;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.b.length; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (b(i)) {
                        sb.append("ECI(");
                        sb.append(a(i));
                        sb.append(')');
                    } else if (charAt(i) < 128) {
                        sb.append('\'');
                        sb.append(charAt(i));
                        sb.append('\'');
                    } else {
                        sb.append((int) charAt(i));
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public tc1(int[] iArr) {
        this.b = iArr;
    }
}
