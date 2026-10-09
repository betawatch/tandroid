package sc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static y a(int i10, String str) {
        y yVar = new y();
        yVar.a = true;
        yVar.e = 8;
        byte[] bArr = {(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
        if (str == null || str.length() == 0) {
            yVar.c(bArr);
            return yVar;
        }
        byte[] a2 = k.a(str);
        byte[] bArr2 = new byte[a2.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a2, 0, bArr2, 2, a2.length);
        yVar.c(bArr2);
        return yVar;
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
        StringBuilder v = a1.g.v("WebSocketFrame(FIN=");
        v.append(this.a ? "1" : "0");
        v.append(",RSV1=");
        v.append(this.b ? "1" : "0");
        v.append(",RSV2=");
        v.append(this.c ? "1" : "0");
        v.append(",RSV3=");
        v.append(this.d ? "1" : "0");
        v.append(",Opcode=");
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
        v.append(str);
        v.append(",Length=");
        byte[] bArr = this.g;
        v.append(bArr == null ? 0 : bArr.length);
        int i11 = this.e;
        String str2 = null;
        if (i11 == 1) {
            v.append(",Payload=");
            if (this.g == null) {
                v.append("null");
            } else if (this.b) {
                v.append("compressed");
            } else {
                v.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                v.append(str2);
                v.append("\"");
            }
        } else if (i11 == 2) {
            v.append(",Payload=");
            if (this.g == null) {
                v.append("null");
            } else if (this.b) {
                v.append("compressed");
            } else {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i12 < bArr3.length) {
                        v.append(String.format("%02X ", Integer.valueOf(bArr3[i12] & 255)));
                        i12++;
                    } else if (bArr3.length != 0) {
                        v.setLength(v.length() - 1);
                    }
                }
            }
        } else if (i11 == 8) {
            v.append(",CloseCode=");
            v.append(b());
            v.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                v.append("null");
            } else {
                v.append("\"");
                v.append(str2);
                v.append("\"");
            }
        }
        v.append(")");
        return v.toString();
    }
}
