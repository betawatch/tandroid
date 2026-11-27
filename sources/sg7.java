// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class sg7 implements lx2, Continuation, y2c, l3d, bl0, SuccessContinuation, mqa, q30, d23, im6 {
    public final /* synthetic */ byte a;
    public static final sg7 b = new sg7(1);
    public static final sg7 c = new sg7(2);
    public static final sg7 d = new sg7(3);
    public static final /* synthetic */ sg7 e = new sg7(4);
    public static final sg7 f = new sg7(5);
    public static final sg7 h = new sg7(6);
    public static final sg7 n = new sg7(7);
    public static final sg7 r = new sg7(8);
    public static final sg7 s = new sg7(9);
    public static final sg7 w = new sg7(10);
    public static final /* synthetic */ sg7 x = new sg7(11);
    public static final sg7 y = new sg7(12);
    public static final /* synthetic */ sg7 E = new sg7(13);

    public /* synthetic */ sg7(byte b2) {
        this.a = b2;
    }

    public static MediaCodec b(fp fpVar) {
        String str = ((nm6) fpVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // bl0
    public final float B0() {
        return -1.0f;
    }

    @Override // bl0
    public final float D0() {
        return -1.0f;
    }

    @Override // bl0
    public final int Q1() {
        return 0;
    }

    @Override // bl0
    public final int X() {
        return 0;
    }

    @Override // im6
    public final jm6 a(fp fpVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(fpVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) fpVar.d;
            mediaCodec.configure((MediaFormat) fpVar.b, surface, (MediaCrypto) fpVar.e, (surface == null && ((nm6) fpVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new ugb(mediaCodec, (fi6) fpVar.f);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // y2c
    public final Object apply(Object obj) {
        switch (this.a) {
        }
        return (byte[]) obj;
    }

    public boolean c(CharSequence charSequence) {
        return false;
    }

    @Override // bl0
    public final int m0() {
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23, types: [h0b] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v5, types: [qj0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // l3d
    public final rj0 o(String str, bf0 bf0Var, EnumMap enumMap) {
        int i;
        int i2;
        int i3;
        int i4;
        qj0 qj0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        qj0 b2;
        int i9;
        int i10;
        int i11;
        int length;
        fma fmaVar;
        i34 i34Var = i34.b;
        rj0 rj0Var = null;
        Charset forName = enumMap.containsKey(i34Var) ? Charset.forName(enumMap.get(i34Var).toString()) : null;
        i34 i34Var2 = i34.a;
        int parseInt = enumMap.containsKey(i34Var2) ? Integer.parseInt(enumMap.get(i34Var2).toString()) : 33;
        i34 i34Var3 = i34.n;
        byte b3 = 0;
        int parseInt2 = enumMap.containsKey(i34Var3) ? Integer.parseInt(enumMap.get(i34Var3).toString()) : 0;
        if (bf0Var != bf0.a) {
            lq5.q(bf0Var, "Can only encode AZTEC, but got ");
            return null;
        }
        byte[] bytes = str.getBytes(forName != null ? forName : StandardCharsets.ISO_8859_1);
        h0b h0bVar = h0b.f;
        int i12 = 4;
        int i13 = 2;
        byte b4 = 46;
        int i14 = 3;
        if (forName != null) {
            jk1 a = jk1.a(forName);
            if (a == null) {
                lq5.q(forName, "No ECI code for character set ");
                return null;
            }
            int i15 = a.a[0];
            xtb xtbVar = h0bVar.e(4, 0).b;
            if (i15 < 0) {
                xtbVar.getClass();
                fmaVar = new fma(xtbVar, 0, 3);
                length = 3;
            } else {
                if (i15 > 999999) {
                    lq5.j("ECI code must be between 0 and 999999");
                    return null;
                }
                byte[] bytes2 = Integer.toString(i15).getBytes(StandardCharsets.ISO_8859_1);
                int length2 = bytes2.length;
                xtbVar.getClass();
                fma fmaVar2 = new fma(xtbVar, length2, 3);
                int length3 = bytes2.length;
                int i16 = 0;
                while (i16 < length3) {
                    fma fmaVar3 = new fma(fmaVar2, bytes2[i16] - 46, 4);
                    i16++;
                    fmaVar2 = fmaVar3;
                }
                length = (bytes2.length << 2) + 3;
                fmaVar = fmaVar2;
            }
            h0bVar = new h0b(fmaVar, h0bVar.a, 0, h0bVar.d + length);
        }
        List<h0b> singletonList = Collections.singletonList(h0bVar);
        int i17 = 0;
        while (true) {
            boolean z = true;
            if (i17 >= bytes.length) {
                break;
            }
            int i18 = i17 + 1;
            rj0 rj0Var2 = rj0Var;
            byte b5 = i18 < bytes.length ? bytes[i18] : b3;
            byte b6 = bytes[i17];
            if (b6 == 13) {
                if (b5 == 10) {
                    i11 = i13;
                }
                i11 = 0;
            } else if (b6 == 44) {
                if (b5 == 32) {
                    i11 = i12;
                }
                i11 = 0;
            } else if (b6 != b4) {
                if (b6 == 58 && b5 == 32) {
                    i11 = 5;
                }
                i11 = 0;
            } else {
                if (b5 == 32) {
                    i11 = 3;
                }
                i11 = 0;
            }
            if (i11 > 0) {
                LinkedList linkedList = new LinkedList();
                for (h0b h0bVar2 : singletonList) {
                    h0b b7 = h0bVar2.b(i17);
                    linkedList.add(b7.d(i12, i11));
                    if (h0bVar2.a != i12) {
                        linkedList.add(b7.e(i12, i11));
                    }
                    if (i11 == 3 || i11 == i12) {
                        linkedList.add(b7.d(i13, 16 - i11).d(i13, 1));
                    }
                    if (h0bVar2.c > 0) {
                        linkedList.add(h0bVar2.a(i17).a(i18));
                    }
                }
                singletonList = bg5.a(linkedList);
                i17 = i18;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (h0b h0bVar3 : singletonList) {
                    char c2 = (char) (bytes[i17] & 255);
                    int[][] iArr = bg5.c;
                    int i19 = h0bVar3.a;
                    boolean z2 = iArr[i19][c2] > 0 ? z : false;
                    Object obj = rj0Var2;
                    int i20 = 0;
                    while (i20 <= i12) {
                        boolean z3 = z;
                        int i21 = iArr[i20][c2];
                        Object obj2 = obj;
                        if (i21 > 0) {
                            if (obj == null) {
                                obj2 = h0bVar3.b(i17);
                            }
                            ?? r6 = obj2;
                            if (!z2 || i20 == i19 || i20 == i13) {
                                linkedList2.add(r6.d(i20, i21));
                            }
                            if (!z2 && bg5.d[i19][i20] >= 0) {
                                linkedList2.add(r6.e(i20, i21));
                            }
                            obj = r6;
                        }
                        i20++;
                        z = z3;
                        i12 = 4;
                        i13 = 2;
                        obj = obj;
                    }
                    boolean z4 = z;
                    if (h0bVar3.c > 0 || iArr[i19][c2] == 0) {
                        linkedList2.add(h0bVar3.a(i17));
                    }
                    z = z4;
                    i12 = 4;
                    i13 = 2;
                }
                singletonList = bg5.a(linkedList2);
            }
            i17++;
            i12 = 4;
            b3 = 0;
            i13 = 2;
            b4 = 46;
            rj0Var = rj0Var2;
        }
        rj0 rj0Var3 = rj0Var;
        int i22 = 1;
        h0b h0bVar4 = (h0b) Collections.min(singletonList, new nu6((byte) 8));
        h0bVar4.getClass();
        ArrayList arrayList = new ArrayList();
        for (xtb xtbVar2 = h0bVar4.b(bytes.length).b; xtbVar2 != null; xtbVar2 = xtbVar2.a) {
            arrayList.add(xtbVar2);
        }
        qj0 qj0Var2 = new qj0();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xtb) arrayList.get(size)).a(qj0Var2, bytes);
        }
        int i23 = qj0Var2.b;
        int i24 = 11;
        int y2 = qu6.y(i23, parseInt, 100, 11);
        int i25 = i23 + y2;
        int[] iArr2 = pdd.a;
        if (parseInt2 == 0) {
            ?? r8 = rj0Var3;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i14 ? i22 : 0;
                if (i28 != 0) {
                    i = i26 + 1;
                    i2 = 88;
                } else {
                    i = i26;
                    i2 = jn7.w1;
                }
                int i29 = (i2 + (i << 4)) * i;
                if (i25 > i29) {
                    i8 = i22;
                    i3 = i27;
                } else {
                    if (r8 == 0 || i27 != iArr2[i]) {
                        i3 = iArr2[i];
                        r8 = pdd.c(qj0Var2, i3);
                    } else {
                        i3 = i27;
                        r8 = r8;
                    }
                    int i30 = i29 - (i29 % i3);
                    if ((i28 == 0 || r8.b <= (i3 << 6)) && r8.b + y2 <= i30) {
                        i4 = i3;
                        qj0Var = r8;
                        i5 = i28;
                        i6 = i;
                        i7 = i29;
                    } else {
                        i8 = i22;
                    }
                }
                i26++;
                i22 = i8;
                i14 = 3;
                i27 = i3;
                r8 = r8;
            }
            lq5.j("Data too large for an Aztec code");
            return rj0Var3;
        }
        i5 = parseInt2 < 0 ? 1 : 0;
        i6 = Math.abs(parseInt2);
        if (i6 > (i5 != 0 ? 4 : 32)) {
            lq5.j(qd4.n(parseInt2, "Illegal value ", " for layers"));
            return rj0Var3;
        }
        i7 = ((i5 != 0 ? 88 : jn7.w1) + (i6 << 4)) * i6;
        i4 = iArr2[i6];
        int i31 = i7 - (i7 % i4);
        qj0Var = pdd.c(qj0Var2, i4);
        int i32 = qj0Var.b;
        if (y2 + i32 > i31) {
            lq5.j("Data to large for user specified layer");
            return rj0Var3;
        }
        if (i5 != 0 && i32 > (i4 << 6)) {
            lq5.j("Data to large for user specified layer");
            return rj0Var3;
        }
        qj0 b8 = pdd.b(qj0Var, i7, i4);
        int i33 = qj0Var.b / i4;
        qj0 qj0Var3 = new qj0();
        if (i5 != 0) {
            qj0Var3.b(i6 - 1, 2);
            qj0Var3.b(i33 - 1, 6);
            b2 = pdd.b(qj0Var3, 28, 4);
        } else {
            qj0Var3.b(i6 - 1, 5);
            qj0Var3.b(i33 - 1, 11);
            b2 = pdd.b(qj0Var3, 40, 4);
            i24 = 14;
        }
        int i34 = i24 + (i6 << 2);
        int[] iArr3 = new int[i34];
        if (i5 != 0) {
            for (int i35 = 0; i35 < i34; i35++) {
                iArr3[i35] = i35;
            }
            i9 = i34;
        } else {
            int i36 = i34 / 2;
            i9 = i34 + 1 + (((i36 - 1) / 15) << 1);
            int i37 = i9 / 2;
            for (int i38 = 0; i38 < i36; i38++) {
                iArr3[(i36 - i38) - 1] = (i37 - r10) - 1;
                iArr3[i36 + i38] = (i38 / 15) + i38 + i37 + 1;
            }
        }
        rj0 rj0Var4 = new rj0(i9, i9);
        int i39 = 0;
        int i40 = 0;
        while (i39 < i6) {
            int i41 = ((i6 - i39) << 2) + (i5 != 0 ? 9 : 12);
            int i42 = 0;
            while (i42 < i41) {
                int i43 = i42 << 1;
                int i44 = 0;
                while (i44 < 2) {
                    if (b8.d(i40 + i43 + i44)) {
                        int i45 = i39 << 1;
                        rj0Var4.c(iArr3[i45 + i44], iArr3[i45 + i42]);
                    }
                    if (b8.d((i41 << 1) + i40 + i43 + i44)) {
                        int i46 = i39 << 1;
                        i10 = i5;
                        rj0Var4.c(iArr3[i46 + i42], iArr3[qd4.f(i34, i22, i46, i44)]);
                    } else {
                        i10 = i5;
                    }
                    if (b8.d((i41 << 2) + i40 + i43 + i44)) {
                        int i47 = (i34 - 1) - (i39 << 1);
                        rj0Var4.c(iArr3[i47 - i44], iArr3[i47 - i42]);
                    }
                    if (b8.d((i41 * 6) + i40 + i43 + i44)) {
                        int i48 = i39 << 1;
                        rj0Var4.c(iArr3[((i34 - 1) - i48) - i42], iArr3[i48 + i44]);
                    }
                    i44++;
                    i5 = i10;
                    i22 = 1;
                }
                i42++;
                i22 = 1;
            }
            i40 += i41 << 3;
            i39++;
            i22 = 1;
        }
        int i49 = i5;
        int i50 = i9 / 2;
        int i51 = 0;
        if (i49 != 0) {
            while (i51 < 7) {
                int i52 = (i50 - 3) + i51;
                if (b2.d(i51)) {
                    rj0Var4.c(i52, i50 - 5);
                }
                if (b2.d(i51 + 7)) {
                    rj0Var4.c(i50 + 5, i52);
                }
                if (b2.d(20 - i51)) {
                    rj0Var4.c(i52, i50 + 5);
                }
                if (b2.d(27 - i51)) {
                    rj0Var4.c(i50 - 5, i52);
                }
                i51++;
            }
        } else {
            while (i51 < 10) {
                int i53 = (i51 / 5) + (i50 - 5) + i51;
                if (b2.d(i51)) {
                    rj0Var4.c(i53, i50 - 7);
                }
                if (b2.d(i51 + 10)) {
                    rj0Var4.c(i50 + 7, i53);
                }
                if (b2.d(29 - i51)) {
                    rj0Var4.c(i53, i50 + 7);
                }
                if (b2.d(39 - i51)) {
                    rj0Var4.c(i50 - 7, i53);
                }
                i51++;
            }
        }
        if (i49 != 0) {
            pdd.a(rj0Var4, i50, 5);
        } else {
            pdd.a(rj0Var4, i50, 7);
            int i54 = 0;
            int i55 = 0;
            while (i54 < (i34 / 2) - 1) {
                for (int i56 = i50 & 1; i56 < i9; i56 += 2) {
                    int i57 = i50 - i55;
                    rj0Var4.c(i57, i56);
                    int i58 = i50 + i55;
                    rj0Var4.c(i58, i56);
                    rj0Var4.c(i56, i57);
                    rj0Var4.c(i56, i58);
                }
                i54 += 15;
                i55 += 16;
            }
        }
        int i59 = rj0Var4.a;
        int i60 = rj0Var4.b;
        int max = Math.max(0, i59);
        int max2 = Math.max(0, i60);
        int min = Math.min(max / i59, max2 / i60);
        int i61 = (max - (i59 * min)) / 2;
        int i62 = (max2 - (i60 * min)) / 2;
        rj0 rj0Var5 = new rj0(max, max2);
        int i63 = 0;
        while (i63 < i60) {
            int i64 = i61;
            int i65 = 0;
            while (i65 < i59) {
                if (rj0Var4.b(i65, i63)) {
                    rj0Var5.d(i64, i62, min, min);
                }
                i65++;
                i64 += min;
            }
            i63++;
            i62 += min;
        }
        return rj0Var5;
    }

    @Override // bl0
    public final int o1() {
        return 0;
    }

    @Override // mqa
    public final StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // q30
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            lq5.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // bl0
    public final int x0() {
        return 0;
    }

    @Override // bl0
    public final int x1() {
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zn znVar = qa4.r;
        return null;
    }
}
