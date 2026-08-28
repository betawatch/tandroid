package r1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public c(int i9, int i10, byte[] bArr) {
        this(-1L, bArr, i9, i10);
    }

    public static c a(long j10, ByteOrder byteOrder) {
        long[] jArr = {j10};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(4, 1, wrap.array());
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[5]]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.a);
        wrap.putInt((int) eVar2.b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i9, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i9}[0]);
        return new c(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g10 instanceof String) {
            return Double.parseDouble((String) g10);
        }
        if (g10 instanceof long[]) {
            if (((long[]) g10).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g10 instanceof int[]) {
            if (((int[]) g10).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g10 instanceof double[]) {
            double[] dArr = (double[]) g10;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g10 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g10;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.a / eVar.b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g10 instanceof String) {
            return Integer.parseInt((String) g10);
        }
        if (g10 instanceof long[]) {
            long[] jArr = (long[]) g10;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g10 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g10;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 == null) {
            return null;
        }
        if (g10 instanceof String) {
            return (String) g10;
        }
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        if (g10 instanceof long[]) {
            long[] jArr = (long[]) g10;
            while (i9 < jArr.length) {
                sb2.append(jArr[i9]);
                i9++;
                if (i9 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (g10 instanceof int[]) {
            int[] iArr = (int[]) g10;
            while (i9 < iArr.length) {
                sb2.append(iArr[i9]);
                i9++;
                if (i9 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (g10 instanceof double[]) {
            double[] dArr = (double[]) g10;
            while (i9 < dArr.length) {
                sb2.append(dArr[i9]);
                i9++;
                if (i9 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(g10 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g10;
        while (i9 < eVarArr.length) {
            sb2.append(eVarArr[i9].a);
            sb2.append('/');
            sb2.append(eVarArr[i9].b);
            i9++;
            if (i9 != eVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [r1.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [r1.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        ?? str;
        byte b10;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.b = byteOrder;
                    int i9 = this.a;
                    int i10 = 0;
                    int i11 = this.b;
                    switch (i9) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str2;
                                }
                            }
                            str = new String(bArr, g.O);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i11 >= g.G.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = g.G;
                                    if (i12 >= bArr2.length) {
                                        i10 = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (i10 < i11) {
                                byte b11 = bArr[i10];
                                if (b11 == 0) {
                                    str = sb2.toString();
                                    break;
                                } else {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    i10++;
                                }
                            }
                            str = sb2.toString();
                        case 3:
                            str = new int[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readUnsignedShort();
                                i10++;
                            }
                        case 4:
                            str = new long[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readInt() & 4294967295L;
                                i10++;
                            }
                        case 5:
                            str = new e[i11];
                            while (i10 < i11) {
                                str[i10] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i10++;
                            }
                        case 8:
                            str = new int[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readShort();
                                i10++;
                            }
                        case 9:
                            str = new int[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readInt();
                                i10++;
                            }
                        case 10:
                            str = new e[i11];
                            while (i10 < i11) {
                                str[i10] = new e(bVar.readInt(), bVar.readInt());
                                i10++;
                            }
                        case 11:
                            str = new double[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readFloat();
                                i10++;
                            }
                        case 12:
                            str = new double[i11];
                            while (i10 < i11) {
                                str[i10] = bVar.readDouble();
                                i10++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e12) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        return str;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
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
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.E[this.a]);
        sb2.append(", data length:");
        return aa.d.l(this.d.length, ")", sb2);
    }

    public c(long j10, byte[] bArr, int i9, int i10) {
        this.a = i9;
        this.b = i10;
        this.c = j10;
        this.d = bArr;
    }
}
