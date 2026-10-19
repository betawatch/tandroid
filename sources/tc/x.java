package tc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class x {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static x a(int i10, String str) {
        x xVar = new x();
        xVar.a = true;
        xVar.e = 8;
        byte[] bArr = {(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
        if (str == null || str.length() == 0) {
            xVar.c(bArr);
            return xVar;
        }
        byte[] a2 = k.a(str);
        byte[] bArr2 = new byte[a2.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a2, 0, bArr2, 2, a2.length);
        xVar.c(bArr2);
        return xVar;
    }

    public final int b() {
        byte[] bArr = this.g;
        if (bArr == null || bArr.length < 2) {
            return 1005;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.g = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a1.g.u("WebSocketFrame(FIN=");
        u10.append(this.a ? "1" : "0");
        u10.append(",RSV1=");
        u10.append(this.b ? "1" : "0");
        u10.append(",RSV2=");
        u10.append(this.c ? "1" : "0");
        u10.append(",RSV3=");
        u10.append(this.d ? "1" : "0");
        u10.append(",Opcode=");
        int i10 = this.e;
        SecureRandom secureRandom = k.a;
        if (i10 == 0) {
            str = "CONTINUATION";
        } else if (i10 == 1) {
            str = "TEXT";
        } else if (i10 != 2) {
            switch (i10) {
                case 8:
                    str = "CLOSE";
                    break;
                case 9:
                    str = "PING";
                    break;
                case 10:
                    str = "PONG";
                    break;
                default:
                    if (1 <= i10 && i10 <= 7) {
                        str = String.format("DATA(0x%X)", Integer.valueOf(i10));
                        break;
                    } else if (8 <= i10 && i10 <= 15) {
                        str = String.format("CONTROL(0x%X)", Integer.valueOf(i10));
                        break;
                    } else {
                        str = String.format("0x%X", Integer.valueOf(i10));
                        break;
                    }
                    break;
            }
        } else {
            str = "BINARY";
        }
        u10.append(str);
        u10.append(",Length=");
        byte[] bArr = this.g;
        u10.append(bArr == null ? 0 : bArr.length);
        int i11 = this.e;
        String str2 = null;
        if (i11 == 1) {
            u10.append(",Payload=");
            if (this.g == null) {
                u10.append("null");
            } else if (this.b) {
                u10.append("compressed");
            } else {
                u10.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                u10.append(str2);
                u10.append("\"");
            }
        } else if (i11 == 2) {
            u10.append(",Payload=");
            if (this.g == null) {
                u10.append("null");
            } else if (this.b) {
                u10.append("compressed");
            } else {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i12 < bArr3.length) {
                        u10.append(String.format("%02X ", Integer.valueOf(bArr3[i12] & 255)));
                        i12++;
                    } else if (bArr3.length != 0) {
                        u10.setLength(u10.length() - 1);
                    }
                }
            }
        } else if (i11 == 8) {
            u10.append(",CloseCode=");
            u10.append(b());
            u10.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                u10.append("null");
            } else {
                u10.append("\"");
                u10.append(str2);
                u10.append("\"");
            }
        }
        u10.append(")");
        return u10.toString();
    }
}
