// default package

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class td1 implements qt3 {
    public static final td1 c = new td1(new int[]{1, 2});
    public final /* synthetic */ byte a = 1;
    public final int[] b;

    public td1(String str, Charset charset) {
        int i;
        pt3 pt3Var = new pt3(str, charset);
        CharsetEncoder[] charsetEncoderArr = pt3Var.a;
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
        xf7[][] xf7VarArr = (xf7[][]) Array.newInstance((Class<?>) xf7.class, length + 1, charsetEncoderArr.length);
        c(str, pt3Var, xf7VarArr, 0, null);
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 0; i5 < charsetEncoderArr.length; i5++) {
                xf7 xf7Var = xf7VarArr[i4][i5];
                if (xf7Var != null && i4 < length) {
                    c(str, pt3Var, xf7VarArr, i4, xf7Var);
                }
            }
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                xf7VarArr[i4 - 1][i6] = null;
            }
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            xf7 xf7Var2 = xf7VarArr[length][i8];
            if (xf7Var2 != null && (i = xf7Var2.d) < i7) {
                i3 = i8;
                i7 = i;
            }
        }
        if (i3 < 0) {
            dq9.m(kt6.o("Failed to encode \"", str, "\""));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        xf7 xf7Var3 = xf7VarArr[length][i3];
        while (xf7Var3 != null) {
            xf7 xf7Var4 = xf7Var3.c;
            int i9 = xf7Var3.b;
            char c2 = xf7Var3.a;
            if (c2 == 1000) {
                arrayList.add(0, 1000);
            } else {
                byte[] bytes = String.valueOf(c2).getBytes(charsetEncoderArr[i9].charset());
                for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                }
            }
            if ((xf7Var4 == null ? 0 : xf7Var4.b) != i9) {
                arrayList.add(0, Integer.valueOf(il1.a(charsetEncoderArr[i9].charset()).a[0] + 256));
            }
            xf7Var3 = xf7Var4;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        while (i2 < size) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            i2++;
        }
        this.b = iArr2;
    }

    public static void c(String str, pt3 pt3Var, xf7[][] xf7VarArr, int i, xf7 xf7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = pt3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = pt3Var.b;
        if (i2 < 0 || !(charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            i2 = 0;
        } else {
            length = i2 + 1;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                xf7 xf7Var2 = new xf7(charAt, pt3Var, i2, xf7Var);
                xf7[] xf7VarArr2 = xf7VarArr[i + 1];
                xf7 xf7Var3 = xf7VarArr2[i2];
                if (xf7Var3 == null || xf7Var3.d > xf7Var2.d) {
                    xf7VarArr2[i2] = xf7Var2;
                }
            }
            i2++;
        }
    }

    @Override // qt3
    public final int a(int i) {
        if (i >= 0) {
            if (i < this.b.length) {
                if (b(i)) {
                    return r0[i] - 256;
                }
                u36.j(td4.o(i, "value at ", " is not an ECI but a character"));
                return 0;
            }
        }
        wa3.i(String.valueOf(i));
        return 0;
    }

    @Override // qt3
    public final boolean b(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                return i2 > 255 && i2 <= 999;
            }
        }
        wa3.i(String.valueOf(i));
        return false;
    }

    @Override // qt3
    public final char charAt(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                if (b(i)) {
                    u36.j(td4.o(i, "value at ", " is not a character but an ECI"));
                    return (char) 0;
                }
                if (i < 0 || i >= iArr.length) {
                    wa3.i(String.valueOf(i));
                    return (char) 0;
                }
                int i2 = iArr[i];
                if (i2 == 1000) {
                    return (char) 65535;
                }
                return (char) i2;
            }
        }
        wa3.i(String.valueOf(i));
        return (char) 0;
    }

    public final void d(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            dq9.m("Custom icon does not have a backing IconCompat");
            return;
        }
        int i = icon.i();
        for (int i2 : this.b) {
            if (i == i2) {
                if (i != 4 || "content".equalsIgnoreCase(icon.j().getScheme())) {
                    return;
                }
                u36.i(icon, "Unsupported URI scheme for: ");
                return;
            }
        }
        u36.j(hg9.j(i, "Custom icon type is not allowed: "));
    }

    @Override // qt3
    public final int length() {
        return this.b.length;
    }

    @Override // qt3
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.b.length) {
            wa3.i(String.valueOf(i));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            if (b(i)) {
                u36.j(td4.o(i, "value at ", " is not a character but an ECI"));
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

    public td1(int[] iArr) {
        this.b = iArr;
    }
}
