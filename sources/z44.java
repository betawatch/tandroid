// default package

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class z44 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public z44(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static z44 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new z44(4, 1, wrap.array());
    }

    public static z44 b(b54 b54Var, ByteOrder byteOrder) {
        b54[] b54VarArr = {b54Var};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[5]]);
        wrap.order(byteOrder);
        b54 b54Var2 = b54VarArr[0];
        wrap.putInt((int) b54Var2.a);
        wrap.putInt((int) b54Var2.b);
        return new z44(5, 1, wrap.array());
    }

    public static z44 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[d54.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new z44(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof b54[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        b54[] b54VarArr = (b54[]) g;
        if (b54VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        b54 b54Var = b54VarArr[0];
        return b54Var.a / b54Var.b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g instanceof b54[])) {
            return null;
        }
        b54[] b54VarArr = (b54[]) g;
        while (i < b54VarArr.length) {
            sb.append(b54VarArr[i].a);
            sb.append('/');
            sb.append(b54VarArr[i].b);
            i++;
            if (i != b54VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0105: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:262), block:B:105:0x0105 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [b54[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [b54[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        y44 y44Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                y44Var = new y44(bArr);
                try {
                    y44Var.b = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, d54.O);
                                try {
                                    y44Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                y44Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i3 >= d54.G.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = d54.G;
                                    if (i4 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i4] == bArr2[i4]) {
                                        i4++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i3) {
                                byte b2 = bArr[i2];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    y44Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                            str = sb.toString();
                            y44Var.close();
                            return str;
                        case 3:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readUnsignedShort();
                                i2++;
                            }
                            try {
                                y44Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readInt() & 4294967295L;
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 5:
                            r13 = new b54[i3];
                            while (i2 < i3) {
                                r13[i2] = new b54(y44Var.readInt() & 4294967295L, y44Var.readInt() & 4294967295L);
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readShort();
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readInt();
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 10:
                            r13 = new b54[i3];
                            while (i2 < i3) {
                                r13[i2] = new b54(y44Var.readInt(), y44Var.readInt());
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readFloat();
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = y44Var.readDouble();
                                i2++;
                            }
                            y44Var.close();
                            return r13;
                        default:
                            try {
                                y44Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (y44Var != null) {
                        try {
                            y44Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            y44Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(d54.E[this.a]);
        sb.append(", data length:");
        return de9.l(sb, this.d.length, ")");
    }

    public z44(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
